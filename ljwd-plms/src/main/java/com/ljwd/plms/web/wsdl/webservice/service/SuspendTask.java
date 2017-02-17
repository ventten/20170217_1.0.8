
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suspendTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suspendTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suspendTaskDto" type="{http://webservice.loan.mfbms.flinkmf.com/}suspendTaskDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suspendTask", propOrder = {
    "suspendTaskDto"
})
public class SuspendTask {

    protected SuspendTaskDto suspendTaskDto;

    /**
     * Gets the value of the suspendTaskDto property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendTaskDto }
     *     
     */
    public SuspendTaskDto getSuspendTaskDto() {
        return suspendTaskDto;
    }

    /**
     * Sets the value of the suspendTaskDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendTaskDto }
     *     
     */
    public void setSuspendTaskDto(SuspendTaskDto value) {
        this.suspendTaskDto = value;
    }

}
