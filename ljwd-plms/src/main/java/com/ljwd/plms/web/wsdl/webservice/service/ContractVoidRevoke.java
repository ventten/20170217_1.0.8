
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractVoidRevoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractVoidRevoke">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractDto" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractVoidRevoke", propOrder = {
    "contractDto",
    "reason"
})
public class ContractVoidRevoke {

    protected ContractDto contractDto;
    protected String reason;

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

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
