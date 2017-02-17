package com.ljwd.plms.web.model.sys_management;


import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class PlmsUserUpperLimitExample extends BaseExample{
   
	  private Long id;

	  private Long orgId;
	  
	  private Long roleId;
	  
	  private String isActive;

	  private static Map<String,String> sortMap = new HashMap<String,String>();
	    static {
	        sortMap.put("orgName","orgName ");
	        sortMap.put("roleName","roleName ");
	        sortMap.put("upperLimit","limit.UPPER_LIMIT ");
	        sortMap.put("isActiveText","limit.IS_ACTIVE ");
	        sortMap.put("updateTime","limit.UPDATE_TIME ");
	        sortMap.put("updatedUserName","updatedUserName ");
	    }

	    public void setOrderByClause(DataTableParam param){
	        super.setOrderByClause(param,sortMap);
	    }
		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
			this.id = id;
		}

		public Long getOrgId() {
			return orgId;
		}

		public void setOrgId(Long orgId) {
			this.orgId = orgId;
		}

		public Long getRoleId() {
			return roleId;
		}

		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}

		public String getIsActive() {
			return isActive;
		}

		public void setIsActive(String isActive) {
			this.isActive = isActive;
		}
		
	  
}