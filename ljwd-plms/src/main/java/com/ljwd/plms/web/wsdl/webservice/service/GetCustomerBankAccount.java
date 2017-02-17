
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerBankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerBankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custBankAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerBankAccount", propOrder = {
    "custBankAccountId"
})
public class GetCustomerBankAccount {

    protected long custBankAccountId;

    /**
     * Gets the value of the custBankAccountId property.
     * 
     */
    public long getCustBankAccountId() {
        return custBankAccountId;
    }

    /**
     * Sets the value of the custBankAccountId property.
     * 
     */
    public void setCustBankAccountId(long value) {
        this.custBankAccountId = value;
    }

}
