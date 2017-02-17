
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseEnquiryResultDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseEnquiryResultDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="totalNoOfRecords" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseEnquiryResultDto")
@XmlSeeAlso({
    BankAccountResultDto.class,
    DocumentGenLogResultDto.class,
    OfferExemptResultDto.class,
    OutVisitAuditResultDto.class,
    CompanyCustomerInfoSearchResultDto.class,
    OutVisitPlanSearchResultDto.class,
    RepaymentEnquiryResultDto.class,
    WriteOffSearchResultDto.class,
    LoanPayingSearchResultDto.class,
    DepositEnquiryResultDto.class,
    SurveyReportSearchResultDto.class,
    FinanManageReadResultDto.class,
    VehicleCheckInfoSearchResultDto.class,
    RefundApplyResultDto.class,
    OutVisitBindSearchResultDto.class,
    SearchCustomerInfoWeChatResultDto.class,
    CollectorIncomeResultDto.class,
    SearchAssetMakeInfoResultDto.class,
    OfferBatchDetailResultDto.class,
    RpmntManageSearchResultDto.class,
    SearchAssetBagResultDto.class,
    BatchApplicationRepaymentResultDto.class,
    SearchCustomerPayingWeChatResultDto.class,
    SearchCustomerRemindWeChatResultDto.class,
    OutVisitStatusResultDto.class,
    RepaymentBankSearchResult.class,
    ConResultDto.class,
    RefundRequestSearchResultDto.class,
    ChannelFundsSearchAvaResultDto.class,
    SearchOutVisitRecordResultDto.class,
    OfferBatchResult.class,
    OutsrcCorpResultRecordDto.class,
    RepaymentBankApplSearchResultDto.class,
    SearchCustomerAllWeChatResultDto.class,
    ApplicationInfoSearchResultDto.class,
    OfferAgreementSearchResultDto.class,
    SearchCollectRecordDetailResultDto.class,
    ApplicationInfoAssignResultDto.class,
    RiskSurveyResultDto.class,
    OutVisitPlanInforSearchResultDto.class,
    SurveyingAssignResultDto.class,
    OutVisitAntiFraudResultDto.class,
    ChannelFundsSearchResultDto.class,
    BatchApplRepaymentDetailResultDto.class,
    SearchCollectApplyOuterResultDto.class,
    SearchContractSendInfoResultDto.class,
    CustomerBankAccountSearchResultDto.class,
    OutVisitAssignResultDto.class,
    ContractAppointmentSearchResultDto.class,
    OutVisitPlanInfoWebSearchResultDto.class,
    SearchCollectAssignResultDto.class,
    TurnoverManageSearchResultDto.class,
    OutVisitDelayDtlSearchResultDto.class,
    ReceivableEnquiryResultDto.class,
    CollectAllocationReportResultDto.class,
    OutVisitCustInfoWebSearchResultDto.class,
    BankJournalDetailReportResultDto.class,
    OutVisitSignSearchResultDto.class,
    FeeWaiveApprovalSearchResultDto.class,
    AppointmentApplySearchResultDto.class,
    InvestigateStatisticsResultDto.class,
    TurnoverManageDtlSearchResultDto.class,
    AdvanceReceivedDetailEnquiryResultDto.class,
    SouyidaiSendDataResultDto.class,
    SurveyCallResultDto.class,
    AuditInvestigateAssignResultDto.class,
    AuditInvestigateResultDto.class,
    SearchCustomerWeChatResultDto.class,
    RefundRequestResultDto.class,
    OutVisitDelayAuditSearchResultDto.class,
    WholeAdvCollectResultDto.class,
    ApplyExemptResultDto.class,
    AppointSearchResultDto.class,
    CollectAllocationSearchResultDto.class,
    ApplicationOutsourceResult.class,
    SearchDebtTransferResultDto.class,
    CustomAddressSearchResultDto.class,
    ContractChangeSiteSearchResultDto.class,
    ContractSearchResultDto.class,
    OutVisitDelaySearchResultDto.class,
    OverdueClientLetterGenerateResultDto.class,
    ChangeCheckSearchResultDto.class,
    OutVisitPlanDtlSearchResultDto.class,
    BankJournalReportResultDto.class,
    SearchWaiveInfoResultDto.class,
    SearchOutVisitRecordListResultDto.class,
    VehicleCheckProcessSearchResultDto.class,
    BankJournalResultDto.class,
    CreditCustomerSearchResultDto.class,
    AuditSurveyResultDto.class,
    SearchReceiveOverdueResultDto.class,
    AccountInforSearchResultDto.class,
    JxlApplRecordResultDto.class,
    LoanStuationResultDto.class
})
public abstract class BaseEnquiryResultDto {

    @XmlAttribute(name = "totalNoOfRecords", required = true)
    protected int totalNoOfRecords;

    /**
     * Gets the value of the totalNoOfRecords property.
     * 
     */
    public int getTotalNoOfRecords() {
        return totalNoOfRecords;
    }

    /**
     * Sets the value of the totalNoOfRecords property.
     * 
     */
    public void setTotalNoOfRecords(int value) {
        this.totalNoOfRecords = value;
    }

}
