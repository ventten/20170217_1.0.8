
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractCancel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractCancel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractDto" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *         &lt;element name="taskInfoDto" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractCancel", propOrder = {
    "contractDto",
    "taskInfoDto"
})
public class ContractCancel {

    protected ContractDto contractDto;
    protected TaskInfoDto taskInfoDto;

    /**
     * Gets the value of the contractDto property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDto }
     *     
     */
    public ContractDto getContractDto() {
        return contractDto;
    }

    /**
     * Sets the value of the contractDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDto }
     *     
     */
    public void setContractDto(ContractDto value) {
        this.contractDto = value;
    }

    /**
     * Gets the value of the taskInfoDto property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoDto }
     *     
     */
    public TaskInfoDto getTaskInfoDto() {
        return taskInfoDto;
    }

    /**
     * Sets the value of the taskInfoDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoDto }
     *     
     */
    public void setTaskInfoDto(TaskInfoDto value) {
        this.taskInfoDto = value;
    }

}
