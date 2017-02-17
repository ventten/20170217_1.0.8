
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCustomerBankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCustomerBankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cusBankAccountDto" type="{http://webservice.loan.mfbms.flinkmf.com/}customerBankAccountDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCustomerBankAccount", propOrder = {
    "cusBankAccountDto"
})
public class UpdateCustomerBankAccount {

    protected CustomerBankAccountDto cusBankAccountDto;

    /**
     * Gets the value of the cusBankAccountDto property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBankAccountDto }
     *     
     */
    public CustomerBankAccountDto getCusBankAccountDto() {
        return cusBankAccountDto;
    }

    /**
     * Sets the value of the cusBankAccountDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBankAccountDto }
     *     
     */
    public void setCusBankAccountDto(CustomerBankAccountDto value) {
        this.cusBankAccountDto = value;
    }

}
