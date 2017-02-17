package com.ljwd.plms.web.security;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.ljwd.plms.core.util.PasswordHelper;
import com.ljwd.plms.web.model.sys_management.PlmsPermissionExample;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import com.ljwd.plms.web.model.sys_management.PlmsPermission;
import com.ljwd.plms.web.model.sys_management.PlmsRole;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.service.sys_management.inf.PlmsPermissionService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsRoleService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;

/**
 * 用户身份验证,授权 Realm 组件
 **/
//@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {

    private static final String OR = ",";
    private static final String AND = "&&";
    private static final String NOT = "!";

    @Resource
    private SysUserService sysUserService;
    @Resource
    private PlmsRoleService plmsRoleService;
    @Resource
    private PlmsPermissionService plmsPermissionService;
    @Resource
    private CacheManager cacheManager;

    /**
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String userId = String.valueOf(token.getPrincipal());
        //登录缓存
        Long[] longArr = getUserCache(userId);
        //当前登录错误次数
        int nowCount = longArr == null ? 0 : longArr.length;
        if(nowCount >= 3){
            throw new AuthenticationException("账号已被锁定,暂时无法登录");
        }
        String password = new String((char[]) token.getCredentials());
        // 通过数据库进行验证
        SysUser info = sysUserService.selectByUserId(userId);
        if ( info == null || !"Y".equals(info.getIsActive()) || !info.getPwd().equals(PasswordHelper.PasswordEncode(password,(info.getSalt()))) ) {
            String msg = null;
            //剩余登录次数
            int remainCount = 2 - nowCount <= 0 ? 0 : 2 - nowCount;
            if(remainCount == 0){
                msg = "登录次数超过限制,账号已被锁定";
            }else {
                msg = "用户名或密码错误，您还有" + remainCount + "次机会";
            }
            //用户名或密码错误,添加缓存
            addUserCache(userId,longArr);
            throw new AuthenticationException(msg);
        }
        if(nowCount > 0){
            //如果登录成功,移除缓存
            removeUserCache(userId);
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userId, password, getName());
        return authenticationInfo;
    }

    /**
     * 权限检查
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String userId = String.valueOf(principals.getPrimaryPrincipal());

        List<PlmsRole> roleList = plmsRoleService.selectRolesByUserId(userId);      //通过用户id查询用户拥有的角色
        List<Long> roleIds = new ArrayList<Long>();                                 //角色ID集合
        boolean isAdmin = false;                                                    //是否是管理员
        if(roleList != null){
            for (PlmsRole role : roleList) {
                String roleSign = role.getRoleSign();
                authorizationInfo.addRole(roleSign);                                    //添加角色到shiro缓存
                roleIds.add(role.getId());
                if(RoleSign.ADMIN.equals(roleSign)){
                    isAdmin = true;
                }
            }
        }

        //权限集合
        List<PlmsPermission> permissionList = null;

        //如果是管理员
        if(isAdmin){
            //查找所以权限
            permissionList = plmsPermissionService.selectByExample(new PlmsPermissionExample().setIsActive("Y"));
        }else {
            //通过角色ID集合查找权限
            permissionList = plmsPermissionService.selectPermissionsByRoleIds(roleIds);
        }

        if(permissionList != null){
            for (PlmsPermission permission : permissionList) {
                //添加权限到shiro缓存
                authorizationInfo.addStringPermission(permission.getPermissionSign());
            }
        }

        return authorizationInfo;
    }

    /**
     * 权限认证判断重写,使页面shiro:hasPermission标签支持与(&&)或(,)非(!)关键词 ,不支持与(&&)或(,)混用
     * @param principals 当前登录用户
     * @param permission 权限(shiro:hasPermission标签的name值)
     * @return boolean
     */
    @Override
    public boolean isPermitted(PrincipalCollection principals, String permission) {
        if(permission.contains(OR)) {
            String[] permissions = permission.split(OR);
            for(String orPermission : permissions) {
                if(isPermittedWithNotOperator(principals, orPermission)) {
                    return true;
                }
            }
            return false;
        } else if(permission.contains(AND)) {
            String[] permissions = permission.split(AND);
            for(String orPermission : permissions) {
                if(!isPermittedWithNotOperator(principals, orPermission)) {
                    return false;
                }
            }
            return true;
        } else {
            return isPermittedWithNotOperator(principals, permission);
        }
    }

    private boolean isPermittedWithNotOperator(PrincipalCollection principals, String permission) {
        if(permission.startsWith(NOT)) {
            return !super.isPermitted(principals, permission.trim().substring(NOT.length()).trim());
        } else {
            return super.isPermitted(principals, permission.trim());
        }
    }

    /**
     * 根据用户名获取登录缓存
     * @param userId 用户ID
     * @return Long[]
     */
    private Long[] getUserCache(String userId){
        return (Long[])cacheManager.getCache("loginCache").get(userId);
    }

    /**
     * 根据用户名移除登录缓存
     * @param userId 用户ID
     */
    private void removeUserCache(String userId){
        cacheManager.getCache("loginCache").remove(userId);
    }

    /**
     * 根据用户名添加登录缓存
     * @param userId 用户ID
     */
    private void addUserCache(String userId,Long[] longArr){
        if(longArr == null){
            longArr = new Long[1];
            longArr[0] = System.currentTimeMillis();
            cacheManager.getCache("loginCache").put(userId,longArr);
        }else {
            Long[] newLongArr = new Long[longArr.length + 1];
            for(int i = 0 ; i < longArr.length ; i++){
                newLongArr[i] = longArr[i];
            }
            newLongArr[newLongArr.length - 1] = System.currentTimeMillis();
            cacheManager.getCache("loginCache").put(userId,newLongArr);
        }
    }

}
