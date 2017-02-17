package com.ljwd.plms.web.service.sys_management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsSysUserDataRangeMapper;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRange;
import com.ljwd.plms.web.model.sys_management.PlmsSysUserDataRangeExample;
import com.ljwd.plms.web.model.workorder_pool.PlmsCollectionRuleSet;
import com.ljwd.plms.web.service.sys_management.inf.PlmsSysUserDataRangeService;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;

@Service
public class PlmsSysUserDataRangeServiceImpl extends
		GenericServiceImpl<PlmsSysUserDataRange, Long> implements PlmsSysUserDataRangeService {

	@Resource
	private PlmsSysUserDataRangeMapper plmsSysUserDataRangeMapper;
	
	@Override
	public GenericDao<PlmsSysUserDataRange, Long> getDao() {
		return plmsSysUserDataRangeMapper;
	}
	
	/**
	 * 
	* @Description: 用户数据权限分页显示 
	* @param page
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<PlmsSysUserDataRange> selectByExampleAndPage(
			Page<PlmsSysUserDataRange> page, PlmsSysUserDataRangeExample example) {
		
		plmsSysUserDataRangeMapper.selectByExampleAndPage(page, example);
		
		return page;
	}

	@Override
	public List<PlmsSysUserDataRange> selectByExample(
			PlmsSysUserDataRangeExample example) {
		return plmsSysUserDataRangeMapper.selectByExample(example);
	}

	/**
	 * 
	* @Description: 新增用户数据权限
	* @param userId
	* @param orgIds
	* @param userName
	* @return
	 */
	@Override
	public void addUserDataRange(String userId, Long[] orgIds, String currentUserName) {
		List<PlmsSysUserDataRange> list = new ArrayList<PlmsSysUserDataRange>();
		for(Long orgId :orgIds){
			PlmsSysUserDataRange range = new PlmsSysUserDataRange();
			range.setOrgId(orgId);
			range.setUserId(userId);
			range.setGeneratedBy(currentUserName);
			range.setCreatedBy(currentUserName);
			range.setCreateTime(new Date());
			range.setUpdatedBy(currentUserName);
			range.setUpdateTime(new Date());
			range.setTagSeq(1L);
			range.setRecVer(0L);
			list.add(range);
		}
		plmsSysUserDataRangeMapper.insertBatch(list);
		
	}

	@Override
	public List<UserEmpOrgDto> selectByUserId(String userId,String orgId) {
		return plmsSysUserDataRangeMapper.selectByUserId(userId,orgId);
	}

	@Override
	public List<Long> selectOrgListByUserId(String userId) {
		return plmsSysUserDataRangeMapper.selectOrgListByUserId(userId);
	}

	/**
	 * 
	* @Description: 修改用户数据权限
	* @param userId
	* @param orgIds
	* @param userName
	* @return
	 */
	@Override
	public void updateUserDataRange(String userId, Long[] orgIdList,
			String currentUserName) {
		//1,先删除此用户之前机构权限
		PlmsSysUserDataRangeExample example = new PlmsSysUserDataRangeExample();
		example.setUserId(userId);
		plmsSysUserDataRangeMapper.deleteByExample(example);
		//2,添加新的机构权限
		List<PlmsSysUserDataRange> list = new ArrayList<PlmsSysUserDataRange>();
		for(Long orgId :orgIdList){
			PlmsSysUserDataRange range = new PlmsSysUserDataRange();
			range.setOrgId(orgId);
			range.setUserId(userId);
			range.setGeneratedBy(currentUserName);
			range.setCreatedBy(currentUserName);
			range.setCreateTime(new Date());
			range.setUpdatedBy(currentUserName);
			range.setUpdateTime(new Date());
			range.setTagSeq(1L);
			range.setRecVer(0L);
			list.add(range);
		}
		plmsSysUserDataRangeMapper.insertBatch(list);
	}

	/**
	 * 
	* @Description: 删除用户数据权限
	* @param userId
	* @return
	 */
	@Override
	public void deleteUserDataRange(String userId) {
		
		PlmsSysUserDataRangeExample example = new PlmsSysUserDataRangeExample();
		example.setUserId(userId);
		plmsSysUserDataRangeMapper.deleteByExample(example);
	}

	

}
