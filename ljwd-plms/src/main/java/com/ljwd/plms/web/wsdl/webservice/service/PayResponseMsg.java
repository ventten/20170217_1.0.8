
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for payResponseMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payResponseMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="collectTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payRequestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payResponseItemMsgList" type="{http://webservice.loan.mfbms.flinkmf.com/}payResponseItemMsg" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="payResponseMsgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refTxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="responseUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}payRequestStatus" minOccurs="0"/>
 *         &lt;element name="successCollectTimes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalActualAccountNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="totalActualAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payResponseMsg", propOrder = {
    "businessCode",
    "channelCode",
    "checkDate",
    "clearDate",
    "collectTimes",
    "isSent",
    "payRequestNo",
    "payResponseItemMsgList",
    "payResponseMsgId",
    "refStatus",
    "refTxNo",
    "requestDate",
    "responseUrl",
    "status",
    "successCollectTimes",
    "totalActualAccountNumber",
    "totalActualAmount"
})
public class PayResponseMsg {

    protected String businessCode;
    protected String channelCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearDate;
    protected Integer collectTimes;
    protected Boolean isSent;
    protected String payRequestNo;
    @XmlElement(nillable = true)
    protected List<PayResponseItemMsg> payResponseItemMsgList;
    protected Long payResponseMsgId;
    protected String refStatus;
    protected String refTxNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    protected String responseUrl;
    protected PayRequestStatus status;
    protected Integer successCollectTimes;
    protected Integer totalActualAccountNumber;
    protected BigDecimal totalActualAmount;

    /**
     * Gets the value of the businessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * Sets the value of the businessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCode(String value) {
        this.businessCode = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the checkDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckDate() {
        return checkDate;
    }

    /**
     * Sets the value of the checkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckDate(XMLGregorianCalendar value) {
        this.checkDate = value;
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
     * Gets the value of the collectTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCollectTimes() {
        return collectTimes;
    }

    /**
     * Sets the value of the collectTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCollectTimes(Integer value) {
        this.collectTimes = value;
    }

    /**
     * Gets the value of the isSent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSent() {
        return isSent;
    }

    /**
     * Sets the value of the isSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSent(Boolean value) {
        this.isSent = value;
    }

    /**
     * Gets the value of the payRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayRequestNo() {
        return payRequestNo;
    }

    /**
     * Sets the value of the payRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayRequestNo(String value) {
        this.payRequestNo = value;
    }

    /**
     * Gets the value of the payResponseItemMsgList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payResponseItemMsgList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayResponseItemMsgList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayResponseItemMsg }
     * 
     * 
     */
    public List<PayResponseItemMsg> getPayResponseItemMsgList() {
        if (payResponseItemMsgList == null) {
            payResponseItemMsgList = new ArrayList<PayResponseItemMsg>();
        }
        return this.payResponseItemMsgList;
    }

    /**
     * Gets the value of the payResponseMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayResponseMsgId() {
        return payResponseMsgId;
    }

    /**
     * Sets the value of the payResponseMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayResponseMsgId(Long value) {
        this.payResponseMsgId = value;
    }

    /**
     * Gets the value of the refStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefStatus() {
        return refStatus;
    }

    /**
     * Sets the value of the refStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefStatus(String value) {
        this.refStatus = value;
    }

    /**
     * Gets the value of the refTxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTxNo() {
        return refTxNo;
    }

    /**
     * Sets the value of the refTxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTxNo(String value) {
        this.refTxNo = value;
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
     * Gets the value of the responseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseUrl() {
        return responseUrl;
    }

    /**
     * Sets the value of the responseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseUrl(String value) {
        this.responseUrl = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PayRequestStatus }
     *     
     */
    public PayRequestStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRequestStatus }
     *     
     */
    public void setStatus(PayRequestStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the successCollectTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessCollectTimes() {
        return successCollectTimes;
    }

    /**
     * Sets the value of the successCollectTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessCollectTimes(Integer value) {
        this.successCollectTimes = value;
    }

    /**
     * Gets the value of the totalActualAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalActualAccountNumber() {
        return totalActualAccountNumber;
    }

    /**
     * Sets the value of the totalActualAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalActualAccountNumber(Integer value) {
        this.totalActualAccountNumber = value;
    }

    /**
     * Gets the value of the totalActualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalActualAmount() {
        return totalActualAmount;
    }

    /**
     * Sets the value of the totalActualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalActualAmount(BigDecimal value) {
        this.totalActualAmount = value;
    }

}
