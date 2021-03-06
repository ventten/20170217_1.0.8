
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cancelAdvanceCollect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelAdvanceCollect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wholeAdvColDto" type="{http://webservice.loan.mfbms.flinkmf.com/}wholeAdvCollectDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelAdvanceCollect", propOrder = {
    "wholeAdvColDto"
})
public class CancelAdvanceCollect {

    protected WholeAdvCollectDto wholeAdvColDto;

    /**
     * Gets the value of the wholeAdvColDto property.
     * 
     * @return
     *     possible object is
     *     {@link WholeAdvCollectDto }
     *     
     */
    public WholeAdvCollectDto getWholeAdvColDto() {
        return wholeAdvColDto;
    }

    /**
     * Sets the value of the wholeAdvColDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholeAdvCollectDto }
     *     
     */
    public void setWholeAdvColDto(WholeAdvCollectDto value) {
        this.wholeAdvColDto = value;
    }

}
