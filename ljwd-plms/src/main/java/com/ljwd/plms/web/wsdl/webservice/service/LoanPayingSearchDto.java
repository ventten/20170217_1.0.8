
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for loanPayingSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanPayingSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanType" type="{http://webservice.loan.mfbms.flinkmf.com/}loanType" />
 *       &lt;attribute name="taskInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="taskInfoStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskInfoVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="taskInfoIsBack" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskInfoBackFromTask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="contractVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="payAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="actualPayAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankAcName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkedStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankBranch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentDtlVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentMthd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentDetailId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="signdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanPayingSearchDto")
public class LoanPayingSearchDto {

    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "loanType")
    protected LoanType loanType;
    @XmlAttribute(name = "taskInfoId")
    protected Long taskInfoId;
    @XmlAttribute(name = "taskInfoStatus")
    protected String taskInfoStatus;
    @XmlAttribute(name = "taskInfoVersion")
    protected Long taskInfoVersion;
    @XmlAttribute(name = "taskInfoIsBack")
    protected String taskInfoIsBack;
    @XmlAttribute(name = "taskInfoBackFromTask")
    protected String taskInfoBackFromTask;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanPeriod")
    protected Integer loanPeriod;
    @XmlAttribute(name = "contractVersion")
    protected Long contractVersion;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "payAmt")
    protected Double payAmt;
    @XmlAttribute(name = "actualPayAmt")
    protected Double actualPayAmt;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "paymentVersion")
    protected Long paymentVersion;
    @XmlAttribute(name = "bankAcName")
    protected String bankAcName;
    @XmlAttribute(name = "bankAc")
    protected String bankAc;
    @XmlAttribute(name = "checkedStatus")
    protected String checkedStatus;
    @XmlAttribute(name = "bankName")
    protected String bankName;
    @XmlAttribute(name = "bankBranch")
    protected String bankBranch;
    @XmlAttribute(name = "paymentStatusFlag")
    protected String paymentStatusFlag;
    @XmlAttribute(name = "paymentDtlVersion")
    protected Long paymentDtlVersion;
    @XmlAttribute(name = "paymentMthd")
    protected String paymentMthd;
    @XmlAttribute(name = "paymentStatus")
    protected String paymentStatus;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "siteName")
    protected String siteName;
    @XmlAttribute(name = "paymentDetailId")
    protected Long paymentDetailId;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "signdate")
    protected String signdate;

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
     * Gets the value of the taskInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskInfoId() {
        return taskInfoId;
    }

    /**
     * Sets the value of the taskInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskInfoId(Long value) {
        this.taskInfoId = value;
    }

    /**
     * Gets the value of the taskInfoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInfoStatus() {
        return taskInfoStatus;
    }

    /**
     * Sets the value of the taskInfoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInfoStatus(String value) {
        this.taskInfoStatus = value;
    }

    /**
     * Gets the value of the taskInfoVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskInfoVersion() {
        return taskInfoVersion;
    }

    /**
     * Sets the value of the taskInfoVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskInfoVersion(Long value) {
        this.taskInfoVersion = value;
    }

    /**
     * Gets the value of the taskInfoIsBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInfoIsBack() {
        return taskInfoIsBack;
    }

    /**
     * Sets the value of the taskInfoIsBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInfoIsBack(String value) {
        this.taskInfoIsBack = value;
    }

    /**
     * Gets the value of the taskInfoBackFromTask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInfoBackFromTask() {
        return taskInfoBackFromTask;
    }

    /**
     * Sets the value of the taskInfoBackFromTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInfoBackFromTask(String value) {
        this.taskInfoBackFromTask = value;
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
     * Gets the value of the contractVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractVersion() {
        return contractVersion;
    }

    /**
     * Sets the value of the contractVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractVersion(Long value) {
        this.contractVersion = value;
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
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayAmt(Double value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the actualPayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualPayAmt() {
        return actualPayAmt;
    }

    /**
     * Sets the value of the actualPayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualPayAmt(Double value) {
        this.actualPayAmt = value;
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
     * Gets the value of the paymentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentVersion() {
        return paymentVersion;
    }

    /**
     * Sets the value of the paymentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentVersion(Long value) {
        this.paymentVersion = value;
    }

    /**
     * Gets the value of the bankAcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcName() {
        return bankAcName;
    }

    /**
     * Sets the value of the bankAcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcName(String value) {
        this.bankAcName = value;
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
     * Gets the value of the checkedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckedStatus() {
        return checkedStatus;
    }

    /**
     * Sets the value of the checkedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedStatus(String value) {
        this.checkedStatus = value;
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
     * Gets the value of the bankBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranch() {
        return bankBranch;
    }

    /**
     * Sets the value of the bankBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranch(String value) {
        this.bankBranch = value;
    }

    /**
     * Gets the value of the paymentStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusFlag() {
        return paymentStatusFlag;
    }

    /**
     * Sets the value of the paymentStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusFlag(String value) {
        this.paymentStatusFlag = value;
    }

    /**
     * Gets the value of the paymentDtlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentDtlVersion() {
        return paymentDtlVersion;
    }

    /**
     * Sets the value of the paymentDtlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentDtlVersion(Long value) {
        this.paymentDtlVersion = value;
    }

    /**
     * Gets the value of the paymentMthd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMthd() {
        return paymentMthd;
    }

    /**
     * Sets the value of the paymentMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMthd(String value) {
        this.paymentMthd = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
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
     * Gets the value of the paymentDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentDetailId() {
        return paymentDetailId;
    }

    /**
     * Sets the value of the paymentDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentDetailId(Long value) {
        this.paymentDetailId = value;
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
     * Gets the value of the signdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigndate() {
        return signdate;
    }

    /**
     * Sets the value of the signdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigndate(String value) {
        this.signdate = value;
    }

}
