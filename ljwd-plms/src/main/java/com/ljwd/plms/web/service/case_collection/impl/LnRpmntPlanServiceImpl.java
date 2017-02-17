package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.web.dao.case_collection.LnRpmntPlanMapper;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlan;
import com.ljwd.plms.web.model.case_collection.LnRpmntPlanExample;
import com.ljwd.plms.web.service.case_collection.inf.LnRpmntPlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * 贷款还款计划信息,用于记录贷款还款计划信息,LN_RPMNT_PLAN
 * */
@Service
public class LnRpmntPlanServiceImpl implements LnRpmntPlanService {

    @Resource
    private LnRpmntPlanMapper rpmntPlanMapper;

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LnRpmntPlan> selectByExample(LnRpmntPlanExample example) {
        return rpmntPlanMapper.selectByExample(example);
    }

    /**
     * 根据借款ID查询后每期期款
     * @param applId 借款ID
     * @return 后每期期款
     */
    @Override
    public BigDecimal selectSecondAmtByApplId(Long applId) {
        return rpmntPlanMapper.selectSecondAmtByApplId(applId);
    }

}
