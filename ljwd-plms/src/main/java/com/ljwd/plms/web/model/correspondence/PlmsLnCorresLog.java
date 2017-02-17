package com.ljwd.plms.web.model.correspondence;

import com.ljwd.plms.web.model.BaseModel;
/**
 * 
 * ClassName: PlmsCorresLogInfo   PLMS_LN_CORRES_LOG
 * @Description: 催记-信函记录，信息插入实体
 * @author zhengjizhao
 * @date 2016年12月15日下午3:51:57
 */
public class PlmsLnCorresLog  extends BaseModel{

	private Long id; //主键ID
	private Long applId;//贷款ID
    private String logContent;//记录内容
    private String genByName; //操作人姓名
    
	public String getGenByName() {
		return genByName;
	}
	public void setGenByName(String genByName) {
		this.genByName = genByName;
	}
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
	public String getLogContent() {
		return logContent;
	}
	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
    
    
}
