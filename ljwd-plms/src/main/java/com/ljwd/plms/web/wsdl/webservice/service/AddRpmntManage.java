
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addRpmntManage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRpmntManage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rpmntManageDto" type="{http://webservice.loan.mfbms.flinkmf.com/}rpmntManageDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRpmntManage", propOrder = {
    "rpmntManageDto"
})
public class AddRpmntManage {

    protected RpmntManageDto rpmntManageDto;

    /**
     * Gets the value of the rpmntManageDto property.
     * 
     * @return
     *     possible object is
     *     {@link RpmntManageDto }
     *     
     */
    public RpmntManageDto getRpmntManageDto() {
        return rpmntManageDto;
    }

    /**
     * Sets the value of the rpmntManageDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpmntManageDto }
     *     
     */
    public void setRpmntManageDto(RpmntManageDto value) {
        this.rpmntManageDto = value;
    }

}
