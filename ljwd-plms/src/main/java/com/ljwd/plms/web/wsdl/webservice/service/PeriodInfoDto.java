
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for periodInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="periodInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="addressCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="addressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="obligee" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peopertyNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isNet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "periodInfoDto")
public class PeriodInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "custid")
    protected Long custid;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "address1")
    protected String address1;
    @XmlAttribute(name = "address2")
    protected String address2;
    @XmlAttribute(name = "address3")
    protected String address3;
    @XmlAttribute(name = "addressProvinceId")
    protected Long addressProvinceId;
    @XmlAttribute(name = "addressCityId")
    protected Long addressCityId;
    @XmlAttribute(name = "addressAreaId")
    protected Long addressAreaId;
    @XmlAttribute(name = "obligee")
    protected String obligee;
    @XmlAttribute(name = "peopertyNo")
    protected String peopertyNo;
    @XmlAttribute(name = "isNet")
    protected Boolean isNet;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the custid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustid() {
        return custid;
    }

    /**
     * Sets the value of the custid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustid(Long value) {
        this.custid = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the addressProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressProvinceId() {
        return addressProvinceId;
    }

    /**
     * Sets the value of the addressProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressProvinceId(Long value) {
        this.addressProvinceId = value;
    }

    /**
     * Gets the value of the addressCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressCityId() {
        return addressCityId;
    }

    /**
     * Sets the value of the addressCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressCityId(Long value) {
        this.addressCityId = value;
    }

    /**
     * Gets the value of the addressAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddressAreaId() {
        return addressAreaId;
    }

    /**
     * Sets the value of the addressAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddressAreaId(Long value) {
        this.addressAreaId = value;
    }

    /**
     * Gets the value of the obligee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligee() {
        return obligee;
    }

    /**
     * Sets the value of the obligee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligee(String value) {
        this.obligee = value;
    }

    /**
     * Gets the value of the peopertyNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeopertyNo() {
        return peopertyNo;
    }

    /**
     * Sets the value of the peopertyNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeopertyNo(String value) {
        this.peopertyNo = value;
    }

    /**
     * Gets the value of the isNet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNet() {
        return isNet;
    }

    /**
     * Sets the value of the isNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNet(Boolean value) {
        this.isNet = value;
    }

}
