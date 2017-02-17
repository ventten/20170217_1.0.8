
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyNet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyNet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfo" minOccurs="0"/>
 *         &lt;element name="applicationInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="badRecordCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditFacility" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditQuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="creditWebsite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endowmentBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="entNetAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estateLoanBal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="estateNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estatePledgeState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estateValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hasSs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isMortgage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="matchAbnormity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchCase" type="{http://webservice.loan.mfbms.flinkmf.com/}matchResult" minOccurs="0"/>
 *         &lt;element name="matchNetInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}matchResult" minOccurs="0"/>
 *         &lt;element name="matchPyPboc" type="{http://webservice.loan.mfbms.flinkmf.com/}matchResult" minOccurs="0"/>
 *         &lt;element name="matchSysInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}matchResult" minOccurs="0"/>
 *         &lt;element name="monthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="operationChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="otherChangeInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proprietaryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shareHoldInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shareholdingPledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ssBaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ssPaidMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stockholdingChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="superAging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surveyRepayments" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyRepayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taskResult" type="{http://webservice.loan.mfbms.flinkmf.com/}taskResult" minOccurs="0"/>
 *         &lt;element name="unitSsPeopleNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unitSsState" type="{http://webservice.loan.mfbms.flinkmf.com/}socialSecurityState" minOccurs="0"/>
 *         &lt;element name="unitSsYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyNet", propOrder = {
    "applicationInfo",
    "applicationInfoId",
    "badRecordCode",
    "billInfo",
    "checkTime",
    "checker",
    "creditFacility",
    "creditQuota",
    "creditWebsite",
    "endowmentBal",
    "entNetAbnormity",
    "estateLoanBal",
    "estateNumber",
    "estatePledgeState",
    "estateValue",
    "hasSs",
    "isMortgage",
    "matchAbnormity",
    "matchCase",
    "matchNetInfo",
    "matchPyPboc",
    "matchSysInfo",
    "monthlyRepayment",
    "operationChanged",
    "otherChangeInfo",
    "proprietaryType",
    "reason",
    "shareHoldInfo",
    "shareholdingPledged",
    "ssBaseAmount",
    "ssPaidMonth",
    "stockholdingChanged",
    "superAging",
    "surveyRepayments",
    "taskResult",
    "unitSsPeopleNumber",
    "unitSsState",
    "unitSsYear"
})
public class SurveyNet
    extends BaseVersionableCreatorAwareEntity
{

    protected ApplicationInfo applicationInfo;
    protected Long applicationInfoId;
    protected String badRecordCode;
    protected String billInfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkTime;
    protected String checker;
    protected BigDecimal creditFacility;
    protected BigDecimal creditQuota;
    protected String creditWebsite;
    protected BigDecimal endowmentBal;
    protected String entNetAbnormity;
    protected BigDecimal estateLoanBal;
    protected Integer estateNumber;
    protected String estatePledgeState;
    protected BigDecimal estateValue;
    protected Boolean hasSs;
    protected Boolean isMortgage;
    protected String matchAbnormity;
    protected MatchResult matchCase;
    protected MatchResult matchNetInfo;
    protected MatchResult matchPyPboc;
    protected MatchResult matchSysInfo;
    protected BigDecimal monthlyRepayment;
    protected Boolean operationChanged;
    protected String otherChangeInfo;
    protected String proprietaryType;
    protected String reason;
    protected String shareHoldInfo;
    protected Boolean shareholdingPledged;
    protected BigDecimal ssBaseAmount;
    protected BigDecimal ssPaidMonth;
    protected Boolean stockholdingChanged;
    protected String superAging;
    @XmlElement(nillable = true)
    protected List<SurveyRepayment> surveyRepayments;
    protected TaskResult taskResult;
    protected Integer unitSsPeopleNumber;
    protected SocialSecurityState unitSsState;
    protected String unitSsYear;

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
     * Gets the value of the billInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillInfo() {
        return billInfo;
    }

    /**
     * Sets the value of the billInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillInfo(String value) {
        this.billInfo = value;
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
     * Gets the value of the creditFacility property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditFacility() {
        return creditFacility;
    }

    /**
     * Sets the value of the creditFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditFacility(BigDecimal value) {
        this.creditFacility = value;
    }

    /**
     * Gets the value of the creditQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditQuota() {
        return creditQuota;
    }

    /**
     * Sets the value of the creditQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditQuota(BigDecimal value) {
        this.creditQuota = value;
    }

    /**
     * Gets the value of the creditWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditWebsite() {
        return creditWebsite;
    }

    /**
     * Sets the value of the creditWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditWebsite(String value) {
        this.creditWebsite = value;
    }

    /**
     * Gets the value of the endowmentBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndowmentBal() {
        return endowmentBal;
    }

    /**
     * Sets the value of the endowmentBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndowmentBal(BigDecimal value) {
        this.endowmentBal = value;
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
     * Gets the value of the estateLoanBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstateLoanBal() {
        return estateLoanBal;
    }

    /**
     * Sets the value of the estateLoanBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstateLoanBal(BigDecimal value) {
        this.estateLoanBal = value;
    }

    /**
     * Gets the value of the estateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstateNumber() {
        return estateNumber;
    }

    /**
     * Sets the value of the estateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstateNumber(Integer value) {
        this.estateNumber = value;
    }

    /**
     * Gets the value of the estatePledgeState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatePledgeState() {
        return estatePledgeState;
    }

    /**
     * Sets the value of the estatePledgeState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatePledgeState(String value) {
        this.estatePledgeState = value;
    }

    /**
     * Gets the value of the estateValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstateValue() {
        return estateValue;
    }

    /**
     * Sets the value of the estateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstateValue(BigDecimal value) {
        this.estateValue = value;
    }

    /**
     * Gets the value of the hasSs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSs() {
        return hasSs;
    }

    /**
     * Sets the value of the hasSs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSs(Boolean value) {
        this.hasSs = value;
    }

    /**
     * Gets the value of the isMortgage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMortgage() {
        return isMortgage;
    }

    /**
     * Sets the value of the isMortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMortgage(Boolean value) {
        this.isMortgage = value;
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
     * Gets the value of the matchCase property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResult }
     *     
     */
    public MatchResult getMatchCase() {
        return matchCase;
    }

    /**
     * Sets the value of the matchCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResult }
     *     
     */
    public void setMatchCase(MatchResult value) {
        this.matchCase = value;
    }

    /**
     * Gets the value of the matchNetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResult }
     *     
     */
    public MatchResult getMatchNetInfo() {
        return matchNetInfo;
    }

    /**
     * Sets the value of the matchNetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResult }
     *     
     */
    public void setMatchNetInfo(MatchResult value) {
        this.matchNetInfo = value;
    }

    /**
     * Gets the value of the matchPyPboc property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResult }
     *     
     */
    public MatchResult getMatchPyPboc() {
        return matchPyPboc;
    }

    /**
     * Sets the value of the matchPyPboc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResult }
     *     
     */
    public void setMatchPyPboc(MatchResult value) {
        this.matchPyPboc = value;
    }

    /**
     * Gets the value of the matchSysInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResult }
     *     
     */
    public MatchResult getMatchSysInfo() {
        return matchSysInfo;
    }

    /**
     * Sets the value of the matchSysInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResult }
     *     
     */
    public void setMatchSysInfo(MatchResult value) {
        this.matchSysInfo = value;
    }

    /**
     * Gets the value of the monthlyRepayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlyRepayment() {
        return monthlyRepayment;
    }

    /**
     * Sets the value of the monthlyRepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlyRepayment(BigDecimal value) {
        this.monthlyRepayment = value;
    }

    /**
     * Gets the value of the operationChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationChanged() {
        return operationChanged;
    }

    /**
     * Sets the value of the operationChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperationChanged(Boolean value) {
        this.operationChanged = value;
    }

    /**
     * Gets the value of the otherChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherChangeInfo() {
        return otherChangeInfo;
    }

    /**
     * Sets the value of the otherChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherChangeInfo(String value) {
        this.otherChangeInfo = value;
    }

    /**
     * Gets the value of the proprietaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryType() {
        return proprietaryType;
    }

    /**
     * Sets the value of the proprietaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryType(String value) {
        this.proprietaryType = value;
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
     * Gets the value of the shareHoldInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareHoldInfo() {
        return shareHoldInfo;
    }

    /**
     * Sets the value of the shareHoldInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareHoldInfo(String value) {
        this.shareHoldInfo = value;
    }

    /**
     * Gets the value of the shareholdingPledged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareholdingPledged() {
        return shareholdingPledged;
    }

    /**
     * Sets the value of the shareholdingPledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareholdingPledged(Boolean value) {
        this.shareholdingPledged = value;
    }

    /**
     * Gets the value of the ssBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSsBaseAmount() {
        return ssBaseAmount;
    }

    /**
     * Sets the value of the ssBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSsBaseAmount(BigDecimal value) {
        this.ssBaseAmount = value;
    }

    /**
     * Gets the value of the ssPaidMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSsPaidMonth() {
        return ssPaidMonth;
    }

    /**
     * Sets the value of the ssPaidMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSsPaidMonth(BigDecimal value) {
        this.ssPaidMonth = value;
    }

    /**
     * Gets the value of the stockholdingChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStockholdingChanged() {
        return stockholdingChanged;
    }

    /**
     * Sets the value of the stockholdingChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStockholdingChanged(Boolean value) {
        this.stockholdingChanged = value;
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
     * Gets the value of the surveyRepayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveyRepayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveyRepayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveyRepayment }
     * 
     * 
     */
    public List<SurveyRepayment> getSurveyRepayments() {
        if (surveyRepayments == null) {
            surveyRepayments = new ArrayList<SurveyRepayment>();
        }
        return this.surveyRepayments;
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
     * Gets the value of the unitSsPeopleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitSsPeopleNumber() {
        return unitSsPeopleNumber;
    }

    /**
     * Sets the value of the unitSsPeopleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitSsPeopleNumber(Integer value) {
        this.unitSsPeopleNumber = value;
    }

    /**
     * Gets the value of the unitSsState property.
     * 
     * @return
     *     possible object is
     *     {@link SocialSecurityState }
     *     
     */
    public SocialSecurityState getUnitSsState() {
        return unitSsState;
    }

    /**
     * Sets the value of the unitSsState property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialSecurityState }
     *     
     */
    public void setUnitSsState(SocialSecurityState value) {
        this.unitSsState = value;
    }

    /**
     * Gets the value of the unitSsYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSsYear() {
        return unitSsYear;
    }

    /**
     * Sets the value of the unitSsYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSsYear(String value) {
        this.unitSsYear = value;
    }

}
