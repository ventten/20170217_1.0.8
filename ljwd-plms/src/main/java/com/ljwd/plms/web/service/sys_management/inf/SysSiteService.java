package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.sys_management.SysSite;
import com.ljwd.plms.web.model.sys_management.SysSiteExample;

public interface SysSiteService extends GenericService<SysSite, String> {

    List<SysSite> selectByExample(SysSiteExample example);
    /**
     * 
    * @Description: 查询此机构下对应的所有网点 
    * @param orgId
    * @return
    * @return List<SysSite>
     */
    List<SysSite> selectSiteByOrgId(Long orgId);
}
