
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for overdueClientLetterGenerateParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="overdueClientLetterGenerateParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanCardId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="repaymentTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overdueDayFrom" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="overdueDayTo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="addrType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overdueClientLetterGenerateParamDto")
public class OverdueClientLetterGenerateParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "loanCardId")
    protected String loanCardId;
    @XmlAttribute(name = "repaymentFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentFrom;
    @XmlAttribute(name = "repaymentTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentTo;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "overdueDayFrom")
    protected Integer overdueDayFrom;
    @XmlAttribute(name = "overdueDayTo")
    protected Integer overdueDayTo;
    @XmlAttribute(name = "addrType")
    protected String addrType;

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
     * Gets the value of the loanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanName() {
        return loanName;
    }

    /**
     * Sets the value of the loanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanName(String value) {
        this.loanName = value;
    }

    /**
     * Gets the value of the loanCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanCardId() {
        return loanCardId;
    }

    /**
     * Sets the value of the loanCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanCardId(String value) {
        this.loanCardId = value;
    }

    /**
     * Gets the value of the repaymentFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentFrom() {
        return repaymentFrom;
    }

    /**
     * Sets the value of the repaymentFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentFrom(XMLGregorianCalendar value) {
        this.repaymentFrom = value;
    }

    /**
     * Gets the value of the repaymentTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentTo() {
        return repaymentTo;
    }

    /**
     * Sets the value of the repaymentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentTo(XMLGregorianCalendar value) {
        this.repaymentTo = value;
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
     * Gets the value of the siteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCode() {
        return siteCode;
    }

    /**
     * Sets the value of the siteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCode(String value) {
        this.siteCode = value;
    }

    /**
     * Gets the value of the overdueDayFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDayFrom() {
        return overdueDayFrom;
    }

    /**
     * Sets the value of the overdueDayFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDayFrom(Integer value) {
        this.overdueDayFrom = value;
    }

    /**
     * Gets the value of the overdueDayTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDayTo() {
        return overdueDayTo;
    }

    /**
     * Sets the value of the overdueDayTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDayTo(Integer value) {
        this.overdueDayTo = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

}
