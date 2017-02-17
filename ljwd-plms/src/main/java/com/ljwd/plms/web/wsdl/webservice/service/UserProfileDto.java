
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userProfileDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userProfileDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="isSalesMan" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="isSuperviser" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="status" use="required" type="{http://webservice.loan.mfbms.flinkmf.com/}userLoginStatus" />
 *       &lt;attribute name="dataRange" use="required" type="{http://webservice.loan.mfbms.flinkmf.com/}dataRangeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userProfileDto")
public class UserProfileDto {

    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "orgId", required = true)
    protected long orgId;
    @XmlAttribute(name = "isSalesMan", required = true)
    protected boolean isSalesMan;
    @XmlAttribute(name = "isSuperviser", required = true)
    protected boolean isSuperviser;
    @XmlAttribute(name = "status", required = true)
    protected UserLoginStatus status;
    @XmlAttribute(name = "dataRange", required = true)
    protected DataRangeType dataRange;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
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
     * Gets the value of the orgId property.
     * 
     */
    public long getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     */
    public void setOrgId(long value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the isSalesMan property.
     * 
     */
    public boolean isIsSalesMan() {
        return isSalesMan;
    }

    /**
     * Sets the value of the isSalesMan property.
     * 
     */
    public void setIsSalesMan(boolean value) {
        this.isSalesMan = value;
    }

    /**
     * Gets the value of the isSuperviser property.
     * 
     */
    public boolean isIsSuperviser() {
        return isSuperviser;
    }

    /**
     * Sets the value of the isSuperviser property.
     * 
     */
    public void setIsSuperviser(boolean value) {
        this.isSuperviser = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UserLoginStatus }
     *     
     */
    public UserLoginStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLoginStatus }
     *     
     */
    public void setStatus(UserLoginStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the dataRange property.
     * 
     * @return
     *     possible object is
     *     {@link DataRangeType }
     *     
     */
    public DataRangeType getDataRange() {
        return dataRange;
    }

    /**
     * Sets the value of the dataRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRangeType }
     *     
     */
    public void setDataRange(DataRangeType value) {
        this.dataRange = value;
    }

}
