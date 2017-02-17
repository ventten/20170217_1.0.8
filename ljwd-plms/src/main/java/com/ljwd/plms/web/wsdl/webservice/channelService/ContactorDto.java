
package com.ljwd.plms.web.wsdl.webservice.channelService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contactorDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactorDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="age" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitTelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="telType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="companyaddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="homeaddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseaddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="addressCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="addressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="addrDelails" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactorDto")
public class ContactorDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "custid")
    protected Long custid;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "gender")
    protected String gender;
    @XmlAttribute(name = "relationship")
    protected String relationship;
    @XmlAttribute(name = "age")
    protected Integer age;
    @XmlAttribute(name = "telephone")
    protected String telephone;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "unitName")
    protected String unitName;
    @XmlAttribute(name = "position")
    protected String position;
    @XmlAttribute(name = "unitTelephone")
    protected String unitTelephone;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "telType")
    protected String telType;
    @XmlAttribute(name = "recentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recentTime;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "contactorName")
    protected String contactorName;
    @XmlAttribute(name = "callTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callTime;
    @XmlAttribute(name = "companyaddr")
    protected String companyaddr;
    @XmlAttribute(name = "homeaddr")
    protected String homeaddr;
    @XmlAttribute(name = "houseaddr")
    protected String houseaddr;
    @XmlAttribute(name = "addressProvinceId")
    protected Long addressProvinceId;
    @XmlAttribute(name = "addressCityId")
    protected Long addressCityId;
    @XmlAttribute(name = "addressAreaId")
    protected Long addressAreaId;
    @XmlAttribute(name = "addrDelails")
    protected String addrDelails;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the unitTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitTelephone() {
        return unitTelephone;
    }

    /**
     * Sets the value of the unitTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitTelephone(String value) {
        this.unitTelephone = value;
    }

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
    }

    /**
     * Gets the value of the telType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelType() {
        return telType;
    }

    /**
     * Sets the value of the telType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelType(String value) {
        this.telType = value;
    }

    /**
     * Gets the value of the recentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecentTime() {
        return recentTime;
    }

    /**
     * Sets the value of the recentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecentTime(XMLGregorianCalendar value) {
        this.recentTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the contactorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactorName() {
        return contactorName;
    }

    /**
     * Sets the value of the contactorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactorName(String value) {
        this.contactorName = value;
    }

    /**
     * Gets the value of the callTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallTime() {
        return callTime;
    }

    /**
     * Sets the value of the callTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallTime(XMLGregorianCalendar value) {
        this.callTime = value;
    }

    /**
     * Gets the value of the companyaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyaddr() {
        return companyaddr;
    }

    /**
     * Sets the value of the companyaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyaddr(String value) {
        this.companyaddr = value;
    }

    /**
     * Gets the value of the homeaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeaddr() {
        return homeaddr;
    }

    /**
     * Sets the value of the homeaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeaddr(String value) {
        this.homeaddr = value;
    }

    /**
     * Gets the value of the houseaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseaddr() {
        return houseaddr;
    }

    /**
     * Sets the value of the houseaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseaddr(String value) {
        this.houseaddr = value;
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
     * Gets the value of the addrDelails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrDelails() {
        return addrDelails;
    }

    /**
     * Sets the value of the addrDelails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrDelails(String value) {
        this.addrDelails = value;
    }

}
