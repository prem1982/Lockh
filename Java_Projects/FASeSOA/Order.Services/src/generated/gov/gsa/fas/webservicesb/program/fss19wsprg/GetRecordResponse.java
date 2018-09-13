
package gov.gsa.fas.webservicesb.program.fss19wsprg;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mcpElapsed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="output_rec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mcpElapsed",
    "outputRec"
})
@XmlRootElement(name = "get_recordResponse")
public class GetRecordResponse {

    @XmlElement(required = true)
    protected BigInteger mcpElapsed;
    @XmlElement(name = "output_rec", required = true)
    protected String outputRec;

    /**
     * Gets the value of the mcpElapsed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMcpElapsed() {
        return mcpElapsed;
    }

    /**
     * Sets the value of the mcpElapsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMcpElapsed(BigInteger value) {
        this.mcpElapsed = value;
    }

    /**
     * Gets the value of the outputRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputRec() {
        return outputRec;
    }

    /**
     * Sets the value of the outputRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputRec(String value) {
        this.outputRec = value;
    }

}
