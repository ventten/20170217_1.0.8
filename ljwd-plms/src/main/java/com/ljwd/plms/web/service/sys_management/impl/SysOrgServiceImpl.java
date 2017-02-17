package com.ljwd.plms.web.service.sys_management.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.SysOrgMapper;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;
import com.ljwd.plms.web.service.sys_management.inf.SysOrgService;

@Service
public class SysOrgServiceImpl extends GenericServiceImpl<SysOrg, Long> implements
		SysOrgService {
	
	@Resource
	private SysOrgMapper sysOrgMapper;

	@Override
	public GenericDao<SysOrg, Long> getDao() {
		return sysOrgMapper;
	}

	@Override
	public List<SysOrg> selectByExample(SysOrgExample example) {
		return sysOrgMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description: 外访申请人员所属机构 
	* @param map
	* @return
	* @return
	 */
	@Override
	public List<SysOrg> selectOutVisitOrgByExample(Map<String, Object> map) {
		return sysOrgMapper.selectOutVisitOrgByExample(map);
	}

	/**
	 * 
	* @Description: 根据所属网点查找作业部催收员所属机构 
	* @param map
	* @return
	* @return List<Long>
	 */
	@Override
	public List<Long> selectOrgBySiteCode(Map<String, Object> map) {

		return sysOrgMapper.selectOrgBySiteCode(map);
	}

	
}
