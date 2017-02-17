
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addApplicationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}chApplInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addApplicationInfo", propOrder = {
    "applicationInfoDto"
})
public class AddApplicationInfo {

    protected ChApplInfoDto applicationInfoDto;

    /**
     * Gets the value of the applicationInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link ChApplInfoDto }
     *     
     */
    public ChApplInfoDto getApplicationInfoDto() {
        return applicationInfoDto;
    }

    /**
     * Sets the value of the applicationInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChApplInfoDto }
     *     
     */
    public void setApplicationInfoDto(ChApplInfoDto value) {
        this.applicationInfoDto = value;
    }

}
