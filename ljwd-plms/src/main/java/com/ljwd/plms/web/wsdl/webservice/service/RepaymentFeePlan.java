
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repaymentFeePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repaymentFeePlan">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="adjust" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ledgerType" type="{http://webservice.loan.mfbms.flinkmf.com/}ledgerType" minOccurs="0"/>
 *         &lt;element name="ledgerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="repaymentPlan" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentPlan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repaymentFeePlan", propOrder = {
    "adjust",
    "amount",
    "ledgerType",
    "ledgerTypeCode",
    "rate",
    "repaymentPlan"
})
public class RepaymentFeePlan
    extends BaseVersionableCreatorAwareEntity
{

    protected BigDecimal adjust;
    protected BigDecimal amount;
    protected LedgerType ledgerType;
    protected String ledgerTypeCode;
    protected BigDecimal rate;
    protected RepaymentPlan repaymentPlan;

    /**
     * Gets the value of the adjust property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjust() {
        return adjust;
    }

    /**
     * Sets the value of the adjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjust(BigDecimal value) {
        this.adjust = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the ledgerType property.
     * 
     * @return
     *     possible object is
     *     {@link LedgerType }
     *     
     */
    public LedgerType getLedgerType() {
        return ledgerType;
    }

    /**
     * Sets the value of the ledgerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LedgerType }
     *     
     */
    public void setLedgerType(LedgerType value) {
        this.ledgerType = value;
    }

    /**
     * Gets the value of the ledgerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerTypeCode() {
        return ledgerTypeCode;
    }

    /**
     * Sets the value of the ledgerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerTypeCode(String value) {
        this.ledgerTypeCode = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the repaymentPlan property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentPlan }
     *     
     */
    public RepaymentPlan getRepaymentPlan() {
        return repaymentPlan;
    }

    /**
     * Sets the value of the repaymentPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentPlan }
     *     
     */
    public void setRepaymentPlan(RepaymentPlan value) {
        this.repaymentPlan = value;
    }

}
