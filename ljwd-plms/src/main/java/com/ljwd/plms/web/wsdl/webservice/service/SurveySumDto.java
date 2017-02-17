
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
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
 * <p>Java class for surveySumDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveySumDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="surveyExempts" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyExemptDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="infoValidity" type="{http://webservice.loan.mfbms.flinkmf.com/}infoValidityType" />
 *       &lt;attribute name="commentRemark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signingNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suggestedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="approvalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="checker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="taskResult" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="superAging" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkTeam" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveySumDto", propOrder = {
    "surveyExempts"
})
public class SurveySumDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlElement(nillable = true)
    protected List<SurveyExemptDto> surveyExempts;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "infoValidity")
    protected InfoValidityType infoValidity;
    @XmlAttribute(name = "commentRemark")
    protected String commentRemark;
    @XmlAttribute(name = "signingNote")
    protected String signingNote;
    @XmlAttribute(name = "suggestedAmount")
    protected BigDecimal suggestedAmount;
    @XmlAttribute(name = "approvalAmount")
    protected BigDecimal approvalAmount;
    @XmlAttribute(name = "approvalPeriod")
    protected Integer approvalPeriod;
    @XmlAttribute(name = "checker")
    protected String checker;
    @XmlAttribute(name = "checkerName")
    protected String checkerName;
    @XmlAttribute(name = "checkTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;
    @XmlAttribute(name = "taskResult")
    protected TaskResult taskResult;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "superAging")
    protected String superAging;
    @XmlAttribute(name = "checkTeam")
    protected String checkTeam;

    /**
     * Gets the value of the surveyExempts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyExempts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyExempts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyExemptDto }
     * 
     * 
     */
    public List<SurveyExemptDto> getSurveyExempts() {
        if (surveyExempts == null) {
            surveyExempts = new ArrayList<SurveyExemptDto>();
        }
        return this.surveyExempts;
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
     * Gets the value of the infoValidity property.
     * 
     * @return
     *     possible object is
     *     {@link InfoValidityType }
     *     
     */
    public InfoValidityType getInfoValidity() {
        return infoValidity;
    }

    /**
     * Sets the value of the infoValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoValidityType }
     *     
     */
    public void setInfoValidity(InfoValidityType value) {
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
     * Gets the value of the signingNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningNote() {
        return signingNote;
    }

    /**
     * Sets the value of the signingNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningNote(String value) {
        this.signingNote = value;
    }

    /**
     * Gets the value of the suggestedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestedAmount() {
        return suggestedAmount;
    }

    /**
     * Sets the value of the suggestedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestedAmount(BigDecimal value) {
        this.suggestedAmount = value;
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
