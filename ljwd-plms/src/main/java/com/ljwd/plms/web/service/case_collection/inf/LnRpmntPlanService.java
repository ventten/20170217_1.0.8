package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.web.model.case_collection.LnRpmntPlan;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlanExample;

import java.math.BigDecimal;
import java.util.List;

/**
 * 贷款还款计划信息,用于记录贷款还款计划信息,LN_RPMNT_PLAN
 * */
public interface LnRpmntPlanService {

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<LnRpmntPlan> selectByExample(LnRpmntPlanExample example);

    /**
     * 根据借款ID查询后每期期款
     * @param applId 借款ID
     * @return 后每期期款
     */
    BigDecimal selectSecondAmtByApplId(Long applId);

}
