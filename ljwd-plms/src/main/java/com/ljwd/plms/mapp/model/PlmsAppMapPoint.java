package com.ljwd.plms.mapp.model;

import com.ljwd.plms.web.model.BaseModel;

import java.util.Date;

/**
 * 用户位置信息记录实体
 * Created by tangjialin on 2016-10-13 0013.
 */
public class PlmsAppMapPoint extends BaseModel {
	private Long    id;
	private Long    planId;   // 外访计划主键
	private Double  lng;      // 经度
	private Double  lat;      // 纬度
	private Double  accuracy; // 精度(单位:米)
	private Integer options;  // 提交操作.0或null:默认值,普通坐标;1:外访提交坐标点;2:签到开始坐标;3:签到结束坐标;
	private Date    dateTime; // 定位时间(格式:yyyy-MM-dd HH:mm:ss)

	public Long getId() {
		return id;
	}

	public PlmsAppMapPoint setId(Long id) {
		this.id = id;
		return this;
	}

	public Long getPlanId() {
		return planId;
	}

	public PlmsAppMapPoint setPlanId(Long planId) {
		this.planId = planId;
		return this;
	}

	public Double getLng() {
		return lng;
	}

	public PlmsAppMapPoint setLng(Double lng) {
		this.lng = lng;
		return this;
	}

	public Double getLat() {
		return lat;
	}

	public PlmsAppMapPoint setLat(Double lat) {
		this.lat = lat;
		return this;
	}

	public Double getAccuracy() {
		return accuracy;
	}

	public PlmsAppMapPoint setAccuracy(Double accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	public Integer getOptions() {
		return options;
	}

	public PlmsAppMapPoint setOptions(Integer options) {
		this.options = options;
		return this;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public PlmsAppMapPoint setDateTime(Date dateTime) {
		this.dateTime = dateTime;
		return this;
	}
}
