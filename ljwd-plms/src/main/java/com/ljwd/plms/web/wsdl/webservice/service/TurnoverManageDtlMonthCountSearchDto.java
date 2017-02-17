
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for turnoverManageDtlMonthCountSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageDtlMonthCountSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="turnoverTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverMonthWY" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="abstracts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageDtlMonthCountSearchDto")
public class TurnoverManageDtlMonthCountSearchDto {

    @XmlAttribute(name = "turnoverTime")
    protected String turnoverTime;
    @XmlAttribute(name = "turnoverMonthWY")
    protected BigDecimal turnoverMonthWY;
    @XmlAttribute(name = "abstracts")
    protected String abstracts;
    @XmlAttribute(name = "peer")
    protected String peer;

    /**
     * Gets the value of the turnoverTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverTime() {
        return turnoverTime;
    }

    /**
     * Sets the value of the turnoverTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverTime(String value) {
        this.turnoverTime = value;
    }

    /**
     * Gets the value of the turnoverMonthWY property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverMonthWY() {
        return turnoverMonthWY;
    }

    /**
     * Sets the value of the turnoverMonthWY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverMonthWY(BigDecimal value) {
        this.turnoverMonthWY = value;
    }

    /**
     * Gets the value of the abstracts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstracts() {
        return abstracts;
    }

    /**
     * Sets the value of the abstracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstracts(String value) {
        this.abstracts = value;
    }

    /**
     * Gets the value of the peer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeer() {
        return peer;
    }

    /**
     * Sets the value of the peer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeer(String value) {
        this.peer = value;
    }

}
