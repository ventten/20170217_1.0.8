package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLog;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLogExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComLogService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhengzw
 * 委外机构-沟通日志控制器
 */
@Controller
@RequestMapping(value = "/outsrcCom")
public class ComLogController {

    @Resource
    private PlmsOutsrcComLogService outsrcComLogService;

    /**
     * 委外机构沟通日志数据
     */
    @RequestMapping(value = "/pageOutsrcComLogData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_LOG_SELECT)
    public String pageOutsrcComLogData(PlmsOutsrcComLogExample example) {
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getOutsrcComId() == null){
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

        Page<PlmsOutsrcComLog> pageData = new Page<PlmsOutsrcComLog>(pageNo, pageSize);

        pageData = outsrcComLogService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加沟通日志
     * @param outsrcComLog 沟通日志
     */
    @RequestMapping("/addOutsrcComLog")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_LOG_INSERT)
    public JSONResult addOutsrcComLog(PlmsOutsrcComLog outsrcComLog) {
        if(outsrcComLog == null){
            return new JSONResult(false,"参数错误");
        }
        if(outsrcComLog.getOutsrcComId() == null){
            return new JSONResult(false,"请选择委外机构");
        }

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();
        outsrcComLog.setIsActive("Y");
        outsrcComLog.setCreatedBy(loginUser);
        outsrcComLog.setUpdatedBy(loginUser);

        outsrcComLogService.insert(outsrcComLog);

        return new JSONResult(true,"添加沟通日志成功");
    }

}
