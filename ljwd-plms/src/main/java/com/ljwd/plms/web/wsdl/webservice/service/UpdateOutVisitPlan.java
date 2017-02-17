
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOutVisitPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOutVisitPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outVisitPlanSearchDto" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitPlanSearchDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOutVisitPlan", propOrder = {
    "outVisitPlanSearchDto"
})
public class UpdateOutVisitPlan {

    protected OutVisitPlanSearchDto outVisitPlanSearchDto;

    /**
     * Gets the value of the outVisitPlanSearchDto property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitPlanSearchDto }
     *     
     */
    public OutVisitPlanSearchDto getOutVisitPlanSearchDto() {
        return outVisitPlanSearchDto;
    }

    /**
     * Sets the value of the outVisitPlanSearchDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitPlanSearchDto }
     *     
     */
    public void setOutVisitPlanSearchDto(OutVisitPlanSearchDto value) {
        this.outVisitPlanSearchDto = value;
    }

}
