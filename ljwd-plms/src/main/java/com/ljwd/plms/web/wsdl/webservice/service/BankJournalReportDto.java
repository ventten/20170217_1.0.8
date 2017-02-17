
package com.ljwd.plms.web.wsdl.webservice.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bankJournalReportDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankJournalReportDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseVersionableCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="repaymentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="repaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="assignName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idCardNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isAdvanceClear" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isOutsrcCustormer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outSrcType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isWriteOff" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enterAcDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="enterAcStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="errorReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handleReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankJournalReportDto")
public class BankJournalReportDto
    extends BaseVersionableCreatorAwareEntityDto
{

    @XmlAttribute(name = "repaymentName")
    protected String repaymentName;
    @XmlAttribute(name = "repaymentAmount")
    protected BigDecimal repaymentAmount;
    @XmlAttribute(name = "repaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar repaymentDate;
    @XmlAttribute(name = "assignName")
    protected String assignName;
    @XmlAttribute(name = "idCardNo")
    protected String idCardNo;
    @XmlAttribute(name = "contractNo")
    protected String contractNo;
    @XmlAttribute(name = "isAdvanceClear")
    protected String isAdvanceClear;
    @XmlAttribute(name = "isOutsrcCustormer")
    protected String isOutsrcCustormer;
    @XmlAttribute(name = "outSrcType")
    protected String outSrcType;
    @XmlAttribute(name = "isWriteOff")
    protected String isWriteOff;
    @XmlAttribute(name = "enterAcDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enterAcDate;
    @XmlAttribute(name = "enterAcStatus")
    protected String enterAcStatus;
    @XmlAttribute(name = "remark")
    protected String remark;
    @XmlAttribute(name = "errorReason")
    protected String errorReason;
    @XmlAttribute(name = "handleReason")
    protected String handleReason;

    /**
     * Gets the value of the repaymentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentName() {
        return repaymentName;
    }

    /**
     * Sets the value of the repaymentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentName(String value) {
        this.repaymentName = value;
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
     * Gets the value of the assignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignName() {
        return assignName;
    }

    /**
     * Sets the value of the assignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignName(String value) {
        this.assignName = value;
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
     * Gets the value of the isAdvanceClear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAdvanceClear() {
        return isAdvanceClear;
    }

    /**
     * Sets the value of the isAdvanceClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAdvanceClear(String value) {
        this.isAdvanceClear = value;
    }

    /**
     * Gets the value of the isOutsrcCustormer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOutsrcCustormer() {
        return isOutsrcCustormer;
    }

    /**
     * Sets the value of the isOutsrcCustormer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOutsrcCustormer(String value) {
        this.isOutsrcCustormer = value;
    }

    /**
     * Gets the value of the outSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSrcType() {
        return outSrcType;
    }

    /**
     * Sets the value of the outSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSrcType(String value) {
        this.outSrcType = value;
    }

    /**
     * Gets the value of the isWriteOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsWriteOff() {
        return isWriteOff;
    }

    /**
     * Sets the value of the isWriteOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsWriteOff(String value) {
        this.isWriteOff = value;
    }

    /**
     * Gets the value of the enterAcDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnterAcDate() {
        return enterAcDate;
    }

    /**
     * Sets the value of the enterAcDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnterAcDate(XMLGregorianCalendar value) {
        this.enterAcDate = value;
    }

    /**
     * Gets the value of the enterAcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterAcStatus() {
        return enterAcStatus;
    }

    /**
     * Sets the value of the enterAcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterAcStatus(String value) {
        this.enterAcStatus = value;
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
     * Gets the value of the errorReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReason() {
        return errorReason;
    }

    /**
     * Sets the value of the errorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReason(String value) {
        this.errorReason = value;
    }

    /**
     * Gets the value of the handleReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleReason() {
        return handleReason;
    }

    /**
     * Sets the value of the handleReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleReason(String value) {
        this.handleReason = value;
    }

}
