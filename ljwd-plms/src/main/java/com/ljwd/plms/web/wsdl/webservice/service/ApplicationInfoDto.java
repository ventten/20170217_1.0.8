
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="applicationLedgers" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationLedgerDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customers" type="{http://webservice.loan.mfbms.flinkmf.com/}customerDto" minOccurs="0"/>
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleInfoSearchDto" minOccurs="0"/>
 *         &lt;element name="siteRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="wfid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="empid" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="productNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="loanType" type="{http://webservice.loan.mfbms.flinkmf.com/}loanType" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="situation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="inputtedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="renewPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="renewApplId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chargeSchemaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="isJxlFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="salesOrgId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="feeMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="businessCategory" type="{http://webservice.loan.mfbms.flinkmf.com/}businessCategory" />
 *       &lt;attribute name="custAttributionId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="adjustRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="externalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditAuzMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditAuzStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditAuzStatus2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoDto", propOrder = {
    "applicationLedgers",
    "customers",
    "subStatus",
    "vehicleInfos",
    "siteRemark"
})
public class ApplicationInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<ApplicationLedgerDto> applicationLedgers;
    protected CustomerDto customers;
    protected String subStatus;
    protected VehicleInfoSearchDto vehicleInfos;
    protected String siteRemark;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "wfid")
    protected Long wfid;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "handleSiteCode")
    protected String handleSiteCode;
    @XmlAttribute(name = "inputSiteCode")
    protected String inputSiteCode;
    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "empid", required = true)
    protected long empid;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "productNo")
    protected String productNo;
    @XmlAttribute(name = "applicationCode")
    protected String applicationCode;
    @XmlAttribute(name = "applicationAmount")
    protected BigDecimal applicationAmount;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "loanPurpose")
    protected String loanPurpose;
    @XmlAttribute(name = "customerSource")
    protected String customerSource;
    @XmlAttribute(name = "applicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;
    @XmlAttribute(name = "loanType")
    protected LoanType loanType;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "situation")
    protected String situation;
    @XmlAttribute(name = "interestRate")
    protected BigDecimal interestRate;
    @XmlAttribute(name = "inputtedBy")
    protected String inputtedBy;
    @XmlAttribute(name = "renewPenaltyRate")
    protected BigDecimal renewPenaltyRate;
    @XmlAttribute(name = "renewApplId")
    protected Long renewApplId;
    @XmlAttribute(name = "channel")
    protected String channel;
    @XmlAttribute(name = "chargeSchemaId")
    protected Long chargeSchemaId;
    @XmlAttribute(name = "isJxlFlag")
    protected Boolean isJxlFlag;
    @XmlAttribute(name = "salesOrgId")
    protected Long salesOrgId;
    @XmlAttribute(name = "feeMode")
    protected String feeMode;
    @XmlAttribute(name = "businessCategory")
    protected BusinessCategory businessCategory;
    @XmlAttribute(name = "custAttributionId")
    protected Long custAttributionId;
    @XmlAttribute(name = "loanDay")
    protected Integer loanDay;
    @XmlAttribute(name = "adjustRepaymentDate")
    protected Boolean adjustRepaymentDate;
    @XmlAttribute(name = "externalCode")
    protected String externalCode;
    @XmlAttribute(name = "creditAuzMode")
    protected String creditAuzMode;
    @XmlAttribute(name = "creditAuzStatus")
    protected String creditAuzStatus;
    @XmlAttribute(name = "creditAuzStatus2")
    protected String creditAuzStatus2;

    /**
     * Gets the value of the applicationLedgers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationLedgers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationLedgers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationLedgerDto }
     * 
     * 
     */
    public List<ApplicationLedgerDto> getApplicationLedgers() {
        if (applicationLedgers == null) {
            applicationLedgers = new ArrayList<ApplicationLedgerDto>();
        }
        return this.applicationLedgers;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDto }
     *     
     */
    public CustomerDto getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDto }
     *     
     */
    public void setCustomers(CustomerDto value) {
        this.customers = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the vehicleInfos property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInfoSearchDto }
     *     
     */
    public VehicleInfoSearchDto getVehicleInfos() {
        return vehicleInfos;
    }

    /**
     * Sets the value of the vehicleInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInfoSearchDto }
     *     
     */
    public void setVehicleInfos(VehicleInfoSearchDto value) {
        this.vehicleInfos = value;
    }

    /**
     * Gets the value of the siteRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteRemark() {
        return siteRemark;
    }

    /**
     * Sets the value of the siteRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteRemark(String value) {
        this.siteRemark = value;
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
     * Gets the value of the wfid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWfid() {
        return wfid;
    }

    /**
     * Sets the value of the wfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWfid(Long value) {
        this.wfid = value;
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
     * Gets the value of the inputSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputSiteCode() {
        return inputSiteCode;
    }

    /**
     * Sets the value of the inputSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputSiteCode(String value) {
        this.inputSiteCode = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the empid property.
     * 
     */
    public long getEmpid() {
        return empid;
    }

    /**
     * Sets the value of the empid property.
     * 
     */
    public void setEmpid(long value) {
        this.empid = value;
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
     * Gets the value of the inputtedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtedBy() {
        return inputtedBy;
    }

    /**
     * Sets the value of the inputtedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtedBy(String value) {
        this.inputtedBy = value;
    }

    /**
     * Gets the value of the renewPenaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRenewPenaltyRate() {
        return renewPenaltyRate;
    }

    /**
     * Sets the value of the renewPenaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRenewPenaltyRate(BigDecimal value) {
        this.renewPenaltyRate = value;
    }

    /**
     * Gets the value of the renewApplId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRenewApplId() {
        return renewApplId;
    }

    /**
     * Sets the value of the renewApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRenewApplId(Long value) {
        this.renewApplId = value;
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

    /**
     * Gets the value of the chargeSchemaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChargeSchemaId() {
        return chargeSchemaId;
    }

    /**
     * Sets the value of the chargeSchemaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChargeSchemaId(Long value) {
        this.chargeSchemaId = value;
    }

    /**
     * Gets the value of the isJxlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsJxlFlag() {
        return isJxlFlag;
    }

    /**
     * Sets the value of the isJxlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsJxlFlag(Boolean value) {
        this.isJxlFlag = value;
    }

    /**
     * Gets the value of the salesOrgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalesOrgId() {
        return salesOrgId;
    }

    /**
     * Sets the value of the salesOrgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalesOrgId(Long value) {
        this.salesOrgId = value;
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
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCategory }
     *     
     */
    public BusinessCategory getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCategory }
     *     
     */
    public void setBusinessCategory(BusinessCategory value) {
        this.businessCategory = value;
    }

    /**
     * Gets the value of the custAttributionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustAttributionId() {
        return custAttributionId;
    }

    /**
     * Sets the value of the custAttributionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustAttributionId(Long value) {
        this.custAttributionId = value;
    }

    /**
     * Gets the value of the loanDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanDay() {
        return loanDay;
    }

    /**
     * Sets the value of the loanDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanDay(Integer value) {
        this.loanDay = value;
    }

    /**
     * Gets the value of the adjustRepaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustRepaymentDate() {
        return adjustRepaymentDate;
    }

    /**
     * Sets the value of the adjustRepaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustRepaymentDate(Boolean value) {
        this.adjustRepaymentDate = value;
    }

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
     * Gets the value of the creditAuzStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuzStatus() {
        return creditAuzStatus;
    }

    /**
     * Sets the value of the creditAuzStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuzStatus(String value) {
        this.creditAuzStatus = value;
    }

    /**
     * Gets the value of the creditAuzStatus2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditAuzStatus2() {
        return creditAuzStatus2;
    }

    /**
     * Sets the value of the creditAuzStatus2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditAuzStatus2(String value) {
        this.creditAuzStatus2 = value;
    }

}
