package com.ljwd.plms.web.vo.correspondence;


/**
 * 
 * ClassName: PlmsAddrInfoEntry 
 * @Description: 地址类型查询实体  （公司 住宅 户口）
 * @author zhengjizhao
 * @date 2016年10月31日下午5:45:38
 */
public class PlmsAddrInfoEntry {

	private Long applId;
	private String custName;
	private String idCardNo;
	private String addr;
	private String addrType;
	public Long getApplId() {
		return applId;
	}
	public void setApplId(Long applId) {
		this.applId = applId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getIdCardNo() {
		return idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	
}
