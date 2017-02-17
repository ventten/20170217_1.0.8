package com.ljwd.plms.mapp.vo.egress;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 联金催收APP所用外访数据集
 */
public class AppOutVisitPlanResultVo {

    private Long   id;            // 外访计划主键
    private Long   applId;        // 贷款申请ID
    private String address;       // 外访地址
    private String planCode;      // 外访计划编号
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date   planStartTime; // 外访时间(历史任务中为外访签到表中签到时间)
    private String custName;      // 主贷人
    private Long   custId;        // 主贷人ID

    public Long getId() {
        return id;
    }

    public AppOutVisitPlanResultVo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplId() {
        return applId;
    }

    public AppOutVisitPlanResultVo setApplId(Long applId) {
        this.applId = applId;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AppOutVisitPlanResultVo setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPlanCode() {
        return planCode;
    }

    public AppOutVisitPlanResultVo setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public AppOutVisitPlanResultVo setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
        return this;
    }

    public String getCustName() {
        return custName;
    }

    public AppOutVisitPlanResultVo setCustName(String custName) {
        this.custName = custName;
        return this;
    }

    public Long getCustId() {
        return custId;
    }

    public AppOutVisitPlanResultVo setCustId(Long custId) {
        this.custId = custId;
        return this;
    }
}
