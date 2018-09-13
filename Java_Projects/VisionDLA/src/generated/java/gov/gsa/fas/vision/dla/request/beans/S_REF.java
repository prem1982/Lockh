//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 10:10:47 AM EST 
//


package gov.gsa.fas.vision.dla.request.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify identifying information
 * 
 * <p>Java class for S_REF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_REF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Reference_Identification_Qualifier" type="{}E_128"/>
 *         &lt;element name="E_Reference_Identification" type="{}E_127"/>
 *         &lt;element name="E_Description" type="{}E_352" minOccurs="0"/>
 *         &lt;element name="C_Reference_Identifier" type="{}C_C040" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="REF" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Reference Identification" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_REF", propOrder = {
    "eReferenceIdentificationQualifier",
    "eReferenceIdentification",
    "eDescription",
    "cReferenceIdentifier"
})
public class S_REF {

    @XmlElement(name = "E_Reference_Identification_Qualifier", required = true)
    protected E_128 eReferenceIdentificationQualifier;
    @XmlElement(name = "E_Reference_Identification", required = true)
    protected E_127 eReferenceIdentification;
    @XmlElementRef(name = "E_Description", type = JAXBElement.class)
    protected JAXBElement<E_352> eDescription;
    @XmlElementRef(name = "C_Reference_Identifier", type = JAXBElement.class)
    protected JAXBElement<C_C040> cReferenceIdentifier;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Reference_Identification_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link E_128 }
     *     
     */
    public E_128 getE_Reference_Identification_Qualifier() {
        return eReferenceIdentificationQualifier;
    }

    /**
     * Sets the value of the e_Reference_Identification_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_128 }
     *     
     */
    public void setE_Reference_Identification_Qualifier(E_128 value) {
        this.eReferenceIdentificationQualifier = value;
    }

    /**
     * Gets the value of the e_Reference_Identification property.
     * 
     * @return
     *     possible object is
     *     {@link E_127 }
     *     
     */
    public E_127 getE_Reference_Identification() {
        return eReferenceIdentification;
    }

    /**
     * Sets the value of the e_Reference_Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_127 }
     *     
     */
    public void setE_Reference_Identification(E_127 value) {
        this.eReferenceIdentification = value;
    }

    /**
     * Gets the value of the e_Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_352 }{@code >}
     *     
     */
    public JAXBElement<E_352> getE_Description() {
        return eDescription;
    }

    /**
     * Sets the value of the e_Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_352 }{@code >}
     *     
     */
    public void setE_Description(JAXBElement<E_352> value) {
        this.eDescription = ((JAXBElement<E_352> ) value);
    }

    /**
     * Gets the value of the c_Reference_Identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link C_C040 }{@code >}
     *     
     */
    public JAXBElement<C_C040> getC_Reference_Identifier() {
        return cReferenceIdentifier;
    }

    /**
     * Sets the value of the c_Reference_Identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link C_C040 }{@code >}
     *     
     */
    public void setC_Reference_Identifier(JAXBElement<C_C040> value) {
        this.cReferenceIdentifier = ((JAXBElement<C_C040> ) value);
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
            return "REF";
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
            return "Reference Identification";
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
