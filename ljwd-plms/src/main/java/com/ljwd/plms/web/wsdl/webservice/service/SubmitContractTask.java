
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitContractTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="submitContractTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applInfoId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "submitContractTask", propOrder = {
    "applInfoId",
    "contractId",
    "taskInfoDto"
})
public class SubmitContractTask {

    protected long applInfoId;
    protected long contractId;
    protected TaskInfoDto taskInfoDto;

    /**
     * Gets the value of the applInfoId property.
     * 
     */
    public long getApplInfoId() {
        return applInfoId;
    }

    /**
     * Sets the value of the applInfoId property.
     * 
     */
    public void setApplInfoId(long value) {
        this.applInfoId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
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
