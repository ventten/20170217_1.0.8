
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paymentSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoDto" minOccurs="0"/>
 *         &lt;element name="bankAccounts" type="{http://webservice.loan.mfbms.flinkmf.com/}customerBankAccountDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *         &lt;element name="lastApprovalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lastApprovalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://webservice.loan.mfbms.flinkmf.com/}paymentDto" minOccurs="0"/>
 *         &lt;element name="pendingTaskInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *         &lt;element name="signingNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCheckDto" type="{http://webservice.loan.mfbms.flinkmf.com/}vehicleCheckInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paymentSearchResultDto", propOrder = {
    "applicationInfo",
    "bankAccounts",
    "contract",
    "lastApprovalAmount",
    "lastApprovalPeriod",
    "payment",
    "pendingTaskInfo",
    "signingNote",
    "vehicleCheckDto"
})
public class PaymentSearchResultDto {

    protected ApplicationInfoDto applicationInfo;
    @XmlElement(nillable = true)
    protected List<CustomerBankAccountDto> bankAccounts;
    protected ContractDto contract;
    protected BigDecimal lastApprovalAmount;
    protected Integer lastApprovalPeriod;
    protected PaymentDto payment;
    protected TaskInfoDto pendingTaskInfo;
    protected String signingNote;
    protected VehicleCheckInfoDto vehicleCheckDto;

    /**
     * Gets the value of the applicationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationInfoDto }
     *     
     */
    public ApplicationInfoDto getApplicationInfo() {
        return applicationInfo;
    }

    /**
     * Sets the value of the applicationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationInfoDto }
     *     
     */
    public void setApplicationInfo(ApplicationInfoDto value) {
        this.applicationInfo = value;
    }

    /**
     * Gets the value of the bankAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerBankAccountDto }
     * 
     * 
     */
    public List<CustomerBankAccountDto> getBankAccounts() {
        if (bankAccounts == null) {
            bankAccounts = new ArrayList<CustomerBankAccountDto>();
        }
        return this.bankAccounts;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDto }
     *     
     */
    public ContractDto getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDto }
     *     
     */
    public void setContract(ContractDto value) {
        this.contract = value;
    }

    /**
     * Gets the value of the lastApprovalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastApprovalAmount() {
        return lastApprovalAmount;
    }

    /**
     * Sets the value of the lastApprovalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastApprovalAmount(BigDecimal value) {
        this.lastApprovalAmount = value;
    }

    /**
     * Gets the value of the lastApprovalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastApprovalPeriod() {
        return lastApprovalPeriod;
    }

    /**
     * Sets the value of the lastApprovalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastApprovalPeriod(Integer value) {
        this.lastApprovalPeriod = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDto }
     *     
     */
    public PaymentDto getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDto }
     *     
     */
    public void setPayment(PaymentDto value) {
        this.payment = value;
    }

    /**
     * Gets the value of the pendingTaskInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TaskInfoDto }
     *     
     */
    public TaskInfoDto getPendingTaskInfo() {
        return pendingTaskInfo;
    }

    /**
     * Sets the value of the pendingTaskInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskInfoDto }
     *     
     */
    public void setPendingTaskInfo(TaskInfoDto value) {
        this.pendingTaskInfo = value;
    }

    /**
     * Gets the value of the signingNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningNote() {
        return signingNote;
    }

    /**
     * Sets the value of the signingNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningNote(String value) {
        this.signingNote = value;
    }

    /**
     * Gets the value of the vehicleCheckDto property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCheckInfoDto }
     *     
     */
    public VehicleCheckInfoDto getVehicleCheckDto() {
        return vehicleCheckDto;
    }

    /**
     * Sets the value of the vehicleCheckDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCheckInfoDto }
     *     
     */
    public void setVehicleCheckDto(VehicleCheckInfoDto value) {
        this.vehicleCheckDto = value;
    }

}
