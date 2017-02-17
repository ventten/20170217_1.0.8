
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for rpmntManageDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rpmntManageDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applPayNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDateStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paySubmitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paySubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="custCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="payPrincipal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payInt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="payConfirmBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payConfirmTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rpmntManageDto")
public class RpmntManageDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "applPayNo")
    protected String applPayNo;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "payDateStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateStart;
    @XmlAttribute(name = "payDateEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateEnd;
    @XmlAttribute(name = "payDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlAttribute(name = "paySubmitBy")
    protected String paySubmitBy;
    @XmlAttribute(name = "paySubmitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paySubmitTime;
    @XmlAttribute(name = "custCount")
    protected Long custCount;
    @XmlAttribute(name = "payPrincipal")
    protected BigDecimal payPrincipal;
    @XmlAttribute(name = "payInt")
    protected BigDecimal payInt;
    @XmlAttribute(name = "payAmt")
    protected BigDecimal payAmt;
    @XmlAttribute(name = "payConfirmBy")
    protected String payConfirmBy;
    @XmlAttribute(name = "payConfirmTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payConfirmTime;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "paymentTypeName")
    protected String paymentTypeName;

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
     * Gets the value of the payDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateStart() {
        return payDateStart;
    }

    /**
     * Sets the value of the payDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateStart(XMLGregorianCalendar value) {
        this.payDateStart = value;
    }

    /**
     * Gets the value of the payDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateEnd() {
        return payDateEnd;
    }

    /**
     * Sets the value of the payDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateEnd(XMLGregorianCalendar value) {
        this.payDateEnd = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the paySubmitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaySubmitBy() {
        return paySubmitBy;
    }

    /**
     * Sets the value of the paySubmitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaySubmitBy(String value) {
        this.paySubmitBy = value;
    }

    /**
     * Gets the value of the paySubmitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaySubmitTime() {
        return paySubmitTime;
    }

    /**
     * Sets the value of the paySubmitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaySubmitTime(XMLGregorianCalendar value) {
        this.paySubmitTime = value;
    }

    /**
     * Gets the value of the custCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustCount() {
        return custCount;
    }

    /**
     * Sets the value of the custCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustCount(Long value) {
        this.custCount = value;
    }

    /**
     * Gets the value of the payPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayPrincipal() {
        return payPrincipal;
    }

    /**
     * Sets the value of the payPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayPrincipal(BigDecimal value) {
        this.payPrincipal = value;
    }

    /**
     * Gets the value of the payInt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayInt() {
        return payInt;
    }

    /**
     * Sets the value of the payInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayInt(BigDecimal value) {
        this.payInt = value;
    }

    /**
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayAmt(BigDecimal value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the payConfirmBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayConfirmBy() {
        return payConfirmBy;
    }

    /**
     * Sets the value of the payConfirmBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayConfirmBy(String value) {
        this.payConfirmBy = value;
    }

    /**
     * Gets the value of the payConfirmTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayConfirmTime() {
        return payConfirmTime;
    }

    /**
     * Sets the value of the payConfirmTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayConfirmTime(XMLGregorianCalendar value) {
        this.payConfirmTime = value;
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
     * Gets the value of the paymentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    /**
     * Sets the value of the paymentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeName(String value) {
        this.paymentTypeName = value;
    }

}
