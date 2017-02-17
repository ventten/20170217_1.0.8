
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyCallDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyCallDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callStart" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="callLong" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="phone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="relation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callLog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uniqueId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callFrom" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creatUserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cloudcallStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cloudCallUniquedId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyCallDto")
public class SurveyCallDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "idCard")
    protected String idCard;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "callType")
    protected String callType;
    @XmlAttribute(name = "callStart")
    protected String callStart;
    @XmlAttribute(name = "callDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDate;
    @XmlAttribute(name = "callLong")
    protected String callLong;
    @XmlAttribute(name = "phone")
    protected String phone;
    @XmlAttribute(name = "relation")
    protected String relation;
    @XmlAttribute(name = "callBy")
    protected String callBy;
    @XmlAttribute(name = "callLog")
    protected String callLog;
    @XmlAttribute(name = "uniqueId")
    protected String uniqueId;
    @XmlAttribute(name = "callFrom")
    protected String callFrom;
    @XmlAttribute(name = "creatUserName")
    protected String creatUserName;
    @XmlAttribute(name = "depType")
    protected String depType;
    @XmlAttribute(name = "cloudcallStatus")
    protected String cloudcallStatus;
    @XmlAttribute(name = "cloudCallUniquedId")
    protected String cloudCallUniquedId;

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
     * Gets the value of the loanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanName() {
        return loanName;
    }

    /**
     * Sets the value of the loanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanName(String value) {
        this.loanName = value;
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
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

    /**
     * Gets the value of the callType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallType() {
        return callType;
    }

    /**
     * Sets the value of the callType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallType(String value) {
        this.callType = value;
    }

    /**
     * Gets the value of the callStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallStart() {
        return callStart;
    }

    /**
     * Sets the value of the callStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallStart(String value) {
        this.callStart = value;
    }

    /**
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDate(XMLGregorianCalendar value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the callLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLong() {
        return callLong;
    }

    /**
     * Sets the value of the callLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLong(String value) {
        this.callLong = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the callBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallBy() {
        return callBy;
    }

    /**
     * Sets the value of the callBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallBy(String value) {
        this.callBy = value;
    }

    /**
     * Gets the value of the callLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLog() {
        return callLog;
    }

    /**
     * Sets the value of the callLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLog(String value) {
        this.callLog = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the callFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFrom() {
        return callFrom;
    }

    /**
     * Sets the value of the callFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallFrom(String value) {
        this.callFrom = value;
    }

    /**
     * Gets the value of the creatUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatUserName() {
        return creatUserName;
    }

    /**
     * Sets the value of the creatUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatUserName(String value) {
        this.creatUserName = value;
    }

    /**
     * Gets the value of the depType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepType() {
        return depType;
    }

    /**
     * Sets the value of the depType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepType(String value) {
        this.depType = value;
    }

    /**
     * Gets the value of the cloudcallStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudcallStatus() {
        return cloudcallStatus;
    }

    /**
     * Sets the value of the cloudcallStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudcallStatus(String value) {
        this.cloudcallStatus = value;
    }

    /**
     * Gets the value of the cloudCallUniquedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudCallUniquedId() {
        return cloudCallUniquedId;
    }

    /**
     * Sets the value of the cloudCallUniquedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudCallUniquedId(String value) {
        this.cloudCallUniquedId = value;
    }

}
