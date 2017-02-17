
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for documentGenLogDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentGenLogDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="documentCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="documentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="genBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cutoffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="principal" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="interest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="brokerFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="failCollectFee" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="collectCost" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="parameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="genByName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectorId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentGenLogDto")
public class DocumentGenLogDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "documentCode")
    protected String documentCode;
    @XmlAttribute(name = "documentName")
    protected String documentName;
    @XmlAttribute(name = "genTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar genTime;
    @XmlAttribute(name = "genBy")
    protected String genBy;
    @XmlAttribute(name = "contractId")
    protected Long contractId;
    @XmlAttribute(name = "cutoffDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cutoffDate;
    @XmlAttribute(name = "principal")
    protected BigDecimal principal;
    @XmlAttribute(name = "interest")
    protected BigDecimal interest;
    @XmlAttribute(name = "brokerFee")
    protected BigDecimal brokerFee;
    @XmlAttribute(name = "overdueInterest")
    protected BigDecimal overdueInterest;
    @XmlAttribute(name = "failCollectFee")
    protected BigDecimal failCollectFee;
    @XmlAttribute(name = "collectCost")
    protected BigDecimal collectCost;
    @XmlAttribute(name = "totalAmount")
    protected BigDecimal totalAmount;
    @XmlAttribute(name = "overdueDay")
    protected Integer overdueDay;
    @XmlAttribute(name = "parameter")
    protected String parameter;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "genByName")
    protected String genByName;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "clientName")
    protected String clientName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "collectorId")
    protected String collectorId;
    @XmlAttribute(name = "collectPhone")
    protected String collectPhone;
    @XmlAttribute(name = "gender")
    protected String gender;

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
     * Gets the value of the documentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /**
     * Sets the value of the documentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentCode(String value) {
        this.documentCode = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the genTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenTime() {
        return genTime;
    }

    /**
     * Sets the value of the genTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenTime(XMLGregorianCalendar value) {
        this.genTime = value;
    }

    /**
     * Gets the value of the genBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenBy() {
        return genBy;
    }

    /**
     * Sets the value of the genBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenBy(String value) {
        this.genBy = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractId(Long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the cutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutoffDate() {
        return cutoffDate;
    }

    /**
     * Sets the value of the cutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutoffDate(XMLGregorianCalendar value) {
        this.cutoffDate = value;
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
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterest(BigDecimal value) {
        this.interest = value;
    }

    /**
     * Gets the value of the brokerFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBrokerFee() {
        return brokerFee;
    }

    /**
     * Sets the value of the brokerFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBrokerFee(BigDecimal value) {
        this.brokerFee = value;
    }

    /**
     * Gets the value of the overdueInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueInterest() {
        return overdueInterest;
    }

    /**
     * Sets the value of the overdueInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueInterest(BigDecimal value) {
        this.overdueInterest = value;
    }

    /**
     * Gets the value of the failCollectFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFailCollectFee() {
        return failCollectFee;
    }

    /**
     * Sets the value of the failCollectFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFailCollectFee(BigDecimal value) {
        this.failCollectFee = value;
    }

    /**
     * Gets the value of the collectCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectCost() {
        return collectCost;
    }

    /**
     * Sets the value of the collectCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectCost(BigDecimal value) {
        this.collectCost = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the overdueDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDay() {
        return overdueDay;
    }

    /**
     * Sets the value of the overdueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDay(Integer value) {
        this.overdueDay = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
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
     * Gets the value of the genByName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenByName() {
        return genByName;
    }

    /**
     * Sets the value of the genByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenByName(String value) {
        this.genByName = value;
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
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
    }

    /**
     * Gets the value of the idCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardNo() {
        return idCardNo;
    }

    /**
     * Sets the value of the idCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardNo(String value) {
        this.idCardNo = value;
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
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollector(String value) {
        this.collector = value;
    }

    /**
     * Gets the value of the collectorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorId() {
        return collectorId;
    }

    /**
     * Sets the value of the collectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorId(String value) {
        this.collectorId = value;
    }

    /**
     * Gets the value of the collectPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectPhone() {
        return collectPhone;
    }

    /**
     * Sets the value of the collectPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectPhone(String value) {
        this.collectPhone = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
