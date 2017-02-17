
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSurveyFinance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSurveyFinance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveyFinaceDto" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyFinanceDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSurveyFinance", propOrder = {
    "surveyFinaceDto"
})
public class UpdateSurveyFinance {

    protected SurveyFinanceDto surveyFinaceDto;

    /**
     * Gets the value of the surveyFinaceDto property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyFinanceDto }
     *     
     */
    public SurveyFinanceDto getSurveyFinaceDto() {
        return surveyFinaceDto;
    }

    /**
     * Sets the value of the surveyFinaceDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyFinanceDto }
     *     
     */
    public void setSurveyFinaceDto(SurveyFinanceDto value) {
        this.surveyFinaceDto = value;
    }

}
