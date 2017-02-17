
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for orderFeedbackDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderFeedbackDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="loanApplCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanInputBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="loanRestPeriod" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanApplDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanRejectReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanSigningNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="crmDodrid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanRemark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderFeedbackDto")
public class OrderFeedbackDto {

    @XmlAttribute(name = "loanApplCode")
    protected String loanApplCode;
    @XmlAttribute(name = "loanInputBy")
    protected String loanInputBy;
    @XmlAttribute(name = "loanStatus")
    protected String loanStatus;
    @XmlAttribute(name = "loanTypeName")
    protected String loanTypeName;
    @XmlAttribute(name = "loanAmt")
    protected Double loanAmt;
    @XmlAttribute(name = "loanRestPeriod")
    protected Long loanRestPeriod;
    @XmlAttribute(name = "loanApplDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanApplDate;
    @XmlAttribute(name = "loanRejectReason")
    protected String loanRejectReason;
    @XmlAttribute(name = "loanSigningNote")
    protected String loanSigningNote;
    @XmlAttribute(name = "crmDodrid")
    protected Long crmDodrid;
    @XmlAttribute(name = "loanRemark")
    protected String loanRemark;

    /**
     * Gets the value of the loanApplCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanApplCode() {
        return loanApplCode;
    }

    /**
     * Sets the value of the loanApplCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanApplCode(String value) {
        this.loanApplCode = value;
    }

    /**
     * Gets the value of the loanInputBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanInputBy() {
        return loanInputBy;
    }

    /**
     * Sets the value of the loanInputBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanInputBy(String value) {
        this.loanInputBy = value;
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
     * Gets the value of the loanTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanTypeName() {
        return loanTypeName;
    }

    /**
     * Sets the value of the loanTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanTypeName(String value) {
        this.loanTypeName = value;
    }

    /**
     * Gets the value of the loanAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanAmt() {
        return loanAmt;
    }

    /**
     * Sets the value of the loanAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanAmt(Double value) {
        this.loanAmt = value;
    }

    /**
     * Gets the value of the loanRestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoanRestPeriod() {
        return loanRestPeriod;
    }

    /**
     * Sets the value of the loanRestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoanRestPeriod(Long value) {
        this.loanRestPeriod = value;
    }

    /**
     * Gets the value of the loanApplDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanApplDate() {
        return loanApplDate;
    }

    /**
     * Sets the value of the loanApplDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanApplDate(XMLGregorianCalendar value) {
        this.loanApplDate = value;
    }

    /**
     * Gets the value of the loanRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanRejectReason() {
        return loanRejectReason;
    }

    /**
     * Sets the value of the loanRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanRejectReason(String value) {
        this.loanRejectReason = value;
    }

    /**
     * Gets the value of the loanSigningNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanSigningNote() {
        return loanSigningNote;
    }

    /**
     * Sets the value of the loanSigningNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanSigningNote(String value) {
        this.loanSigningNote = value;
    }

    /**
     * Gets the value of the crmDodrid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCrmDodrid() {
        return crmDodrid;
    }

    /**
     * Sets the value of the crmDodrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCrmDodrid(Long value) {
        this.crmDodrid = value;
    }

    /**
     * Gets the value of the loanRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanRemark() {
        return loanRemark;
    }

    /**
     * Sets the value of the loanRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanRemark(String value) {
        this.loanRemark = value;
    }

}
