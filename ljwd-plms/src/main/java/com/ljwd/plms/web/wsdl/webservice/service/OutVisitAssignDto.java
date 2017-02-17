
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitAssignDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitAssignDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="overdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="areaCollect" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signSite" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="auditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="assignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="areaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitAssignDto")
public class OutVisitAssignDto {

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "payAMT")
    protected BigDecimal payAMT;
    @XmlAttribute(name = "overdueDays")
    protected Integer overdueDays;
    @XmlAttribute(name = "overdueDay")
    protected Long overdueDay;
    @XmlAttribute(name = "overdueAmount")
    protected BigDecimal overdueAmount;
    @XmlAttribute(name = "remainderAmount")
    protected BigDecimal remainderAmount;
    @XmlAttribute(name = "areaCollect")
    protected String areaCollect;
    @XmlAttribute(name = "signSite")
    protected String signSite;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "custType")
    protected String custType;
    @XmlAttribute(name = "submitBy")
    protected String submitBy;
    @XmlAttribute(name = "submitDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDate;
    @XmlAttribute(name = "auditDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auditDate;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "assignDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignDate;
    @XmlAttribute(name = "areaName")
    protected String areaName;

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
     * Gets the value of the payAMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAMT() {
        return payAMT;
    }

    /**
     * Sets the value of the payAMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAMT(BigDecimal value) {
        this.payAMT = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * Gets the value of the overdueDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverdueDay() {
        return overdueDay;
    }

    /**
     * Sets the value of the overdueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverdueDay(Long value) {
        this.overdueDay = value;
    }

    /**
     * Gets the value of the overdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Sets the value of the overdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueAmount(BigDecimal value) {
        this.overdueAmount = value;
    }

    /**
     * Gets the value of the remainderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * Sets the value of the remainderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmount(BigDecimal value) {
        this.remainderAmount = value;
    }

    /**
     * Gets the value of the areaCollect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCollect() {
        return areaCollect;
    }

    /**
     * Sets the value of the areaCollect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCollect(String value) {
        this.areaCollect = value;
    }

    /**
     * Gets the value of the signSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignSite() {
        return signSite;
    }

    /**
     * Sets the value of the signSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignSite(String value) {
        this.signSite = value;
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
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustType(String value) {
        this.custType = value;
    }

    /**
     * Gets the value of the submitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitBy() {
        return submitBy;
    }

    /**
     * Sets the value of the submitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitBy(String value) {
        this.submitBy = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDate(XMLGregorianCalendar value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the auditDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuditDate() {
        return auditDate;
    }

    /**
     * Sets the value of the auditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuditDate(XMLGregorianCalendar value) {
        this.auditDate = value;
    }

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

}
