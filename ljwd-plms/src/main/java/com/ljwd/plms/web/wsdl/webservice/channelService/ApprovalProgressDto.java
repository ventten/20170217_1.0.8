
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for approvalProgressDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approvalProgressDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="seq" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="taskCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handledBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handledName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="handledStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}taskStatus" />
 *       &lt;attribute name="handledResult" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" />
 *       &lt;attribute name="isBack" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isInProgress" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suggestion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approvedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvedPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approvalProgressDto")
public class ApprovalProgressDto {

    @XmlAttribute(name = "seq")
    protected Integer seq;
    @XmlAttribute(name = "taskCode")
    protected String taskCode;
    @XmlAttribute(name = "taskName")
    protected String taskName;
    @XmlAttribute(name = "handledBy")
    protected String handledBy;
    @XmlAttribute(name = "handledName")
    protected String handledName;
    @XmlAttribute(name = "handleDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handleDate;
    @XmlAttribute(name = "handledStatus")
    protected TaskStatus handledStatus;
    @XmlAttribute(name = "handledResult")
    protected TaskResult handledResult;
    @XmlAttribute(name = "isBack")
    protected Boolean isBack;
    @XmlAttribute(name = "isInProgress", required = true)
    protected boolean isInProgress;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "suggestion")
    protected String suggestion;
    @XmlAttribute(name = "approvedAmount")
    protected BigDecimal approvedAmount;
    @XmlAttribute(name = "approvedPeriod")
    protected Integer approvedPeriod;

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeq(Integer value) {
        this.seq = value;
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
     * Gets the value of the handleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandleDate() {
        return handleDate;
    }

    /**
     * Sets the value of the handleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandleDate(XMLGregorianCalendar value) {
        this.handleDate = value;
    }

    /**
     * Gets the value of the handledStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaskStatus }
     *     
     */
    public TaskStatus getHandledStatus() {
        return handledStatus;
    }

    /**
     * Sets the value of the handledStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStatus }
     *     
     */
    public void setHandledStatus(TaskStatus value) {
        this.handledStatus = value;
    }

    /**
     * Gets the value of the handledResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaskResult }
     *     
     */
    public TaskResult getHandledResult() {
        return handledResult;
    }

    /**
     * Sets the value of the handledResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskResult }
     *     
     */
    public void setHandledResult(TaskResult value) {
        this.handledResult = value;
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
     * Gets the value of the isInProgress property.
     * 
     */
    public boolean isIsInProgress() {
        return isInProgress;
    }

    /**
     * Sets the value of the isInProgress property.
     * 
     */
    public void setIsInProgress(boolean value) {
        this.isInProgress = value;
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
     * Gets the value of the approvedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovedAmount() {
        return approvedAmount;
    }

    /**
     * Sets the value of the approvedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedAmount(BigDecimal value) {
        this.approvedAmount = value;
    }

    /**
     * Gets the value of the approvedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovedPeriod() {
        return approvedPeriod;
    }

    /**
     * Sets the value of the approvedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovedPeriod(Integer value) {
        this.approvedPeriod = value;
    }

}
