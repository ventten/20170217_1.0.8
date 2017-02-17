package com.ljwd.plms.web.vo.sys_management;

import java.io.Serializable;

/**
 * 放款类别dto
 * <p>Title: SysPaymentType</p>
 * @author pangshanxing
 * @date 2016年11月24日下午7:18:59
 */
public class SysPaymentTypeDto implements Serializable{
	private static final long serialVersionUID = 1L;

	private String code; 		//code
	private String typeName;	//名称

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
