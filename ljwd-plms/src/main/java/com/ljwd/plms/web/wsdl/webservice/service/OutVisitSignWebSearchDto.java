
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVisitSignWebSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitSignWebSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="signStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="counts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitSignWebSearchDto")
public class OutVisitSignWebSearchDto {

    @XmlAttribute(name = "signStatus")
    protected String signStatus;
    @XmlAttribute(name = "counts")
    protected Long counts;

    /**
     * Gets the value of the signStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * Sets the value of the signStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignStatus(String value) {
        this.signStatus = value;
    }

    /**
     * Gets the value of the counts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCounts() {
        return counts;
    }

    /**
     * Sets the value of the counts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCounts(Long value) {
        this.counts = value;
    }

}
