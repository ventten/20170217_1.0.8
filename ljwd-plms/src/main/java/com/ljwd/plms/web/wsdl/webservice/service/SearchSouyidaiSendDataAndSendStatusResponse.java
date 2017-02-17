
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchSouyidaiSendDataAndSendStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchSouyidaiSendDataAndSendStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.loan.mfbms.flinkmf.com/}souyidaiSendDataResultDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchSouyidaiSendDataAndSendStatusResponse", propOrder = {
    "_return"
})
public class SearchSouyidaiSendDataAndSendStatusResponse {

    @XmlElement(name = "return")
    protected SouyidaiSendDataResultDto _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SouyidaiSendDataResultDto }
     *     
     */
    public SouyidaiSendDataResultDto getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SouyidaiSendDataResultDto }
     *     
     */
    public void setReturn(SouyidaiSendDataResultDto value) {
        this._return = value;
    }

}
