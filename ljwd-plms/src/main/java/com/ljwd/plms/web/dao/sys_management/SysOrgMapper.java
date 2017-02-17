package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.SysOrg;
import com.ljwd.plms.web.model.sys_management.SysOrgExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysOrgMapper extends GenericDao<SysOrg, Long>  {
    int countByExample(SysOrgExample example);

    int deleteByExample(SysOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOrg record);

    int insertSelective(SysOrg record);

    List<SysOrg> selectByExample(SysOrgExample example);

    SysOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    int updateByExample(@Param("record") SysOrg record, @Param("example") SysOrgExample example);

    int updateByPrimaryKeySelective(SysOrg record);

    int updateByPrimaryKey(SysOrg record);
    
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