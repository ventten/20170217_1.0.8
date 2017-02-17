package com.ljwd.plms.web.vo.outsource;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.N;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.vo.PageRowNo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/9/30
 * 委外申请分页Dto
 */
public class OutsrcPageDto extends PageRowNo {

    private Long id;                        //记录ID
    private Long paymentId;                 //放款ID
    private Long applId;                    //借款ID
    private Long comId;                     //委外机构ID
    private Long cntrctId;                  //合同ID
    private Date startDate;                 //委外日期
    private Date endDate;                   //预计结案日期
    private Date acutalEndDate;             //实际结案日期
    private BigDecimal feeRate;             //委外费率
    private String outsrcType;              //外包类型:一手,二手
    private BigDecimal recivAmt;            //委外金额
    private String status;                  //委外状态
    private String submittedBy;             //提交人
    private Date submitTime;                //提交时间
    private String approvedBy;              //审批人
    private Date approveTime;               //审批时间
    private String lastExtentedBy;          //延期人
    private Date lastExtentTime;            //延期时间
    private String feedback;                //同行反馈
    private String reason;                  //委外原因
    private String remark;                  //备注
    private String auditBy;                 //审核人
    private Date auditTime;                 //审核时间
    private Date acutalStartDate;           //委外实际开始日期
    private Date createTime;                //申请委外日期
    private Long recVer;                    //版本号
    private String lotNo;                   //批次编号
    private Integer outsrcCount;            //外包次数
    private Long lastComId;                 //上一家委外公司ID
    private Integer overdueDays;            //委外申请表字段保存的逾期天数

    private String submittedName;           //提交人姓名
    private String createName;              //申请人姓名

    private String outsrcComName;           //委外公司名称
    private String lastComName;             //上一家委外公司名称

    private String custName;                //主贷人姓名
    private String idCardNo;                //主贷人身份证号
    private String gender;                  //主贷人性别:MALE-男、FEMALE-女
    private String marriage;                //主贷人婚姻状况：SINGLE-未婚、MARRIED-已婚、DIVORCE-离婚、SEPARATION-分居、WIDOWED-丧偶、OTHER-其它
    private String email;                   //邮箱
    private String spouseName;              //主贷人配偶姓名
    private String spouseIdCardNo;          //主贷人配偶身份证号码

    private String unitName;                //主贷人单位名称(导出委外明细时才有值)
    private String position;                //主贷人职位(导出委外明细时才有值)

    private String cntrctNo;                //合同编号
    private String loanType;                //贷款类别
    private String paymentType;             //放款类别
    private Long prdId;                     //贷款产品ID
    private String prdName;                 //贷款产品名称
    private String bizCategory;             //业务类型
    private Integer loanPeriod;             //贷款期数
    private BigDecimal loanAmt;             //贷款金额
    private Date loanDate;                  //放款时间
    private BigDecimal residueAmount;       //剩余本金
    private Integer paidPeriod;             //已还期数
    private String winfoStatus;             //工作流状态/贷款状态
    private String siteName;                //签约网点/所属分行
    private Long regionId;                  //区域ID
    private String regionName;              //区域名称

    private Integer overDaysNum;            //最小期未还期数的逾期天数
    private Integer overduePeriod;          //最早逾期期数

    private BigDecimal lastRpmntAmt;        //最后一次还款金额
    private Date lastRpmntDate;             //最后一次还款时间

    //ext
    private String startDateFmt;            //委外日期
    private String endDateFmt;              //预计结案日期
    private String acutalEndDateFmt;        //实际结案日期
    private String loanDateFmt;             //贷款日期
    private String statusText;              //委外状态
    private String winfoStatusText;         //贷款状态
    private String outsrcTypeText;          //外包类型:一手,二手
    private Integer overDay;                //逾期天数,列表页显示用(已审批或已结案取申请表的字段,其他取实时计算)
    private String feeRateFmt;              //委外费率格式化
    private String bizCategoryText;         //业务类型显示值
    private String outsrcInterval;          //委外区间：60天内，61-90天，91-120天，121-180天，181-360天，361-720天，721天以上
    private String genderText;              //主贷人性别:MALE-男、FEMALE-女
    private String marriageText;            //主贷人婚姻状况：SINGLE-未婚、MARRIED-已婚、DIVORCE-离婚、SEPARATION-分居、WIDOWED-丧偶、OTHER-其它
    private String lastRpmntDateFmt;        //最后一次还款时间格式化

