
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchApplicationOutsourceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchApplicationOutsourceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outsourceParams" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationOutsourceParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchApplicationOutsourceResult", propOrder = {
    "outsourceParams"
})
public class SearchApplicationOutsourceResult {

    protected ApplicationOutsourceParamDto outsourceParams;

    /**
     * Gets the value of the outsourceParams property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationOutsourceParamDto }
     *     
     */
    public ApplicationOutsourceParamDto getOutsourceParams() {
        return outsourceParams;
    }

    /**
     * Sets the value of the outsourceParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationOutsourceParamDto }
     *     
     */
    public void setOutsourceParams(ApplicationOutsourceParamDto value) {
        this.outsourceParams = value;
    }

}
