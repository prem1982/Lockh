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
 * To identify a composite unit of measure(See Figures Appendix for examples of use)
 * 
 * <p>Java class for C_C001 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="C_C001">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Unit_or_Basis_for_Measurement_Code" type="{}E_355_1"/>
 *         &lt;element name="E_Exponent" type="{}E_1018" minOccurs="0"/>
 *         &lt;element name="E_Multiplier" type="{}E_649" minOccurs="0"/>
 *         &lt;element name="E_Unit_or_Basis_for_Measurement_Code_1" type="{}E_355" minOccurs="0"/>
 *         &lt;element name="E_Exponent_1" type="{}E_1018" minOccurs="0"/>
 *         &lt;element name="E_Multiplier_1" type="{}E_649" minOccurs="0"/>
 *         &lt;element name="E_Unit_or_Basis_for_Measurement_Code_2" type="{}E_355" minOccurs="0"/>
 *         &lt;element name="E_Exponent_2" type="{}E_1018" minOccurs="0"/>
 *         &lt;element name="E_Multiplier_2" type="{}E_649" minOccurs="0"/>
 *         &lt;element name="E_Unit_or_Basis_for_Measurement_Code_3" type="{}E_355" minOccurs="0"/>
 *         &lt;element name="E_Exponent_3" type="{}E_1018" minOccurs="0"/>
 *         &lt;element name="E_Multiplier_3" type="{}E_649" minOccurs="0"/>
 *         &lt;element name="E_Unit_or_Basis_for_Measurement_Code_4" type="{}E_355" minOccurs="0"/>
 *         &lt;element name="E_Exponent_4" type="{}E_1018" minOccurs="0"/>
 *         &lt;element name="E_Multiplier_4" type="{}E_649" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="C001" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Composite Unit of Measure" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "C_C001", propOrder = {
    "eUnitOrBasisForMeasurementCode",
    "eExponent",
    "eMultiplier",
    "eUnitOrBasisForMeasurementCode1",
    "eExponent1",
    "eMultiplier1",
    "eUnitOrBasisForMeasurementCode2",
    "eExponent2",
    "eMultiplier2",
    "eUnitOrBasisForMeasurementCode3",
    "eExponent3",
    "eMultiplier3",
    "eUnitOrBasisForMeasurementCode4",
    "eExponent4",
    "eMultiplier4"
})
public class C_C001 {

