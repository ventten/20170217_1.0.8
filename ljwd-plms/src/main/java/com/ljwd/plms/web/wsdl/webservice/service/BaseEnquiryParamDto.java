
package com.ljwd.plms.web.wsdl.webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseEnquiryParamDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseEnquiryParamDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sortFields" type="{http://webservice.loan.mfbms.flinkmf.com/}sortField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="startFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="resultSize" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="matchCase" type="{http://webservice.loan.mfbms.flinkmf.com/}matchCase" />
 *       &lt;attribute name="matchStyle" type="{http://webservice.loan.mfbms.flinkmf.com/}matchStyle" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseEnquiryParamDto", propOrder = {
    "sortFields"
})
@XmlSeeAlso({
    CheckLoanManParamDto.class,
    ApplicationOutsourceParamDto.class,
    RepaymentBankParamDto.class,
    InternetAddrParamDto.class,
    CreditCustomerSearchParamDto.class,
    WholeAdvCollectParamDto.class,
    WriteOffSearchParamDto.class,
    ChannelFundsSearchParamDto.class,
    LoanPayingSearchParamDto.class,
    RpmntManageSearchParamDto.class,
    SurveyCallParamDto.class,
    OfferRequestParamDto.class,
    AuditAssignMustParamDto.class,
    AccountInfoSearchParamDto.class,
    FeeWaiveApprovalSearchParamDto.class,
    OfferBatchParamDto.class,
    RefundUpdateParamDto.class,
    SearchRefundAmtParamDto.class,
    RepaymentEnquiryParamDto.class,
    RepaymentBankApplParamDto.class,
    RefundRequestParamDto.class,
    DepositEnquiryParamDto.class,
    SearchWaiveInfoParamDto.class,
    AdvanceReceivedDetailEnquiryParamDto.class,
    OfferCountParamDto.class,
    RefundViewParamDto.class,
    RefundApplyParamDto.class,
    CustomerBankAccountSearchParamDto.class,
    BaseDataControlDto.class,
    DocumentGenLogSearchParamDto.class,
    ReceivableEnquiryParamDto.class,
    RefundRequestSearchParamDto.class,
    LoanStuationParamDto.class
})
public abstract class BaseEnquiryParamDto {

    @XmlElement(nillable = true)
    protected List<SortField> sortFields;
    @XmlAttribute(name = "startFrom", required = true)
    protected int startFrom;
    @XmlAttribute(name = "resultSize", required = true)
    protected int resultSize;
    @XmlAttribute(name = "matchCase")
    protected MatchCase matchCase;
    @XmlAttribute(name = "matchStyle")
    protected MatchStyle matchStyle;

    /**
     * Gets the value of the sortFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortField }
     * 
     * 
     */
    public List<SortField> getSortFields() {
        if (sortFields == null) {
            sortFields = new ArrayList<SortField>();
        }
        return this.sortFields;
    }

    /**
     * Gets the value of the startFrom property.
     * 
     */
    public int getStartFrom() {
        return startFrom;
    }

    /**
     * Sets the value of the startFrom property.
     * 
     */
    public void setStartFrom(int value) {
        this.startFrom = value;
    }

    /**
     * Gets the value of the resultSize property.
     * 
     */
    public int getResultSize() {
        return resultSize;
    }

    /**
     * Sets the value of the resultSize property.
     * 
     */
    public void setResultSize(int value) {
        this.resultSize = value;
    }

    /**
     * Gets the value of the matchCase property.
     * 
     * @return
     *     possible object is
     *     {@link MatchCase }
     *     
     */
    public MatchCase getMatchCase() {
        return matchCase;
    }

    /**
     * Sets the value of the matchCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchCase }
     *     
     */
    public void setMatchCase(MatchCase value) {
        this.matchCase = value;
    }

    /**
     * Gets the value of the matchStyle property.
     * 
     * @return
     *     possible object is
     *     {@link MatchStyle }
     *     
     */
    public MatchStyle getMatchStyle() {
        return matchStyle;
    }

    /**
     * Sets the value of the matchStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchStyle }
     *     
     */
    public void setMatchStyle(MatchStyle value) {
        this.matchStyle = value;
    }

}
