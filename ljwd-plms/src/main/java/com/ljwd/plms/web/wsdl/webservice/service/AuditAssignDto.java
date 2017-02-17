
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditAssignDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditAssignDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="auditsurveyid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applinfoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="userid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isCancel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditAssignDto")
public class AuditAssignDto {

    @XmlAttribute(name = "auditsurveyid")
    protected Long auditsurveyid;
    @XmlAttribute(name = "applinfoid")
    protected Long applinfoid;
    @XmlAttribute(name = "userid")
    protected String userid;
    @XmlAttribute(name = "isCancel")
    protected String isCancel;

    /**
     * Gets the value of the auditsurveyid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuditsurveyid() {
        return auditsurveyid;
    }

    /**
     * Sets the value of the auditsurveyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuditsurveyid(Long value) {
        this.auditsurveyid = value;
    }

    /**
     * Gets the value of the applinfoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplinfoid() {
        return applinfoid;
    }

    /**
     * Sets the value of the applinfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplinfoid(Long value) {
        this.applinfoid = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserid(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the isCancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCancel() {
        return isCancel;
    }

    /**
     * Sets the value of the isCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCancel(String value) {
        this.isCancel = value;
    }

}
