package com.ljwd.plms.web.service.sys_management.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.SysSiteMapper;
import com.ljwd.plms.web.model.sys_management.SysSite;
import com.ljwd.plms.web.model.sys_management.SysSiteExample;
import com.ljwd.plms.web.service.sys_management.inf.SysSiteService;
@Service
public class SysSiteServiceImpl extends GenericServiceImpl<SysSite, String> implements
		SysSiteService {

	@Resource
	private SysSiteMapper sysSiteMapper;
	
	@Override
	public List<SysSite> selectByExample(SysSiteExample example) {
		return sysSiteMapper.selectByExample(example);
	}

	@Override
	public GenericDao<SysSite, String> getDao() {
		return sysSiteMapper;
	}

	/**
	 * 
	* @Description: 查询此机构下对应的所有网点 
	* @param orgId
	* @return
	* @return
	 */
	@Override
	public List<SysSite> selectSiteByOrgId(Long orgId) {
		return sysSiteMapper.selectSiteByOrgId(orgId);
	}

	

}
