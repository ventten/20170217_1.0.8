package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.cust.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.cust.inf.PlmsLnApplInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhengzw on 2016/6/8 0008.
 * 客户贷款信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class ApplController {

    @Resource
    private PlmsLnApplInfoService applInfoService;

    /**
     * 客户贷款信息数据
     * */
    @RequestMapping(value = "/pageApplData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.APPL_SELECT)
    public String pageApplData(PlmsLnApplInfoExample example){
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

        Page<PlmsLnApplInfo> pageData = new Page<PlmsLnApplInfo>(pageNo, pageSize);

        pageData = applInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

}
