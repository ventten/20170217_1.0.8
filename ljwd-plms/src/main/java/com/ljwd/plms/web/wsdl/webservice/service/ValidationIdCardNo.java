
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validationIdCardNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validationIdCardNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validationIdCardNo", propOrder = {
    "applInfoDto"
})
public class ValidationIdCardNo {

    protected ApplicationInfoDto applInfoDto;

    /**
     * Gets the value of the applInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfoDto }
     *     
     */
    public ApplicationInfoDto getApplInfoDto() {
        return applInfoDto;
    }

    /**
     * Sets the value of the applInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfoDto }
     *     
     */
    public void setApplInfoDto(ApplicationInfoDto value) {
        this.applInfoDto = value;
    }

}
