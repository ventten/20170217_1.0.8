
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRepaymentExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRepaymentExport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="params" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentSearchResultDto" minOccurs="0"/>
 *         &lt;element name="calAmount" type="{http://webservice.loan.mfbms.flinkmf.com/}contractAmountDto" minOccurs="0"/>
 *         &lt;element name="repaymentPlans" type="{http://webservice.loan.mfbms.flinkmf.com/}repaymentPlanDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRepaymentExport", propOrder = {
    "params",
    "calAmount",
    "repaymentPlans"
})
public class SearchRepaymentExport {

    protected PaymentSearchResultDto params;
    protected ContractAmountDto calAmount;
    protected List<RepaymentPlanDto> repaymentPlans;

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSearchResultDto }
     *     
     */
    public PaymentSearchResultDto getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSearchResultDto }
     *     
     */
    public void setParams(PaymentSearchResultDto value) {
        this.params = value;
    }

    /**
     * Gets the value of the calAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ContractAmountDto }
     *     
     */
    public ContractAmountDto getCalAmount() {
        return calAmount;
    }

    /**
     * Sets the value of the calAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractAmountDto }
     *     
     */
    public void setCalAmount(ContractAmountDto value) {
        this.calAmount = value;
    }

    /**
     * Gets the value of the repaymentPlans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repaymentPlans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepaymentPlans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepaymentPlanDto }
     * 
     * 
     */
    public List<RepaymentPlanDto> getRepaymentPlans() {
        if (repaymentPlans == null) {
            repaymentPlans = new ArrayList<RepaymentPlanDto>();
        }
        return this.repaymentPlans;
    }

}
