
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addPendingSurvey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addPendingSurvey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pendingSurveyDto" type="{http://webservice.loan.mfbms.flinkmf.com/}pendingSurveyDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPendingSurvey", propOrder = {
    "pendingSurveyDto"
})
public class AddPendingSurvey {

    protected PendingSurveyDto pendingSurveyDto;

    /**
     * Gets the value of the pendingSurveyDto property.
     * 
     * @return
     *     possible object is
     *     {@link PendingSurveyDto }
     *     
     */
    public PendingSurveyDto getPendingSurveyDto() {
        return pendingSurveyDto;
    }

    /**
     * Sets the value of the pendingSurveyDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingSurveyDto }
     *     
     */
    public void setPendingSurveyDto(PendingSurveyDto value) {
        this.pendingSurveyDto = value;
    }

}
