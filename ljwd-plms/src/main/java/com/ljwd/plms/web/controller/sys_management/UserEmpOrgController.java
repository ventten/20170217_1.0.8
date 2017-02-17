package com.ljwd.plms.web.controller.sys_management;

import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.RoleSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;

import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengzw on 2016/8/24
 * 催收人员机构信息控制器
 */
@Controller
@RequestMapping(value = "/org")
public class UserEmpOrgController {

    @Resource
    private SysUserService sysUserService;


    /**
     * 获取机构和催收员
     * @param type 获取类型：1-会返回机构map,其它不会返回机构map
     * @param orgId 机构ID
     * */
    @RequestMapping(value = "/getUserEmpOrg",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getUserEmpOrg(int type,Long orgId){
        Map<String,Object> map = new HashMap<String,Object>();

        //所有催收人员列表
        List<UserEmpOrgDto> userEmpOrgList = null;

        Subject subject = SubjectUtil.getSubject();
        //如果有查看全部催收员权限,查询所有催收员
        if(subject.isPermitted(PermissionSign.CASE_ALL_ALL_COLLECTOR)){
            userEmpOrgList = sysUserService.selectUserEmpOrg(orgId,null);
        }else {
            userEmpOrgList = sysUserService.selectUserEmpOrg(orgId,(String)subject.getPrincipal());
        }

        if(type == 1){
            //机构Map
            Map<Long,String> orgMap = new HashMap<Long,String>();
            if(userEmpOrgList != null && userEmpOrgList.size() > 0){
                for(UserEmpOrgDto ueo : userEmpOrgList){
                    orgMap.put(ueo.getOrgId(),ueo.getOrgName());
                }
            }
            map.put("orgMap",orgMap);
        }

        map.put("userEmpOrgList",userEmpOrgList);

        return map;
    }

    @RequestMapping("/getUserEmpOrgByStatus")
    @ResponseBody
    public Map<String,Object> getUserEmpOrgByStatus(int type,Long orgId,String status,HttpServletRequest request ){
    	 Map<String,Object> map = new HashMap<String,Object>();

         //所有催收人员列表
         List<UserEmpOrgDto> userEmpOrgList = null;
         if(SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_BRANCHSELECT)&&(!SubjectUtil.isPermitted(PermissionSign.CASEMANAGEMENT_SELECT))){
        	 orgId = SubjectUtil.getSession(request).getOrgId();
         }
         userEmpOrgList = sysUserService.selectUserEmpOrgByStatus(orgId, status);

         if(type == 1){
             //机构Map
             Map<Long,String> orgMap = new HashMap<Long,String>();
             if(userEmpOrgList != null && userEmpOrgList.size() > 0){
                 for(UserEmpOrgDto ueo : userEmpOrgList){
                     orgMap.put(ueo.getOrgId(),ueo.getOrgName());
                 }
             }
             map.put("orgMap",orgMap);
         }

         map.put("userEmpOrgList",userEmpOrgList);

         return map;
    	
    }
}
