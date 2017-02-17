
package com.ljwd.plms.web.wsdl.webservice.channelService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for houseInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="houseInfoDto">
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
 *       &lt;attribute name="liveYears" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="liveMonths" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="livingTypes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="other" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="livePersonNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="houseAddressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="houseAddressCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="houseAddressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="liveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hpcNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "houseInfoDto")
public class HouseInfoDto
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
    @XmlAttribute(name = "liveYears")
    protected Integer liveYears;
    @XmlAttribute(name = "liveMonths")
    protected Integer liveMonths;
    @XmlAttribute(name = "telephone")
    protected String telephone;
    @XmlAttribute(name = "houseType")
    protected String houseType;
    @XmlAttribute(name = "rentAmount")
    protected BigDecimal rentAmount;
    @XmlAttribute(name = "repaymentAmount")
    protected BigDecimal repaymentAmount;
    @XmlAttribute(name = "livingTypes")
    protected String livingTypes;
    @XmlAttribute(name = "other")
    protected String other;
    @XmlAttribute(name = "livePersonNumber")
    protected Integer livePersonNumber;
    @XmlAttribute(name = "houseAddressProvinceId")
    protected Long houseAddressProvinceId;
    @XmlAttribute(name = "houseAddressCityId")
    protected Long houseAddressCityId;
    @XmlAttribute(name = "houseAddressAreaId")
    protected Long houseAddressAreaId;
    @XmlAttribute(name = "liveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar liveDate;
    @XmlAttribute(name = "ownerType")
    protected String ownerType;
    @XmlAttribute(name = "hpcNumber")
    protected String hpcNumber;

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
     * Gets the value of the liveYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveYears() {
        return liveYears;
    }

    /**
     * Sets the value of the liveYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveYears(Integer value) {
        this.liveYears = value;
    }

    /**
     * Gets the value of the liveMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveMonths() {
        return liveMonths;
    }

    /**
     * Sets the value of the liveMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveMonths(Integer value) {
        this.liveMonths = value;
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
     * Gets the value of the houseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * Sets the value of the houseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseType(String value) {
        this.houseType = value;
    }

    /**
     * Gets the value of the rentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentAmount() {
        return rentAmount;
    }

    /**
     * Sets the value of the rentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentAmount(BigDecimal value) {
        this.rentAmount = value;
    }

    /**
     * Gets the value of the repaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * Sets the value of the repaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaymentAmount(BigDecimal value) {
        this.repaymentAmount = value;
    }

    /**
     * Gets the value of the livingTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingTypes() {
        return livingTypes;
    }

    /**
     * Sets the value of the livingTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingTypes(String value) {
        this.livingTypes = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the livePersonNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLivePersonNumber() {
        return livePersonNumber;
    }

    /**
     * Sets the value of the livePersonNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLivePersonNumber(Integer value) {
        this.livePersonNumber = value;
    }

    /**
     * Gets the value of the houseAddressProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseAddressProvinceId() {
        return houseAddressProvinceId;
    }

    /**
     * Sets the value of the houseAddressProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseAddressProvinceId(Long value) {
        this.houseAddressProvinceId = value;
    }

    /**
     * Gets the value of the houseAddressCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseAddressCityId() {
        return houseAddressCityId;
    }

    /**
     * Sets the value of the houseAddressCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseAddressCityId(Long value) {
        this.houseAddressCityId = value;
    }

    /**
     * Gets the value of the houseAddressAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseAddressAreaId() {
        return houseAddressAreaId;
    }

    /**
     * Sets the value of the houseAddressAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseAddressAreaId(Long value) {
        this.houseAddressAreaId = value;
    }

    /**
     * Gets the value of the liveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLiveDate() {
        return liveDate;
    }

    /**
     * Sets the value of the liveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLiveDate(XMLGregorianCalendar value) {
        this.liveDate = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the hpcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpcNumber() {
        return hpcNumber;
    }

    /**
     * Sets the value of the hpcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpcNumber(String value) {
        this.hpcNumber = value;
    }

}
