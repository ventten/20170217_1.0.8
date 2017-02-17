package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.sys_management.PlmsUserRoleMapper;
import com.ljwd.plms.web.model.sys_management.PlmsUserRole;
import com.ljwd.plms.web.model.sys_management.PlmsUserRoleExample;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户角色表,plms_user_role
 * */
@Service
public class PlmsUserRoleServiceImpl extends GenericServiceImpl<PlmsUserRole,Long> implements PlmsUserRoleService {

    @Resource
    private PlmsUserRoleMapper plmsUserRoleMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsUserRole, Long> getDao() {
        return plmsUserRoleMapper;
    }

    /**
     * 根据条件删除
     * @param example 条件
     * @return int 删除记录数
     */
    @Override
    public int deleteByExample(PlmsUserRoleExample example) {
        return plmsUserRoleMapper.deleteByExample(example);
    }

    /**
     * 分配权限
     * @param userId    用户ID
     * @param roleIds   角色ID数组
     * @param loginUser 操作员
     */
    @Override
    public void doAllotRole(String userId, Long[] roleIds, String loginUser) {
        //根据用户ID删除已有的角色
        plmsUserRoleMapper.deleteByExample(new PlmsUserRoleExample().setUserId(userId));

        if(roleIds != null){
            List<PlmsUserRole> userRoleList = new ArrayList<>();
            Date time = new Date();
            for(int i = 0;i < roleIds.length;i++){
                PlmsUserRole userRole = new PlmsUserRole();
                userRole.setUserId(userId);
                userRole.setRoleId(roleIds[i]);
                userRole.setIsActive("Y");
                userRole.setCreatedBy(loginUser);
                userRole.setCreateTime(time);
                userRole.setUpdatedBy(loginUser);
                userRole.setUpdateTime(time);
                userRole.setRecVer(0L);
                userRole.setTagSeq(0L);

                userRoleList.add(userRole);
            }
            //添加新的角色权限
            plmsUserRoleMapper.insertBatch(userRoleList);
        }
    }

    /**
     * 根据条件查询
     * @param example 条件
     * @return 实体集
     */
    @Override
    public List<PlmsUserRole> selectByExample(PlmsUserRoleExample example) {
        return plmsUserRoleMapper.selectByExample(example);
    }

}
