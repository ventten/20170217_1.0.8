
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateRepaymentPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateRepaymentPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculateParam" type="{http://webservice.loan.mfbms.flinkmf.com/}calculateRepaymentPlanParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateRepaymentPlan", propOrder = {
    "calculateParam"
})
public class CalculateRepaymentPlan {

    protected CalculateRepaymentPlanParamDto calculateParam;

    /**
     * Gets the value of the calculateParam property.
     * 
     * @return
     *     possible object is
     *     {@link CalculateRepaymentPlanParamDto }
     *     
     */
    public CalculateRepaymentPlanParamDto getCalculateParam() {
        return calculateParam;
    }

    /**
     * Sets the value of the calculateParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculateRepaymentPlanParamDto }
     *     
     */
    public void setCalculateParam(CalculateRepaymentPlanParamDto value) {
        this.calculateParam = value;
    }

}
