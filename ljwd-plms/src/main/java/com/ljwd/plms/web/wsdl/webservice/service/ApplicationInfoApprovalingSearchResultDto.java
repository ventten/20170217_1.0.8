
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationInfoApprovalingSearchResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoApprovalingSearchResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}applicationInfoDto" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://webservice.loan.mfbms.flinkmf.com/}customerDto" minOccurs="0"/>
 *         &lt;element name="taskInfos" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pendingTaskInfo" type="{http://webservice.loan.mfbms.flinkmf.com/}taskInfoDto" minOccurs="0"/>
 *         &lt;element name="signingNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="initApprovalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="initApprovalPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoApprovalingSearchResultDto", propOrder = {
    "applicationInfo",
    "customer",
    "taskInfos",
    "pendingTaskInfo",
    "signingNote"
})
public class ApplicationInfoApprovalingSearchResultDto {

    protected ApplicationInfoDto applicationInfo;
    protected CustomerDto customer;
    @XmlElement(nillable = true)
    protected List<TaskInfoDto> taskInfos;
    protected TaskInfoDto pendingTaskInfo;
    protected String signingNote;
    @XmlAttribute(name = "initApprovalAmount", required = true)
    protected BigDecimal initApprovalAmount;
    @XmlAttribute(name = "initApprovalPeriod", required = true)
    protected int initApprovalPeriod;

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
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDto }
     *     
     */
    public CustomerDto getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDto }
     *     
     */
    public void setCustomer(CustomerDto value) {
        this.customer = value;
    }

    /**
     * Gets the value of the taskInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskInfoDto }
     * 
     * 
     */
    public List<TaskInfoDto> getTaskInfos() {
        if (taskInfos == null) {
            taskInfos = new ArrayList<TaskInfoDto>();
        }
        return this.taskInfos;
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
     * Gets the value of the initApprovalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitApprovalAmount() {
        return initApprovalAmount;
    }

    /**
     * Sets the value of the initApprovalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitApprovalAmount(BigDecimal value) {
        this.initApprovalAmount = value;
    }

    /**
     * Gets the value of the initApprovalPeriod property.
     * 
     */
    public int getInitApprovalPeriod() {
        return initApprovalPeriod;
    }

    /**
     * Sets the value of the initApprovalPeriod property.
     * 
     */
    public void setInitApprovalPeriod(int value) {
        this.initApprovalPeriod = value;
    }

}
