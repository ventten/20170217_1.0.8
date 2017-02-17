package com.ljwd.plms.web.vo.correspondence;

import java.util.Date;

import com.ljwd.plms.web.model.BaseModel;

/**
 * 
 * ClassName: PlmsCorresRebackInfo 
 * @Description: 修改信函状态为“已退回”时 的参数 实体
 * @author zhengjizhao
 * @date 2016年12月2日下午4:54:05
 */
public class PlmsCorresRebackInfo  extends BaseModel{
	private Long ids; //选中的信函id拼接字符串
	private Integer rebackTypeOne; //退回类型1
	private Integer rebackTypeTwo; //退回类型2
	private String rebackTypeOneStr; //退回类型1文字信息
	private String rebackTypeTwoStr; //退回类型2文字信息
	private String rebackTypeInfo; //退回类型信息文字
	private Date rebackDate; //退回日期
	private String rebackInfo; //退回备注信息
	private String paras; //拼接参数
	public Long getIds() {
		return ids;
	}
	public void setIds(Long ids) {
		this.ids = ids;
	}
	public Integer getRebackTypeOne() {
		return rebackTypeOne;
	}
	public void setRebackTypeOne(Integer rebackTypeOne) {
		this.rebackTypeOne = rebackTypeOne;
	}
	public Integer getRebackTypeTwo() {
		return rebackTypeTwo;
	}
	public void setRebackTypeTwo(Integer rebackTypeTwo) {
		this.rebackTypeTwo = rebackTypeTwo;
	}
	public String getRebackTypeInfo() {
		return rebackTypeInfo;
	}
	public void setRebackTypeInfo(String rebackTypeInfo) {
		this.rebackTypeInfo = rebackTypeInfo;
	}
	
	public Date getRebackDate() {
		return rebackDate;
	}
	public void setRebackDate(Date rebackDate) {
		this.rebackDate = rebackDate;
	}
	public String getRebackInfo() {
		return rebackInfo;
	}
	public void setRebackInfo(String rebackInfo) {
		this.rebackInfo = rebackInfo;
	}
	public String getRebackTypeOneStr() {
		return rebackTypeOneStr;
	}
	public void setRebackTypeOneStr(String rebackTypeOneStr) {
		this.rebackTypeOneStr = rebackTypeOneStr;
	}
	public String getRebackTypeTwoStr() {
		return rebackTypeTwoStr;
	}
	public void setRebackTypeTwoStr(String rebackTypeTwoStr) {
		this.rebackTypeTwoStr = rebackTypeTwoStr;
	}
	public String getParas() {
		return paras;
	}
	public void setParas(String paras) {
		this.paras = paras;
	}
	
}
