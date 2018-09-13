//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
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
 * To specify quantity information
 * 
 * <p>Java class for S_QTY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_QTY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Quantity_Qualifier" type="{}E_673"/>
 *         &lt;element name="E_Quantity" type="{}E_380"/>
 *         &lt;element name="C_Composite_Unit_of_Measure" type="{}C_C001" minOccurs="0"/>
 *         &lt;element name="E_Free_Form_Message" type="{}E_61" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="QTY" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Quantity" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_QTY", propOrder = {
    "eQuantityQualifier",
    "eQuantity",
    "cCompositeUnitOfMeasure",
    "eFreeFormMessage"
})
public class S_QTY {

    @XmlElement(name = "E_Quantity_Qualifier", required = true)
    protected E_673 eQuantityQualifier;
    @XmlElement(name = "E_Quantity", required = true)
    protected E_380 eQuantity;
    @XmlElementRef(name = "C_Composite_Unit_of_Measure", type = JAXBElement.class)
    protected JAXBElement<C_C001> cCompositeUnitOfMeasure;
    @XmlElementRef(name = "E_Free_Form_Message", type = JAXBElement.class)
    protected JAXBElement<E_61> eFreeFormMessage;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Quantity_Qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link E_673 }
     *     
     */
    public E_673 getE_Quantity_Qualifier() {
        return eQuantityQualifier;
    }

    /**
     * Sets the value of the e_Quantity_Qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_673 }
     *     
     */
    public void setE_Quantity_Qualifier(E_673 value) {
        this.eQuantityQualifier = value;
    }

    /**
     * Gets the value of the e_Quantity property.
     * 
     * @return
     *     possible object is
     *     {@link E_380 }
     *     
     */
    public E_380 getE_Quantity() {
        return eQuantity;
    }

    /**
     * Sets the value of the e_Quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_380 }
     *     
     */
    public void setE_Quantity(E_380 value) {
        this.eQuantity = value;
    }

    /**
     * Gets the value of the c_Composite_Unit_Of_Measure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link C_C001 }{@code >}
     *     
     */
    public JAXBElement<C_C001> getC_Composite_Unit_Of_Measure() {
        return cCompositeUnitOfMeasure;
    }

    /**
     * Sets the value of the c_Composite_Unit_Of_Measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link C_C001 }{@code >}
     *     
     */
    public void setC_Composite_Unit_Of_Measure(JAXBElement<C_C001> value) {
        this.cCompositeUnitOfMeasure = ((JAXBElement<C_C001> ) value);
    }

    /**
     * Gets the value of the e_Free_Form_Message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_61 }{@code >}
     *     
     */
    public JAXBElement<E_61> getE_Free_Form_Message() {
        return eFreeFormMessage;
    }

    /**
     * Sets the value of the e_Free_Form_Message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_61 }{@code >}
     *     
     */
    public void setE_Free_Form_Message(JAXBElement<E_61> value) {
        this.eFreeFormMessage = ((JAXBElement<E_61> ) value);
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
            return "QTY";
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
            return "Quantity";
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
