
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for finanManagesubmitDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finanManagesubmitDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submittedby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submittime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="exportedby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exporttime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="sentby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendtime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finanManagesubmitDto")
public class FinanManagesubmitDto {

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "submittedby")
    protected String submittedby;
    @XmlAttribute(name = "submittime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittime;
    @XmlAttribute(name = "exportedby")
    protected String exportedby;
    @XmlAttribute(name = "exporttime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exporttime;
    @XmlAttribute(name = "sentby")
    protected String sentby;
    @XmlAttribute(name = "sendtime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendtime;
    @XmlAttribute(name = "remark")
    protected String remark;

    /**
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplid(Long value) {
        this.applid = value;
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
     * Gets the value of the submittedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedby() {
        return submittedby;
    }

    /**
     * Sets the value of the submittedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedby(String value) {
        this.submittedby = value;
    }

    /**
     * Gets the value of the submittime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittime() {
        return submittime;
    }

    /**
     * Sets the value of the submittime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittime(XMLGregorianCalendar value) {
        this.submittime = value;
    }

    /**
     * Gets the value of the exportedby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportedby() {
        return exportedby;
    }

    /**
     * Sets the value of the exportedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportedby(String value) {
        this.exportedby = value;
    }

    /**
     * Gets the value of the exporttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExporttime() {
        return exporttime;
    }

    /**
     * Sets the value of the exporttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExporttime(XMLGregorianCalendar value) {
        this.exporttime = value;
    }

    /**
     * Gets the value of the sentby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentby() {
        return sentby;
    }

    /**
     * Sets the value of the sentby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentby(String value) {
        this.sentby = value;
    }

    /**
     * Gets the value of the sendtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendtime() {
        return sendtime;
    }

    /**
     * Sets the value of the sendtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendtime(XMLGregorianCalendar value) {
        this.sendtime = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
