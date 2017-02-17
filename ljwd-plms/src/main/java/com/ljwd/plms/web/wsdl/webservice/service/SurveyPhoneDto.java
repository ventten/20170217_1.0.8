
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyPhoneDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyPhoneDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="surveyPhoneDtls" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyPhoneDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="checker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerPhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="officePhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contactorPhoneAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanPurposeRequirement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operationState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operatingIncome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receivablesState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="taskResult" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="superAging" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkTeam" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyPhoneDto", propOrder = {
    "surveyPhoneDtls"
})
public class SurveyPhoneDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<SurveyPhoneDetailDto> surveyPhoneDtls;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "checker")
    protected String checker;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "customerPhoneAbnormity")
    protected String customerPhoneAbnormity;
    @XmlAttribute(name = "officePhoneAbnormity")
    protected String officePhoneAbnormity;
    @XmlAttribute(name = "contactorPhoneAbnormity")
    protected String contactorPhoneAbnormity;
    @XmlAttribute(name = "loanPurposeRequirement")
    protected String loanPurposeRequirement;
    @XmlAttribute(name = "operationState")
    protected String operationState;
    @XmlAttribute(name = "operatingIncome")
    protected String operatingIncome;
    @XmlAttribute(name = "receivablesState")
    protected String receivablesState;
    @XmlAttribute(name = "checkTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;
    @XmlAttribute(name = "taskResult")
    protected TaskResult taskResult;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "superAging")
    protected String superAging;
    @XmlAttribute(name = "checkerName")
    protected String checkerName;
    @XmlAttribute(name = "checkTeam")
    protected String checkTeam;

    /**
     * Gets the value of the surveyPhoneDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyPhoneDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyPhoneDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyPhoneDetailDto }
     * 
     * 
     */
    public List<SurveyPhoneDetailDto> getSurveyPhoneDtls() {
        if (surveyPhoneDtls == null) {
            surveyPhoneDtls = new ArrayList<SurveyPhoneDetailDto>();
        }
        return this.surveyPhoneDtls;
    }

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
     * Gets the value of the checkerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckerName() {
        return checkerName;
    }

    /**
     * Sets the value of the checkerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckerName(String value) {
        this.checkerName = value;
    }

    /**
     * Gets the value of the checkTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckTeam() {
        return checkTeam;
    }

    /**
     * Sets the value of the checkTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckTeam(String value) {
        this.checkTeam = value;
    }

}
