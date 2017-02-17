
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSignContractSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSignContractSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractDto" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSignContractSite", propOrder = {
    "contractDto"
})
public class UpdateSignContractSite {

    protected ContractDto contractDto;

    /**
     * Gets the value of the contractDto property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDto }
     *     
     */
    public ContractDto getContractDto() {
        return contractDto;
    }

    /**
     * Sets the value of the contractDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDto }
     *     
     */
    public void setContractDto(ContractDto value) {
        this.contractDto = value;
    }

}
