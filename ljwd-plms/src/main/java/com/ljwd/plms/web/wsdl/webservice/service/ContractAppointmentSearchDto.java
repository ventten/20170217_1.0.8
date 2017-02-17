
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractAppointmentSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractAppointmentSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="productName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanPurpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approverAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approverPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="approverPassDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointmenter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appointmentStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appointmentEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="appointSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractAppointmentSearchDto")
public class ContractAppointmentSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "productId")
    protected Long productId;
    @XmlAttribute(name = "productName")
    protected String productName;
    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "applyCode")
    protected String applyCode;
    @XmlAttribute(name = "loanPurpose")
    protected String loanPurpose;
    @XmlAttribute(name = "customerId")
    protected Long customerId;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "approverAmount")
    protected BigDecimal approverAmount;
    @XmlAttribute(name = "approverPeriod")
    protected Integer approverPeriod;
    @XmlAttribute(name = "approverPassDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approverPassDate;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "appointmenter")
    protected String appointmenter;
    @XmlAttribute(name = "appointmentStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentStartDate;
    @XmlAttribute(name = "appointmentEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentEndDate;
    @XmlAttribute(name = "appointSiteCode")
    protected String appointSiteCode;

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
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

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
     * Gets the value of the loanPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurpose() {
        return loanPurpose;
    }

    /**
     * Sets the value of the loanPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurpose(String value) {
        this.loanPurpose = value;
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
     * Gets the value of the approverPassDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproverPassDate() {
        return approverPassDate;
    }

    /**
     * Sets the value of the approverPassDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproverPassDate(XMLGregorianCalendar value) {
        this.approverPassDate = value;
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
     * Gets the value of the appointmenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmenter() {
        return appointmenter;
    }

    /**
     * Sets the value of the appointmenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmenter(String value) {
        this.appointmenter = value;
    }

    /**
     * Gets the value of the appointmentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentStartDate() {
        return appointmentStartDate;
    }

    /**
     * Sets the value of the appointmentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentStartDate(XMLGregorianCalendar value) {
        this.appointmentStartDate = value;
    }

    /**
     * Gets the value of the appointmentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentEndDate() {
        return appointmentEndDate;
    }

    /**
     * Sets the value of the appointmentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentEndDate(XMLGregorianCalendar value) {
        this.appointmentEndDate = value;
    }

    /**
     * Gets the value of the appointSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointSiteCode() {
        return appointSiteCode;
    }

    /**
     * Sets the value of the appointSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointSiteCode(String value) {
        this.appointSiteCode = value;
    }

}
