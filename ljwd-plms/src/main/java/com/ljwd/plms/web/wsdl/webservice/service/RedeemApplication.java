
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for redeemApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redeemApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="redeemDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="repaymentBanks" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentBankSearchDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redeemApplication", propOrder = {
    "redeemDate",
    "repaymentBanks"
})
public class RedeemApplication {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redeemDate;
    protected RepaymentBankSearchDto repaymentBanks;

    /**
     * Gets the value of the redeemDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedeemDate() {
        return redeemDate;
    }

    /**
     * Sets the value of the redeemDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedeemDate(XMLGregorianCalendar value) {
        this.redeemDate = value;
    }

    /**
     * Gets the value of the repaymentBanks property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentBankSearchDto }
     *     
     */
    public RepaymentBankSearchDto getRepaymentBanks() {
        return repaymentBanks;
    }

    /**
     * Sets the value of the repaymentBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentBankSearchDto }
     *     
     */
    public void setRepaymentBanks(RepaymentBankSearchDto value) {
        this.repaymentBanks = value;
    }

}
