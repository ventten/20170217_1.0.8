
package com.ljwd.plms.web.wsdl.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseVersionableCreatorAwareEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseVersionableCreatorAwareEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.loan.mfbms.flinkmf.com/}baseCreatorAwareEntity">
 *       &lt;sequence>
 *         &lt;element name="recordVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseVersionableCreatorAwareEntity", propOrder = {
    "recordVersion"
})
@XmlSeeAlso({
    RepaymentPlanBank.class,
    Profession.class,
    Role.class,
    FunctionPermission.class,
    PaymentTypeDetail.class,
    UserPriviledge.class,
    BankAssign.class,
    BankBranch.class,
    Contract.class,
    OfferBatch.class,
    PeriodInfo.class,
    SurveyPhoneDetail.class,
    OfferReplyDetail.class,
    WorkflowInfo.class,
    RepaymentBankDetail.class,
    TaskInfo.class,
    Function.class,
    Annex.class,
    CarInfo.class,
    Permission.class,
    ReceivableFeeDetail.class,
    OfferParameter.class,
    AccountInfo.class,
    OfferRequest.class,
    Organization.class,
    Employee.class,
    OutstandingAccount.class,
    SurveyRepayment.class,
    SurveySum.class,
    LedgerType.class,
    ProductFee.class,
    SpecialApprovalSetting.class,
    ApplicationInfo.class,
    SurveyFinance.class,
    BankJournal.class,
    PaymentType.class,
    OfferBatchDetail.class,
    Customer.class,
    Site.class,
    Material.class,
    CustomerBankAccount.class,
    ReceivableDetail.class,
    RolePriviledge.class,
    OfferRequestDetail.class,
    Survey.class,
    Repayment.class,
    User.class,
    BankAccount.class,
    RepaymentDetail.class,
    ProductFeeDetail.class,
    RepaymentBank.class,
    Waive.class,
    Receivable.class,
    SurveyExempt.class,
    WaiveRequest.class,
    AdvanceReceivedDetail.class,
    SurveyPhone.class,
    RepaymentPlan.class,
    ApplicationLastResult.class,
    Product.class,
    BankJournalLog.class,
    CreditReport.class,
    ApplicationLedger.class,
    ContractPrintHis.class,
    PaymentDetail.class,
    Payment.class,
    PolicyInfo.class,
    OfferReply.class,
    SurveyNet.class,
    Contactor.class,
    TaskDefinition.class,
    HouseInfo.class,
    ApplicationAccount.class,
    ChargeSchema.class,
    RepaymentFeePlan.class,
    WaiveRequestDetail.class,
    Exempt.class
})
public abstract class BaseVersionableCreatorAwareEntity
    extends BaseCreatorAwareEntity
{

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
