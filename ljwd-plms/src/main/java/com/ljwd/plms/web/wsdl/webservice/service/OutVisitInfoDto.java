
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="submitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="auditBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditRefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assignDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="assignBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assistBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="endBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expectCloseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remainderPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="visitPlanNum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="visitOverNum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="caseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitInfoDto")
public class OutVisitInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "custType")
    protected String custType;
    @XmlAttribute(name = "submitDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitDate;
    @XmlAttribute(name = "submitBy")
    protected String submitBy;
    @XmlAttribute(name = "submitReason")
    protected String submitReason;
    @XmlAttribute(name = "auditDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar auditDate;
    @XmlAttribute(name = "auditBy")
    protected String auditBy;
    @XmlAttribute(name = "auditRefuseReason")
    protected String auditRefuseReason;
    @XmlAttribute(name = "assignDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignDate;
    @XmlAttribute(name = "assignBy")
    protected String assignBy;
    @XmlAttribute(name = "visitBy")
    protected String visitBy;
    @XmlAttribute(name = "assistBy")
    protected String assistBy;
    @XmlAttribute(name = "endDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "endBy")
    protected String endBy;
    @XmlAttribute(name = "expectCloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTime;
    @XmlAttribute(name = "remainderPrincipal")
    protected BigDecimal remainderPrincipal;
    @XmlAttribute(name = "overdueDay")
    protected Long overdueDay;
    @XmlAttribute(name = "visitPlanNum")
    protected Long visitPlanNum;
    @XmlAttribute(name = "visitOverNum")
    protected Long visitOverNum;
    @XmlAttribute(name = "caseType")
    protected String caseType;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "startDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;

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
     * Gets the value of the submitReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitReason() {
        return submitReason;
    }

    /**
     * Sets the value of the submitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitReason(String value) {
        this.submitReason = value;
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
     * Gets the value of the auditBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditBy() {
        return auditBy;
    }

    /**
     * Sets the value of the auditBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditBy(String value) {
        this.auditBy = value;
    }

    /**
     * Gets the value of the auditRefuseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditRefuseReason() {
        return auditRefuseReason;
    }

    /**
     * Sets the value of the auditRefuseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditRefuseReason(String value) {
        this.auditRefuseReason = value;
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
     * Gets the value of the assignBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignBy() {
        return assignBy;
    }

    /**
     * Sets the value of the assignBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignBy(String value) {
        this.assignBy = value;
    }

    /**
     * Gets the value of the visitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitBy() {
        return visitBy;
    }

    /**
     * Sets the value of the visitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitBy(String value) {
        this.visitBy = value;
    }

    /**
     * Gets the value of the assistBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistBy() {
        return assistBy;
    }

    /**
     * Sets the value of the assistBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistBy(String value) {
        this.assistBy = value;
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
     * Gets the value of the endBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndBy() {
        return endBy;
    }

    /**
     * Sets the value of the endBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndBy(String value) {
        this.endBy = value;
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
     * Gets the value of the remainderPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderPrincipal() {
        return remainderPrincipal;
    }

    /**
     * Sets the value of the remainderPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderPrincipal(BigDecimal value) {
        this.remainderPrincipal = value;
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
     * Gets the value of the visitPlanNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisitPlanNum() {
        return visitPlanNum;
    }

    /**
     * Sets the value of the visitPlanNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisitPlanNum(Long value) {
        this.visitPlanNum = value;
    }

    /**
     * Gets the value of the visitOverNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisitOverNum() {
        return visitOverNum;
    }

    /**
     * Sets the value of the visitOverNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisitOverNum(Long value) {
        this.visitOverNum = value;
    }

    /**
     * Gets the value of the caseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * Sets the value of the caseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseType(String value) {
        this.caseType = value;
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

}
