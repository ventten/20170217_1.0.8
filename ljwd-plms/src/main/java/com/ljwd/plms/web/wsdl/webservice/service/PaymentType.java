
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="adjustFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adjustInterestDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adjustPrincipalDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="calcExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calcRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calculatingInterestType" type="{http://webservice.loan.mfbms.flinkmf.com/}calculatingInterestType" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commissionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="decimalPlace" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="feeRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="feeRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSelf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="paymentTypeDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentTypeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="penaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repaymentMethod" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentMethod" minOccurs="0"/>
 *         &lt;element name="roundingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="settleDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentType", propOrder = {
    "adjustFee",
    "adjustInterestDecimal",
    "adjustPrincipalDecimal",
    "baseDays",
    "calcExpression",
    "calcRemark",
    "calculatingInterestType",
    "code",
    "commissionRate",
    "decimalPlace",
    "feeRate1",
    "feeRate2",
    "interestRate",
    "isActive",
    "isExternal",
    "isSelf",
    "paymentTypeDetails",
    "penaltyRate",
    "remark",
    "repaymentMethod",
    "roundingMode",
    "sequence",
    "settleDay",
    "typeName"
})
public class PaymentType
    extends BaseVersionableCreatorAwareEntity
{

    protected Boolean adjustFee;
    protected Boolean adjustInterestDecimal;
    protected Boolean adjustPrincipalDecimal;
    protected Integer baseDays;
    protected String calcExpression;
    protected String calcRemark;
    protected CalculatingInterestType calculatingInterestType;
    protected String code;
    protected BigDecimal commissionRate;
    protected Integer decimalPlace;
    protected BigDecimal feeRate1;
    protected BigDecimal feeRate2;
    protected BigDecimal interestRate;
    protected Boolean isActive;
    protected Boolean isExternal;
    protected Boolean isSelf;
    @XmlElement(nillable = true)
    protected List<PaymentTypeDetail> paymentTypeDetails;
    protected BigDecimal penaltyRate;
    protected String remark;
    protected RepaymentMethod repaymentMethod;
    protected String roundingMode;
    protected Integer sequence;
    protected Integer settleDay;
    protected String typeName;

    /**
     * Gets the value of the adjustFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustFee() {
        return adjustFee;
    }

    /**
     * Sets the value of the adjustFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustFee(Boolean value) {
        this.adjustFee = value;
    }

    /**
     * Gets the value of the adjustInterestDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustInterestDecimal() {
        return adjustInterestDecimal;
    }

    /**
     * Sets the value of the adjustInterestDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustInterestDecimal(Boolean value) {
        this.adjustInterestDecimal = value;
    }

    /**
     * Gets the value of the adjustPrincipalDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustPrincipalDecimal() {
        return adjustPrincipalDecimal;
    }

    /**
     * Sets the value of the adjustPrincipalDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustPrincipalDecimal(Boolean value) {
        this.adjustPrincipalDecimal = value;
    }

    /**
     * Gets the value of the baseDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseDays() {
        return baseDays;
    }

    /**
     * Sets the value of the baseDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseDays(Integer value) {
        this.baseDays = value;
    }

    /**
     * Gets the value of the calcExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcExpression() {
        return calcExpression;
    }

    /**
     * Sets the value of the calcExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcExpression(String value) {
        this.calcExpression = value;
    }

    /**
     * Gets the value of the calcRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcRemark() {
        return calcRemark;
    }

    /**
     * Sets the value of the calcRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcRemark(String value) {
        this.calcRemark = value;
    }

    /**
     * Gets the value of the calculatingInterestType property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatingInterestType }
     *     
     */
    public CalculatingInterestType getCalculatingInterestType() {
        return calculatingInterestType;
    }

    /**
     * Sets the value of the calculatingInterestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatingInterestType }
     *     
     */
    public void setCalculatingInterestType(CalculatingInterestType value) {
        this.calculatingInterestType = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the commissionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    /**
     * Sets the value of the commissionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionRate(BigDecimal value) {
        this.commissionRate = value;
    }

    /**
     * Gets the value of the decimalPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlace() {
        return decimalPlace;
    }

    /**
     * Sets the value of the decimalPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlace(Integer value) {
        this.decimalPlace = value;
    }

    /**
     * Gets the value of the feeRate1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeRate1() {
        return feeRate1;
    }

    /**
     * Sets the value of the feeRate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeRate1(BigDecimal value) {
        this.feeRate1 = value;
    }

    /**
     * Gets the value of the feeRate2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeRate2() {
        return feeRate2;
    }

    /**
     * Sets the value of the feeRate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeRate2(BigDecimal value) {
        this.feeRate2 = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isExternal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Sets the value of the isExternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }

    /**
     * Gets the value of the isSelf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelf() {
        return isSelf;
    }

    /**
     * Sets the value of the isSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelf(Boolean value) {
        this.isSelf = value;
    }

    /**
     * Gets the value of the paymentTypeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTypeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTypeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTypeDetail }
     * 
     * 
     */
    public List<PaymentTypeDetail> getPaymentTypeDetails() {
        if (paymentTypeDetails == null) {
            paymentTypeDetails = new ArrayList<PaymentTypeDetail>();
        }
        return this.paymentTypeDetails;
    }

    /**
     * Gets the value of the penaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    /**
     * Sets the value of the penaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyRate(BigDecimal value) {
        this.penaltyRate = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the repaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentMethod }
     *     
     */
    public RepaymentMethod getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     * Sets the value of the repaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentMethod }
     *     
     */
    public void setRepaymentMethod(RepaymentMethod value) {
        this.repaymentMethod = value;
    }

    /**
     * Gets the value of the roundingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundingMode() {
        return roundingMode;
    }

    /**
     * Sets the value of the roundingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundingMode(String value) {
        this.roundingMode = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the settleDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSettleDay() {
        return settleDay;
    }

    /**
     * Sets the value of the settleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSettleDay(Integer value) {
        this.settleDay = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

}
