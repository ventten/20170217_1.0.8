package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;
import java.util.Map;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;

public interface SysOrgService extends GenericService<SysOrg, Long> {


	List<SysOrg> selectByExample(SysOrgExample example);

	/**
	 * 
	* @Description: 外访申请人员所属机构 
	* @param map
	* @return
	* @return List<SysOrg>
	 */
	List<SysOrg> selectOutVisitOrgByExample(Map<String,Object> map);

	/**
	 * 
	* @Description: 根据所属网点查找作业部催收员所属机构 
	* @param map
	* @return
	* @return List<Long>
	 */
	List<Long> selectOrgBySiteCode(Map<String,Object> map);
}
