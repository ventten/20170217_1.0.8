
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditInvestigateAssignDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditInvestigateAssignDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sitename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salesuser" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appldate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="apprtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="appramt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applamt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="periodnum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remainderamount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="overdueday" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="auditor1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applinfoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applidincount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="auditsurveyid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="signnote" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signtime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signpaid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditInvestigateAssignDto")
public class AuditInvestigateAssignDto {

    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "prdname")
    protected String prdname;
    @XmlAttribute(name = "sitename")
    protected String sitename;
    @XmlAttribute(name = "salesuser")
    protected String salesuser;
    @XmlAttribute(name = "appldate")
    protected String appldate;
    @XmlAttribute(name = "apprtime")
    protected String apprtime;
    @XmlAttribute(name = "appramt")
    protected String appramt;
    @XmlAttribute(name = "applamt")
    protected String applamt;
    @XmlAttribute(name = "periodnum")
    protected String periodnum;
    @XmlAttribute(name = "remainderamount")
    protected String remainderamount;
    @XmlAttribute(name = "overdueday")
    protected String overdueday;
    @XmlAttribute(name = "auditor1")
    protected String auditor1;
    @XmlAttribute(name = "applinfoid")
    protected Long applinfoid;
    @XmlAttribute(name = "applidincount")
    protected Long applidincount;
    @XmlAttribute(name = "auditsurveyid")
    protected Long auditsurveyid;
    @XmlAttribute(name = "signnote")
    protected String signnote;
    @XmlAttribute(name = "signtime")
    protected String signtime;
    @XmlAttribute(name = "signcode")
    protected String signcode;
    @XmlAttribute(name = "signpaid")
    protected String signpaid;

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
     * Gets the value of the salesuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesuser() {
        return salesuser;
    }

    /**
     * Sets the value of the salesuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesuser(String value) {
        this.salesuser = value;
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
     * Gets the value of the applamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplamt() {
        return applamt;
    }

    /**
     * Sets the value of the applamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplamt(String value) {
        this.applamt = value;
    }

    /**
     * Gets the value of the periodnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodnum() {
        return periodnum;
    }

    /**
     * Sets the value of the periodnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodnum(String value) {
        this.periodnum = value;
    }

    /**
     * Gets the value of the remainderamount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainderamount() {
        return remainderamount;
    }

    /**
     * Sets the value of the remainderamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainderamount(String value) {
        this.remainderamount = value;
    }

    /**
     * Gets the value of the overdueday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueday() {
        return overdueday;
    }

    /**
     * Sets the value of the overdueday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueday(String value) {
        this.overdueday = value;
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
     * Gets the value of the applinfoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplinfoid() {
        return applinfoid;
    }

    /**
     * Sets the value of the applinfoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplinfoid(Long value) {
        this.applinfoid = value;
    }

    /**
     * Gets the value of the applidincount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplidincount() {
        return applidincount;
    }

    /**
     * Sets the value of the applidincount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplidincount(Long value) {
        this.applidincount = value;
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
     * Gets the value of the signnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignnote() {
        return signnote;
    }

    /**
     * Sets the value of the signnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignnote(String value) {
        this.signnote = value;
    }

    /**
     * Gets the value of the signtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigntime() {
        return signtime;
    }

    /**
     * Sets the value of the signtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigntime(String value) {
        this.signtime = value;
    }

    /**
     * Gets the value of the signcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigncode() {
        return signcode;
    }

    /**
     * Sets the value of the signcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigncode(String value) {
        this.signcode = value;
    }

    /**
     * Gets the value of the signpaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignpaid() {
        return signpaid;
    }

    /**
     * Sets the value of the signpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignpaid(String value) {
        this.signpaid = value;
    }

}
