
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractChangeSiteSearchParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractChangeSiteSearchParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseDataControlDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerIdcardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contractRecordVersion" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="contractSignSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractChangeSiteSearchParamDto")
public class ContractChangeSiteSearchParamDto
    extends BaseDataControlDto
{

    @XmlAttribute(name = "customerName")
    protected String customerName;
    @XmlAttribute(name = "customerIdcardNo")
    protected String customerIdcardNo;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "contractRecordVersion")
    protected Integer contractRecordVersion;
    @XmlAttribute(name = "contractSignSiteCode")
    protected String contractSignSiteCode;

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customerIdcardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdcardNo() {
        return customerIdcardNo;
    }

    /**
     * Sets the value of the customerIdcardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdcardNo(String value) {
        this.customerIdcardNo = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractRecordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractRecordVersion() {
        return contractRecordVersion;
    }

    /**
     * Sets the value of the contractRecordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractRecordVersion(Integer value) {
        this.contractRecordVersion = value;
    }

    /**
     * Gets the value of the contractSignSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractSignSiteCode() {
        return contractSignSiteCode;
    }

    /**
     * Sets the value of the contractSignSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractSignSiteCode(String value) {
        this.contractSignSiteCode = value;
    }

}
