package com.ljwd.plms.web.model.cust;

import com.ljwd.plms.web.model.BaseExample;

/**
 * 
* @ClassName: PlmsLnPolyInfoExample 
* @Description: TODO(查询聚信立条件实体) 
* @author zhengjizhao
* @date 2016年8月17日 下午4:05:19 
*
 */
public class PlmsLnPolyInfoExample extends BaseExample{
	private Long applId;            //贷款申请ID

	public Long getApplId() {
		return applId;
	}

	public void setApplId(Long applId) {
		this.applId = applId;
	}
	
}
