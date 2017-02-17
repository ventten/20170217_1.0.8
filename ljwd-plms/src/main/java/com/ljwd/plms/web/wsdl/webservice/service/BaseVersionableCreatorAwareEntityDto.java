
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseVersionableCreatorAwareEntityDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseVersionableCreatorAwareEntityDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseCreatorAwareEntityDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="recordVersion" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseVersionableCreatorAwareEntityDto")
@XmlSeeAlso({
    ApplicationLedgerDto.class,
    InternetAddrDto.class,
    SearchCollectRecordDetailDto.class,
    RepaymentFeePlanDto.class,
    OutsourceCorporationDto.class,
    PolicyInfoDto.class,
    SearchCollectAssignDto.class,
    SearchOutVisitRecordDto.class,
    AuditInvestigateDto.class,
    BankAccountDto.class,
    SurveyReportSearchDto.class,
    ReceivableDetailDto.class,
    RequestLogDto.class,
    OfferExemptDto.class,
    VehicleCheckInfoDto.class,
    ApplicationOutsourceDto.class,
    TurnoverManageDtlDto.class,
    CollectorIncomeDto.class,
    CarInfoDto.class,
    SearchAssetMakeInfoDto.class,
    SearchOutVisitRecordAddressListResultDto.class,
    ContractDto.class,
    WriteOffRecordDto.class,
    HouseInfoDto.class,
    BankJournalReportDto.class,
    SurveyRepaymentDto.class,
    WaiveRequestDetailDto.class,
    SurveyFinanceDto.class,
    OutVisitSettingParamDto.class,
    PendingSurveyDto.class,
    JxlApplRecordDto.class,
    RiskSurveyDto.class,
    OfferBatchDetailDto.class,
    PeriodInfoDto.class,
    RepaymentDetailDto.class,
    TaskInfoDto.class,
    TurnoverManageDto.class,
    BankAccountNewDto.class,
    CustomerDto.class,
    SearchOutVisitRecordListDto.class,
    SuperAgingResultDto.class,
    OfferAgreementDto.class,
    RpmntManageDto.class,
    PaymentDto.class,
    BankJournalDetailReportDto.class,
    ProfessionDto.class,
    ChannelFundsAvaDto.class,
    SurveyPhoneDetailDto.class,
    CustomerBankAccountDto.class,
    MaterialDto.class,
    APenClearResultDto.class,
    SimulateCalculateSummaryReceivableResultDto.class,
    CollectSettingDto.class,
    SurveySumDto.class,
    ChannelFundsDto.class,
    LoanStuationDto.class,
    SurveyNetDto.class,
    ApplicationInfoDto.class,
    TaskDefinitionDto.class,
    OfferBatchDto.class,
    SurveyPhoneDto.class,
    ReceivableDto.class,
    AccountInfoDto.class,
    SearchAssetCorpResultDto.class,
    RefundRequestDto.class,
    RepaymentPlanDto.class,
    DocumentGenLogDto.class,
    OutVisitInfoDto.class,
    SearchAssetBagDto.class,
    BankAssignDto.class,
    ContactorDto.class,
    ContractChangeSiteSearchDto.class,
    SearchReceiveOverdueDto.class,
    SimulateDepositResultDto.class,
    CreditReportDto.class,
    DebtTransferDto.class,
    WaiveRequestDto.class,
    SurveyCallDto.class,
    SearchWaiveInfoDtlDto.class,
    AuditSurveyDto.class,
    CreditCustomerDto.class
})
public abstract class BaseVersionableCreatorAwareEntityDto
    extends BaseCreatorAwareEntityDto
{

    @XmlAttribute(name = "recordVersion")
    protected Long recordVersion;

    /**
     * Gets the value of the recordVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordVersion() {
        return recordVersion;
    }

    /**
     * Sets the value of the recordVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordVersion(Long value) {
        this.recordVersion = value;
    }

}
