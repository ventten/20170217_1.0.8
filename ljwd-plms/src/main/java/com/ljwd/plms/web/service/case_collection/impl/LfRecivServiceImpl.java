package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.util.LoanUtils;
import com.ljwd.plms.web.dao.case_collection.LfRecivMapper;
import com.ljwd.plms.web.model.case_collection.*;
import com.ljwd.plms.web.service.case_collection.inf.LfRecivDtlService;
import com.ljwd.plms.web.service.case_collection.inf.LfRecivService;
import com.ljwd.plms.web.service.case_collection.inf.LnPaymentService;
import com.ljwd.plms.web.service.case_collection.inf.LnRpmntPlanService;
import com.ljwd.plms.web.vo.case_collection.LfRecivDto;
import com.ljwd.plms.web.vo.case_collection.ReceivableContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * 应收款项表,LF_RECIV
 * */
@Service
public class LfRecivServiceImpl implements LfRecivService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private LfRecivMapper recivMapper;
    @Resource
    private LnPaymentService paymentService;
    @Resource
    private LnRpmntPlanService rpmntPlanService;
    @Resource
    private LfRecivDtlService lfRecivDtlService;

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LfReciv> selectByExample(LfRecivExample example) {
        return recivMapper.selectByExample(example);
    }

    /**
     * 根据借款ID查询最小的逾期期数
     * @param applId 借款申请ID
     * @return 最小的逾期期数
     */
    @Override
    public Integer selectMinOverduePeriodByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        return recivMapper.selectMinOverduePeriodByApplId(applId);
    }

    /**
     * 根据借款ID查询应收记录明细
     * @param applId 借款申请ID
     * @return 实体集
     */
    @Override
    public List<LfRecivDto> selectReceivableByApplId(Long applId) {
        if(applId == null){
            return null;
        }

        //根据借款ID查询应收记录
        List<LfRecivDto> receivableList = recivMapper.selectReceivableByApplId(applId);

        if(receivableList != null && receivableList.size() > 0){
            //应收记录IDS
            String recivIds = "";

            for(LfRecivDto reciv : receivableList){
                recivIds += "," + reciv.getRecivId();

                Date calculDate = new Date();
                if (LfReciv.STATUS_PAID.equals(reciv.getStatus()) && reciv.getActualRpmntDate() != null) {
                    calculDate = reciv.getActualRpmntDate();
                }
                //计算逾期天数
                int overdueDays = LoanUtils.calculateOverdueDays(reciv.getRpmntDate(), reciv.getMaxRpmntDate(), reciv.getRpmntDate(), calculDate);
                reciv.setOverdueDays(overdueDays);
            }

            recivIds = recivIds.replaceFirst(",","");

            //根据应收记录IDS查找应收明细
            List<LfRecivDtl> dtlList = lfRecivDtlService.selectByExample(new LfRecivDtlExample().setRecivIds(recivIds));
            if(dtlList != null && dtlList.size() > 0){
                for(LfRecivDto reciv : receivableList){
                    List<LfRecivDtl> receivableDetails = new ArrayList<LfRecivDtl>();
                    for(LfRecivDtl dtl : dtlList){
                        if(reciv.getRecivId().compareTo(dtl.getRecivId()) == 0){
                            receivableDetails.add(dtl);
                        }
                    }
                    reciv.setReceivableDetails(receivableDetails);
                }
            }
        }

        return receivableList;
    }

    /**
     * 根据借款ID和还款日期反算出外包费用(能找到外包催收费用的费率说明需要计算外包催收费）
     * @param applId        借款申请ID
     * @param repaymentDate 还款日期
     */
    @Override
    public BigDecimal selectApplOutsourceFeeRate(Long applId, Date repaymentDate) {
        return recivMapper.selectApplOutsourceFeeRate(applId, repaymentDate);
    }

    /**
     * 计算应收金额
     * @param applId        借款申请ID
     * @param payType       还款方式:RENEW-正常还款、INADVANCE-提前结清
     * @param repaymentDate 还款日期
     */
    @Override
    public BigDecimal selectRepaymentAmount(Long applId, String payType, Date repaymentDate) {

        //是否提前结清
        boolean isInAdvanceRepayment = false;
        if("INADVANCE".equals(payType)){
            isInAdvanceRepayment = true;
        }

        //根据借款ID查放款记录
        LnPayment payment = paymentService.selectByApplId(applId);

        //根据借款ID查应收记录,移除掉提前结清后面的记录和已经设置is_delete = 'Y'的记录
        LfRecivExample recivExample = new LfRecivExample().setApplId(applId).setIsDeleted("N").setIsRemoveAdvClear(true);
        recivExample.setOrderByClause("T.PERIOD_NUM");
        List<LfReciv> recivList = recivMapper.selectByExample(recivExample);

        List<LnRpmntPlan> rpmntPlanList = rpmntPlanService.selectByExample(new LnRpmntPlanExample().setApplId(applId));

        ReceivableContext ctx = new ReceivableContext(payment,rpmntPlanList,repaymentDate,isInAdvanceRepayment);

        boolean isOverdue = false;
        for (LfReciv rec : recivList) {
            if (!LfReciv.STATUS_PAID.equals(rec.getStatus()) && rec.getMaxRpmntDate().compareTo(repaymentDate) < 0) {
                isOverdue = true;
                break;
            }
        }
        LnRpmntPlan currentPlan = null;
        if (isOverdue) {
            currentPlan = this.getShouldRepaymentPlan(rpmntPlanList, repaymentDate);
        } else {
            currentPlan = this.getCurrentRepaymentPlan(rpmntPlanList, repaymentDate , isInAdvanceRepayment);
        }

//        //1.计算逾期费用
//        this.calculateOverduce(recivList, ctx);
//        //2.提前结清的或者核销计算
//        if ("Y".equals(ctx.getPayment().getIsWriteOff())) {
//            recivList = this.calculateOfWriteOff(recivList, ctx);
//        } else if (ctx.isIsInAdvanceRepayment()) {
//            calculateReivables = this.calculateOfInAdvanceRepayment(calculateReivables, ctx);
//        } else {
//            calculateReivables = this.calculateOfInAdvanceRepaymentNoFirst(calculateReivables, ctx);
//        }

        Integer comparePeriodNumber = -1;
        if (currentPlan != null) {
            comparePeriodNumber = currentPlan.getPeriodNum();
        }
        Integer advancePeriodNumber = this.getInAdvanceReceivablePeriodNumber(recivList);
        if (advancePeriodNumber != null) {
            comparePeriodNumber = advancePeriodNumber;
        }
        comparePeriodNumber = 14;

        BigDecimal sumCostAmount = BigDecimal.ZERO;

        for (LfReciv rec : recivList) {//只需计算当前期之前的
            if (rec.getPeriodNum().compareTo(comparePeriodNumber) > 0 || LfReciv.STATUS_PAID.equals(rec.getStatus())) {
                continue;
            }
            BigDecimal willCostAmount = rec.getTtlRecivAmt().subtract(rec.getTtlWaivedAmt());
            if (rec.getTtlActualAmt() != null) {
                willCostAmount = willCostAmount.subtract(rec.getTtlActualAmt());
            }
            sumCostAmount = sumCostAmount.add(willCostAmount);
        }

        if (sumCostAmount.compareTo(BigDecimal.ZERO) > 0) {
            //如果是外包客户的话,还需要反算出外包费用(能找到外包催收费用的费率说明需要计算外包催收费）
            BigDecimal outsourceFeeRate = recivMapper.selectApplOutsourceFeeRate(applId, repaymentDate);
            if (outsourceFeeRate != null) {
                //外包催收费 = 应收金额（除外包催收费）* 外包催收费率(一手外包为0.2，二手外包为0.3)
                BigDecimal collectCostAmount = sumCostAmount.multiply(outsourceFeeRate).setScale(2, RoundingMode.HALF_UP);
                sumCostAmount = sumCostAmount.add(collectCostAmount);
            }
        }

        return sumCostAmount;
    }

