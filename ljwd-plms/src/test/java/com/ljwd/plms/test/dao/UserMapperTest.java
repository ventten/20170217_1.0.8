package com.ljwd.plms.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.test.TestSupport;
import com.ljwd.plms.web.dao.sys_management.SysUserMapper;
import com.ljwd.plms.web.model.sys_management.SysUser;

public class UserMapperTest extends TestSupport {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    public void test_selectByExampleAndPage() {
//        start();
//        Page<SysUser> page = new Page<>(1, 3);
//        SysUserExample example = new SysUserExample();
//        example.createCriteria().andUserIdGreaterThan("");
//        final List<SysUser> users = sysUserMapper.selectByExampleAndPage(page, example);
//        for (SysUser user : users) {
//            System.err.println(user);
//        }
//        end();
    }
}
