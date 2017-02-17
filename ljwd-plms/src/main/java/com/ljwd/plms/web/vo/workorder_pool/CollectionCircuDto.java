package com.ljwd.plms.web.vo.workorder_pool;

/**
 * Created by zhengzw on 2016/10/14
 * 区间与流转规则Dto
 */
public class CollectionCircuDto {

    private String val;                         //区间值
    private String name;                        //区间名字
    private String status;                      //区间状态值
    private String circuRuleCode;               //区间对应流转规则code
    private Long overduedaysFrom;               //区间对应流转规则逾期天数-起
    private Long overduedaysTo;                 //区间对应流转规则逾期天数-止

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCircuRuleCode() {
        return circuRuleCode;
    }

    public void setCircuRuleCode(String circuRuleCode) {
        this.circuRuleCode = circuRuleCode;
    }

    public Long getOverduedaysFrom() {
        return overduedaysFrom;
    }

    public void setOverduedaysFrom(Long overduedaysFrom) {
        this.overduedaysFrom = overduedaysFrom;
    }

    public Long getOverduedaysTo() {
        return overduedaysTo;
    }

    public void setOverduedaysTo(Long overduedaysTo) {
        this.overduedaysTo = overduedaysTo;
    }

}
