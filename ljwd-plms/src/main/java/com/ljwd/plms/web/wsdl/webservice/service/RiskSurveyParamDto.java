
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for riskSurveyParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskSurveyParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="declarant" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="declareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchOther" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="riskLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="manager" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isSham" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level4" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="risker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="rangeData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskSurveyParamDto")
public class RiskSurveyParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applyNo")
    protected String applyNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "declarant")
    protected String declarant;
    @XmlAttribute(name = "declareType")
    protected String declareType;
    @XmlAttribute(name = "searchOther")
    protected String searchOther;
    @XmlAttribute(name = "recordBy")
    protected String recordBy;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "riskLevel")
    protected String riskLevel;
    @XmlAttribute(name = "level1")
    protected String level1;
    @XmlAttribute(name = "level2")
    protected String level2;
    @XmlAttribute(name = "level3")
    protected String level3;
    @XmlAttribute(name = "manager")
    protected String manager;
    @XmlAttribute(name = "isSham")
    protected String isSham;
    @XmlAttribute(name = "level4")
    protected String level4;
    @XmlAttribute(name = "dateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;
    @XmlAttribute(name = "dateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;
    @XmlAttribute(name = "risker")
    protected String risker;
    @XmlAttribute(name = "orgId")
    protected Long orgId;
    @XmlAttribute(name = "rangeData")
    protected String rangeData;

    /**
     * Gets the value of the applyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyNo() {
        return applyNo;
    }

    /**
     * Sets the value of the applyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyNo(String value) {
        this.applyNo = value;
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
     * Gets the value of the declarant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarant() {
        return declarant;
    }

    /**
     * Sets the value of the declarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarant(String value) {
        this.declarant = value;
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
     * Gets the value of the searchOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchOther() {
        return searchOther;
    }

    /**
     * Sets the value of the searchOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchOther(String value) {
        this.searchOther = value;
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
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevel(String value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the level1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel1() {
        return level1;
    }

    /**
     * Sets the value of the level1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel1(String value) {
        this.level1 = value;
    }

    /**
     * Gets the value of the level2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel2() {
        return level2;
    }

    /**
     * Sets the value of the level2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel2(String value) {
        this.level2 = value;
    }

    /**
     * Gets the value of the level3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel3() {
        return level3;
    }

    /**
     * Sets the value of the level3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel3(String value) {
        this.level3 = value;
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
     * Gets the value of the isSham property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSham() {
        return isSham;
    }

    /**
     * Sets the value of the isSham property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSham(String value) {
        this.isSham = value;
    }

    /**
     * Gets the value of the level4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel4() {
        return level4;
    }

    /**
     * Sets the value of the level4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel4(String value) {
        this.level4 = value;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the risker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisker() {
        return risker;
    }

    /**
     * Sets the value of the risker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisker(String value) {
        this.risker = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgId(Long value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the rangeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeData() {
        return rangeData;
    }

    /**
     * Sets the value of the rangeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeData(String value) {
        this.rangeData = value;
    }

}