//    /**
//     * 核销计算-应收
//     */
//    private Set<Receivable> calculateOfWriteOff(Set<Receivable> receivables, ReceivableContext ctx) {
//        List<Receivable> listReceivables = this.sortReceivable(receivables);
//        //找出最后还清的那一期的期数
//        Receivable firstNonePaidRec = null;
//        for (Receivable rec : listReceivables) {
//            if (rec.getStatus() == RepaymentStatus.UNPAID || rec.getStatus() == RepaymentStatus.PARTIAL_PAID) {
//                firstNonePaidRec = rec;
//                break;
//            }
//        }
//
//        if (firstNonePaidRec == null) {
//            //说明已经还清。不需要计算
//            return receivables;
//        }
//
//        this.calculateOfInAdvanceOrWriteOffRepayment(null, firstNonePaidRec, listReceivables, ctx, false);
//
//        //3.删除应收中第一期未还清后面期数的应收数据()
//        List<Receivable> willBeRemoveReces = new ArrayList<Receivable>();
//        for (Receivable rec : listReceivables) {
//            if (rec.getPeriodNumber().compareTo(firstNonePaidRec.getPeriodNumber()) > 0) {
//                willBeRemoveReces.add(rec);
//            }
//        }
//        if (willBeRemoveReces.isEmpty() == false) {
//            listReceivables.removeAll(willBeRemoveReces);
//            if (ctx.isIsSimulateOperate() == false) {
//                //设置应收记录IS_DELETED = 'Y'
//                for (Receivable rec : willBeRemoveReces) {
//                    rec.setIsDeleted(Boolean.TRUE);
//                }
//                this.receivaleRepo.save(willBeRemoveReces);
//            }
//        }
//
//        Set<Receivable> calculatedRecs = new HashSet<Receivable>();
//        calculatedRecs.addAll(listReceivables);
//        return calculatedRecs;
//    }

    public Integer getInAdvanceReceivablePeriodNumber(List<LfReciv> receivables) {
        Integer invanceAdvancePeriodNum = null;
        for (LfReciv rec : receivables) {
            String isAdvClear = rec.getIsAdvClear();
            if (isAdvClear != null && "Y".equals(isAdvClear)) {
                invanceAdvancePeriodNum = rec.getPeriodNum();
                break;
            }
        }

        return invanceAdvancePeriodNum;
    }

    private LnRpmntPlan getCurrentRepaymentPlan(List<LnRpmntPlan> setPlans, Date repaymentDate , boolean isInAdvance) {
        LnRpmntPlan currentRepaymentPlan = null; //不可能为null
        List<LnRpmntPlan> sortedPlans = this.sortRepaymentPlan(setPlans);
        for (int i = 0; i < sortedPlans.size(); i++) {
            LnRpmntPlan plan = sortedPlans.get(i);
            {
                if (repaymentDate.compareTo(plan.getEndDate()) >= 0 && i == sortedPlans.size() - 1) {
                    currentRepaymentPlan = plan;
                } else if (repaymentDate.compareTo(plan.getEndDate()) >= 0 && i < sortedPlans.size() - 1) {
                    if (repaymentDate.compareTo(plan.getMaxRpmntDate()) <= 0) {
                        currentRepaymentPlan = plan;
                        break;
                    }
                } else if (repaymentDate.compareTo(plan.getEndDate()) <= 0) {
                    currentRepaymentPlan = plan;
                    break;
                }
            }
        }

        //2016-5-2 redmine#846 入账修改--对于0期未结清的客户提前结清处理
        //提前结清时候，根据时间算出当前期为0,找第1期
        if(currentRepaymentPlan.getPeriodNum() <= 0 && isInAdvance == true){
            LnRpmntPlan firstPeriodRepaymentPlan = null;
            for(LnRpmntPlan plan : sortedPlans){
                if(plan.getPeriodNum().compareTo(1) == 0){
                    firstPeriodRepaymentPlan = plan;
                    break;
                }
            }
            currentRepaymentPlan = firstPeriodRepaymentPlan;
        }
        return currentRepaymentPlan;
    }

    private LnRpmntPlan getShouldRepaymentPlan(List<LnRpmntPlan> setPlans, Date repaymentDate) {
        LnRpmntPlan currentRepaymentPlan = null;
        List<LnRpmntPlan> sortedPlans = this.sortRepaymentPlan(setPlans);
        for (int i = 0; i < sortedPlans.size(); i++) {
            LnRpmntPlan plan = sortedPlans.get(i);
            {
                if (repaymentDate.compareTo(plan.getRpmntDate()) >= 0) {
                    currentRepaymentPlan = plan;
                }
            }
        }
        return currentRepaymentPlan;
    }

    public List<LnRpmntPlan> sortRepaymentPlan(List<LnRpmntPlan> plans) {
        List<LnRpmntPlan> listPlans = new ArrayList<LnRpmntPlan>();
        for (LnRpmntPlan plan : plans) {
            listPlans.add(plan);
        }
        Collections.sort(listPlans, new Comparator<LnRpmntPlan>() {
            @Override
            public int compare(LnRpmntPlan o1, LnRpmntPlan o2) {
                return o1.getPeriodNum().compareTo(o2.getPeriodNum());
            }
        });

        return listPlans;
    }

