package com.ljwd.plms.web.enums;

public enum CalcMethod {
    /**
     * 每期计算
     */
    CALC_PER_PERIOD,
    /**
     * 代扣失败
     */
    FAIL_COLLECT,
    /**
     * 一次性计算基于总贷款金额
     */
    ONE_OFF_BASE_TTL_AMT,

    /**
     * 一次性计算基于审批金额
     */
    ONE_OFF_BASE_APPROVED_AMT,

    /**
     * 一次性计算,固定金额
     */
    ONE_OFF_FIX_AMT,
    /**
     * 逾期利息计算基于剩余本金
     */
    OVERDUE_INTEREST_BASE_REMIND_PRINCIPAL,
     /**
     * 逾期利息计算基于合同金额
     */
    OVERDUE_INTEREST_BASE_LOAN_AMT,
    /**
     * 违约计算
     */
    PENALTY,

    /**
     * 表达式
     */
    EXPRESSION,

    /**
     * 一次性计算，基于天数
     */
    ONE_OFF_BASE_DAY,   

}
