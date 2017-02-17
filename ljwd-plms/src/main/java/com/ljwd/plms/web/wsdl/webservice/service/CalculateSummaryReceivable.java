
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateSummaryReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateSummaryReceivable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramDto" type="{http://webservice.loan.mfbms.flinkmf.com/}calculateSummaryReceivableParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateSummaryReceivable", propOrder = {
    "paramDto"
})
public class CalculateSummaryReceivable {

    protected CalculateSummaryReceivableParamDto paramDto;

    /**
     * Gets the value of the paramDto property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateSummaryReceivableParamDto }
     *     
     */
    public CalculateSummaryReceivableParamDto getParamDto() {
        return paramDto;
    }

    /**
     * Sets the value of the paramDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateSummaryReceivableParamDto }
     *     
     */
    public void setParamDto(CalculateSummaryReceivableParamDto value) {
        this.paramDto = value;
    }

}
