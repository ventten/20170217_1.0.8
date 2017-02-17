
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveSurveyPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveSurveyPhone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveyPhoneDto" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyPhoneDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveSurveyPhone", propOrder = {
    "surveyPhoneDto"
})
public class SaveSurveyPhone {

    protected SurveyPhoneDto surveyPhoneDto;

    /**
     * Gets the value of the surveyPhoneDto property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyPhoneDto }
     *     
     */
    public SurveyPhoneDto getSurveyPhoneDto() {
        return surveyPhoneDto;
    }

    /**
     * Sets the value of the surveyPhoneDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyPhoneDto }
     *     
     */
    public void setSurveyPhoneDto(SurveyPhoneDto value) {
        this.surveyPhoneDto = value;
    }

}
