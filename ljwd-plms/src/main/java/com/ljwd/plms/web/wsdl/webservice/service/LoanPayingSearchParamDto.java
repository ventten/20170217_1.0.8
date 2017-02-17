
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for loanPayingSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanPayingSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *         &lt;element name="loanPayingSearchDtoList" type="{http://webservice.loan.mfbms.flinkmf.com/}loanPayingSearchDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bankAcName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanProduct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tradeMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatePaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applIds" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanPayingSearchParamDto", propOrder = {
    "loanPayingSearchDtoList"
})
public class LoanPayingSearchParamDto
    extends BaseEnquiryParamDto
{

    @XmlElement(nillable = true)
    protected List<LoanPayingSearchDto> loanPayingSearchDtoList;
    @XmlAttribute(name = "bankAcName")
    protected String bankAcName;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanProduct")
    protected String loanProduct;
    @XmlAttribute(name = "bankCode")
    protected String bankCode;
    @XmlAttribute(name = "payStatus")
    protected String payStatus;
    @XmlAttribute(name = "checkStatus")
    protected String checkStatus;
    @XmlAttribute(name = "tradeMethod")
    protected String tradeMethod;
    @XmlAttribute(name = "paymentDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDateFrom;
    @XmlAttribute(name = "paymentDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDateTo;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "updatePaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatePaymentDate;
    @XmlAttribute(name = "loanType")
    protected String loanType;
    @XmlAttribute(name = "applIds")
    protected String applIds;

    /**
     * Gets the value of the loanPayingSearchDtoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loanPayingSearchDtoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoanPayingSearchDtoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoanPayingSearchDto }
     * 
     * 
     */
    public List<LoanPayingSearchDto> getLoanPayingSearchDtoList() {
        if (loanPayingSearchDtoList == null) {
            loanPayingSearchDtoList = new ArrayList<LoanPayingSearchDto>();
        }
        return this.loanPayingSearchDtoList;
    }

    /**
     * Gets the value of the bankAcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAcName() {
        return bankAcName;
    }

    /**
     * Sets the value of the bankAcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAcName(String value) {
        this.bankAcName = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the loanProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProduct() {
        return loanProduct;
    }

    /**
     * Sets the value of the loanProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProduct(String value) {
        this.loanProduct = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the payStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * Sets the value of the payStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayStatus(String value) {
        this.payStatus = value;
    }

    /**
     * Gets the value of the checkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckStatus() {
        return checkStatus;
    }

    /**
     * Sets the value of the checkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckStatus(String value) {
        this.checkStatus = value;
    }

    /**
     * Gets the value of the tradeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeMethod() {
        return tradeMethod;
    }

    /**
     * Sets the value of the tradeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeMethod(String value) {
        this.tradeMethod = value;
    }

    /**
     * Gets the value of the paymentDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDateFrom() {
        return paymentDateFrom;
    }

    /**
     * Sets the value of the paymentDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDateFrom(XMLGregorianCalendar value) {
        this.paymentDateFrom = value;
    }

    /**
     * Gets the value of the paymentDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDateTo() {
        return paymentDateTo;
    }

    /**
     * Sets the value of the paymentDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDateTo(XMLGregorianCalendar value) {
        this.paymentDateTo = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the updatePaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatePaymentDate() {
        return updatePaymentDate;
    }

    /**
     * Sets the value of the updatePaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatePaymentDate(XMLGregorianCalendar value) {
        this.updatePaymentDate = value;
    }

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanType(String value) {
        this.loanType = value;
    }

    /**
     * Gets the value of the applIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplIds() {
        return applIds;
    }

    /**
     * Sets the value of the applIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplIds(String value) {
        this.applIds = value;
    }

}
