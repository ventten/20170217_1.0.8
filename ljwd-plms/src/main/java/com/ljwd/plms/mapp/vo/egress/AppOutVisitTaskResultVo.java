package com.ljwd.plms.mapp.vo.egress;

import java.util.ArrayList;
import java.util.List;

/**
 * 联金催收APP所用外访数据集-任务列表
 */
public class AppOutVisitTaskResultVo {

    private Long   applId;                                                    // 贷款申请ID
    private String custName;                                                  // 主贷人
    private Long   custId;                                                    // 主贷人ID
    private List<AppOutVisitTaskPlanResultVo> planResult = new ArrayList<>(); // 任务计划集合

    public Long getApplId() {
        return applId;
    }

    public AppOutVisitTaskResultVo setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public AppOutVisitTaskResultVo setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public Long getCustId() {
        return custId;
    }

    public AppOutVisitTaskResultVo setCustId(Long custId) {
        this.custId = custId;
        return this;
    }

    public List<AppOutVisitTaskPlanResultVo> getPlanResult() {
        return planResult;
    }

    public AppOutVisitTaskResultVo setPlanResult(List<AppOutVisitTaskPlanResultVo> planResult) {
        this.planResult = planResult;
        return this;
    }
}
