
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zbtnPrintSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zbtnPrintSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="txtShowContractNoCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zbtnPrintSearchParamDto")
public class ZbtnPrintSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "txtShowContractNoCode")
    protected String txtShowContractNoCode;

    /**
     * Gets the value of the txtShowContractNoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtShowContractNoCode() {
        return txtShowContractNoCode;
    }

    /**
     * Sets the value of the txtShowContractNoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtShowContractNoCode(String value) {
        this.txtShowContractNoCode = value;
    }

}
