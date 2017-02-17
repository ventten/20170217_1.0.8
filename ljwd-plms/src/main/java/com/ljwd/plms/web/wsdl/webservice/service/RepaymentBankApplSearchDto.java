
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for repaymentBankApplSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repaymentBankApplSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repayMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentBankStatus" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="clearType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repayDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="penaltyInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="recordVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="advancePrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="advanceInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="paidPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="paidInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="customersPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="customersInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repaymentBankApplSearchDto")
public class RepaymentBankApplSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "bankId")
    protected Long bankId;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "paymentTypeCode")
    protected String paymentTypeCode;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "repayMethod")
    protected String repayMethod;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "status")
    protected RepaymentBankStatus status;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "clearType")
    protected String clearType;
    @XmlAttribute(name = "payInterest")
    protected BigDecimal payInterest;
    @XmlAttribute(name = "payPrincipal")
    protected BigDecimal payPrincipal;
    @XmlAttribute(name = "repayDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repayDate;
    @XmlAttribute(name = "interestRate")
    protected BigDecimal interestRate;
    @XmlAttribute(name = "penaltyInterest")
    protected BigDecimal penaltyInterest;
    @XmlAttribute(name = "payAMT")
    protected BigDecimal payAMT;
    @XmlAttribute(name = "recordVersion")
    protected Long recordVersion;
    @XmlAttribute(name = "applStatus")
    protected String applStatus;
    @XmlAttribute(name = "advancePrincipal")
    protected BigDecimal advancePrincipal;
    @XmlAttribute(name = "advanceInterest")
    protected BigDecimal advanceInterest;
    @XmlAttribute(name = "paidPrincipal")
    protected BigDecimal paidPrincipal;
    @XmlAttribute(name = "paidInterest")
    protected BigDecimal paidInterest;
    @XmlAttribute(name = "customersPrincipal")
    protected BigDecimal customersPrincipal;
    @XmlAttribute(name = "customersInterest")
    protected BigDecimal customersInterest;

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
     * Gets the value of the bankId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankId(Long value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
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
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
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
     * Gets the value of the repayMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayMethod() {
        return repayMethod;
    }

    /**
     * Sets the value of the repayMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayMethod(String value) {
        this.repayMethod = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentBankStatus }
     *     
     */
    public RepaymentBankStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentBankStatus }
     *     
     */
    public void setStatus(RepaymentBankStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the clearType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearType() {
        return clearType;
    }

    /**
     * Sets the value of the clearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearType(String value) {
        this.clearType = value;
    }

    /**
     * Gets the value of the payInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayInterest() {
        return payInterest;
    }

    /**
     * Sets the value of the payInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayInterest(BigDecimal value) {
        this.payInterest = value;
    }

    /**
     * Gets the value of the payPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayPrincipal() {
        return payPrincipal;
    }

    /**
     * Sets the value of the payPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayPrincipal(BigDecimal value) {
        this.payPrincipal = value;
    }

    /**
     * Gets the value of the repayDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepayDate() {
        return repayDate;
    }

    /**
     * Sets the value of the repayDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepayDate(XMLGregorianCalendar value) {
        this.repayDate = value;
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
     * Gets the value of the penaltyInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyInterest() {
        return penaltyInterest;
    }

    /**
     * Sets the value of the penaltyInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyInterest(BigDecimal value) {
        this.penaltyInterest = value;
    }

    /**
     * Gets the value of the payAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAMT() {
        return payAMT;
    }

    /**
     * Sets the value of the payAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAMT(BigDecimal value) {
        this.payAMT = value;
    }

    /**
     * Gets the value of the recordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordVersion() {
        return recordVersion;
    }

    /**
     * Sets the value of the recordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordVersion(Long value) {
        this.recordVersion = value;
    }

    /**
     * Gets the value of the applStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplStatus() {
        return applStatus;
    }

    /**
     * Sets the value of the applStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplStatus(String value) {
        this.applStatus = value;
    }

    /**
     * Gets the value of the advancePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvancePrincipal() {
        return advancePrincipal;
    }

    /**
     * Sets the value of the advancePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvancePrincipal(BigDecimal value) {
        this.advancePrincipal = value;
    }

    /**
     * Gets the value of the advanceInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvanceInterest() {
        return advanceInterest;
    }

    /**
     * Sets the value of the advanceInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvanceInterest(BigDecimal value) {
        this.advanceInterest = value;
    }

    /**
     * Gets the value of the paidPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidPrincipal() {
        return paidPrincipal;
    }

    /**
     * Sets the value of the paidPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidPrincipal(BigDecimal value) {
        this.paidPrincipal = value;
    }

    /**
     * Gets the value of the paidInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidInterest() {
        return paidInterest;
    }

    /**
     * Sets the value of the paidInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaidInterest(BigDecimal value) {
        this.paidInterest = value;
    }

    /**
     * Gets the value of the customersPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomersPrincipal() {
        return customersPrincipal;
    }

    /**
     * Sets the value of the customersPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomersPrincipal(BigDecimal value) {
        this.customersPrincipal = value;
    }

    /**
     * Gets the value of the customersInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomersInterest() {
        return customersInterest;
    }

    /**
     * Sets the value of the customersInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomersInterest(BigDecimal value) {
        this.customersInterest = value;
    }

}
