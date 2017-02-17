
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentTypeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentTypeDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settleDayStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeRate1Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeRate2Str" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calcExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calcRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTypeDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentTypeDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isExternal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isActive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adjustFee" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isSelf" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="feeRate1" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="feeRate2" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="settleDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="calculatingInterestType" type="{http://webservice.loan.mfbms.flinkmf.com/}calculatingInterestType" />
 *       &lt;attribute name="decimalPlace" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="baseDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roundingMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="adjustInterestDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adjustPrincipalDecimal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentTypeDto", propOrder = {
    "remark",
    "settleDayStr",
    "feeRate1Str",
    "feeRate2Str",
    "calcExpression",
    "calcRemark",
    "paymentTypeDetails"
})
public class PaymentTypeDto
    extends BaseVersionableCreatorAwareEntityDto
{

    protected String remark;
    protected String settleDayStr;
    protected String feeRate1Str;
    protected String feeRate2Str;
    protected String calcExpression;
    protected String calcRemark;
    @XmlElement(nillable = true)
    protected List<PaymentTypeDetailDto> paymentTypeDetails;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "typeName")
    protected String typeName;
    @XmlAttribute(name = "sequence", required = true)
    protected int sequence;
    @XmlAttribute(name = "isExternal", required = true)
    protected boolean isExternal;
    @XmlAttribute(name = "isActive", required = true)
    protected boolean isActive;
    @XmlAttribute(name = "adjustFee", required = true)
    protected boolean adjustFee;
    @XmlAttribute(name = "isSelf", required = true)
    protected boolean isSelf;
    @XmlAttribute(name = "feeRate1")
    protected BigDecimal feeRate1;
    @XmlAttribute(name = "feeRate2")
    protected BigDecimal feeRate2;
    @XmlAttribute(name = "settleDay")
    protected Integer settleDay;
    @XmlAttribute(name = "calculatingInterestType")
    protected CalculatingInterestType calculatingInterestType;
    @XmlAttribute(name = "decimalPlace")
    protected Integer decimalPlace;
    @XmlAttribute(name = "baseDays")
    protected Integer baseDays;
    @XmlAttribute(name = "roundingMode")
    protected String roundingMode;
    @XmlAttribute(name = "adjustInterestDecimal")
    protected Boolean adjustInterestDecimal;
    @XmlAttribute(name = "adjustPrincipalDecimal")
    protected Boolean adjustPrincipalDecimal;

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
     * Gets the value of the settleDayStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleDayStr() {
        return settleDayStr;
    }

    /**
     * Sets the value of the settleDayStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleDayStr(String value) {
        this.settleDayStr = value;
    }

    /**
     * Gets the value of the feeRate1Str property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRate1Str() {
        return feeRate1Str;
    }

    /**
     * Sets the value of the feeRate1Str property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRate1Str(String value) {
        this.feeRate1Str = value;
    }

    /**
     * Gets the value of the feeRate2Str property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRate2Str() {
        return feeRate2Str;
    }

    /**
     * Sets the value of the feeRate2Str property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRate2Str(String value) {
        this.feeRate2Str = value;
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
     * {@link PaymentTypeDetailDto }
     * 
     * 
     */
    public List<PaymentTypeDetailDto> getPaymentTypeDetails() {
        if (paymentTypeDetails == null) {
            paymentTypeDetails = new ArrayList<PaymentTypeDetailDto>();
        }
        return this.paymentTypeDetails;
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

    /**
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the isExternal property.
     * 
     */
    public boolean isIsExternal() {
        return isExternal;
    }

    /**
     * Sets the value of the isExternal property.
     * 
     */
    public void setIsExternal(boolean value) {
        this.isExternal = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the adjustFee property.
     * 
     */
    public boolean isAdjustFee() {
        return adjustFee;
    }

    /**
     * Sets the value of the adjustFee property.
     * 
     */
    public void setAdjustFee(boolean value) {
        this.adjustFee = value;
    }

    /**
     * Gets the value of the isSelf property.
     * 
     */
    public boolean isIsSelf() {
        return isSelf;
    }

    /**
     * Sets the value of the isSelf property.
     * 
     */
    public void setIsSelf(boolean value) {
        this.isSelf = value;
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

}
