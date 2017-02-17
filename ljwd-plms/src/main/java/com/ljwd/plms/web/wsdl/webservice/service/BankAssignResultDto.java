
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankAssignResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankAssignResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addUpdateData" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAssignDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bankJournalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deleteData" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAssignDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankAssignResultDto", propOrder = {
    "action",
    "addUpdateData",
    "bankJournalId",
    "deleteData"
})
public class BankAssignResultDto {

    protected String action;
    @XmlElement(nillable = true)
    protected List<BankAssignDto> addUpdateData;
    protected Long bankJournalId;
    @XmlElement(nillable = true)
    protected List<BankAssignDto> deleteData;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the addUpdateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addUpdateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddUpdateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAssignDto }
     * 
     * 
     */
    public List<BankAssignDto> getAddUpdateData() {
        if (addUpdateData == null) {
            addUpdateData = new ArrayList<BankAssignDto>();
        }
        return this.addUpdateData;
    }

    /**
     * Gets the value of the bankJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankJournalId() {
        return bankJournalId;
    }

    /**
     * Sets the value of the bankJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankJournalId(Long value) {
        this.bankJournalId = value;
    }

    /**
     * Gets the value of the deleteData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAssignDto }
     * 
     * 
     */
    public List<BankAssignDto> getDeleteData() {
        if (deleteData == null) {
            deleteData = new ArrayList<BankAssignDto>();
        }
        return this.deleteData;
    }

}
