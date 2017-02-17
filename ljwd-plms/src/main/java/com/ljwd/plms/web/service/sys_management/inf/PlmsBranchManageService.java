package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManage;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManageExample;
import com.ljwd.plms.web.vo.sys_management.BranchManageResult;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

public interface PlmsBranchManageService extends GenericService<PlmsSysBranchManage, Long>{

	/**
	 * 
	* @Description: 分行监管分页查询 
	* @param page
	* @param example
	* @return
	* @return Page<PlmsOrgScopeRelation>
	 */
	Page<BranchManageResult> selectByExampleAndPage(Page<BranchManageResult> page, PlmsEmpCollectorParam example);
	/**
	 * 
	* @Description: 查询此用户是否已经存在 
	* @param manageExample
	* @return
	* @return Integer
	 */
	Integer countByExample(PlmsSysBranchManageExample manageExample);
	
	/**
	 * 
	* @Description: 新增分行监管数据
	* @param example
	* @param createBy
	* @return void
	 */
	void insertBranchManage(PlmsSysBranchManageExample example, String createBy);
	/**
	 * 
	* @Description: 修改分行监管数据 
	* @param example
	* @param updateBy
	* @return void
	 */
	void updateBranchManage(PlmsSysBranchManageExample example, String updateBy);
	/**
	 * 
	* @Description: 根据userId 删除数据 
	* @param userId
	* @return
	* @return int
	 */
	int deleteByUserId(String userId);
	/**
	 * 
	* @Description: 查询当前登录用户是否有分行监管的权限
	* @param ex
	* @return
	* @return List<BranchManageResult>
	 */
	List<PlmsSysBranchManage> selectByExample(PlmsSysBranchManageExample ex);
}
