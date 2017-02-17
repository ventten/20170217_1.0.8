package com.ljwd.plms.mapp.security;

import com.ljwd.plms.core.util.PasswordHelper;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.List;

/**
 * 移动应用授权处理器
 * Created by tangjialin on 2016-10-12 0012.
 */
public class SecurityRealm extends AuthorizingRealm {
//    /** 用户权限信息缓存key */
//    public final static String AUTHORIZATION_KEY = "AUTHORIZATION_INFO";
    @Resource
    private SysUserService sysUserService;

    /**
     * 权限操作
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        // 增加权限认证后使用此功能
//        Session session = SecurityUtils.getSubject().getSession(false);
//        SimpleAuthorizationInfo authorizationInfo = (SimpleAuthorizationInfo) session.getAttribute(AUTHORIZATION_KEY);
//        return authorizationInfo;
        throw new UnsupportedOperationException("APP权限管理待完善");
    }

    /**
     * 身份验证操作
     * @param token
     * @return 验证成功返回SimpleAuthenticationInfo
     * @throws AuthenticationException 验证失败
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
//		String username = upToken.getUsername();
//		char[] upTokenPassword = upToken.getPassword();
//		String password = upTokenPassword == null ? null : String.valueOf(upTokenPassword);
        String principal = (String) token.getPrincipal();
        char[] credentials = (char[]) token.getCredentials();
        if (StringUtils.isEmpty(principal) || credentials == null || credentials.length == 0) {
            throw new AuthenticationException("用户名或密码为空");
        }
        List<AppUserVo> userList = null;
        // 判断登录账户类型,对sql查询做的优化处理
        if (principal.length() == 11 && StringUtil.isMobile(principal)) {
            // 手机号码登录
            userList = sysUserService.selectUser(null, principal);
        } else {
            // 员工编号登录
            userList = sysUserService.selectUser(principal, null);
        }
        int size = userList == null ? 0 : userList.size();
        if (size == 0) { throw new AuthenticationException("账号或密码错误"); }
        if (size > 1) { throw new AuthenticationException("存在重复的用户信息"); }
        String password = new String(credentials);
//        AppUserVo loginUser = null;
//        for (AppUserVo user : userList) {
//            if (PasswordHelper.PasswordEncode(password, user.getSalt()).equals(user.getPwd())) {
//                sysUser = user;
//                break;
//            }
//        }
        AppUserVo loginUser = userList.get(0);
        if (!PasswordHelper.PasswordEncode(password, loginUser.getSalt()).equals(loginUser.getPwd())) { throw new AuthenticationException("账号或密码错误"); }
        loginUser.setPwd(null).setSalt(null); // 为保证用户信息安全,密码和盐值置空
        Session session = SecurityUtils.getSubject().getSession();
        SessionManage.api.setLoginUser(loginUser, session);
//        // 增加权限认证后使用此功能
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        session.setAttribute(AUTHORIZATION_KEY, authorizationInfo);
        return new SimpleAuthenticationInfo(principal, credentials, getName());
    }
}
