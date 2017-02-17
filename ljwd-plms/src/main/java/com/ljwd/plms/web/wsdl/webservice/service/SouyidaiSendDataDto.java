
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for souyidaiSendDataDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="souyidaiSendDataDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="finanid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bidId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sentby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sentStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signingOutlets" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanComSelfId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanBidype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="periods" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="annualRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repayMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="edu" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chilrenNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nowAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasHouse" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasCar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasOtherLoan" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hasCreditCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactRelation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactMobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankUserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankCardId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankBranchName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentServiceFee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="income" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comMonthProfit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comEmNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comIndustry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comJoinDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comProvince" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comTelphone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comJob" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="comDepartment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="finansigntime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="senttime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="finanstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wbFinanid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="wbSendStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wbSendTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankVal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdNoSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctAmtSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctPeriodSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanPurposeValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark1Sou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custNameSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNoSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseHoldSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankNameSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankACSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctNoHeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guaranteeTypesSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productTypeSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeValAmtSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inquirySou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="daKuanSou" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "souyidaiSendDataDto")
public class SouyidaiSendDataDto {

    @XmlAttribute(name = "finanid")
    protected Long finanid;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "bidId")
    protected String bidId;
    @XmlAttribute(name = "sentby")
    protected String sentby;
    @XmlAttribute(name = "sentStatus")
    protected String sentStatus;
    @XmlAttribute(name = "uploadStatus")
    protected String uploadStatus;
    @XmlAttribute(name = "uploadTime")
    protected String uploadTime;
    @XmlAttribute(name = "uploadUser")
    protected String uploadUser;
    @XmlAttribute(name = "uploadFileName")
    protected String uploadFileName;
    @XmlAttribute(name = "errorInfo")
    protected String errorInfo;
    @XmlAttribute(name = "signingOutlets")
    protected String signingOutlets;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "companyId")
    protected String companyId;
    @XmlAttribute(name = "loanComSelfId")
    protected String loanComSelfId;
    @XmlAttribute(name = "loanBidype")
    protected String loanBidype;
    @XmlAttribute(name = "periods")
    protected String periods;
    @XmlAttribute(name = "amount")
    protected String amount;
    @XmlAttribute(name = "annualRate")
    protected String annualRate;
    @XmlAttribute(name = "repayMode")
    protected String repayMode;
    @XmlAttribute(name = "purpose")
    protected String purpose;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "cardId")
    protected String cardId;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "sex")
    protected String sex;
    @XmlAttribute(name = "birthday")
    protected String birthday;
    @XmlAttribute(name = "edu")
    protected String edu;
    @XmlAttribute(name = "marriage")
    protected String marriage;
    @XmlAttribute(name = "jobType")
    protected String jobType;
    @XmlAttribute(name = "chilrenNum")
    protected String chilrenNum;
    @XmlAttribute(name = "registAddress")
    protected String registAddress;
    @XmlAttribute(name = "nowAddress")
    protected String nowAddress;
    @XmlAttribute(name = "hasHouse")
    protected String hasHouse;
    @XmlAttribute(name = "hasCar")
    protected String hasCar;
    @XmlAttribute(name = "hasOtherLoan")
    protected String hasOtherLoan;
    @XmlAttribute(name = "hasCreditCard")
    protected String hasCreditCard;
    @XmlAttribute(name = "contactName")
    protected String contactName;
    @XmlAttribute(name = "contactRelation")
    protected String contactRelation;
    @XmlAttribute(name = "contactMobile")
    protected String contactMobile;
    @XmlAttribute(name = "bankUserName")
    protected String bankUserName;
    @XmlAttribute(name = "bankCardId")
    protected String bankCardId;
    @XmlAttribute(name = "bankName")
    protected String bankName;
    @XmlAttribute(name = "bankBranchName")
    protected String bankBranchName;
    @XmlAttribute(name = "bankCity")
    protected String bankCity;
    @XmlAttribute(name = "paymentServiceFee")
    protected String paymentServiceFee;
    @XmlAttribute(name = "income")
    protected String income;
    @XmlAttribute(name = "comMonthProfit")
    protected String comMonthProfit;
    @XmlAttribute(name = "comEmNum")
    protected String comEmNum;
    @XmlAttribute(name = "comIndustry")
    protected String comIndustry;
    @XmlAttribute(name = "comType")
    protected String comType;
    @XmlAttribute(name = "comJoinDate")
    protected String comJoinDate;
    @XmlAttribute(name = "companyName")
    protected String companyName;
    @XmlAttribute(name = "comProvince")
    protected String comProvince;
    @XmlAttribute(name = "comCity")
    protected String comCity;
    @XmlAttribute(name = "comAddress")
    protected String comAddress;
    @XmlAttribute(name = "comTelphone")
    protected String comTelphone;
    @XmlAttribute(name = "comJob")
    protected String comJob;
    @XmlAttribute(name = "comDepartment")
    protected String comDepartment;
    @XmlAttribute(name = "finansigntime")
    protected String finansigntime;
    @XmlAttribute(name = "senttime")
    protected String senttime;
    @XmlAttribute(name = "finanstatus")
    protected String finanstatus;
    @XmlAttribute(name = "wbFinanid")
    protected Long wbFinanid;
    @XmlAttribute(name = "wbSendStatus")
    protected String wbSendStatus;
    @XmlAttribute(name = "wbSendTime")
    protected String wbSendTime;
    @XmlAttribute(name = "bankVal")
    protected String bankVal;
    @XmlAttribute(name = "bankAC")
    protected String bankAC;
    @XmlAttribute(name = "prdNoSou")
    protected String prdNoSou;
    @XmlAttribute(name = "cntrctNoSou")
    protected String cntrctNoSou;
    @XmlAttribute(name = "cntrctAmtSou")
    protected String cntrctAmtSou;
    @XmlAttribute(name = "cntrctPeriodSou")
    protected String cntrctPeriodSou;
    @XmlAttribute(name = "loanPurposeValSou")
    protected String loanPurposeValSou;
    @XmlAttribute(name = "remark1Sou")
    protected String remark1Sou;
    @XmlAttribute(name = "custNameSou")
    protected String custNameSou;
    @XmlAttribute(name = "idCardNoSou")
    protected String idCardNoSou;
    @XmlAttribute(name = "houseHoldSou")
    protected String houseHoldSou;
    @XmlAttribute(name = "bankNameSou")
    protected String bankNameSou;
    @XmlAttribute(name = "bankValSou")
    protected String bankValSou;
    @XmlAttribute(name = "bankACSou")
    protected String bankACSou;
    @XmlAttribute(name = "cntrctNoHeSou")
    protected String cntrctNoHeSou;
    @XmlAttribute(name = "guaranteeTypesSou")
    protected String guaranteeTypesSou;
    @XmlAttribute(name = "productTypeSou")
    protected String productTypeSou;
    @XmlAttribute(name = "codeValSou")
    protected String codeValSou;
    @XmlAttribute(name = "codeValAmtSou")
    protected String codeValAmtSou;
    @XmlAttribute(name = "inquirySou")
    protected String inquirySou;
    @XmlAttribute(name = "daKuanSou")
    protected String daKuanSou;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;

    /**
     * Gets the value of the finanid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanid() {
        return finanid;
    }

    /**
     * Sets the value of the finanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanid(Long value) {
        this.finanid = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the bidId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidId() {
        return bidId;
    }

    /**
     * Sets the value of the bidId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidId(String value) {
        this.bidId = value;
    }

    /**
     * Gets the value of the sentby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentby() {
        return sentby;
    }

    /**
     * Sets the value of the sentby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentby(String value) {
        this.sentby = value;
    }

    /**
     * Gets the value of the sentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentStatus() {
        return sentStatus;
    }

    /**
     * Sets the value of the sentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentStatus(String value) {
        this.sentStatus = value;
    }

    /**
     * Gets the value of the uploadStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadStatus() {
        return uploadStatus;
    }

    /**
     * Sets the value of the uploadStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadStatus(String value) {
        this.uploadStatus = value;
    }

    /**
     * Gets the value of the uploadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadTime() {
        return uploadTime;
    }

    /**
     * Sets the value of the uploadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadTime(String value) {
        this.uploadTime = value;
    }

    /**
     * Gets the value of the uploadUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadUser() {
        return uploadUser;
    }

    /**
     * Sets the value of the uploadUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadUser(String value) {
        this.uploadUser = value;
    }

    /**
     * Gets the value of the uploadFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadFileName() {
        return uploadFileName;
    }

    /**
     * Sets the value of the uploadFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadFileName(String value) {
        this.uploadFileName = value;
    }

    /**
     * Gets the value of the errorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * Sets the value of the errorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorInfo(String value) {
        this.errorInfo = value;
    }

    /**
     * Gets the value of the signingOutlets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningOutlets() {
        return signingOutlets;
    }

    /**
     * Sets the value of the signingOutlets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningOutlets(String value) {
        this.signingOutlets = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the loanComSelfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanComSelfId() {
        return loanComSelfId;
    }

    /**
     * Sets the value of the loanComSelfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanComSelfId(String value) {
        this.loanComSelfId = value;
    }

    /**
     * Gets the value of the loanBidype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanBidype() {
        return loanBidype;
    }

    /**
     * Sets the value of the loanBidype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanBidype(String value) {
        this.loanBidype = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriods(String value) {
        this.periods = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the annualRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnualRate() {
        return annualRate;
    }

    /**
     * Sets the value of the annualRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualRate(String value) {
        this.annualRate = value;
    }

    /**
     * Gets the value of the repayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayMode() {
        return repayMode;
    }

    /**
     * Sets the value of the repayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayMode(String value) {
        this.repayMode = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the edu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdu() {
        return edu;
    }

    /**
     * Sets the value of the edu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdu(String value) {
        this.edu = value;
    }

    /**
     * Gets the value of the marriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * Sets the value of the marriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage(String value) {
        this.marriage = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the chilrenNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChilrenNum() {
        return chilrenNum;
    }

    /**
     * Sets the value of the chilrenNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChilrenNum(String value) {
        this.chilrenNum = value;
    }

    /**
     * Gets the value of the registAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistAddress() {
        return registAddress;
    }

    /**
     * Sets the value of the registAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistAddress(String value) {
        this.registAddress = value;
    }

    /**
     * Gets the value of the nowAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNowAddress() {
        return nowAddress;
    }

    /**
     * Sets the value of the nowAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNowAddress(String value) {
        this.nowAddress = value;
    }

    /**
     * Gets the value of the hasHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasHouse() {
        return hasHouse;
    }

    /**
     * Sets the value of the hasHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasHouse(String value) {
        this.hasHouse = value;
    }

    /**
     * Gets the value of the hasCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasCar() {
        return hasCar;
    }

    /**
     * Sets the value of the hasCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasCar(String value) {
        this.hasCar = value;
    }

    /**
     * Gets the value of the hasOtherLoan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasOtherLoan() {
        return hasOtherLoan;
    }

    /**
     * Sets the value of the hasOtherLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasOtherLoan(String value) {
        this.hasOtherLoan = value;
    }

    /**
     * Gets the value of the hasCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasCreditCard() {
        return hasCreditCard;
    }

    /**
     * Sets the value of the hasCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasCreditCard(String value) {
        this.hasCreditCard = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRelation() {
        return contactRelation;
    }

    /**
     * Sets the value of the contactRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRelation(String value) {
        this.contactRelation = value;
    }

    /**
     * Gets the value of the contactMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * Sets the value of the contactMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * Gets the value of the bankUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankUserName() {
        return bankUserName;
    }

    /**
     * Sets the value of the bankUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankUserName(String value) {
        this.bankUserName = value;
    }

    /**
     * Gets the value of the bankCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCardId() {
        return bankCardId;
    }

    /**
     * Sets the value of the bankCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCardId(String value) {
        this.bankCardId = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBranchName() {
        return bankBranchName;
    }

    /**
     * Sets the value of the bankBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBranchName(String value) {
        this.bankBranchName = value;
    }

    /**
     * Gets the value of the bankCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * Sets the value of the bankCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCity(String value) {
        this.bankCity = value;
    }

    /**
     * Gets the value of the paymentServiceFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceFee() {
        return paymentServiceFee;
    }

    /**
     * Sets the value of the paymentServiceFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceFee(String value) {
        this.paymentServiceFee = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncome(String value) {
        this.income = value;
    }

    /**
     * Gets the value of the comMonthProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComMonthProfit() {
        return comMonthProfit;
    }

    /**
     * Sets the value of the comMonthProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComMonthProfit(String value) {
        this.comMonthProfit = value;
    }

    /**
     * Gets the value of the comEmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComEmNum() {
        return comEmNum;
    }

    /**
     * Sets the value of the comEmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComEmNum(String value) {
        this.comEmNum = value;
    }

    /**
     * Gets the value of the comIndustry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComIndustry() {
        return comIndustry;
    }

    /**
     * Sets the value of the comIndustry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComIndustry(String value) {
        this.comIndustry = value;
    }

    /**
     * Gets the value of the comType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComType() {
        return comType;
    }

    /**
     * Sets the value of the comType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComType(String value) {
        this.comType = value;
    }

    /**
     * Gets the value of the comJoinDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComJoinDate() {
        return comJoinDate;
    }

    /**
     * Sets the value of the comJoinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComJoinDate(String value) {
        this.comJoinDate = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the comProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComProvince() {
        return comProvince;
    }

    /**
     * Sets the value of the comProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComProvince(String value) {
        this.comProvince = value;
    }

    /**
     * Gets the value of the comCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComCity() {
        return comCity;
    }

    /**
     * Sets the value of the comCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComCity(String value) {
        this.comCity = value;
    }

    /**
     * Gets the value of the comAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComAddress() {
        return comAddress;
    }

    /**
     * Sets the value of the comAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComAddress(String value) {
        this.comAddress = value;
    }

    /**
     * Gets the value of the comTelphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComTelphone() {
        return comTelphone;
    }

    /**
     * Sets the value of the comTelphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComTelphone(String value) {
        this.comTelphone = value;
    }

    /**
     * Gets the value of the comJob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComJob() {
        return comJob;
    }

    /**
     * Sets the value of the comJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComJob(String value) {
        this.comJob = value;
    }

    /**
     * Gets the value of the comDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComDepartment() {
        return comDepartment;
    }

    /**
     * Sets the value of the comDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComDepartment(String value) {
        this.comDepartment = value;
    }

    /**
     * Gets the value of the finansigntime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinansigntime() {
        return finansigntime;
    }

    /**
     * Sets the value of the finansigntime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinansigntime(String value) {
        this.finansigntime = value;
    }

    /**
     * Gets the value of the senttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenttime() {
        return senttime;
    }

    /**
     * Sets the value of the senttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenttime(String value) {
        this.senttime = value;
    }

    /**
     * Gets the value of the finanstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanstatus() {
        return finanstatus;
    }

    /**
     * Sets the value of the finanstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanstatus(String value) {
        this.finanstatus = value;
    }

    /**
     * Gets the value of the wbFinanid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWbFinanid() {
        return wbFinanid;
    }

    /**
     * Sets the value of the wbFinanid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWbFinanid(Long value) {
        this.wbFinanid = value;
    }

    /**
     * Gets the value of the wbSendStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWbSendStatus() {
        return wbSendStatus;
    }

    /**
     * Sets the value of the wbSendStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWbSendStatus(String value) {
        this.wbSendStatus = value;
    }

    /**
     * Gets the value of the wbSendTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWbSendTime() {
        return wbSendTime;
    }

    /**
     * Sets the value of the wbSendTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWbSendTime(String value) {
        this.wbSendTime = value;
    }

    /**
     * Gets the value of the bankVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankVal() {
        return bankVal;
    }

    /**
     * Sets the value of the bankVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankVal(String value) {
        this.bankVal = value;
    }

    /**
     * Gets the value of the bankAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAC() {
        return bankAC;
    }

    /**
     * Sets the value of the bankAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAC(String value) {
        this.bankAC = value;
    }

    /**
     * Gets the value of the prdNoSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdNoSou() {
        return prdNoSou;
    }

    /**
     * Sets the value of the prdNoSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdNoSou(String value) {
        this.prdNoSou = value;
    }

    /**
     * Gets the value of the cntrctNoSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoSou() {
        return cntrctNoSou;
    }

    /**
     * Sets the value of the cntrctNoSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoSou(String value) {
        this.cntrctNoSou = value;
    }

    /**
     * Gets the value of the cntrctAmtSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctAmtSou() {
        return cntrctAmtSou;
    }

    /**
     * Sets the value of the cntrctAmtSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctAmtSou(String value) {
        this.cntrctAmtSou = value;
    }

    /**
     * Gets the value of the cntrctPeriodSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctPeriodSou() {
        return cntrctPeriodSou;
    }

    /**
     * Sets the value of the cntrctPeriodSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctPeriodSou(String value) {
        this.cntrctPeriodSou = value;
    }

    /**
     * Gets the value of the loanPurposeValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurposeValSou() {
        return loanPurposeValSou;
    }

    /**
     * Sets the value of the loanPurposeValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurposeValSou(String value) {
        this.loanPurposeValSou = value;
    }

    /**
     * Gets the value of the remark1Sou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark1Sou() {
        return remark1Sou;
    }

    /**
     * Sets the value of the remark1Sou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark1Sou(String value) {
        this.remark1Sou = value;
    }

    /**
     * Gets the value of the custNameSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNameSou() {
        return custNameSou;
    }

    /**
     * Sets the value of the custNameSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNameSou(String value) {
        this.custNameSou = value;
    }

    /**
     * Gets the value of the idCardNoSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNoSou() {
        return idCardNoSou;
    }

    /**
     * Sets the value of the idCardNoSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNoSou(String value) {
        this.idCardNoSou = value;
    }

    /**
     * Gets the value of the houseHoldSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseHoldSou() {
        return houseHoldSou;
    }

    /**
     * Sets the value of the houseHoldSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseHoldSou(String value) {
        this.houseHoldSou = value;
    }

    /**
     * Gets the value of the bankNameSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNameSou() {
        return bankNameSou;
    }

    /**
     * Sets the value of the bankNameSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNameSou(String value) {
        this.bankNameSou = value;
    }

    /**
     * Gets the value of the bankValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankValSou() {
        return bankValSou;
    }

    /**
     * Sets the value of the bankValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankValSou(String value) {
        this.bankValSou = value;
    }

    /**
     * Gets the value of the bankACSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankACSou() {
        return bankACSou;
    }

    /**
     * Sets the value of the bankACSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankACSou(String value) {
        this.bankACSou = value;
    }

    /**
     * Gets the value of the cntrctNoHeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNoHeSou() {
        return cntrctNoHeSou;
    }

    /**
     * Sets the value of the cntrctNoHeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNoHeSou(String value) {
        this.cntrctNoHeSou = value;
    }

    /**
     * Gets the value of the guaranteeTypesSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypesSou() {
        return guaranteeTypesSou;
    }

    /**
     * Sets the value of the guaranteeTypesSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypesSou(String value) {
        this.guaranteeTypesSou = value;
    }

    /**
     * Gets the value of the productTypeSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeSou() {
        return productTypeSou;
    }

    /**
     * Sets the value of the productTypeSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeSou(String value) {
        this.productTypeSou = value;
    }

    /**
     * Gets the value of the codeValSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValSou() {
        return codeValSou;
    }

    /**
     * Sets the value of the codeValSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValSou(String value) {
        this.codeValSou = value;
    }

    /**
     * Gets the value of the codeValAmtSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeValAmtSou() {
        return codeValAmtSou;
    }

    /**
     * Sets the value of the codeValAmtSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeValAmtSou(String value) {
        this.codeValAmtSou = value;
    }

    /**
     * Gets the value of the inquirySou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquirySou() {
        return inquirySou;
    }

    /**
     * Sets the value of the inquirySou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquirySou(String value) {
        this.inquirySou = value;
    }

    /**
     * Gets the value of the daKuanSou property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaKuanSou() {
        return daKuanSou;
    }

    /**
     * Sets the value of the daKuanSou property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaKuanSou(String value) {
        this.daKuanSou = value;
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

}
