
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outVisitSettingParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitSettingParamDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="userId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siteCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cityCode" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orgId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="caseCountLast" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remainderAmountLast" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="caseCountMonthLast" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remainderAmountMonthLast" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="caseCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="caseCountMonth" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="remainderAmountMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitSettingParamDto")
public class OutVisitSettingParamDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "userId")
    protected String userId;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "siteCode")
    protected String siteCode;
    @XmlAttribute(name = "cityCode")
    protected Long cityCode;
    @XmlAttribute(name = "areaCode")
    protected String areaCode;
    @XmlAttribute(name = "orgId")
    protected Long orgId;
    @XmlAttribute(name = "isActive")
    protected Boolean isActive;
    @XmlAttribute(name = "caseCountLast")
    protected Long caseCountLast;
    @XmlAttribute(name = "remainderAmountLast")
    protected BigDecimal remainderAmountLast;
    @XmlAttribute(name = "caseCountMonthLast")
    protected Long caseCountMonthLast;
    @XmlAttribute(name = "remainderAmountMonthLast")
    protected BigDecimal remainderAmountMonthLast;
    @XmlAttribute(name = "caseCount")
    protected Long caseCount;
    @XmlAttribute(name = "remainderAmount")
    protected BigDecimal remainderAmount;
    @XmlAttribute(name = "caseCountMonth")
    protected Long caseCountMonth;
    @XmlAttribute(name = "remainderAmountMonth")
    protected BigDecimal remainderAmountMonth;

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
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCityCode(Long value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgId(Long value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the caseCountLast property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseCountLast() {
        return caseCountLast;
    }

    /**
     * Sets the value of the caseCountLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseCountLast(Long value) {
        this.caseCountLast = value;
    }

    /**
     * Gets the value of the remainderAmountLast property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmountLast() {
        return remainderAmountLast;
    }

    /**
     * Sets the value of the remainderAmountLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmountLast(BigDecimal value) {
        this.remainderAmountLast = value;
    }

    /**
     * Gets the value of the caseCountMonthLast property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseCountMonthLast() {
        return caseCountMonthLast;
    }

    /**
     * Sets the value of the caseCountMonthLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseCountMonthLast(Long value) {
        this.caseCountMonthLast = value;
    }

    /**
     * Gets the value of the remainderAmountMonthLast property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmountMonthLast() {
        return remainderAmountMonthLast;
    }

    /**
     * Sets the value of the remainderAmountMonthLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmountMonthLast(BigDecimal value) {
        this.remainderAmountMonthLast = value;
    }

    /**
     * Gets the value of the caseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseCount() {
        return caseCount;
    }

    /**
     * Sets the value of the caseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseCount(Long value) {
        this.caseCount = value;
    }

    /**
     * Gets the value of the remainderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * Sets the value of the remainderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmount(BigDecimal value) {
        this.remainderAmount = value;
    }

    /**
     * Gets the value of the caseCountMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCaseCountMonth() {
        return caseCountMonth;
    }

    /**
     * Sets the value of the caseCountMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCaseCountMonth(Long value) {
        this.caseCountMonth = value;
    }

    /**
     * Gets the value of the remainderAmountMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmountMonth() {
        return remainderAmountMonth;
    }

    /**
     * Sets the value of the remainderAmountMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmountMonth(BigDecimal value) {
        this.remainderAmountMonth = value;
    }

}
