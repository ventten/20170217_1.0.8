
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationOutsourceDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationOutsourceDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="outsourceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outsourceCorporationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="acutalEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="feeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="receivableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submittedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="approvedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="lastExtentedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastExtentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="feedback" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="loanPeriorNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="loanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="overDaysNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paidPeriorNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="residueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="lastPayAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="lastPayTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="winfoStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outsourceCorporationName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="censusRegisterAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="homeAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wifeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wifeIdCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wifePhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conactorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conactorRelation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conactorPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="conactorAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyOutsrcCount" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requestor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationOutsourceDto")
public class ApplicationOutsourceDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "outsourceTypeCode")
    protected String outsourceTypeCode;
    @XmlAttribute(name = "outsourceCorporationId")
    protected Long outsourceCorporationId;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "acutalEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acutalEndDate;
    @XmlAttribute(name = "feeRate")
    protected BigDecimal feeRate;
    @XmlAttribute(name = "receivableAmount")
    protected BigDecimal receivableAmount;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "submittedBy")
    protected String submittedBy;
    @XmlAttribute(name = "submitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitTime;
    @XmlAttribute(name = "approvedBy")
    protected String approvedBy;
    @XmlAttribute(name = "approveTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approveTime;
    @XmlAttribute(name = "lastExtentedBy")
    protected String lastExtentedBy;
    @XmlAttribute(name = "lastExtentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastExtentTime;
    @XmlAttribute(name = "feedback")
    protected String feedback;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "customeName")
    protected String customeName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanType")
    protected String loanType;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "loanPeriorNum")
    protected Integer loanPeriorNum;
    @XmlAttribute(name = "loanDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanDate;
    @XmlAttribute(name = "overDaysNum")
    protected Integer overDaysNum;
    @XmlAttribute(name = "paidPeriorNum")
    protected Integer paidPeriorNum;
    @XmlAttribute(name = "residueAmount")
    protected BigDecimal residueAmount;
    @XmlAttribute(name = "lastPayAmount")
    protected BigDecimal lastPayAmount;
    @XmlAttribute(name = "lastPayTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPayTime;
    @XmlAttribute(name = "winfoStatus")
    protected String winfoStatus;
    @XmlAttribute(name = "outsourceCorporationName")
    protected String outsourceCorporationName;
    @XmlAttribute(name = "censusRegisterAddr")
    protected String censusRegisterAddr;
    @XmlAttribute(name = "mobile1")
    protected String mobile1;
    @XmlAttribute(name = "mobile2")
    protected String mobile2;
    @XmlAttribute(name = "homeAddr")
    protected String homeAddr;
    @XmlAttribute(name = "homePhone")
    protected String homePhone;
    @XmlAttribute(name = "companyName")
    protected String companyName;
    @XmlAttribute(name = "companyAddr")
    protected String companyAddr;
    @XmlAttribute(name = "companyPhone")
    protected String companyPhone;
    @XmlAttribute(name = "companyPosition")
    protected String companyPosition;
    @XmlAttribute(name = "wifeName")
    protected String wifeName;
    @XmlAttribute(name = "wifeIdCard")
    protected String wifeIdCard;
    @XmlAttribute(name = "wifePhone")
    protected String wifePhone;
    @XmlAttribute(name = "conactorName")
    protected String conactorName;
    @XmlAttribute(name = "conactorRelation")
    protected String conactorRelation;
    @XmlAttribute(name = "conactorPhone")
    protected String conactorPhone;
    @XmlAttribute(name = "conactorAddr")
    protected String conactorAddr;
    @XmlAttribute(name = "applyOutsrcCount")
    protected Integer applyOutsrcCount;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "marriageStatus")
    protected String marriageStatus;
    @XmlAttribute(name = "requestor")
    protected String requestor;
    @XmlAttribute(name = "siteName")
    protected String siteName;
    @XmlAttribute(name = "paymentTypeCode")
    protected String paymentTypeCode;
    @XmlAttribute(name = "overDays")
    protected Integer overDays;

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
     * Gets the value of the outsourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsourceTypeCode() {
        return outsourceTypeCode;
    }

    /**
     * Sets the value of the outsourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsourceTypeCode(String value) {
        this.outsourceTypeCode = value;
    }

    /**
     * Gets the value of the outsourceCorporationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutsourceCorporationId() {
        return outsourceCorporationId;
    }

    /**
     * Sets the value of the outsourceCorporationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutsourceCorporationId(Long value) {
        this.outsourceCorporationId = value;
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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the acutalEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcutalEndDate() {
        return acutalEndDate;
    }

    /**
     * Sets the value of the acutalEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcutalEndDate(XMLGregorianCalendar value) {
        this.acutalEndDate = value;
    }

    /**
     * Gets the value of the feeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * Sets the value of the feeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeRate(BigDecimal value) {
        this.feeRate = value;
    }

    /**
     * Gets the value of the receivableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableAmount() {
        return receivableAmount;
    }

    /**
     * Sets the value of the receivableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableAmount(BigDecimal value) {
        this.receivableAmount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the submittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Sets the value of the submittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedBy(String value) {
        this.submittedBy = value;
    }

    /**
     * Gets the value of the submitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitTime() {
        return submitTime;
    }

    /**
     * Sets the value of the submitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitTime(XMLGregorianCalendar value) {
        this.submitTime = value;
    }

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedBy(String value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the approveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveTime() {
        return approveTime;
    }

    /**
     * Sets the value of the approveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveTime(XMLGregorianCalendar value) {
        this.approveTime = value;
    }

    /**
     * Gets the value of the lastExtentedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastExtentedBy() {
        return lastExtentedBy;
    }

    /**
     * Sets the value of the lastExtentedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastExtentedBy(String value) {
        this.lastExtentedBy = value;
    }

    /**
     * Gets the value of the lastExtentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExtentTime() {
        return lastExtentTime;
    }

    /**
     * Sets the value of the lastExtentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExtentTime(XMLGregorianCalendar value) {
        this.lastExtentTime = value;
    }

    /**
     * Gets the value of the feedback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * Sets the value of the feedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedback(String value) {
        this.feedback = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
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
     * Gets the value of the customeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomeName() {
        return customeName;
    }

    /**
     * Sets the value of the customeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomeName(String value) {
        this.customeName = value;
    }

    /**
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
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
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
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
     * Gets the value of the loanPeriorNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoanPeriorNum() {
        return loanPeriorNum;
    }

    /**
     * Sets the value of the loanPeriorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoanPeriorNum(Integer value) {
        this.loanPeriorNum = value;
    }

    /**
     * Gets the value of the loanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanDate() {
        return loanDate;
    }

    /**
     * Sets the value of the loanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanDate(XMLGregorianCalendar value) {
        this.loanDate = value;
    }

    /**
     * Gets the value of the overDaysNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverDaysNum() {
        return overDaysNum;
    }

    /**
     * Sets the value of the overDaysNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverDaysNum(Integer value) {
        this.overDaysNum = value;
    }

    /**
     * Gets the value of the paidPeriorNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaidPeriorNum() {
        return paidPeriorNum;
    }

    /**
     * Sets the value of the paidPeriorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaidPeriorNum(Integer value) {
        this.paidPeriorNum = value;
    }

    /**
     * Gets the value of the residueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidueAmount() {
        return residueAmount;
    }

    /**
     * Sets the value of the residueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setResidueAmount(BigDecimal value) {
        this.residueAmount = value;
    }

    /**
     * Gets the value of the lastPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPayAmount() {
        return lastPayAmount;
    }

    /**
     * Sets the value of the lastPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPayAmount(BigDecimal value) {
        this.lastPayAmount = value;
    }

    /**
     * Gets the value of the lastPayTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPayTime() {
        return lastPayTime;
    }

    /**
     * Sets the value of the lastPayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPayTime(XMLGregorianCalendar value) {
        this.lastPayTime = value;
    }

    /**
     * Gets the value of the winfoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinfoStatus() {
        return winfoStatus;
    }

    /**
     * Sets the value of the winfoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinfoStatus(String value) {
        this.winfoStatus = value;
    }

    /**
     * Gets the value of the outsourceCorporationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsourceCorporationName() {
        return outsourceCorporationName;
    }

    /**
     * Sets the value of the outsourceCorporationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsourceCorporationName(String value) {
        this.outsourceCorporationName = value;
    }

    /**
     * Gets the value of the censusRegisterAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCensusRegisterAddr() {
        return censusRegisterAddr;
    }

    /**
     * Sets the value of the censusRegisterAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCensusRegisterAddr(String value) {
        this.censusRegisterAddr = value;
    }

    /**
     * Gets the value of the mobile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile1() {
        return mobile1;
    }

    /**
     * Sets the value of the mobile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile1(String value) {
        this.mobile1 = value;
    }

    /**
     * Gets the value of the mobile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile2() {
        return mobile2;
    }

    /**
     * Sets the value of the mobile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile2(String value) {
        this.mobile2 = value;
    }

    /**
     * Gets the value of the homeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeAddr() {
        return homeAddr;
    }

    /**
     * Sets the value of the homeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeAddr(String value) {
        this.homeAddr = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAddr() {
        return companyAddr;
    }

    /**
     * Sets the value of the companyAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAddr(String value) {
        this.companyAddr = value;
    }

    /**
     * Gets the value of the companyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPhone() {
        return companyPhone;
    }

    /**
     * Sets the value of the companyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPhone(String value) {
        this.companyPhone = value;
    }

    /**
     * Gets the value of the companyPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyPosition() {
        return companyPosition;
    }

    /**
     * Sets the value of the companyPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyPosition(String value) {
        this.companyPosition = value;
    }

    /**
     * Gets the value of the wifeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeName() {
        return wifeName;
    }

    /**
     * Sets the value of the wifeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeName(String value) {
        this.wifeName = value;
    }

    /**
     * Gets the value of the wifeIdCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeIdCard() {
        return wifeIdCard;
    }

    /**
     * Sets the value of the wifeIdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeIdCard(String value) {
        this.wifeIdCard = value;
    }

    /**
     * Gets the value of the wifePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifePhone() {
        return wifePhone;
    }

    /**
     * Sets the value of the wifePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifePhone(String value) {
        this.wifePhone = value;
    }

    /**
     * Gets the value of the conactorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConactorName() {
        return conactorName;
    }

    /**
     * Sets the value of the conactorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConactorName(String value) {
        this.conactorName = value;
    }

    /**
     * Gets the value of the conactorRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConactorRelation() {
        return conactorRelation;
    }

    /**
     * Sets the value of the conactorRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConactorRelation(String value) {
        this.conactorRelation = value;
    }

    /**
     * Gets the value of the conactorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConactorPhone() {
        return conactorPhone;
    }

    /**
     * Sets the value of the conactorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConactorPhone(String value) {
        this.conactorPhone = value;
    }

    /**
     * Gets the value of the conactorAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConactorAddr() {
        return conactorAddr;
    }

    /**
     * Sets the value of the conactorAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConactorAddr(String value) {
        this.conactorAddr = value;
    }

    /**
     * Gets the value of the applyOutsrcCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplyOutsrcCount() {
        return applyOutsrcCount;
    }

    /**
     * Sets the value of the applyOutsrcCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplyOutsrcCount(Integer value) {
        this.applyOutsrcCount = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the marriageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * Sets the value of the marriageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageStatus(String value) {
        this.marriageStatus = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestor(String value) {
        this.requestor = value;
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
     * Gets the value of the overDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverDays() {
        return overDays;
    }

    /**
     * Sets the value of the overDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverDays(Integer value) {
        this.overDays = value;
    }

}
