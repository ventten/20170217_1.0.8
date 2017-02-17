
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOutVisitBind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOutVisitBind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outVisitBindDto" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitBindDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOutVisitBind", propOrder = {
    "outVisitBindDto"
})
public class AddOutVisitBind {

    protected OutVisitBindDto outVisitBindDto;

    /**
     * Gets the value of the outVisitBindDto property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitBindDto }
     *     
     */
    public OutVisitBindDto getOutVisitBindDto() {
        return outVisitBindDto;
    }

    /**
     * Sets the value of the outVisitBindDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitBindDto }
     *     
     */
    public void setOutVisitBindDto(OutVisitBindDto value) {
        this.outVisitBindDto = value;
    }

}
