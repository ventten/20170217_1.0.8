
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditErrorResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditErrorResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="errorid1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorname1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditErrorResultDto")
public class AuditErrorResultDto {

    @XmlAttribute(name = "errorid1")
    protected String errorid1;
    @XmlAttribute(name = "errorname1")
    protected String errorname1;

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

}
