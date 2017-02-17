package com.ljwd.plms.web.security;

import com.ljwd.plms.web.vo.SessionMsg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhengzw on 2016/8/24
 * 登录信息工具类
 */
public class SubjectUtil {

    /**
     * 获取当前登录用户ID
     * @return userId
     * */
    public static String getUserId(){
        return (String)SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * 获取Session
     * @param request request
     * @return SessionMsg
     * */
    public static SessionMsg getSession(HttpServletRequest request){
        return (SessionMsg)request.getSession().getAttribute("session");
    }

    /**
     * 获取Subject
     * @return Subject
     * */
    public static Subject getSubject(){
        return SecurityUtils.getSubject();
    }

    /**
     * 判断是否有此角色
     * @param roleSign 角色标识
     * @return boolean
     * */
    public static boolean hasRole(String roleSign){
        return getSubject().hasRole(roleSign);
    }

    /**
     * 判断是否有此权限
     * @param permissionSign 权限标识
     * @return boolean
     * */
    public static boolean isPermitted(String permissionSign){
        return getSubject().isPermitted(permissionSign);
    }

}
