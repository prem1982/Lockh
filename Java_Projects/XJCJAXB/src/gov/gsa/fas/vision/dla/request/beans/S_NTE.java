//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
//


package gov.gsa.fas.vision.dla.request.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To transmit information in a free-form format, if necessary, for comment or special instruction
 * 
 * <p>Java class for S_NTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S_NTE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_Note_Reference_Code" type="{}E_363"/>
 *         &lt;element name="E_Description" type="{}E_352"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Segment" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="NTE" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Note/Special Instruction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S_NTE", propOrder = {
    "eNoteReferenceCode",
    "eDescription"
})
public class S_NTE {

    @XmlElement(name = "E_Note_Reference_Code", required = true)
    protected E_363 eNoteReferenceCode;
    @XmlElement(name = "E_Description", required = true)
    protected E_352 eDescription;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the e_Note_Reference_Code property.
     * 
     * @return
     *     possible object is
     *     {@link E_363 }
     *     
     */
    public E_363 getE_Note_Reference_Code() {
        return eNoteReferenceCode;
    }

    /**
     * Sets the value of the e_Note_Reference_Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_363 }
     *     
     */
    public void setE_Note_Reference_Code(E_363 value) {
        this.eNoteReferenceCode = value;
    }

    /**
     * Gets the value of the e_Description property.
     * 
     * @return
     *     possible object is
     *     {@link E_352 }
     *     
     */
    public E_352 getE_Description() {
        return eDescription;
    }

    /**
     * Sets the value of the e_Description property.
     * 
     * @param value
     *     allowed object is
     *     {@link E_352 }
     *     
     */
    public void setE_Description(E_352 value) {
        this.eDescription = value;
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
            return "NTE";
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
            return "Note/Special Instruction";
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