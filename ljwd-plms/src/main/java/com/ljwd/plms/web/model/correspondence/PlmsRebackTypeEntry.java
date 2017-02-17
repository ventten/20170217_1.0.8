package com.ljwd.plms.web.model.correspondence;

/**
 * 
 * ClassName: PlmsRebackTypeEntry 
 * @Description: 信函退回类型下拉框数据显示实体 SEQ_PLMS_LN_DOC_RETYPE
 * @author zhengjizhao
 * @date 2016年12月5日下午2:08:11
 */
public class PlmsRebackTypeEntry {

	private Long id; //主键ID
	private String rebackTypeCode;//信函类型code
	private String rebackTypeFaCode; //退信的父级类型code
	private String rebackTypeName; //退信类型名
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRebackTypeCode() {
		return rebackTypeCode;
	}
	public void setRebackTypeCode(String rebackTypeCode) {
		this.rebackTypeCode = rebackTypeCode;
	}
	public String getRebackTypeFaCode() {
		return rebackTypeFaCode;
	}
	public void setRebackTypeFaCode(String rebackTypeFaCode) {
		this.rebackTypeFaCode = rebackTypeFaCode;
	}
	public String getRebackTypeName() {
		return rebackTypeName;
	}
	public void setRebackTypeName(String rebackTypeName) {
		this.rebackTypeName = rebackTypeName;
	}
	
}
