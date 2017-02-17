package com.ljwd.plms.web.model.outVisit;


import com.ljwd.plms.web.model.BaseModel;

/**外访记录日志表 plms_ovm_out_visit_log
 * <p>Title: PlmsOvmOutVisitLog</p>
 * @author pangshanxing
 * @date 2016年9月27日下午4:16:36
 */
public class PlmsOvmOutVisitLog extends BaseModel{
    private Long id;

    private Long applId;  //贷款Id

    private String handleBy; //操作人

    private String content; //内容
    
    private String status; //状态

    private String remarks;//备注


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

    public String getHandleBy() {
        return handleBy;
    }

    public void setHandleBy(String handleBy) {
        this.handleBy = handleBy == null ? null : handleBy.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
}