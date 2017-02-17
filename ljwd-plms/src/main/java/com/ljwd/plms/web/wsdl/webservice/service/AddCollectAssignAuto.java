
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addCollectAssignAuto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addCollectAssignAuto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignParamDto" type="{http://webservice.loan.mfbms.flinkmf.com/}collectAssignParamDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCollectAssignAuto", propOrder = {
    "assignParamDto"
})
public class AddCollectAssignAuto {

    protected CollectAssignParamDto assignParamDto;

    /**
     * Gets the value of the assignParamDto property.
     * 
     * @return
     *     possible object is
     *     {@link CollectAssignParamDto }
     *     
     */
    public CollectAssignParamDto getAssignParamDto() {
        return assignParamDto;
    }

    /**
     * Sets the value of the assignParamDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectAssignParamDto }
     *     
     */
    public void setAssignParamDto(CollectAssignParamDto value) {
        this.assignParamDto = value;
    }

}