//    /**
//     * 计算逾期费用
//     */
//    private List<LfReciv> calculateOverduce(List<LfReciv> receivables, ReceivableContext ctx) {
//        return calculateOverduce(receivables, ctx, false);
//    }

//    /**
//     * 计算逾期费用
//     */
//    private List<LfReciv> calculateOverduce(List<LfReciv> receivables, ReceivableContext ctx, boolean isNoNeedCalculateFeedDetail) {
//        List<LfReciv> sortedReceivables = this.sortReceivable(receivables);
//        Date lastestActualRepaymentDate = null;
//        if (ctx.getPayment().getId() != null) {
//            lastestActualRepaymentDate = this.repaymentRepo.getPerviousRepaymentDate(ctx.getPayment().getId(),ctx.getPayment().getId());
//        } else {
//            lastestActualRepaymentDate = this.repaymentRepo.getLastRepaymentDate(ctx.getPayment().getId());
//        }
//
//        for (LfReciv rec : sortedReceivables) {
//            if (LfReciv.STATUS_PAID.equals(rec.getStatus())) {
//                continue;
//            }
//
//            if (rec.getMaxRpmntDate().compareTo(ctx.getRepaymentDate()) < 0) {
//                rec.setIsOverdue("Y");
//            } else {
//                rec.setIsOverdue("N");
//            }
//
//            Date addNewStartDate = null;
//            if (lastestActualRepaymentDate != null && lastestActualRepaymentDate.compareTo(rec.getMaxRpmntDate()) > 0) {
//                addNewStartDate = lastestActualRepaymentDate;
//            } else {//最后实际还款日期 <= 应收的最大还款日期的时候，取‘应收的应还款日期’
//                addNewStartDate = rec.getRpmntDate();
//            }
//
//            boolean needCalculate = false;
//            if ((ctx.getRepaymentDate().compareTo(addNewStartDate) > 0) && (rec.getMaxRpmntDate().compareTo(ctx.getRepaymentDate()) < 0)) {
//                needCalculate = true;
//            }
//
//            if (needCalculate) {
//                lastestActualRepaymentDate = ctx.getRepaymentDate();
//                //1.计算当前剩余本金
//                BigDecimal remainderAmount = this.calculateRemainderPrincipal(receivables, ctx.getPayment());
//                //2.计算之前已经算好并且已经确定的逾期违约金
//                BigDecimal proviousOverDuaAmount = BigDecimal.ZERO;
//                Set<LfRecivFeeDtl> feeDetails = rec.getReceivableFeeDetails();
//                if (feeDetails != null && feeDetails.size() > 0) {
//                    for (LfRecivFeeDtl feeDtl : feeDetails) {
//                        if (feeDtl.getLedgerCode().equals(LfRecivFeeDtl.OVERDUE_INTEREST)) {
//                            proviousOverDuaAmount = proviousOverDuaAmount.add(feeDtl.getAmt());
//                        }
//                    }
//                }
//
//                //3.计算 amount -->逾期违约金=当前剩余本金 * 0.001 * 逾期天数--> 小数位处理：逾期违约金保留整数，强制进位;其它金额保留2位小数，四舍五入
//                DateMidnight startDate = new DateTime(addNewStartDate).toDateMidnight();
//                DateMidnight endDate = new DateTime(ctx.getRepaymentDate()).toDateMidnight();
//                int overdueDay = new Period(startDate, endDate, PeriodType.days()).getDays();
//
//                ReceivableCalculateContext calculateCtx = new ReceivableCalculateContext(ctx, rec.getPeriodNum());
//                calculateCtx.setOverdueDay(overdueDay);
//                calculateCtx.setRemainderAmount(remainderAmount);
//                ReceivableCalculateResult calResult = this.calculateFee(calculateCtx, LfRecivFeeDtl.OVERDUE_INTEREST);
//                BigDecimal overDueAmount = calResult.getCalculateAmt();
//                BigDecimal overdueRate = calResult.getCalculateRate();
//
////                ctx.setOverdueDays(overdueDay);
////                ctx.setRemindPrincipal(remainderAmount);
//
//                //************计算应收明细中逾期违约金应收总数****************
////                ReceivableDetail targetDtl = null;
////                for (ReceivableDetail dtl : rec.getReceivableDetails()) {
////                    if (dtl.getLedgerTypeCode().equals(LedgerTypeCode.OVERDUE_INTEREST)) {
////                        targetDtl = dtl;
////                        break;
////                    }
////                }
////                if (targetDtl == null) {
////                    targetDtl = new ReceivableDetail();
////                    rec.getReceivableDetails().add(targetDtl);
////                    targetDtl.setLedgerTypeCode(LedgerTypeCode.OVERDUE_INTEREST);
////                    targetDtl.setReceivable(rec);
////                    targetDtl.setReceivableId(rec.getId());
////                    targetDtl.setReceivableAmount(BigDecimal.ZERO);
////                }
//                BigDecimal totalOverDueAmount = overDueAmount.add(proviousOverDuaAmount);
////                targetDtl.setReceivableAmount(totalOverDueAmount);
//
//                //************计算应收总数****************
//                BigDecimal totalRecivableAmount = BigDecimal.ZERO;
//                for (LfRecivDtl dtl : rec.getReceivableDetails()) {
//                    totalRecivableAmount = totalRecivableAmount.add(dtl.getRecivAmt());
//                }
//                rec.setTtlRecivAmt(totalRecivableAmount);
//
////                if (isNoNeedCalculateFeedDetail == false) {//发起重扣是不需要保存feed detail，因为在入账的时候才需要
////                    //增加ReceivableFeed Detail
////                    ReceivableFeeDetail feeDetail = new ReceivableFeeDetail();
////                    feeDetail.setLedgerTypeCode(LedgerTypeCode.OVERDUE_INTEREST);
////                    feeDetail.setReceivable(rec);
////                    feeDetail.setReceivableId(rec.getId());
////                    feeDetail.setCalcTime(new Date());
////                    feeDetail.setStartDate(addNewStartDate);
////                    feeDetail.setEndDate(ctx.getRepaymentDate());
////                    feeDetail.setAmount(overDueAmount);
////                    feeDetail.setBaseValue(remainderAmount);
////                    feeDetail.setRate(overdueRate);
////                    rec.getReceivableFeeDetails().add(feeDetail);
////                }
//            } else {
//                LfRecivDtl targetDtl = null;
//                for (LfRecivDtl dtl : rec.getReceivableDetails()) {
//                    if (dtl.getLedgerCode().equals(LfRecivFeeDtl.OVERDUE_INTEREST)) {
//                        targetDtl = dtl;
//                        break;
//                    }
//                }
//                if (targetDtl != null) {
//                    //<1>把之前的逾期利息费用进行相加
//                    BigDecimal proviousOverDuaAmount = BigDecimal.ZERO;
//                    Set<LfRecivFeeDtl> feeDetails = rec.getReceivableFeeDetails();
//                    if (feeDetails != null && feeDetails.size() > 0) {
//                        for (LfRecivFeeDtl feeDtl : feeDetails) {
//                            if (feeDtl.getLedgerCode().equals(LfRecivFeeDtl.OVERDUE_INTEREST)) {
//                                proviousOverDuaAmount = proviousOverDuaAmount.add(feeDtl.getAmt());
//                            }
//                        }
//                    }
//                    targetDtl.setRecivAmt(proviousOverDuaAmount);
//
//                    //<2)重新计算应收总额
//                    BigDecimal totalRecivableAmount = BigDecimal.ZERO;
//                    for (LfRecivDtl dtl : rec.getReceivableDetails()) {
//                        totalRecivableAmount = totalRecivableAmount.add(dtl.getRecivAmt());
//                    }
//                    rec.setTtlRecivAmt(totalRecivableAmount);
//                }
//
//            }
//        }
//
//        List<LfReciv> setCalculatedRecs = new ArrayList<>();
//        setCalculatedRecs.addAll(sortedReceivables);
//        return setCalculatedRecs;
//    }
//
//    /**
//     * 计算剩余本金
//     * @param receivables 所有该贷款申请中的应收记录.
//     * @param payment 放款
//     * @return remainderAmount 剩余本金
//     */
//    private BigDecimal calculateRemainderPrincipal(List<LfReciv> receivables, LnPayment payment) {
//        //计算剩余本金
//        BigDecimal sumPayedAmount = BigDecimal.ZERO;
//        for (LfReciv r : receivables) {
//            if (r.getReceivableDetails() != null && r.getReceivableDetails().size() > 0) {
//                for (LfRecivDtl detail : r.getReceivableDetails()) {
//                    if (detail.getLedgerCode().equals(LfRecivDtl.CODE_PRINCIPAL)) {
//                        sumPayedAmount = sumPayedAmount.add(detail.getActualAmt());
//                    }
//                }
//            }
//        }
//        if (payment.getPayAmt() == null) {
//            logger.error("pay amount is null->payment id is :" + payment.getId());
//            throw new RuntimeException("pay amount is null->payment id is :" + payment.getId());
//        }
//        BigDecimal remainderAmount = payment.getPayAmt().subtract(sumPayedAmount);
//        return remainderAmount;
//    }

    private List<LfReciv> sortReceivable(List<LfReciv> receivables) {
        List<LfReciv> listReceivables = new ArrayList<LfReciv>();
        for (LfReciv rec : receivables) {
            listReceivables.add(rec);
        }
        Collections.sort(listReceivables, new Comparator<LfReciv>() {
            @Override
            public int compare(LfReciv o1, LfReciv o2) {
                return o1.getPeriodNum().compareTo(o2.getPeriodNum());
            }
        });

        return listReceivables;
    }

