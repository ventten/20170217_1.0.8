
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditInvestigateHandleFinishParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditInvestigateHandleFinishParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="auditId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="auditResult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isWrong" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditInvestigateHandleFinishParamDto")
public class AuditInvestigateHandleFinishParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "auditId")
    protected Long auditId;
    @XmlAttribute(name = "auditResult")
    protected String auditResult;
    @XmlAttribute(name = "isWrong")
    protected String isWrong;
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
     * Gets the value of the auditResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditResult() {
        return auditResult;
    }

    /**
     * Sets the value of the auditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditResult(String value) {
        this.auditResult = value;
    }

    /**
     * Gets the value of the isWrong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsWrong() {
        return isWrong;
    }

    /**
     * Sets the value of the isWrong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsWrong(String value) {
        this.isWrong = value;
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
