package com.ljwd.plms.web.security;

/**
 * 角色标识配置类
 * 与 plms_role 角色表中的 role_sign 字段相对应
 * <pre>
 * @ RequiresRoles(value = RoleSign.ADMIN)
 * public String admin() {
 *     return "拥有admin角色,能访问";
 * }
 * </pre>
 **/
public class RoleSign {

    /**
     * 超级管理员 标识
     */
    public static final String SUP_ADMIN = "sup_admin";

    /**
     * 普通后台管理员 标识
     */
    public static final String ADMIN = "admin";

}
