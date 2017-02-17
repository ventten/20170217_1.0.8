
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchApplicationRepaymentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchApplicationRepaymentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recivId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cntrctNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="remainingPrincipal" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="corpName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="periodDay" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="periodNum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectAmt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="collectDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchApplicationRepaymentDto")
public class BatchApplicationRepaymentDto {

    @XmlAttribute(name = "recivId")
    protected Long recivId;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "cntrctNo")
    protected String cntrctNo;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "mobile")
    protected String mobile;
    @XmlAttribute(name = "payAmt")
    protected Double payAmt;
    @XmlAttribute(name = "remainingPrincipal")
    protected Double remainingPrincipal;
    @XmlAttribute(name = "siteName")
    protected String siteName;
    @XmlAttribute(name = "corpName")
    protected String corpName;
    @XmlAttribute(name = "userName")
    protected String userName;
    @XmlAttribute(name = "periodDay")
    protected Long periodDay;
    @XmlAttribute(name = "periodNum")
    protected Long periodNum;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "collectAmt")
    protected Double collectAmt;
    @XmlAttribute(name = "collectDate")
    protected String collectDate;
    @XmlAttribute(name = "operate")
    protected String operate;

    /**
     * Gets the value of the recivId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecivId() {
        return recivId;
    }

    /**
     * Sets the value of the recivId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecivId(Long value) {
        this.recivId = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the cntrctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctNo() {
        return cntrctNo;
    }

    /**
     * Sets the value of the cntrctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctNo(String value) {
        this.cntrctNo = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the idCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets the value of the idCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCard(String value) {
        this.idCard = value;
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
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPayAmt(Double value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the remainingPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRemainingPrincipal() {
        return remainingPrincipal;
    }

    /**
     * Sets the value of the remainingPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRemainingPrincipal(Double value) {
        this.remainingPrincipal = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the corpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * Sets the value of the corpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpName(String value) {
        this.corpName = value;
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
     * Gets the value of the periodDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodDay() {
        return periodDay;
    }

    /**
     * Sets the value of the periodDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodDay(Long value) {
        this.periodDay = value;
    }

    /**
     * Gets the value of the periodNum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodNum() {
        return periodNum;
    }

    /**
     * Sets the value of the periodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodNum(Long value) {
        this.periodNum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the collectAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCollectAmt() {
        return collectAmt;
    }

    /**
     * Sets the value of the collectAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCollectAmt(Double value) {
        this.collectAmt = value;
    }

    /**
     * Gets the value of the collectDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectDate() {
        return collectDate;
    }

    /**
     * Sets the value of the collectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectDate(String value) {
        this.collectDate = value;
    }

    /**
     * Gets the value of the operate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperate() {
        return operate;
    }

    /**
     * Sets the value of the operate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperate(String value) {
        this.operate = value;
    }

}
