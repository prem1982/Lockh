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
 * To specify additional names
 * 
 * <p>Java class for S_N2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_N2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Name" type="{}E_93"/>
 *         &lt;element name="E_Name_1" type="{}E_93_1" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="N2" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Additional Name Information" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_N2", propOrder = {
    "eName",
    "eName1"
})
public class S_N2 {

    @XmlElement(name = "E_Name", required = true)
    protected E_93 eName;
    @XmlElementRef(name = "E_Name_1", type = JAXBElement.class)
    protected JAXBElement<E_93_1> eName1;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Name property.
     * 
     * @return
     *     possible object is
     *     {@link E_93 }
     *     
     */
    public E_93 getE_Name() {
        return eName;
    }

    /**
     * Sets the value of the e_Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_93 }
     *     
     */
    public void setE_Name(E_93 value) {
        this.eName = value;
    }

    /**
     * Gets the value of the e_Name_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_93_1 }{@code >}
     *     
     */
    public JAXBElement<E_93_1> getE_Name_1() {
        return eName1;
    }

    /**
     * Sets the value of the e_Name_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_93_1 }{@code >}
     *     
     */
    public void setE_Name_1(JAXBElement<E_93_1> value) {
        this.eName1 = ((JAXBElement<E_93_1> ) value);
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
            return "N2";
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
            return "Additional Name Information";
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
