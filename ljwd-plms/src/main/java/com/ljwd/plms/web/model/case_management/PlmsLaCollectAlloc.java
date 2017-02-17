package com.ljwd.plms.web.model.case_management;

import com.ljwd.plms.web.model.ActiveModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 案件分配记录表,plms_la_collect_alloc
 * */
public class PlmsLaCollectAlloc extends ActiveModel{

    public static final String TYPE_MARU = "MARU";      //手动分配
    public static final String TYPE_AUTO = "AUTO";      //自动分配
    public static final String TYPE_ADJUST = "ADJUST";  //用户调整

    private Long id;                                    //记录ID
    private Long paymentId;                             //放款记录ID
    private Long applId;                                //贷款申请单记录ID
    private Long overdueDays;                           //分配时的逾期天数
    private BigDecimal remainingPrincipal;              //分配时的剩余本金
    private String collector;                           //催收员
    private Date assignTime;                            //分配时间
    private Date allocBeginDate;                        //起始日期
    private Date allocEndDate;                          //结束日期
    private String allocType;                           //分配类型（MANU(手动分配),AUTO(自动分配),ADJUST(用户调整)）
    private String adjustedBy;                          //调整人
    private Date adjustTime;                            //调整时间
    private String remark;                              //备注

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

    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector == null ? null : collector.trim();
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public Date getAllocBeginDate() {
        return allocBeginDate;
    }

    public void setAllocBeginDate(Date allocBeginDate) {
        this.allocBeginDate = allocBeginDate;
    }

    public Date getAllocEndDate() {
        return allocEndDate;
    }

    public void setAllocEndDate(Date allocEndDate) {
        this.allocEndDate = allocEndDate;
    }

    public String getAllocType() {
        return allocType;
    }

    public void setAllocType(String allocType) {
        this.allocType = allocType == null ? null : allocType.trim();
    }

    public String getAdjustedBy() {
        return adjustedBy;
    }

    public void setAdjustedBy(String adjustedBy) {
        this.adjustedBy = adjustedBy == null ? null : adjustedBy.trim();
    }

    public Date getAdjustTime() {
        return adjustTime;
    }

    public void setAdjustTime(Date adjustTime) {
        this.adjustTime = adjustTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

}