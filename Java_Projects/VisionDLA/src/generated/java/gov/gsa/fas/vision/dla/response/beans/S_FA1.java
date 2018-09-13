//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:11:00 AM EST 
//


package gov.gsa.fas.vision.dla.response.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the organization controlling the content of the accounting citation, and the purpose associated with the accounting citation
 * 
 * <p>Java class for S_FA1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_FA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Agency_Qualifier_Code" type="{}E_559_2"/>
 *         &lt;element name="E_Service_Promotion_Allowance_or_Charge_Code" type="{}E_1300" minOccurs="0"/>
 *         &lt;element name="E_Allowance_or_Charge_Indicator" type="{}E_248" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="FA1" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Type of Financial Accounting Data" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_FA1", propOrder = {
    "eAgencyQualifierCode",
    "eServicePromotionAllowanceOrChargeCode",
    "eAllowanceOrChargeIndicator"
})
public class S_FA1 {

    @XmlElement(name = "E_Agency_Qualifier_Code", required = true)
    protected E_559_2 eAgencyQualifierCode;
    @XmlElementRef(name = "E_Service_Promotion_Allowance_or_Charge_Code", type = JAXBElement.class)
    protected JAXBElement<E_1300> eServicePromotionAllowanceOrChargeCode;
    @XmlElementRef(name = "E_Allowance_or_Charge_Indicator", type = JAXBElement.class)
    protected JAXBElement<E_248> eAllowanceOrChargeIndicator;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Agency_Qualifier_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_559_2 }
     *     
     */
    public E_559_2 getE_Agency_Qualifier_Code() {
        return eAgencyQualifierCode;
    }

    /**
     * Sets the value of the e_Agency_Qualifier_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_559_2 }
     *     
     */
    public void setE_Agency_Qualifier_Code(E_559_2 value) {
        this.eAgencyQualifierCode = value;
    }

    /**
     * Gets the value of the e_Service_Promotion_Allowance_Or_Charge_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1300 }{@code >}
     *     
     */
    public JAXBElement<E_1300> getE_Service_Promotion_Allowance_Or_Charge_Code() {
        return eServicePromotionAllowanceOrChargeCode;
    }

    /**
     * Sets the value of the e_Service_Promotion_Allowance_Or_Charge_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1300 }{@code >}
     *     
     */
    public void setE_Service_Promotion_Allowance_Or_Charge_Code(JAXBElement<E_1300> value) {
        this.eServicePromotionAllowanceOrChargeCode = ((JAXBElement<E_1300> ) value);
    }

    /**
     * Gets the value of the e_Allowance_Or_Charge_Indicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_248 }{@code >}
     *     
     */
    public JAXBElement<E_248> getE_Allowance_Or_Charge_Indicator() {
        return eAllowanceOrChargeIndicator;
    }

    /**
     * Sets the value of the e_Allowance_Or_Charge_Indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_248 }{@code >}
     *     
     */
    public void setE_Allowance_Or_Charge_Indicator(JAXBElement<E_248> value) {
        this.eAllowanceOrChargeIndicator = ((JAXBElement<E_248> ) value);
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
            return "Segment";
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
            return "FA1";
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
            return "Type of Financial Accounting Data";
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
