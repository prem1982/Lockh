//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
//


package gov.gsa.fas.vision.dla.request.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify dependencies among and the content of hierarchically related groups of data segments
 * 
 * <p>Java class for L_HL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L_HL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_Hierarchical_Level" type="{}S_HL"/>
 *         &lt;element name="S_Item_Identification" type="{}S_LIN" minOccurs="0"/>
 *         &lt;element name="S_Date_Time_Reference" type="{}S_DTM" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="S_Reference_Identification" type="{}S_REF" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="S_Contract_Summary" type="{}S_CS" minOccurs="0"/>
 *         &lt;element name="S_Paperwork" type="{}S_PWK" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="L_Code_Source_Information" type="{}L_LM" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="L_Type_of_Financial_Accounting_Data" type="{}L_FA1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="L_Nonconformance_Description" type="{}L_NCD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Loop" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="HL" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Hierarchical Level" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L_HL", propOrder = {
    "sHierarchicalLevel",
    "sItemIdentification",
    "sDateTimeReference",
    "sReferenceIdentification",
    "sContractSummary",
    "sPaperwork",
    "lCodeSourceInformation",
    "lTypeOfFinancialAccountingData",
    "lNonconformanceDescription"
})
public class L_HL {

    @XmlElement(name = "S_Hierarchical_Level", required = true)
    protected S_HL sHierarchicalLevel;
    @XmlElementRef(name = "S_Item_Identification", type = JAXBElement.class)
    protected JAXBElement<S_LIN> sItemIdentification;
    @XmlElement(name = "S_Date_Time_Reference", nillable = true)
    protected List<S_DTM> sDateTimeReference;
    @XmlElement(name = "S_Reference_Identification", nillable = true)
    protected List<S_REF> sReferenceIdentification;
    @XmlElementRef(name = "S_Contract_Summary", type = JAXBElement.class)
    protected JAXBElement<S_CS> sContractSummary;
    @XmlElement(name = "S_Paperwork", nillable = true)
    protected List<S_PWK> sPaperwork;
    @XmlElement(name = "L_Code_Source_Information", nillable = true)
    protected List<L_LM> lCodeSourceInformation;
    @XmlElement(name = "L_Type_of_Financial_Accounting_Data", nillable = true)
    protected List<L_FA1> lTypeOfFinancialAccountingData;
    @XmlElement(name = "L_Nonconformance_Description", nillable = true)
    protected List<L_NCD> lNonconformanceDescription;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;

    /**
     * Gets the value of the s_Hierarchical_Level property.
     * 
     * @return
     *     possible object is
     *     {@link S_HL }
     *     
     */
    public S_HL getS_Hierarchical_Level() {
        return sHierarchicalLevel;
    }

    /**
     * Sets the value of the s_Hierarchical_Level property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_HL }
     *     
     */
    public void setS_Hierarchical_Level(S_HL value) {
        this.sHierarchicalLevel = value;
    }

    /**
     * Gets the value of the s_Item_Identification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link S_LIN }{@code >}
     *     
     */
    public JAXBElement<S_LIN> getS_Item_Identification() {
        return sItemIdentification;
    }

    /**
     * Sets the value of the s_Item_Identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link S_LIN }{@code >}
     *     
     */
    public void setS_Item_Identification(JAXBElement<S_LIN> value) {
        this.sItemIdentification = ((JAXBElement<S_LIN> ) value);
    }

    /**
     * Gets the value of the sDateTimeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sDateTimeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Date_Time_Reference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_DTM }
     * 
     * 
     */
    public List<S_DTM> getS_Date_Time_Reference() {
        if (sDateTimeReference == null) {
            sDateTimeReference = new ArrayList<S_DTM>();
        }
        return this.sDateTimeReference;
    }

    /**
     * Gets the value of the sReferenceIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sReferenceIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Reference_Identification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_REF }
     * 
     * 
     */
    public List<S_REF> getS_Reference_Identification() {
        if (sReferenceIdentification == null) {
            sReferenceIdentification = new ArrayList<S_REF>();
        }
        return this.sReferenceIdentification;
    }

    /**
     * Gets the value of the s_Contract_Summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link S_CS }{@code >}
     *     
     */
    public JAXBElement<S_CS> getS_Contract_Summary() {
        return sContractSummary;
    }

    /**
     * Sets the value of the s_Contract_Summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link S_CS }{@code >}
     *     
     */
    public void setS_Contract_Summary(JAXBElement<S_CS> value) {
        this.sContractSummary = ((JAXBElement<S_CS> ) value);
    }

    /**
     * Gets the value of the sPaperwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sPaperwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS_Paperwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S_PWK }
     * 
     * 
     */
    public List<S_PWK> getS_Paperwork() {
        if (sPaperwork == null) {
            sPaperwork = new ArrayList<S_PWK>();
        }
        return this.sPaperwork;
    }

    /**
     * Gets the value of the lCodeSourceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lCodeSourceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Code_Source_Information().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_LM }
     * 
     * 
     */
    public List<L_LM> getL_Code_Source_Information() {
        if (lCodeSourceInformation == null) {
            lCodeSourceInformation = new ArrayList<L_LM>();
        }
        return this.lCodeSourceInformation;
    }

    /**
     * Gets the value of the lTypeOfFinancialAccountingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lTypeOfFinancialAccountingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Type_Of_Financial_Accounting_Data().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_FA1 }
     * 
     * 
     */
    public List<L_FA1> getL_Type_Of_Financial_Accounting_Data() {
        if (lTypeOfFinancialAccountingData == null) {
            lTypeOfFinancialAccountingData = new ArrayList<L_FA1>();
        }
        return this.lTypeOfFinancialAccountingData;
    }

    /**
     * Gets the value of the lNonconformanceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lNonconformanceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Nonconformance_Description().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_NCD }
     * 
     * 
     */
    public List<L_NCD> getL_Nonconformance_Description() {
        if (lNonconformanceDescription == null) {
            lNonconformanceDescription = new ArrayList<L_NCD>();
        }
        return this.lNonconformanceDescription;
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
            return "HL";
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
            return "Hierarchical Level";
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
