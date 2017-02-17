
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchOutVisitAntiFraud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOutVisitAntiFraud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitAntiFraudParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOutVisitAntiFraud", propOrder = {
    "param"
})
public class SearchOutVisitAntiFraud {

    protected OutVisitAntiFraudParamDto param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitAntiFraudParamDto }
     *     
     */
    public OutVisitAntiFraudParamDto getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitAntiFraudParamDto }
     *     
     */
    public void setParam(OutVisitAntiFraudParamDto value) {
        this.param = value;
    }

}
