
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitDelayDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitDelayDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="infoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="delayTimes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ovFinishTimes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="lastFollowTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createdTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="createdTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="updatedTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expectCloseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="expectCloseTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitDelayDto")
public class OutVisitDelayDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "infoId")
    protected Long infoId;
    @XmlAttribute(name = "delayTimes")
    protected Long delayTimes;
    @XmlAttribute(name = "ovFinishTimes")
    protected Long ovFinishTimes;
    @XmlAttribute(name = "lastFollowTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFollowTime;
    @XmlAttribute(name = "createdBy")
    protected String createdBy;
    @XmlAttribute(name = "createdName")
    protected String createdName;
    @XmlAttribute(name = "createdTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlAttribute(name = "createdTimeStr")
    protected String createdTimeStr;
    @XmlAttribute(name = "updatedBy")
    protected String updatedBy;
    @XmlAttribute(name = "updatedName")
    protected String updatedName;
    @XmlAttribute(name = "updatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedTime;
    @XmlAttribute(name = "updatedTimeStr")
    protected String updatedTimeStr;
    @XmlAttribute(name = "expectCloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTime;
    @XmlAttribute(name = "expectCloseTimeStr")
    protected String expectCloseTimeStr;
    @XmlAttribute(name = "applId")
    protected Long applId;

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
     * Gets the value of the infoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInfoId(Long value) {
        this.infoId = value;
    }

    /**
     * Gets the value of the delayTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayTimes() {
        return delayTimes;
    }

    /**
     * Sets the value of the delayTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayTimes(Long value) {
        this.delayTimes = value;
    }

    /**
     * Gets the value of the ovFinishTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOvFinishTimes() {
        return ovFinishTimes;
    }

    /**
     * Sets the value of the ovFinishTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOvFinishTimes(Long value) {
        this.ovFinishTimes = value;
    }

    /**
     * Gets the value of the lastFollowTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFollowTime() {
        return lastFollowTime;
    }

    /**
     * Sets the value of the lastFollowTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFollowTime(XMLGregorianCalendar value) {
        this.lastFollowTime = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedName() {
        return createdName;
    }

    /**
     * Sets the value of the createdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedName(String value) {
        this.createdName = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Gets the value of the createdTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedTimeStr() {
        return createdTimeStr;
    }

    /**
     * Sets the value of the createdTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedTimeStr(String value) {
        this.createdTimeStr = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedName() {
        return updatedName;
    }

    /**
     * Sets the value of the updatedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedName(String value) {
        this.updatedName = value;
    }

    /**
     * Gets the value of the updatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Sets the value of the updatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedTime(XMLGregorianCalendar value) {
        this.updatedTime = value;
    }

    /**
     * Gets the value of the updatedTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedTimeStr() {
        return updatedTimeStr;
    }

    /**
     * Sets the value of the updatedTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedTimeStr(String value) {
        this.updatedTimeStr = value;
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

}
