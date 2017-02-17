
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSurveySum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSurveySum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveySumDto" type="{http://webservice.loan.mfbms.flinkmf.com/}surveySumDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSurveySum", propOrder = {
    "surveySumDto"
})
public class UpdateSurveySum {

    protected SurveySumDto surveySumDto;

    /**
     * Gets the value of the surveySumDto property.
     * 
     * @return
     *     possible object is
     *     {@link SurveySumDto }
     *     
     */
    public SurveySumDto getSurveySumDto() {
        return surveySumDto;
    }

    /**
     * Sets the value of the surveySumDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveySumDto }
     *     
     */
    public void setSurveySumDto(SurveySumDto value) {
        this.surveySumDto = value;
    }

}
