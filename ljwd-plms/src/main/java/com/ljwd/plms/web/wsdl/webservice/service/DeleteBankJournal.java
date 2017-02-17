
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteBankJournal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteBankJournal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="journalDto" type="{http://webservice.loan.mfbms.flinkmf.com/}bankJournalDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteBankJournal", propOrder = {
    "journalDto"
})
public class DeleteBankJournal {

    protected BankJournalDto journalDto;

    /**
     * Gets the value of the journalDto property.
     * 
     * @return
     *     possible object is
     *     {@link BankJournalDto }
     *     
     */
    public BankJournalDto getJournalDto() {
        return journalDto;
    }

    /**
     * Sets the value of the journalDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankJournalDto }
     *     
     */
    public void setJournalDto(BankJournalDto value) {
        this.journalDto = value;
    }

}
