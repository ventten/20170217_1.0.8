package com.ljwd.plms.web.vo.correspondence;
/**
 * 
 * ClassName: PlmsCollectorInfo 
 * @Description: 做查询 员工的姓氏和办公电话用
 * @author zhengjizhao
 * @date 2016年11月28日下午2:13:43
 */
public class PlmsCollectorInfo {

	private String collectorEmp;//员工姓氏表中的称呼 (催收员的称呼)
	private String collector; //员工表中拼接的称呼（如果姓氏表中的数据为空，那么就用这个称呼）(催收员的称呼)
	private String collectorName;//查询催收员的姓名
	private String collectorPhone;//催收员的办公电话
	private String collectorId;//催收员的ID
	private String gender;//催收员的性别
	public String getCollectorEmp() {
		return collectorEmp;
	}
	public void setCollectorEmp(String collectorEmp) {
		this.collectorEmp = collectorEmp;
	}
	public String getCollector() {
		return collector;
	}
	public void setCollector(String collector) {
		this.collector = collector;
	}
	public String getCollectorPhone() {
		return collectorPhone;
	}
	public void setCollectorPhone(String collectorPhone) {
		this.collectorPhone = collectorPhone;
	}
	public String getCollectorId() {
		return collectorId;
	}
	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCollectorName() {
		return collectorName;
	}
	public void setCollectorName(String collectorName) {
		this.collectorName = collectorName;
	}
	
}
