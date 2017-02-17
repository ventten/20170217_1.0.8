
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateOverdueClientReceivable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateOverdueClientReceivable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculateAffectToday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateOverdueClientReceivable", propOrder = {
    "calculateAffectToday"
})
public class CalculateOverdueClientReceivable {

    protected String calculateAffectToday;

    /**
     * Gets the value of the calculateAffectToday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculateAffectToday() {
        return calculateAffectToday;
    }

    /**
     * Sets the value of the calculateAffectToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculateAffectToday(String value) {
        this.calculateAffectToday = value;
    }

}
