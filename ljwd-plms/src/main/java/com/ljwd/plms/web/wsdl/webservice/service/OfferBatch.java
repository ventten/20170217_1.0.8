
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for offerBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerBatch">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="bankAccount" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccount" minOccurs="0"/>
 *         &lt;element name="bankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="batchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="confirmReplyBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmReplyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="confirmRequestBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmRequestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maxTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="offerParameter" type="{http://webservice.loan.mfbms.flinkmf.com/}offerParameter" minOccurs="0"/>
 *         &lt;element name="offerParameterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerType" type="{http://webservice.loan.mfbms.flinkmf.com/}offerType" minOccurs="0"/>
 *         &lt;element name="paidDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyReportPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requestReportPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}offerBatchStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerBatch", propOrder = {
    "bankAccount",
    "bankAccountId",
    "batchCode",
    "clearDate",
    "confirmReplyBy",
    "confirmReplyTime",
    "confirmRequestBy",
    "confirmRequestTime",
    "endDate",
    "maxTimes",
    "minAmount",
    "offerParameter",
    "offerParameterId",
    "offerType",
    "paidDate",
    "payFlag",
    "paymentType",
    "queryParam",
    "region",
    "replyReportPath",
    "requestDate",
    "requestReportPath",
    "siteCode",
    "startDate",
    "status"
})
public class OfferBatch
    extends BaseVersionableCreatorAwareEntity
{

    protected BankAccount bankAccount;
    protected Long bankAccountId;
    protected String batchCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearDate;
    protected String confirmReplyBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmReplyTime;
    protected String confirmRequestBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmRequestTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected Integer maxTimes;
    protected BigDecimal minAmount;
    protected OfferParameter offerParameter;
    protected Long offerParameterId;
    protected OfferType offerType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paidDate;
    protected String payFlag;
    protected String paymentType;
    protected String queryParam;
    protected String region;
    protected String replyReportPath;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    protected String requestReportPath;
    protected String siteCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected OfferBatchStatus status;

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBankAccount(BankAccount value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankAccountId() {
        return bankAccountId;
    }

    /**
     * Sets the value of the bankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankAccountId(Long value) {
        this.bankAccountId = value;
    }

    /**
     * Gets the value of the batchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * Sets the value of the batchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
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
     * Gets the value of the confirmReplyBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmReplyBy() {
        return confirmReplyBy;
    }

    /**
     * Sets the value of the confirmReplyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmReplyBy(String value) {
        this.confirmReplyBy = value;
    }

    /**
     * Gets the value of the confirmReplyTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmReplyTime() {
        return confirmReplyTime;
    }

    /**
     * Sets the value of the confirmReplyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmReplyTime(XMLGregorianCalendar value) {
        this.confirmReplyTime = value;
    }

    /**
     * Gets the value of the confirmRequestBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmRequestBy() {
        return confirmRequestBy;
    }

    /**
     * Sets the value of the confirmRequestBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmRequestBy(String value) {
        this.confirmRequestBy = value;
    }

    /**
     * Gets the value of the confirmRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmRequestTime() {
        return confirmRequestTime;
    }

    /**
     * Sets the value of the confirmRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmRequestTime(XMLGregorianCalendar value) {
        this.confirmRequestTime = value;
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
     * Gets the value of the maxTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTimes() {
        return maxTimes;
    }

    /**
     * Sets the value of the maxTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTimes(Integer value) {
        this.maxTimes = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmount(BigDecimal value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the offerParameter property.
     * 
     * @return
     *     possible object is
     *     {@link OfferParameter }
     *     
     */
    public OfferParameter getOfferParameter() {
        return offerParameter;
    }

    /**
     * Sets the value of the offerParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferParameter }
     *     
     */
    public void setOfferParameter(OfferParameter value) {
        this.offerParameter = value;
    }

    /**
     * Gets the value of the offerParameterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferParameterId() {
        return offerParameterId;
    }

    /**
     * Sets the value of the offerParameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferParameterId(Long value) {
        this.offerParameterId = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOfferType(OfferType value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaidDate(XMLGregorianCalendar value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the payFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayFlag() {
        return payFlag;
    }

    /**
     * Sets the value of the payFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayFlag(String value) {
        this.payFlag = value;
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
     * Gets the value of the queryParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryParam() {
        return queryParam;
    }

    /**
     * Sets the value of the queryParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryParam(String value) {
        this.queryParam = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the replyReportPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyReportPath() {
        return replyReportPath;
    }

    /**
     * Sets the value of the replyReportPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyReportPath(String value) {
        this.replyReportPath = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requestReportPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestReportPath() {
        return requestReportPath;
    }

    /**
     * Sets the value of the requestReportPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestReportPath(String value) {
        this.requestReportPath = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OfferBatchStatus }
     *     
     */
    public OfferBatchStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferBatchStatus }
     *     
     */
    public void setStatus(OfferBatchStatus value) {
        this.status = value;
    }

}
