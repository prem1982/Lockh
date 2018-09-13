//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
//


package gov.gsa.fas.vision.dla.request.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a party by type of organization, name, and code
 * 
 * <p>Java class for L_N1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L_N1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_Name" type="{}S_N1"/>
 *         &lt;element name="S_Administrative_Communications_Contact" type="{}S_PER" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="N1" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Name" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L_N1", propOrder = {
    "sName",
    "sAdministrativeCommunicationsContact"
})
public class L_N1 {

    @XmlElement(name = "S_Name", required = true)
    protected S_N1 sName;
    @XmlElement(name = "S_Administrative_Communications_Contact", nillable = true)
    protected List<S_PER> sAdministrativeCommunicationsContact;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the s_Name property.
     * 
     * @return
     *     possible object is
     *     {@link S_N1 }
     *     
     */
    public S_N1 getS_Name() {
        return sName;
    }

    /**
     * Sets the value of the s_Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_N1 }
     *     
     */
    public void setS_Name(S_N1 value) {
        this.sName = value;
    }

    /**
     * Gets the value of the sAdministrativeCommunicationsContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sAdministrativeCommunicationsContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Administrative_Communications_Contact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_PER }
     * 
     * 
     */
    public List<S_PER> getS_Administrative_Communications_Contact() {
        if (sAdministrativeCommunicationsContact == null) {
            sAdministrativeCommunicationsContact = new ArrayList<S_PER>();
        }
        return this.sAdministrativeCommunicationsContact;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Loop";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        if (id == null) {
            return "N1";
        } else {
            return id;
        }
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        if (name == null) {
            return "Name";
        } else {
            return name;
        }
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
