package com.ljwd.plms.web.service.sys_management.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.model.sys_management.PlmsRoleExample;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermission;
import com.ljwd.plms.web.model.sys_management.PlmsRolePermissionExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRolePermissionService;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsRoleMapper;
import com.ljwd.plms.web.model.sys_management.PlmsRole;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRoleService;

/**
 * 系统角色表,plms_role
 * */
@Service
public class PlmsRoleServiceImpl extends GenericServiceImpl<PlmsRole, Long> implements PlmsRoleService {

    @Resource
    private PlmsRoleMapper plmsRoleMapper;
    @Resource
    private PlmsRolePermissionService rolePermissionService;

    @Override
    public GenericDao<PlmsRole, Long> getDao() {
        return plmsRoleMapper;
    }

    /**
     * 通过用户id 查询用户 拥有的角色
     * @param userId 用户id
     * @return 实体集
     */
    @Override
    public List<PlmsRole> selectRolesByUserId(String userId) {
        return plmsRoleMapper.selectRolesByUserId(userId);
    }

    /**
     * 条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsRole> selectByExample(PlmsRoleExample example) {
        return plmsRoleMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsRole> selectByExampleAndPage(Page<PlmsRole> page, PlmsRoleExample example) {
        plmsRoleMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 添加角色
     * @param role    角色
     * @param permIds 权限ID数组
     * @param loginUser 操作员
     */
    @Override
    public void addRole(PlmsRole role, Long[] permIds,String loginUser) {
        int ret = plmsRoleMapper.insert(role);
        if(ret <= 0){
            throw new RuntimeException("添加角色失败");
        }

        Long roleId = role.getId();     //角色ID

        //角色权限集合
        List<PlmsRolePermission> permList = new ArrayList<>();
        Date time = new Date();
        for(int i = 0 ; i < permIds.length ; i++){
            PlmsRolePermission perm = new PlmsRolePermission();
            perm.setRoleId(roleId);
            perm.setPermissionId(permIds[i]);
            perm.setIsActive("Y");
            perm.setCreateTime(time);
            perm.setCreatedBy(loginUser);
            perm.setUpdateTime(time);
            perm.setUpdatedBy(loginUser);
            perm.setRecVer(0L);
            perm.setTagSeq(0L);
            permList.add(perm);
        }
        //添加角色权限
        rolePermissionService.insertBatch(permList);
    }

    /**
     * 修改角色
     * @param role      角色
     * @param permIds   权限ID数组
     * @param loginUser 操作员
     */
    @Override
    public void updateRole(PlmsRole role, Long[] permIds, String loginUser) {
        int ret = plmsRoleMapper.updateByPrimaryKeySelective(role);
        if(ret <= 0){
            throw new RuntimeException("修改角色失败");
        }

        Long roleId = role.getId();     //角色ID

        //根据角色ID删除原有的角色权限记录
        rolePermissionService.deleteByExample(new PlmsRolePermissionExample().setRoleId(roleId));

        //角色权限集合
        List<PlmsRolePermission> permList = new ArrayList<>();
        Date time = new Date();
        for(int i = 0 ; i < permIds.length ; i++){
            PlmsRolePermission perm = new PlmsRolePermission();
            perm.setRoleId(roleId);
            perm.setPermissionId(permIds[i]);
            perm.setIsActive("Y");
            perm.setCreateTime(time);
            perm.setCreatedBy(loginUser);
            perm.setUpdateTime(time);
            perm.setUpdatedBy(loginUser);
            perm.setRecVer(0L);
            perm.setTagSeq(0L);
            permList.add(perm);
        }
        //添加角色权限
        rolePermissionService.insertBatch(permList);
    }

    /**
     * 根据条件删除
     * @param example 删除条件
     * @return 删除记录数
     */
    @Override
    public int deleteByExample(PlmsRoleExample example) {
        return plmsRoleMapper.deleteByExample(example);
    }

    /**
     * 插入对象
     * @param plmsRole 对象
     */
    @Override
    public int insert(PlmsRole plmsRole) {
        return plmsRoleMapper.insert(plmsRole);
    }

}
