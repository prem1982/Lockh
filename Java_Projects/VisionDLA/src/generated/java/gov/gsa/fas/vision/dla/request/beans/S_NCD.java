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
 * To describe the nonconformance condition
 * 
 * <p>Java class for S_NCD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_NCD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Measurement_Attribute_Code" type="{}E_936" minOccurs="0"/>
 *         &lt;element name="E_Nonconformance_Determination_Code" type="{}E_888"/>
 *         &lt;element name="E_Assigned_Identification" type="{}E_350_1"/>
 *         &lt;element name="E_Product_Process_Characteristic_Code" type="{}E_750" minOccurs="0"/>
 *         &lt;element name="E_Agency_Qualifier_Code" type="{}E_559_2" minOccurs="0"/>
 *         &lt;element name="E_Product_Description_Code" type="{}E_751" minOccurs="0"/>
 *         &lt;element name="E_Description" type="{}E_352_1" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="NCD" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Nonconformance Description" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_NCD", propOrder = {
    "eMeasurementAttributeCode",
    "eNonconformanceDeterminationCode",
    "eAssignedIdentification",
    "eProductProcessCharacteristicCode",
    "eAgencyQualifierCode",
    "eProductDescriptionCode",
    "eDescription"
})
public class S_NCD {

    @XmlElementRef(name = "E_Measurement_Attribute_Code", type = JAXBElement.class)
    protected JAXBElement<E_936> eMeasurementAttributeCode;
    @XmlElement(name = "E_Nonconformance_Determination_Code", required = true)
    protected E_888 eNonconformanceDeterminationCode;
    @XmlElement(name = "E_Assigned_Identification", required = true)
    protected E_350_1 eAssignedIdentification;
    @XmlElementRef(name = "E_Product_Process_Characteristic_Code", type = JAXBElement.class)
    protected JAXBElement<E_750> eProductProcessCharacteristicCode;
    @XmlElementRef(name = "E_Agency_Qualifier_Code", type = JAXBElement.class)
    protected JAXBElement<E_559_2> eAgencyQualifierCode;
    @XmlElementRef(name = "E_Product_Description_Code", type = JAXBElement.class)
    protected JAXBElement<E_751> eProductDescriptionCode;
    @XmlElementRef(name = "E_Description", type = JAXBElement.class)
    protected JAXBElement<E_352_1> eDescription;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Measurement_Attribute_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_936 }{@code >}
     *     
     */
    public JAXBElement<E_936> getE_Measurement_Attribute_Code() {
        return eMeasurementAttributeCode;
    }

    /**
     * Sets the value of the e_Measurement_Attribute_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_936 }{@code >}
     *     
     */
    public void setE_Measurement_Attribute_Code(JAXBElement<E_936> value) {
        this.eMeasurementAttributeCode = ((JAXBElement<E_936> ) value);
    }

    /**
     * Gets the value of the e_Nonconformance_Determination_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_888 }
     *     
     */
    public E_888 getE_Nonconformance_Determination_Code() {
        return eNonconformanceDeterminationCode;
    }

    /**
     * Sets the value of the e_Nonconformance_Determination_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_888 }
     *     
     */
    public void setE_Nonconformance_Determination_Code(E_888 value) {
        this.eNonconformanceDeterminationCode = value;
    }

    /**
     * Gets the value of the e_Assigned_Identification property.
     * 
     * @return
     *     possible object is
     *     {@link E_350_1 }
     *     
     */
    public E_350_1 getE_Assigned_Identification() {
        return eAssignedIdentification;
    }

    /**
     * Sets the value of the e_Assigned_Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_350_1 }
     *     
     */
    public void setE_Assigned_Identification(E_350_1 value) {
        this.eAssignedIdentification = value;
    }

    /**
     * Gets the value of the e_Product_Process_Characteristic_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_750 }{@code >}
     *     
     */
    public JAXBElement<E_750> getE_Product_Process_Characteristic_Code() {
        return eProductProcessCharacteristicCode;
    }

    /**
     * Sets the value of the e_Product_Process_Characteristic_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_750 }{@code >}
     *     
     */
    public void setE_Product_Process_Characteristic_Code(JAXBElement<E_750> value) {
        this.eProductProcessCharacteristicCode = ((JAXBElement<E_750> ) value);
    }

    /**
     * Gets the value of the e_Agency_Qualifier_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_559_2 }{@code >}
     *     
     */
    public JAXBElement<E_559_2> getE_Agency_Qualifier_Code() {
        return eAgencyQualifierCode;
    }

    /**
     * Sets the value of the e_Agency_Qualifier_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_559_2 }{@code >}
     *     
     */
    public void setE_Agency_Qualifier_Code(JAXBElement<E_559_2> value) {
        this.eAgencyQualifierCode = ((JAXBElement<E_559_2> ) value);
    }

    /**
     * Gets the value of the e_Product_Description_Code property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_751 }{@code >}
     *     
     */
    public JAXBElement<E_751> getE_Product_Description_Code() {
        return eProductDescriptionCode;
    }

    /**
     * Sets the value of the e_Product_Description_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_751 }{@code >}
     *     
     */
    public void setE_Product_Description_Code(JAXBElement<E_751> value) {
        this.eProductDescriptionCode = ((JAXBElement<E_751> ) value);
    }

    /**
     * Gets the value of the e_Description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_352_1 }{@code >}
     *     
     */
    public JAXBElement<E_352_1> getE_Description() {
        return eDescription;
    }

    /**
     * Sets the value of the e_Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_352_1 }{@code >}
     *     
     */
    public void setE_Description(JAXBElement<E_352_1> value) {
        this.eDescription = ((JAXBElement<E_352_1> ) value);
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
            return "NCD";
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
            return "Nonconformance Description";
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
