
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDebtTransferDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDebtTransferDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debtTransferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDebtTransferDto", propOrder = {
    "debtTransferId"
})
public class GetDebtTransferDto {

    protected long debtTransferId;

    /**
     * Gets the value of the debtTransferId property.
     * 
     */
    public long getDebtTransferId() {
        return debtTransferId;
    }

    /**
     * Sets the value of the debtTransferId property.
     * 
     */
    public void setDebtTransferId(long value) {
        this.debtTransferId = value;
    }

}
