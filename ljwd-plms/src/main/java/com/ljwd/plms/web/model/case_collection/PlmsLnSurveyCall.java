package com.ljwd.plms.web.model.case_collection;

import com.ljwd.plms.web.model.BaseModel;

import java.util.Date;

/**
 * 呼叫记录表,PLMS_LN_SURVEY_CALL
 * */
public class PlmsLnSurveyCall extends BaseModel{
    
    private Long id;                        //记录ID
    private Long applyId;                   //借款申请ID
    private String loanname;                //主贷人
    private String idcard;                  //证件号码
    private String contractno;              //合同编号
    private String callType;                //通话类型:1-呼出、2-呼入
    private String callStart;               //通话开始时间
    private Date callDate;                  //通话日期
    private String callLong;                //通话时长
    private String phone;                   //手机或电话
    private String relation;                //关系
    private String callBy;                  //被呼叫人姓名
    private String callLog;                 //录音文件Url
    private String uniqueid;                //录音关联ID
    private String score;                   //评分
    private String callFrom;                //分机号
    private String deptype;                 //部门:surveyCall-电核 collect-贷后催收
    private String creatusername;           //创建人姓名
    private String cloudcallStatus;         //呼叫状态
    private String cloudcallUniquedid;      //云呼叫录音文件ID
    private Integer phoneSource;            //被呼叫号码来源:1-联系人资料,2-聚信立

    //join-ext
    private String relationVal;             //关系-显示值

    //text-ext
    private String deptypeText;             //部门-显示值
    private String cloudcallStatusText;     //呼叫状态-显示值

    public String getDeptypeText() {
        if(this.deptype == null){
            return "";
        }else if("collect".equals(deptype)){
            return "贷后催收";
        }else if("surveyCall".equals(deptype)){
            return "电核";
        }else {
            return "";
        }
    }

    public String getCloudcallStatusText() {
        if(cloudcallStatus == null || cloudcallStatus.isEmpty()){
            return "";
        }else if("0".equals(cloudcallStatus)){
            return "呼叫请求成功";
        }else if("1".equals(cloudcallStatus)){
            return "呼叫座席失败";
        }else if("2".equals(cloudcallStatus)){
            return "参数不正确";
        }else if("3".equals(cloudcallStatus)){
            return "用户验证没有通过";
        }else if("4".equals(cloudcallStatus)){
            return "账号被停用";
        }else if("5".equals(cloudcallStatus)){
            return "资费不足";
        }else if("6".equals(cloudcallStatus)){
            return "指定的业务尚未开通";
        }else if("7".equals(cloudcallStatus)){
            return "电话号码不正确";
        }else if("8".equals(cloudcallStatus)){
            return "座席工号（cno）不存在";
        }else if("9".equals(cloudcallStatus)){
            return "未登录或忙";
        }else if("10".equals(cloudcallStatus)){
            return "其他错误";
        }else if("11".equals(cloudcallStatus)){
            return "电话号码为黑名单";
        }else if("12".equals(cloudcallStatus)){
            return "座席不在线";
        }else if("13".equals(cloudcallStatus)){
            return "座席正在通话/呼叫中";
        }else if("14".equals(cloudcallStatus)){
            return "外显号码不正确";
        }else if("15".equals(cloudcallStatus)){
            return "接通";
        }else if("16".equals(cloudcallStatus)){
            return "失败";
        }else if("17".equals(cloudcallStatus)){
            return "未接通";
        }else if("BUSY".equals(cloudcallStatus)){
            return "繁忙";
        }else {
            return "";
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanname() {
        return loanname;
    }

    public void setLoanname(String loanname) {
        this.loanname = loanname == null ? null : loanname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public String getCallStart() {
        return callStart;
    }

    public void setCallStart(String callStart) {
        this.callStart = callStart == null ? null : callStart.trim();
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public String getCallLong() {
        return callLong;
    }

    public void setCallLong(String callLong) {
        this.callLong = callLong == null ? null : callLong.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getCallBy() {
        return callBy;
    }

    public void setCallBy(String callBy) {
        this.callBy = callBy == null ? null : callBy.trim();
    }

    public String getCallLog() {
        return callLog;
    }

    public void setCallLog(String callLog) {
        this.callLog = callLog == null ? null : callLog.trim();
    }

    public String getUniqueid() {
        return uniqueid;
    }

    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid == null ? null : uniqueid.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getCallFrom() {
        return callFrom;
    }

    public void setCallFrom(String callFrom) {
        this.callFrom = callFrom == null ? null : callFrom.trim();
    }

    public String getDeptype() {
        return deptype;
    }

    public void setDeptype(String deptype) {
        this.deptype = deptype == null ? null : deptype.trim();
    }

    public String getCreatusername() {
        return creatusername;
    }

    public void setCreatusername(String creatusername) {
        this.creatusername = creatusername == null ? null : creatusername.trim();
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public String getCloudcallStatus() {
        return cloudcallStatus;
    }

    public void setCloudcallStatus(String cloudcallStatus) {
        this.cloudcallStatus = cloudcallStatus == null ? null : cloudcallStatus.trim();
    }

    public String getCloudcallUniquedid() {
        return cloudcallUniquedid;
    }

    public void setCloudcallUniquedid(String cloudcallUniquedid) {
        this.cloudcallUniquedid = cloudcallUniquedid == null ? null : cloudcallUniquedid.trim();
    }

    public String getRelationVal() {
        return relationVal;
    }

    public void setRelationVal(String relationVal) {
        this.relationVal = relationVal;
    }

    public Integer getPhoneSource() {
        return phoneSource;
    }

    public void setPhoneSource(Integer phoneSource) {
        this.phoneSource = phoneSource;
    }
}