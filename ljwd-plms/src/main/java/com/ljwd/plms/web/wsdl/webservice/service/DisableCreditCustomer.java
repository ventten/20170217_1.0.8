
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disableCreditCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disableCreditCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://webservice.loan.mfbms.flinkmf.com/}creditCustomerDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disableCreditCustomer", propOrder = {
    "param"
})
public class DisableCreditCustomer {

    protected CreditCustomerDto param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCustomerDto }
     *     
     */
    public CreditCustomerDto getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCustomerDto }
     *     
     */
    public void setParam(CreditCustomerDto value) {
        this.param = value;
    }

}
