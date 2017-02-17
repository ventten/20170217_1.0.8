
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchReceiveOverdueDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchReceiveOverdueDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanIdcarNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="overdueDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="overdueAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="remainderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="collector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collectorName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="periodNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="orgname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="businessCategory" type="{http://webservice.loan.mfbms.flinkmf.com/}businessCategory" />
 *       &lt;attribute name="assignOverdueDay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="productNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prdType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchReceiveOverdueDto")
public class SearchReceiveOverdueDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "loanName")
    protected String loanName;
    @XmlAttribute(name = "loanIdcarNo")
    protected String loanIdcarNo;
    @XmlAttribute(name = "loanAmount")
    protected BigDecimal loanAmount;
    @XmlAttribute(name = "overdueDay")
    protected Integer overdueDay;
    @XmlAttribute(name = "overdueAmount")
    protected BigDecimal overdueAmount;
    @XmlAttribute(name = "remainderAmount")
    protected BigDecimal remainderAmount;
    @XmlAttribute(name = "collector")
    protected String collector;
    @XmlAttribute(name = "collectorName")
    protected String collectorName;
    @XmlAttribute(name = "paymentId")
    protected Long paymentId;
    @XmlAttribute(name = "periodNum")
    protected Integer periodNum;
    @XmlAttribute(name = "orgname")
    protected String orgname;
    @XmlAttribute(name = "businessCategory")
    protected BusinessCategory businessCategory;
    @XmlAttribute(name = "assignOverdueDay")
    protected Integer assignOverdueDay;
    @XmlAttribute(name = "productNo")
    protected String productNo;
    @XmlAttribute(name = "productName")
    protected String productName;
    @XmlAttribute(name = "prdType")
    protected String prdType;

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
     * Gets the value of the loanIdcarNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanIdcarNo() {
        return loanIdcarNo;
    }

    /**
     * Sets the value of the loanIdcarNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanIdcarNo(String value) {
        this.loanIdcarNo = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLoanAmount(BigDecimal value) {
        this.loanAmount = value;
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
     * Gets the value of the overdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Sets the value of the overdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverdueAmount(BigDecimal value) {
        this.overdueAmount = value;
    }

    /**
     * Gets the value of the remainderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainderAmount() {
        return remainderAmount;
    }

    /**
     * Sets the value of the remainderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainderAmount(BigDecimal value) {
        this.remainderAmount = value;
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
     * Gets the value of the collectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorName() {
        return collectorName;
    }

    /**
     * Sets the value of the collectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorName(String value) {
        this.collectorName = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentId(Long value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the periodNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    /**
     * Sets the value of the periodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodNum(Integer value) {
        this.periodNum = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgname(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the businessCategory property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCategory }
     *     
     */
    public BusinessCategory getBusinessCategory() {
        return businessCategory;
    }

    /**
     * Sets the value of the businessCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCategory }
     *     
     */
    public void setBusinessCategory(BusinessCategory value) {
        this.businessCategory = value;
    }

    /**
     * Gets the value of the assignOverdueDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssignOverdueDay() {
        return assignOverdueDay;
    }

    /**
     * Sets the value of the assignOverdueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignOverdueDay(Integer value) {
        this.assignOverdueDay = value;
    }

    /**
     * Gets the value of the productNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * Sets the value of the productNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNo(String value) {
        this.productNo = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the prdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrdType() {
        return prdType;
    }

    /**
     * Sets the value of the prdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrdType(String value) {
        this.prdType = value;
    }

}
