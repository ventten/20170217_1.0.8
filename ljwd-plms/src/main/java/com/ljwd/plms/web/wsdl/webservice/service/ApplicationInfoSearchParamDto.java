
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfoSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applyDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="customerManager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="submitDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rejectDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rejectDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cancelDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cancelDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="checkStep" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkStepDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="checkStepDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="checkLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkLevelDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="checkLevelDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="taskStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputtedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taskResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveyDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="surveylDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="handleByUser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isReviewed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="channel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voidDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="voidDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="subStatusList">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="businessCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoSearchParamDto")
public class ApplicationInfoSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "idTypeCode")
    protected String idTypeCode;
    @XmlAttribute(name = "loanStatus")
    protected String loanStatus;
    @XmlAttribute(name = "applyDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDateFrom;
    @XmlAttribute(name = "applyDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applyDateTo;
    @XmlAttribute(name = "customerManager")
    protected String customerManager;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "submitStatus")
    protected String submitStatus;
    @XmlAttribute(name = "submitDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDateFrom;
    @XmlAttribute(name = "submitDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDateTo;
    @XmlAttribute(name = "rejectDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rejectDateFrom;
    @XmlAttribute(name = "rejectDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rejectDateTo;
    @XmlAttribute(name = "cancelDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDateFrom;
    @XmlAttribute(name = "cancelDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelDateTo;
    @XmlAttribute(name = "checkStep")
    protected String checkStep;
    @XmlAttribute(name = "checkStepDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkStepDateFrom;
    @XmlAttribute(name = "checkStepDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkStepDateTo;
    @XmlAttribute(name = "checkLevel")
    protected String checkLevel;
    @XmlAttribute(name = "checkLevelDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkLevelDateFrom;
    @XmlAttribute(name = "checkLevelDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkLevelDateTo;
    @XmlAttribute(name = "taskStatus")
    protected String taskStatus;
    @XmlAttribute(name = "subStatus")
    protected String subStatus;
    @XmlAttribute(name = "inputtedBy")
    protected String inputtedBy;
    @XmlAttribute(name = "taskResult")
    protected String taskResult;
    @XmlAttribute(name = "surveyDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar surveyDateFrom;
    @XmlAttribute(name = "surveylDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar surveylDateTo;
    @XmlAttribute(name = "handleByUser")
    protected String handleByUser;
    @XmlAttribute(name = "isReviewed")
    protected Boolean isReviewed;
    @XmlAttribute(name = "channel")
    protected String channel;
    @XmlAttribute(name = "voidDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidDateFrom;
    @XmlAttribute(name = "voidDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidDateTo;
    @XmlAttribute(name = "subStatusList")
    protected List<String> subStatusList;
    @XmlAttribute(name = "businessCategory")
    protected String businessCategory;
    @XmlAttribute(name = "payType")
    protected String payType;
    @XmlAttribute(name = "inputSiteCode")
    protected String inputSiteCode;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the applyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the value of the applyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyCode(String value) {
        this.applyCode = value;
    }

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
     * Gets the value of the idTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypeCode() {
        return idTypeCode;
    }

    /**
     * Sets the value of the idTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypeCode(String value) {
        this.idTypeCode = value;
    }

    /**
     * Gets the value of the loanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * Sets the value of the loanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanStatus(String value) {
        this.loanStatus = value;
    }

    /**
     * Gets the value of the applyDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDateFrom() {
        return applyDateFrom;
    }

    /**
     * Sets the value of the applyDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDateFrom(XMLGregorianCalendar value) {
        this.applyDateFrom = value;
    }

    /**
     * Gets the value of the applyDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDateTo() {
        return applyDateTo;
    }

    /**
     * Sets the value of the applyDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDateTo(XMLGregorianCalendar value) {
        this.applyDateTo = value;
    }

    /**
     * Gets the value of the customerManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerManager() {
        return customerManager;
    }

    /**
     * Sets the value of the customerManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerManager(String value) {
        this.customerManager = value;
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
     * Gets the value of the submitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitStatus() {
        return submitStatus;
    }

    /**
     * Sets the value of the submitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitStatus(String value) {
        this.submitStatus = value;
    }

    /**
     * Gets the value of the submitDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDateFrom() {
        return submitDateFrom;
    }

    /**
     * Sets the value of the submitDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDateFrom(XMLGregorianCalendar value) {
        this.submitDateFrom = value;
    }

    /**
     * Gets the value of the submitDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDateTo() {
        return submitDateTo;
    }

    /**
     * Sets the value of the submitDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDateTo(XMLGregorianCalendar value) {
        this.submitDateTo = value;
    }

    /**
     * Gets the value of the rejectDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectDateFrom() {
        return rejectDateFrom;
    }

    /**
     * Sets the value of the rejectDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectDateFrom(XMLGregorianCalendar value) {
        this.rejectDateFrom = value;
    }

    /**
     * Gets the value of the rejectDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectDateTo() {
        return rejectDateTo;
    }

    /**
     * Sets the value of the rejectDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectDateTo(XMLGregorianCalendar value) {
        this.rejectDateTo = value;
    }

    /**
     * Gets the value of the cancelDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDateFrom() {
        return cancelDateFrom;
    }

    /**
     * Sets the value of the cancelDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDateFrom(XMLGregorianCalendar value) {
        this.cancelDateFrom = value;
    }

    /**
     * Gets the value of the cancelDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelDateTo() {
        return cancelDateTo;
    }

    /**
     * Sets the value of the cancelDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelDateTo(XMLGregorianCalendar value) {
        this.cancelDateTo = value;
    }

    /**
     * Gets the value of the checkStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStep() {
        return checkStep;
    }

    /**
     * Sets the value of the checkStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStep(String value) {
        this.checkStep = value;
    }

    /**
     * Gets the value of the checkStepDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckStepDateFrom() {
        return checkStepDateFrom;
    }

    /**
     * Sets the value of the checkStepDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckStepDateFrom(XMLGregorianCalendar value) {
        this.checkStepDateFrom = value;
    }

    /**
     * Gets the value of the checkStepDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckStepDateTo() {
        return checkStepDateTo;
    }

    /**
     * Sets the value of the checkStepDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckStepDateTo(XMLGregorianCalendar value) {
        this.checkStepDateTo = value;
    }

    /**
     * Gets the value of the checkLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckLevel() {
        return checkLevel;
    }

    /**
     * Sets the value of the checkLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckLevel(String value) {
        this.checkLevel = value;
    }

    /**
     * Gets the value of the checkLevelDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckLevelDateFrom() {
        return checkLevelDateFrom;
    }

    /**
     * Sets the value of the checkLevelDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckLevelDateFrom(XMLGregorianCalendar value) {
        this.checkLevelDateFrom = value;
    }

    /**
     * Gets the value of the checkLevelDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckLevelDateTo() {
        return checkLevelDateTo;
    }

    /**
     * Sets the value of the checkLevelDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckLevelDateTo(XMLGregorianCalendar value) {
        this.checkLevelDateTo = value;
    }

    /**
     * Gets the value of the taskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Sets the value of the taskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatus(String value) {
        this.taskStatus = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the inputtedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputtedBy() {
        return inputtedBy;
    }

    /**
     * Sets the value of the inputtedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputtedBy(String value) {
        this.inputtedBy = value;
    }

    /**
     * Gets the value of the taskResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskResult() {
        return taskResult;
    }

    /**
     * Sets the value of the taskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskResult(String value) {
        this.taskResult = value;
    }

    /**
     * Gets the value of the surveyDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyDateFrom() {
        return surveyDateFrom;
    }

    /**
     * Sets the value of the surveyDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyDateFrom(XMLGregorianCalendar value) {
        this.surveyDateFrom = value;
    }

    /**
     * Gets the value of the surveylDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveylDateTo() {
        return surveylDateTo;
    }

    /**
     * Sets the value of the surveylDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveylDateTo(XMLGregorianCalendar value) {
        this.surveylDateTo = value;
    }

    /**
     * Gets the value of the handleByUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleByUser() {
        return handleByUser;
    }

    /**
     * Sets the value of the handleByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleByUser(String value) {
        this.handleByUser = value;
    }

    /**
     * Gets the value of the isReviewed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReviewed() {
        return isReviewed;
    }

    /**
     * Sets the value of the isReviewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReviewed(Boolean value) {
        this.isReviewed = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the voidDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidDateFrom() {
        return voidDateFrom;
    }

    /**
     * Sets the value of the voidDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidDateFrom(XMLGregorianCalendar value) {
        this.voidDateFrom = value;
    }

    /**
     * Gets the value of the voidDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidDateTo() {
        return voidDateTo;
    }

    /**
     * Sets the value of the voidDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidDateTo(XMLGregorianCalendar value) {
        this.voidDateTo = value;
    }

    /**
     * Gets the value of the subStatusList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subStatusList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubStatusList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubStatusList() {
        if (subStatusList == null) {
            subStatusList = new ArrayList<String>();
        }
        return this.subStatusList;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessCategory(String value) {
        this.businessCategory = value;
    }

    /**
     * Gets the value of the payType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayType() {
        return payType;
    }

    /**
     * Sets the value of the payType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayType(String value) {
        this.payType = value;
    }

    /**
     * Gets the value of the inputSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputSiteCode() {
        return inputSiteCode;
    }

    /**
     * Sets the value of the inputSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputSiteCode(String value) {
        this.inputSiteCode = value;
    }

}
