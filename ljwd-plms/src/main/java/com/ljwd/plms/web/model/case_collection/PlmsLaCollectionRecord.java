package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 催收记录表,PLMS_LA_COLLECTION_RECORD
 * */
public class PlmsLaCollectionRecord extends BaseModel{

    private Long id;                        //记录ID
    private Long applId;                    //借款申请id
    private Long periodNum;                 //逾期期数
    private Date collectTime;               //催收时间
    private String followedBy;              //跟进人姓名
    private Date inputTime;                 //录入时间
    private String collectMthd;             //催收类型
    private String result;                  //催收代码/跟进结果
    private String content;                 //内容
    private String abnormityCode;           //个案情况
    private String controlStatus;           //控管状态
    private String status;                  //跟进情况
    private Date rpmntDate;                 //承诺还款时间
    private BigDecimal rpmntAmt;            //承诺还款金额
    private String rltn;                    //关系
    private String contactor;               //联系人
    private String tel;                     //联系电话

    //join-ext
    private String collectMthdText;         //催收类型-显示值
    private String statusText;              //跟进情况-显示值
    private String resultText;              //催收代码-显示值
    private String controlStatusText;       //控管状态-显示值
    private String abnormityCodeText;       //个案情况-显示值
    private String rltnText;                //关系-显示值

    private Integer tableType;              //表类型,分页查询用：1-LA_COLLECT_REC（微贷旧催记）、2-PLMS_LA_COLLECTION_RECORD

    private BigDecimal repaymentAmount;     //已入账总额

    //text-ext
    private String rpmntDateFmt;            //承诺还款时间-格式化

    public String getRpmntDateFmt() {
        return D.parse(rpmntDate);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public String getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(String followedBy) {
        this.followedBy = followedBy == null ? null : followedBy.trim();
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getCollectMthd() {
        return collectMthd;
    }

    public void setCollectMthd(String collectMthd) {
        this.collectMthd = collectMthd == null ? null : collectMthd.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAbnormityCode() {
        return abnormityCode;
    }

    public void setAbnormityCode(String abnormityCode) {
        this.abnormityCode = abnormityCode == null ? null : abnormityCode.trim();
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus == null ? null : controlStatus.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getRpmntDate() {
        return rpmntDate;
    }

    public void setRpmntDate(Date rpmntDate) {
        this.rpmntDate = rpmntDate;
    }

    public BigDecimal getRpmntAmt() {
        return rpmntAmt;
    }

    public void setRpmntAmt(BigDecimal rpmntAmt) {
        this.rpmntAmt = rpmntAmt;
    }

    public String getRltn() {
        return rltn;
    }

    public void setRltn(String rltn) {
        this.rltn = rltn == null ? null : rltn.trim();
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor == null ? null : contactor.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getCollectMthdText() {
        return collectMthdText;
    }

    public void setCollectMthdText(String collectMthdText) {
        this.collectMthdText = collectMthdText;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public String getControlStatusText() {
        return controlStatusText;
    }

    public void setControlStatusText(String controlStatusText) {
        this.controlStatusText = controlStatusText;
    }

    public String getAbnormityCodeText() {
        return abnormityCodeText;
    }

    public void setAbnormityCodeText(String abnormityCodeText) {
        this.abnormityCodeText = abnormityCodeText;
    }

    public String getRltnText() {
        return rltnText;
    }

    public void setRltnText(String rltnText) {
        this.rltnText = rltnText;
    }

    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public void setRpmntDateFmt(String rpmntDateFmt) {
        this.rpmntDateFmt = rpmntDateFmt;
    }

    public Integer getTableType() {
        return tableType;
    }

    public void setTableType(Integer tableType) {
        this.tableType = tableType;
    }

}
