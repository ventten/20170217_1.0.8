package com.ljwd.plms.web.model.messageSystem;

import com.ljwd.plms.web.model.BaseModel;

/**
* @ClassName: SysMessageTempLate
* @Description: TODO(短信模板表 实体 SYS_MESSAGE_TEMPLATE)
* @author zhengjizhao
* @date 2016年9月2日 下午3:24:55 
 */
public class SysMessageTempLate extends BaseModel{

	private Long id;					//记录ID
	private String suiTableGroup;		//模板组别
	private String suiTableType;		//模板类型
	private String contNet;				//模板文字

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSuiTableGroup() {
		return suiTableGroup;
	}

	public void setSuiTableGroup(String suiTableGroup) {
		this.suiTableGroup = suiTableGroup;
	}

	public String getSuiTableType() {
		return suiTableType;
	}

	public void setSuiTableType(String suiTableType) {
		this.suiTableType = suiTableType;
	}

	public String getContNet() {
		return contNet;
	}

	public void setContNet(String contNet) {
		this.contNet = contNet;
	}

}
