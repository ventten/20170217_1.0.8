
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveWaiveRequestAndSubmit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveWaiveRequestAndSubmit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="receivableId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="requestDto" type="{http://webservice.loan.mfbms.flinkmf.com/}waiveRequestDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveWaiveRequestAndSubmit", propOrder = {
    "receivableId",
    "requestDto"
})
public class SaveWaiveRequestAndSubmit {

    protected long receivableId;
    protected WaiveRequestDto requestDto;

    /**
     * Gets the value of the receivableId property.
     * 
     */
    public long getReceivableId() {
        return receivableId;
    }

    /**
     * Sets the value of the receivableId property.
     * 
     */
    public void setReceivableId(long value) {
        this.receivableId = value;
    }

    /**
     * Gets the value of the requestDto property.
     * 
     * @return
     *     possible object is
     *     {@link WaiveRequestDto }
     *     
     */
    public WaiveRequestDto getRequestDto() {
        return requestDto;
    }

    /**
     * Sets the value of the requestDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiveRequestDto }
     *     
     */
    public void setRequestDto(WaiveRequestDto value) {
        this.requestDto = value;
    }

}
