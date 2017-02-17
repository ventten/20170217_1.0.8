
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditCheckResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditCheckResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="checksum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="auditcheckmax" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditCheckResultDto")
public class AuditCheckResultDto {

    @XmlAttribute(name = "checksum")
    protected Long checksum;
    @XmlAttribute(name = "auditcheckmax")
    protected Long auditcheckmax;

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChecksum(Long value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the auditcheckmax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuditcheckmax() {
        return auditcheckmax;
    }

    /**
     * Sets the value of the auditcheckmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuditcheckmax(Long value) {
        this.auditcheckmax = value;
    }

}
