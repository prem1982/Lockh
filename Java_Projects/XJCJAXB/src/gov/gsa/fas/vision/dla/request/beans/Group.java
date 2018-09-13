//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
//


package gov.gsa.fas.vision.dla.request.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="GroupReceiverID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupSenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupChildCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupTrailerControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Transaction" type="{}Transaction" minOccurs="0"/>
 *         &lt;element name="TPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {

})
public class Group {

    @XmlElement(name = "GroupReceiverID")
    protected String groupReceiverID;
    @XmlElement(name = "GroupSenderID")
    protected String groupSenderID;
    @XmlElement(name = "GroupVersionNumber")
    protected String groupVersionNumber;
    @XmlElement(name = "GroupAgencyCode")
    protected String groupAgencyCode;
    @XmlElement(name = "GroupChildCount")
    protected String groupChildCount;
    @XmlElement(name = "GroupControlNumber")
    protected String groupControlNumber;
    @XmlElement(name = "GroupDate")
    protected String groupDate;
    @XmlElement(name = "GroupID")
    protected String groupID;
    @XmlElement(name = "GroupTime")
    protected String groupTime;
    @XmlElement(name = "GroupTrailerControlNumber")
    protected String groupTrailerControlNumber;
    @XmlElement(name = "Transaction")
    protected Transaction transaction;
    @XmlElement(name = "TPName")
    protected String tpName;

    /**
     * Gets the value of the groupReceiverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReceiverID() {
        return groupReceiverID;
    }

    /**
     * Sets the value of the groupReceiverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReceiverID(String value) {
        this.groupReceiverID = value;
    }

    /**
     * Gets the value of the groupSenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupSenderID() {
        return groupSenderID;
    }

    /**
     * Sets the value of the groupSenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupSenderID(String value) {
        this.groupSenderID = value;
    }

    /**
     * Gets the value of the groupVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupVersionNumber() {
        return groupVersionNumber;
    }

    /**
     * Sets the value of the groupVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupVersionNumber(String value) {
        this.groupVersionNumber = value;
    }

    /**
     * Gets the value of the groupAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupAgencyCode() {
        return groupAgencyCode;
    }

    /**
     * Sets the value of the groupAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupAgencyCode(String value) {
        this.groupAgencyCode = value;
    }

    /**
     * Gets the value of the groupChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupChildCount() {
        return groupChildCount;
    }

    /**
     * Sets the value of the groupChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupChildCount(String value) {
        this.groupChildCount = value;
    }

    /**
     * Gets the value of the groupControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupControlNumber() {
        return groupControlNumber;
    }

    /**
     * Sets the value of the groupControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupControlNumber(String value) {
        this.groupControlNumber = value;
    }

    /**
     * Gets the value of the groupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDate() {
        return groupDate;
    }

    /**
     * Sets the value of the groupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDate(String value) {
        this.groupDate = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the groupTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupTime() {
        return groupTime;
    }

    /**
     * Sets the value of the groupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupTime(String value) {
        this.groupTime = value;
    }

    /**
     * Gets the value of the groupTrailerControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupTrailerControlNumber() {
        return groupTrailerControlNumber;
    }

    /**
     * Sets the value of the groupTrailerControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupTrailerControlNumber(String value) {
        this.groupTrailerControlNumber = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the tpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPName() {
        return tpName;
    }

    /**
     * Sets the value of the tpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPName(String value) {
        this.tpName = value;
    }

}
