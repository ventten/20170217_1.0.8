package com.ljwd.plms.web.vo.correspondence;

/**
 * 
 * ClassName: PlmsDocumentGenLogTelDto 
 * @Description: 查询信函详情的时候查询其对应的电话号码
 * @author zhengjizhao
 * @date 2016年11月29日下午4:42:33
 */
public class PlmsDocumentGenLogTelDto {

	private String tel;  //号码
	private String createTime; //创建时间
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
