
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApproveAssignAvailableUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApproveAssignAvailableUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="investAssignDto" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyingAssignDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApproveAssignAvailableUsers", propOrder = {
    "investAssignDto"
})
public class GetApproveAssignAvailableUsers {

    protected SurveyingAssignDto investAssignDto;

    /**
     * Gets the value of the investAssignDto property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyingAssignDto }
     *     
     */
    public SurveyingAssignDto getInvestAssignDto() {
        return investAssignDto;
    }

    /**
     * Sets the value of the investAssignDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyingAssignDto }
     *     
     */
    public void setInvestAssignDto(SurveyingAssignDto value) {
        this.investAssignDto = value;
    }

}
