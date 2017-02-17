
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBankJournalLogDtosByJournalId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBankJournalLogDtosByJournalId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankJournalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBankJournalLogDtosByJournalId", propOrder = {
    "bankJournalId"
})
public class GetBankJournalLogDtosByJournalId {

    protected long bankJournalId;

    /**
     * Gets the value of the bankJournalId property.
     * 
     */
    public long getBankJournalId() {
        return bankJournalId;
    }

    /**
     * Sets the value of the bankJournalId property.
     * 
     */
    public void setBankJournalId(long value) {
        this.bankJournalId = value;
    }

}
