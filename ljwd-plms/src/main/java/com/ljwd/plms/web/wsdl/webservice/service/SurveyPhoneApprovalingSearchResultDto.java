
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyPhoneApprovalingSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyPhoneApprovalingSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendingTaskInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
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
@XmlType(name = "surveyPhoneApprovalingSearchResultDto", propOrder = {
    "pendingTaskInfo",
    "surveyPhoneDto"
})
public class SurveyPhoneApprovalingSearchResultDto {

    protected TaskInfoDto pendingTaskInfo;
    protected SurveyPhoneDto surveyPhoneDto;

    /**
     * Gets the value of the pendingTaskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoDto }
     *     
     */
    public TaskInfoDto getPendingTaskInfo() {
        return pendingTaskInfo;
    }

    /**
     * Sets the value of the pendingTaskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoDto }
     *     
     */
    public void setPendingTaskInfo(TaskInfoDto value) {
        this.pendingTaskInfo = value;
    }

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
