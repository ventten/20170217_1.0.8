
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for searchOutVisitRecordListDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchOutVisitRecordListDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="outvisitid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="applid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="assigndate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cntrctno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanamt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="principal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueday" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="overduedays" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="submitby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visitby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visituserid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="plannum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="overnum" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="casetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="redeem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="expectCloseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="expectCloseTimeStr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="custAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="houseAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="professionAddr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchOutVisitRecordListDto")
public class SearchOutVisitRecordListDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "outvisitid")
    protected Long outvisitid;
    @XmlAttribute(name = "applid")
    protected Long applid;
    @XmlAttribute(name = "assigndate")
    protected String assigndate;
    @XmlAttribute(name = "cntrctno")
    protected String cntrctno;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "custtype")
    protected String custtype;
    @XmlAttribute(name = "idcardno")
    protected String idcardno;
    @XmlAttribute(name = "loanamt")
    protected BigDecimal loanamt;
    @XmlAttribute(name = "principal")
    protected BigDecimal principal;
    @XmlAttribute(name = "overdueday")
    protected Long overdueday;
    @XmlAttribute(name = "overduedays")
    protected Long overduedays;
    @XmlAttribute(name = "submitby")
    protected String submitby;
    @XmlAttribute(name = "visitby")
    protected String visitby;
    @XmlAttribute(name = "visituserid")
    protected String visituserid;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "plannum")
    protected Long plannum;
    @XmlAttribute(name = "overnum")
    protected Long overnum;
    @XmlAttribute(name = "casetype")
    protected String casetype;
    @XmlAttribute(name = "applcode")
    protected String applcode;
    @XmlAttribute(name = "redeem")
    protected String redeem;
    @XmlAttribute(name = "paymentname")
    protected String paymentname;
    @XmlAttribute(name = "paymentid")
    protected Long paymentid;
    @XmlAttribute(name = "expectCloseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectCloseTime;
    @XmlAttribute(name = "expectCloseTimeStr")
    protected String expectCloseTimeStr;
    @XmlAttribute(name = "custAddr")
    protected String custAddr;
    @XmlAttribute(name = "houseAddr")
    protected String houseAddr;
    @XmlAttribute(name = "professionAddr")
    protected String professionAddr;

    /**
     * Gets the value of the outvisitid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutvisitid() {
        return outvisitid;
    }

    /**
     * Sets the value of the outvisitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutvisitid(Long value) {
        this.outvisitid = value;
    }

    /**
     * Gets the value of the applid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplid() {
        return applid;
    }

    /**
     * Sets the value of the applid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplid(Long value) {
        this.applid = value;
    }

    /**
     * Gets the value of the assigndate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigndate() {
        return assigndate;
    }

    /**
     * Sets the value of the assigndate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigndate(String value) {
        this.assigndate = value;
    }

    /**
     * Gets the value of the cntrctno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctno() {
        return cntrctno;
    }

    /**
     * Sets the value of the cntrctno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctno(String value) {
        this.cntrctno = value;
    }

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
     * Gets the value of the custtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusttype() {
        return custtype;
    }

    /**
     * Sets the value of the custtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusttype(String value) {
        this.custtype = value;
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
     * Gets the value of the loanamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanamt() {
        return loanamt;
    }

    /**
     * Sets the value of the loanamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanamt(BigDecimal value) {
        this.loanamt = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrincipal(BigDecimal value) {
        this.principal = value;
    }

    /**
     * Gets the value of the overdueday property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverdueday() {
        return overdueday;
    }

    /**
     * Sets the value of the overdueday property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverdueday(Long value) {
        this.overdueday = value;
    }

    /**
     * Gets the value of the overduedays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverduedays() {
        return overduedays;
    }

    /**
     * Sets the value of the overduedays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverduedays(Long value) {
        this.overduedays = value;
    }

    /**
     * Gets the value of the submitby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitby() {
        return submitby;
    }

    /**
     * Sets the value of the submitby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitby(String value) {
        this.submitby = value;
    }

    /**
     * Gets the value of the visitby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitby() {
        return visitby;
    }

    /**
     * Sets the value of the visitby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitby(String value) {
        this.visitby = value;
    }

    /**
     * Gets the value of the visituserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisituserid() {
        return visituserid;
    }

    /**
     * Sets the value of the visituserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisituserid(String value) {
        this.visituserid = value;
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
     * Gets the value of the plannum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlannum() {
        return plannum;
    }

    /**
     * Sets the value of the plannum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlannum(Long value) {
        this.plannum = value;
    }

    /**
     * Gets the value of the overnum property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOvernum() {
        return overnum;
    }

    /**
     * Sets the value of the overnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOvernum(Long value) {
        this.overnum = value;
    }

    /**
     * Gets the value of the casetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasetype() {
        return casetype;
    }

    /**
     * Sets the value of the casetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasetype(String value) {
        this.casetype = value;
    }

    /**
     * Gets the value of the applcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcode() {
        return applcode;
    }

    /**
     * Sets the value of the applcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcode(String value) {
        this.applcode = value;
    }

    /**
     * Gets the value of the redeem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedeem() {
        return redeem;
    }

    /**
     * Sets the value of the redeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedeem(String value) {
        this.redeem = value;
    }

    /**
     * Gets the value of the paymentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentname() {
        return paymentname;
    }

    /**
     * Sets the value of the paymentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentname(String value) {
        this.paymentname = value;
    }

    /**
     * Gets the value of the paymentid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentid() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentid(Long value) {
        this.paymentid = value;
    }

    /**
     * Gets the value of the expectCloseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectCloseTime() {
        return expectCloseTime;
    }

    /**
     * Sets the value of the expectCloseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectCloseTime(XMLGregorianCalendar value) {
        this.expectCloseTime = value;
    }

    /**
     * Gets the value of the expectCloseTimeStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectCloseTimeStr() {
        return expectCloseTimeStr;
    }

    /**
     * Sets the value of the expectCloseTimeStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectCloseTimeStr(String value) {
        this.expectCloseTimeStr = value;
    }

    /**
     * Gets the value of the custAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAddr() {
        return custAddr;
    }

    /**
     * Sets the value of the custAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAddr(String value) {
        this.custAddr = value;
    }

    /**
     * Gets the value of the houseAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddr() {
        return houseAddr;
    }

    /**
     * Sets the value of the houseAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseAddr(String value) {
        this.houseAddr = value;
    }

    /**
     * Gets the value of the professionAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionAddr() {
        return professionAddr;
    }

    /**
     * Sets the value of the professionAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionAddr(String value) {
        this.professionAddr = value;
    }

}
