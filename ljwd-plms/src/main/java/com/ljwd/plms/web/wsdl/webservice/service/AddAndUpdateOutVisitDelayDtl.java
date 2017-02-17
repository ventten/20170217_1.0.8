
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAndUpdateOutVisitDelayDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAndUpdateOutVisitDelayDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outVisitDelayDtlDto" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitDelayDtlDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAndUpdateOutVisitDelayDtl", propOrder = {
    "outVisitDelayDtlDto"
})
public class AddAndUpdateOutVisitDelayDtl {

    protected OutVisitDelayDtlDto outVisitDelayDtlDto;

    /**
     * Gets the value of the outVisitDelayDtlDto property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitDelayDtlDto }
     *     
     */
    public OutVisitDelayDtlDto getOutVisitDelayDtlDto() {
        return outVisitDelayDtlDto;
    }

    /**
     * Sets the value of the outVisitDelayDtlDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitDelayDtlDto }
     *     
     */
    public void setOutVisitDelayDtlDto(OutVisitDelayDtlDto value) {
        this.outVisitDelayDtlDto = value;
    }

}
