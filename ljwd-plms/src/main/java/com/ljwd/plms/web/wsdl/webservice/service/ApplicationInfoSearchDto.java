
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfoSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dealWithDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approverAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approverPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="salesUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputUserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wfid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="taskCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="signNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backFromTask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="situation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isReviewed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reviewedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reviewedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reviewTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="businessCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoSearchDto")
public class ApplicationInfoSearchDto {

    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "customerId")
    protected Long customerId;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "applyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDate;
    @XmlAttribute(name = "dealWithDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dealWithDate;
    @XmlAttribute(name = "applicationAmount")
    protected BigDecimal applicationAmount;
    @XmlAttribute(name = "approverAmount")
    protected BigDecimal approverAmount;
    @XmlAttribute(name = "approverPeriod")
    protected Integer approverPeriod;
    @XmlAttribute(name = "salesUser")
    protected String salesUser;
    @XmlAttribute(name = "inputUserName")
    protected String inputUserName;
    @XmlAttribute(name = "loanStatus")
    protected String loanStatus;
    @XmlAttribute(name = "wfid")
    protected Long wfid;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "taskId")
    protected Long taskId;
    @XmlAttribute(name = "taskCode")
    protected String taskCode;
    @XmlAttribute(name = "subStatus")
    protected String subStatus;
    @XmlAttribute(name = "taskStatus")
    protected String taskStatus;
    @XmlAttribute(name = "isSuspended")
    protected Boolean isSuspended;
    @XmlAttribute(name = "signNote")
    protected String signNote;
    @XmlAttribute(name = "backFromTask")
    protected String backFromTask;
    @XmlAttribute(name = "situation")
    protected String situation;
    @XmlAttribute(name = "isReviewed")
    protected Boolean isReviewed;
    @XmlAttribute(name = "reviewedBy")
    protected String reviewedBy;
    @XmlAttribute(name = "reviewedName")
    protected String reviewedName;
    @XmlAttribute(name = "reviewTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reviewTime;
    @XmlAttribute(name = "channel")
    protected String channel;
    @XmlAttribute(name = "createTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlAttribute(name = "payType")
    protected String payType;
    @XmlAttribute(name = "payTypeName")
    protected String payTypeName;
    @XmlAttribute(name = "rejectReason")
    protected String rejectReason;
    @XmlAttribute(name = "cancelReason")
    protected String cancelReason;
    @XmlAttribute(name = "clearDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearDate;
    @XmlAttribute(name = "businessCategory")
    protected String businessCategory;

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
    }

    /**
     * Gets the value of the applyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the value of the applyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCode(String value) {
        this.applyCode = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
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
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
    }

    /**
     * Gets the value of the dealWithDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDealWithDate() {
        return dealWithDate;
    }

    /**
     * Sets the value of the dealWithDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDealWithDate(XMLGregorianCalendar value) {
        this.dealWithDate = value;
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
     * Gets the value of the approverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApproverAmount() {
        return approverAmount;
    }

    /**
     * Sets the value of the approverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApproverAmount(BigDecimal value) {
        this.approverAmount = value;
    }

    /**
     * Gets the value of the approverPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproverPeriod() {
        return approverPeriod;
    }

    /**
     * Sets the value of the approverPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproverPeriod(Integer value) {
        this.approverPeriod = value;
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
     * Gets the value of the inputUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputUserName() {
        return inputUserName;
    }

    /**
     * Sets the value of the inputUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputUserName(String value) {
        this.inputUserName = value;
    }

    /**
     * Gets the value of the loanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Sets the value of the loanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
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
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskId(Long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * Sets the value of the taskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskCode(String value) {
        this.taskCode = value;
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
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the isSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuspended() {
        return isSuspended;
    }

    /**
     * Sets the value of the isSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuspended(Boolean value) {
        this.isSuspended = value;
    }

    /**
     * Gets the value of the signNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignNote() {
        return signNote;
    }

    /**
     * Sets the value of the signNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignNote(String value) {
        this.signNote = value;
    }

    /**
     * Gets the value of the backFromTask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFromTask() {
        return backFromTask;
    }

    /**
     * Sets the value of the backFromTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFromTask(String value) {
        this.backFromTask = value;
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
     * Gets the value of the reviewedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewedName() {
        return reviewedName;
    }

    /**
     * Sets the value of the reviewedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewedName(String value) {
        this.reviewedName = value;
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
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the payType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * Gets the value of the payTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTypeName() {
        return payTypeName;
    }

    /**
     * Sets the value of the payTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTypeName(String value) {
        this.payTypeName = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the clearDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClearDate() {
        return clearDate;
    }

    /**
     * Sets the value of the clearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClearDate(XMLGregorianCalendar value) {
        this.clearDate = value;
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

}
