
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchAuditInvestigate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchAuditInvestigate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://webservice.loan.mfbms.flinkmf.com/}auditInvestigateParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchAuditInvestigate", propOrder = {
    "param"
})
public class SearchAuditInvestigate {

    protected AuditInvestigateParamDto param;

    /**
     * Gets the value of the param property.
     * 
     * @return
     *     possible object is
     *     {@link AuditInvestigateParamDto }
     *     
     */
    public AuditInvestigateParamDto getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditInvestigateParamDto }
     *     
     */
    public void setParam(AuditInvestigateParamDto value) {
        this.param = value;
    }

}
