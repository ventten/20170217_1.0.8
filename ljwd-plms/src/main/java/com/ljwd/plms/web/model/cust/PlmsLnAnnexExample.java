package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 附件表,plms_ln_annex
 * */
public class PlmsLnAnnexExample extends BaseExample{

    private Long clCustId;              //客户基本信息表ID
    private Long applId;                //贷款申请ID
    private String srcCode;             //来源：微贷、聚信立、网络、外部机构、客户来电
    private String annexType;           //附件类型：参照附件类型
    private Long applIdOrNull;          //查找此借款ID等于此值或借款ID为null的数据
    private Long outVisitPlanId;        //外访计划表ID
    private String fileType;            //文件类型(外访APP上传文件用):IMG-图片、RECORD-录音
    private String isDeleted;           //是否已删除:Y/N

    public Long getClCustId() {
        return clCustId;
    }

    public void setClCustId(Long clCustId) {
        this.clCustId = clCustId;
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = (srcCode == null || "".equals(srcCode) || "".equals(srcCode.trim())) ? null : srcCode.trim();
    }

    public String getAnnexType() {
        return annexType;
    }

    public void setAnnexType(String annexType) {
        this.annexType = (annexType == null || "".equals(annexType) || "".equals(annexType.trim())) ? null : annexType.trim();
    }

    public Long getApplIdOrNull() {
        return applIdOrNull;
    }

    public void setApplIdOrNull(Long applIdOrNull) {
        this.applIdOrNull = applIdOrNull;
    }

	public Long getOutVisitPlanId() {
		return outVisitPlanId;
	}

	public void setOutVisitPlanId(Long outVisitPlanId) {
		this.outVisitPlanId = outVisitPlanId;
	}

    public String getFileType() {
        return fileType;
    }

    public PlmsLnAnnexExample setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public PlmsLnAnnexExample setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
}