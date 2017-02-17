
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for surveyRepayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="surveyRepayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="competitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="loanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="repaidPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="repaymentState" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentState" minOccurs="0"/>
 *         &lt;element name="surveyNet" type="{http://webservice.loan.mfbms.flinkmf.com/}surveyNet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surveyRepayment", propOrder = {
    "competitor",
    "loanAmount",
    "loanDate",
    "repaidPeriods",
    "repaymentState",
    "surveyNet"
})
public class SurveyRepayment
    extends BaseVersionableCreatorAwareEntity
{

    protected String competitor;
    protected BigDecimal loanAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loanDate;
    protected Integer repaidPeriods;
    protected RepaymentState repaymentState;
    protected SurveyNet surveyNet;

    /**
     * Gets the value of the competitor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitor() {
        return competitor;
    }

    /**
     * Sets the value of the competitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitor(String value) {
        this.competitor = value;
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
     * Gets the value of the loanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoanDate() {
        return loanDate;
    }

    /**
     * Sets the value of the loanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoanDate(XMLGregorianCalendar value) {
        this.loanDate = value;
    }

    /**
     * Gets the value of the repaidPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepaidPeriods() {
        return repaidPeriods;
    }

    /**
     * Sets the value of the repaidPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepaidPeriods(Integer value) {
        this.repaidPeriods = value;
    }

    /**
     * Gets the value of the repaymentState property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentState }
     *     
     */
    public RepaymentState getRepaymentState() {
        return repaymentState;
    }

    /**
     * Sets the value of the repaymentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentState }
     *     
     */
    public void setRepaymentState(RepaymentState value) {
        this.repaymentState = value;
    }

    /**
     * Gets the value of the surveyNet property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyNet }
     *     
     */
    public SurveyNet getSurveyNet() {
        return surveyNet;
    }

    /**
     * Sets the value of the surveyNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyNet }
     *     
     */
    public void setSurveyNet(SurveyNet value) {
        this.surveyNet = value;
    }

}
