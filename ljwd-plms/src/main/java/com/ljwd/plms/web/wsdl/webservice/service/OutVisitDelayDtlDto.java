
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitDelayDtlDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitDelayDtlDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="delayId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="expectCloseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delaySubmitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delayAuditBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditRefuse" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expectCloseTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delaySubmitTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delaySubmitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delayAuditName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitDelayDtlDto")
public class OutVisitDelayDtlDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "delayId")
    protected Long delayId;
    @XmlAttribute(name = "expectCloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTime;
    @XmlAttribute(name = "delaySubmitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delaySubmitTime;
    @XmlAttribute(name = "delaySubmitBy")
    protected String delaySubmitBy;
    @XmlAttribute(name = "delayDuration")
    protected String delayDuration;
    @XmlAttribute(name = "delayAuditResult")
    protected String delayAuditResult;
    @XmlAttribute(name = "delayAuditTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar delayAuditTime;
    @XmlAttribute(name = "delayAuditBy")
    protected String delayAuditBy;
    @XmlAttribute(name = "delayAuditRefuse")
    protected String delayAuditRefuse;
    @XmlAttribute(name = "expectCloseTimeStr")
    protected String expectCloseTimeStr;
    @XmlAttribute(name = "delaySubmitTimeStr")
    protected String delaySubmitTimeStr;
    @XmlAttribute(name = "delaySubmitName")
    protected String delaySubmitName;
    @XmlAttribute(name = "delayAuditTimeStr")
    protected String delayAuditTimeStr;
    @XmlAttribute(name = "delayAuditName")
    protected String delayAuditName;

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
     * Gets the value of the expectCloseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectCloseTime() {
        return expectCloseTime;
    }

    /**
     * Sets the value of the expectCloseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectCloseTime(XMLGregorianCalendar value) {
        this.expectCloseTime = value;
    }

    /**
     * Gets the value of the delaySubmitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelaySubmitTime() {
        return delaySubmitTime;
    }

    /**
     * Sets the value of the delaySubmitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelaySubmitTime(XMLGregorianCalendar value) {
        this.delaySubmitTime = value;
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
     * Gets the value of the delayAuditTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDelayAuditTime() {
        return delayAuditTime;
    }

    /**
     * Sets the value of the delayAuditTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelayAuditTime(XMLGregorianCalendar value) {
        this.delayAuditTime = value;
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
     * Gets the value of the delayAuditRefuse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditRefuse() {
        return delayAuditRefuse;
    }

    /**
     * Sets the value of the delayAuditRefuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditRefuse(String value) {
        this.delayAuditRefuse = value;
    }

    /**
     * Gets the value of the expectCloseTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectCloseTimeStr() {
        return expectCloseTimeStr;
    }

    /**
     * Sets the value of the expectCloseTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectCloseTimeStr(String value) {
        this.expectCloseTimeStr = value;
    }

    /**
     * Gets the value of the delaySubmitTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitTimeStr() {
        return delaySubmitTimeStr;
    }

    /**
     * Sets the value of the delaySubmitTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitTimeStr(String value) {
        this.delaySubmitTimeStr = value;
    }

    /**
     * Gets the value of the delaySubmitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaySubmitName() {
        return delaySubmitName;
    }

    /**
     * Sets the value of the delaySubmitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaySubmitName(String value) {
        this.delaySubmitName = value;
    }

    /**
     * Gets the value of the delayAuditTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditTimeStr() {
        return delayAuditTimeStr;
    }

    /**
     * Sets the value of the delayAuditTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditTimeStr(String value) {
        this.delayAuditTimeStr = value;
    }

    /**
     * Gets the value of the delayAuditName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAuditName() {
        return delayAuditName;
    }

    /**
     * Sets the value of the delayAuditName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAuditName(String value) {
        this.delayAuditName = value;
    }

}
