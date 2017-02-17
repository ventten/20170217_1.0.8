
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditSurveyDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditSurveyDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sitename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appldate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apprtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appramt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="inputiedname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveynet" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveyphone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveycalc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="surveysum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approval" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signuser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditor1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditor2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditresult" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditsurveyid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="auditfinish" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="assigntime1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assigntime2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="iswrong" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditNote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditSurveyDto")
public class AuditSurveyDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "prdname")
    protected String prdname;
    @XmlAttribute(name = "sitename")
    protected String sitename;
    @XmlAttribute(name = "username")
    protected String username;
    @XmlAttribute(name = "appldate")
    protected String appldate;
    @XmlAttribute(name = "apprtime")
    protected String apprtime;
    @XmlAttribute(name = "appramt")
    protected String appramt;
    @XmlAttribute(name = "inputiedname")
    protected String inputiedname;
    @XmlAttribute(name = "surveynet")
    protected String surveynet;
    @XmlAttribute(name = "surveyphone")
    protected String surveyphone;
    @XmlAttribute(name = "surveycalc")
    protected String surveycalc;
    @XmlAttribute(name = "surveysum")
    protected String surveysum;
    @XmlAttribute(name = "approval")
    protected String approval;
    @XmlAttribute(name = "signuser")
    protected String signuser;
    @XmlAttribute(name = "auditor1")
    protected String auditor1;
    @XmlAttribute(name = "auditor2")
    protected String auditor2;
    @XmlAttribute(name = "endtime")
    protected String endtime;
    @XmlAttribute(name = "auditresult")
    protected String auditresult;
    @XmlAttribute(name = "auditsurveyid")
    protected Long auditsurveyid;
    @XmlAttribute(name = "auditfinish")
    protected String auditfinish;
    @XmlAttribute(name = "applid")
    protected String applid;
    @XmlAttribute(name = "auditid")
    protected Long auditid;
    @XmlAttribute(name = "assigntime1")
    protected String assigntime1;
    @XmlAttribute(name = "assigntime2")
    protected String assigntime2;
    @XmlAttribute(name = "iswrong")
    protected String iswrong;
    @XmlAttribute(name = "auditStatus")
    protected String auditStatus;
    @XmlAttribute(name = "auditNote")
    protected String auditNote;

    /**
     * Gets the value of the custname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * Sets the value of the custname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * Gets the value of the idcardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * Sets the value of the idcardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * Gets the value of the prdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdname() {
        return prdname;
    }

    /**
     * Sets the value of the prdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdname(String value) {
        this.prdname = value;
    }

    /**
     * Gets the value of the sitename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * Sets the value of the sitename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitename(String value) {
        this.sitename = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the appldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppldate() {
        return appldate;
    }

    /**
     * Sets the value of the appldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppldate(String value) {
        this.appldate = value;
    }

    /**
     * Gets the value of the apprtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprtime() {
        return apprtime;
    }

    /**
     * Sets the value of the apprtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprtime(String value) {
        this.apprtime = value;
    }

    /**
     * Gets the value of the appramt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppramt() {
        return appramt;
    }

    /**
     * Sets the value of the appramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppramt(String value) {
        this.appramt = value;
    }

    /**
     * Gets the value of the inputiedname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputiedname() {
        return inputiedname;
    }

    /**
     * Sets the value of the inputiedname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputiedname(String value) {
        this.inputiedname = value;
    }

    /**
     * Gets the value of the surveynet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveynet() {
        return surveynet;
    }

    /**
     * Sets the value of the surveynet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveynet(String value) {
        this.surveynet = value;
    }

    /**
     * Gets the value of the surveyphone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyphone() {
        return surveyphone;
    }

    /**
     * Sets the value of the surveyphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyphone(String value) {
        this.surveyphone = value;
    }

    /**
     * Gets the value of the surveycalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveycalc() {
        return surveycalc;
    }

    /**
     * Sets the value of the surveycalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveycalc(String value) {
        this.surveycalc = value;
    }

    /**
     * Gets the value of the surveysum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveysum() {
        return surveysum;
    }

    /**
     * Sets the value of the surveysum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveysum(String value) {
        this.surveysum = value;
    }

    /**
     * Gets the value of the approval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproval(String value) {
        this.approval = value;
    }

    /**
     * Gets the value of the signuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignuser() {
        return signuser;
    }

    /**
     * Sets the value of the signuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignuser(String value) {
        this.signuser = value;
    }

    /**
     * Gets the value of the auditor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditor1() {
        return auditor1;
    }

    /**
     * Sets the value of the auditor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditor1(String value) {
        this.auditor1 = value;
    }

    /**
     * Gets the value of the auditor2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditor2() {
        return auditor2;
    }

    /**
     * Sets the value of the auditor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditor2(String value) {
        this.auditor2 = value;
    }

    /**
     * Gets the value of the endtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * Sets the value of the endtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndtime(String value) {
        this.endtime = value;
    }

    /**
     * Gets the value of the auditresult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditresult() {
        return auditresult;
    }

    /**
     * Sets the value of the auditresult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditresult(String value) {
        this.auditresult = value;
    }

    /**
     * Gets the value of the auditsurveyid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuditsurveyid() {
        return auditsurveyid;
    }

    /**
     * Sets the value of the auditsurveyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuditsurveyid(Long value) {
        this.auditsurveyid = value;
    }

    /**
     * Gets the value of the auditfinish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditfinish() {
        return auditfinish;
    }

    /**
     * Sets the value of the auditfinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditfinish(String value) {
        this.auditfinish = value;
    }

    /**
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplid(String value) {
        this.applid = value;
    }

    /**
     * Gets the value of the auditid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuditid() {
        return auditid;
    }

    /**
     * Sets the value of the auditid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuditid(Long value) {
        this.auditid = value;
    }

    /**
     * Gets the value of the assigntime1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigntime1() {
        return assigntime1;
    }

    /**
     * Sets the value of the assigntime1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigntime1(String value) {
        this.assigntime1 = value;
    }

    /**
     * Gets the value of the assigntime2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigntime2() {
        return assigntime2;
    }

    /**
     * Sets the value of the assigntime2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigntime2(String value) {
        this.assigntime2 = value;
    }

    /**
     * Gets the value of the iswrong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIswrong() {
        return iswrong;
    }

    /**
     * Sets the value of the iswrong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIswrong(String value) {
        this.iswrong = value;
    }

    /**
     * Gets the value of the auditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * Sets the value of the auditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditStatus(String value) {
        this.auditStatus = value;
    }

    /**
     * Gets the value of the auditNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditNote() {
        return auditNote;
    }

    /**
     * Sets the value of the auditNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditNote(String value) {
        this.auditNote = value;
    }

}
