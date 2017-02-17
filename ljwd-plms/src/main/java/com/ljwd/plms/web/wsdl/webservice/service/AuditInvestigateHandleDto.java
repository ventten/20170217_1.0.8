
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for auditInvestigateHandleDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditInvestigateHandleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="inputtime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="auditcontent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="strpcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorname1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorname2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveyrecid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="isvalid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voidReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditInvestigateHandleDto")
public class AuditInvestigateHandleDto {

    @XmlAttribute(name = "inputtime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inputtime;
    @XmlAttribute(name = "auditcontent")
    protected String auditcontent;
    @XmlAttribute(name = "strpcode")
    protected String strpcode;
    @XmlAttribute(name = "auditor")
    protected String auditor;
    @XmlAttribute(name = "errorname1")
    protected String errorname1;
    @XmlAttribute(name = "errorname2")
    protected String errorname2;
    @XmlAttribute(name = "surveyrecid")
    protected Long surveyrecid;
    @XmlAttribute(name = "isvalid")
    protected String isvalid;
    @XmlAttribute(name = "voidReason")
    protected String voidReason;

    /**
     * Gets the value of the inputtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInputtime() {
        return inputtime;
    }

    /**
     * Sets the value of the inputtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInputtime(XMLGregorianCalendar value) {
        this.inputtime = value;
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
     * Gets the value of the strpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrpcode() {
        return strpcode;
    }

    /**
     * Sets the value of the strpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrpcode(String value) {
        this.strpcode = value;
    }

    /**
     * Gets the value of the auditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditor() {
        return auditor;
    }

    /**
     * Sets the value of the auditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditor(String value) {
        this.auditor = value;
    }

    /**
     * Gets the value of the errorname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorname1() {
        return errorname1;
    }

    /**
     * Sets the value of the errorname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorname1(String value) {
        this.errorname1 = value;
    }

    /**
     * Gets the value of the errorname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorname2() {
        return errorname2;
    }

    /**
     * Sets the value of the errorname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorname2(String value) {
        this.errorname2 = value;
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

}
