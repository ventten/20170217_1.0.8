
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchCustomerWeChatDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCustomerWeChatDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="recivAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rpmntDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="periodPaid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bankCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isOverdue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dayOverdue" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rpmntMoney" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="zeroSpareAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCustomerWeChatDto")
public class SearchCustomerWeChatDto {

    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "loanAmt")
    protected BigDecimal loanAmt;
    @XmlAttribute(name = "period")
    protected Integer period;
    @XmlAttribute(name = "recivAmt")
    protected BigDecimal recivAmt;
    @XmlAttribute(name = "rpmntDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rpmntDate;
    @XmlAttribute(name = "periodPaid")
    protected Integer periodPaid;
    @XmlAttribute(name = "bankCard")
    protected String bankCard;
    @XmlAttribute(name = "isOverdue")
    protected String isOverdue;
    @XmlAttribute(name = "dayOverdue")
    protected Integer dayOverdue;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "rpmntMoney")
    protected BigDecimal rpmntMoney;
    @XmlAttribute(name = "zeroSpareAmt")
    protected BigDecimal zeroSpareAmt;

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
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the loanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    /**
     * Sets the value of the loanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmt(BigDecimal value) {
        this.loanAmt = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    /**
     * Gets the value of the recivAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    /**
     * Sets the value of the recivAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivAmt(BigDecimal value) {
        this.recivAmt = value;
    }

    /**
     * Gets the value of the rpmntDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRpmntDate() {
        return rpmntDate;
    }

    /**
     * Sets the value of the rpmntDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRpmntDate(XMLGregorianCalendar value) {
        this.rpmntDate = value;
    }

    /**
     * Gets the value of the periodPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodPaid() {
        return periodPaid;
    }

    /**
     * Sets the value of the periodPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodPaid(Integer value) {
        this.periodPaid = value;
    }

    /**
     * Gets the value of the bankCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * Sets the value of the bankCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCard(String value) {
        this.bankCard = value;
    }

    /**
     * Gets the value of the isOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOverdue() {
        return isOverdue;
    }

    /**
     * Sets the value of the isOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOverdue(String value) {
        this.isOverdue = value;
    }

    /**
     * Gets the value of the dayOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayOverdue() {
        return dayOverdue;
    }

    /**
     * Sets the value of the dayOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayOverdue(Integer value) {
        this.dayOverdue = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the rpmntMoney property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRpmntMoney() {
        return rpmntMoney;
    }

    /**
     * Sets the value of the rpmntMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRpmntMoney(BigDecimal value) {
        this.rpmntMoney = value;
    }

    /**
     * Gets the value of the zeroSpareAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZeroSpareAmt() {
        return zeroSpareAmt;
    }

    /**
     * Sets the value of the zeroSpareAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZeroSpareAmt(BigDecimal value) {
        this.zeroSpareAmt = value;
    }

}
