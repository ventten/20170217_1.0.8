
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taskInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="approvalLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="approvalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="assignTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="backFromTask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backToTask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isRevoked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" minOccurs="0"/>
 *         &lt;element name="revokeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="suggestAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="suggestion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superAging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspendReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="suspendedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskDefinitionByBackTask" type="{http://webservice.loan.mfbms.flinkmf.com/}taskDefinition" minOccurs="0"/>
 *         &lt;element name="taskDefinitionByTaskCode" type="{http://webservice.loan.mfbms.flinkmf.com/}taskDefinition" minOccurs="0"/>
 *         &lt;element name="taskStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}taskStatus" minOccurs="0"/>
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
@XmlType(name = "taskInfo", propOrder = {
    "approvalAmount",
    "approvalLevel",
    "approvalPeriod",
    "assignTime",
    "backFromTask",
    "backToTask",
    "endTime",
    "handledBy",
    "isBack",
    "isRevoked",
    "isSuspended",
    "reason",
    "result",
    "revokeTime",
    "startTime",
    "suggestAmount",
    "suggestion",
    "superAging",
    "suspendReason",
    "suspendTime",
    "suspendedBy",
    "taskCode",
    "taskDefinitionByBackTask",
    "taskDefinitionByTaskCode",
    "taskStatus",
    "user",
    "workflow"
})
public class TaskInfo
    extends BaseVersionableCreatorAwareEntity
{

    protected BigDecimal approvalAmount;
    protected Integer approvalLevel;
    protected Integer approvalPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignTime;
    protected String backFromTask;
    protected String backToTask;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected String handledBy;
    protected Boolean isBack;
    protected Boolean isRevoked;
    protected Boolean isSuspended;
    protected String reason;
    protected TaskResult result;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revokeTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected BigDecimal suggestAmount;
    protected String suggestion;
    protected String superAging;
    protected String suspendReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar suspendTime;
    protected String suspendedBy;
    protected String taskCode;
    protected TaskDefinition taskDefinitionByBackTask;
    protected TaskDefinition taskDefinitionByTaskCode;
    protected TaskStatus taskStatus;
    protected User user;
    protected WorkflowInfo workflow;

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
     * Gets the value of the backToTask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackToTask() {
        return backToTask;
    }

    /**
     * Sets the value of the backToTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackToTask(String value) {
        this.backToTask = value;
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
     * Gets the value of the taskDefinitionByBackTask property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDefinition }
     *     
     */
    public TaskDefinition getTaskDefinitionByBackTask() {
        return taskDefinitionByBackTask;
    }

    /**
     * Sets the value of the taskDefinitionByBackTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDefinition }
     *     
     */
    public void setTaskDefinitionByBackTask(TaskDefinition value) {
        this.taskDefinitionByBackTask = value;
    }

    /**
     * Gets the value of the taskDefinitionByTaskCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaskDefinition }
     *     
     */
    public TaskDefinition getTaskDefinitionByTaskCode() {
        return taskDefinitionByTaskCode;
    }

    /**
     * Sets the value of the taskDefinitionByTaskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDefinition }
     *     
     */
    public void setTaskDefinitionByTaskCode(TaskDefinition value) {
        this.taskDefinitionByTaskCode = value;
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
