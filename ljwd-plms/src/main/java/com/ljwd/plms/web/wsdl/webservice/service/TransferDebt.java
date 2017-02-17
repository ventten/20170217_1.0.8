
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferDebt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferDebt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferDto" type="{http://webservice.loan.mfbms.flinkmf.com/}debtTransferDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferDebt", propOrder = {
    "transferDto"
})
public class TransferDebt {

    protected DebtTransferDto transferDto;

    /**
     * Gets the value of the transferDto property.
     * 
     * @return
     *     possible object is
     *     {@link DebtTransferDto }
     *     
     */
    public DebtTransferDto getTransferDto() {
        return transferDto;
    }

    /**
     * Sets the value of the transferDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtTransferDto }
     *     
     */
    public void setTransferDto(DebtTransferDto value) {
        this.transferDto = value;
    }

}
