
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateContractAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateContractAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculateParam" type="{http://webservice.loan.mfbms.flinkmf.com/}calculateContractAmountParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateContractAmount", propOrder = {
    "calculateParam"
})
public class CalculateContractAmount {

    protected CalculateContractAmountParamDto calculateParam;

    /**
     * Gets the value of the calculateParam property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateContractAmountParamDto }
     *     
     */
    public CalculateContractAmountParamDto getCalculateParam() {
        return calculateParam;
    }

    /**
     * Sets the value of the calculateParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateContractAmountParamDto }
     *     
     */
    public void setCalculateParam(CalculateContractAmountParamDto value) {
        this.calculateParam = value;
    }

}
