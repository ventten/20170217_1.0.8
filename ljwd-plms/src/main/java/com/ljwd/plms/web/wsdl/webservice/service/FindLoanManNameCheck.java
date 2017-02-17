
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findLoanManNameCheck complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findLoanManNameCheck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramDto" type="{http://webservice.loan.mfbms.flinkmf.com/}checkLoanManParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLoanManNameCheck", propOrder = {
    "paramDto"
})
public class FindLoanManNameCheck {

    protected CheckLoanManParamDto paramDto;

    /**
     * Gets the value of the paramDto property.
     * 
     * @return
     *     possible object is
     *     {@link CheckLoanManParamDto }
     *     
     */
    public CheckLoanManParamDto getParamDto() {
        return paramDto;
    }

    /**
     * Sets the value of the paramDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckLoanManParamDto }
     *     
     */
    public void setParamDto(CheckLoanManParamDto value) {
        this.paramDto = value;
    }

}
