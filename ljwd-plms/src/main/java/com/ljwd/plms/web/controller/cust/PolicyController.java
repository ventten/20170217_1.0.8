package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfo;
import com.ljwd.plms.web.model.cust.PlmsClPolicyInfoExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClPolicyInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhengzw on 2016/6/12
 * 客户保单信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class PolicyController {

    @Resource
    private PlmsClPolicyInfoService policyInfoService;

    /**
     * 客户保单信息数据
     * */
    @RequestMapping(value = "/pagePolicyData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.POLICY_SELECT)
    public String pagePolicyData(PlmsClPolicyInfoExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustId() == null){
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

        example.setOrderByClause("T.ID DESC");

        Page<PlmsClPolicyInfo> pageData = new Page<PlmsClPolicyInfo>(pageNo, pageSize);
        

        pageData = policyInfoService.selectByExampleAndPage(pageData, example);

//        //替换掉地址中的“-”，用以显示在table中
//        if(pageData.getResult().size() > 0){
//        	for(int i=0;i<pageData.getResult().size();i++){
//        		String addre = pageData.getResult().get(i).getPolicyAddress().replace("&&", "");
//        		pageData.getResult().get(i).setPolicyAddress(addre);
//        	}
//        }

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addPolicy",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.POLICY_INSERT)
    public JSONResult addPolicy(PlmsClPolicyInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(info.getPolicyAddress())){
            return new JSONResult(false,"请选择保单地址");
        }
        if(StringUtil.isEmpty(info.getPaymentMethod())){
            return new JSONResult(false,"请选择缴费方式");
        }

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);

        int ret = policyInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 通过ID查找客户保单信息
     * @param id 记录ID
     * @return 保单信息
     */
    @RequestMapping(value = "/findPolicy",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.POLICY_SELECT)
    public JSONResult findPolicy(Long id){
    	if(id == null){
    		return new JSONResult(false,"参数错误");
    	}
    	PlmsClPolicyInfo pci = policyInfoService.selectById(id);

//        if(!StringUtil.isEmpty(pci.getPolicyAddress())){
//            String[] addr = pci.getPolicyAddress().split("&&");
//            if(addr.length > 1 ){
//                pci.setPolicyAddress(addr[1]);
//            }else{
//                pci.setPolicyAddress(null);
//            }
//        }

    	return new JSONResult(pci);
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updatePolicy",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.POLICY_UPDATE)
    public JSONResult updatePolicy(PlmsClPolicyInfo info){
        if(info.getId() == null || info.getRecVer() == null || info.getIsActive() == null){
            return new JSONResult(false,"参数错误.");
        }
        //如果是趸缴
        if(!StringUtil.isEmpty(info.getPaymentMethod()) && "WHOLE".equals(info.getPaymentMethod())){
            info.setPaymentCategory("");
        }

        String loginUser = SubjectUtil.getUserId();
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());

        int ret = policyInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }

        return new JSONResult(true,"操作成功.");
    }

    /**
     * 删除保单信息
     * */
    @RequestMapping(value = "/deletePolicy",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deletePolicy(PlmsClPolicyInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClPolicyInfo policy = policyInfoService.selectById(info.getId());
        if(policy == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(policy.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = policyInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 字符串转日期类型参数
     * */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
