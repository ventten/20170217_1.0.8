
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMoonlightApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMoonlightApplicationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}moonlightApplicationInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMoonlightApplicationInfo", propOrder = {
    "applInfoDto"
})
public class AddMoonlightApplicationInfo {

    protected MoonlightApplicationInfoDto applInfoDto;

    /**
     * Gets the value of the applInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link MoonlightApplicationInfoDto }
     *     
     */
    public MoonlightApplicationInfoDto getApplInfoDto() {
        return applInfoDto;
    }

    /**
     * Sets the value of the applInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoonlightApplicationInfoDto }
     *     
     */
    public void setApplInfoDto(MoonlightApplicationInfoDto value) {
        this.applInfoDto = value;
    }

}
