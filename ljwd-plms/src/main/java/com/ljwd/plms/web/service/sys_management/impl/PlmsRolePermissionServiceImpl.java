package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsRolePermissionMapper;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermission;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermissionExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 角色权限表,plms_role_permission
 * */
@Service
public class PlmsRolePermissionServiceImpl extends GenericServiceImpl<PlmsRolePermission, Long> implements PlmsRolePermissionService {

    @Resource
    private PlmsRolePermissionMapper plmsRolePermissionMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsRolePermission, Long> getDao() {
        return plmsRolePermissionMapper;
    }

    /**
     * 根据条件删除
     * @param example 条件
     * @return int 删除记录数
     */
    @Override
    public int deleteByExample(PlmsRolePermissionExample example) {
        return plmsRolePermissionMapper.deleteByExample(example);
    }

}
