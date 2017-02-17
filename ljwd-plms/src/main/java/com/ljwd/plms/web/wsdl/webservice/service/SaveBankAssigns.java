
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveBankAssigns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveBankAssigns">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestDto" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAssignResultDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveBankAssigns", propOrder = {
    "requestDto"
})
public class SaveBankAssigns {

    protected BankAssignResultDto requestDto;

    /**
     * Gets the value of the requestDto property.
     * 
     * @return
     *     possible object is
     *     {@link BankAssignResultDto }
     *     
     */
    public BankAssignResultDto getRequestDto() {
        return requestDto;
    }

    /**
     * Sets the value of the requestDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAssignResultDto }
     *     
     */
    public void setRequestDto(BankAssignResultDto value) {
        this.requestDto = value;
    }

}
