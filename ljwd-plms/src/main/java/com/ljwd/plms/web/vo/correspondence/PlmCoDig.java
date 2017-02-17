package com.ljwd.plms.web.vo.correspondence;

import java.util.Date;

public class PlmCoDig {
	private Date nowTime;  //时间
	private Integer countNo; //基数参数
	private String differ; //流水号来源 RECORD生成信函记录  PAPER生成信函文件
	
	public String getDiffer() {
		return differ;
	}
	public void setDiffer(String differ) {
		this.differ = differ;
	}
	public Date getNowTime() {
		return nowTime;
	}
	public void setNowTime(Date nowTime) {
		this.nowTime = nowTime;
	}
	public Integer getCountNo() {
		return countNo;
	}
	public void setCountNo(Integer countNo) {
		this.countNo = countNo;
	}
	
}