    public Integer getOverDay() {
        if(PlmsLaApplOutsrc.STATUS_ENDED.equals(status) || PlmsLaApplOutsrc.STATUS_APPROVED.equals(status)){
            return overdueDays;
        }else {
            return overDaysNum;
        }
    }

    public String getOutsrcInterval() {
        Integer overDay = this.getOverDay();
        if(overDay == null){
            return "";
        }else if(overDay <= 60){
            return "60天内";
        }else if(overDay > 60 && overDay <= 90){
            return "61-90天";
        }else if(overDay > 90 && overDay <= 120){
            return "91-120天";
        }else if(overDay > 120 && overDay <= 180){
            return "121-180天";
        }else if(overDay > 180 && overDay <= 360){
            return "181-360天";
        }else if(overDay > 360 && overDay <= 720){
            return "361-720天";
        }else {
            return "721天以上";
        }
    }

    public String getGenderText() {
        if(gender == null){
            return "";
        }else if("MALE".equals(gender)){
            return "男";
        }else if("FEMALE".equals(gender)){
            return "女";
        }
        return "";
    }

    public String getMarriageText() {
        if(gender == null){
            return "";
        }else if("SINGLE".equals(marriage)){
            return "未婚";
        }else if("MARRIED".equals(marriage)){
            return "已婚";
        }else if("DIVORCE".equals(marriage)){
            return "离婚";
        }else if("SEPARATION".equals(marriage)){
            return "分居";
        }else if("WIDOWED".equals(marriage)){
            return "丧偶";
        }else if("OTHER".equals(marriage)){
            return "其它";
        }
        return "";
    }

    public String getBizCategoryText() {
        if(bizCategory == null){
            return "";
        }else if ("NORMAL".equals(bizCategory)){
            return "等本等息";
        }else if ("WHOLE".equals(bizCategory)){
            return "趸缴";
        }else if ("MATURE_PAYMENT".equals(bizCategory)){
            return "平缴";
        }else if ("INT_FIRST_PRIN_LAST".equals(bizCategory)){
            return "先息后本";
        }
        return "";
    }

    public String getOutsrcTypeText() {
        String text = "";
        if(outsrcType == null){
            return text;
        }else if(PlmsLaApplOutsrc.OUT_SRC_TYPE_FIRST.equals(outsrcType)){
            text = "一手";
        }else if(PlmsLaApplOutsrc.OUT_SRC_TYPE_SECOND.equals(outsrcType)){
            text = "二手";
        }
        return text;
    }

    public String getWinfoStatusText() {
        String text = "";
        if(winfoStatus == null){
            return text;
        }else if(LoanStatus.DRAFT.equals(winfoStatus)){
            text = "资料维护";
        }else if(LoanStatus.CANCELLED.equals(winfoStatus)){
            text = "取消";
        }else if(LoanStatus.REJECTED.equals(winfoStatus)){
            text = "拒绝";
        }else if(LoanStatus.VOIDED.equals(winfoStatus)){
            text = "作废";
        }else if(LoanStatus.APPROVING.equals(winfoStatus)){
            text = "贷款审批中";
        }else if(LoanStatus.SIGNING.equals(winfoStatus)){
            text = "合同待签订";
        }else if(LoanStatus.PAYING.equals(winfoStatus)){
            text = "待放款";
        }else if(LoanStatus.REPAYING.equals(winfoStatus)){
            text = "还款中";
        }else if(LoanStatus.CLEAR.equals(winfoStatus)){
            text = "结清";
        }
        return text;
    }

    public String getStatusText() {
        String text = "";
        if(status == null){
            return text;
        }else if(PlmsLaApplOutsrc.STATUS_AUDIT.equals(status)){
            text = "待审核";
        }else if(PlmsLaApplOutsrc.STATUS_AUDIT_REJECT.equals(status)){
            text = "审核拒绝";
        }else if(PlmsLaApplOutsrc.STATUS_DRAFT.equals(status)){
            text = "待提交";
        }else if(PlmsLaApplOutsrc.STATUS_SUBMITTED.equals(status)){
            text = "待审批";
        }else if(PlmsLaApplOutsrc.STATUS_REJECTED.equals(status)){
            text = "审批拒绝";
        }else if(PlmsLaApplOutsrc.STATUS_APPROVED.equals(status)){
            text = "已审批";
        }else if(PlmsLaApplOutsrc.STATUS_ENDED.equals(status)){
            text = "已结案";
        }
        return text;
    }

