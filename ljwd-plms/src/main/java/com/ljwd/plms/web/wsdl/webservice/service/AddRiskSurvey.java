
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addRiskSurvey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRiskSurvey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riskSurveyDto" type="{http://webservice.loan.mfbms.flinkmf.com/}riskSurveyDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRiskSurvey", propOrder = {
    "riskSurveyDto"
})
public class AddRiskSurvey {

    protected RiskSurveyDto riskSurveyDto;

    /**
     * Gets the value of the riskSurveyDto property.
     * 
     * @return
     *     possible object is
     *     {@link RiskSurveyDto }
     *     
     */
    public RiskSurveyDto getRiskSurveyDto() {
        return riskSurveyDto;
    }

    /**
     * Sets the value of the riskSurveyDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskSurveyDto }
     *     
     */
    public void setRiskSurveyDto(RiskSurveyDto value) {
        this.riskSurveyDto = value;
    }

}
