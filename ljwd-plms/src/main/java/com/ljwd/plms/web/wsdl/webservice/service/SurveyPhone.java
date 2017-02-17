
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyPhone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyPhone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactorPhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPurposeRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivablesState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="superAging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surveyPhoneDetails" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyPhoneDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskResult" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyPhone", propOrder = {
    "applicationInfo",
    "applicationInfoId",
    "checkTime",
    "checker",
    "contactorPhoneAbnormity",
    "customerPhoneAbnormity",
    "loanPurposeRequirement",
    "officePhoneAbnormity",
    "operatingIncome",
    "operationState",
    "reason",
    "receivablesState",
    "remark",
    "superAging",
    "surveyPhoneDetails",
    "taskResult"
})
public class SurveyPhone
    extends BaseVersionableCreatorAwareEntity
{

    protected ApplicationInfo applicationInfo;
    protected Long applicationInfoId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;
    protected String checker;
    protected String contactorPhoneAbnormity;
    protected String customerPhoneAbnormity;
    protected String loanPurposeRequirement;
    protected String officePhoneAbnormity;
    protected String operatingIncome;
    protected String operationState;
    protected String reason;
    protected String receivablesState;
    protected String remark;
    protected String superAging;
    @XmlElement(nillable = true)
    protected List<SurveyPhoneDetail> surveyPhoneDetails;
    protected TaskResult taskResult;

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
     * Gets the value of the applicationInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationInfoId() {
        return applicationInfoId;
    }

    /**
     * Sets the value of the applicationInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationInfoId(Long value) {
        this.applicationInfoId = value;
    }

    /**
     * Gets the value of the checkTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckTime() {
        return checkTime;
    }

    /**
     * Sets the value of the checkTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckTime(XMLGregorianCalendar value) {
        this.checkTime = value;
    }

    /**
     * Gets the value of the checker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecker() {
        return checker;
    }

    /**
     * Sets the value of the checker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecker(String value) {
        this.checker = value;
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
     * Gets the value of the loanPurposeRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPurposeRequirement() {
        return loanPurposeRequirement;
    }

    /**
     * Sets the value of the loanPurposeRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPurposeRequirement(String value) {
        this.loanPurposeRequirement = value;
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
     * Gets the value of the operatingIncome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingIncome() {
        return operatingIncome;
    }

    /**
     * Sets the value of the operatingIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingIncome(String value) {
        this.operatingIncome = value;
    }

    /**
     * Gets the value of the operationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationState() {
        return operationState;
    }

    /**
     * Sets the value of the operationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationState(String value) {
        this.operationState = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the receivablesState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivablesState() {
        return receivablesState;
    }

    /**
     * Sets the value of the receivablesState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivablesState(String value) {
        this.receivablesState = value;
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
     * Gets the value of the superAging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperAging() {
        return superAging;
    }

    /**
     * Sets the value of the superAging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperAging(String value) {
        this.superAging = value;
    }

    /**
     * Gets the value of the surveyPhoneDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyPhoneDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyPhoneDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyPhoneDetail }
     * 
     * 
     */
    public List<SurveyPhoneDetail> getSurveyPhoneDetails() {
        if (surveyPhoneDetails == null) {
            surveyPhoneDetails = new ArrayList<SurveyPhoneDetail>();
        }
        return this.surveyPhoneDetails;
    }

    /**
     * Gets the value of the taskResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaskResult }
     *     
     */
    public TaskResult getTaskResult() {
        return taskResult;
    }

    /**
     * Sets the value of the taskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskResult }
     *     
     */
    public void setTaskResult(TaskResult value) {
        this.taskResult = value;
    }

}
