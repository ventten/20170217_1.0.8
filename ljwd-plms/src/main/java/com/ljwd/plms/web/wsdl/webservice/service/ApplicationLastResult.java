
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationLastResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationLastResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cancelledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelledByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastApprovalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lastApprovalBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastApprovalByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastApprovalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastApprovalResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastApprovalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rejectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rejectedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="submittedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submittedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userByCancelledBy" type="{http://webservice.loan.mfbms.flinkmf.com/}user" minOccurs="0"/>
 *         &lt;element name="userByLastApprBy" type="{http://webservice.loan.mfbms.flinkmf.com/}user" minOccurs="0"/>
 *         &lt;element name="userByRejectedBy" type="{http://webservice.loan.mfbms.flinkmf.com/}user" minOccurs="0"/>
 *         &lt;element name="userBySubmittedBy" type="{http://webservice.loan.mfbms.flinkmf.com/}user" minOccurs="0"/>
 *         &lt;element name="userByVoidedBy" type="{http://webservice.loan.mfbms.flinkmf.com/}user" minOccurs="0"/>
 *         &lt;element name="voidReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voidTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="voidedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voidedByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationLastResult", propOrder = {
    "applicationId",
    "applicationInfo",
    "cancelReason",
    "cancelTime",
    "cancelledBy",
    "cancelledByName",
    "lastApprovalAmount",
    "lastApprovalBy",
    "lastApprovalByName",
    "lastApprovalPeriod",
    "lastApprovalResult",
    "lastApprovalTime",
    "rejectReason",
    "rejectTime",
    "rejectedBy",
    "rejectedByName",
    "submitTime",
    "submittedBy",
    "submittedByName",
    "userByCancelledBy",
    "userByLastApprBy",
    "userByRejectedBy",
    "userBySubmittedBy",
    "userByVoidedBy",
    "voidReason",
    "voidTime",
    "voidedBy",
    "voidedByName"
})
public class ApplicationLastResult
    extends BaseVersionableCreatorAwareEntity
{

    protected Long applicationId;
    protected ApplicationInfo applicationInfo;
    protected String cancelReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelTime;
    protected String cancelledBy;
    protected String cancelledByName;
    protected BigDecimal lastApprovalAmount;
    protected String lastApprovalBy;
    protected String lastApprovalByName;
    protected Integer lastApprovalPeriod;
    protected String lastApprovalResult;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastApprovalTime;
    protected String rejectReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rejectTime;
    protected String rejectedBy;
    protected String rejectedByName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitTime;
    protected String submittedBy;
    protected String submittedByName;
    protected User userByCancelledBy;
    protected User userByLastApprBy;
    protected User userByRejectedBy;
    protected User userBySubmittedBy;
    protected User userByVoidedBy;
    protected String voidReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar voidTime;
    protected String voidedBy;
    protected String voidedByName;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfo }
     *     
     */
    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfo }
     *     
     */
    public void setApplicationInfo(ApplicationInfo value) {
        this.applicationInfo = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the cancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelTime() {
        return cancelTime;
    }

    /**
     * Sets the value of the cancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelTime(XMLGregorianCalendar value) {
        this.cancelTime = value;
    }

    /**
     * Gets the value of the cancelledBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledBy() {
        return cancelledBy;
    }

    /**
     * Sets the value of the cancelledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledBy(String value) {
        this.cancelledBy = value;
    }

    /**
     * Gets the value of the cancelledByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledByName() {
        return cancelledByName;
    }

    /**
     * Sets the value of the cancelledByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledByName(String value) {
        this.cancelledByName = value;
    }

    /**
     * Gets the value of the lastApprovalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastApprovalAmount() {
        return lastApprovalAmount;
    }

    /**
     * Sets the value of the lastApprovalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastApprovalAmount(BigDecimal value) {
        this.lastApprovalAmount = value;
    }

    /**
     * Gets the value of the lastApprovalBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastApprovalBy() {
        return lastApprovalBy;
    }

    /**
     * Sets the value of the lastApprovalBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastApprovalBy(String value) {
        this.lastApprovalBy = value;
    }

    /**
     * Gets the value of the lastApprovalByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastApprovalByName() {
        return lastApprovalByName;
    }

    /**
     * Sets the value of the lastApprovalByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastApprovalByName(String value) {
        this.lastApprovalByName = value;
    }

    /**
     * Gets the value of the lastApprovalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastApprovalPeriod() {
        return lastApprovalPeriod;
    }

    /**
     * Sets the value of the lastApprovalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastApprovalPeriod(Integer value) {
        this.lastApprovalPeriod = value;
    }

    /**
     * Gets the value of the lastApprovalResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastApprovalResult() {
        return lastApprovalResult;
    }

    /**
     * Sets the value of the lastApprovalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastApprovalResult(String value) {
        this.lastApprovalResult = value;
    }

    /**
     * Gets the value of the lastApprovalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastApprovalTime() {
        return lastApprovalTime;
    }

    /**
     * Sets the value of the lastApprovalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastApprovalTime(XMLGregorianCalendar value) {
        this.lastApprovalTime = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the rejectTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRejectTime() {
        return rejectTime;
    }

    /**
     * Sets the value of the rejectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRejectTime(XMLGregorianCalendar value) {
        this.rejectTime = value;
    }

    /**
     * Gets the value of the rejectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectedBy() {
        return rejectedBy;
    }

    /**
     * Sets the value of the rejectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectedBy(String value) {
        this.rejectedBy = value;
    }

    /**
     * Gets the value of the rejectedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectedByName() {
        return rejectedByName;
    }

    /**
     * Sets the value of the rejectedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectedByName(String value) {
        this.rejectedByName = value;
    }

    /**
     * Gets the value of the submitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitTime() {
        return submitTime;
    }

    /**
     * Sets the value of the submitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitTime(XMLGregorianCalendar value) {
        this.submitTime = value;
    }

    /**
     * Gets the value of the submittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedBy() {
        return submittedBy;
    }

    /**
     * Sets the value of the submittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedBy(String value) {
        this.submittedBy = value;
    }

    /**
     * Gets the value of the submittedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedByName() {
        return submittedByName;
    }

    /**
     * Sets the value of the submittedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedByName(String value) {
        this.submittedByName = value;
    }

    /**
     * Gets the value of the userByCancelledBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserByCancelledBy() {
        return userByCancelledBy;
    }

    /**
     * Sets the value of the userByCancelledBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserByCancelledBy(User value) {
        this.userByCancelledBy = value;
    }

    /**
     * Gets the value of the userByLastApprBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserByLastApprBy() {
        return userByLastApprBy;
    }

    /**
     * Sets the value of the userByLastApprBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserByLastApprBy(User value) {
        this.userByLastApprBy = value;
    }

    /**
     * Gets the value of the userByRejectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserByRejectedBy() {
        return userByRejectedBy;
    }

    /**
     * Sets the value of the userByRejectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserByRejectedBy(User value) {
        this.userByRejectedBy = value;
    }

    /**
     * Gets the value of the userBySubmittedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserBySubmittedBy() {
        return userBySubmittedBy;
    }

    /**
     * Sets the value of the userBySubmittedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserBySubmittedBy(User value) {
        this.userBySubmittedBy = value;
    }

    /**
     * Gets the value of the userByVoidedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUserByVoidedBy() {
        return userByVoidedBy;
    }

    /**
     * Sets the value of the userByVoidedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUserByVoidedBy(User value) {
        this.userByVoidedBy = value;
    }

    /**
     * Gets the value of the voidReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidReason() {
        return voidReason;
    }

    /**
     * Sets the value of the voidReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidReason(String value) {
        this.voidReason = value;
    }

    /**
     * Gets the value of the voidTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVoidTime() {
        return voidTime;
    }

    /**
     * Sets the value of the voidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVoidTime(XMLGregorianCalendar value) {
        this.voidTime = value;
    }

    /**
     * Gets the value of the voidedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidedBy() {
        return voidedBy;
    }

    /**
     * Sets the value of the voidedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidedBy(String value) {
        this.voidedBy = value;
    }

    /**
     * Gets the value of the voidedByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoidedByName() {
        return voidedByName;
    }

    /**
     * Sets the value of the voidedByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoidedByName(String value) {
        this.voidedByName = value;
    }

}
