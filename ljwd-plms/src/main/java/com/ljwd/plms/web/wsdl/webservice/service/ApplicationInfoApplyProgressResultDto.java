
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationInfoApplyProgressResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationInfoApplyProgressResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auditStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cntrctStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanStatus" type="{http://webservice.loan.mfbms.flinkmf.com/}loanStatus" minOccurs="0"/>
 *         &lt;element name="progressRecords" type="{http://webservice.loan.mfbms.flinkmf.com/}approvalProgressDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationInfoApplyProgressResultDto", propOrder = {
    "auditStatus",
    "clearTime",
    "cntrctStatus",
    "loanStatus",
    "progressRecords",
    "signNote"
})
public class ApplicationInfoApplyProgressResultDto {

    protected String auditStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clearTime;
    protected String cntrctStatus;
    protected LoanStatus loanStatus;
    @XmlElement(nillable = true)
    protected List<ApprovalProgressDto> progressRecords;
    protected String signNote;

    /**
     * Gets the value of the auditStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditStatus() {
        return auditStatus;
    }

    /**
     * Sets the value of the auditStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditStatus(String value) {
        this.auditStatus = value;
    }

    /**
     * Gets the value of the clearTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClearTime() {
        return clearTime;
    }

    /**
     * Sets the value of the clearTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClearTime(XMLGregorianCalendar value) {
        this.clearTime = value;
    }

    /**
     * Gets the value of the cntrctStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrctStatus() {
        return cntrctStatus;
    }

    /**
     * Sets the value of the cntrctStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntrctStatus(String value) {
        this.cntrctStatus = value;
    }

    /**
     * Gets the value of the loanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LoanStatus }
     *     
     */
    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    /**
     * Sets the value of the loanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanStatus }
     *     
     */
    public void setLoanStatus(LoanStatus value) {
        this.loanStatus = value;
    }

    /**
     * Gets the value of the progressRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progressRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgressRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalProgressDto }
     * 
     * 
     */
    public List<ApprovalProgressDto> getProgressRecords() {
        if (progressRecords == null) {
            progressRecords = new ArrayList<ApprovalProgressDto>();
        }
        return this.progressRecords;
    }

    /**
     * Gets the value of the signNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignNote() {
        return signNote;
    }

    /**
     * Sets the value of the signNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignNote(String value) {
        this.signNote = value;
    }

}
