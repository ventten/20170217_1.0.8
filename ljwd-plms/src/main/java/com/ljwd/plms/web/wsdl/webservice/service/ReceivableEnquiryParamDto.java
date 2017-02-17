
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for receivableEnquiryParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="receivableEnquiryParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="repaymentDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="collectDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reCollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="currentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="actionParam" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="businessCategory" type="{http://webservice.loan.mfbms.flinkmf.com/}businessCategory" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "receivableEnquiryParamDto")
public class ReceivableEnquiryParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "repaymentDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDateFrom;
    @XmlAttribute(name = "repaymentDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDateTo;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "collectDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectDateFrom;
    @XmlAttribute(name = "collectDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectDateTo;
    @XmlAttribute(name = "reCollectDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reCollectDate;
    @XmlAttribute(name = "currentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentDate;
    @XmlAttribute(name = "actionParam")
    protected String actionParam;
    @XmlAttribute(name = "businessCategory")
    protected BusinessCategory businessCategory;

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
     * Gets the value of the repaymentDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentDateFrom() {
        return repaymentDateFrom;
    }

    /**
     * Sets the value of the repaymentDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentDateFrom(XMLGregorianCalendar value) {
        this.repaymentDateFrom = value;
    }

    /**
     * Gets the value of the repaymentDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentDateTo() {
        return repaymentDateTo;
    }

    /**
     * Sets the value of the repaymentDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentDateTo(XMLGregorianCalendar value) {
        this.repaymentDateTo = value;
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
     * Gets the value of the collectDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectDateFrom() {
        return collectDateFrom;
    }

    /**
     * Sets the value of the collectDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectDateFrom(XMLGregorianCalendar value) {
        this.collectDateFrom = value;
    }

    /**
     * Gets the value of the collectDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectDateTo() {
        return collectDateTo;
    }

    /**
     * Sets the value of the collectDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectDateTo(XMLGregorianCalendar value) {
        this.collectDateTo = value;
    }

    /**
     * Gets the value of the reCollectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReCollectDate() {
        return reCollectDate;
    }

    /**
     * Sets the value of the reCollectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReCollectDate(XMLGregorianCalendar value) {
        this.reCollectDate = value;
    }

    /**
     * Gets the value of the currentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentDate(XMLGregorianCalendar value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the actionParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionParam() {
        return actionParam;
    }

    /**
     * Sets the value of the actionParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionParam(String value) {
        this.actionParam = value;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCategory }
     *     
     */
    public BusinessCategory getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCategory }
     *     
     */
    public void setBusinessCategory(BusinessCategory value) {
        this.businessCategory = value;
    }

}
