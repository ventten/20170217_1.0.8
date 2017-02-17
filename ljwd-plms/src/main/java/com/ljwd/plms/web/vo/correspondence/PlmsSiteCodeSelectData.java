package com.ljwd.plms.web.vo.correspondence;
/**
 * 所属地区列表查询实体
 * @author zhengjizhao
 *
 */
public class PlmsSiteCodeSelectData {

	private String siteCode;//地区编码
	private String siteName; //地区名称
	private Long areaId; //城市ID
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	
}
