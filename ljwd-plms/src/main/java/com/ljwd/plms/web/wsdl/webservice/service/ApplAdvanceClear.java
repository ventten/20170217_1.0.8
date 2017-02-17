
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applAdvanceClear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applAdvanceClear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repaymentBank" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentBankSearchDto" minOccurs="0"/>
 *         &lt;element name="clearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="clearType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applAdvanceClear", propOrder = {
    "repaymentBank",
    "clearDate",
    "clearType"
})
public class ApplAdvanceClear {

    protected RepaymentBankSearchDto repaymentBank;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearDate;
    protected String clearType;

    /**
     * Gets the value of the repaymentBank property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentBankSearchDto }
     *     
     */
    public RepaymentBankSearchDto getRepaymentBank() {
        return repaymentBank;
    }

    /**
     * Sets the value of the repaymentBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentBankSearchDto }
     *     
     */
    public void setRepaymentBank(RepaymentBankSearchDto value) {
        this.repaymentBank = value;
    }

    /**
     * Gets the value of the clearDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClearDate() {
        return clearDate;
    }

    /**
     * Sets the value of the clearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClearDate(XMLGregorianCalendar value) {
        this.clearDate = value;
    }

    /**
     * Gets the value of the clearType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearType() {
        return clearType;
    }

    /**
     * Sets the value of the clearType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearType(String value) {
        this.clearType = value;
    }

}
