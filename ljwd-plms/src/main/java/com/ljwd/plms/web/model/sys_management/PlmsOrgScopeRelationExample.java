package com.ljwd.plms.web.model.sys_management;

import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;


public class PlmsOrgScopeRelationExample extends BaseExample {
    
	 private Long orgId;	//机构Id

	 private Long collectionRuleId; //区间Id

	 private static Map<String,String> sortMap = new HashMap<String,String>();
	    static {
	        sortMap.put("orgName","orgname ");
	        sortMap.put("collectionRuleNames","collectionrulenames ");
	        sortMap.put("isActiveText","isActive ");
	        sortMap.put("updatedUserName","updatedUserName ");
	        sortMap.put("updateTime","updateTime ");
	    }

	    public void setOrderByClause(DataTableParam param){
	        super.setOrderByClause(param,sortMap);
	    }
	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getCollectionRuleId() {
		return collectionRuleId;
	}

	public void setCollectionRuleId(Long collectionRuleId) {
		this.collectionRuleId = collectionRuleId;
	}
	 
	 
}