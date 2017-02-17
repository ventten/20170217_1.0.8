
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPayingConfirm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPayingConfirm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loanPayingSearchParamDto" type="{http://webservice.loan.mfbms.flinkmf.com/}loanPayingSearchParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPayingConfirm", propOrder = {
    "loanPayingSearchParamDto"
})
public class SearchPayingConfirm {

    protected LoanPayingSearchParamDto loanPayingSearchParamDto;

    /**
     * Gets the value of the loanPayingSearchParamDto property.
     * 
     * @return
     *     possible object is
     *     {@link LoanPayingSearchParamDto }
     *     
     */
    public LoanPayingSearchParamDto getLoanPayingSearchParamDto() {
        return loanPayingSearchParamDto;
    }

    /**
     * Sets the value of the loanPayingSearchParamDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanPayingSearchParamDto }
     *     
     */
    public void setLoanPayingSearchParamDto(LoanPayingSearchParamDto value) {
        this.loanPayingSearchParamDto = value;
    }

}
