
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOutVisitResultWeb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOutVisitResultWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outVisiResultDto" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitResultWebSearchDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOutVisitResultWeb", propOrder = {
    "outVisiResultDto"
})
public class AddOutVisitResultWeb {

    protected OutVisitResultWebSearchDto outVisiResultDto;

    /**
     * Gets the value of the outVisiResultDto property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitResultWebSearchDto }
     *     
     */
    public OutVisitResultWebSearchDto getOutVisiResultDto() {
        return outVisiResultDto;
    }

    /**
     * Sets the value of the outVisiResultDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitResultWebSearchDto }
     *     
     */
    public void setOutVisiResultDto(OutVisitResultWebSearchDto value) {
        this.outVisiResultDto = value;
    }

}
