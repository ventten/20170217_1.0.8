package com.ljwd.plms.web.model.outVisit;

import java.math.BigDecimal;
import java.util.Date;

import com.ljwd.plms.web.model.BaseModel;

public class PlmsOvmOutVisitPlan extends BaseModel{
   
	private Long id;

    private Long applId;

    private Long infoId; //外访信息表plms_ovm_out_visit_info的Id

    private String planCode; //外访计划编号

    private Date planStartTime;//计划外访日期

    private String planStatus; //计划外访状态

    private Long signId; //签到表中对应的Id

    private String address;//外访地址

    private String addressType; //地址类型

    private String addressValidity;//地址有效性

    private String followupResults;//跟进结果

    private String assistBy;//陪同人

    private Date ptpDate; //PTP日期

    private BigDecimal ptpAmt;//PTP金额

    private String ovtresultDetail;//外访详情

    private String visitCancelType;//外访取消类别

    private String visitCancelResion;//外访取消原因

    private String remark;//备注
    
    private String signStatus; //外访计划签到状态。Signning(计划中)，Signned(已签到)
    
    private String validAddress; //有效的地址(外发结果中地址有效性为无效时，要填入的有效地址)
        
    //dto
    private String planStatusName;//计划外访状态名称
    
    private String addressTypeName; ///地址类型名称
    
    private String visitCancelTypeName; //外访取消类别名称
    
    private String assistByNames; //陪同人姓名
    
    private String cntrctNo; //合同编号
    

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

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode == null ? "" : planCode.trim();
    }

    public Date getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(Date planStartTime) {
        this.planStartTime = planStartTime;
    }

    public String getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(String planStatus) {
        this.planStatus = planStatus == null ? "" : planStatus.trim();
    }

    public Long getSignId() {
        return signId;
    }

    public void setSignId(Long signId) {
        this.signId = signId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? "" : address.trim();
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType == null ? "" : addressType.trim();
    }

    public String getAddressValidity() {
        return addressValidity;
    }

    public void setAddressValidity(String addressValidity) {
        this.addressValidity = addressValidity == null ? "" : addressValidity.trim();
    }

    public String getFollowupResults() {
        return followupResults;
    }

    public void setFollowupResults(String followupResults) {
        this.followupResults = followupResults == null ? "" : followupResults.trim();
    }

    public String getAssistBy() {
        return assistBy;
    }

    public void setAssistBy(String assistBy) {
        this.assistBy = assistBy == null ? "" : assistBy.trim();
    }

    public Date getPtpDate() {
        return ptpDate;
    }

    public void setPtpDate(Date ptpDate) {
        this.ptpDate = ptpDate;
    }


    public BigDecimal getPtpAmt() {
		return ptpAmt;
	}

	public void setPtpAmt(BigDecimal ptpAmt) {
		this.ptpAmt = ptpAmt;
	}

	public String getOvtresultDetail() {
        return ovtresultDetail==null?"":ovtresultDetail;
    }

    public void setOvtresultDetail(String ovtresultDetail) {
        this.ovtresultDetail = ovtresultDetail ;
    }

    public String getVisitCancelType() {
        return visitCancelType==null ?"":visitCancelType;
    }

    public void setVisitCancelType(String visitCancelType) {
        this.visitCancelType = visitCancelType ;
    }

    public String getVisitCancelResion() {
        return visitCancelResion==null?"":visitCancelResion;
    }

    public void setVisitCancelResion(String visitCancelResion) {
        this.visitCancelResion = visitCancelResion ;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? "" : remark.trim();
    }

	public String getSignStatus() {
		return signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getPlanStatusName() {
		return planStatusName;
	}

	public void setPlanStatusName(String planStatusName) {
		this.planStatusName = planStatusName;
	}

	public String getAddressTypeName() {
		return addressTypeName;
	}

	public void setAddressTypeName(String addressTypeName) {
		this.addressTypeName = addressTypeName;
	}

	public String getVisitCancelTypeName() {
		return visitCancelTypeName==null?"":visitCancelTypeName;
	}

	public void setVisitCancelTypeName(String visitCancelTypeName) {
		this.visitCancelTypeName = visitCancelTypeName;
	}

	public String getValidAddress() {
		return validAddress;
	}

	public void setValidAddress(String validAddress) {
		this.validAddress = validAddress;
	}

	public String getAssistByNames() {
		return assistByNames;
	}

	public void setAssistByNames(String assistByNames) {
		this.assistByNames = assistByNames;
	}

	public String getCntrctNo() {
		return cntrctNo;
	}

	public void setCntrctNo(String cntrctNo) {
		this.cntrctNo = cntrctNo;
	}


  }
