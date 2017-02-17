
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerRequestFileDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerRequestFileDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerRequsetDetailContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="offerRequestSumContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="offerRequestValidationErrorContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="isValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="batchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fileDetailName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileSumName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerRequestFileDto", propOrder = {
    "offerRequsetDetailContent",
    "offerRequestSumContent",
    "offerRequestValidationErrorContent",
    "isValid",
    "batchCode"
})
public class OfferRequestFileDto {

    protected byte[] offerRequsetDetailContent;
    protected byte[] offerRequestSumContent;
    protected byte[] offerRequestValidationErrorContent;
    protected Boolean isValid;
    protected String batchCode;
    @XmlAttribute(name = "fileDetailName")
    protected String fileDetailName;
    @XmlAttribute(name = "fileSumName")
    protected String fileSumName;

    /**
     * Gets the value of the offerRequsetDetailContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOfferRequsetDetailContent() {
        return offerRequsetDetailContent;
    }

    /**
     * Sets the value of the offerRequsetDetailContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOfferRequsetDetailContent(byte[] value) {
        this.offerRequsetDetailContent = value;
    }

    /**
     * Gets the value of the offerRequestSumContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOfferRequestSumContent() {
        return offerRequestSumContent;
    }

    /**
     * Sets the value of the offerRequestSumContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOfferRequestSumContent(byte[] value) {
        this.offerRequestSumContent = value;
    }

    /**
     * Gets the value of the offerRequestValidationErrorContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOfferRequestValidationErrorContent() {
        return offerRequestValidationErrorContent;
    }

    /**
     * Sets the value of the offerRequestValidationErrorContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOfferRequestValidationErrorContent(byte[] value) {
        this.offerRequestValidationErrorContent = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * Gets the value of the batchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchCode() {
        return batchCode;
    }

    /**
     * Sets the value of the batchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchCode(String value) {
        this.batchCode = value;
    }

    /**
     * Gets the value of the fileDetailName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDetailName() {
        return fileDetailName;
    }

    /**
     * Sets the value of the fileDetailName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDetailName(String value) {
        this.fileDetailName = value;
    }

    /**
     * Gets the value of the fileSumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSumName() {
        return fileSumName;
    }

    /**
     * Sets the value of the fileSumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSumName(String value) {
        this.fileSumName = value;
    }

}
