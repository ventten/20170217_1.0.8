
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveTurnoverManage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveTurnoverManage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="turnoverManageDto" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverManageDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveTurnoverManage", propOrder = {
    "turnoverManageDto"
})
public class SaveTurnoverManage {

    protected TurnoverManageDto turnoverManageDto;

    /**
     * Gets the value of the turnoverManageDto property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverManageDto }
     *     
     */
    public TurnoverManageDto getTurnoverManageDto() {
        return turnoverManageDto;
    }

    /**
     * Sets the value of the turnoverManageDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverManageDto }
     *     
     */
    public void setTurnoverManageDto(TurnoverManageDto value) {
        this.turnoverManageDto = value;
    }

}
