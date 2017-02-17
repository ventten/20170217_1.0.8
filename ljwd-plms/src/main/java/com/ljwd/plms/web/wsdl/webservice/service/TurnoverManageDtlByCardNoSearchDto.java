
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for turnoverManageDtlByCardNoSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnoverManageDtlByCardNoSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="turnoverCardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="turnoverMonthWY" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="isCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="interest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="turnoverDetailed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnoverManageDtlByCardNoSearchDto")
public class TurnoverManageDtlByCardNoSearchDto {

    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "turnoverCardno")
    protected String turnoverCardno;
    @XmlAttribute(name = "turnoverTime")
    protected String turnoverTime;
    @XmlAttribute(name = "turnoverMonthWY")
    protected BigDecimal turnoverMonthWY;
    @XmlAttribute(name = "balance")
    protected BigDecimal balance;
    @XmlAttribute(name = "isCalc")
    protected Boolean isCalc;
    @XmlAttribute(name = "interest")
    protected BigDecimal interest;
    @XmlAttribute(name = "turnoverDetailed")
    protected String turnoverDetailed;

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the turnoverCardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverCardno() {
        return turnoverCardno;
    }

    /**
     * Sets the value of the turnoverCardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverCardno(String value) {
        this.turnoverCardno = value;
    }

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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the isCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCalc() {
        return isCalc;
    }

    /**
     * Sets the value of the isCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCalc(Boolean value) {
        this.isCalc = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }

    /**
     * Gets the value of the turnoverDetailed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverDetailed() {
        return turnoverDetailed;
    }

    /**
     * Sets the value of the turnoverDetailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverDetailed(String value) {
        this.turnoverDetailed = value;
    }

}
