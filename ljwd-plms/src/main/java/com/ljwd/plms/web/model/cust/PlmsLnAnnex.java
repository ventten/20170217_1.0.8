package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseModel;

/**
 * 附件表,plms_ln_annex
 * */
public class PlmsLnAnnex extends BaseModel{

    public static final String FILE_TYPE_IMG = "IMG";           //文件类型-图片
    public static final String FILE_TYPE_RECORD = "RECORD";     //文件类型-录音

    private Long id;                    //记录id
    private Long clCustId;              //客户基本信息表ID
    private String srcCode;             //来源：微贷(WIN)、聚信立(JUXINLI)、网络(NETWORK)、外部机构(EXTMECHAN)、客户来电(CUSTCALL)、催收(COLLECT)、OUTVISIT(外访)
    private Long applId;                //贷款申请ID
    private String topic;               //主题
    private String fileName;            //文件名
    private String path;                //附件地址.相对地址
    private String annexStyle;          //附件类别：ANST001(流水性附件),ANST002(非流水性附件)
    private String annexType;           //附件类型：参照附件类型
    private String uploadBy;            //上传人
    private String remark;              //备注
    private Long annexId;               //微贷附件表ID
    private Long outVisitPlanId;        //外访计划表ID
    private String isDeleted;           //是否已删除:Y/N
    private String fileType;            //文件类型(外访APP上传文件用):IMG-图片、RECORD-录音

    /** 扩展字段 **/
    //text-ext

    //join-ext
    private String srcVal;                 //来源显示值
    private String annexStyleVal;          //附件类别显示值
    private String annexTypeVal;           //附件类型显示值
    private String planCode;				//外访计划编号
    //mfbms-ext
    private String docno;           //身份证号
    
    private Long rowNo;   //序号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClCustId() {
        return clCustId;
    }

    public void setClCustId(Long clCustId) {
        this.clCustId = clCustId;
    }

    public String getSrcCode() {
        return srcCode;
    }

    public void setSrcCode(String srcCode) {
        this.srcCode = srcCode == null ? null : srcCode.trim();
    }

    public Long getApplId() {
        return applId;
    }

    public void setApplId(Long applId) {
        this.applId = applId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getAnnexStyle() {
        return annexStyle;
    }

    public void setAnnexStyle(String annexStyle) {
        this.annexStyle = annexStyle == null ? null : annexStyle.trim();
    }

    public String getAnnexType() {
        return annexType;
    }

    public void setAnnexType(String annexType) {
        this.annexType = annexType == null ? null : annexType.trim();
    }

    public String getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(String uploadBy) {
        this.uploadBy = uploadBy == null ? null : uploadBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getAnnexId() {
        return annexId;
    }

    public void setAnnexId(Long annexId) {
        this.annexId = annexId;
    }

    public String getSrcVal() {
        return srcVal;
    }

    public void setSrcVal(String srcVal) {
        this.srcVal = srcVal;
    }

    public String getAnnexStyleVal() {
        return annexStyleVal;
    }

    public void setAnnexStyleVal(String annexStyleVal) {
        this.annexStyleVal = annexStyleVal;
    }

    public String getAnnexTypeVal() {
        return annexTypeVal;
    }

    public void setAnnexTypeVal(String annexTypeVal) {
        this.annexTypeVal = annexTypeVal;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public Long getOutVisitPlanId() {
        return outVisitPlanId;
    }

    public void setOutVisitPlanId(Long outVisitPlanId) {
        this.outVisitPlanId = outVisitPlanId;
    }

	public String getPlanCode() {
		return planCode;
	}

	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}

	public Long getRowNo() {
		return rowNo;
	}

	public void setRowNo(Long rowNo) {
		this.rowNo = rowNo;
	}

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}