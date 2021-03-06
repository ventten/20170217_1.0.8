
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractSignFinish complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractSignFinish">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmedList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractDto" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *         &lt;element name="paymentDto" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentDto" minOccurs="0"/>
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
@XmlType(name = "contractSignFinish", propOrder = {
    "confirmedList",
    "contractDto",
    "paymentDto",
    "taskInfoDto"
})
public class ContractSignFinish {

    protected List<String> confirmedList;
    protected ContractDto contractDto;
    protected PaymentDto paymentDto;
    protected TaskInfoDto taskInfoDto;

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
     * Gets the value of the paymentDto property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDto }
     *     
     */
    public PaymentDto getPaymentDto() {
        return paymentDto;
    }

    /**
     * Sets the value of the paymentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDto }
     *     
     */
    public void setPaymentDto(PaymentDto value) {
        this.paymentDto = value;
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
