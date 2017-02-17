
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for refundUpdateParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundUpdateParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="refundid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="refuseReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reviewBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reviewTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refundType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custBankId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="confirmBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="confirmTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="refundDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundUpdateParamDto")
public class RefundUpdateParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "refundid")
    protected Long refundid;
    @XmlAttribute(name = "refuseReason")
    protected String refuseReason;
    @XmlAttribute(name = "reviewBy")
    protected String reviewBy;
    @XmlAttribute(name = "reviewTime")
    protected String reviewTime;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "refundType")
    protected String refundType;
    @XmlAttribute(name = "custBankId")
    protected Long custBankId;
    @XmlAttribute(name = "confirmBy")
    protected String confirmBy;
    @XmlAttribute(name = "confirmTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmTime;
    @XmlAttribute(name = "refundDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundDate;

    /**
     * Gets the value of the refundid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefundid() {
        return refundid;
    }

    /**
     * Sets the value of the refundid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefundid(Long value) {
        this.refundid = value;
    }

    /**
     * Gets the value of the refuseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefuseReason() {
        return refuseReason;
    }

    /**
     * Sets the value of the refuseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefuseReason(String value) {
        this.refuseReason = value;
    }

    /**
     * Gets the value of the reviewBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewBy() {
        return reviewBy;
    }

    /**
     * Sets the value of the reviewBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewBy(String value) {
        this.reviewBy = value;
    }

    /**
     * Gets the value of the reviewTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewTime() {
        return reviewTime;
    }

    /**
     * Sets the value of the reviewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewTime(String value) {
        this.reviewTime = value;
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
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundType(String value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the custBankId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustBankId() {
        return custBankId;
    }

    /**
     * Sets the value of the custBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustBankId(Long value) {
        this.custBankId = value;
    }

    /**
     * Gets the value of the confirmBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmBy() {
        return confirmBy;
    }

    /**
     * Sets the value of the confirmBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmBy(String value) {
        this.confirmBy = value;
    }

    /**
     * Gets the value of the confirmTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmTime() {
        return confirmTime;
    }

    /**
     * Sets the value of the confirmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmTime(XMLGregorianCalendar value) {
        this.confirmTime = value;
    }

    /**
     * Gets the value of the refundDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundDate() {
        return refundDate;
    }

    /**
     * Sets the value of the refundDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundDate(XMLGregorianCalendar value) {
        this.refundDate = value;
    }

}
