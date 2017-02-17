
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bankJournalLogDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankJournalLogDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bankJournalId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="actionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="actionBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actionType" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournalAction" />
 *       &lt;attribute name="actionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isLast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actionByName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankJournalLogDto")
public class BankJournalLogDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "bankJournalId")
    protected Long bankJournalId;
    @XmlAttribute(name = "actionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionDate;
    @XmlAttribute(name = "actionBy")
    protected String actionBy;
    @XmlAttribute(name = "actionType")
    protected BankJournalAction actionType;
    @XmlAttribute(name = "actionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionTime;
    @XmlAttribute(name = "isLast")
    protected Boolean isLast;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "actionByName")
    protected String actionByName;

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
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionDate(XMLGregorianCalendar value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the actionBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionBy() {
        return actionBy;
    }

    /**
     * Sets the value of the actionBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionBy(String value) {
        this.actionBy = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link BankJournalAction }
     *     
     */
    public BankJournalAction getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankJournalAction }
     *     
     */
    public void setActionType(BankJournalAction value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the actionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionTime() {
        return actionTime;
    }

    /**
     * Sets the value of the actionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionTime(XMLGregorianCalendar value) {
        this.actionTime = value;
    }

    /**
     * Gets the value of the isLast property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLast() {
        return isLast;
    }

    /**
     * Sets the value of the isLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLast(Boolean value) {
        this.isLast = value;
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
     * Gets the value of the actionByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionByName() {
        return actionByName;
    }

    /**
     * Sets the value of the actionByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionByName(String value) {
        this.actionByName = value;
    }

}
