package com.ljwd.plms.web.model.outVisit;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.web.model.BaseModel;

/**外访信息表，用于外访管理操作的基础数据表
 * <p>Title: PlmsOvmOutVisitInfo</p>
 * @author pangshanxing
 * @date 2016年9月13日下午3:01:31
 */
public class PlmsOvmOutVisitInfo extends BaseModel{
	
    private Long id;  //外访表ID

    private Long applId; //贷款申请ID

    private String status;  //外访状态。Submitted(已提交)、Audited(已审核)、AuditRefused(审核拒绝)、Assigned(未计划)、Planing(计划中)、Visited(已外访)、NoVisit(未外访)

    private String custType;  //客户所属类别，即外访申请提交原因。Bouncing(多次跳票)、Lost(失联)、Others(其他)

    private Date submitDate; //外访申请提交时间

    private String submitBy; //外访申请提交人

    private String submitReason; //提交外访申请时的理由
 
    private Date auditDate; //外访申请审核时间

    private String auditBy; //外访申请审核人

    private String auditRefuseReason;  //外访申请审核拒绝理由

    private Date assignDate;  //外访申请分配时间

    private String assignBy; //外访申请分配人

    private String visitBy; //外访人员

    private String assistBy; //外访协助人员

    private Date endDate;  //外访结束时间

    private String endBy; //外访结束提交人  

    private Date expectCloseTime;  //预计结案日期  

    private BigDecimal remainderPrincipal; //分配时的剩余本金

    private Long overdueDay; //分配时的逾期天数

    private Long visitPlanNum; //计划外访次数

    private Long visitOverNum; //完成外访次数

    private String caseType; //案件类型。CASE_ADD(新增案件)、CASE_DELAYING(延期申请中)、CASE_DELAY(延期案件)

    private Date closedDate; //结案日期
    
    private String closedType; //结案类别
    
    private String closedReason; //结案原因
    
    private String visitType; //外访类型（1（考察）2（协催））
    
    private Integer registerOverNum; //户籍地址外访次数
    
    private Integer houseOverNum; //住宅地址外访次数
    
    private Integer companyOverNum;  //单位地址外访次数

    //dto
    private String custName; //提交外访申请案件的主贷人姓名
    private Long areaId;//案件所属区域ID
    private String assignDateStr; //分配日期
    private String expectCloseTimeStr;//预计结案日期
    private String visitByName;	//外访人员姓名
    
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public String getSubmitBy() {
        return submitBy;
    }

    public void setSubmitBy(String submitBy) {
        this.submitBy = submitBy == null ? null : submitBy.trim();
    }

    public String getSubmitReason() {
        return submitReason;
    }

    public void setSubmitReason(String submitReason) {
        this.submitReason = submitReason == null ? null : submitReason.trim();
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy == null ? null : auditBy.trim();
    }

    public String getAuditRefuseReason() {
        return auditRefuseReason;
    }

    public void setAuditRefuseReason(String auditRefuseReason) {
        this.auditRefuseReason = auditRefuseReason == null ? null : auditRefuseReason.trim();
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public String getAssignBy() {
        return assignBy;
    }

    public void setAssignBy(String assignBy) {
        this.assignBy = assignBy == null ? null : assignBy.trim();
    }

    public String getVisitBy() {
        return visitBy;
    }

    public void setVisitBy(String visitBy) {
        this.visitBy = visitBy == null ? null : visitBy.trim();
    }

    public String getAssistBy() {
        return assistBy;
    }

    public void setAssistBy(String assistBy) {
        this.assistBy = assistBy == null ? null : assistBy.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEndBy() {
        return endBy;
    }

    public void setEndBy(String endBy) {
        this.endBy = endBy == null ? null : endBy.trim();
    }

    public Date getExpectCloseTime() {
        return expectCloseTime;
    }

    public void setExpectCloseTime(Date expectCloseTime) {
        this.expectCloseTime = expectCloseTime;
    }

   

    public Long getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(Long overdueDay) {
        this.overdueDay = overdueDay;
    }

    public Long getVisitPlanNum() {
        return visitPlanNum;
    }

    public void setVisitPlanNum(Long visitPlanNum) {
        this.visitPlanNum = visitPlanNum;
    }

    public Long getVisitOverNum() {
        return visitOverNum;
    }

    public void setVisitOverNum(Long visitOverNum) {
        this.visitOverNum = visitOverNum;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

	public BigDecimal getRemainderPrincipal() {
		return remainderPrincipal;
	}

	public void setRemainderPrincipal(BigDecimal remainderPrincipal) {
		this.remainderPrincipal = remainderPrincipal;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getClosedType() {
		return closedType;
	}

	public void setClosedType(String closedType) {
		this.closedType = closedType;
	}

	public String getClosedReason() {
		return closedReason;
	}

	public void setClosedReason(String closedReason) {
		this.closedReason = closedReason;
	}

	public String getVisitType() {
		return visitType;
	}

	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}

	public Integer getRegisterOverNum() {
		return registerOverNum;
	}

	public void setRegisterOverNum(Integer registerOverNum) {
		this.registerOverNum = registerOverNum;
	}

	public Integer getHouseOverNum() {
		return houseOverNum;
	}

	public void setHouseOverNum(Integer houseOverNum) {
		this.houseOverNum = houseOverNum;
	}

	public Integer getCompanyOverNum() {
		return companyOverNum;
	}

	public void setCompanyOverNum(Integer companyOverNum) {
		this.companyOverNum = companyOverNum;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAssignDateStr() {
		return assignDateStr;
	}

	public void setAssignDateStr(String assignDateStr) {
		this.assignDateStr = assignDateStr;
	}

	public String getExpectCloseTimeStr() {
		return expectCloseTimeStr;
	}

	public void setExpectCloseTimeStr(String expectCloseTimeStr) {
		this.expectCloseTimeStr = expectCloseTimeStr;
	}

	public String getVisitByName() {
		return visitByName;
	}

	public void setVisitByName(String visitByName) {
		this.visitByName = visitByName;
	}
	
	
    
}