package com.ljwd.plms.web.controller.sys_management;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.sys_management.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.sys_management.inf.*;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 角色控制器
 **/
@Controller
@RequestMapping(value = "/role")
public class RoleController {

    @Resource
    private PlmsRoleService roleService;
    @Resource
    private PlmsFuncService funcService;
    @Resource
    private PlmsUserRoleService userRoleService;
    @Resource
    private PlmsFuncPermService funcPermService;
    @Resource
    private PlmsPermissionService permissionService;

    /**
     * pageRole页
     */
    @RequestMapping("/pageRole")
    @RequiresPermissions(PermissionSign.ROLE_SELECT)
    public String pageRole() {
        return "jsp/sys_management/pageRole";
    }
    
    /**
     * 查询角色分页显示
     */
    @RequestMapping(value = "/pageRoleData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ROLE_SELECT)
    public String pageRoleData(PlmsRoleExample example) {
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
        example.setOrderByClause("T.ID DESC");
        //设置排序
        example.setOrderByClause(dataTableParam);
        Page<PlmsRole> pageData = new Page<PlmsRole>(pageNo, pageSize);

    	pageData = roleService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 前往添加页
     */
    @RequestMapping("/toAddRole")
    @RequiresPermissions(PermissionSign.ROLE_INSERT)
    public String toAddRole(Model model) {
        //查找功能
        List<PlmsFunc> list = funcService.selectByExample(new PlmsFuncExample().setIsActive("Y"));

        //顶级功能
        List<PlmsFunc> topFuncList = new ArrayList<>();
        //二级功能
        List<PlmsFunc> secondFuncList = new ArrayList<>();
        if(list != null && list.size() > 0){
            for(PlmsFunc func : list){
                if(func.getpFuncId() == null){
                    topFuncList.add(func);      //添加顶级功能
                }else {
                    secondFuncList.add(func);   //添加二级功能
                }
            }
        }

        //查找功能权限数据
        List<PlmsFuncPerm> funcPermList = funcPermService.selectByExample(new PlmsFuncPermExample().setIsActive("Y"));

        model.addAttribute("topFuncList",topFuncList);
        model.addAttribute("secondFuncList",secondFuncList);
        model.addAttribute("funcPermList",funcPermList);

        return "jsp/sys_management/toAddRole";
    }

    /**
     * 添加角色
     */
    @RequestMapping("/addRole")
    @ResponseBody
    @RequiresPermissions(PermissionSign.ROLE_INSERT)
    public JSONResult addRole(PlmsRole role,Long[] permIds) {
        if(role == null || role.getRoleName() == null || "".equals(role.getRoleName())){
            return new JSONResult(false,"请输入角色名称");
        }
        if(role.getRoleSign() == null || "".equals(role.getRoleSign())){
            return new JSONResult(false,"请输入角色标识");
        }
        if(permIds == null){
            return new JSONResult(false,"请选择角色权限");
        }
        //验证角色唯一性
        List<PlmsRole> list = roleService.selectByExample(new PlmsRoleExample().setRoleName(role.getRoleName()));

        if(list != null && list.size() > 0){
            return new JSONResult(false,"角色名称已存在");
        }
        //验证角色标识
        list = roleService.selectByExample(new PlmsRoleExample().setRoleSign(role.getRoleSign()));

        if(list != null && list.size() > 0){
            return new JSONResult(false,"角色标识已存在");
        }

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();
        role.setIsActive("Y");
        role.setCreatedBy(loginUser);
        role.setUpdatedBy(loginUser);

        roleService.addRole(role, permIds, loginUser);

        return new JSONResult(true,"添加角色成功");
    }

    /**
     * 前往修改页
     * @param roleId 角色ID
     */
    @RequestMapping("/toUpdateRole")
    @RequiresPermissions(PermissionSign.ROLE_UPDATE)
    public String toUpdateRole(Model model,Long roleId) {
        if(roleId == null){
            throw new RuntimeException("参数异常");
        }
        //查找角色
        PlmsRole role = roleService.selectById(roleId);
        //根据角色ID查找权限
        List<PlmsPermission> permissionList = permissionService.selectPermissionsByRoleId(roleId);

        //查找功能模块
        List<PlmsFunc> list = funcService.selectByExample(new PlmsFuncExample().setIsActive("Y"));
        //顶级功能
        List<PlmsFunc> topFuncList = new ArrayList<>();
        //二级功能
        List<PlmsFunc> secondFuncList = new ArrayList<>();
        if(list != null && list.size() > 0){
            for(PlmsFunc func : list){
                if(func.getpFuncId() == null){
                    topFuncList.add(func);      //添加顶级功能
                }else {
                    secondFuncList.add(func);   //添加二级功能
                }
            }
        }

        //查找功能权限数据
        List<PlmsFuncPerm> funcPermList = funcPermService.selectByExample(new PlmsFuncPermExample().setIsActive("Y"));

        if(permissionList != null && permissionList.size() > 0){
            for(PlmsFuncPerm funcPerm : funcPermList){
                for(PlmsPermission permission : permissionList){
                    if(permission.getId() - funcPerm.getPermissionId() == 0){
                        funcPerm.setHasPerm(true);  //此角色有这个权限
                    }
                }
            }
        }

        model.addAttribute("role", role);
        model.addAttribute("topFuncList", topFuncList);
        model.addAttribute("secondFuncList", secondFuncList);
        model.addAttribute("funcPermList", funcPermList);

        return "jsp/sys_management/toUpdateRole";
    }

    /**
     * 修改角色
     * @param role 角色ID
     * @param permIds 权限IDS
     */
    @RequestMapping("/updateRole")
    @ResponseBody
    @RequiresPermissions(PermissionSign.ROLE_UPDATE)
    public JSONResult updateRole(PlmsRole role,Long[] permIds) {
        if(role == null || role.getId() == null || role.getRecVer() == null){
            return new JSONResult(false,"参数错误");
        }
        if(role.getRoleName() == null || "".equals(role.getRoleName())){
            return new JSONResult(false,"请输入角色名称");
        }
        if(permIds == null){
            return new JSONResult(false,"请选择角色权限");
        }

        PlmsRole plmsRole = roleService.selectById(role.getId());
        //如果修改了角色名称则校验角色名称是否存在
        if(!plmsRole.getRoleName().equals(role.getRoleName())){
            List<PlmsRole> list = roleService.selectByExample(new PlmsRoleExample().setRoleName(role.getRoleName()));
            if(list != null && list.size() > 0){
                return new JSONResult(false,"角色名称已存在");
            }
        }

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();
        role.setUpdatedBy(loginUser);
        role.setUpdateTime(new Date());

        //修改角色
        roleService.updateRole(role, permIds, loginUser);

        return new JSONResult(true,"修改角色成功");
    }

    /**
     * 删除角色
     * @param roleId 角色ID
     * @param recVer 版本号
     */
    @RequestMapping("/deleteRole")
    @ResponseBody
    @RequiresPermissions(PermissionSign.ROLE_DELETE)
    public JSONResult deleteRole(Long roleId,Long recVer) {
        if(roleId == null || recVer == null){
            return new JSONResult(false,"请选择需删除的角色");
        }

        //查询此角色是否已分配给用户
        List<PlmsUserRole> userRoleList = userRoleService.selectByExample(new PlmsUserRoleExample().setRoleId(roleId));
        if(userRoleList != null && userRoleList.size() > 0){
            return new JSONResult(false,"已分配给用户的角色不能删除");
        }

        //根据ID和版本号删除
        int ret = roleService.deleteByExample(new PlmsRoleExample().setId(roleId).setRecVer(recVer));
        if(ret <= 0){
            return new JSONResult(false,"删除失败,请刷新重试");
        }

        return new JSONResult(true,"删除角色成功");
    }

}
