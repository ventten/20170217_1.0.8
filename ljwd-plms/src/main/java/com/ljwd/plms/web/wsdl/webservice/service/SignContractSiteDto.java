
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for signContractSiteDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="signContractSiteDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoDto" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://webservice.loan.mfbms.flinkmf.com/}contractDto" minOccurs="0"/>
 *         &lt;element name="lastApprovalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lastApprovalPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pendingTaskInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "signContractSiteDto", propOrder = {
    "applicationInfo",
    "contract",
    "lastApprovalAmount",
    "lastApprovalPeriod",
    "pendingTaskInfo"
})
public class SignContractSiteDto {

    protected ApplicationInfoDto applicationInfo;
    protected ContractDto contract;
    protected BigDecimal lastApprovalAmount;
    protected Integer lastApprovalPeriod;
    protected TaskInfoDto pendingTaskInfo;

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

}
