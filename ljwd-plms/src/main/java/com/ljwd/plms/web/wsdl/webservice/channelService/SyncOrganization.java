
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncOrganization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncOrganization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="syncParamDto" type="{http://webservice.loan.mfbms.flinkmf.com/}chDataSyncParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncOrganization", propOrder = {
    "syncParamDto"
})
public class SyncOrganization {

    protected ChDataSyncParamDto syncParamDto;

    /**
     * Gets the value of the syncParamDto property.
     * 
     * @return
     *     possible object is
     *     {@link ChDataSyncParamDto }
     *     
     */
    public ChDataSyncParamDto getSyncParamDto() {
        return syncParamDto;
    }

    /**
     * Sets the value of the syncParamDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDataSyncParamDto }
     *     
     */
    public void setSyncParamDto(ChDataSyncParamDto value) {
        this.syncParamDto = value;
    }

}
