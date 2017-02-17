
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateVehiceCheckInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateVehiceCheckInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleCheckInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleCheckInfoDto" minOccurs="0"/>
 *         &lt;element name="vehicleAction" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleAction" minOccurs="0"/>
 *         &lt;element name="vehicleActionType" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateVehiceCheckInfo", propOrder = {
    "vehicleCheckInfoDto",
    "vehicleAction",
    "vehicleActionType"
})
public class UpdateVehiceCheckInfo {

    protected VehicleCheckInfoDto vehicleCheckInfoDto;
    protected VehicleAction vehicleAction;
    protected VehicleActionType vehicleActionType;

    /**
     * Gets the value of the vehicleCheckInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCheckInfoDto }
     *     
     */
    public VehicleCheckInfoDto getVehicleCheckInfoDto() {
        return vehicleCheckInfoDto;
    }

    /**
     * Sets the value of the vehicleCheckInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCheckInfoDto }
     *     
     */
    public void setVehicleCheckInfoDto(VehicleCheckInfoDto value) {
        this.vehicleCheckInfoDto = value;
    }

    /**
     * Gets the value of the vehicleAction property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAction }
     *     
     */
    public VehicleAction getVehicleAction() {
        return vehicleAction;
    }

    /**
     * Sets the value of the vehicleAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAction }
     *     
     */
    public void setVehicleAction(VehicleAction value) {
        this.vehicleAction = value;
    }

    /**
     * Gets the value of the vehicleActionType property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleActionType }
     *     
     */
    public VehicleActionType getVehicleActionType() {
        return vehicleActionType;
    }

    /**
     * Sets the value of the vehicleActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleActionType }
     *     
     */
    public void setVehicleActionType(VehicleActionType value) {
        this.vehicleActionType = value;
    }

}
