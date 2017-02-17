package com.ljwd.plms.web.dao.sys_management;

import java.util.List;

import com.ljwd.plms.web.model.sys_management.PlmsPermissionExample;
import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.sys_management.PlmsPermission;

/**
 * 系统权限表,plms_permission
 * */
public interface PlmsPermissionMapper extends GenericDao<PlmsPermission, Long>{

    int countByExample(PlmsPermissionExample example);

    int deleteByExample(PlmsPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsPermission record);

    int insertSelective(PlmsPermission record);

    List<PlmsPermission> selectByExample(PlmsPermissionExample example);

    PlmsPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsPermission record, @Param("example") PlmsPermissionExample example);

    int updateByExample(@Param("record") PlmsPermission record, @Param("example") PlmsPermissionExample example);

    int updateByPrimaryKeySelective(PlmsPermission record);

    int updateByPrimaryKey(PlmsPermission record);
    
    /**
     * 通过角色id 查询角色 拥有的权限
     * @param roleId 角色id
     * @return 实体集
     */
    List<PlmsPermission> selectPermissionsByRoleId(Long roleId);

    /**
     * 通过角色ID集合查找权限
     * @param roleIds 角色ID集合
     * @return 实体集
     */
    List<PlmsPermission> selectPermissionsByRoleIds(List<Long> roleIds);
    
}