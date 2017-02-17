package com.ljwd.plms.web.service.sys_management.impl;



import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsSysBranchManageMapper;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManage;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManageExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsBranchManageService;
import com.ljwd.plms.web.vo.sys_management.BranchManageResult;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

@Service
public class PlmsBranchManageServiceImpl extends GenericServiceImpl<PlmsSysBranchManage, Long>
		implements PlmsBranchManageService {

	@Resource
	private PlmsSysBranchManageMapper plmsSysBranchManageMapper; 
	
	
	@Override
	public GenericDao<PlmsSysBranchManage, Long> getDao() {

		return plmsSysBranchManageMapper;
	}

	/**
	 * 
	* @Description: 分行监管分页查询 
	* @param page
	* @param example
	* @return
	* @return
	 */
	@Override
	public Page<BranchManageResult> selectByExampleAndPage(
			Page<BranchManageResult> page, PlmsEmpCollectorParam example) {

		plmsSysBranchManageMapper.selectByExampleAndPage(page, example);

		return page;
	}

	/**
	 * 
	* @Description: 查询此用户是否已经存在  
	* @param manageExample
	* @return
	* @return
	 */
	@Override
	public Integer countByExample(PlmsSysBranchManageExample manageExample) {

		return plmsSysBranchManageMapper.countByExample(manageExample);
	}

	/**
	 * 
	* @Description: 新增分行监管数据 
	* @param example
	* @param createBy
	* @return
	 */
	@Override
	public void insertBranchManage(PlmsSysBranchManageExample example,
			String createBy) {
		String[] siteCodes = example.getSiteCode();
		String userId = example.getUserId();
		if(siteCodes.length>0){
			for(int i=0;i<siteCodes.length;i++){
				PlmsSysBranchManage manage = new PlmsSysBranchManage();
				manage.setUserId(userId);
				manage.setSiteCode(siteCodes[i]);
				manage.setIsActive("Y");
				manage.setCreatedBy(createBy);
				manage.setCreateTime(new Date());
				manage.setUpdatedBy(createBy);
				manage.setUpdateTime(new Date());
				plmsSysBranchManageMapper.insertSelective(manage);
			}
		}
		
	}

	/**
	 * 
	* @Description:  修改分行监管数据  
	* @param example
	* @param updateBy
	* @return
	 */
	@Override
	public void updateBranchManage(PlmsSysBranchManageExample set,
			String updateBy) {
		//1,删除原有的
		String userId = set.getUserId();
		PlmsSysBranchManageExample example= new PlmsSysBranchManageExample();
		example.setUserId(userId);
		plmsSysBranchManageMapper.deleteByExample(example);
		//2,插入新记录
		insertBranchManage(set,updateBy);
		
	}

	/**
	 * 
	* @Description: 根据userId删除数据 
	* @param userId
	* @return
	* @return
	 */
	@Override
	public int deleteByUserId(String userId) {
		PlmsSysBranchManageExample example= new PlmsSysBranchManageExample();
		example.setUserId(userId);
		int count = plmsSysBranchManageMapper.deleteByExample(example);
		return count;
	}

	/***
	 * 
	* @Description: 查询当前登录用户是否有分行监管的权限 
	* @param ex
	* @return
	* @return
	 */
	@Override
	public List<PlmsSysBranchManage> selectByExample(
			PlmsSysBranchManageExample ex) {
		
		return plmsSysBranchManageMapper.selectByExample(ex);
	}

	
	
	
	

}
