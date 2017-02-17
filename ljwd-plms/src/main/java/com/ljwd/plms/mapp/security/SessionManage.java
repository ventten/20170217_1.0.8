package com.ljwd.plms.mapp.security;

import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;

/**
 * 会话管理工具
 * Created by tangjialin on 2016-10-20 0020.
 */
public class SessionManage {
    /** APP登录用户信息缓存至session中的key */
    public static final String APP_SESSION_USER_KEY = "APP_SESSION_USER";
    public static final SessionManage api = new SessionManage();

    protected SessionManage() {
    }

    /**
     * 获取会话中的用户信息
     * @return 返回用户信息, 获取失败返回null
     */
    public AppUserVo getLoginUser() {
        Session session = SecurityUtils.getSubject().getSession(false);
        return getLoginUser(session);
    }

    /**
     * 获取会话中的用户信息
     * @param session 会话实例
     * @return 返回用户信息, 获取失败返回null
     */
    public AppUserVo getLoginUser(Session session) {
        if (session == null) { return null; }
        return (AppUserVo) session.getAttribute(APP_SESSION_USER_KEY);
    }

    /**
     * 将用户信息缓存至当前会话实例中
     * @param loginUser 需要缓存的用户信息
     */
    public void setLoginUser(AppUserVo loginUser) {
        setLoginUser(loginUser, SecurityUtils.getSubject().getSession(false));
    }

    /**
     * 将用户信息缓存至当前会话实例中
     * @param loginUser 需要缓存的用户信息
     * @param session   缓存用户信息的会话实例
     */
    public void setLoginUser(AppUserVo loginUser, Session session) {
        if (loginUser == null) { throw new IllegalArgumentException("用户信息为空"); }
        if (session == null) { throw new IllegalArgumentException("会话信息为空"); }
        session.setAttribute(APP_SESSION_USER_KEY, loginUser);
    }

}
