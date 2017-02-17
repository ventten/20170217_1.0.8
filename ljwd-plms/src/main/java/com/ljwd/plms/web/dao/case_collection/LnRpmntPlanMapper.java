package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.LnRpmntPlan;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlanExample;

import java.math.BigDecimal;
import java.util.List;

/**
 * 贷款还款计划信息,用于记录贷款还款计划信息,LN_RPMNT_PLAN
 * */
public interface LnRpmntPlanMapper {

    int countByExample(LnRpmntPlanExample example);

    List<LnRpmntPlan> selectByExample(LnRpmntPlanExample example);

    LnRpmntPlan selectByPrimaryKey(Long id);

    /**
     * 根据借款ID查询后每期期款
     * @param applId 借款ID
     * @return 后每期期款
     */
    BigDecimal selectSecondAmtByApplId(Long applId);

}