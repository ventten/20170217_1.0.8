
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for outVisitPlanDtlSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outVisitPlanDtlSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="planid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="signid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="infoid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="signstatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planstarttime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="plaendtime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addresstype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addressValidity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indebtValidity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ovtresultDetail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ptpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ptpamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="visitCancelResion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assistBy1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assistBy2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assistBy3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statusStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addressValidityStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indebtValidityStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="input" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cancel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="updateBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="upateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outVisitPlanDtlSearchDto")
public class OutVisitPlanDtlSearchDto {

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "planid")
    protected Long planid;
    @XmlAttribute(name = "signid")
    protected Long signid;
    @XmlAttribute(name = "infoid")
    protected Long infoid;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "signstatus")
    protected String signstatus;
    @XmlAttribute(name = "planstarttime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar planstarttime;
    @XmlAttribute(name = "plaendtime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plaendtime;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "addresstype")
    protected String addresstype;
    @XmlAttribute(name = "addressValidity")
    protected String addressValidity;
    @XmlAttribute(name = "indebtValidity")
    protected String indebtValidity;
    @XmlAttribute(name = "ovtresultDetail")
    protected String ovtresultDetail;
    @XmlAttribute(name = "ptpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ptpdate;
    @XmlAttribute(name = "ptpamt")
    protected BigDecimal ptpamt;
    @XmlAttribute(name = "visitCancelResion")
    protected String visitCancelResion;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;
    @XmlAttribute(name = "tel")
    protected String tel;
    @XmlAttribute(name = "assistBy1")
    protected String assistBy1;
    @XmlAttribute(name = "assistBy2")
    protected String assistBy2;
    @XmlAttribute(name = "assistBy3")
    protected String assistBy3;
    @XmlAttribute(name = "statusStr")
    protected String statusStr;
    @XmlAttribute(name = "addressValidityStr")
    protected String addressValidityStr;
    @XmlAttribute(name = "indebtValidityStr")
    protected String indebtValidityStr;
    @XmlAttribute(name = "custName")
    protected String custName;
    @XmlAttribute(name = "views")
    protected String views;
    @XmlAttribute(name = "input")
    protected String input;
    @XmlAttribute(name = "cancel")
    protected String cancel;
    @XmlAttribute(name = "applId")
    protected Long applId;
    @XmlAttribute(name = "updateBy")
    protected String updateBy;
    @XmlAttribute(name = "updateName")
    protected String updateName;
    @XmlAttribute(name = "upateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upateTime;

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
     * Gets the value of the planid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlanid() {
        return planid;
    }

    /**
     * Sets the value of the planid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlanid(Long value) {
        this.planid = value;
    }

    /**
     * Gets the value of the signid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSignid() {
        return signid;
    }

    /**
     * Sets the value of the signid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSignid(Long value) {
        this.signid = value;
    }

    /**
     * Gets the value of the infoid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInfoid() {
        return infoid;
    }

    /**
     * Sets the value of the infoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInfoid(Long value) {
        this.infoid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the signstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignstatus() {
        return signstatus;
    }

    /**
     * Sets the value of the signstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignstatus(String value) {
        this.signstatus = value;
    }

    /**
     * Gets the value of the planstarttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlanstarttime() {
        return planstarttime;
    }

    /**
     * Sets the value of the planstarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlanstarttime(XMLGregorianCalendar value) {
        this.planstarttime = value;
    }

    /**
     * Gets the value of the plaendtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlaendtime() {
        return plaendtime;
    }

    /**
     * Sets the value of the plaendtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlaendtime(XMLGregorianCalendar value) {
        this.plaendtime = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addresstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddresstype() {
        return addresstype;
    }

    /**
     * Sets the value of the addresstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddresstype(String value) {
        this.addresstype = value;
    }

    /**
     * Gets the value of the addressValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressValidity() {
        return addressValidity;
    }

    /**
     * Sets the value of the addressValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressValidity(String value) {
        this.addressValidity = value;
    }

    /**
     * Gets the value of the indebtValidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndebtValidity() {
        return indebtValidity;
    }

    /**
     * Sets the value of the indebtValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndebtValidity(String value) {
        this.indebtValidity = value;
    }

    /**
     * Gets the value of the ovtresultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvtresultDetail() {
        return ovtresultDetail;
    }

    /**
     * Sets the value of the ovtresultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvtresultDetail(String value) {
        this.ovtresultDetail = value;
    }

    /**
     * Gets the value of the ptpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPtpdate() {
        return ptpdate;
    }

    /**
     * Sets the value of the ptpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPtpdate(XMLGregorianCalendar value) {
        this.ptpdate = value;
    }

    /**
     * Gets the value of the ptpamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPtpamt() {
        return ptpamt;
    }

    /**
     * Sets the value of the ptpamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPtpamt(BigDecimal value) {
        this.ptpamt = value;
    }

    /**
     * Gets the value of the visitCancelResion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitCancelResion() {
        return visitCancelResion;
    }

    /**
     * Sets the value of the visitCancelResion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitCancelResion(String value) {
        this.visitCancelResion = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the assistBy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistBy1() {
        return assistBy1;
    }

    /**
     * Sets the value of the assistBy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistBy1(String value) {
        this.assistBy1 = value;
    }

    /**
     * Gets the value of the assistBy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistBy2() {
        return assistBy2;
    }

    /**
     * Sets the value of the assistBy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistBy2(String value) {
        this.assistBy2 = value;
    }

    /**
     * Gets the value of the assistBy3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistBy3() {
        return assistBy3;
    }

    /**
     * Sets the value of the assistBy3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistBy3(String value) {
        this.assistBy3 = value;
    }

    /**
     * Gets the value of the statusStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusStr() {
        return statusStr;
    }

    /**
     * Sets the value of the statusStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusStr(String value) {
        this.statusStr = value;
    }

    /**
     * Gets the value of the addressValidityStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressValidityStr() {
        return addressValidityStr;
    }

    /**
     * Sets the value of the addressValidityStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressValidityStr(String value) {
        this.addressValidityStr = value;
    }

    /**
     * Gets the value of the indebtValidityStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndebtValidityStr() {
        return indebtValidityStr;
    }

    /**
     * Sets the value of the indebtValidityStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndebtValidityStr(String value) {
        this.indebtValidityStr = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViews(String value) {
        this.views = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancel(String value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplId(Long value) {
        this.applId = value;
    }

    /**
     * Gets the value of the updateBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * Sets the value of the updateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateBy(String value) {
        this.updateBy = value;
    }

    /**
     * Gets the value of the updateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * Sets the value of the updateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateName(String value) {
        this.updateName = value;
    }

    /**
     * Gets the value of the upateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpateTime() {
        return upateTime;
    }

    /**
     * Sets the value of the upateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpateTime(XMLGregorianCalendar value) {
        this.upateTime = value;
    }

}
