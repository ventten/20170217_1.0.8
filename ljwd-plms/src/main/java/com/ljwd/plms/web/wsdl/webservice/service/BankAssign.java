
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bankAssign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankAssign">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assignAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="assignTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="assignedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankJournal" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournal" minOccurs="0"/>
 *         &lt;element name="bankJournalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isAdvanceClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isWaitWaive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAssignStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAssign", propOrder = {
    "applicationId",
    "assignAmount",
    "assignTime",
    "assignedBy",
    "bankJournal",
    "bankJournalId",
    "isAdvanceClear",
    "isWaitWaive",
    "reason",
    "remark",
    "status"
})
public class BankAssign
    extends BaseVersionableCreatorAwareEntity
{

    protected Long applicationId;
    protected BigDecimal assignAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignTime;
    protected String assignedBy;
    protected BankJournal bankJournal;
    protected Long bankJournalId;
    protected Boolean isAdvanceClear;
    protected Boolean isWaitWaive;
    protected String reason;
    protected String remark;
    protected BankAssignStatus status;

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
     * Gets the value of the assignAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAssignAmount() {
        return assignAmount;
    }

    /**
     * Sets the value of the assignAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAssignAmount(BigDecimal value) {
        this.assignAmount = value;
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
     * Gets the value of the assignedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedBy() {
        return assignedBy;
    }

    /**
     * Sets the value of the assignedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedBy(String value) {
        this.assignedBy = value;
    }

    /**
     * Gets the value of the bankJournal property.
     * 
     * @return
     *     possible object is
     *     {@link BankJournal }
     *     
     */
    public BankJournal getBankJournal() {
        return bankJournal;
    }

    /**
     * Sets the value of the bankJournal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankJournal }
     *     
     */
    public void setBankJournal(BankJournal value) {
        this.bankJournal = value;
    }

    /**
     * Gets the value of the bankJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankJournalId() {
        return bankJournalId;
    }

    /**
     * Sets the value of the bankJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankJournalId(Long value) {
        this.bankJournalId = value;
    }

    /**
     * Gets the value of the isAdvanceClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdvanceClear() {
        return isAdvanceClear;
    }

    /**
     * Sets the value of the isAdvanceClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdvanceClear(Boolean value) {
        this.isAdvanceClear = value;
    }

    /**
     * Gets the value of the isWaitWaive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaitWaive() {
        return isWaitWaive;
    }

    /**
     * Sets the value of the isWaitWaive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaitWaive(Boolean value) {
        this.isWaitWaive = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BankAssignStatus }
     *     
     */
    public BankAssignStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAssignStatus }
     *     
     */
    public void setStatus(BankAssignStatus value) {
        this.status = value;
    }

}
