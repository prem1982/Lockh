//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.12-01/26/2011 03:39 PM(mockbuild)-ea 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.31 at 03:43:07 PM EDT 
//


package gov.gsa.fas.vision.dla.request.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This Draft Standard for Trial Use contains the format and establishes the data contents of the Nonconformance Report Transaction Set (842) for use within the context of an Electronic Data Interchange (EDI) environment. The transaction set can be used to report products and processes that do not fulfill specifications or requirements.The Nonconformance Report Transaction Set provides the ability for the sender to report the nonconformance at the level of detail that is required. It also provides the ability to report the specific nonconformances of a component/part while identifying the assembly as the product that is in nonconformance. The Nonconformance Report Transaction Set may be used to report, initiate, or request actions related to the nonconformance being reported. Financial and accounting information is provided for reporting purposes only.The Nonconformance Report Transaction Set has the capability to report the cause of the nonconformance and to state the proposed action to be followed to prevent a repetition of the problem.
 * 
 * <p>Java class for T_842 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_842">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Internal_Properties" type="{}Internal_Properties" minOccurs="0"/>
 *         &lt;element name="S_Transaction_Set_Header" type="{}S_ST"/>
 *         &lt;element name="S_Beginning_Segment_For_Nonconformance_Report" type="{}S_BNR"/>
 *         &lt;element name="L_Name" type="{}L_N1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="L_Hierarchical_Level" type="{}L_HL" maxOccurs="unbounded"/>
 *         &lt;element name="S_Transaction_Set_Trailer" type="{}S_SE"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" default="Transaction" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" default="842" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" default="Nonconformance Report" />
 *       &lt;attribute name="XDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0" />
 *       &lt;attribute name="Standard" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="X12" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" default="V4030" />
 *       &lt;attribute name="GUID" type="{}GUID" />
 *       &lt;attribute name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_842", propOrder = {
    "internalProperties",
    "sTransactionSetHeader",
    "sBeginningSegmentForNonconformanceReport",
    "lName",
    "lHierarchicalLevel",
    "sTransactionSetTrailer"
})
public class T_842 {

    @XmlElement(name = "Internal_Properties")
    protected Internal_Properties internalProperties;
    @XmlElement(name = "S_Transaction_Set_Header", required = true)
    protected S_ST sTransactionSetHeader;
    @XmlElement(name = "S_Beginning_Segment_For_Nonconformance_Report", required = true)
    protected S_BNR sBeginningSegmentForNonconformanceReport;
    @XmlElement(name = "L_Name", nillable = true)
    protected List<L_N1> lName;
    @XmlElement(name = "L_Hierarchical_Level", required = true)
    protected List<L_HL> lHierarchicalLevel;
    @XmlElement(name = "S_Transaction_Set_Trailer", required = true)
    protected S_SE sTransactionSetTrailer;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "XDataVersion")
    protected String xDataVersion;
    @XmlAttribute(name = "Standard", required = true)
    protected String standard;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "GUID")
    protected String guid;
    @XmlAttribute(name = "CreatedBy")
    protected String createdBy;
    @XmlAttribute(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;

    /**
     * Gets the value of the internal_Properties property.
     * 
     * @return
     *     possible object is
     *     {@link Internal_Properties }
     *     
     */
    public Internal_Properties getInternal_Properties() {
        return internalProperties;
    }

    /**
     * Sets the value of the internal_Properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Internal_Properties }
     *     
     */
    public void setInternal_Properties(Internal_Properties value) {
        this.internalProperties = value;
    }

    /**
     * Gets the value of the s_Transaction_Set_Header property.
     * 
     * @return
     *     possible object is
     *     {@link S_ST }
     *     
     */
    public S_ST getS_Transaction_Set_Header() {
        return sTransactionSetHeader;
    }

    /**
     * Sets the value of the s_Transaction_Set_Header property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_ST }
     *     
     */
    public void setS_Transaction_Set_Header(S_ST value) {
        this.sTransactionSetHeader = value;
    }

    /**
     * Gets the value of the s_Beginning_Segment_For_Nonconformance_Report property.
     * 
     * @return
     *     possible object is
     *     {@link S_BNR }
     *     
     */
    public S_BNR getS_Beginning_Segment_For_Nonconformance_Report() {
        return sBeginningSegmentForNonconformanceReport;
    }

    /**
     * Sets the value of the s_Beginning_Segment_For_Nonconformance_Report property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_BNR }
     *     
     */
    public void setS_Beginning_Segment_For_Nonconformance_Report(S_BNR value) {
        this.sBeginningSegmentForNonconformanceReport = value;
    }

    /**
     * Gets the value of the lName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Name().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_N1 }
     * 
     * 
     */
    public List<L_N1> getL_Name() {
        if (lName == null) {
            lName = new ArrayList<L_N1>();
        }
        return this.lName;
    }

    /**
     * Gets the value of the lHierarchicalLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lHierarchicalLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getL_Hierarchical_Level().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link L_HL }
     * 
     * 
     */
    public List<L_HL> getL_Hierarchical_Level() {
        if (lHierarchicalLevel == null) {
            lHierarchicalLevel = new ArrayList<L_HL>();
        }
        return this.lHierarchicalLevel;
    }

    /**
     * Gets the value of the s_Transaction_Set_Trailer property.
     * 
     * @return
     *     possible object is
     *     {@link S_SE }
     *     
     */
    public S_SE getS_Transaction_Set_Trailer() {
        return sTransactionSetTrailer;
    }

    /**
     * Sets the value of the s_Transaction_Set_Trailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link S_SE }
     *     
     */
    public void setS_Transaction_Set_Trailer(S_SE value) {
        this.sTransactionSetTrailer = value;
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
            return "Transaction";
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
            return "842";
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
            return "Nonconformance Report";
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

    /**
     * Gets the value of the xDataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXDataVersion() {
        if (xDataVersion == null) {
            return "2.0";
        } else {
            return xDataVersion;
        }
    }

    /**
     * Sets the value of the xDataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXDataVersion(String value) {
        this.xDataVersion = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard() {
        if (standard == null) {
            return "X12";
        } else {
            return standard;
        }
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard(String value) {
        this.standard = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "V4030";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

}