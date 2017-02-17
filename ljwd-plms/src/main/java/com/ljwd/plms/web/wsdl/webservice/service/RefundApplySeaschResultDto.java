
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundApplySeaschResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundApplySeaschResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rpmntid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refundid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundamt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applyby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundRpmntId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refundReceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankAc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refundBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundApplySeaschResultDto", propOrder = {
    "rpmntid",
    "applicationid",
    "paymentid",
    "refundid",
    "contractno",
    "clientname",
    "idcardno",
    "repaymentMethod",
    "txdate",
    "txamount",
    "refundamt",
    "applyby",
    "applytime",
    "reviewby",
    "reviewtime",
    "status",
    "remark",
    "refuseReason",
    "confirmBy",
    "confirmTime",
    "refundDate",
    "refundType",
    "refundRpmntId",
    "refundReceId",
    "bankAc",
    "bankCode",
    "refundBankCode"
})
public class RefundApplySeaschResultDto {

    protected Long rpmntid;
    protected Long applicationid;
    protected Long paymentid;
    protected Long refundid;
    protected String contractno;
    protected String clientname;
    protected String idcardno;
    protected String repaymentMethod;
    protected String txdate;
    protected BigDecimal txamount;
    protected BigDecimal refundamt;
    protected String applyby;
    protected String applytime;
    protected String reviewby;
    protected String reviewtime;
    protected String status;
    protected String remark;
    protected String refuseReason;
    protected String confirmBy;
    protected String confirmTime;
    protected String refundDate;
    protected String refundType;
    protected Long refundRpmntId;
    protected String refundReceId;
    protected String bankAc;
    @XmlElement(name = "BankCode")
    protected String bankCode;
    protected String refundBankCode;

    /**
     * Gets the value of the rpmntid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRpmntid() {
        return rpmntid;
    }

    /**
     * Sets the value of the rpmntid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRpmntid(Long value) {
        this.rpmntid = value;
    }

    /**
     * Gets the value of the applicationid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationid() {
        return applicationid;
    }

    /**
     * Sets the value of the applicationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationid(Long value) {
        this.applicationid = value;
    }

    /**
     * Gets the value of the paymentid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentid() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentid(Long value) {
        this.paymentid = value;
    }

    /**
     * Gets the value of the refundid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefundid() {
        return refundid;
    }

    /**
     * Sets the value of the refundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefundid(Long value) {
        this.refundid = value;
    }

    /**
     * Gets the value of the contractno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractno() {
        return contractno;
    }

    /**
     * Sets the value of the contractno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractno(String value) {
        this.contractno = value;
    }

    /**
     * Gets the value of the clientname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientname() {
        return clientname;
    }

    /**
     * Sets the value of the clientname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientname(String value) {
        this.clientname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
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
     * Gets the value of the txdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxdate() {
        return txdate;
    }

    /**
     * Sets the value of the txdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxdate(String value) {
        this.txdate = value;
    }

    /**
     * Gets the value of the txamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTxamount() {
        return txamount;
    }

    /**
     * Sets the value of the txamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTxamount(BigDecimal value) {
        this.txamount = value;
    }

    /**
     * Gets the value of the refundamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundamt() {
        return refundamt;
    }

    /**
     * Sets the value of the refundamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundamt(BigDecimal value) {
        this.refundamt = value;
    }

    /**
     * Gets the value of the applyby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyby() {
        return applyby;
    }

    /**
     * Sets the value of the applyby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyby(String value) {
        this.applyby = value;
    }

    /**
     * Gets the value of the applytime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplytime() {
        return applytime;
    }

    /**
     * Sets the value of the applytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplytime(String value) {
        this.applytime = value;
    }

    /**
     * Gets the value of the reviewby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewby() {
        return reviewby;
    }

    /**
     * Sets the value of the reviewby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewby(String value) {
        this.reviewby = value;
    }

    /**
     * Gets the value of the reviewtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewtime() {
        return reviewtime;
    }

    /**
     * Sets the value of the reviewtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewtime(String value) {
        this.reviewtime = value;
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
     * Gets the value of the refuseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefuseReason() {
        return refuseReason;
    }

    /**
     * Sets the value of the refuseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefuseReason(String value) {
        this.refuseReason = value;
    }

    /**
     * Gets the value of the confirmBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmBy() {
        return confirmBy;
    }

    /**
     * Sets the value of the confirmBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmBy(String value) {
        this.confirmBy = value;
    }

    /**
     * Gets the value of the confirmTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmTime() {
        return confirmTime;
    }

    /**
     * Sets the value of the confirmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmTime(String value) {
        this.confirmTime = value;
    }

    /**
     * Gets the value of the refundDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundDate() {
        return refundDate;
    }

    /**
     * Sets the value of the refundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundDate(String value) {
        this.refundDate = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the refundRpmntId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefundRpmntId() {
        return refundRpmntId;
    }

    /**
     * Sets the value of the refundRpmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefundRpmntId(Long value) {
        this.refundRpmntId = value;
    }

    /**
     * Gets the value of the refundReceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReceId() {
        return refundReceId;
    }

    /**
     * Sets the value of the refundReceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundReceId(String value) {
        this.refundReceId = value;
    }

    /**
     * Gets the value of the bankAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAc() {
        return bankAc;
    }

    /**
     * Sets the value of the bankAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAc(String value) {
        this.bankAc = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the refundBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundBankCode() {
        return refundBankCode;
    }

    /**
     * Sets the value of the refundBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundBankCode(String value) {
        this.refundBankCode = value;
    }

}
