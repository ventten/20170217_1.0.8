
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateFeeWaiveApproval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateFeeWaiveApproval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://webservice.loan.mfbms.flinkmf.com/}feeWaiveApprovalSearchParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateFeeWaiveApproval", propOrder = {
    "params"
})
public class UpdateFeeWaiveApproval {

    protected FeeWaiveApprovalSearchParamDto params;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FeeWaiveApprovalSearchParamDto }
     *     
     */
    public FeeWaiveApprovalSearchParamDto getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeWaiveApprovalSearchParamDto }
     *     
     */
    public void setParams(FeeWaiveApprovalSearchParamDto value) {
        this.params = value;
    }

}