//    public ReceivableCalculateResult calculateFee(ReceivableCalculateContext ctx, String ledgerCode) {
//        BigDecimal feeRate = null;
//        BigDecimal feeAmount = null;
//
//        if(LfRecivFeeDtl.OVERDUE_INTEREST.equals(ledgerCode)){
//            //计算逾期利息
//            feeAmount = BigDecimal.ZERO;
//            ProductFeeCalculateDto feeDto = this.getFeeRate(ctx.getReceivableCtx().getChargeSchema(), ctx.getReceivableCtx().getContract(),ctx.getPeriodNumber(), ledgerCode);
//            feeRate = feeDto.getValue();
//            if (feeDto.getValueType() == ValueType.PERCENTAGE) {
//                if(feeDto.getCalMethod() == CalcMethod.OVERDUE_INTEREST_BASE_REMIND_PRINCIPAL){
//                    feeAmount = ctx.getRemainderAmount().multiply(new BigDecimal(ctx.getOverdueDay())).multiply(feeRate).setScale(0, RoundingMode.UP);
//                }else if(feeDto.getCalMethod() == CalcMethod.OVERDUE_INTEREST_BASE_LOAN_AMT){
//                    feeAmount = ctx.getReceivableCtx().getContract().getLoanAmount().multiply(new BigDecimal(ctx.getOverdueDay())).multiply(feeRate).setScale(0, RoundingMode.UP);
//                }
//            } else if (feeDto.getValueType() == ValueType.FIXED) {
//                feeAmount = feeRate.multiply(new BigDecimal(ctx.getOverdueDay())).setScale(0, RoundingMode.UP);
//            }
//
//        }else if(LedgerTypeCode.PENALTY.equals(ledgerCode)){
//            //计算违约金 -->违约金 = 贷款金额 * 违约金比率（已还期数小于6 则为 2% ，大于等于6则为3%）
//            feeAmount = BigDecimal.ZERO;
//            feeRate = BigDecimal.ZERO;
//            if (ctx.getReceivableCtx().isIsRenewLoanOperate() && ctx.getReceivableCtx().getRenewLoanPenaltyRate() != null) {
//                //计算违约金--续贷
//                feeRate = ctx.getReceivableCtx().getRenewLoanPenaltyRate();
//                feeAmount = ctx.getReceivableCtx().getPayment().getPayAmount().multiply(feeRate);
//            } else {
//                //2014-1-10 ，核销用户的违约金要改成跟提交结清一致
//                //            if(ctx.getPayment().getIsWriteOff()){
//                //                panaltyRate = BigDecimal.ZERO;
//                //            }
//
//                //提前结清-违约金
//                ValueType valueType = null;
//                if (ctx.getReceivableCtx().getContract().getLoanPeriod().compareTo(ctx.getFirstNonePaidRec().getPeriodNumber()) == 0
//                        || ctx.getReceivableCtx().getRepaymentDate().compareTo(ctx.getReceivableCtx().getPayment().getEndDate()) > 0) {
//                    //<1>.如果客户是在最后一期提前还款的，提前还款违约金应该是0,
//                    //例如客户A贷款总期数为12期，当前已还期数为11期时，该客户提前结清，这种情况下，不收违约金的。
//                    //<2>.#178,还款日期大于贷款的结束日期时提前结清操作，是不算违约金
//                    feeRate = BigDecimal.ZERO;
//                    valueType = ValueType.PERCENTAGE;
//                } else {
//                    //用当前应还期数来获取违约金费率 而不是第一期未还清的期数
//                    ProductFeeCalculateDto feeDto = this.getFeeRate(ctx.getReceivableCtx().getChargeSchema(), ctx.getReceivableCtx().getContract(), ctx.getPeriodNumber(), ledgerCode);
//                    feeRate = feeDto.getValue();
//                    valueType = feeDto.getValueType();
//                }
//                if (valueType == ValueType.PERCENTAGE) {
//                    feeAmount = ctx.getReceivableCtx().getPayment().getPayAmount().multiply(feeRate);
//                } else if (valueType == ValueType.FIXED) {
//                    feeAmount = feeRate;
//                }
//            }
//        }else if(LedgerTypeCode.FAIL_COLLECT_FEE.equals(ledgerCode)){
//            feeAmount = BigDecimal.ZERO;
//            ProductFeeCalculateDto feeDto = this.getFeeRate(ctx.getReceivableCtx().getChargeSchema(), ctx.getReceivableCtx().getContract(), ctx.getPeriodNumber(), ledgerCode);
//            if(feeDto != null && feeDto.getValue().signum() > 0){
//                feeAmount = feeDto.getValue();
//            }
//        }
//
//        return new ReceivableCalculateResult(feeAmount, feeRate);
//    }
//
//
//    public ProductFeeCalculateDto getFeeRate(ChargeSchema product, Contract contract, int currentPeriod, final String ledgerCode) {
//        ProductFee productFee = product.getProductFee(ledgerCode);
//        if (productFee == null) {
//            String errMsg = "can't not find the product feed of ledgeTypeCode is :" + ledgerCode + ", and product id is :" + product.getId();
//            logger.error(errMsg);
//            throw new SystemErrorException(ErrorCode.SYS_ERR, errMsg);
//        }
//        BigDecimal value = null;
//        long baseValue = -1L;
//        if (productFee.getBaseValue() == CalcBaseValue.AMT) {
//            baseValue = contract.getLoanAmount().longValue();
//        } else if (productFee.getBaseValue() == CalcBaseValue.PERIOD) {
//            baseValue = contract.getLoanPeriod();
//        } else if (productFee.getBaseValue() == CalcBaseValue.REPAID_PERIOD) {
//            baseValue = currentPeriod - 1;
//        } else if (productFee.getBaseValue() == CalcBaseValue.REMAIN_PERIOD) {
//            baseValue = contract.getLoanPeriod() - currentPeriod + 1;
//        }
//        for (ProductFeeDetail detail : productFee.getProductFeeDetails()) {
//            if (baseValue == -1L) { //only one record.
//                value = detail.getValue();
//                break;
//            } else {
//                if (baseValue > detail.getFromValue() && baseValue <= detail.getToValue()) {
//                    value = detail.getValue();
//                    break;
//                }
//            }
//        }
//        if (value == null) {
//            throw new SystemErrorException(ErrorCode.SYS_ERR, ledgerCode + " is not found or it is defined in product " + product.getSchemaCode());
//        }
//
//        ProductFeeCalculateDto dto = new ProductFeeCalculateDto();
//        dto.setValueType(productFee.getValueType());
//        dto.setValue(value);
//        dto.setCalMethod(productFee.getCalcMethod());
//        return dto;
//    }

}
