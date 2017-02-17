
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for loanStuationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanStuationDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="bankAc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastloanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="loanMoney" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="loanType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanRemarks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanAMoney" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="ctime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanStuationDto")
public class LoanStuationDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "bankAc")
    protected String bankAc;
    @XmlAttribute(name = "lastloanDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastloanDate;
    @XmlAttribute(name = "loanMoney")
    protected Double loanMoney;
    @XmlAttribute(name = "loanType")
    protected String loanType;
    @XmlAttribute(name = "loanRemarks")
    protected String loanRemarks;
    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "loanAMoney")
    protected Double loanAMoney;
    @XmlAttribute(name = "ctime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ctime;

    /**
     * Gets the value of the bankAc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAc() {
        return bankAc;
    }

    /**
     * Sets the value of the bankAc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAc(String value) {
        this.bankAc = value;
    }

    /**
     * Gets the value of the lastloanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastloanDate() {
        return lastloanDate;
    }

    /**
     * Sets the value of the lastloanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastloanDate(XMLGregorianCalendar value) {
        this.lastloanDate = value;
    }

    /**
     * Gets the value of the loanMoney property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanMoney() {
        return loanMoney;
    }

    /**
     * Sets the value of the loanMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanMoney(Double value) {
        this.loanMoney = value;
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
     * Gets the value of the loanRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanRemarks() {
        return loanRemarks;
    }

    /**
     * Sets the value of the loanRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanRemarks(String value) {
        this.loanRemarks = value;
    }

    /**
     * Gets the value of the applyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * Sets the value of the applyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplyId(Long value) {
        this.applyId = value;
    }

    /**
     * Gets the value of the loanAMoney property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoanAMoney() {
        return loanAMoney;
    }

    /**
     * Sets the value of the loanAMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoanAMoney(Double value) {
        this.loanAMoney = value;
    }

    /**
     * Gets the value of the ctime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtime() {
        return ctime;
    }

    /**
     * Sets the value of the ctime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCtime(XMLGregorianCalendar value) {
        this.ctime = value;
    }

}
