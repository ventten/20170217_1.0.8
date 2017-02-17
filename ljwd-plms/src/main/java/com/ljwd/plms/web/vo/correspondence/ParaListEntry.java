package com.ljwd.plms.web.vo.correspondence;
/**
 * 
 * ClassName: ParaListEntry 
 * @Description: 信函信息查询参数实体
 * @author zhengjizhao
 * @date 2016年10月24日上午11:56:37
 */
public class ParaListEntry {
	private String contractNo; //合同号
	private String addType; //地址类型
	private String clientName; // 客户姓名
	private String clientAddr; //客户地址
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getAddType() {
		return addType;
	}
	public void setAddType(String addType) {
		this.addType = addType;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAddr() {
		return clientAddr;
	}
	public void setClientAddr(String clientAddr) {
		this.clientAddr = clientAddr;
	}
	
	
}
