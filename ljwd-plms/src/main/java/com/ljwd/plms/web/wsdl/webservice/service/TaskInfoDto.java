
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taskInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="workflowId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="handledBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handledName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}taskStatus" />
 *       &lt;attribute name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="assignTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="result" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" />
 *       &lt;attribute name="approvalLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="suggestAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isRevoked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="revokeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isBack" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suggestion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backToTaskCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="superAging" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suspendedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskInfoDto")
public class TaskInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "workflowId")
    protected Long workflowId;
    @XmlAttribute(name = "handledBy")
    protected String handledBy;
    @XmlAttribute(name = "handledName")
    protected String handledName;
    @XmlAttribute(name = "taskCode")
    protected String taskCode;
    @XmlAttribute(name = "taskName")
    protected String taskName;
    @XmlAttribute(name = "taskStatus")
    protected TaskStatus taskStatus;
    @XmlAttribute(name = "startTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlAttribute(name = "assignTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignTime;
    @XmlAttribute(name = "endTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlAttribute(name = "result")
    protected TaskResult result;
    @XmlAttribute(name = "approvalLevel")
    protected Integer approvalLevel;
    @XmlAttribute(name = "approvalAmount")
    protected BigDecimal approvalAmount;
    @XmlAttribute(name = "suggestAmount")
    protected BigDecimal suggestAmount;
    @XmlAttribute(name = "approvalPeriod")
    protected Integer approvalPeriod;
    @XmlAttribute(name = "isRevoked")
    protected Boolean isRevoked;
    @XmlAttribute(name = "revokeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revokeTime;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "isBack")
    protected Boolean isBack;
    @XmlAttribute(name = "suggestion")
    protected String suggestion;
    @XmlAttribute(name = "backToTaskCode")
    protected String backToTaskCode;
    @XmlAttribute(name = "superAging")
    protected String superAging;
    @XmlAttribute(name = "suspendedBy")
    protected String suspendedBy;
    @XmlAttribute(name = "suspendTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suspendTime;
    @XmlAttribute(name = "isSuspended")
    protected Boolean isSuspended;
    @XmlAttribute(name = "suspendReason")
    protected String suspendReason;

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
     * Gets the value of the workflowId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkflowId(Long value) {
        this.workflowId = value;
    }

    /**
     * Gets the value of the handledBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandledBy() {
        return handledBy;
    }

    /**
     * Sets the value of the handledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandledBy(String value) {
        this.handledBy = value;
    }

    /**
     * Gets the value of the handledName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandledName() {
        return handledName;
    }

    /**
     * Sets the value of the handledName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandledName(String value) {
        this.handledName = value;
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
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStatus }
     *     
     */
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStatus }
     *     
     */
    public void setTaskStatus(TaskStatus value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the assignTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignTime() {
        return assignTime;
    }

    /**
     * Sets the value of the assignTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignTime(XMLGregorianCalendar value) {
        this.assignTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link TaskResult }
     *     
     */
    public TaskResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskResult }
     *     
     */
    public void setResult(TaskResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the approvalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovalLevel() {
        return approvalLevel;
    }

    /**
     * Sets the value of the approvalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovalLevel(Integer value) {
        this.approvalLevel = value;
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
     * Gets the value of the suggestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestAmount() {
        return suggestAmount;
    }

    /**
     * Sets the value of the suggestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestAmount(BigDecimal value) {
        this.suggestAmount = value;
    }

    /**
     * Gets the value of the approvalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovalPeriod() {
        return approvalPeriod;
    }

    /**
     * Sets the value of the approvalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovalPeriod(Integer value) {
        this.approvalPeriod = value;
    }

    /**
     * Gets the value of the isRevoked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRevoked() {
        return isRevoked;
    }

    /**
     * Sets the value of the isRevoked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRevoked(Boolean value) {
        this.isRevoked = value;
    }

    /**
     * Gets the value of the revokeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevokeTime() {
        return revokeTime;
    }

    /**
     * Sets the value of the revokeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevokeTime(XMLGregorianCalendar value) {
        this.revokeTime = value;
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
     * Gets the value of the isBack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBack() {
        return isBack;
    }

    /**
     * Sets the value of the isBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBack(Boolean value) {
        this.isBack = value;
    }

    /**
     * Gets the value of the suggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * Sets the value of the suggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestion(String value) {
        this.suggestion = value;
    }

    /**
     * Gets the value of the backToTaskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackToTaskCode() {
        return backToTaskCode;
    }

    /**
     * Sets the value of the backToTaskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackToTaskCode(String value) {
        this.backToTaskCode = value;
    }

    /**
     * Gets the value of the superAging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperAging() {
        return superAging;
    }

    /**
     * Sets the value of the superAging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperAging(String value) {
        this.superAging = value;
    }

    /**
     * Gets the value of the suspendedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendedBy() {
        return suspendedBy;
    }

    /**
     * Sets the value of the suspendedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendedBy(String value) {
        this.suspendedBy = value;
    }

    /**
     * Gets the value of the suspendTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendTime() {
        return suspendTime;
    }

    /**
     * Sets the value of the suspendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendTime(XMLGregorianCalendar value) {
        this.suspendTime = value;
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
     * Gets the value of the suspendReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendReason() {
        return suspendReason;
    }

    /**
     * Sets the value of the suspendReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendReason(String value) {
        this.suspendReason = value;
    }

}
