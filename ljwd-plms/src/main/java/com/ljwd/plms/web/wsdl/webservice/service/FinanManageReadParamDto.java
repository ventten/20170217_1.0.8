
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for finanManageReadParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finanManageReadParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="reportType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="signDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="sentDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="sentDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fromform" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="finanId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sentStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uploadStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signingOutlets" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wbSendStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wbSendTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finanManageReadParamDto")
public class FinanManageReadParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "reportType")
    protected String reportType;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "signDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDateFrom;
    @XmlAttribute(name = "signDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDateTo;
    @XmlAttribute(name = "sentDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDateFrom;
    @XmlAttribute(name = "sentDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sentDateTo;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "fromform")
    protected String fromform;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "payDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateFrom;
    @XmlAttribute(name = "payDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateTo;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "finanId")
    protected Long finanId;
    @XmlAttribute(name = "sentStatus")
    protected String sentStatus;
    @XmlAttribute(name = "uploadStatus")
    protected String uploadStatus;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "signingOutlets")
    protected String signingOutlets;
    @XmlAttribute(name = "wbSendStatus")
    protected String wbSendStatus;
    @XmlAttribute(name = "wbSendTime")
    protected String wbSendTime;

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportType(String value) {
        this.reportType = value;
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
     * Gets the value of the signDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDateFrom() {
        return signDateFrom;
    }

    /**
     * Sets the value of the signDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDateFrom(XMLGregorianCalendar value) {
        this.signDateFrom = value;
    }

    /**
     * Gets the value of the signDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDateTo() {
        return signDateTo;
    }

    /**
     * Sets the value of the signDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDateTo(XMLGregorianCalendar value) {
        this.signDateTo = value;
    }

    /**
     * Gets the value of the sentDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDateFrom() {
        return sentDateFrom;
    }

    /**
     * Sets the value of the sentDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDateFrom(XMLGregorianCalendar value) {
        this.sentDateFrom = value;
    }

    /**
     * Gets the value of the sentDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDateTo() {
        return sentDateTo;
    }

    /**
     * Sets the value of the sentDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDateTo(XMLGregorianCalendar value) {
        this.sentDateTo = value;
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
     * Gets the value of the fromform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromform() {
        return fromform;
    }

    /**
     * Sets the value of the fromform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromform(String value) {
        this.fromform = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the payDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateFrom() {
        return payDateFrom;
    }

    /**
     * Sets the value of the payDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateFrom(XMLGregorianCalendar value) {
        this.payDateFrom = value;
    }

    /**
     * Gets the value of the payDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateTo() {
        return payDateTo;
    }

    /**
     * Sets the value of the payDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateTo(XMLGregorianCalendar value) {
        this.payDateTo = value;
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
     * Gets the value of the finanId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanId() {
        return finanId;
    }

    /**
     * Sets the value of the finanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanId(Long value) {
        this.finanId = value;
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
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
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

}
