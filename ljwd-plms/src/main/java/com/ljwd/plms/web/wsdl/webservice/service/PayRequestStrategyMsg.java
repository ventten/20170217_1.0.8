
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payRequestStrategyMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payRequestStrategyMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="parameter1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strategyCode" type="{http://webservice.loan.mfbms.flinkmf.com/}payRequestStrategyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payRequestStrategyMsg", propOrder = {
    "maxTimes",
    "minAmount",
    "parameter1",
    "parameter2",
    "parameter3",
    "parameter4",
    "parameter5",
    "parameter6",
    "parameter7",
    "strategyCode"
})
public class PayRequestStrategyMsg {

    protected Integer maxTimes;
    protected BigDecimal minAmount;
    protected String parameter1;
    protected String parameter2;
    protected String parameter3;
    protected String parameter4;
    protected String parameter5;
    protected String parameter6;
    protected String parameter7;
    protected PayRequestStrategyType strategyCode;

    /**
     * Gets the value of the maxTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTimes() {
        return maxTimes;
    }

    /**
     * Sets the value of the maxTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTimes(Integer value) {
        this.maxTimes = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmount(BigDecimal value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the parameter1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter1() {
        return parameter1;
    }

    /**
     * Sets the value of the parameter1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter1(String value) {
        this.parameter1 = value;
    }

    /**
     * Gets the value of the parameter2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter2() {
        return parameter2;
    }

    /**
     * Sets the value of the parameter2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter2(String value) {
        this.parameter2 = value;
    }

    /**
     * Gets the value of the parameter3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter3() {
        return parameter3;
    }

    /**
     * Sets the value of the parameter3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter3(String value) {
        this.parameter3 = value;
    }

    /**
     * Gets the value of the parameter4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter4() {
        return parameter4;
    }

    /**
     * Sets the value of the parameter4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter4(String value) {
        this.parameter4 = value;
    }

    /**
     * Gets the value of the parameter5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter5() {
        return parameter5;
    }

    /**
     * Sets the value of the parameter5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter5(String value) {
        this.parameter5 = value;
    }

    /**
     * Gets the value of the parameter6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter6() {
        return parameter6;
    }

    /**
     * Sets the value of the parameter6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter6(String value) {
        this.parameter6 = value;
    }

    /**
     * Gets the value of the parameter7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter7() {
        return parameter7;
    }

    /**
     * Sets the value of the parameter7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter7(String value) {
        this.parameter7 = value;
    }

    /**
     * Gets the value of the strategyCode property.
     * 
     * @return
     *     possible object is
     *     {@link PayRequestStrategyType }
     *     
     */
    public PayRequestStrategyType getStrategyCode() {
        return strategyCode;
    }

    /**
     * Sets the value of the strategyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRequestStrategyType }
     *     
     */
    public void setStrategyCode(PayRequestStrategyType value) {
        this.strategyCode = value;
    }

}
