
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveSurveyNet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveSurveyNet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveyNetDto" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyNetDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveSurveyNet", propOrder = {
    "surveyNetDto"
})
public class SaveSurveyNet {

    protected SurveyNetDto surveyNetDto;

    /**
     * Gets the value of the surveyNetDto property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyNetDto }
     *     
     */
    public SurveyNetDto getSurveyNetDto() {
        return surveyNetDto;
    }

    /**
     * Sets the value of the surveyNetDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyNetDto }
     *     
     */
    public void setSurveyNetDto(SurveyNetDto value) {
        this.surveyNetDto = value;
    }

}
