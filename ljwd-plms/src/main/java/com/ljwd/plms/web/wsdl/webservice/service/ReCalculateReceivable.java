
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reCalculateReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reCalculateReceivable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramDto" type="{http://webservice.loan.mfbms.flinkmf.com/}reCalculateReceivableParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reCalculateReceivable", propOrder = {
    "paramDto"
})
public class ReCalculateReceivable {

    protected ReCalculateReceivableParamDto paramDto;

    /**
     * Gets the value of the paramDto property.
     * 
     * @return
     *     possible object is
     *     {@link ReCalculateReceivableParamDto }
     *     
     */
    public ReCalculateReceivableParamDto getParamDto() {
        return paramDto;
    }

    /**
     * Sets the value of the paramDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReCalculateReceivableParamDto }
     *     
     */
    public void setParamDto(ReCalculateReceivableParamDto value) {
        this.paramDto = value;
    }

}
