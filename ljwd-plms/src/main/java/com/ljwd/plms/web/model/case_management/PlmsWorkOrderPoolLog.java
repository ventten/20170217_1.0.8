package com.ljwd.plms.web.model.case_management;

import com.ljwd.plms.web.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 工单日志表,PLMS_WORK_ORDER_POOL_LOG
 * */
public class PlmsWorkOrderPoolLog extends BaseModel{

    public static final String DEFEND_KEEP = "1";           //保护规则对应状态-保留
    public static final String DEFEND_IMMUNITY = "2";       //保护规则对应状态-豁免
    public static final String DEFEND_DROP_PERIOD = "3";    //保护规则对应状态-降期
    public static final String DEFEND_DEPARTURE = "4";      //保护规则对应状态-离职
    public static final String DEFEND_OUTSRC_KEEP = "5";    //保护规则对应状态-委外保留

    private Long id;                                //记录ID
    private Long applId;                            //贷款申请单记录ID
    private Long paymentId;                         //放款记录ID
    private Long overdueDays;                       //逾期天数
    private BigDecimal remainingPrincipal;          //剩余本金
    private Integer overduePeriod;                  //逾期起始期数
    private String status;                          //催收区间对应的状态
    private Date handleDate;                        //处理日期.每天batch处理时，都要更新此字段.用作判断是否已经处理
    private String actionType;                      //操作类型：发生状态转换的操作(CREATE)
    private String action;                          //操作
    private Date actionDate;                        //操作日期
    private String actionBy;                        //操作人(SYSTEM or user)
    private String remark;                          //备注
    private String defendStatus;                    //保护规则对应状态：1（保留）、2（豁免）、3（降期）、4（离职）、5（委外保留）
    private Date protectEndDate;                    //保留截止日期
    private String waivdeStatus;					//豁免状态：1（保护中） 2（待流转）
    
    //join-ext
    private String cntrctNo;                        //合同编号

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

    public Long getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Long overdueDays) {
        this.overdueDays = overdueDays;
    }

    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public Integer getOverduePeriod() {
        return overduePeriod;
    }

    public void setOverduePeriod(Integer overduePeriod) {
        this.overduePeriod = overduePeriod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(Date handleDate) {
        this.handleDate = handleDate;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy == null ? null : actionBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDefendStatus() {
        return defendStatus;
    }

    public void setDefendStatus(String defendStatus) {
        this.defendStatus = defendStatus == null ? null : defendStatus.trim();
    }

    public Date getProtectEndDate() {
        return protectEndDate;
    }

    public void setProtectEndDate(Date protectEndDate) {
        this.protectEndDate = protectEndDate;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getCntrctNo() {
        return cntrctNo;
    }

    public void setCntrctNo(String cntrctNo) {
        this.cntrctNo = cntrctNo;
    }

	public String getWaivdeStatus() {
		return waivdeStatus;
	}

	public void setWaivdeStatus(String waivdeStatus) {
		this.waivdeStatus = waivdeStatus;
	}

    
}