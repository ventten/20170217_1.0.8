
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusResultMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusResultMsg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}payRequestItemDetailStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusResultMsg", propOrder = {
    "desc",
    "refRemark",
    "refStatus",
    "requestStatus"
})
public class StatusResultMsg {

    protected String desc;
    protected String refRemark;
    protected String refStatus;
    protected PayRequestItemDetailStatus requestStatus;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the refRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefRemark() {
        return refRemark;
    }

    /**
     * Sets the value of the refRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefRemark(String value) {
        this.refRemark = value;
    }

    /**
     * Gets the value of the refStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefStatus() {
        return refStatus;
    }

    /**
     * Sets the value of the refStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefStatus(String value) {
        this.refStatus = value;
    }

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PayRequestItemDetailStatus }
     *     
     */
    public PayRequestItemDetailStatus getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRequestItemDetailStatus }
     *     
     */
    public void setRequestStatus(PayRequestItemDetailStatus value) {
        this.requestStatus = value;
    }

}
