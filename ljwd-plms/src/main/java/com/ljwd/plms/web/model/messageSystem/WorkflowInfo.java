package com.ljwd.plms.web.model.messageSystem;

import java.util.Date;

/**
 * 
* @ClassName: WorkflowInfo 
* @Description: TODO(工作流 实体 WF_WORKFLOW_INFO) 
* @author A18ccms a18ccms_gmail_com 
* @date 2016年9月1日 上午10:41:55 
*
 */
public class WorkflowInfo {

	private Long id;
	private String wfCode;
	private String status;  //状态
	private String subStatus; //子状态
	private Date createDate;  //工作流创建日期
	private Date finishDate;   //结束日期
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWfCode() {
		return wfCode;
	}
	public void setWfCode(String wfCode) {
		this.wfCode = wfCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	
	
}
