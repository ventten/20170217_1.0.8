
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitDelayDtlSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitDelayDtlSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="delayId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="expectCloseTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="expectCloseTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayAuditTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayAuditBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitDelayDtlSearchParamDto")
public class OutVisitDelayDtlSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "delayId")
    protected Long delayId;
    @XmlAttribute(name = "expectCloseTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTimeFrom;
    @XmlAttribute(name = "expectCloseTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTimeTo;
    @XmlAttribute(name = "delaySubmitTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delaySubmitTimeFrom;
    @XmlAttribute(name = "delaySubmitTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delaySubmitTimeTo;
    @XmlAttribute(name = "delaySubmitBy")
    protected String delaySubmitBy;
    @XmlAttribute(name = "delayDuration")
    protected String delayDuration;
    @XmlAttribute(name = "delayAuditResult")
    protected String delayAuditResult;
    @XmlAttribute(name = "delayAuditTimeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayAuditTimeFrom;
    @XmlAttribute(name = "delayAuditTimeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayAuditTimeTo;
    @XmlAttribute(name = "delayAuditBy")
    protected String delayAuditBy;
    @XmlAttribute(name = "mode")
    protected Long mode;

    /**
     * Gets the value of the delayId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayId() {
        return delayId;
    }

    /**
     * Sets the value of the delayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayId(Long value) {
        this.delayId = value;
    }

    /**
     * Gets the value of the expectCloseTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectCloseTimeFrom() {
        return expectCloseTimeFrom;
    }

    /**
     * Sets the value of the expectCloseTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectCloseTimeFrom(XMLGregorianCalendar value) {
        this.expectCloseTimeFrom = value;
    }

    /**
     * Gets the value of the expectCloseTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectCloseTimeTo() {
        return expectCloseTimeTo;
    }

    /**
     * Sets the value of the expectCloseTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectCloseTimeTo(XMLGregorianCalendar value) {
        this.expectCloseTimeTo = value;
    }

    /**
     * Gets the value of the delaySubmitTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelaySubmitTimeFrom() {
        return delaySubmitTimeFrom;
    }

    /**
     * Sets the value of the delaySubmitTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelaySubmitTimeFrom(XMLGregorianCalendar value) {
        this.delaySubmitTimeFrom = value;
    }

    /**
     * Gets the value of the delaySubmitTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelaySubmitTimeTo() {
        return delaySubmitTimeTo;
    }

    /**
     * Sets the value of the delaySubmitTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelaySubmitTimeTo(XMLGregorianCalendar value) {
        this.delaySubmitTimeTo = value;
    }

    /**
     * Gets the value of the delaySubmitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitBy() {
        return delaySubmitBy;
    }

    /**
     * Sets the value of the delaySubmitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitBy(String value) {
        this.delaySubmitBy = value;
    }

    /**
     * Gets the value of the delayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayDuration() {
        return delayDuration;
    }

    /**
     * Sets the value of the delayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayDuration(String value) {
        this.delayDuration = value;
    }

    /**
     * Gets the value of the delayAuditResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditResult() {
        return delayAuditResult;
    }

    /**
     * Sets the value of the delayAuditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditResult(String value) {
        this.delayAuditResult = value;
    }

    /**
     * Gets the value of the delayAuditTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayAuditTimeFrom() {
        return delayAuditTimeFrom;
    }

    /**
     * Sets the value of the delayAuditTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayAuditTimeFrom(XMLGregorianCalendar value) {
        this.delayAuditTimeFrom = value;
    }

    /**
     * Gets the value of the delayAuditTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayAuditTimeTo() {
        return delayAuditTimeTo;
    }

    /**
     * Sets the value of the delayAuditTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayAuditTimeTo(XMLGregorianCalendar value) {
        this.delayAuditTimeTo = value;
    }

    /**
     * Gets the value of the delayAuditBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditBy() {
        return delayAuditBy;
    }

    /**
     * Sets the value of the delayAuditBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditBy(String value) {
        this.delayAuditBy = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMode(Long value) {
        this.mode = value;
    }

}
