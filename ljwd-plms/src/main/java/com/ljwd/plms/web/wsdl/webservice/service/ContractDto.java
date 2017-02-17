
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="interestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="contractStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}subLoanStatus" />
 *       &lt;attribute name="signTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="signUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appointNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractSn" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="businessCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="feeMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanType" type="{http://webservice.loan.mfbms.flinkmf.com/}loanType" />
 *       &lt;attribute name="loanDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isSignal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractDto")
public class ContractDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "approvalAmount")
    protected BigDecimal approvalAmount;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "interestRate")
    protected BigDecimal interestRate;
    @XmlAttribute(name = "contractStatus")
    protected SubLoanStatus contractStatus;
    @XmlAttribute(name = "signTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signTime;
    @XmlAttribute(name = "signUser")
    protected String signUser;
    @XmlAttribute(name = "appointTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointTime;
    @XmlAttribute(name = "appointNote")
    protected String appointNote;
    @XmlAttribute(name = "appointedBy")
    protected String appointedBy;
    @XmlAttribute(name = "contractSn")
    protected Long contractSn;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "delayDay")
    protected Integer delayDay;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "businessCategory")
    protected String businessCategory;
    @XmlAttribute(name = "feeMode")
    protected String feeMode;
    @XmlAttribute(name = "loanType")
    protected LoanType loanType;
    @XmlAttribute(name = "loanDay")
    protected Integer loanDay;
    @XmlAttribute(name = "isSignal")
    protected Boolean isSignal;

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
     * Gets the value of the approvalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovalAmount() {
        return approvalAmount;
    }

    /**
     * Sets the value of the approvalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovalAmount(BigDecimal value) {
        this.approvalAmount = value;
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
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SubLoanStatus }
     *     
     */
    public SubLoanStatus getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubLoanStatus }
     *     
     */
    public void setContractStatus(SubLoanStatus value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the signTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignTime() {
        return signTime;
    }

    /**
     * Sets the value of the signTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignTime(XMLGregorianCalendar value) {
        this.signTime = value;
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
     * Gets the value of the appointTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointTime() {
        return appointTime;
    }

    /**
     * Sets the value of the appointTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointTime(XMLGregorianCalendar value) {
        this.appointTime = value;
    }

    /**
     * Gets the value of the appointNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointNote() {
        return appointNote;
    }

    /**
     * Sets the value of the appointNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointNote(String value) {
        this.appointNote = value;
    }

    /**
     * Gets the value of the appointedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointedBy() {
        return appointedBy;
    }

    /**
     * Sets the value of the appointedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointedBy(String value) {
        this.appointedBy = value;
    }

    /**
     * Gets the value of the contractSn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractSn() {
        return contractSn;
    }

    /**
     * Sets the value of the contractSn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractSn(Long value) {
        this.contractSn = value;
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
     * Gets the value of the delayDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayDay() {
        return delayDay;
    }

    /**
     * Sets the value of the delayDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayDay(Integer value) {
        this.delayDay = value;
    }

    /**
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
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
     * Gets the value of the isSignal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignal() {
        return isSignal;
    }

    /**
     * Sets the value of the isSignal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSignal(Boolean value) {
        this.isSignal = value;
    }

}
