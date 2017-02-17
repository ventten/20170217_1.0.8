
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloudCallRecodingDown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloudCallRecodingDown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloudCallRecodingDown", propOrder = {
    "callLog"
})
public class CloudCallRecodingDown {

    protected String callLog;

    /**
     * Gets the value of the callLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLog() {
        return callLog;
    }

    /**
     * Sets the value of the callLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLog(String value) {
        this.callLog = value;
    }

}
