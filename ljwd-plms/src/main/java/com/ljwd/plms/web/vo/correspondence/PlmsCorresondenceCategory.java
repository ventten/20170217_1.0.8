package com.ljwd.plms.web.vo.correspondence;

/**
 * 信函类别数据实体
 * @author zhengjizhao
 *
 */
public class PlmsCorresondenceCategory {
	private Long id;
	private String tmplCode; //类别code   作为查询信函发送列表的查询条件
	private String tmplName; //类别名  显示在下拉框
	public String getTmplCode() {
		return tmplCode;
	}
	public void setTmplCode(String tmplCode) {
		this.tmplCode = tmplCode;
	}
	public String getTmplName() {
		return tmplName;
	}
	public void setTmplName(String tmplName) {
		this.tmplName = tmplName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
