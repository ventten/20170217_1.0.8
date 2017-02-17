
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchCustomerPayingWeChatDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchCustomerPayingWeChatDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payBankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payBankAc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="recivAmt1" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="recivAmt2" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="settleDay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salesUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchCustomerPayingWeChatDto")
public class SearchCustomerPayingWeChatDto {

    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "loanAmt")
    protected BigDecimal loanAmt;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "payBankName")
    protected String payBankName;
    @XmlAttribute(name = "payBankAc")
    protected String payBankAc;
    @XmlAttribute(name = "period")
    protected Integer period;
    @XmlAttribute(name = "recivAmt1")
    protected BigDecimal recivAmt1;
    @XmlAttribute(name = "recivAmt2")
    protected BigDecimal recivAmt2;
    @XmlAttribute(name = "settleDay")
    protected String settleDay;
    @XmlAttribute(name = "bankName")
    protected String bankName;
    @XmlAttribute(name = "bankAc")
    protected String bankAc;
    @XmlAttribute(name = "signUser")
    protected String signUser;
    @XmlAttribute(name = "salesUser")
    protected String salesUser;
    @XmlAttribute(name = "siteName")
    protected String siteName;

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
     * Gets the value of the payBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBankName() {
        return payBankName;
    }

    /**
     * Sets the value of the payBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBankName(String value) {
        this.payBankName = value;
    }

    /**
     * Gets the value of the payBankAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBankAc() {
        return payBankAc;
    }

    /**
     * Sets the value of the payBankAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBankAc(String value) {
        this.payBankAc = value;
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
     * Gets the value of the recivAmt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivAmt1() {
        return recivAmt1;
    }

    /**
     * Sets the value of the recivAmt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivAmt1(BigDecimal value) {
        this.recivAmt1 = value;
    }

    /**
     * Gets the value of the recivAmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecivAmt2() {
        return recivAmt2;
    }

    /**
     * Sets the value of the recivAmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecivAmt2(BigDecimal value) {
        this.recivAmt2 = value;
    }

    /**
     * Gets the value of the settleDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleDay() {
        return settleDay;
    }

    /**
     * Sets the value of the settleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleDay(String value) {
        this.settleDay = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAc() {
        return bankAc;
    }

    /**
     * Sets the value of the bankAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAc(String value) {
        this.bankAc = value;
    }

    /**
     * Gets the value of the signUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignUser() {
        return signUser;
    }

    /**
     * Sets the value of the signUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignUser(String value) {
        this.signUser = value;
    }

    /**
     * Gets the value of the salesUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUser() {
        return salesUser;
    }

    /**
     * Sets the value of the salesUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUser(String value) {
        this.salesUser = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

}
