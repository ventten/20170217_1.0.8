
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditReportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditReportDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditReportType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="financeOrganization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="leftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="monthlyRepayment" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="leftPeriod" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pengyuanScore" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditReportDto")
public class CreditReportDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "creditReportType")
    protected String creditReportType;
    @XmlAttribute(name = "financeOrganization")
    protected String financeOrganization;
    @XmlAttribute(name = "creditLimit")
    protected BigDecimal creditLimit;
    @XmlAttribute(name = "leftLimit")
    protected BigDecimal leftLimit;
    @XmlAttribute(name = "monthlyRepayment")
    protected BigDecimal monthlyRepayment;
    @XmlAttribute(name = "leftPeriod")
    protected Integer leftPeriod;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "pengyuanScore")
    protected Integer pengyuanScore;
    @XmlAttribute(name = "applicationId")
    protected Long applicationId;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
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
     * Gets the value of the creditReportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReportType() {
        return creditReportType;
    }

    /**
     * Sets the value of the creditReportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReportType(String value) {
        this.creditReportType = value;
    }

    /**
     * Gets the value of the financeOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanceOrganization() {
        return financeOrganization;
    }

    /**
     * Sets the value of the financeOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanceOrganization(String value) {
        this.financeOrganization = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the leftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeftLimit() {
        return leftLimit;
    }

    /**
     * Sets the value of the leftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeftLimit(BigDecimal value) {
        this.leftLimit = value;
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
     * Gets the value of the leftPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeftPeriod() {
        return leftPeriod;
    }

    /**
     * Sets the value of the leftPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeftPeriod(Integer value) {
        this.leftPeriod = value;
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
     * Gets the value of the pengyuanScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPengyuanScore() {
        return pengyuanScore;
    }

    /**
     * Sets the value of the pengyuanScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPengyuanScore(Integer value) {
        this.pengyuanScore = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

}