    @XmlElement(name = "E_Unit_or_Basis_for_Measurement_Code", required = true)
    protected E_355_1 eUnitOrBasisForMeasurementCode;
    @XmlElementRef(name = "E_Exponent", type = JAXBElement.class)
    protected JAXBElement<E_1018> eExponent;
    @XmlElementRef(name = "E_Multiplier", type = JAXBElement.class)
    protected JAXBElement<E_649> eMultiplier;
    @XmlElementRef(name = "E_Unit_or_Basis_for_Measurement_Code_1", type = JAXBElement.class)
    protected JAXBElement<E_355> eUnitOrBasisForMeasurementCode1;
    @XmlElementRef(name = "E_Exponent_1", type = JAXBElement.class)
    protected JAXBElement<E_1018> eExponent1;
    @XmlElementRef(name = "E_Multiplier_1", type = JAXBElement.class)
    protected JAXBElement<E_649> eMultiplier1;
    @XmlElementRef(name = "E_Unit_or_Basis_for_Measurement_Code_2", type = JAXBElement.class)
    protected JAXBElement<E_355> eUnitOrBasisForMeasurementCode2;
    @XmlElementRef(name = "E_Exponent_2", type = JAXBElement.class)
    protected JAXBElement<E_1018> eExponent2;
    @XmlElementRef(name = "E_Multiplier_2", type = JAXBElement.class)
    protected JAXBElement<E_649> eMultiplier2;
    @XmlElementRef(name = "E_Unit_or_Basis_for_Measurement_Code_3", type = JAXBElement.class)
    protected JAXBElement<E_355> eUnitOrBasisForMeasurementCode3;
    @XmlElementRef(name = "E_Exponent_3", type = JAXBElement.class)
    protected JAXBElement<E_1018> eExponent3;
    @XmlElementRef(name = "E_Multiplier_3", type = JAXBElement.class)
    protected JAXBElement<E_649> eMultiplier3;
    @XmlElementRef(name = "E_Unit_or_Basis_for_Measurement_Code_4", type = JAXBElement.class)
    protected JAXBElement<E_355> eUnitOrBasisForMeasurementCode4;
    @XmlElementRef(name = "E_Exponent_4", type = JAXBElement.class)
    protected JAXBElement<E_1018> eExponent4;
    @XmlElementRef(name = "E_Multiplier_4", type = JAXBElement.class)
    protected JAXBElement<E_649> eMultiplier4;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Unit_Or_Basis_For_Measurement_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_355_1 }
     *     
     */
    public E_355_1 getE_Unit_Or_Basis_For_Measurement_Code() {
        return eUnitOrBasisForMeasurementCode;
    }

    /**
     * Sets the value of the e_Unit_Or_Basis_For_Measurement_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_355_1 }
     *     
     */
    public void setE_Unit_Or_Basis_For_Measurement_Code(E_355_1 value) {
        this.eUnitOrBasisForMeasurementCode = value;
    }

    /**
     * Gets the value of the e_Exponent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public JAXBElement<E_1018> getE_Exponent() {
        return eExponent;
    }

    /**
     * Sets the value of the e_Exponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public void setE_Exponent(JAXBElement<E_1018> value) {
        this.eExponent = ((JAXBElement<E_1018> ) value);
    }

    /**
     * Gets the value of the e_Multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public JAXBElement<E_649> getE_Multiplier() {
        return eMultiplier;
    }

    /**
     * Sets the value of the e_Multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public void setE_Multiplier(JAXBElement<E_649> value) {
        this.eMultiplier = ((JAXBElement<E_649> ) value);
    }

    /**
     * Gets the value of the e_Unit_Or_Basis_For_Measurement_Code_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public JAXBElement<E_355> getE_Unit_Or_Basis_For_Measurement_Code_1() {
        return eUnitOrBasisForMeasurementCode1;
    }

    /**
     * Sets the value of the e_Unit_Or_Basis_For_Measurement_Code_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public void setE_Unit_Or_Basis_For_Measurement_Code_1(JAXBElement<E_355> value) {
        this.eUnitOrBasisForMeasurementCode1 = ((JAXBElement<E_355> ) value);
    }

    /**
     * Gets the value of the e_Exponent_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public JAXBElement<E_1018> getE_Exponent_1() {
        return eExponent1;
    }

    /**
     * Sets the value of the e_Exponent_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public void setE_Exponent_1(JAXBElement<E_1018> value) {
        this.eExponent1 = ((JAXBElement<E_1018> ) value);
    }

    /**
     * Gets the value of the e_Multiplier_1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public JAXBElement<E_649> getE_Multiplier_1() {
        return eMultiplier1;
    }

    /**
     * Sets the value of the e_Multiplier_1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public void setE_Multiplier_1(JAXBElement<E_649> value) {
        this.eMultiplier1 = ((JAXBElement<E_649> ) value);
    }

    /**
     * Gets the value of the e_Unit_Or_Basis_For_Measurement_Code_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public JAXBElement<E_355> getE_Unit_Or_Basis_For_Measurement_Code_2() {
        return eUnitOrBasisForMeasurementCode2;
    }

    /**
     * Sets the value of the e_Unit_Or_Basis_For_Measurement_Code_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public void setE_Unit_Or_Basis_For_Measurement_Code_2(JAXBElement<E_355> value) {
        this.eUnitOrBasisForMeasurementCode2 = ((JAXBElement<E_355> ) value);
    }

    /**
     * Gets the value of the e_Exponent_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public JAXBElement<E_1018> getE_Exponent_2() {
        return eExponent2;
    }

    /**
     * Sets the value of the e_Exponent_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public void setE_Exponent_2(JAXBElement<E_1018> value) {
        this.eExponent2 = ((JAXBElement<E_1018> ) value);
    }

    /**
     * Gets the value of the e_Multiplier_2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public JAXBElement<E_649> getE_Multiplier_2() {
        return eMultiplier2;
    }

    /**
     * Sets the value of the e_Multiplier_2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public void setE_Multiplier_2(JAXBElement<E_649> value) {
        this.eMultiplier2 = ((JAXBElement<E_649> ) value);
    }

    /**
     * Gets the value of the e_Unit_Or_Basis_For_Measurement_Code_3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public JAXBElement<E_355> getE_Unit_Or_Basis_For_Measurement_Code_3() {
        return eUnitOrBasisForMeasurementCode3;
    }

    /**
     * Sets the value of the e_Unit_Or_Basis_For_Measurement_Code_3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public void setE_Unit_Or_Basis_For_Measurement_Code_3(JAXBElement<E_355> value) {
        this.eUnitOrBasisForMeasurementCode3 = ((JAXBElement<E_355> ) value);
    }

    /**
     * Gets the value of the e_Exponent_3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public JAXBElement<E_1018> getE_Exponent_3() {
        return eExponent3;
    }

    /**
     * Sets the value of the e_Exponent_3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public void setE_Exponent_3(JAXBElement<E_1018> value) {
        this.eExponent3 = ((JAXBElement<E_1018> ) value);
    }

    /**
     * Gets the value of the e_Multiplier_3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public JAXBElement<E_649> getE_Multiplier_3() {
        return eMultiplier3;
    }

    /**
     * Sets the value of the e_Multiplier_3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public void setE_Multiplier_3(JAXBElement<E_649> value) {
        this.eMultiplier3 = ((JAXBElement<E_649> ) value);
    }

    /**
     * Gets the value of the e_Unit_Or_Basis_For_Measurement_Code_4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public JAXBElement<E_355> getE_Unit_Or_Basis_For_Measurement_Code_4() {
        return eUnitOrBasisForMeasurementCode4;
    }

    /**
     * Sets the value of the e_Unit_Or_Basis_For_Measurement_Code_4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_355 }{@code >}
     *     
     */
    public void setE_Unit_Or_Basis_For_Measurement_Code_4(JAXBElement<E_355> value) {
        this.eUnitOrBasisForMeasurementCode4 = ((JAXBElement<E_355> ) value);
    }

    /**
     * Gets the value of the e_Exponent_4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public JAXBElement<E_1018> getE_Exponent_4() {
        return eExponent4;
    }

    /**
     * Sets the value of the e_Exponent_4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_1018 }{@code >}
     *     
     */
    public void setE_Exponent_4(JAXBElement<E_1018> value) {
        this.eExponent4 = ((JAXBElement<E_1018> ) value);
    }

    /**
     * Gets the value of the e_Multiplier_4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public JAXBElement<E_649> getE_Multiplier_4() {
        return eMultiplier4;
    }

    /**
     * Sets the value of the e_Multiplier_4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link E_649 }{@code >}
     *     
     */
    public void setE_Multiplier_4(JAXBElement<E_649> value) {
        this.eMultiplier4 = ((JAXBElement<E_649> ) value);
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
            return "Composite";
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
            return "C001";
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
            return "Composite Unit of Measure";
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