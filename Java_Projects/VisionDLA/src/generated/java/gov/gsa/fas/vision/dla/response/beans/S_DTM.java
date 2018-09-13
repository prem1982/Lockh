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
 * To specify pertinent dates and times
 * 
 * <p>Java class for S_DTM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_DTM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Date_Time_Qualifier" type="{}E_374"/>
 *         &lt;element name="E_Date" type="{}E_373"/>
 *         &lt;element name="E_Time" type="{}E_337_1" minOccurs="0"/>
 *         &lt;element name="E_Time_Code" type="{}E_623" minOccurs="0"/>
 *         &lt;element name="E_Date_Time_Period_Format_Qualifier" type="{}E_1250" minOccurs="0"/>
 *         &lt;element name="E_Date_Time_Period" type="{}E_1251" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="DTM" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Date/Time Reference" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_DTM", propOrder = {
    "eDateTimeQualifier",
    "eDate",
    "eTime",
    "eTimeCode",
    "eDateTimePeriodFormatQualifier",
    "eDateTimePeriod"
})
public class S_DTM {

    @XmlElement(name = "E_Date_Time_Qualifier", required = true)
    protected E_374 eDateTimeQualifier;
    @XmlElement(name = "E_Date", required = true)
    protected E_373 eDate;
    @XmlElementRef(name = "E_Time", type = JAXBElement.class)
    protected JAXBElement<E_337_1> eTime;
    @XmlElementRef(name = "E_Time_Code", type = JAXBElement.class)
    protected JAXBElement<E_623> eTimeCode;
    @XmlElementRef(name = "E_Date_Time_Period_Format_Qualifier", type = JAXBElement.class)
    protected JAXBElement<E_1250> eDateTimePeriodFormatQualifier;
    @XmlElementRef(name = "E_Date_Time_Period", type = JAXBElement.class)
    protected JAXBElement<E_1251> eDateTimePeriod;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Date_Time_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link E_374 }
     *     
     */
    public E_374 getE_Date_Time_Qualifier() {
        return eDateTimeQualifier;
    }

    /**
     * Sets the value of the e_Date_Time_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_374 }
     *     
     */
    public void setE_Date_Time_Qualifier(E_374 value) {
        this.eDateTimeQualifier = value;
    }

    /**
     * Gets the value of the e_Date property.
     * 
     * @return
     *     possible object is
     *     {@link E_373 }
     *     
     */
    public E_373 getE_Date() {
        return eDate;
    }

    /**
     * Sets the value of the e_Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_373 }
     *     
     */
    public void setE_Date(E_373 value) {
        this.eDate = value;
    }

    /**
     * Gets the value of the e_Time property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_337_1 }{@code >}
     *     
     */
    public JAXBElement<E_337_1> getE_Time() {
        return eTime;
    }

    /**
     * Sets the value of the e_Time property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_337_1 }{@code >}
     *     
     */
    public void setE_Time(JAXBElement<E_337_1> value) {
        this.eTime = ((JAXBElement<E_337_1> ) value);
    }

    /**
     * Gets the value of the e_Time_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_623 }{@code >}
     *     
     */
    public JAXBElement<E_623> getE_Time_Code() {
        return eTimeCode;
    }

    /**
     * Sets the value of the e_Time_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_623 }{@code >}
     *     
     */
    public void setE_Time_Code(JAXBElement<E_623> value) {
        this.eTimeCode = ((JAXBElement<E_623> ) value);
    }

    /**
     * Gets the value of the e_Date_Time_Period_Format_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1250 }{@code >}
     *     
     */
    public JAXBElement<E_1250> getE_Date_Time_Period_Format_Qualifier() {
        return eDateTimePeriodFormatQualifier;
    }

    /**
     * Sets the value of the e_Date_Time_Period_Format_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1250 }{@code >}
     *     
     */
    public void setE_Date_Time_Period_Format_Qualifier(JAXBElement<E_1250> value) {
        this.eDateTimePeriodFormatQualifier = ((JAXBElement<E_1250> ) value);
    }

    /**
     * Gets the value of the e_Date_Time_Period property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1251 }{@code >}
     *     
     */
    public JAXBElement<E_1251> getE_Date_Time_Period() {
        return eDateTimePeriod;
    }

    /**
     * Sets the value of the e_Date_Time_Period property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1251 }{@code >}
     *     
     */
    public void setE_Date_Time_Period(JAXBElement<E_1251> value) {
        this.eDateTimePeriod = ((JAXBElement<E_1251> ) value);
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
            return "DTM";
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
            return "Date/Time Reference";
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