    public String getFeeRateFmt() {
        return feeRate == null ? "" : N.format(feeRate.multiply(BigDecimal.valueOf(100)).doubleValue()) + "%";
    }

    public String getStartDateFmt() {
        return D.parse(startDate);
    }

    public String getEndDateFmt() {
        return D.parse(endDate);
    }

    public String getAcutalEndDateFmt() {
        return D.parse(acutalEndDate);
    }

    public String getLoanDateFmt() {
        return D.parse(loanDate);
    }

    public String getLastRpmntDateFmt() {
        return D.parse(lastRpmntDate);
    }

    public String getLastComName() {
        return lastComName;
    }

    public void setLastComName(String lastComName) {
        this.lastComName = lastComName;
    }

    public Long getLastComId() {
        return lastComId;
    }

    public void setLastComId(Long lastComId) {
        this.lastComId = lastComId;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Long getCntrctId() {
        return cntrctId;
    }

    public void setCntrctId(Long cntrctId) {
        this.cntrctId = cntrctId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getAcutalEndDate() {
        return acutalEndDate;
    }

    public void setAcutalEndDate(Date acutalEndDate) {
        this.acutalEndDate = acutalEndDate;
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public String getOutsrcType() {
        return outsrcType;
    }

    public void setOutsrcType(String outsrcType) {
        this.outsrcType = outsrcType;
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getLastExtentedBy() {
        return lastExtentedBy;
    }

    public void setLastExtentedBy(String lastExtentedBy) {
        this.lastExtentedBy = lastExtentedBy;
    }

    public Date getLastExtentTime() {
        return lastExtentTime;
    }

    public void setLastExtentTime(Date lastExtentTime) {
        this.lastExtentTime = lastExtentTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getAcutalStartDate() {
        return acutalStartDate;
    }

    public void setAcutalStartDate(Date acutalStartDate) {
        this.acutalStartDate = acutalStartDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getRecVer() {
        return recVer;
    }

    public void setRecVer(Long recVer) {
        this.recVer = recVer;
    }

    public String getSubmittedName() {
        return submittedName;
    }

    public void setSubmittedName(String submittedName) {
        this.submittedName = submittedName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Long getPrdId() {
        return prdId;
    }

    public void setPrdId(Long prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Integer getOverDaysNum() {
        return overDaysNum;
    }

    public void setOverDaysNum(Integer overDaysNum) {
        this.overDaysNum = overDaysNum;
    }

    public BigDecimal getResidueAmount() {
        return residueAmount;
    }

    public void setResidueAmount(BigDecimal residueAmount) {
        this.residueAmount = residueAmount;
    }

    public Integer getPaidPeriod() {
        return paidPeriod;
    }

    public void setPaidPeriod(Integer paidPeriod) {
        this.paidPeriod = paidPeriod;
    }

    public Integer getOutsrcCount() {
        return outsrcCount;
    }

    public void setOutsrcCount(Integer outsrcCount) {
        this.outsrcCount = outsrcCount;
    }

    public String getWinfoStatus() {
        return winfoStatus;
    }

    public void setWinfoStatus(String winfoStatus) {
        this.winfoStatus = winfoStatus;
    }

    public String getOutsrcComName() {
        return outsrcComName;
    }

    public void setOutsrcComName(String outsrcComName) {
        this.outsrcComName = outsrcComName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getBizCategory() {
        return bizCategory;
    }

    public void setBizCategory(String bizCategory) {
        this.bizCategory = bizCategory;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(StringUtil.isEmail(email)){
            this.email = email;
        }
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdCardNo() {
        return spouseIdCardNo;
    }

    public void setSpouseIdCardNo(String spouseIdCardNo) {
        this.spouseIdCardNo = spouseIdCardNo;
    }

    public BigDecimal getLastRpmntAmt() {
        return lastRpmntAmt;
    }

    public void setLastRpmntAmt(BigDecimal lastRpmntAmt) {
        this.lastRpmntAmt = lastRpmntAmt;
    }

    public Date getLastRpmntDate() {
        return lastRpmntDate;
    }

    public void setLastRpmntDate(Date lastRpmntDate) {
        this.lastRpmntDate = lastRpmntDate;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
