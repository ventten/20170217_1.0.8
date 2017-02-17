
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelType" type="{http://webservice.loan.mfbms.flinkmf.com/}payChannelType" minOccurs="0"/>
 *         &lt;element name="collectBankAccount" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccount" minOccurs="0"/>
 *         &lt;element name="collectBankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectCoroprationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collectionBankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="excludePaymentTypeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includePaymentTypeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payBankAccount" type="{http://webservice.loan.mfbms.flinkmf.com/}bankAccount" minOccurs="0"/>
 *         &lt;element name="payBankAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payBankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payCoroprationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settleType" type="{http://webservice.loan.mfbms.flinkmf.com/}settleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerParameter", propOrder = {
    "channelCode",
    "channelName",
    "channelType",
    "collectBankAccount",
    "collectBankNo",
    "collectCode",
    "collectCoroprationNo",
    "collectionBankAccountId",
    "excludePaymentTypeList",
    "includePaymentTypeList",
    "payBankAccount",
    "payBankAccountId",
    "payBankNo",
    "payCode",
    "payCoroprationNo",
    "provider",
    "settleType"
})
public class OfferParameter
    extends BaseVersionableCreatorAwareEntity
{

    protected String channelCode;
    protected String channelName;
    protected PayChannelType channelType;
    protected BankAccount collectBankAccount;
    protected String collectBankNo;
    protected String collectCode;
    protected String collectCoroprationNo;
    protected Long collectionBankAccountId;
    protected String excludePaymentTypeList;
    protected String includePaymentTypeList;
    protected BankAccount payBankAccount;
    protected Long payBankAccountId;
    protected String payBankNo;
    protected String payCode;
    protected String payCoroprationNo;
    protected String provider;
    protected SettleType settleType;

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
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link PayChannelType }
     *     
     */
    public PayChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayChannelType }
     *     
     */
    public void setChannelType(PayChannelType value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the collectBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getCollectBankAccount() {
        return collectBankAccount;
    }

    /**
     * Sets the value of the collectBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setCollectBankAccount(BankAccount value) {
        this.collectBankAccount = value;
    }

    /**
     * Gets the value of the collectBankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectBankNo() {
        return collectBankNo;
    }

    /**
     * Sets the value of the collectBankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectBankNo(String value) {
        this.collectBankNo = value;
    }

    /**
     * Gets the value of the collectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectCode() {
        return collectCode;
    }

    /**
     * Sets the value of the collectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectCode(String value) {
        this.collectCode = value;
    }

    /**
     * Gets the value of the collectCoroprationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectCoroprationNo() {
        return collectCoroprationNo;
    }

    /**
     * Sets the value of the collectCoroprationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectCoroprationNo(String value) {
        this.collectCoroprationNo = value;
    }

    /**
     * Gets the value of the collectionBankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCollectionBankAccountId() {
        return collectionBankAccountId;
    }

    /**
     * Sets the value of the collectionBankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCollectionBankAccountId(Long value) {
        this.collectionBankAccountId = value;
    }

    /**
     * Gets the value of the excludePaymentTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludePaymentTypeList() {
        return excludePaymentTypeList;
    }

    /**
     * Sets the value of the excludePaymentTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludePaymentTypeList(String value) {
        this.excludePaymentTypeList = value;
    }

    /**
     * Gets the value of the includePaymentTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludePaymentTypeList() {
        return includePaymentTypeList;
    }

    /**
     * Sets the value of the includePaymentTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludePaymentTypeList(String value) {
        this.includePaymentTypeList = value;
    }

    /**
     * Gets the value of the payBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getPayBankAccount() {
        return payBankAccount;
    }

    /**
     * Sets the value of the payBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setPayBankAccount(BankAccount value) {
        this.payBankAccount = value;
    }

    /**
     * Gets the value of the payBankAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayBankAccountId() {
        return payBankAccountId;
    }

    /**
     * Sets the value of the payBankAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayBankAccountId(Long value) {
        this.payBankAccountId = value;
    }

    /**
     * Gets the value of the payBankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayBankNo() {
        return payBankNo;
    }

    /**
     * Sets the value of the payBankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayBankNo(String value) {
        this.payBankNo = value;
    }

    /**
     * Gets the value of the payCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * Sets the value of the payCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCode(String value) {
        this.payCode = value;
    }

    /**
     * Gets the value of the payCoroprationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCoroprationNo() {
        return payCoroprationNo;
    }

    /**
     * Sets the value of the payCoroprationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCoroprationNo(String value) {
        this.payCoroprationNo = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the settleType property.
     * 
     * @return
     *     possible object is
     *     {@link SettleType }
     *     
     */
    public SettleType getSettleType() {
        return settleType;
    }

    /**
     * Sets the value of the settleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleType }
     *     
     */
    public void setSettleType(SettleType value) {
        this.settleType = value;
    }

}
