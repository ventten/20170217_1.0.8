package com.ljwd.plms.web.service.sys_management.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ljwd.plms.web.model.sys_management.PlmsPermissionExample;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsPermissionMapper;
import com.ljwd.plms.web.model.sys_management.PlmsPermission;
import com.ljwd.plms.web.service.sys_management.inf.PlmsPermissionService;

/**
 * 系统权限表,plms_permission
 * */
@Service
public class PlmsPermissionServiceImpl extends GenericServiceImpl<PlmsPermission, Long> implements PlmsPermissionService {

    @Resource
    private PlmsPermissionMapper plmsPermissionMapper;


    @Override
    public GenericDao<PlmsPermission, Long> getDao() {
        return plmsPermissionMapper;
    }

    /**
     * 通过查询条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsPermission> selectByExample(PlmsPermissionExample example) {
        return plmsPermissionMapper.selectByExample(example);
    }

    /**
     * 通过角色id 查询角色 拥有的权限
     * @param roleId 角色id
     * @return 实体集
     */
    @Override
    public List<PlmsPermission> selectPermissionsByRoleId(Long roleId) {
        return plmsPermissionMapper.selectPermissionsByRoleId(roleId);
    }

    /**
     * 通过角色ID集合查找权限
     * @param roleIds 角色ID集合
     * @return 实体集
     */
    @Override
    public List<PlmsPermission> selectPermissionsByRoleIds(List<Long> roleIds) {
        if(roleIds == null || roleIds.size() == 0){
            return null;
        }
        return plmsPermissionMapper.selectPermissionsByRoleIds(roleIds);
    }

}
