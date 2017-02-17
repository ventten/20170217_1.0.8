
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditErrorParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditErrorParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="cmbstrpcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cmbuserid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorid1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorid2" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="auditcontent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="surveyrecid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="isvalid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voidReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditErrorParamDto")
public class AuditErrorParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "cmbstrpcode")
    protected String cmbstrpcode;
    @XmlAttribute(name = "cmbuserid")
    protected String cmbuserid;
    @XmlAttribute(name = "errorid1")
    protected String errorid1;
    @XmlAttribute(name = "errorid2")
    protected Long errorid2;
    @XmlAttribute(name = "auditcontent")
    protected String auditcontent;
    @XmlAttribute(name = "auditId")
    protected Long auditId;
    @XmlAttribute(name = "surveyrecid")
    protected Long surveyrecid;
    @XmlAttribute(name = "isvalid")
    protected String isvalid;
    @XmlAttribute(name = "voidReason")
    protected String voidReason;
    @XmlAttribute(name = "auditNote")
    protected String auditNote;

    /**
     * Gets the value of the cmbstrpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmbstrpcode() {
        return cmbstrpcode;
    }

    /**
     * Sets the value of the cmbstrpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmbstrpcode(String value) {
        this.cmbstrpcode = value;
    }

    /**
     * Gets the value of the cmbuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmbuserid() {
        return cmbuserid;
    }

    /**
     * Sets the value of the cmbuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmbuserid(String value) {
        this.cmbuserid = value;
    }

    /**
     * Gets the value of the errorid1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorid1() {
        return errorid1;
    }

    /**
     * Sets the value of the errorid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorid1(String value) {
        this.errorid1 = value;
    }

    /**
     * Gets the value of the errorid2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getErrorid2() {
        return errorid2;
    }

    /**
     * Sets the value of the errorid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setErrorid2(Long value) {
        this.errorid2 = value;
    }

    /**
     * Gets the value of the auditcontent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditcontent() {
        return auditcontent;
    }

    /**
     * Sets the value of the auditcontent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditcontent(String value) {
        this.auditcontent = value;
    }

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
     * Gets the value of the surveyrecid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSurveyrecid() {
        return surveyrecid;
    }

    /**
     * Sets the value of the surveyrecid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSurveyrecid(Long value) {
        this.surveyrecid = value;
    }

    /**
     * Gets the value of the isvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvalid() {
        return isvalid;
    }

    /**
     * Sets the value of the isvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvalid(String value) {
        this.isvalid = value;
    }

    /**
     * Gets the value of the voidReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidReason() {
        return voidReason;
    }

    /**
     * Sets the value of the voidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidReason(String value) {
        this.voidReason = value;
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
