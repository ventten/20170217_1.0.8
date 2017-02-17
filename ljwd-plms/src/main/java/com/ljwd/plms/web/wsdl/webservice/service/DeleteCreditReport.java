
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteCreditReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteCreditReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reportDto" type="{http://webservice.loan.mfbms.flinkmf.com/}creditReportDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteCreditReport", propOrder = {
    "reportDto"
})
public class DeleteCreditReport {

    protected CreditReportDto reportDto;

    /**
     * Gets the value of the reportDto property.
     * 
     * @return
     *     possible object is
     *     {@link CreditReportDto }
     *     
     */
    public CreditReportDto getReportDto() {
        return reportDto;
    }

    /**
     * Sets the value of the reportDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditReportDto }
     *     
     */
    public void setReportDto(CreditReportDto value) {
        this.reportDto = value;
    }

}
