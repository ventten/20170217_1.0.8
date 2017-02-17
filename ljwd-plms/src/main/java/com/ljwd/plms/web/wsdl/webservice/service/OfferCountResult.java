
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerCountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerCountResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amtrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holdamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holdarea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holdcount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wholdamt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wholdcount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerCountResult", propOrder = {
    "amtrate",
    "countrate",
    "failCount",
    "failRate",
    "holdamt",
    "holdarea",
    "holdcount",
    "offerCount",
    "successCount",
    "successRate",
    "wholdamt",
    "wholdcount"
})
public class OfferCountResult {

    protected String amtrate;
    protected String countrate;
    protected String failCount;
    protected String failRate;
    protected String holdamt;
    protected String holdarea;
    protected String holdcount;
    protected String offerCount;
    protected String successCount;
    protected String successRate;
    protected String wholdamt;
    protected String wholdcount;

    /**
     * Gets the value of the amtrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmtrate() {
        return amtrate;
    }

    /**
     * Sets the value of the amtrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmtrate(String value) {
        this.amtrate = value;
    }

    /**
     * Gets the value of the countrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrate() {
        return countrate;
    }

    /**
     * Sets the value of the countrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrate(String value) {
        this.countrate = value;
    }

    /**
     * Gets the value of the failCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailCount() {
        return failCount;
    }

    /**
     * Sets the value of the failCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailCount(String value) {
        this.failCount = value;
    }

    /**
     * Gets the value of the failRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailRate() {
        return failRate;
    }

    /**
     * Sets the value of the failRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailRate(String value) {
        this.failRate = value;
    }

    /**
     * Gets the value of the holdamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldamt() {
        return holdamt;
    }

    /**
     * Sets the value of the holdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldamt(String value) {
        this.holdamt = value;
    }

    /**
     * Gets the value of the holdarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldarea() {
        return holdarea;
    }

    /**
     * Sets the value of the holdarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldarea(String value) {
        this.holdarea = value;
    }

    /**
     * Gets the value of the holdcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldcount() {
        return holdcount;
    }

    /**
     * Sets the value of the holdcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldcount(String value) {
        this.holdcount = value;
    }

    /**
     * Gets the value of the offerCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCount() {
        return offerCount;
    }

    /**
     * Sets the value of the offerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCount(String value) {
        this.offerCount = value;
    }

    /**
     * Gets the value of the successCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessCount() {
        return successCount;
    }

    /**
     * Sets the value of the successCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessCount(String value) {
        this.successCount = value;
    }

    /**
     * Gets the value of the successRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessRate() {
        return successRate;
    }

    /**
     * Sets the value of the successRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessRate(String value) {
        this.successRate = value;
    }

    /**
     * Gets the value of the wholdamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWholdamt() {
        return wholdamt;
    }

    /**
     * Sets the value of the wholdamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWholdamt(String value) {
        this.wholdamt = value;
    }

    /**
     * Gets the value of the wholdcount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWholdcount() {
        return wholdcount;
    }

    /**
     * Sets the value of the wholdcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWholdcount(String value) {
        this.wholdcount = value;
    }

}
