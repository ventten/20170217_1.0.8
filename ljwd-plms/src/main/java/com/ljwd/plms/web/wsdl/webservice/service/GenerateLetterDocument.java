
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateLetterDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generateLetterDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="letterDto" type="{http://webservice.loan.mfbms.flinkmf.com/}overdueClientLetterGenerateDto" minOccurs="0"/>
 *         &lt;element name="templateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateLetterDocument", propOrder = {
    "letterDto",
    "templateCode"
})
public class GenerateLetterDocument {

    protected OverdueClientLetterGenerateDto letterDto;
    protected String templateCode;

    /**
     * Gets the value of the letterDto property.
     * 
     * @return
     *     possible object is
     *     {@link OverdueClientLetterGenerateDto }
     *     
     */
    public OverdueClientLetterGenerateDto getLetterDto() {
        return letterDto;
    }

    /**
     * Sets the value of the letterDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdueClientLetterGenerateDto }
     *     
     */
    public void setLetterDto(OverdueClientLetterGenerateDto value) {
        this.letterDto = value;
    }

    /**
     * Gets the value of the templateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * Sets the value of the templateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateCode(String value) {
        this.templateCode = value;
    }

}
