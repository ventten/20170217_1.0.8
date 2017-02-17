
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for companyCustomerInfoSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyCustomerInfoSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approverAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approverPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="recognizorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="auditStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectApplDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rejectAgainDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyCustomerInfoSearchDto")
public class CompanyCustomerInfoSearchDto {

    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "loanStatus")
    protected String loanStatus;
    @XmlAttribute(name = "customerId")
    protected Long customerId;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "approverAmount")
    protected BigDecimal approverAmount;
    @XmlAttribute(name = "approverPeriod")
    protected Integer approverPeriod;
    @XmlAttribute(name = "recognizorName")
    protected String recognizorName;
    @XmlAttribute(name = "clearDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearDate;
    @XmlAttribute(name = "auditStatus")
    protected String auditStatus;
    @XmlAttribute(name = "cntrctStatus")
    protected String cntrctStatus;
    @XmlAttribute(name = "auditNote")
    protected String auditNote;
    @XmlAttribute(name = "rejectApplDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rejectApplDate;
    @XmlAttribute(name = "rejectReason")
    protected String rejectReason;
    @XmlAttribute(name = "rejectAgainDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rejectAgainDate;

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
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
     * Gets the value of the approverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApproverAmount() {
        return approverAmount;
    }

    /**
     * Sets the value of the approverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApproverAmount(BigDecimal value) {
        this.approverAmount = value;
    }

    /**
     * Gets the value of the approverPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproverPeriod() {
        return approverPeriod;
    }

    /**
     * Sets the value of the approverPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproverPeriod(Integer value) {
        this.approverPeriod = value;
    }

    /**
     * Gets the value of the recognizorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecognizorName() {
        return recognizorName;
    }

    /**
     * Sets the value of the recognizorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecognizorName(String value) {
        this.recognizorName = value;
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
     * Gets the value of the auditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * Sets the value of the auditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditStatus(String value) {
        this.auditStatus = value;
    }

    /**
     * Gets the value of the cntrctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctStatus() {
        return cntrctStatus;
    }

    /**
     * Sets the value of the cntrctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctStatus(String value) {
        this.cntrctStatus = value;
    }

    /**
     * Gets the value of the auditNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditNote() {
        return auditNote;
    }

    /**
     * Sets the value of the auditNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditNote(String value) {
        this.auditNote = value;
    }

    /**
     * Gets the value of the rejectApplDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectApplDate() {
        return rejectApplDate;
    }

    /**
     * Sets the value of the rejectApplDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectApplDate(XMLGregorianCalendar value) {
        this.rejectApplDate = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the rejectAgainDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectAgainDate() {
        return rejectAgainDate;
    }

    /**
     * Sets the value of the rejectAgainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectAgainDate(XMLGregorianCalendar value) {
        this.rejectAgainDate = value;
    }

}
