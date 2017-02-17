
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitPlanInforSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitPlanInforSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="outvisitid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planstarttime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="planstartinfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitPlanInforSearchDto")
public class OutVisitPlanInforSearchDto {

    @XmlAttribute(name = "outvisitid")
    protected Long outvisitid;
    @XmlAttribute(name = "planname")
    protected String planname;
    @XmlAttribute(name = "planstatus")
    protected String planstatus;
    @XmlAttribute(name = "planstarttime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planstarttime;
    @XmlAttribute(name = "planstartinfo")
    protected String planstartinfo;

    /**
     * Gets the value of the outvisitid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutvisitid() {
        return outvisitid;
    }

    /**
     * Sets the value of the outvisitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutvisitid(Long value) {
        this.outvisitid = value;
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
     * Gets the value of the planstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanstatus() {
        return planstatus;
    }

    /**
     * Sets the value of the planstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanstatus(String value) {
        this.planstatus = value;
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
     * Gets the value of the planstartinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanstartinfo() {
        return planstartinfo;
    }

    /**
     * Sets the value of the planstartinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanstartinfo(String value) {
        this.planstartinfo = value;
    }

}
