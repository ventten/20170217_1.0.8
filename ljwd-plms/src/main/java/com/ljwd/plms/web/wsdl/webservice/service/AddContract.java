
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractDto" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *         &lt;element name="taskInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addContract", propOrder = {
    "contractDto",
    "taskInfoId"
})
public class AddContract {

    protected ContractDto contractDto;
    protected long taskInfoId;

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
     * Gets the value of the taskInfoId property.
     * 
     */
    public long getTaskInfoId() {
        return taskInfoId;
    }

    /**
     * Sets the value of the taskInfoId property.
     * 
     */
    public void setTaskInfoId(long value) {
        this.taskInfoId = value;
    }

}
