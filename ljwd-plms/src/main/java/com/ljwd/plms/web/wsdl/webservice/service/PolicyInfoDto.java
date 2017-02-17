
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for policyInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyInfoDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="custid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="policyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policyAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paymentYears" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="periodGuarantee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="grossLine" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="policyBranch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paidPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="policyCustName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactTel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policyAddressProvinceId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="policyAddressCityId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="policyAddressAreaId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyInfoDto")
public class PolicyInfoDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "custid")
    protected Long custid;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;
    @XmlAttribute(name = "policyName")
    protected String policyName;
    @XmlAttribute(name = "policyAddress")
    protected String policyAddress;
    @XmlAttribute(name = "effectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "paymentYears")
    protected Integer paymentYears;
    @XmlAttribute(name = "paymentMethod")
    protected String paymentMethod;
    @XmlAttribute(name = "paymentCategory")
    protected String paymentCategory;
    @XmlAttribute(name = "periodGuarantee")
    protected BigDecimal periodGuarantee;
    @XmlAttribute(name = "grossLine")
    protected BigDecimal grossLine;
    @XmlAttribute(name = "policyBranch")
    protected String policyBranch;
    @XmlAttribute(name = "paidPeriod")
    protected Integer paidPeriod;
    @XmlAttribute(name = "policyCustName")
    protected String policyCustName;
    @XmlAttribute(name = "contactTel")
    protected String contactTel;
    @XmlAttribute(name = "policyAddressProvinceId")
    protected Long policyAddressProvinceId;
    @XmlAttribute(name = "policyAddressCityId")
    protected Long policyAddressCityId;
    @XmlAttribute(name = "policyAddressAreaId")
    protected Long policyAddressAreaId;

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
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the policyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyAddress() {
        return policyAddress;
    }

    /**
     * Sets the value of the policyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyAddress(String value) {
        this.policyAddress = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the paymentYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentYears() {
        return paymentYears;
    }

    /**
     * Sets the value of the paymentYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentYears(Integer value) {
        this.paymentYears = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the paymentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCategory() {
        return paymentCategory;
    }

    /**
     * Sets the value of the paymentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCategory(String value) {
        this.paymentCategory = value;
    }

    /**
     * Gets the value of the periodGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodGuarantee() {
        return periodGuarantee;
    }

    /**
     * Sets the value of the periodGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodGuarantee(BigDecimal value) {
        this.periodGuarantee = value;
    }

    /**
     * Gets the value of the grossLine property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossLine() {
        return grossLine;
    }

    /**
     * Sets the value of the grossLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossLine(BigDecimal value) {
        this.grossLine = value;
    }

    /**
     * Gets the value of the policyBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyBranch() {
        return policyBranch;
    }

    /**
     * Sets the value of the policyBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyBranch(String value) {
        this.policyBranch = value;
    }

    /**
     * Gets the value of the paidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaidPeriod() {
        return paidPeriod;
    }

    /**
     * Sets the value of the paidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaidPeriod(Integer value) {
        this.paidPeriod = value;
    }

    /**
     * Gets the value of the policyCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyCustName() {
        return policyCustName;
    }

    /**
     * Sets the value of the policyCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyCustName(String value) {
        this.policyCustName = value;
    }

    /**
     * Gets the value of the contactTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * Sets the value of the contactTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTel(String value) {
        this.contactTel = value;
    }

    /**
     * Gets the value of the policyAddressProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyAddressProvinceId() {
        return policyAddressProvinceId;
    }

    /**
     * Sets the value of the policyAddressProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyAddressProvinceId(Long value) {
        this.policyAddressProvinceId = value;
    }

    /**
     * Gets the value of the policyAddressCityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyAddressCityId() {
        return policyAddressCityId;
    }

    /**
     * Sets the value of the policyAddressCityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyAddressCityId(Long value) {
        this.policyAddressCityId = value;
    }

    /**
     * Gets the value of the policyAddressAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyAddressAreaId() {
        return policyAddressAreaId;
    }

    /**
     * Sets the value of the policyAddressAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyAddressAreaId(Long value) {
        this.policyAddressAreaId = value;
    }

}
