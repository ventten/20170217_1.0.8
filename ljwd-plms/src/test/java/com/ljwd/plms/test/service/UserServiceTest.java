package com.ljwd.plms.test.service;

import java.util.Date;

import javax.annotation.Resource;

import com.ljwd.plms.test.TestSupport;
import com.ljwd.plms.core.util.ApplicationUtils;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;

public class UserServiceTest extends TestSupport {

    @Resource
    private SysUserService sysUserService;

//    @Test
    public void test_insert() {
        SysUser model = new SysUser();
        model.setUserId("starzou");
        model.setUserName("starzou");
        model.setPwd(ApplicationUtils.sha256Hex("123456"));
        model.setCreateTime(new Date());
        sysUserService.insert(model);
    }

//    @Test
    public void test_10insert() {
        for (int i = 0; i < 10; i++) {
        	SysUser model = new SysUser();
            model.setUserId("starzou"+i);
            model.setUserName("starzou"+i);
            model.setPwd(ApplicationUtils.sha256Hex("123456"));
            model.setCreateTime(new Date());
            sysUserService.insert(model);
        }
    }

}
