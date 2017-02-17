
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitAppointmentWithTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitAppointmentWithTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appointDto" type="{http://webservice.loan.mfbms.flinkmf.com/}contractAppointmentDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitAppointmentWithTask", propOrder = {
    "appointDto"
})
public class SubmitAppointmentWithTask {

    protected ContractAppointmentDto appointDto;

    /**
     * Gets the value of the appointDto property.
     * 
     * @return
     *     possible object is
     *     {@link ContractAppointmentDto }
     *     
     */
    public ContractAppointmentDto getAppointDto() {
        return appointDto;
    }

    /**
     * Sets the value of the appointDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractAppointmentDto }
     *     
     */
    public void setAppointDto(ContractAppointmentDto value) {
        this.appointDto = value;
    }

}
