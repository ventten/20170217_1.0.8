
package com.ljwd.plms.web.wsdl.webservice.channelService;

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
 * <p>Java class for offerRequestParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerRequestParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseEnquiryParamDto">
 *       &lt;sequence>
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corpNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includePaymentTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludePaymentTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerType" type="{http://webservice.loan.mfbms.flinkmf.com/}offerType" minOccurs="0"/>
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minRecivPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="foreignTradeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="paymentDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="reCollectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="banks">
 *         &lt;simpleType>
 *           &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerRequestParamDto", propOrder = {
    "channelCode",
    "corpNo",
    "includePaymentTypes",
    "excludePaymentTypes",
    "offerType",
    "contractNo",
    "paymentId",
    "minRecivPeriod",
    "payDateFrom",
    "payDateTo",
    "foreignTradeType",
    "seq"
})
public class OfferRequestParamDto
    extends BaseEnquiryParamDto
{

    protected String channelCode;
    protected String corpNo;
    @XmlElement(nillable = true)
    protected List<String> includePaymentTypes;
    @XmlElement(nillable = true)
    protected List<String> excludePaymentTypes;
    protected OfferType offerType;
    protected String contractNo;
    protected Long paymentId;
    protected int minRecivPeriod;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDateTo;
    protected String foreignTradeType;
    protected Integer seq;
    @XmlAttribute(name = "paymentDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDateFrom;
    @XmlAttribute(name = "paymentDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDateTo;
    @XmlAttribute(name = "reCollectDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reCollectDate;
    @XmlAttribute(name = "paymentType")
    protected String paymentType;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "banks")
    protected List<String> banks;

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the corpNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpNo() {
        return corpNo;
    }

    /**
     * Sets the value of the corpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpNo(String value) {
        this.corpNo = value;
    }

    /**
     * Gets the value of the includePaymentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includePaymentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludePaymentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludePaymentTypes() {
        if (includePaymentTypes == null) {
            includePaymentTypes = new ArrayList<String>();
        }
        return this.includePaymentTypes;
    }

    /**
     * Gets the value of the excludePaymentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludePaymentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludePaymentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludePaymentTypes() {
        if (excludePaymentTypes == null) {
            excludePaymentTypes = new ArrayList<String>();
        }
        return this.excludePaymentTypes;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link OfferType }
     *     
     */
    public OfferType getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferType }
     *     
     */
    public void setOfferType(OfferType value) {
        this.offerType = value;
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
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the minRecivPeriod property.
     * 
     */
    public int getMinRecivPeriod() {
        return minRecivPeriod;
    }

    /**
     * Sets the value of the minRecivPeriod property.
     * 
     */
    public void setMinRecivPeriod(int value) {
        this.minRecivPeriod = value;
    }

    /**
     * Gets the value of the payDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateFrom() {
        return payDateFrom;
    }

    /**
     * Sets the value of the payDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateFrom(XMLGregorianCalendar value) {
        this.payDateFrom = value;
    }

    /**
     * Gets the value of the payDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDateTo() {
        return payDateTo;
    }

    /**
     * Sets the value of the payDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDateTo(XMLGregorianCalendar value) {
        this.payDateTo = value;
    }

    /**
     * Gets the value of the foreignTradeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTradeType() {
        return foreignTradeType;
    }

    /**
     * Sets the value of the foreignTradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTradeType(String value) {
        this.foreignTradeType = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeq(Integer value) {
        this.seq = value;
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
     * Gets the value of the reCollectDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReCollectDate() {
        return reCollectDate;
    }

    /**
     * Sets the value of the reCollectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReCollectDate(XMLGregorianCalendar value) {
        this.reCollectDate = value;
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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the banks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the banks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBanks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBanks() {
        if (banks == null) {
            banks = new ArrayList<String>();
        }
        return this.banks;
    }

}
