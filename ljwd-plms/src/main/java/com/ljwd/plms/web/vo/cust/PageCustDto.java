package com.ljwd.plms.web.vo.cust;

import com.ljwd.plms.web.vo.PageRowNo;

/**
 * Created by zhengzw on 2016/11/28
 * 客户信息主页Dto
 */
public class PageCustDto extends PageRowNo {

    private Long id;                //记录id
    private String docno;           //证件号码
    private String custName;        //姓名
    private Integer validCount;     //有效合同数
    private Integer transitCount;   //在途合同数
    private Integer applCount;      //申请次数
    private Integer rejectCount;    //审批拒绝数
    private Integer overCount;      //逾期次数
    private Integer overDays;       //累计逾期天数

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Integer getValidCount() {
        return validCount;
    }

    public void setValidCount(Integer validCount) {
        this.validCount = validCount;
    }

    public Integer getTransitCount() {
        return transitCount;
    }

    public void setTransitCount(Integer transitCount) {
        this.transitCount = transitCount;
    }

    public Integer getApplCount() {
        return applCount;
    }

    public void setApplCount(Integer applCount) {
        this.applCount = applCount;
    }

    public Integer getRejectCount() {
        return rejectCount;
    }

    public void setRejectCount(Integer rejectCount) {
        this.rejectCount = rejectCount;
    }

    public Integer getOverCount() {
        return overCount;
    }

    public void setOverCount(Integer overCount) {
        this.overCount = overCount;
    }

    public Integer getOverDays() {
        return overDays;
    }

    public void setOverDays(Integer overDays) {
        this.overDays = overDays;
    }

}
