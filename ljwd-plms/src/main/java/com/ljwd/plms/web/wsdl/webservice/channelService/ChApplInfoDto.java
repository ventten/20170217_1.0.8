
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chApplInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chApplInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://webservice.loan.mfbms.flinkmf.com/}customerDto" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salesUserId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="employeeNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="productNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanType" type="{http://webservice.loan.mfbms.flinkmf.com/}loanType" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="feeMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="situation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditAuzMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chApplInfoDto", propOrder = {
    "customer"
})
public class ChApplInfoDto {

    protected CustomerDto customer;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applicationCode")
    protected String applicationCode;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "handleSiteCode")
    protected String handleSiteCode;
    @XmlAttribute(name = "salesUserId")
    protected String salesUserId;
    @XmlAttribute(name = "employeeNo")
    protected String employeeNo;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "productNo")
    protected String productNo;
    @XmlAttribute(name = "applicationAmount")
    protected BigDecimal applicationAmount;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "loanPurpose")
    protected String loanPurpose;
    @XmlAttribute(name = "customerSource")
    protected String customerSource;
    @XmlAttribute(name = "applicationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    @XmlAttribute(name = "loanType")
    protected LoanType loanType;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "feeMode")
    protected String feeMode;
    @XmlAttribute(name = "situation")
    protected String situation;
    @XmlAttribute(name = "creditAuzMode")
    protected String creditAuzMode;
    @XmlAttribute(name = "channel")
    protected String channel;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDto }
     *     
     */
    public CustomerDto getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDto }
     *     
     */
    public void setCustomer(CustomerDto value) {
        this.customer = value;
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
     * Gets the value of the applicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * Sets the value of the applicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCode(String value) {
        this.applicationCode = value;
    }

    /**
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the handleSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleSiteCode() {
        return handleSiteCode;
    }

    /**
     * Sets the value of the handleSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleSiteCode(String value) {
        this.handleSiteCode = value;
    }

    /**
     * Gets the value of the salesUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUserId() {
        return salesUserId;
    }

    /**
     * Sets the value of the salesUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUserId(String value) {
        this.salesUserId = value;
    }

    /**
     * Gets the value of the employeeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNo() {
        return employeeNo;
    }

    /**
     * Sets the value of the employeeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNo(String value) {
        this.employeeNo = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
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
     * Gets the value of the applicationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApplicationAmount() {
        return applicationAmount;
    }

    /**
     * Sets the value of the applicationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApplicationAmount(BigDecimal value) {
        this.applicationAmount = value;
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
     * Gets the value of the loanPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Sets the value of the loanPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
    }

    /**
     * Gets the value of the customerSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSource() {
        return customerSource;
    }

    /**
     * Sets the value of the customerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSource(String value) {
        this.customerSource = value;
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
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link LoanType }
     *     
     */
    public LoanType getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanType }
     *     
     */
    public void setLoanType(LoanType value) {
        this.loanType = value;
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
     * Gets the value of the situation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituation() {
        return situation;
    }

    /**
     * Sets the value of the situation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituation(String value) {
        this.situation = value;
    }

    /**
     * Gets the value of the creditAuzMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuzMode() {
        return creditAuzMode;
    }

    /**
     * Sets the value of the creditAuzMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuzMode(String value) {
        this.creditAuzMode = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

}
