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
 * To indicate the start of a transaction set and to assign a control number
 * 
 * <p>Java class for S_ST complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_ST">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Transaction_Set_Identifier_Code" type="{}E_143"/>
 *         &lt;element name="E_Transaction_Set_Control_Number" type="{}E_329"/>
 *         &lt;element name="E_Implementation_Convention_Reference" type="{}E_1705" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="ST" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Transaction Set Header" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_ST", propOrder = {
    "eTransactionSetIdentifierCode",
    "eTransactionSetControlNumber",
    "eImplementationConventionReference"
})
public class S_ST {

    @XmlElement(name = "E_Transaction_Set_Identifier_Code", required = true)
    protected E_143 eTransactionSetIdentifierCode;
    @XmlElement(name = "E_Transaction_Set_Control_Number", required = true)
    protected E_329 eTransactionSetControlNumber;
    @XmlElementRef(name = "E_Implementation_Convention_Reference", type = JAXBElement.class)
    protected JAXBElement<E_1705> eImplementationConventionReference;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Transaction_Set_Identifier_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_143 }
     *     
     */
    public E_143 getE_Transaction_Set_Identifier_Code() {
        return eTransactionSetIdentifierCode;
    }

    /**
     * Sets the value of the e_Transaction_Set_Identifier_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_143 }
     *     
     */
    public void setE_Transaction_Set_Identifier_Code(E_143 value) {
        this.eTransactionSetIdentifierCode = value;
    }

    /**
     * Gets the value of the e_Transaction_Set_Control_Number property.
     * 
     * @return
     *     possible object is
     *     {@link E_329 }
     *     
     */
    public E_329 getE_Transaction_Set_Control_Number() {
        return eTransactionSetControlNumber;
    }

    /**
     * Sets the value of the e_Transaction_Set_Control_Number property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_329 }
     *     
     */
    public void setE_Transaction_Set_Control_Number(E_329 value) {
        this.eTransactionSetControlNumber = value;
    }

    /**
     * Gets the value of the e_Implementation_Convention_Reference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1705 }{@code >}
     *     
     */
    public JAXBElement<E_1705> getE_Implementation_Convention_Reference() {
        return eImplementationConventionReference;
    }

    /**
     * Sets the value of the e_Implementation_Convention_Reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1705 }{@code >}
     *     
     */
    public void setE_Implementation_Convention_Reference(JAXBElement<E_1705> value) {
        this.eImplementationConventionReference = ((JAXBElement<E_1705> ) value);
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
            return "ST";
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
            return "Transaction Set Header";
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
