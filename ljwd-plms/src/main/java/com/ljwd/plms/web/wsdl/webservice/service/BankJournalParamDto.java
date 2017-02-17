
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bankJournalParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankJournalParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="substrAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="txDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="txDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="bankAcId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="txAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="updateDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updateDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="journalType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankJournalParamDto")
public class BankJournalParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "accountNo")
    protected String accountNo;
    @XmlAttribute(name = "substrAccountNo")
    protected String substrAccountNo;
    @XmlAttribute(name = "txDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDateFrom;
    @XmlAttribute(name = "txDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDateTo;
    @XmlAttribute(name = "bankAcId")
    protected Long bankAcId;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "txAmount")
    protected BigDecimal txAmount;
    @XmlAttribute(name = "updateDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateFrom;
    @XmlAttribute(name = "updateDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTo;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "journalType")
    protected String journalType;
    @XmlAttribute(name = "action")
    protected String action;
    @XmlAttribute(name = "dateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

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
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the substrAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstrAccountNo() {
        return substrAccountNo;
    }

    /**
     * Sets the value of the substrAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstrAccountNo(String value) {
        this.substrAccountNo = value;
    }

    /**
     * Gets the value of the txDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDateFrom() {
        return txDateFrom;
    }

    /**
     * Sets the value of the txDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDateFrom(XMLGregorianCalendar value) {
        this.txDateFrom = value;
    }

    /**
     * Gets the value of the txDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDateTo() {
        return txDateTo;
    }

    /**
     * Sets the value of the txDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDateTo(XMLGregorianCalendar value) {
        this.txDateTo = value;
    }

    /**
     * Gets the value of the bankAcId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankAcId() {
        return bankAcId;
    }

    /**
     * Sets the value of the bankAcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankAcId(Long value) {
        this.bankAcId = value;
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
     * Gets the value of the txAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxAmount() {
        return txAmount;
    }

    /**
     * Sets the value of the txAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTxAmount(BigDecimal value) {
        this.txAmount = value;
    }

    /**
     * Gets the value of the updateDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateFrom() {
        return updateDateFrom;
    }

    /**
     * Sets the value of the updateDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateFrom(XMLGregorianCalendar value) {
        this.updateDateFrom = value;
    }

    /**
     * Gets the value of the updateDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTo() {
        return updateDateTo;
    }

    /**
     * Sets the value of the updateDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTo(XMLGregorianCalendar value) {
        this.updateDateTo = value;
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
     * Gets the value of the journalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalType() {
        return journalType;
    }

    /**
     * Sets the value of the journalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalType(String value) {
        this.journalType = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
