
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnAuditHandleParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnAuditHandleParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="auditId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isBack" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="backReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnAuditHandleParamDto")
public class ReturnAuditHandleParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "auditId")
    protected Long auditId;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "isBack")
    protected String isBack;
    @XmlAttribute(name = "backReason")
    protected String backReason;
    @XmlAttribute(name = "auditNote")
    protected String auditNote;

    /**
     * Gets the value of the auditId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuditId() {
        return auditId;
    }

    /**
     * Sets the value of the auditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuditId(Long value) {
        this.auditId = value;
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
     * Gets the value of the isBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBack() {
        return isBack;
    }

    /**
     * Sets the value of the isBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBack(String value) {
        this.isBack = value;
    }

    /**
     * Gets the value of the backReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackReason() {
        return backReason;
    }

    /**
     * Sets the value of the backReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackReason(String value) {
        this.backReason = value;
    }

    /**
     * Gets the value of the auditNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditNote() {
        return auditNote;
    }

    /**
     * Sets the value of the auditNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditNote(String value) {
        this.auditNote = value;
    }

}
