
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveSurveyFinanceWithTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveSurveyFinanceWithTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveyFinanceDto" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyFinanceDto" minOccurs="0"/>
 *         &lt;element name="taskInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveSurveyFinanceWithTask", propOrder = {
    "surveyFinanceDto",
    "taskInfoDto"
})
public class SaveSurveyFinanceWithTask {

    protected SurveyFinanceDto surveyFinanceDto;
    protected TaskInfoDto taskInfoDto;

    /**
     * Gets the value of the surveyFinanceDto property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyFinanceDto }
     *     
     */
    public SurveyFinanceDto getSurveyFinanceDto() {
        return surveyFinanceDto;
    }

    /**
     * Sets the value of the surveyFinanceDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyFinanceDto }
     *     
     */
    public void setSurveyFinanceDto(SurveyFinanceDto value) {
        this.surveyFinanceDto = value;
    }

    /**
     * Gets the value of the taskInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoDto }
     *     
     */
    public TaskInfoDto getTaskInfoDto() {
        return taskInfoDto;
    }

    /**
     * Sets the value of the taskInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoDto }
     *     
     */
    public void setTaskInfoDto(TaskInfoDto value) {
        this.taskInfoDto = value;
    }

}
