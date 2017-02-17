package com.ljwd.plms.web.controller;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.PasswordHelper;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by zhengzw on 2016/7/11
 * 个人中心控制器
 */
//@Controller
//@RequestMapping("/person")
public class PersonController {

//    @Resource
//    private SysUserService sysUserService;
//
//    /**
//     * 密码修改
//     * */
//    @RequestMapping("toUpdatePwd")
//    public String toUpdatePwd(String oldPwd,String newPwd,String repeatPwd){
//        return "jsp/person/toUpdatePwd";
//    }
//
//    /**
//     * 密码修改
//     * @param oldPwd 旧密码
//     * @param newPwd 新密码
//     * @param repeatPwd 重复新密码
//     * */
//    @RequestMapping("updatePwd")
//    @ResponseBody
//    public JSONResult updatePwd(String oldPwd,String newPwd,String repeatPwd){
//        if(oldPwd == null || "".equals(oldPwd.trim())){
//            return new JSONResult(false,"请输入旧密码");
//        }
//        if(newPwd == null || "".equals(newPwd.trim())){
//            return new JSONResult(false,"请输入新密码");
//        }
//        if(repeatPwd == null || "".equals(repeatPwd.trim())){
//            return new JSONResult(false,"请重新输入新密码");
//        }
//        if(!newPwd.equals(repeatPwd)){
//            return new JSONResult(false,"新密码不一致");
//        }
//
//        String userId = (String)SecurityUtils.getSubject().getPrincipal();              //用户ID
//        oldPwd = PasswordHelper.PasswordEncode(oldPwd, ("" + userId.hashCode()));       //加密
//        SysUser sysUser = sysUserService.authentication(new SysUser(userId,oldPwd));
//        if(sysUser == null){
//            return new JSONResult(false,"旧密码不正确");
//        }
//
//        newPwd = PasswordHelper.PasswordEncode(newPwd, ("" + userId.hashCode()));       //加密
//
//        SysUser user = new SysUser();
//        user.setUserId(userId);
//        user.setRecVer(sysUser.getRecVer());
//        user.setPwd(newPwd);
//        user.setUpdatedBy(userId);
//        user.setUpdateTime(new Date());
//        int ret = sysUserService.update(user);
//        if(ret < 1){
//            return new JSONResult(false,"密码修改失败");
//        }
//
//        return new JSONResult(true,"修改密码成功");
//    }

}
