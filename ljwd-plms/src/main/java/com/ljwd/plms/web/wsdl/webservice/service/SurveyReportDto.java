
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for surveyReportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyReportDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="badRecordCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="matchAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="entNetAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phoneRemark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calRemark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publicTurnover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateTurnover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publicQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateLastQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publicLastQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateBal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publicBal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="infoValidity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commentRemark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyReportDto")
public class SurveyReportDto {

    @XmlAttribute(name = "badRecordCode")
    protected String badRecordCode;
    @XmlAttribute(name = "matchAbnormity")
    protected String matchAbnormity;
    @XmlAttribute(name = "entNetAbnormity")
    protected String entNetAbnormity;
    @XmlAttribute(name = "phoneRemark")
    protected String phoneRemark;
    @XmlAttribute(name = "calRemark")
    protected String calRemark;
    @XmlAttribute(name = "publicTurnover")
    protected String publicTurnover;
    @XmlAttribute(name = "privateTurnover")
    protected String privateTurnover;
    @XmlAttribute(name = "privateQuarterInterest")
    protected BigDecimal privateQuarterInterest;
    @XmlAttribute(name = "publicQuarterInterest")
    protected BigDecimal publicQuarterInterest;
    @XmlAttribute(name = "privateLastQuarterInterest")
    protected BigDecimal privateLastQuarterInterest;
    @XmlAttribute(name = "publicLastQuarterInterest")
    protected BigDecimal publicLastQuarterInterest;
    @XmlAttribute(name = "privateBal")
    protected BigDecimal privateBal;
    @XmlAttribute(name = "publicBal")
    protected BigDecimal publicBal;
    @XmlAttribute(name = "infoValidity")
    protected String infoValidity;
    @XmlAttribute(name = "commentRemark")
    protected String commentRemark;
    @XmlAttribute(name = "approvalAmount")
    protected BigDecimal approvalAmount;
    @XmlAttribute(name = "approvalPeriod")
    protected Integer approvalPeriod;

    /**
     * Gets the value of the badRecordCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBadRecordCode() {
        return badRecordCode;
    }

    /**
     * Sets the value of the badRecordCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBadRecordCode(String value) {
        this.badRecordCode = value;
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
     * Gets the value of the phoneRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneRemark() {
        return phoneRemark;
    }

    /**
     * Sets the value of the phoneRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneRemark(String value) {
        this.phoneRemark = value;
    }

    /**
     * Gets the value of the calRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalRemark() {
        return calRemark;
    }

    /**
     * Sets the value of the calRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalRemark(String value) {
        this.calRemark = value;
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
     * Gets the value of the privateQuarterInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateQuarterInterest() {
        return privateQuarterInterest;
    }

    /**
     * Sets the value of the privateQuarterInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateQuarterInterest(BigDecimal value) {
        this.privateQuarterInterest = value;
    }

    /**
     * Gets the value of the publicQuarterInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublicQuarterInterest() {
        return publicQuarterInterest;
    }

    /**
     * Sets the value of the publicQuarterInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublicQuarterInterest(BigDecimal value) {
        this.publicQuarterInterest = value;
    }

    /**
     * Gets the value of the privateLastQuarterInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateLastQuarterInterest() {
        return privateLastQuarterInterest;
    }

    /**
     * Sets the value of the privateLastQuarterInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateLastQuarterInterest(BigDecimal value) {
        this.privateLastQuarterInterest = value;
    }

    /**
     * Gets the value of the publicLastQuarterInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublicLastQuarterInterest() {
        return publicLastQuarterInterest;
    }

    /**
     * Sets the value of the publicLastQuarterInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublicLastQuarterInterest(BigDecimal value) {
        this.publicLastQuarterInterest = value;
    }

    /**
     * Gets the value of the privateBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrivateBal() {
        return privateBal;
    }

    /**
     * Sets the value of the privateBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrivateBal(BigDecimal value) {
        this.privateBal = value;
    }

    /**
     * Gets the value of the publicBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublicBal() {
        return publicBal;
    }

    /**
     * Sets the value of the publicBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublicBal(BigDecimal value) {
        this.publicBal = value;
    }

    /**
     * Gets the value of the infoValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoValidity() {
        return infoValidity;
    }

    /**
     * Sets the value of the infoValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoValidity(String value) {
        this.infoValidity = value;
    }

    /**
     * Gets the value of the commentRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentRemark() {
        return commentRemark;
    }

    /**
     * Sets the value of the commentRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentRemark(String value) {
        this.commentRemark = value;
    }

    /**
     * Gets the value of the approvalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovalAmount() {
        return approvalAmount;
    }

    /**
     * Sets the value of the approvalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovalAmount(BigDecimal value) {
        this.approvalAmount = value;
    }

    /**
     * Gets the value of the approvalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovalPeriod() {
        return approvalPeriod;
    }

    /**
     * Sets the value of the approvalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovalPeriod(Integer value) {
        this.approvalPeriod = value;
    }

}
