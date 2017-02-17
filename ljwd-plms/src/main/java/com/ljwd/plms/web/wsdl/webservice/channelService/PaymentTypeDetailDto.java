
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paymentTypeDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentTypeDetailDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="periodNumberStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyRateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commissionRateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="periodNumberFrom" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="periodNumberTo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="penaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repaymentMethod" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentMethod" />
 *       &lt;attribute name="commissionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentTypeDetailDto", propOrder = {
    "periodNumberStr",
    "effectiveDateStr",
    "interestRateStr",
    "penaltyRateStr",
    "commissionRateStr"
})
public class PaymentTypeDetailDto
    extends BaseVersionableCreatorAwareEntityDto
{

    protected String periodNumberStr;
    protected String effectiveDateStr;
    protected String interestRateStr;
    protected String penaltyRateStr;
    protected String commissionRateStr;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "paymentTypeCode")
    protected String paymentTypeCode;
    @XmlAttribute(name = "effectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "expiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlAttribute(name = "periodNumberFrom")
    protected Integer periodNumberFrom;
    @XmlAttribute(name = "periodNumberTo")
    protected Integer periodNumberTo;
    @XmlAttribute(name = "interestRate")
    protected BigDecimal interestRate;
    @XmlAttribute(name = "penaltyRate")
    protected BigDecimal penaltyRate;
    @XmlAttribute(name = "repaymentMethod")
    protected RepaymentMethod repaymentMethod;
    @XmlAttribute(name = "commissionRate")
    protected BigDecimal commissionRate;
    @XmlAttribute(name = "remark")
    protected String remark;

    /**
     * Gets the value of the periodNumberStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodNumberStr() {
        return periodNumberStr;
    }

    /**
     * Sets the value of the periodNumberStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodNumberStr(String value) {
        this.periodNumberStr = value;
    }

    /**
     * Gets the value of the effectiveDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDateStr() {
        return effectiveDateStr;
    }

    /**
     * Sets the value of the effectiveDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDateStr(String value) {
        this.effectiveDateStr = value;
    }

    /**
     * Gets the value of the interestRateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateStr() {
        return interestRateStr;
    }

    /**
     * Sets the value of the interestRateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestRateStr(String value) {
        this.interestRateStr = value;
    }

    /**
     * Gets the value of the penaltyRateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRateStr() {
        return penaltyRateStr;
    }

    /**
     * Sets the value of the penaltyRateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRateStr(String value) {
        this.penaltyRateStr = value;
    }

    /**
     * Gets the value of the commissionRateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionRateStr() {
        return commissionRateStr;
    }

    /**
     * Sets the value of the commissionRateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionRateStr(String value) {
        this.commissionRateStr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the periodNumberFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodNumberFrom() {
        return periodNumberFrom;
    }

    /**
     * Sets the value of the periodNumberFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodNumberFrom(Integer value) {
        this.periodNumberFrom = value;
    }

    /**
     * Gets the value of the periodNumberTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodNumberTo() {
        return periodNumberTo;
    }

    /**
     * Sets the value of the periodNumberTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodNumberTo(Integer value) {
        this.periodNumberTo = value;
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

}
