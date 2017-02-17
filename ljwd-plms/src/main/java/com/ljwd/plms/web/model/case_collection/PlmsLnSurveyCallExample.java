package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseExample;

import java.util.Date;

/**
 * 呼叫记录表,PLMS_LN_SURVEY_CALL
 * */
public class PlmsLnSurveyCallExample extends BaseExample{

    private Long id;                        //记录ID
    private Long applyId;                   //借款申请ID
    private Long recVer;                    //版本号
    private String contractno;              //合同编号
    private String loanname;                //主贷人
    private String idcard;                  //证件号码
    private Integer maxDays;                //日期最大查询范围天数
    private Date createTimeMin;             //新增日期/呼叫日期
    private Date createTimeMax;             //新增日期/呼叫日期

    public Date getCreateTimeMin() {
        return createTimeMin;
    }

    public PlmsLnSurveyCallExample setCreateTimeMin(Date createTimeMin) {
        this.createTimeMin = createTimeMin;
        return this;
    }

    public Date getCreateTimeMax() {
        return createTimeMax;
    }

    public PlmsLnSurveyCallExample setCreateTimeMax(Date createTimeMax) {
        this.createTimeMax = createTimeMax;
        return this;
    }

    public Long getId() {
        return id;
    }

    public PlmsLnSurveyCallExample setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplyId() {
        return applyId;
    }

    public PlmsLnSurveyCallExample setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }

    public Long getRecVer() {
        return recVer;
    }

    public PlmsLnSurveyCallExample setRecVer(Long recVer) {
        this.recVer = recVer;
        return this;
    }

    public String getContractno() {
        return contractno;
    }

    public PlmsLnSurveyCallExample setContractno(String contractno) {
        this.contractno = (contractno == null || "".equals(contractno) || "".equals(contractno.trim())) ? null : contractno.trim();
        return this;
    }

    public String getLoanname() {
        return loanname;
    }

    public PlmsLnSurveyCallExample setLoanname(String loanname) {
        this.loanname = (loanname == null || "".equals(loanname) || "".equals(loanname.trim())) ? null : loanname.trim();
        return this;
    }

    public String getIdcard() {
        return idcard;
    }

    public PlmsLnSurveyCallExample setIdcard(String idcard) {
        this.idcard = (idcard == null || "".equals(idcard) || "".equals(idcard.trim())) ? null : idcard.trim();
        return this;
    }

    public Integer getMaxDays() {
        return maxDays;
    }

    public PlmsLnSurveyCallExample setMaxDays(Integer maxDays) {
        this.maxDays = maxDays;
        return this;
    }
}