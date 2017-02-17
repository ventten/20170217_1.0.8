
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeCheckSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeCheckSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requested" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reqdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remrk" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldcontent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newcontent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="changereqid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="apprby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apprdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changeCheckSearchDto")
public class ChangeCheckSearchDto {

    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "applcode")
    protected String applcode;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "changetype")
    protected String changetype;
    @XmlAttribute(name = "requested")
    protected String requested;
    @XmlAttribute(name = "reqdate")
    protected String reqdate;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "remrk")
    protected String remrk;
    @XmlAttribute(name = "oldcontent")
    protected String oldcontent;
    @XmlAttribute(name = "newcontent")
    protected String newcontent;
    @XmlAttribute(name = "changereqid")
    protected Long changereqid;
    @XmlAttribute(name = "apprby")
    protected String apprby;
    @XmlAttribute(name = "apprdate")
    protected String apprdate;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "payDate")
    protected String payDate;

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
     * Gets the value of the applcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcode() {
        return applcode;
    }

    /**
     * Sets the value of the applcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcode(String value) {
        this.applcode = value;
    }

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
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
     *     {@link String }
     *     
     */
    public String getReqdate() {
        return reqdate;
    }

    /**
     * Sets the value of the reqdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdate(String value) {
        this.reqdate = value;
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
     * Gets the value of the changereqid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangereqid() {
        return changereqid;
    }

    /**
     * Sets the value of the changereqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangereqid(Long value) {
        this.changereqid = value;
    }

    /**
     * Gets the value of the apprby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprby() {
        return apprby;
    }

    /**
     * Sets the value of the apprby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprby(String value) {
        this.apprby = value;
    }

    /**
     * Gets the value of the apprdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprdate() {
        return apprdate;
    }

    /**
     * Sets the value of the apprdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprdate(String value) {
        this.apprdate = value;
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
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDate(String value) {
        this.payDate = value;
    }

}
