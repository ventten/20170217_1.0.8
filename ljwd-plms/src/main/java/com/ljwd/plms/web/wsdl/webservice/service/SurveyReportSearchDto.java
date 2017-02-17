
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyReportSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyReportSearchDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="baseInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jobInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="incomeInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addressInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suggestion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selfMobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="selfTelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coroprationInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="colleagueInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyReportSearchDto")
public class SurveyReportSearchDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "baseInfo")
    protected String baseInfo;
    @XmlAttribute(name = "jobInfo")
    protected String jobInfo;
    @XmlAttribute(name = "incomeInfo")
    protected String incomeInfo;
    @XmlAttribute(name = "addressInfo")
    protected String addressInfo;
    @XmlAttribute(name = "creditInfo")
    protected String creditInfo;
    @XmlAttribute(name = "suggestion")
    protected String suggestion;
    @XmlAttribute(name = "selfMobile")
    protected String selfMobile;
    @XmlAttribute(name = "selfTelephone")
    protected String selfTelephone;
    @XmlAttribute(name = "contactor")
    protected String contactor;
    @XmlAttribute(name = "coroprationInfo")
    protected String coroprationInfo;
    @XmlAttribute(name = "otherInfo")
    protected String otherInfo;
    @XmlAttribute(name = "spouseInfo")
    protected String spouseInfo;
    @XmlAttribute(name = "colleagueInfo")
    protected String colleagueInfo;

    /**
     * Gets the value of the baseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseInfo() {
        return baseInfo;
    }

    /**
     * Sets the value of the baseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseInfo(String value) {
        this.baseInfo = value;
    }

    /**
     * Gets the value of the jobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobInfo() {
        return jobInfo;
    }

    /**
     * Sets the value of the jobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobInfo(String value) {
        this.jobInfo = value;
    }

    /**
     * Gets the value of the incomeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeInfo() {
        return incomeInfo;
    }

    /**
     * Sets the value of the incomeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeInfo(String value) {
        this.incomeInfo = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInfo(String value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the creditInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditInfo() {
        return creditInfo;
    }

    /**
     * Sets the value of the creditInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditInfo(String value) {
        this.creditInfo = value;
    }

    /**
     * Gets the value of the suggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * Sets the value of the suggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestion(String value) {
        this.suggestion = value;
    }

    /**
     * Gets the value of the selfMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfMobile() {
        return selfMobile;
    }

    /**
     * Sets the value of the selfMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfMobile(String value) {
        this.selfMobile = value;
    }

    /**
     * Gets the value of the selfTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfTelephone() {
        return selfTelephone;
    }

    /**
     * Sets the value of the selfTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfTelephone(String value) {
        this.selfTelephone = value;
    }

    /**
     * Gets the value of the contactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * Sets the value of the contactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactor(String value) {
        this.contactor = value;
    }

    /**
     * Gets the value of the coroprationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoroprationInfo() {
        return coroprationInfo;
    }

    /**
     * Sets the value of the coroprationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoroprationInfo(String value) {
        this.coroprationInfo = value;
    }

    /**
     * Gets the value of the otherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * Sets the value of the otherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfo(String value) {
        this.otherInfo = value;
    }

    /**
     * Gets the value of the spouseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseInfo() {
        return spouseInfo;
    }

    /**
     * Sets the value of the spouseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseInfo(String value) {
        this.spouseInfo = value;
    }

    /**
     * Gets the value of the colleagueInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColleagueInfo() {
        return colleagueInfo;
    }

    /**
     * Sets the value of the colleagueInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColleagueInfo(String value) {
        this.colleagueInfo = value;
    }

}
