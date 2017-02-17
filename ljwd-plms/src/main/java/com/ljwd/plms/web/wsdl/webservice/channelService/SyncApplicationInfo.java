
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncApplicationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applInfoParamSyncDto" type="{http://webservice.loan.mfbms.flinkmf.com/}chApplInfoParamSyncDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncApplicationInfo", propOrder = {
    "applInfoParamSyncDto"
})
public class SyncApplicationInfo {

    protected ChApplInfoParamSyncDto applInfoParamSyncDto;

    /**
     * Gets the value of the applInfoParamSyncDto property.
     * 
     * @return
     *     possible object is
     *     {@link ChApplInfoParamSyncDto }
     *     
     */
    public ChApplInfoParamSyncDto getApplInfoParamSyncDto() {
        return applInfoParamSyncDto;
    }

    /**
     * Sets the value of the applInfoParamSyncDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChApplInfoParamSyncDto }
     *     
     */
    public void setApplInfoParamSyncDto(ChApplInfoParamSyncDto value) {
        this.applInfoParamSyncDto = value;
    }

}
