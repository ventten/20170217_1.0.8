package com.ljwd.plms.web.vo.outsource;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhengzw on 2017/01/14
 * 导出委外明细Dto,字段顺序有要求
 */
public class OutsrcDetailExcelDto {

    private Long rowNo;                     //序号
    private String custName;                //姓名
    private String cntrctNo;                //合同编号
    private String regionName;              //区域
    private String genderText;              //性别
    private String marriageText;            //婚姻状况
    private String idCardNo;                //证件号码
    private String lastComName;             //上家委外公司
    private String outsrcComName;           //本次委外公司
    private String outsrcTypeText;          //委外类型
    private Integer overDay;                //逾期天数
    private BigDecimal recivAmt;            //委外金额
    private BigDecimal residueAmount;       //剩余本金
    private BigDecimal loanAmt;             //贷款金额
    private Integer loanPeriod;             //贷款期数
    private String loanDateFmt;             //贷款日期
    private Integer paidPeriod;             //已还期数
    private String outsrcInterval;          //委外区间
    private String lastRpmntDateFmt;        //最后一次还款时间
    private BigDecimal lastRpmntAmt;        //最后一次还款金额
    private String email;                   //主贷人电子邮箱
    private String unitName;                //主贷人单位名称
    private String position;                //主贷人职位
    private String spouseName;              //配偶姓名
    private String spouseIdCardNo;          //配偶身份证号

    public Long getRowNo() {
        return rowNo;
    }

    public void setRowNo(Long rowNo) {
        this.rowNo = rowNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getGenderText() {
        return genderText;
    }

    public void setGenderText(String genderText) {
        this.genderText = genderText;
    }

    public String getMarriageText() {
        return marriageText;
    }

    public void setMarriageText(String marriageText) {
        this.marriageText = marriageText;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getLastComName() {
        return lastComName;
    }

    public void setLastComName(String lastComName) {
        this.lastComName = lastComName;
    }

    public String getOutsrcComName() {
        return outsrcComName;
    }

    public void setOutsrcComName(String outsrcComName) {
        this.outsrcComName = outsrcComName;
    }

    public String getOutsrcTypeText() {
        return outsrcTypeText;
    }

    public void setOutsrcTypeText(String outsrcTypeText) {
        this.outsrcTypeText = outsrcTypeText;
    }

    public Integer getOverDay() {
        return overDay;
    }

    public void setOverDay(Integer overDay) {
        this.overDay = overDay;
    }

    public BigDecimal getRecivAmt() {
        return recivAmt;
    }

    public void setRecivAmt(BigDecimal recivAmt) {
        this.recivAmt = recivAmt;
    }

    public BigDecimal getResidueAmount() {
        return residueAmount;
    }

    public void setResidueAmount(BigDecimal residueAmount) {
        this.residueAmount = residueAmount;
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

    public String getLoanDateFmt() {
        return loanDateFmt;
    }

    public void setLoanDateFmt(String loanDateFmt) {
        this.loanDateFmt = loanDateFmt;
    }

    public Integer getPaidPeriod() {
        return paidPeriod;
    }

    public void setPaidPeriod(Integer paidPeriod) {
        this.paidPeriod = paidPeriod;
    }

    public String getOutsrcInterval() {
        return outsrcInterval;
    }

    public void setOutsrcInterval(String outsrcInterval) {
        this.outsrcInterval = outsrcInterval;
    }

    public String getLastRpmntDateFmt() {
        return lastRpmntDateFmt;
    }

    public void setLastRpmntDateFmt(String lastRpmntDateFmt) {
        this.lastRpmntDateFmt = lastRpmntDateFmt;
    }

    public BigDecimal getLastRpmntAmt() {
        return lastRpmntAmt;
    }

    public void setLastRpmntAmt(BigDecimal lastRpmntAmt) {
        this.lastRpmntAmt = lastRpmntAmt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
