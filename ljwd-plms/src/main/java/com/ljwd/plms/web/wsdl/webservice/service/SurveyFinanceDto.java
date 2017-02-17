
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyFinanceDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyFinanceDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="checkAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="checkInterestSettle" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="checkBal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="privateQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateLastQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateBal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publicQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publicLastQuarterInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publicBal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="privateCompetitorRepayment" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="privateRepayment" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="privatePaySalary" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="publicPaySs" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="publicPaySalary" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="publicCoOperation" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="publicOfficeRent" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="publicRepayment" type="{http://webservice.loan.mfbms.flinkmf.com/}turnoverState" />
 *       &lt;attribute name="checker" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="taskResult" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" />
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="privateTurnover" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publicTurnover" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "surveyFinanceDto")
public class SurveyFinanceDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "applicationInfoId")
    protected Long applicationInfoId;
    @XmlAttribute(name = "checkAccount")
    protected Boolean checkAccount;
    @XmlAttribute(name = "checkInterestSettle")
    protected Boolean checkInterestSettle;
    @XmlAttribute(name = "checkBal")
    protected Boolean checkBal;
    @XmlAttribute(name = "privateQuarterInterest")
    protected BigDecimal privateQuarterInterest;
    @XmlAttribute(name = "privateLastQuarterInterest")
    protected BigDecimal privateLastQuarterInterest;
    @XmlAttribute(name = "privateBal")
    protected BigDecimal privateBal;
    @XmlAttribute(name = "publicQuarterInterest")
    protected BigDecimal publicQuarterInterest;
    @XmlAttribute(name = "publicLastQuarterInterest")
    protected BigDecimal publicLastQuarterInterest;
    @XmlAttribute(name = "publicBal")
    protected BigDecimal publicBal;
    @XmlAttribute(name = "privateCompetitorRepayment")
    protected TurnoverState privateCompetitorRepayment;
    @XmlAttribute(name = "privateRepayment")
    protected TurnoverState privateRepayment;
    @XmlAttribute(name = "privatePaySalary")
    protected TurnoverState privatePaySalary;
    @XmlAttribute(name = "publicPaySs")
    protected TurnoverState publicPaySs;
    @XmlAttribute(name = "publicPaySalary")
    protected TurnoverState publicPaySalary;
    @XmlAttribute(name = "publicCoOperation")
    protected TurnoverState publicCoOperation;
    @XmlAttribute(name = "publicOfficeRent")
    protected TurnoverState publicOfficeRent;
    @XmlAttribute(name = "publicRepayment")
    protected TurnoverState publicRepayment;
    @XmlAttribute(name = "checker")
    protected String checker;
    @XmlAttribute(name = "checkTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;
    @XmlAttribute(name = "taskResult")
    protected TaskResult taskResult;
    @XmlAttribute(name = "reason")
    protected String reason;
    @XmlAttribute(name = "privateTurnover")
    protected String privateTurnover;
    @XmlAttribute(name = "publicTurnover")
    protected String publicTurnover;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "superAging")
    protected String superAging;
    @XmlAttribute(name = "checkerName")
    protected String checkerName;
    @XmlAttribute(name = "checkTeam")
    protected String checkTeam;

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
     * Gets the value of the checkAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckAccount() {
        return checkAccount;
    }

    /**
     * Sets the value of the checkAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckAccount(Boolean value) {
        this.checkAccount = value;
    }

    /**
     * Gets the value of the checkInterestSettle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckInterestSettle() {
        return checkInterestSettle;
    }

    /**
     * Sets the value of the checkInterestSettle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckInterestSettle(Boolean value) {
        this.checkInterestSettle = value;
    }

    /**
     * Gets the value of the checkBal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckBal() {
        return checkBal;
    }

    /**
     * Sets the value of the checkBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckBal(Boolean value) {
        this.checkBal = value;
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
     * Gets the value of the privateCompetitorRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPrivateCompetitorRepayment() {
        return privateCompetitorRepayment;
    }

    /**
     * Sets the value of the privateCompetitorRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPrivateCompetitorRepayment(TurnoverState value) {
        this.privateCompetitorRepayment = value;
    }

    /**
     * Gets the value of the privateRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPrivateRepayment() {
        return privateRepayment;
    }

    /**
     * Sets the value of the privateRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPrivateRepayment(TurnoverState value) {
        this.privateRepayment = value;
    }

    /**
     * Gets the value of the privatePaySalary property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPrivatePaySalary() {
        return privatePaySalary;
    }

    /**
     * Sets the value of the privatePaySalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPrivatePaySalary(TurnoverState value) {
        this.privatePaySalary = value;
    }

    /**
     * Gets the value of the publicPaySs property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPublicPaySs() {
        return publicPaySs;
    }

    /**
     * Sets the value of the publicPaySs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPublicPaySs(TurnoverState value) {
        this.publicPaySs = value;
    }

    /**
     * Gets the value of the publicPaySalary property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPublicPaySalary() {
        return publicPaySalary;
    }

    /**
     * Sets the value of the publicPaySalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPublicPaySalary(TurnoverState value) {
        this.publicPaySalary = value;
    }

    /**
     * Gets the value of the publicCoOperation property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPublicCoOperation() {
        return publicCoOperation;
    }

    /**
     * Sets the value of the publicCoOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPublicCoOperation(TurnoverState value) {
        this.publicCoOperation = value;
    }

    /**
     * Gets the value of the publicOfficeRent property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPublicOfficeRent() {
        return publicOfficeRent;
    }

    /**
     * Sets the value of the publicOfficeRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPublicOfficeRent(TurnoverState value) {
        this.publicOfficeRent = value;
    }

    /**
     * Gets the value of the publicRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link TurnoverState }
     *     
     */
    public TurnoverState getPublicRepayment() {
        return publicRepayment;
    }

    /**
     * Sets the value of the publicRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnoverState }
     *     
     */
    public void setPublicRepayment(TurnoverState value) {
        this.publicRepayment = value;
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
