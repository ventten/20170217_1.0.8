package com.ljwd.plms.web.vo.correspondence;

import java.util.Date;

import com.ljwd.plms.web.vo.PageRowNo;
/**
 * 
 * ClassName: PlmsCorresLogDto 
 * @Description: 催记页面查询信函记录的实体  PLMS_LN_CORRES_LOG
 * @author zhengjizhao
 * @date 2016年12月15日下午3:30:17
 */
public class PlmsCorresLogDto  extends PageRowNo{

	private Long id; //主键ID
	private Long applId;//贷款ID
    private String logContent;//记录内容
    private String genByName; //操作人姓名
    private Date genTime;//生成时间
    private String genBy;//生成人
    private Date upDateTime;//修改时间
    private String upDateBy;//修改人
    
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
	public Date getGenTime() {
		return genTime;
	}
	public void setGenTime(Date genTime) {
		this.genTime = genTime;
	}
	public String getGenBy() {
		return genBy;
	}
	public void setGenBy(String genBy) {
		this.genBy = genBy;
	}
	public Date getUpDateTime() {
		return upDateTime;
	}
	public void setUpDateTime(Date upDateTime) {
		this.upDateTime = upDateTime;
	}
	public String getUpDateBy() {
		return upDateBy;
	}
	public void setUpDateBy(String upDateBy) {
		this.upDateBy = upDateBy;
	}
    
    
}
