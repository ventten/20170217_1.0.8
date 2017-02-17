package com.ljwd.plms.web.service.sys_management.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import com.ljwd.plms.web.dao.sys_management.SysUserMapper;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.sys_management.SysUserExample;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.sys_management.SysUserExtention;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 系统用户表,sys_user
 */
@Service
public class SysUserServiceImpl extends GenericServiceImpl<SysUser, String> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public GenericDao<SysUser, String> getDao() {
        return sysUserMapper;
    }

    @Override
    public int insert(SysUser model) {
        return sysUserMapper.insertSelective(model);
    }

    @Override
    public int update(SysUser model) {
        return sysUserMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(String id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysUser selectById(String id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 用户登录验证查询
     * @param user 登录用户
     * @return SysUser
     */
    @Override
    public SysUser authentication(SysUser user) {
        return sysUserMapper.authentication(user);
    }

    /**
     * 根据用户名查询用户
     * @param userId 用户名
     * @return SysUser
     */
    @Override
    public SysUser selectByUserId(String userId) {
        SysUserExample example = new SysUserExample();
        example.setUserId(userId);
        List<SysUser> list = sysUserMapper.selectByExample(example);
        return list == null || list.size() == 0 ? null : list.get(0);
    }

    /**
     * 条件查询
     * @param example 查询条件
     * @return 集合
     */
    @Override
    public List<SysUser> selectByExample(SysUserExample example){
        return sysUserMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<SysUser> selectByExampleAndPage(Page<SysUser> page, SysUserExample example) {
        sysUserMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 条件查询
     * @param map 查询未离职
     * @return 集合
     */
    @Override
    public List<SysUser> selectByMap(Map<String, Object> map) {
        return sysUserMapper.selectByMap(map);
    }

    /**
     * 查找催收人员机构信息
     * @param orgId  机构ID,可空
     * @param userId 用户ID,可空(当前登录用户为管理员时传null,查所有的催收人员机构信息;不为空时查当前登录用户同机构及下属机构的催收人员机构信息)
     * @return 实体集
     */
    @Override
    public List<UserEmpOrgDto> selectUserEmpOrg(Long orgId, String userId) {
        return sysUserMapper.selectUserEmpOrg(orgId, userId);
    }

    /* 根据用户ID查询用户分机
     * @param userId 用户ID
     * @return 实体
     */
    @Override
    public SysUserExtention selectUserExtentionByUserId(String userId) {
        if (userId == null || userId.isEmpty()) {
            return null;
        }
        return sysUserMapper.selectUserExtentionByUserId(userId);
    }

    /**
     * @param orgId
     * @param status
     * @return
     * @Description: 查找特定区间的催收员信息
     */
    @Override
    public List<UserEmpOrgDto> selectUserEmpOrgByStatus(Long orgId, String status) {
        return sysUserMapper.selectUserEmpOrgByStatus(orgId, status);
    }

    /**
     * 查询用户信息
     * @param empNo  员工编号
     * @param mobile 外访表绑定的手机号码
     * @return 返回用户信息
     */
    public List<AppUserVo> selectUser(String empNo, String mobile) {
        return sysUserMapper.selectUser(empNo, mobile);
    }
}
