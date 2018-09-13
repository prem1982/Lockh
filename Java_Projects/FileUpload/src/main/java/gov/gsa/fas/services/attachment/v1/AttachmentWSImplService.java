
package gov.gsa.fas.services.attachment.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AttachmentWSImplService", targetNamespace = "http://fas.gsa.gov/services/Attachment/v1.0", wsdlLocation = "http://fcoh1m-cws02t.fas.gsa.gov:52501/attachment.services/AttachmentService?wsdl")
public class AttachmentWSImplService
    extends Service
{

    private final static URL ATTACHMENTWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ATTACHMENTWSIMPLSERVICE_EXCEPTION;
    private final static QName ATTACHMENTWSIMPLSERVICE_QNAME = new QName("http://fas.gsa.gov/services/Attachment/v1.0", "AttachmentWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://fcoh1m-cws02t.fas.gsa.gov:52501/attachment.services/AttachmentService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ATTACHMENTWSIMPLSERVICE_WSDL_LOCATION = url;
        ATTACHMENTWSIMPLSERVICE_EXCEPTION = e;
    }

    public AttachmentWSImplService() {
        super(__getWsdlLocation(), ATTACHMENTWSIMPLSERVICE_QNAME);
    }

    public AttachmentWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ATTACHMENTWSIMPLSERVICE_QNAME, features);
    }

    public AttachmentWSImplService(URL wsdlLocation) {
        super(wsdlLocation, ATTACHMENTWSIMPLSERVICE_QNAME);
    }

    public AttachmentWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ATTACHMENTWSIMPLSERVICE_QNAME, features);
    }

    public AttachmentWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AttachmentWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AttachmentWS
     */
    @WebEndpoint(name = "AttachmentWS")
    public AttachmentWS getAttachmentWS() {
        return super.getPort(new QName("http://fas.gsa.gov/services/Attachment/v1.0", "AttachmentWS"), AttachmentWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AttachmentWS
     */
    @WebEndpoint(name = "AttachmentWS")
    public AttachmentWS getAttachmentWS(WebServiceFeature... features) {
        return super.getPort(new QName("http://fas.gsa.gov/services/Attachment/v1.0", "AttachmentWS"), AttachmentWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ATTACHMENTWSIMPLSERVICE_EXCEPTION!= null) {
            throw ATTACHMENTWSIMPLSERVICE_EXCEPTION;
        }
        return ATTACHMENTWSIMPLSERVICE_WSDL_LOCATION;
    }

}