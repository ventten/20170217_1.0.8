
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadSouyidaiFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadSouyidaiFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="souyidaiUploadDto" type="{http://webservice.loan.mfbms.flinkmf.com/}souyidaiUploadDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadSouyidaiFile", propOrder = {
    "souyidaiUploadDto"
})
public class UploadSouyidaiFile {

    protected SouyidaiUploadDto souyidaiUploadDto;

    /**
     * Gets the value of the souyidaiUploadDto property.
     * 
     * @return
     *     possible object is
     *     {@link SouyidaiUploadDto }
     *     
     */
    public SouyidaiUploadDto getSouyidaiUploadDto() {
        return souyidaiUploadDto;
    }

    /**
     * Sets the value of the souyidaiUploadDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SouyidaiUploadDto }
     *     
     */
    public void setSouyidaiUploadDto(SouyidaiUploadDto value) {
        this.souyidaiUploadDto = value;
    }

}
