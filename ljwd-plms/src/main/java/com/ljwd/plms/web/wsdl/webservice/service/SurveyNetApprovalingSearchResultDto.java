
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyNetApprovalingSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyNetApprovalingSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendingTaskInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *         &lt;element name="surveyNet" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyNetDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyNetApprovalingSearchResultDto", propOrder = {
    "pendingTaskInfo",
    "surveyNet"
})
public class SurveyNetApprovalingSearchResultDto {

    protected TaskInfoDto pendingTaskInfo;
    protected SurveyNetDto surveyNet;

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
     * Gets the value of the surveyNet property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyNetDto }
     *     
     */
    public SurveyNetDto getSurveyNet() {
        return surveyNet;
    }

    /**
     * Sets the value of the surveyNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyNetDto }
     *     
     */
    public void setSurveyNet(SurveyNetDto value) {
        this.surveyNet = value;
    }

}
