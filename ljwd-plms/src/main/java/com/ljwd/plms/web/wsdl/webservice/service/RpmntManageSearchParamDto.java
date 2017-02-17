
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for rpmntManageSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpmntManageSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applPayNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paySubmitTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paySubmitTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpmntManageSearchParamDto")
public class RpmntManageSearchParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "applPayNo")
    protected String applPayNo;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "payDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateFrom;
    @XmlAttribute(name = "payDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateTo;
    @XmlAttribute(name = "paySubmitTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paySubmitTimeFrom;
    @XmlAttribute(name = "paySubmitTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paySubmitTimeTo;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the applPayNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplPayNo() {
        return applPayNo;
    }

    /**
     * Sets the value of the applPayNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplPayNo(String value) {
        this.applPayNo = value;
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
     * Gets the value of the paySubmitTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaySubmitTimeFrom() {
        return paySubmitTimeFrom;
    }

    /**
     * Sets the value of the paySubmitTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaySubmitTimeFrom(XMLGregorianCalendar value) {
        this.paySubmitTimeFrom = value;
    }

    /**
     * Gets the value of the paySubmitTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaySubmitTimeTo() {
        return paySubmitTimeTo;
    }

    /**
     * Sets the value of the paySubmitTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaySubmitTimeTo(XMLGregorianCalendar value) {
        this.paySubmitTimeTo = value;
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

}
