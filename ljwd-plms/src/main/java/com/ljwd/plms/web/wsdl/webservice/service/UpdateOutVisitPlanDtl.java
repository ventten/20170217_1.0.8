
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateOutVisitPlanDtl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateOutVisitPlanDtl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outVisitPlanDtlSearchDto" type="{http://webservice.loan.mfbms.flinkmf.com/}outVisitPlanDtlSearchDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateOutVisitPlanDtl", propOrder = {
    "outVisitPlanDtlSearchDto"
})
public class UpdateOutVisitPlanDtl {

    protected OutVisitPlanDtlSearchDto outVisitPlanDtlSearchDto;

    /**
     * Gets the value of the outVisitPlanDtlSearchDto property.
     * 
     * @return
     *     possible object is
     *     {@link OutVisitPlanDtlSearchDto }
     *     
     */
    public OutVisitPlanDtlSearchDto getOutVisitPlanDtlSearchDto() {
        return outVisitPlanDtlSearchDto;
    }

    /**
     * Sets the value of the outVisitPlanDtlSearchDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutVisitPlanDtlSearchDto }
     *     
     */
    public void setOutVisitPlanDtlSearchDto(OutVisitPlanDtlSearchDto value) {
        this.outVisitPlanDtlSearchDto = value;
    }

}
