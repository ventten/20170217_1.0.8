
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for moonlightApplicationInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moonlightApplicationInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="externalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headBankSymbol" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headBankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankBranchNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitTel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactorMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactorRelationship" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="socialSecurity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="site" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salesUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleSite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="businessCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="feeMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moonlightApplicationInfoDto")
public class MoonlightApplicationInfoDto {

    @XmlAttribute(name = "externalCode")
    protected String externalCode;
    @XmlAttribute(name = "productNo")
    protected String productNo;
    @XmlAttribute(name = "headBankSymbol")
    protected String headBankSymbol;
    @XmlAttribute(name = "headBankCode")
    protected String headBankCode;
    @XmlAttribute(name = "bankBranchNo")
    protected String bankBranchNo;
    @XmlAttribute(name = "bankAccount")
    protected String bankAccount;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "mailAddress")
    protected String mailAddress;
    @XmlAttribute(name = "unitName")
    protected String unitName;
    @XmlAttribute(name = "unitTel")
    protected String unitTel;
    @XmlAttribute(name = "contactorName")
    protected String contactorName;
    @XmlAttribute(name = "contactorMobilePhone")
    protected String contactorMobilePhone;
    @XmlAttribute(name = "contactorRelationship")
    protected String contactorRelationship;
    @XmlAttribute(name = "socialSecurity")
    protected String socialSecurity;
    @XmlAttribute(name = "creditCardNo")
    protected String creditCardNo;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "site")
    protected String site;
    @XmlAttribute(name = "salesUser")
    protected String salesUser;
    @XmlAttribute(name = "handleSite")
    protected String handleSite;
    @XmlAttribute(name = "businessCategory")
    protected String businessCategory;
    @XmlAttribute(name = "feeMode")
    protected String feeMode;
    @XmlAttribute(name = "applicationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    @XmlAttribute(name = "loanDays")
    protected Integer loanDays;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "loanEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanEndDate;

    /**
     * Gets the value of the externalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * Sets the value of the externalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCode(String value) {
        this.externalCode = value;
    }

    /**
     * Gets the value of the productNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * Sets the value of the productNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNo(String value) {
        this.productNo = value;
    }

    /**
     * Gets the value of the headBankSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadBankSymbol() {
        return headBankSymbol;
    }

    /**
     * Sets the value of the headBankSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadBankSymbol(String value) {
        this.headBankSymbol = value;
    }

    /**
     * Gets the value of the headBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadBankCode() {
        return headBankCode;
    }

    /**
     * Sets the value of the headBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadBankCode(String value) {
        this.headBankCode = value;
    }

    /**
     * Gets the value of the bankBranchNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchNo() {
        return bankBranchNo;
    }

    /**
     * Sets the value of the bankBranchNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchNo(String value) {
        this.bankBranchNo = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress(String value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the unitTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTel() {
        return unitTel;
    }

    /**
     * Sets the value of the unitTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTel(String value) {
        this.unitTel = value;
    }

    /**
     * Gets the value of the contactorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactorName() {
        return contactorName;
    }

    /**
     * Sets the value of the contactorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactorName(String value) {
        this.contactorName = value;
    }

    /**
     * Gets the value of the contactorMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactorMobilePhone() {
        return contactorMobilePhone;
    }

    /**
     * Sets the value of the contactorMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactorMobilePhone(String value) {
        this.contactorMobilePhone = value;
    }

    /**
     * Gets the value of the contactorRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactorRelationship() {
        return contactorRelationship;
    }

    /**
     * Sets the value of the contactorRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactorRelationship(String value) {
        this.contactorRelationship = value;
    }

    /**
     * Gets the value of the socialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurity() {
        return socialSecurity;
    }

    /**
     * Sets the value of the socialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurity(String value) {
        this.socialSecurity = value;
    }

    /**
     * Gets the value of the creditCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * Sets the value of the creditCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNo(String value) {
        this.creditCardNo = value;
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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
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
     * Gets the value of the handleSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleSite() {
        return handleSite;
    }

    /**
     * Sets the value of the handleSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleSite(String value) {
        this.handleSite = value;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCategory(String value) {
        this.businessCategory = value;
    }

    /**
     * Gets the value of the feeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeMode() {
        return feeMode;
    }

    /**
     * Sets the value of the feeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeMode(String value) {
        this.feeMode = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the loanDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanDays() {
        return loanDays;
    }

    /**
     * Sets the value of the loanDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanDays(Integer value) {
        this.loanDays = value;
    }

    /**
     * Gets the value of the loanPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    /**
     * Sets the value of the loanPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanPeriod(Integer value) {
        this.loanPeriod = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmount(BigDecimal value) {
        this.loanAmount = value;
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
     * Gets the value of the loanEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanEndDate() {
        return loanEndDate;
    }

    /**
     * Sets the value of the loanEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanEndDate(XMLGregorianCalendar value) {
        this.loanEndDate = value;
    }

}
