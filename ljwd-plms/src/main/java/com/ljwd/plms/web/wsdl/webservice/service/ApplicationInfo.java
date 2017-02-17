
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="adjustRepaymentDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="annexes" type="{http://webservice.loan.mfbms.flinkmf.com/}annex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationLastResult" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationLastResult" minOccurs="0"/>
 *         &lt;element name="applicationLedgers" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationLedger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessCategory" type="{http://webservice.loan.mfbms.flinkmf.com/}businessCategory" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeSchema" type="{http://webservice.loan.mfbms.flinkmf.com/}chargeSchema" minOccurs="0"/>
 *         &lt;element name="chargeSchemaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contracts" type="{http://webservice.loan.mfbms.flinkmf.com/}contract" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditAuzMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAuzStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditAuzStatus2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditReports" type="{http://webservice.loan.mfbms.flinkmf.com/}creditReport" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="custAttributionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://webservice.loan.mfbms.flinkmf.com/}customer" minOccurs="0"/>
 *         &lt;element name="customerSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customers" type="{http://webservice.loan.mfbms.flinkmf.com/}customer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handleSite" type="{http://webservice.loan.mfbms.flinkmf.com/}site" minOccurs="0"/>
 *         &lt;element name="handleSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputtedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="isJxlFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isReviewed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="loanDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanType" type="{http://webservice.loan.mfbms.flinkmf.com/}loanType" minOccurs="0"/>
 *         &lt;element name="materials" type="{http://webservice.loan.mfbms.flinkmf.com/}material" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTypeObj" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentType" minOccurs="0"/>
 *         &lt;element name="payments" type="{http://webservice.loan.mfbms.flinkmf.com/}payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://webservice.loan.mfbms.flinkmf.com/}product" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renewApplId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="renewPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="repaymentPlans" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentPlan" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reviewTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reviewedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesOrgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="site" type="{http://webservice.loan.mfbms.flinkmf.com/}site" minOccurs="0"/>
 *         &lt;element name="situation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surveyExempts" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyExempt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surveyFinances" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyFinance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surveyNets" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyNet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surveyPhones" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyPhone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="surveySummaries" type="{http://webservice.loan.mfbms.flinkmf.com/}surveySum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{http://webservice.loan.mfbms.flinkmf.com/}user" minOccurs="0"/>
 *         &lt;element name="workflow" type="{http://webservice.loan.mfbms.flinkmf.com/}workflowInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfo", propOrder = {
    "adjustRepaymentDate",
    "annexes",
    "applicationAmount",
    "applicationCode",
    "applicationDate",
    "applicationLastResult",
    "applicationLedgers",
    "businessCategory",
    "channel",
    "chargeSchema",
    "chargeSchemaId",
    "contracts",
    "creditAuzMode",
    "creditAuzStatus",
    "creditAuzStatus2",
    "creditReports",
    "custAttributionId",
    "customer",
    "customerSource",
    "customers",
    "externalCode",
    "feeMode",
    "handleSite",
    "handleSiteCode",
    "inputSiteCode",
    "inputtedBy",
    "interestRate",
    "isJxlFlag",
    "isReviewed",
    "loanDay",
    "loanPeriod",
    "loanPurpose",
    "loanType",
    "materials",
    "paymentType",
    "paymentTypeObj",
    "payments",
    "product",
    "productId",
    "productNo",
    "renewApplId",
    "renewPenaltyRate",
    "repaymentPlans",
    "reviewTime",
    "reviewedBy",
    "salesOrgId",
    "site",
    "situation",
    "surveyExempts",
    "surveyFinances",
    "surveyNets",
    "surveyPhones",
    "surveySummaries",
    "user",
    "workflow"
})
public class ApplicationInfo
    extends BaseVersionableCreatorAwareEntity
{

    protected Boolean adjustRepaymentDate;
    @XmlElement(nillable = true)
    protected List<Annex> annexes;
    protected BigDecimal applicationAmount;
    protected String applicationCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    protected ApplicationLastResult applicationLastResult;
    @XmlElement(nillable = true)
    protected List<ApplicationLedger> applicationLedgers;
    protected BusinessCategory businessCategory;
    protected String channel;
    protected ChargeSchema chargeSchema;
    protected Long chargeSchemaId;
    @XmlElement(nillable = true)
    protected List<Contract> contracts;
    protected String creditAuzMode;
    protected String creditAuzStatus;
    protected String creditAuzStatus2;
    @XmlElement(nillable = true)
    protected List<CreditReport> creditReports;
    protected Long custAttributionId;
    protected Customer customer;
    protected String customerSource;
    @XmlElement(nillable = true)
    protected List<Customer> customers;
    protected String externalCode;
    protected String feeMode;
    protected Site handleSite;
    protected String handleSiteCode;
    protected String inputSiteCode;
    protected String inputtedBy;
    protected BigDecimal interestRate;
    protected Boolean isJxlFlag;
    protected Boolean isReviewed;
    protected Integer loanDay;
    protected Integer loanPeriod;
    protected String loanPurpose;
    protected LoanType loanType;
    @XmlElement(nillable = true)
    protected List<Material> materials;
    protected String paymentType;
    protected PaymentType paymentTypeObj;
    @XmlElement(nillable = true)
    protected List<Payment> payments;
    protected Product product;
    protected Long productId;
    protected String productNo;
    protected Long renewApplId;
    protected BigDecimal renewPenaltyRate;
    @XmlElement(nillable = true)
    protected List<RepaymentPlan> repaymentPlans;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewTime;
    protected String reviewedBy;
    protected Long salesOrgId;
    protected Site site;
    protected String situation;
    @XmlElement(nillable = true)
    protected List<SurveyExempt> surveyExempts;
    @XmlElement(nillable = true)
    protected List<SurveyFinance> surveyFinances;
    @XmlElement(nillable = true)
    protected List<SurveyNet> surveyNets;
    @XmlElement(nillable = true)
    protected List<SurveyPhone> surveyPhones;
    @XmlElement(nillable = true)
    protected List<SurveySum> surveySummaries;
    protected User user;
    protected WorkflowInfo workflow;

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
     * Gets the value of the annexes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annexes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnexes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annex }
     * 
     * 
     */
    public List<Annex> getAnnexes() {
        if (annexes == null) {
            annexes = new ArrayList<Annex>();
        }
        return this.annexes;
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
     * Gets the value of the applicationLastResult property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLastResult }
     *     
     */
    public ApplicationLastResult getApplicationLastResult() {
        return applicationLastResult;
    }

    /**
     * Sets the value of the applicationLastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLastResult }
     *     
     */
    public void setApplicationLastResult(ApplicationLastResult value) {
        this.applicationLastResult = value;
    }

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
     * {@link ApplicationLedger }
     * 
     * 
     */
    public List<ApplicationLedger> getApplicationLedgers() {
        if (applicationLedgers == null) {
            applicationLedgers = new ArrayList<ApplicationLedger>();
        }
        return this.applicationLedgers;
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
     * Gets the value of the chargeSchema property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeSchema }
     *     
     */
    public ChargeSchema getChargeSchema() {
        return chargeSchema;
    }

    /**
     * Sets the value of the chargeSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeSchema }
     *     
     */
    public void setChargeSchema(ChargeSchema value) {
        this.chargeSchema = value;
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
     * Gets the value of the contracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contract }
     * 
     * 
     */
    public List<Contract> getContracts() {
        if (contracts == null) {
            contracts = new ArrayList<Contract>();
        }
        return this.contracts;
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

    /**
     * Gets the value of the creditReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditReport }
     * 
     * 
     */
    public List<CreditReport> getCreditReports() {
        if (creditReports == null) {
            creditReports = new ArrayList<CreditReport>();
        }
        return this.creditReports;
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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
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
     * Gets the value of the customers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customer }
     * 
     * 
     */
    public List<Customer> getCustomers() {
        if (customers == null) {
            customers = new ArrayList<Customer>();
        }
        return this.customers;
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
     * Gets the value of the handleSite property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getHandleSite() {
        return handleSite;
    }

    /**
     * Sets the value of the handleSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setHandleSite(Site value) {
        this.handleSite = value;
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
     * Gets the value of the isReviewed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReviewed() {
        return isReviewed;
    }

    /**
     * Sets the value of the isReviewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReviewed(Boolean value) {
        this.isReviewed = value;
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
     * Gets the value of the materials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Material }
     * 
     * 
     */
    public List<Material> getMaterials() {
        if (materials == null) {
            materials = new ArrayList<Material>();
        }
        return this.materials;
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
     * Gets the value of the paymentTypeObj property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentTypeObj() {
        return paymentTypeObj;
    }

    /**
     * Sets the value of the paymentTypeObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentTypeObj(PaymentType value) {
        this.paymentTypeObj = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayments() {
        if (payments == null) {
            payments = new ArrayList<Payment>();
        }
        return this.payments;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
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
     * Gets the value of the repaymentPlans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentPlans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentPlans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentPlan }
     * 
     * 
     */
    public List<RepaymentPlan> getRepaymentPlans() {
        if (repaymentPlans == null) {
            repaymentPlans = new ArrayList<RepaymentPlan>();
        }
        return this.repaymentPlans;
    }

    /**
     * Gets the value of the reviewTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReviewTime() {
        return reviewTime;
    }

    /**
     * Sets the value of the reviewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReviewTime(XMLGregorianCalendar value) {
        this.reviewTime = value;
    }

    /**
     * Gets the value of the reviewedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewedBy() {
        return reviewedBy;
    }

    /**
     * Sets the value of the reviewedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewedBy(String value) {
        this.reviewedBy = value;
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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setSite(Site value) {
        this.site = value;
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
     * Gets the value of the surveyExempts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyExempts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyExempts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyExempt }
     * 
     * 
     */
    public List<SurveyExempt> getSurveyExempts() {
        if (surveyExempts == null) {
            surveyExempts = new ArrayList<SurveyExempt>();
        }
        return this.surveyExempts;
    }

    /**
     * Gets the value of the surveyFinances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyFinances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyFinances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyFinance }
     * 
     * 
     */
    public List<SurveyFinance> getSurveyFinances() {
        if (surveyFinances == null) {
            surveyFinances = new ArrayList<SurveyFinance>();
        }
        return this.surveyFinances;
    }

    /**
     * Gets the value of the surveyNets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyNets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyNets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyNet }
     * 
     * 
     */
    public List<SurveyNet> getSurveyNets() {
        if (surveyNets == null) {
            surveyNets = new ArrayList<SurveyNet>();
        }
        return this.surveyNets;
    }

    /**
     * Gets the value of the surveyPhones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyPhones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyPhone }
     * 
     * 
     */
    public List<SurveyPhone> getSurveyPhones() {
        if (surveyPhones == null) {
            surveyPhones = new ArrayList<SurveyPhone>();
        }
        return this.surveyPhones;
    }

    /**
     * Gets the value of the surveySummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveySummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveySummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveySum }
     * 
     * 
     */
    public List<SurveySum> getSurveySummaries() {
        if (surveySummaries == null) {
            surveySummaries = new ArrayList<SurveySum>();
        }
        return this.surveySummaries;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowInfo }
     *     
     */
    public WorkflowInfo getWorkflow() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowInfo }
     *     
     */
    public void setWorkflow(WorkflowInfo value) {
        this.workflow = value;
    }

}
