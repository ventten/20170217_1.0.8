package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManage;
import com.ljwd.plms.web.model.sys_management.PlmsSysBranchManageExample;
import com.ljwd.plms.web.vo.sys_management.BranchManageResult;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsSysBranchManageMapper extends GenericDao<PlmsSysBranchManage,Long>{
    int countByExample(PlmsSysBranchManageExample example);

    int deleteByExample(PlmsSysBranchManageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsSysBranchManage record);

    int insertSelective(PlmsSysBranchManage record);

    List<PlmsSysBranchManage> selectByExample(PlmsSysBranchManageExample example);

    PlmsSysBranchManage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsSysBranchManage record, @Param("example") PlmsSysBranchManageExample example);

    int updateByExample(@Param("record") PlmsSysBranchManage record, @Param("example") PlmsSysBranchManageExample example);

    int updateByPrimaryKeySelective(PlmsSysBranchManage record);

    int updateByPrimaryKey(PlmsSysBranchManage record);
    
    /**
	 * 
	* @Description: 分行监管分页查询 
	* @param page
	* @param example
	* @return
	* @return Page<PlmsOrgScopeRelation>
	 */
	List<BranchManageResult> selectByExampleAndPage(Page<BranchManageResult> page, PlmsEmpCollectorParam example);
	
}