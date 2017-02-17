package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClContactorInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnApplInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by zhengzw on 2016/6/12.
 * 客户通讯信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class ContactorController {

    @Resource
    private PlmsClContactorInfoService contactorInfoService;

    /**
     * 客户通讯信息数据
     * */
    @RequestMapping(value = "/pageContactorData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CONTACTOR_SELECT)
    public String pageContactorData(PlmsClContactorInfoExample example){
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

        Page<PlmsClContactorInfo> pageData = new Page<PlmsClContactorInfo>(pageNo, pageSize);

        pageData = contactorInfoService.selectByExampleAndPage(pageData, example);
        if(pageData.getResult().size() > 0){
        	for(int i=0;i<pageData.getResult().size();i++){
        		if(pageData.getResult().get(i).getArea() != null && !"".equals(pageData.getResult().get(i).getArea())){
	        		if(pageData.getResult().get(i).getExt() != null && !"".equals(pageData.getResult().get(i).getExt())){
		        		String area = pageData.getResult().get(i).getArea();
		        		String tel = pageData.getResult().get(i).getTel();
		        		String ext = pageData.getResult().get(i).getExt();
		        		pageData.getResult().get(i).setTel(area+"-"+tel+"-"+ext);
	        		}else{
	        			String area = pageData.getResult().get(i).getArea();
		        		String tel = pageData.getResult().get(i).getTel();
		        		pageData.getResult().get(i).setTel(area+"-"+tel);
	        		}
        		}
        	}
        }
        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 通过ID查询通讯记录实体
     * @param id
     * @return
     */
    @RequestMapping(value = "/findContactor",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CONTACTOR_SELECT)
    public JSONResult findContactor(Long id){
    	if(id == null || "".equals(id)){
    		return new JSONResult(false,"参数错误");
    	}
    	PlmsClContactorInfo plmsClContactorInfo = contactorInfoService.selectById(id);
    	return new JSONResult(plmsClContactorInfo);
    }

    /**
     * 添加通讯信息
     * */
    @RequestMapping(value = "/addContactor",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CONTACTOR_INSERT)
    public JSONResult addContactor(PlmsClContactorInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(info.getTel())){
            return new JSONResult(false,"请输入号码");
        }
        if(StringUtil.isEmpty(info.getName())){
            return new JSONResult(false,"请输入联系人姓名");
        }

        //号码去重校验
        PlmsClContactorInfoExample example = new PlmsClContactorInfoExample();
        example.setClCustId(info.getClCustId()).setName(info.getName()).setTelType(info.getTelType()).setArea(info.getArea()).setTel(info.getTel()).setExt(info.getExt());
        int count = contactorInfoService.countByExample(example);
        if(count > 0){
            return new JSONResult(false,"该联系人已存在");
        }

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);
        if("MOBPHONE".equals(info.getTelType()) || "WEIXIN".equals(info.getTelType()) || "QQ".equals(info.getTelType()) || "EMAIL".equals(info.getTelType())){
        	info.setArea("");
        	info.setExt("");
        }
        int ret = contactorInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改通讯信息
     * */
    @RequestMapping(value = "/updateContactor",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CONTACTOR_UPDATE)
    public JSONResult updateContactor(PlmsClContactorInfo info){
        if(info.getId() == null || info.getClCustId() == null || info.getRecVer() == null || info.getClCustId() == null || StringUtil.isEmpty(info.getIsActive())){
            return new JSONResult(false,"参数错误.");
        }
        if(StringUtil.isEmpty(info.getTel())){
            return new JSONResult(false,"请输入号码");
        }
        if(StringUtil.isEmpty(info.getName())){
            return new JSONResult(false,"请输入联系人姓名");
        }

        //号码去重校验
        PlmsClContactorInfoExample example = new PlmsClContactorInfoExample();
        example.setNotThisId(info.getId()).setClCustId(info.getClCustId()).setName(info.getName()).setTelType(info.getTelType())
                .setArea(info.getArea()).setTel(info.getTel()).setExt(info.getExt());
        int count = contactorInfoService.countByExample(example);
        if(count > 0){
            return new JSONResult(false,"该联系人已存在");
        }

        Subject subject = SecurityUtils.getSubject();
        String loginUser = (String)subject.getPrincipal();
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        if("MOBPHONE".equals(info.getTelType()) || "WEIXIN".equals(info.getTelType()) || "QQ".equals(info.getTelType()) || "EMAIL".equals(info.getTelType())){
        	info.setArea("");
        	info.setExt("");
        }
        int ret = contactorInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 删除通讯信息
     * */
    @RequestMapping(value = "/deleteContactor",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteContactor(PlmsClContactorInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        //根据记录ID查找数据
        PlmsClContactorInfo contactor = contactorInfoService.selectById(info.getId());
        if(contactor == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = (String)SecurityUtils.getSubject().getPrincipal();

        if(!loginUser.equals(contactor.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        //删除
        int ret = contactorInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

}
