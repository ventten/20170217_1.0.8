
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditError2ResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditError2ResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="errorid2" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="errorname2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditError2ResultDto")
public class AuditError2ResultDto {

    @XmlAttribute(name = "errorid2")
    protected Long errorid2;
    @XmlAttribute(name = "errorname2")
    protected String errorname2;

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

}
