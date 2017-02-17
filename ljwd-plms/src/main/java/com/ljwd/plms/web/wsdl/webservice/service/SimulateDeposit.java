
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simulateDeposit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simulateDeposit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paramDto" type="{http://webservice.loan.mfbms.flinkmf.com/}simulateDepositParamDto" minOccurs="0"/>
 *         &lt;element name="confirmedList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulateDeposit", propOrder = {
    "paramDto",
    "confirmedList"
})
public class SimulateDeposit {

    protected SimulateDepositParamDto paramDto;
    protected List<String> confirmedList;

    /**
     * Gets the value of the paramDto property.
     * 
     * @return
     *     possible object is
     *     {@link SimulateDepositParamDto }
     *     
     */
    public SimulateDepositParamDto getParamDto() {
        return paramDto;
    }

    /**
     * Sets the value of the paramDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimulateDepositParamDto }
     *     
     */
    public void setParamDto(SimulateDepositParamDto value) {
        this.paramDto = value;
    }

    /**
     * Gets the value of the confirmedList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmedList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmedList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfirmedList() {
        if (confirmedList == null) {
            confirmedList = new ArrayList<String>();
        }
        return this.confirmedList;
    }

}
