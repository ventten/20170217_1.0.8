package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.model.case_collection.LnPayment;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlan;
import com.ljwd.plms.web.model.case_collection.SysChargeSchema;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by zhengzw on 2016/8/12
 */
public class ReceivableContext {

    private SysChargeSchema chargeSchema;
    private LnCntrct contract;
    private LnPayment payment;
    private List<LnRpmntPlan> plans;
    private Date repaymentDate;
    private BigDecimal repaymentAmount;
    private boolean isSimulateOperate;          //是否是模拟入账操作
    private boolean isRenewLoanOperate;         //是否是续贷操作
    private BigDecimal renewLoanPenaltyRate;    //续贷操作提供的违约金费率
    private boolean isInAdvanceRepayment;       //是否是提前结清操作
    private Long repaymentId;                   //用于取上次还款时间(退款的时候要重新入账，需要获取入账的repayment之前的还款时间)
    private Integer overdueDays;                //计算出来的逾期天数
    private BigDecimal remindPrincipal;         //计算出来的剩余本金

    public ReceivableContext(){

    }

    public ReceivableContext(LnPayment payment, List<LnRpmntPlan> plans, Date repaymentDate, boolean isInAdvanceRepayment) {
        this.payment = payment;
        this.plans = plans;
        this.repaymentDate = repaymentDate;
        this.isInAdvanceRepayment = isInAdvanceRepayment;
    }

    public ReceivableContext(SysChargeSchema product,
                             LnCntrct contract,
                             LnPayment payment,
                             List<LnRpmntPlan> plans ,
                             Date repaymentDate,
                             BigDecimal repaymentAmount,
                             boolean isRenewLoanOperate,
                             BigDecimal renewLoanPenaltyRate,
                             boolean isSimulateOperate,
                             boolean isInAdvanceRepayment){
        this.chargeSchema = product;
        this.contract = contract;
        this.payment = payment;
        this.plans = plans;

        this.repaymentDate = repaymentDate;
        this.repaymentAmount = repaymentAmount;

        this.isRenewLoanOperate = isRenewLoanOperate;
        this.renewLoanPenaltyRate = renewLoanPenaltyRate;

        this.isSimulateOperate = isSimulateOperate;
        this.isInAdvanceRepayment = isInAdvanceRepayment;
    }
    /**
     * @return the isInAdvanceRepayment
     */
    public boolean isIsInAdvanceRepayment() {
        return isInAdvanceRepayment;
    }
    public SysChargeSchema getChargeSchema() {
        return chargeSchema;
    }

    public void setChargeSchema(SysChargeSchema chargeSchema) {
        this.chargeSchema = chargeSchema;
    }

    public LnCntrct getContract() {
        return contract;
    }

    public void setContract(LnCntrct contract) {
        this.contract = contract;
    }

    public LnPayment getPayment() {
        return payment;
    }

    public void setPayment(LnPayment payment) {
        this.payment = payment;
    }

    public List<LnRpmntPlan> getPlans() {
        return plans;
    }

    public void setPlans(List<LnRpmntPlan> plans) {
        this.plans = plans;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public boolean isSimulateOperate() {
        return isSimulateOperate;
    }

    public void setSimulateOperate(boolean isSimulateOperate) {
        this.isSimulateOperate = isSimulateOperate;
    }

    public boolean isRenewLoanOperate() {
        return isRenewLoanOperate;
    }

    public void setRenewLoanOperate(boolean isRenewLoanOperate) {
        this.isRenewLoanOperate = isRenewLoanOperate;
    }

    public BigDecimal getRenewLoanPenaltyRate() {
        return renewLoanPenaltyRate;
    }

    public void setRenewLoanPenaltyRate(BigDecimal renewLoanPenaltyRate) {
        this.renewLoanPenaltyRate = renewLoanPenaltyRate;
    }

    public boolean isInAdvanceRepayment() {
        return isInAdvanceRepayment;
    }

    public void setInAdvanceRepayment(boolean isInAdvanceRepayment) {
        this.isInAdvanceRepayment = isInAdvanceRepayment;
    }

    public Long getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(Long repaymentId) {
        this.repaymentId = repaymentId;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public BigDecimal getRemindPrincipal() {
        return remindPrincipal;
    }

    public void setRemindPrincipal(BigDecimal remindPrincipal) {
        this.remindPrincipal = remindPrincipal;
    }
}
