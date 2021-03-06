
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchApplicationInfosByParamResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchApplicationInfosByParamResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoSearchResultDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchApplicationInfosByParamResponse", propOrder = {
    "_return"
})
public class SearchApplicationInfosByParamResponse {

    @XmlElement(name = "return")
    protected ApplicationInfoSearchResultDto _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfoSearchResultDto }
     *     
     */
    public ApplicationInfoSearchResultDto getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfoSearchResultDto }
     *     
     */
    public void setReturn(ApplicationInfoSearchResultDto value) {
        this._return = value;
    }

}
