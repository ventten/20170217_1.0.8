
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitDelayAuditDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitDelayAuditDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="infoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="dtlId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="areaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="areaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="assignDateStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expectCloseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="expectCloseTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delaySubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delaySubmitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delaySubmitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayTimes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ovFinishTimes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lastFollowTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="lastFollowTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayAuditTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditRefuse" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="principal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitDelayAuditDto")
public class OutVisitDelayAuditDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "infoId")
    protected Long infoId;
    @XmlAttribute(name = "dtlId")
    protected Long dtlId;
    @XmlAttribute(name = "areaId")
    protected Long areaId;
    @XmlAttribute(name = "areaName")
    protected String areaName;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "cardId")
    protected String cardId;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "assignDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignDate;
    @XmlAttribute(name = "assignDateStr")
    protected String assignDateStr;
    @XmlAttribute(name = "expectCloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTime;
    @XmlAttribute(name = "expectCloseTimeStr")
    protected String expectCloseTimeStr;
    @XmlAttribute(name = "delaySubmitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delaySubmitTime;
    @XmlAttribute(name = "delaySubmitTimeStr")
    protected String delaySubmitTimeStr;
    @XmlAttribute(name = "delaySubmitBy")
    protected String delaySubmitBy;
    @XmlAttribute(name = "delaySubmitName")
    protected String delaySubmitName;
    @XmlAttribute(name = "delayDuration")
    protected String delayDuration;
    @XmlAttribute(name = "delayTimes")
    protected Long delayTimes;
    @XmlAttribute(name = "ovFinishTimes")
    protected Long ovFinishTimes;
    @XmlAttribute(name = "lastFollowTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFollowTime;
    @XmlAttribute(name = "lastFollowTimeStr")
    protected String lastFollowTimeStr;
    @XmlAttribute(name = "delayAuditResult")
    protected String delayAuditResult;
    @XmlAttribute(name = "delayAuditTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayAuditTime;
    @XmlAttribute(name = "delayAuditTimeStr")
    protected String delayAuditTimeStr;
    @XmlAttribute(name = "delayAuditBy")
    protected String delayAuditBy;
    @XmlAttribute(name = "delayAuditName")
    protected String delayAuditName;
    @XmlAttribute(name = "delayAuditRefuse")
    protected String delayAuditRefuse;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "principal")
    protected String principal;
    @XmlAttribute(name = "paymentName")
    protected String paymentName;
    @XmlAttribute(name = "redeem")
    protected String redeem;
    @XmlAttribute(name = "createdBy")
    protected String createdBy;

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
     * Gets the value of the infoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInfoId(Long value) {
        this.infoId = value;
    }

    /**
     * Gets the value of the dtlId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDtlId() {
        return dtlId;
    }

    /**
     * Sets the value of the dtlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDtlId(Long value) {
        this.dtlId = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAreaId(Long value) {
        this.areaId = value;
    }

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
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
     * Gets the value of the assignDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignDate() {
        return assignDate;
    }

    /**
     * Sets the value of the assignDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignDate(XMLGregorianCalendar value) {
        this.assignDate = value;
    }

    /**
     * Gets the value of the assignDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignDateStr() {
        return assignDateStr;
    }

    /**
     * Sets the value of the assignDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignDateStr(String value) {
        this.assignDateStr = value;
    }

    /**
     * Gets the value of the expectCloseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectCloseTime() {
        return expectCloseTime;
    }

    /**
     * Sets the value of the expectCloseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectCloseTime(XMLGregorianCalendar value) {
        this.expectCloseTime = value;
    }

    /**
     * Gets the value of the expectCloseTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectCloseTimeStr() {
        return expectCloseTimeStr;
    }

    /**
     * Sets the value of the expectCloseTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectCloseTimeStr(String value) {
        this.expectCloseTimeStr = value;
    }

    /**
     * Gets the value of the delaySubmitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelaySubmitTime() {
        return delaySubmitTime;
    }

    /**
     * Sets the value of the delaySubmitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelaySubmitTime(XMLGregorianCalendar value) {
        this.delaySubmitTime = value;
    }

    /**
     * Gets the value of the delaySubmitTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitTimeStr() {
        return delaySubmitTimeStr;
    }

    /**
     * Sets the value of the delaySubmitTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitTimeStr(String value) {
        this.delaySubmitTimeStr = value;
    }

    /**
     * Gets the value of the delaySubmitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitBy() {
        return delaySubmitBy;
    }

    /**
     * Sets the value of the delaySubmitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitBy(String value) {
        this.delaySubmitBy = value;
    }

    /**
     * Gets the value of the delaySubmitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitName() {
        return delaySubmitName;
    }

    /**
     * Sets the value of the delaySubmitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitName(String value) {
        this.delaySubmitName = value;
    }

    /**
     * Gets the value of the delayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayDuration() {
        return delayDuration;
    }

    /**
     * Sets the value of the delayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayDuration(String value) {
        this.delayDuration = value;
    }

    /**
     * Gets the value of the delayTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayTimes() {
        return delayTimes;
    }

    /**
     * Sets the value of the delayTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayTimes(Long value) {
        this.delayTimes = value;
    }

    /**
     * Gets the value of the ovFinishTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOvFinishTimes() {
        return ovFinishTimes;
    }

    /**
     * Sets the value of the ovFinishTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOvFinishTimes(Long value) {
        this.ovFinishTimes = value;
    }

    /**
     * Gets the value of the lastFollowTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFollowTime() {
        return lastFollowTime;
    }

    /**
     * Sets the value of the lastFollowTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFollowTime(XMLGregorianCalendar value) {
        this.lastFollowTime = value;
    }

    /**
     * Gets the value of the lastFollowTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFollowTimeStr() {
        return lastFollowTimeStr;
    }

    /**
     * Sets the value of the lastFollowTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFollowTimeStr(String value) {
        this.lastFollowTimeStr = value;
    }

    /**
     * Gets the value of the delayAuditResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditResult() {
        return delayAuditResult;
    }

    /**
     * Sets the value of the delayAuditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditResult(String value) {
        this.delayAuditResult = value;
    }

    /**
     * Gets the value of the delayAuditTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayAuditTime() {
        return delayAuditTime;
    }

    /**
     * Sets the value of the delayAuditTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayAuditTime(XMLGregorianCalendar value) {
        this.delayAuditTime = value;
    }

    /**
     * Gets the value of the delayAuditTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditTimeStr() {
        return delayAuditTimeStr;
    }

    /**
     * Sets the value of the delayAuditTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditTimeStr(String value) {
        this.delayAuditTimeStr = value;
    }

    /**
     * Gets the value of the delayAuditBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditBy() {
        return delayAuditBy;
    }

    /**
     * Sets the value of the delayAuditBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditBy(String value) {
        this.delayAuditBy = value;
    }

    /**
     * Gets the value of the delayAuditName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditName() {
        return delayAuditName;
    }

    /**
     * Sets the value of the delayAuditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditName(String value) {
        this.delayAuditName = value;
    }

    /**
     * Gets the value of the delayAuditRefuse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditRefuse() {
        return delayAuditRefuse;
    }

    /**
     * Sets the value of the delayAuditRefuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditRefuse(String value) {
        this.delayAuditRefuse = value;
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
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the paymentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentName() {
        return paymentName;
    }

    /**
     * Sets the value of the paymentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentName(String value) {
        this.paymentName = value;
    }

    /**
     * Gets the value of the redeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeem() {
        return redeem;
    }

    /**
     * Sets the value of the redeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeem(String value) {
        this.redeem = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

}
