
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for simulateDepositResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simulateDepositResultDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *         &lt;element name="reminderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overdueDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receivableDtos" type="{http://webservice.loan.mfbms.flinkmf.com/}receivableSearchResultDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="receivableSumaryAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulateDepositResultDto", propOrder = {
    "reminderAmount",
    "overdueDays",
    "receivableDtos"
})
public class SimulateDepositResultDto
    extends BaseVersionableCreatorAwareEntityDto
{

    protected BigDecimal reminderAmount;
    protected Integer overdueDays;
    @XmlElement(nillable = true)
    protected List<ReceivableSearchResultDto> receivableDtos;
    @XmlAttribute(name = "repaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "repaymentAmount")
    protected BigDecimal repaymentAmount;
    @XmlAttribute(name = "receivableSumaryAmount")
    protected BigDecimal receivableSumaryAmount;

    /**
     * Gets the value of the reminderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReminderAmount() {
        return reminderAmount;
    }

    /**
     * Sets the value of the reminderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReminderAmount(BigDecimal value) {
        this.reminderAmount = value;
    }

    /**
     * Gets the value of the overdueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverdueDays() {
        return overdueDays;
    }

    /**
     * Sets the value of the overdueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverdueDays(Integer value) {
        this.overdueDays = value;
    }

    /**
     * Gets the value of the receivableDtos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableDtos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableDtos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivableSearchResultDto }
     * 
     * 
     */
    public List<ReceivableSearchResultDto> getReceivableDtos() {
        if (receivableDtos == null) {
            receivableDtos = new ArrayList<ReceivableSearchResultDto>();
        }
        return this.receivableDtos;
    }

    /**
     * Gets the value of the repaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * Sets the value of the repaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRepaymentDate(XMLGregorianCalendar value) {
        this.repaymentDate = value;
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
     * Gets the value of the repaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * Sets the value of the repaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaymentAmount(BigDecimal value) {
        this.repaymentAmount = value;
    }

    /**
     * Gets the value of the receivableSumaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceivableSumaryAmount() {
        return receivableSumaryAmount;
    }

    /**
     * Sets the value of the receivableSumaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReceivableSumaryAmount(BigDecimal value) {
        this.receivableSumaryAmount = value;
    }

}
