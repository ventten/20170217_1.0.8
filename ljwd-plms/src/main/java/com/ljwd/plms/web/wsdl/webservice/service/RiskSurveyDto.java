
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for riskSurveyDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskSurveyDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="declareDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="declareBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="declareReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="declareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risker1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assign1Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risker2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assign2Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risker3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assign3Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risker4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assign4Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="isFinish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isRisk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="recordBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveyResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workError" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workErrorType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shamType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shamLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risker1Result" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isIllegal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="applicationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risk1ApprTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="risk1Action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risk2ApprTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="risk2Action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskSurveyDto")
public class RiskSurveyDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "declareDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar declareDate;
    @XmlAttribute(name = "declareBy")
    protected String declareBy;
    @XmlAttribute(name = "declareReason")
    protected String declareReason;
    @XmlAttribute(name = "declareType")
    protected String declareType;
    @XmlAttribute(name = "surveyStatus")
    protected String surveyStatus;
    @XmlAttribute(name = "risker1")
    protected String risker1;
    @XmlAttribute(name = "assign1Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assign1Time;
    @XmlAttribute(name = "remark1")
    protected String remark1;
    @XmlAttribute(name = "risker2")
    protected String risker2;
    @XmlAttribute(name = "assign2Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assign2Time;
    @XmlAttribute(name = "remark2")
    protected String remark2;
    @XmlAttribute(name = "risker3")
    protected String risker3;
    @XmlAttribute(name = "assign3Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assign3Time;
    @XmlAttribute(name = "remark3")
    protected String remark3;
    @XmlAttribute(name = "risker4")
    protected String risker4;
    @XmlAttribute(name = "assign4Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assign4Time;
    @XmlAttribute(name = "remark4")
    protected String remark4;
    @XmlAttribute(name = "endTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlAttribute(name = "isFinish")
    protected Boolean isFinish;
    @XmlAttribute(name = "isRisk")
    protected Boolean isRisk;
    @XmlAttribute(name = "recordBy")
    protected String recordBy;
    @XmlAttribute(name = "surveyResult")
    protected String surveyResult;
    @XmlAttribute(name = "workError")
    protected String workError;
    @XmlAttribute(name = "workErrorType")
    protected String workErrorType;
    @XmlAttribute(name = "shamType")
    protected String shamType;
    @XmlAttribute(name = "shamLevel")
    protected String shamLevel;
    @XmlAttribute(name = "risker1Result")
    protected String risker1Result;
    @XmlAttribute(name = "isIllegal")
    protected Boolean isIllegal;
    @XmlAttribute(name = "applicationCode")
    protected String applicationCode;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "manager")
    protected String manager;
    @XmlAttribute(name = "risk1ApprTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar risk1ApprTime;
    @XmlAttribute(name = "risk1Action")
    protected String risk1Action;
    @XmlAttribute(name = "risk2ApprTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar risk2ApprTime;
    @XmlAttribute(name = "risk2Action")
    protected String risk2Action;

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
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the declareDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeclareDate() {
        return declareDate;
    }

    /**
     * Sets the value of the declareDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeclareDate(XMLGregorianCalendar value) {
        this.declareDate = value;
    }

    /**
     * Gets the value of the declareBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclareBy() {
        return declareBy;
    }

    /**
     * Sets the value of the declareBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclareBy(String value) {
        this.declareBy = value;
    }

    /**
     * Gets the value of the declareReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclareReason() {
        return declareReason;
    }

    /**
     * Sets the value of the declareReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclareReason(String value) {
        this.declareReason = value;
    }

    /**
     * Gets the value of the declareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclareType() {
        return declareType;
    }

    /**
     * Sets the value of the declareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclareType(String value) {
        this.declareType = value;
    }

    /**
     * Gets the value of the surveyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyStatus() {
        return surveyStatus;
    }

    /**
     * Sets the value of the surveyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyStatus(String value) {
        this.surveyStatus = value;
    }

    /**
     * Gets the value of the risker1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisker1() {
        return risker1;
    }

    /**
     * Sets the value of the risker1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisker1(String value) {
        this.risker1 = value;
    }

    /**
     * Gets the value of the assign1Time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssign1Time() {
        return assign1Time;
    }

    /**
     * Sets the value of the assign1Time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssign1Time(XMLGregorianCalendar value) {
        this.assign1Time = value;
    }

    /**
     * Gets the value of the remark1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * Sets the value of the remark1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark1(String value) {
        this.remark1 = value;
    }

    /**
     * Gets the value of the risker2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisker2() {
        return risker2;
    }

    /**
     * Sets the value of the risker2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisker2(String value) {
        this.risker2 = value;
    }

    /**
     * Gets the value of the assign2Time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssign2Time() {
        return assign2Time;
    }

    /**
     * Sets the value of the assign2Time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssign2Time(XMLGregorianCalendar value) {
        this.assign2Time = value;
    }

    /**
     * Gets the value of the remark2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * Sets the value of the remark2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark2(String value) {
        this.remark2 = value;
    }

    /**
     * Gets the value of the risker3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisker3() {
        return risker3;
    }

    /**
     * Sets the value of the risker3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisker3(String value) {
        this.risker3 = value;
    }

    /**
     * Gets the value of the assign3Time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssign3Time() {
        return assign3Time;
    }

    /**
     * Sets the value of the assign3Time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssign3Time(XMLGregorianCalendar value) {
        this.assign3Time = value;
    }

    /**
     * Gets the value of the remark3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * Sets the value of the remark3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark3(String value) {
        this.remark3 = value;
    }

    /**
     * Gets the value of the risker4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisker4() {
        return risker4;
    }

    /**
     * Sets the value of the risker4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisker4(String value) {
        this.risker4 = value;
    }

    /**
     * Gets the value of the assign4Time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssign4Time() {
        return assign4Time;
    }

    /**
     * Sets the value of the assign4Time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssign4Time(XMLGregorianCalendar value) {
        this.assign4Time = value;
    }

    /**
     * Gets the value of the remark4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * Sets the value of the remark4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark4(String value) {
        this.remark4 = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the isFinish property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFinish() {
        return isFinish;
    }

    /**
     * Sets the value of the isFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinish(Boolean value) {
        this.isFinish = value;
    }

    /**
     * Gets the value of the isRisk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRisk() {
        return isRisk;
    }

    /**
     * Sets the value of the isRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRisk(Boolean value) {
        this.isRisk = value;
    }

    /**
     * Gets the value of the recordBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordBy() {
        return recordBy;
    }

    /**
     * Sets the value of the recordBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordBy(String value) {
        this.recordBy = value;
    }

    /**
     * Gets the value of the surveyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyResult() {
        return surveyResult;
    }

    /**
     * Sets the value of the surveyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyResult(String value) {
        this.surveyResult = value;
    }

    /**
     * Gets the value of the workError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkError() {
        return workError;
    }

    /**
     * Sets the value of the workError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkError(String value) {
        this.workError = value;
    }

    /**
     * Gets the value of the workErrorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkErrorType() {
        return workErrorType;
    }

    /**
     * Sets the value of the workErrorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkErrorType(String value) {
        this.workErrorType = value;
    }

    /**
     * Gets the value of the shamType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShamType() {
        return shamType;
    }

    /**
     * Sets the value of the shamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShamType(String value) {
        this.shamType = value;
    }

    /**
     * Gets the value of the shamLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShamLevel() {
        return shamLevel;
    }

    /**
     * Sets the value of the shamLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShamLevel(String value) {
        this.shamLevel = value;
    }

    /**
     * Gets the value of the risker1Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisker1Result() {
        return risker1Result;
    }

    /**
     * Sets the value of the risker1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisker1Result(String value) {
        this.risker1Result = value;
    }

    /**
     * Gets the value of the isIllegal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIllegal() {
        return isIllegal;
    }

    /**
     * Sets the value of the isIllegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIllegal(Boolean value) {
        this.isIllegal = value;
    }

    /**
     * Gets the value of the applicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * Sets the value of the applicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCode(String value) {
        this.applicationCode = value;
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
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager(String value) {
        this.manager = value;
    }

    /**
     * Gets the value of the risk1ApprTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRisk1ApprTime() {
        return risk1ApprTime;
    }

    /**
     * Sets the value of the risk1ApprTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRisk1ApprTime(XMLGregorianCalendar value) {
        this.risk1ApprTime = value;
    }

    /**
     * Gets the value of the risk1Action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisk1Action() {
        return risk1Action;
    }

    /**
     * Sets the value of the risk1Action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisk1Action(String value) {
        this.risk1Action = value;
    }

    /**
     * Gets the value of the risk2ApprTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRisk2ApprTime() {
        return risk2ApprTime;
    }

    /**
     * Sets the value of the risk2ApprTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRisk2ApprTime(XMLGregorianCalendar value) {
        this.risk2ApprTime = value;
    }

    /**
     * Gets the value of the risk2Action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisk2Action() {
        return risk2Action;
    }

    /**
     * Sets the value of the risk2Action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisk2Action(String value) {
        this.risk2Action = value;
    }

}
