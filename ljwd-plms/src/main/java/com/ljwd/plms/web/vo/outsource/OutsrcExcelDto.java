package com.ljwd.plms.web.vo.outsource;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/10
 * 委外申请导出Excel的Dto,字段顺序有要求
 */
public class OutsrcExcelDto{

    private Long rowNo;                     //行号
    private String regionName;              //区域名称
    private String cntrctNo;                //合同编号
    private String custName;                //主贷人姓名
    private String idCardNo;                //主贷人身份证号
    private String outsrcTypeText;          //外包类型:一手,二手
    private String outsrcComName;           //外包公司名称
    private String startDateFmt;            //委外日期/申请日期
    private String endDateFmt;              //退案日期
    private String acutalEndDateFmt;        //实际退案日期
    private String statusText;              //委外状态
    private Integer overDay;                //逾期天数,列表页显示用(已审批、已结案取申请表的字段,其他取实时计算)
    private String feeRateFmt;              //委外费率格式化
    private BigDecimal recivAmt;            //委外金额
    private String winfoStatusText;         //工作流状态/贷款状态
    private BigDecimal residueAmount;       //剩余本金
    private Integer outsrcCount;            //外包次数
    private String outsrcInterval;          //委外区间：60天内，61-90天，91-120天，121-180天，181-360天，361-720天，721天以上
    private String bizCategoryText;         //业务类型显示值
    private String loanDateFmt;             //放款时间/贷款日期
    private BigDecimal loanAmt;             //贷款金额
    private Integer loanPeriod;             //贷款期数
    private String siteName;                //签约网点/所属分行
    private Date createTime;                //申请委外日期
    private String submittedName;           //提交人姓名
    private String createName;              //申请人姓名

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
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

    public String getOutsrcTypeText() {
        return outsrcTypeText;
    }

    public void setOutsrcTypeText(String outsrcTypeText) {
        this.outsrcTypeText = outsrcTypeText;
    }

    public String getOutsrcComName() {
        return outsrcComName;
    }

    public void setOutsrcComName(String outsrcComName) {
        this.outsrcComName = outsrcComName;
    }

    public String getStartDateFmt() {
        return startDateFmt;
    }

    public void setStartDateFmt(String startDateFmt) {
        this.startDateFmt = startDateFmt;
    }

    public String getEndDateFmt() {
        return endDateFmt;
    }

    public void setEndDateFmt(String endDateFmt) {
        this.endDateFmt = endDateFmt;
    }

    public String getAcutalEndDateFmt() {
        return acutalEndDateFmt;
    }

    public void setAcutalEndDateFmt(String acutalEndDateFmt) {
        this.acutalEndDateFmt = acutalEndDateFmt;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public Integer getOverDay() {
        return overDay;
    }

    public void setOverDay(Integer overDay) {
        this.overDay = overDay;
    }

    public String getFeeRateFmt() {
        return feeRateFmt;
    }

    public void setFeeRateFmt(String feeRateFmt) {
        this.feeRateFmt = feeRateFmt;
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public String getWinfoStatusText() {
        return winfoStatusText;
    }

    public void setWinfoStatusText(String winfoStatusText) {
        this.winfoStatusText = winfoStatusText;
    }

    public BigDecimal getResidueAmount() {
        return residueAmount;
    }

    public void setResidueAmount(BigDecimal residueAmount) {
        this.residueAmount = residueAmount;
    }

    public Integer getOutsrcCount() {
        return outsrcCount;
    }

    public void setOutsrcCount(Integer outsrcCount) {
        this.outsrcCount = outsrcCount;
    }

    public String getOutsrcInterval() {
        return outsrcInterval;
    }

    public void setOutsrcInterval(String outsrcInterval) {
        this.outsrcInterval = outsrcInterval;
    }

    public String getBizCategoryText() {
        return bizCategoryText;
    }

    public void setBizCategoryText(String bizCategoryText) {
        this.bizCategoryText = bizCategoryText;
    }

    public String getLoanDateFmt() {
        return loanDateFmt;
    }

    public void setLoanDateFmt(String loanDateFmt) {
        this.loanDateFmt = loanDateFmt;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSubmittedName() {
        return submittedName;
    }

    public void setSubmittedName(String submittedName) {
        this.submittedName = submittedName;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }
}
