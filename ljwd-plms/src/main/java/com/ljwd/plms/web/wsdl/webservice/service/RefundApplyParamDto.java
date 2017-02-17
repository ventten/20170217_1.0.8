
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for refundApplyParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundApplyParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rpmntmthd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="txdateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="txdateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applytimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="applytimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymenttype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundApplyParamDto")
public class RefundApplyParamDto
    extends BaseEnquiryParamDto
{

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "rpmntmthd")
    protected String rpmntmthd;
    @XmlAttribute(name = "txdateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txdateFrom;
    @XmlAttribute(name = "txdateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar txdateTo;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "applyby")
    protected String applyby;
    @XmlAttribute(name = "applytimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applytimeFrom;
    @XmlAttribute(name = "applytimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applytimeTo;
    @XmlAttribute(name = "paymenttype")
    protected String paymenttype;

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
     * Gets the value of the rpmntmthd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpmntmthd() {
        return rpmntmthd;
    }

    /**
     * Sets the value of the rpmntmthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpmntmthd(String value) {
        this.rpmntmthd = value;
    }

    /**
     * Gets the value of the txdateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxdateFrom() {
        return txdateFrom;
    }

    /**
     * Sets the value of the txdateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxdateFrom(XMLGregorianCalendar value) {
        this.txdateFrom = value;
    }

    /**
     * Gets the value of the txdateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxdateTo() {
        return txdateTo;
    }

    /**
     * Sets the value of the txdateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxdateTo(XMLGregorianCalendar value) {
        this.txdateTo = value;
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
     * Gets the value of the applyby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyby() {
        return applyby;
    }

    /**
     * Sets the value of the applyby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyby(String value) {
        this.applyby = value;
    }

    /**
     * Gets the value of the applytimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplytimeFrom() {
        return applytimeFrom;
    }

    /**
     * Sets the value of the applytimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplytimeFrom(XMLGregorianCalendar value) {
        this.applytimeFrom = value;
    }

    /**
     * Gets the value of the applytimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplytimeTo() {
        return applytimeTo;
    }

    /**
     * Sets the value of the applytimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplytimeTo(XMLGregorianCalendar value) {
        this.applytimeTo = value;
    }

    /**
     * Gets the value of the paymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymenttype() {
        return paymenttype;
    }

    /**
     * Sets the value of the paymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymenttype(String value) {
        this.paymenttype = value;
    }

}
