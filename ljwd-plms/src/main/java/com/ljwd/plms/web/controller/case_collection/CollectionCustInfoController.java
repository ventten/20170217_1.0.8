package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfo;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLnCollectCustInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 案件催收自定义信息控制器
 * */
@Controller
@RequestMapping(value="/caseCollection")
public class CollectionCustInfoController {

    @Resource
    private PlmsLnCollectCustInfoService plmsLnCollectCustInfoService;

    /**
     * 保存自定义信息
     * */
    @RequestMapping(value = "/saveInfo",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_INFO)
    public JSONResult saveInfo(PlmsLnCollectCustInfo custInfo){
        if (custInfo == null || custInfo.getApplId() == null){
            return new JSONResult(false,"参数错误");
        }

        if(custInfo.getCustInfo() == null || custInfo.getCustInfo().isEmpty()){
            return new JSONResult(false,"请输入自定义信息");
        }

        //登录用户
        String userId = SubjectUtil.getUserId();

        plmsLnCollectCustInfoService.saveInfo(custInfo,userId);

        return new JSONResult(true,"操作成功");
    }

}
