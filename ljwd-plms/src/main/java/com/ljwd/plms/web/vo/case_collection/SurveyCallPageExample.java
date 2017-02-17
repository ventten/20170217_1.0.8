package com.ljwd.plms.web.vo.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.util.Date;

/**
 * Created by zhengzw on 2017/01/24
 * 呼叫记录分页查询条件
 * */
public class SurveyCallPageExample extends BaseExample{

    private Long id;                        //记录ID
    private Long applyId;                   //借款申请ID
    private String contractno;              //合同编号
    private String loanname;                //主贷人
    private String idcard;                  //证件号码
    private Integer maxDays;                //日期最大查询范围天数
    private Date createTimeMin;             //新增日期/呼叫日期
    private Date createTimeMax;             //新增日期/呼叫日期

    public Date getCreateTimeMin() {
        return createTimeMin;
    }

    public SurveyCallPageExample setCreateTimeMin(Date createTimeMin) {
        this.createTimeMin = createTimeMin;
        return this;
    }

    public Date getCreateTimeMax() {
        return createTimeMax;
    }

    public SurveyCallPageExample setCreateTimeMax(Date createTimeMax) {
        this.createTimeMax = createTimeMax;
        return this;
    }

    public Long getId() {
        return id;
    }

    public SurveyCallPageExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplyId() {
        return applyId;
    }

    public SurveyCallPageExample setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }

    public String getContractno() {
        return contractno;
    }

    public SurveyCallPageExample setContractno(String contractno) {
        this.contractno = (contractno == null || "".equals(contractno) || "".equals(contractno.trim())) ? null : contractno.trim();
        return this;
    }

    public String getLoanname() {
        return loanname;
    }

    public SurveyCallPageExample setLoanname(String loanname) {
        this.loanname = (loanname == null || "".equals(loanname) || "".equals(loanname.trim())) ? null : loanname.trim();
        return this;
    }

    public String getIdcard() {
        return idcard;
    }

    public SurveyCallPageExample setIdcard(String idcard) {
        this.idcard = (idcard == null || "".equals(idcard) || "".equals(idcard.trim())) ? null : idcard.trim();
        return this;
    }

    public Integer getMaxDays() {
        return maxDays;
    }

    public SurveyCallPageExample setMaxDays(Integer maxDays) {
        this.maxDays = maxDays;
        return this;
    }

}