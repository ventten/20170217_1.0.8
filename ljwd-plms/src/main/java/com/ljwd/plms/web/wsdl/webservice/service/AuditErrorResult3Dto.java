
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditErrorResult3Dto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditErrorResult3Dto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="auditcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditval" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditErrorResult3Dto")
public class AuditErrorResult3Dto {

    @XmlAttribute(name = "auditcode")
    protected String auditcode;
    @XmlAttribute(name = "auditval")
    protected String auditval;

    /**
     * Gets the value of the auditcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditcode() {
        return auditcode;
    }

    /**
     * Sets the value of the auditcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditcode(String value) {
        this.auditcode = value;
    }

    /**
     * Gets the value of the auditval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditval() {
        return auditval;
    }

    /**
     * Sets the value of the auditval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditval(String value) {
        this.auditval = value;
    }

}
