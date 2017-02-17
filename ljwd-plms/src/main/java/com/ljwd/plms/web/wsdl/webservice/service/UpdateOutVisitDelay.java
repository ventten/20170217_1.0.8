
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOutVisitDelay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOutVisitDelay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outVisitDelayDto" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitDelayDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOutVisitDelay", propOrder = {
    "outVisitDelayDto"
})
public class UpdateOutVisitDelay {

    protected OutVisitDelayDto outVisitDelayDto;

    /**
     * Gets the value of the outVisitDelayDto property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitDelayDto }
     *     
     */
    public OutVisitDelayDto getOutVisitDelayDto() {
        return outVisitDelayDto;
    }

    /**
     * Sets the value of the outVisitDelayDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitDelayDto }
     *     
     */
    public void setOutVisitDelayDto(OutVisitDelayDto value) {
        this.outVisitDelayDto = value;
    }

}
