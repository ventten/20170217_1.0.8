package com.ljwd.plms.mapp.vo.egress;

/**
 * 联金催收APP所用外访数据集-任务列表-任务计划集合
 * Created by tangjialin on 2016-11-09 0009.
 */
public class AppOutVisitTaskPlanResultVo {
    private Long   id;       // 外访计划主键
    private String address;  // 外访地址
    private String planCode; // 外访计划编号

    public Long getId() {
        return id;
    }

    public AppOutVisitTaskPlanResultVo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AppOutVisitTaskPlanResultVo setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPlanCode() {
        return planCode;
    }

    public AppOutVisitTaskPlanResultVo setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

}