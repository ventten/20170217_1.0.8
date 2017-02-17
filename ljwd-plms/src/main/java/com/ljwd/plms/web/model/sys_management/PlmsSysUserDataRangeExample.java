package com.ljwd.plms.web.model.sys_management;



import java.util.HashMap;
import java.util.Map;

import com.ljwd.plms.web.model.BaseExample;
import com.ljwd.plms.web.vo.DataTableParam;

public class PlmsSysUserDataRangeExample extends BaseExample{
  
	private Long userOrgId; //所属机构Id
	
	private String userId; //用户Id
	
	private String userName; //员工姓名

	private static Map<String,String> sortMap = new HashMap<String,String>();
    static {
        sortMap.put("userOrgName","userOrgName ");
        sortMap.put("userName","userName ");
        sortMap.put("orgNames","orgNames ");
        sortMap.put("updatedUserName","updatedUserName ");
        sortMap.put("updateTime","updateTime ");
    }

    public void setOrderByClause(DataTableParam param){
        super.setOrderByClause(param,sortMap);
    }

	public Long getUserOrgId() {
		return userOrgId;
	}

	public void setUserOrgId(Long userOrgId) {
		this.userOrgId = userOrgId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}