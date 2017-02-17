package com.ljwd.plms.web.vo.outVisit;

import com.ljwd.plms.core.util.D;

import java.util.Date;


public class PlmsAppMapPointResult {

	private Long    id;
	private Double  lng;      // 经度
	private Double  lat;      // 纬度
	private Double  accuracy; // 精度(单位:米)
	private Date    dateTime; // 定位时间(格式:yyyy-MM-dd HH:mm:ss)
	private Integer options;   // 提交操作.0:默认值;1:外访提交坐标点
	private Integer rowNo;
	
	private String dateTimeFormat;//
	
	
	public String getDateTimeFormat() {
		if(dateTime!=null){
			return D.parseTo(dateTime);
		}
		return dateTimeFormat;
	}

	public void setDateTimeFormat(String dateTimeFormat) {
		this.dateTimeFormat = dateTimeFormat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getOptions() {
		return options;
	}

	public PlmsAppMapPointResult setOptions(Integer options) {
		this.options = options;
		return this;
	}

	public Integer getRowNo() {
		return rowNo;
	}

	public void setRowNo(Integer rowNo) {
		this.rowNo = rowNo;
	}

	

	

	
}
