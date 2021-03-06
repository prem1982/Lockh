/*
 * @(#)SftpUtil.java			Aug 19, 2013	
 *
 * Copyright 2013 GSA FAS. All rights reserved.
 * GSA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package gov.gsa.fas.vision.dla.sftp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import gov.gsa.fas.vision.dla.common.Utility;
import gov.gsa.fas.vision.dla.config.ConfigConstants;
import gov.gsa.fas.vision.dla.config.VisionDlaConfig;

/**
 * <code>SftpUtil</code>
 *
 * @author  PrasadRNerayanuru
 * @see     
 */
public class SftpUtil {

	private static final Logger logger = Logger.getLogger(SftpUtil.class.getName());
	
	private static String SFTP_HOST = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_HOST);  
	private static int    SFTP_PORT = 
			VisionDlaConfig.getPropertyNumericValue(ConfigConstants.GSA_SFTP_PORT);  
	private static String SFTP_USER = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_USER);
	private static String SFTP_PASS = 
			VisionDlaConfig.getPropertyValue(ConfigConstants.GSA_SFTP_PASSWORD);
	
  static ChannelSftp getSftpChannel() throws JSchException, SftpException{
		JSch jsch = new JSch();  
		Session session = jsch.getSession(SFTP_USER,SFTP_HOST,SFTP_PORT);  
		session.setPassword(SFTP_PASS);  
		java.util.Properties config = new java.util.Properties();  
		config.put("StrictHostKeyChecking", "no");  
		session.setConfig(config);  
		session.connect(); 
		Channel channel = session.openChannel("sftp");  
		channel.connect(); 
		logger.info ("getSftpChannel():Is Connected ->" + channel.isConnected());
		ChannelSftp channelSftp = (ChannelSftp)channel;
//		logger.info ("getSftpChannel():Current Directory->" + channelSftp.pwd());
		return channelSftp;
  }
  
  static void closeChannel(ChannelSftp sftpChannel) throws JSchException{
  	logger.info ("closeChannel():Closing Channel");
  	if(sftpChannel != null){
  		sftpChannel.exit();
  		sftpChannel.getSession().disconnect();
  	}
  }  
  
  static List<String> getFileNames(ChannelSftp sftpChannel, String ftpDir) throws SftpException {
  	ArrayList<String> fileNamesList = new ArrayList<String>();
  	sftpChannel.cd(ftpDir);
  	Vector vecFiles = sftpChannel.ls(".");
  	for (int ii = 0; ii < vecFiles.size(); ii++) {
  		Object obj = vecFiles.elementAt(ii);
  		if (obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry) {
  			if(((LsEntry) obj).getAttrs().isDir()){
  				continue;
  			}
  			String fileName = ((LsEntry) obj).getFilename();
  			fileNamesList.add(fileName);
  		}
  	}
  	return fileNamesList;
  }
	
	static List<String> getFiles(ChannelSftp sftpChannel, String ftpDir,
			String stagingDir) throws SftpException {
		ArrayList<String> fileNamesList = new ArrayList<String>();
		sftpChannel.cd(ftpDir);
		Vector vecFiles = sftpChannel.ls(".");
		for (int ii = 0; ii < vecFiles.size(); ii++) {
			// out.println(vv.elementAt(ii).toString());
			Object obj = vecFiles.elementAt(ii);
			if (obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry) {
				if(((LsEntry) obj).getAttrs().isDir()){
					continue;
				}
				String fileName = ((LsEntry) obj).getFilename();
//				System.out.println(((com.jcraft.jsch.ChannelSftp.LsEntry) obj)
//						.getLongname());
				
				// Copy only GSA*.xml files
				if (fileName.toUpperCase().startsWith("GSA") && fileName.toLowerCase().endsWith("xml")) {
					logger.info ("getFiles():Getting File->" + fileName);
					
					sftpChannel.get(fileName, stagingDir + File.separator +fileName);
					fileNamesList.add(fileName);
				} else {
					logger.info ("getFiles():Skipping File->" + fileName);
				}
			}
		}
		return fileNamesList;
	}
	
	static void getFile(ChannelSftp sftpChannel, String ftpDir, 
			String fileName, String stagingDir) throws SftpException {
		sftpChannel.cd(ftpDir);
		logger.info ("getRequestFiles():Getting File->" + fileName);
		sftpChannel.get(fileName, stagingDir + File.separator +fileName);
	}	
	
	static void moveFile(ChannelSftp sftpChannel,String srcDir, String fileName,
			String targetDir) throws SftpException{
		logger.info("moveFile(): Moving file->" + srcDir + "/"+ fileName + " To " + 
				targetDir);
		sftpChannel.rename(srcDir + "/"+ fileName,
				targetDir + "/" + fileName);
	}
	
	static void putFile(ChannelSftp sftpChannel,String stagingDir ,String targetDir, String fileName)
									throws SftpException{
		logger.info("putFile(): Uploading file->" + stagingDir + "/" + fileName + " To " + 
									targetDir);
		sftpChannel.put(stagingDir + "/" + fileName, targetDir);
	}
	
	static void checkExistsAndRename(ChannelSftp sftpChannel, String targetDir, 
			String fileName) throws SftpException{
		try {
			sftpChannel.cd(targetDir);
			Vector vecFiles = sftpChannel.ls(".");
			if(vecFiles == null || vecFiles.isEmpty()){
				return;
			}
			boolean isExists = false;
			for (int ii = 0; ii < vecFiles.size(); ii++) {
				// out.println(vv.elementAt(ii).toString());
				Object obj = vecFiles.elementAt(ii);
				if (obj instanceof com.jcraft.jsch.ChannelSftp.LsEntry) {
					if(!((LsEntry) obj).getAttrs().isDir() &&
						fileName.equalsIgnoreCase(((LsEntry) obj).getFilename())){
							isExists = true;
							break;
					}
				}
			}	
			if(!isExists) return;
			logger.info("checkExistsAndRename(): File exists->" + targetDir + "/" + 
					fileName);
			String newFileName = fileName + Utility.getNow(Utility.getNow("yyMMddHHmmss"));
			sftpChannel.rename(targetDir + "/"+ fileName,
					targetDir + "/" + newFileName);
		} catch (SftpException e) {
			logger.error("checkExistsAndRename():Failed to check and rename file->" + 
					targetDir + "/" + fileName);
			throw e;
		}
	}
}
