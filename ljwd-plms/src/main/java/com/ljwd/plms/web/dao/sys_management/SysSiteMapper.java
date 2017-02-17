package com.ljwd.plms.web.dao.sys_management;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.SysSite;
import com.ljwd.plms.web.model.sys_management.SysSiteExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysSiteMapper extends GenericDao<SysSite, String> {
    int countByExample(SysSiteExample example);

    int deleteByExample(SysSiteExample example);

    int deleteByPrimaryKey(String siteCode);

    int insert(SysSite record);

    int insertSelective(SysSite record);

    List<SysSite> selectByExample(SysSiteExample example);

    SysSite selectByPrimaryKey(String siteCode);

    int updateByExampleSelective(@Param("record") SysSite record, @Param("example") SysSiteExample example);

    int updateByExample(@Param("record") SysSite record, @Param("example") SysSiteExample example);

    int updateByPrimaryKeySelective(SysSite record);

    int updateByPrimaryKey(SysSite record);
    
    /**
     * 
    * @Description: 查询此机构下对应的所有网点 
    * @param orgId
    * @return
    * @return List<SysSite>
     */
    List<SysSite> selectSiteByOrgId(@Param("orgId")Long orgId);
}