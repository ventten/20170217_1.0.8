
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyAbnormityInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyAbnormityInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="applyId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="matchAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entNetAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerPhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="officePhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactorPhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateTurnover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publicTurnover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyAbnormityInfoDto")
public class SurveyAbnormityInfoDto {

    @XmlAttribute(name = "applyId")
    protected Long applyId;
    @XmlAttribute(name = "matchAbnormity")
    protected String matchAbnormity;
    @XmlAttribute(name = "entNetAbnormity")
    protected String entNetAbnormity;
    @XmlAttribute(name = "customerPhoneAbnormity")
    protected String customerPhoneAbnormity;
    @XmlAttribute(name = "officePhoneAbnormity")
    protected String officePhoneAbnormity;
    @XmlAttribute(name = "contactorPhoneAbnormity")
    protected String contactorPhoneAbnormity;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "privateTurnover")
    protected String privateTurnover;
    @XmlAttribute(name = "publicTurnover")
    protected String publicTurnover;

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
     * Gets the value of the matchAbnormity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchAbnormity() {
        return matchAbnormity;
    }

    /**
     * Sets the value of the matchAbnormity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchAbnormity(String value) {
        this.matchAbnormity = value;
    }

    /**
     * Gets the value of the entNetAbnormity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntNetAbnormity() {
        return entNetAbnormity;
    }

    /**
     * Sets the value of the entNetAbnormity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntNetAbnormity(String value) {
        this.entNetAbnormity = value;
    }

    /**
     * Gets the value of the customerPhoneAbnormity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPhoneAbnormity() {
        return customerPhoneAbnormity;
    }

    /**
     * Sets the value of the customerPhoneAbnormity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPhoneAbnormity(String value) {
        this.customerPhoneAbnormity = value;
    }

    /**
     * Gets the value of the officePhoneAbnormity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhoneAbnormity() {
        return officePhoneAbnormity;
    }

    /**
     * Sets the value of the officePhoneAbnormity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhoneAbnormity(String value) {
        this.officePhoneAbnormity = value;
    }

    /**
     * Gets the value of the contactorPhoneAbnormity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactorPhoneAbnormity() {
        return contactorPhoneAbnormity;
    }

    /**
     * Sets the value of the contactorPhoneAbnormity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactorPhoneAbnormity(String value) {
        this.contactorPhoneAbnormity = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the privateTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateTurnover() {
        return privateTurnover;
    }

    /**
     * Sets the value of the privateTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateTurnover(String value) {
        this.privateTurnover = value;
    }

    /**
     * Gets the value of the publicTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicTurnover() {
        return publicTurnover;
    }

    /**
     * Sets the value of the publicTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicTurnover(String value) {
        this.publicTurnover = value;
    }

}
