
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankAccDto" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccountNewDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBankAccount", propOrder = {
    "bankAccDto"
})
public class AddBankAccount {

    protected BankAccountNewDto bankAccDto;

    /**
     * Gets the value of the bankAccDto property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountNewDto }
     *     
     */
    public BankAccountNewDto getBankAccDto() {
        return bankAccDto;
    }

    /**
     * Sets the value of the bankAccDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountNewDto }
     *     
     */
    public void setBankAccDto(BankAccountNewDto value) {
        this.bankAccDto = value;
    }

}
