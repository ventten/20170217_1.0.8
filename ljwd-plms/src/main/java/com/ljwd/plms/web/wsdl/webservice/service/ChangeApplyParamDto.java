
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for changeApplyParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeApplyParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="changetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requested" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reqdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remrk" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldcontent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newcontent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="acteon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeApplyParamDto")
public class ChangeApplyParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "changetype")
    protected String changetype;
    @XmlAttribute(name = "requested")
    protected String requested;
    @XmlAttribute(name = "reqdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdate;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "remrk")
    protected String remrk;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "oldcontent")
    protected String oldcontent;
    @XmlAttribute(name = "newcontent")
    protected String newcontent;
    @XmlAttribute(name = "acteon")
    protected String acteon;

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
     * Gets the value of the changetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangetype() {
        return changetype;
    }

    /**
     * Sets the value of the changetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangetype(String value) {
        this.changetype = value;
    }

    /**
     * Gets the value of the requested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequested(String value) {
        this.requested = value;
    }

    /**
     * Gets the value of the reqdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdate() {
        return reqdate;
    }

    /**
     * Sets the value of the reqdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdate(XMLGregorianCalendar value) {
        this.reqdate = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the remrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemrk() {
        return remrk;
    }

    /**
     * Sets the value of the remrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemrk(String value) {
        this.remrk = value;
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
     * Gets the value of the oldcontent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldcontent() {
        return oldcontent;
    }

    /**
     * Sets the value of the oldcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldcontent(String value) {
        this.oldcontent = value;
    }

    /**
     * Gets the value of the newcontent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewcontent() {
        return newcontent;
    }

    /**
     * Sets the value of the newcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewcontent(String value) {
        this.newcontent = value;
    }

    /**
     * Gets the value of the acteon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActeon() {
        return acteon;
    }

    /**
     * Sets the value of the acteon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActeon(String value) {
        this.acteon = value;
    }

}
