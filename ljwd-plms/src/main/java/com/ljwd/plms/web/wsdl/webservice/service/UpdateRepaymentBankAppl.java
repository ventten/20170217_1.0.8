
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRepaymentBankAppl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRepaymentBankAppl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentBankApplSearchDto" minOccurs="0"/>
 *         &lt;element name="applStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRepaymentBankAppl", propOrder = {
    "param",
    "applStatus"
})
public class UpdateRepaymentBankAppl {

    protected RepaymentBankApplSearchDto param;
    protected String applStatus;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentBankApplSearchDto }
     *     
     */
    public RepaymentBankApplSearchDto getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentBankApplSearchDto }
     *     
     */
    public void setParam(RepaymentBankApplSearchDto value) {
        this.param = value;
    }

    /**
     * Gets the value of the applStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplStatus() {
        return applStatus;
    }

    /**
     * Sets the value of the applStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplStatus(String value) {
        this.applStatus = value;
    }

}
