
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitPlanSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitPlanSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planstarttime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="startplantime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="planstartinfo" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planStatusStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outVisitInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitPlanSearchDto")
public class OutVisitPlanSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "planname")
    protected String planname;
    @XmlAttribute(name = "planStatus")
    protected String planStatus;
    @XmlAttribute(name = "planstarttime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planstarttime;
    @XmlAttribute(name = "startplantime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startplantime;
    @XmlAttribute(name = "planstartinfo")
    protected Long planstartinfo;
    @XmlAttribute(name = "planStatusStr")
    protected String planStatusStr;
    @XmlAttribute(name = "visitBy")
    protected String visitBy;
    @XmlAttribute(name = "visitName")
    protected String visitName;
    @XmlAttribute(name = "outVisitInfoId")
    protected Long outVisitInfoId;

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
     * Gets the value of the planname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanname() {
        return planname;
    }

    /**
     * Sets the value of the planname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanname(String value) {
        this.planname = value;
    }

    /**
     * Gets the value of the planStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStatus() {
        return planStatus;
    }

    /**
     * Sets the value of the planStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStatus(String value) {
        this.planStatus = value;
    }

    /**
     * Gets the value of the planstarttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanstarttime() {
        return planstarttime;
    }

    /**
     * Sets the value of the planstarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanstarttime(XMLGregorianCalendar value) {
        this.planstarttime = value;
    }

    /**
     * Gets the value of the startplantime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartplantime() {
        return startplantime;
    }

    /**
     * Sets the value of the startplantime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartplantime(XMLGregorianCalendar value) {
        this.startplantime = value;
    }

    /**
     * Gets the value of the planstartinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanstartinfo() {
        return planstartinfo;
    }

    /**
     * Sets the value of the planstartinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanstartinfo(Long value) {
        this.planstartinfo = value;
    }

    /**
     * Gets the value of the planStatusStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanStatusStr() {
        return planStatusStr;
    }

    /**
     * Sets the value of the planStatusStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanStatusStr(String value) {
        this.planStatusStr = value;
    }

    /**
     * Gets the value of the visitBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitBy() {
        return visitBy;
    }

    /**
     * Sets the value of the visitBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitBy(String value) {
        this.visitBy = value;
    }

    /**
     * Gets the value of the visitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitName() {
        return visitName;
    }

    /**
     * Sets the value of the visitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitName(String value) {
        this.visitName = value;
    }

    /**
     * Gets the value of the outVisitInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutVisitInfoId() {
        return outVisitInfoId;
    }

    /**
     * Sets the value of the outVisitInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutVisitInfoId(Long value) {
        this.outVisitInfoId = value;
    }

}
