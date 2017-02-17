package com.ljwd.plms.web.controller.sys_management;


import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.RSAUtils;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.sys_management.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRoleService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsUserRoleService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.sys_management.RoleIdNameDto;

import org.apache.commons.codec.binary.Hex;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户控制器
 **/
@Controller
@RequestMapping(value = "/user")
public class SysUserController {
    //private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private PlmsRoleService roleService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private PlmsUserRoleService userRoleService;

    /**
     * 用户登录
     * @param user 用户名和密码
     * @param remember 是否记住用户名Cookies
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult login(SysUser user,Boolean remember,Model model,HttpServletRequest request,HttpServletResponse response) {
    	try {
            HttpSession session = request.getSession();
            Object obj = session.getAttribute("session");
            // 已登陆,跳到首页
            if (obj != null) {
                return new JSONResult(true);
            }

    		// 服务器端,使用RSAUtils工具类对密文进行解密
    		// RSA解密
            String userId = URLDecoder.decode(RSAUtils.decryptStringByJs(user.getUserId()),"UTF-8");
            String pwd = URLDecoder.decode(RSAUtils.decryptStringByJs(user.getPwd()),"UTF-8");
            if(StringUtil.isEmpty(userId) || StringUtil.isEmpty(pwd)){
            	return new JSONResult(false,"用户名和密码不能为空");
            }

            // shiro登录
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(userId, pwd);
            subject.login(token);

            SysUser sysUser = sysUserService.selectById(userId);
            // 设置超时时间
            //session.setMaxInactiveInterval(30);
            session.setAttribute("session", new SessionMsg(userId,sysUser.getUserName(),sysUser.getOrgId()));

            if(remember != null && remember){
                token.setRememberMe(true);
                //设置简单的cookie处理，此处理不能防止客户机被外人使用
                Cookie cookie = new Cookie("userId", URLEncoder.encode(userId, "UTF-8"));
                // 设置为1天
                cookie.setMaxAge(3600*24);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
        } catch (AuthenticationException e) {
        	return new JSONResult(false,e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        	return new JSONResult(false,"用户名或密码错误");
        }
        return new JSONResult(true);
    }

    /**
     * 用户登出
     * @param session session
     */
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult logout(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
    	try{
            session.removeAttribute("session");
            // 登出操作
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
            // 清除登录用户的所有数据
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for(Cookie cookie : cookies){
                    if("userId".equals(cookie.getName())){
                        cookie.setValue(null);
                        // 立即销毁cookie
                        cookie.setMaxAge(0);
                        cookie.setPath("/");
                        response.addCookie(cookie);
                        break;
                    }
                }
            }
    	}catch(Exception e){
    		e.printStackTrace();
    		return new JSONResult(false,"退出失败");
    	}
        return new JSONResult(true);
    }

    /**
     * 获取加密的key
     */
    @RequestMapping(value = "/loginKey", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult loginKey(HttpSession session,HttpServletRequest request,HttpServletResponse response) {
    	try{
            Map<String,Object> map = new HashMap<String,Object>();
            RSAPublicKey publicKey = RSAUtils.getDefaultPublicKey();
            String modulus = new String(Hex.encodeHex(publicKey.getModulus().toByteArray()));
            String exponent =new String(Hex.encodeHex(publicKey.getPublicExponent().toByteArray()));
    		map.put("modulus", modulus);
    		map.put("exponent", exponent);
    		return new JSONResult(map);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new JSONResult(false,"系统错误，请联系管理员");
    	}
    }

    /**
     * pageUser页
     */
    @RequestMapping("/pageUser")
    @RequiresPermissions(PermissionSign.USER_SELECT)
    public String pageUser(Model model) {
        //角色集合
        List<PlmsRole> plmsRoleList = roleService.selectByExample(new PlmsRoleExample().setIsActive("Y"));
        List<RoleIdNameDto> roleList = new ArrayList<RoleIdNameDto>();
        if(plmsRoleList != null && plmsRoleList.size() > 0){
            for(PlmsRole plmsRole : plmsRoleList){
                RoleIdNameDto dto = new RoleIdNameDto();
                dto.setId(plmsRole.getId());
                dto.setRoleName(plmsRole.getRoleName());
                roleList.add(dto);
            }
        }
        model.addAttribute("roleList",roleList);
        return "jsp/sys_management/pageUser";
    }
    
    /**
     * 查询用户分页显示
     */
    @RequestMapping(value = "/pageUserData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.USER_SELECT)
    public String pageUserData(SysUserExample example) {
        if(example.getParamData() == null || "".equals(example.getParamData())){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }

        //分页条件
        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
        //记录操作的次数
        int sEcho = dataTableParam.getsEcho();
        //每页记录数
        int pageSize = dataTableParam.getiDisplayLength();
        //页数
        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

        example.setIsActive("Y");
        example.setOrderByClause("T.USER_ID DESC");
        //设置排序
        example.setOrderByClause(dataTableParam);
        Page<SysUser> pageData = new Page<SysUser>(pageNo, pageSize);

    	pageData = sysUserService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 角色分配页
     * @param userId 用户ID
     */
    @RequestMapping("/toAllotRole")
    @RequiresPermissions(PermissionSign.USER_ALLOT)
    public String toAllotRole(Model model,String userId) {
        if(userId == null || "".equals(userId)){
            throw new RuntimeException("参数异常");
        }

        SysUser selectedUser = sysUserService.selectByUserId(userId);                                   //查找用户
        if(selectedUser == null){
            throw new RuntimeException("未找到用户");
        }
        List<PlmsRole> userRoleList = roleService.selectRolesByUserId(userId);                          //根据用户ID查找角色
        PlmsRoleExample example = new PlmsRoleExample();
        example.setIsActive("Y");
        example.setOrderByClause("T.ROLE_NAME");
        List<PlmsRole> roleList = roleService.selectByExample(example);                                 //查找所有角色

        if(userRoleList != null && userRoleList.size() > 0 && roleList != null && roleList.size() > 0){
            for(PlmsRole role : roleList){
                for(PlmsRole userRole : userRoleList){
                    if(role.getId() - userRole.getId() == 0){
                        role.setHasRole(true);  //用户拥有此角色
                    }
                }
            }
        }

        model.addAttribute("selectedUser",selectedUser);
        model.addAttribute("roleList",roleList);

        return "jsp/sys_management/toAllotRole";
    }

    /**
     * 分配角色
     * @param userId 用户ID
     * @param roleIds 角色IDS
     */
    @RequestMapping("/allotRole")
    @ResponseBody
    @RequiresPermissions(PermissionSign.USER_ALLOT)
    public JSONResult allotRole(String userId,Long[] roleIds) {
        if(userId == null || "".equals(userId)){
            return new JSONResult(false,"参数错误");
        }
        if(roleIds == null){
            return new JSONResult(false,"请选择角色");
        }

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();

        //分配角色
        userRoleService.doAllotRole(userId, roleIds, loginUser);

        return new JSONResult(true,"分配角色成功");
    }
    
}
