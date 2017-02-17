
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for advanceReceivedDetailSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advanceReceivedDetailSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="repaymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="advanceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="txDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="handledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handleTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="action" type="{http://webservice.loan.mfbms.flinkmf.com/}advanceReceivedAction" minOccurs="0"/>
 *         &lt;element name="status" type="{http://webservice.loan.mfbms.flinkmf.com/}recordStatus" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundRepaymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerReplyDetailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="repaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="txAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="postAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="depositeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reversedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reverseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reverseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="refundReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advanceReceivedDetailSearchResultDto", propOrder = {
    "id",
    "repaymentId",
    "contractId",
    "applicationId",
    "paymentId",
    "advanceAmount",
    "txDate",
    "handledBy",
    "handleTime",
    "action",
    "status",
    "remark",
    "contractNo",
    "clientName",
    "idCardNo",
    "refundRepaymentId",
    "offerReplyDetailId",
    "repaymentMethod",
    "inputBy",
    "inputTime",
    "txAmount",
    "refundAmount",
    "postAmount",
    "depositeDate",
    "reversedBy",
    "reverseTime",
    "reverseReason",
    "refundBy",
    "refundTime",
    "refundReason",
    "collectCost"
})
public class AdvanceReceivedDetailSearchResultDto {

    protected Long id;
    protected Long repaymentId;
    protected Long contractId;
    protected Long applicationId;
    protected Long paymentId;
    protected BigDecimal advanceAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txDate;
    protected String handledBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar handleTime;
    protected AdvanceReceivedAction action;
    protected RecordStatus status;
    protected String remark;
    protected String contractNo;
    protected String clientName;
    protected String idCardNo;
    protected Long refundRepaymentId;
    protected Long offerReplyDetailId;
    protected String repaymentMethod;
    protected String inputBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inputTime;
    protected BigDecimal txAmount;
    protected BigDecimal refundAmount;
    protected BigDecimal postAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depositeDate;
    protected String reversedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reverseTime;
    protected String reverseReason;
    protected String refundBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundTime;
    protected String refundReason;
    protected BigDecimal collectCost;

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
     * Gets the value of the repaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRepaymentId() {
        return repaymentId;
    }

    /**
     * Sets the value of the repaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRepaymentId(Long value) {
        this.repaymentId = value;
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
     * Gets the value of the advanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * Sets the value of the advanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdvanceAmount(BigDecimal value) {
        this.advanceAmount = value;
    }

    /**
     * Gets the value of the txDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDate() {
        return txDate;
    }

    /**
     * Sets the value of the txDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDate(XMLGregorianCalendar value) {
        this.txDate = value;
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
     * Gets the value of the handleTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHandleTime() {
        return handleTime;
    }

    /**
     * Sets the value of the handleTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHandleTime(XMLGregorianCalendar value) {
        this.handleTime = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceReceivedAction }
     *     
     */
    public AdvanceReceivedAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceReceivedAction }
     *     
     */
    public void setAction(AdvanceReceivedAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link RecordStatus }
     *     
     */
    public RecordStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordStatus }
     *     
     */
    public void setStatus(RecordStatus value) {
        this.status = value;
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
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
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
     * Gets the value of the refundRepaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefundRepaymentId() {
        return refundRepaymentId;
    }

    /**
     * Sets the value of the refundRepaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefundRepaymentId(Long value) {
        this.refundRepaymentId = value;
    }

    /**
     * Gets the value of the offerReplyDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferReplyDetailId() {
        return offerReplyDetailId;
    }

    /**
     * Sets the value of the offerReplyDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferReplyDetailId(Long value) {
        this.offerReplyDetailId = value;
    }

    /**
     * Gets the value of the repaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentMethod() {
        return repaymentMethod;
    }

    /**
     * Sets the value of the repaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentMethod(String value) {
        this.repaymentMethod = value;
    }

    /**
     * Gets the value of the inputBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBy() {
        return inputBy;
    }

    /**
     * Sets the value of the inputBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBy(String value) {
        this.inputBy = value;
    }

    /**
     * Gets the value of the inputTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputTime() {
        return inputTime;
    }

    /**
     * Sets the value of the inputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInputTime(XMLGregorianCalendar value) {
        this.inputTime = value;
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
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundAmount(BigDecimal value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the postAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostAmount() {
        return postAmount;
    }

    /**
     * Sets the value of the postAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostAmount(BigDecimal value) {
        this.postAmount = value;
    }

    /**
     * Gets the value of the depositeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositeDate() {
        return depositeDate;
    }

    /**
     * Sets the value of the depositeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositeDate(XMLGregorianCalendar value) {
        this.depositeDate = value;
    }

    /**
     * Gets the value of the reversedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversedBy() {
        return reversedBy;
    }

    /**
     * Sets the value of the reversedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversedBy(String value) {
        this.reversedBy = value;
    }

    /**
     * Gets the value of the reverseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReverseTime() {
        return reverseTime;
    }

    /**
     * Sets the value of the reverseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReverseTime(XMLGregorianCalendar value) {
        this.reverseTime = value;
    }

    /**
     * Gets the value of the reverseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReverseReason() {
        return reverseReason;
    }

    /**
     * Sets the value of the reverseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReverseReason(String value) {
        this.reverseReason = value;
    }

    /**
     * Gets the value of the refundBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundBy() {
        return refundBy;
    }

    /**
     * Sets the value of the refundBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundBy(String value) {
        this.refundBy = value;
    }

    /**
     * Gets the value of the refundTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundTime() {
        return refundTime;
    }

    /**
     * Sets the value of the refundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundTime(XMLGregorianCalendar value) {
        this.refundTime = value;
    }

    /**
     * Gets the value of the refundReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * Sets the value of the refundReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
    }

    /**
     * Gets the value of the collectCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectCost() {
        return collectCost;
    }

    /**
     * Sets the value of the collectCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectCost(BigDecimal value) {
        this.collectCost = value;
    }

}
