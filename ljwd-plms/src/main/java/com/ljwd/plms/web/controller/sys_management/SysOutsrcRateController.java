package com.ljwd.plms.web.controller.sys_management;


import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.N;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRate;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRateExample;
import com.ljwd.plms.web.model.sys_management.SysUser;
import com.ljwd.plms.web.model.sys_management.SysUserExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.sys_management.inf.PlmsSysOutsrcRateService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 委外费率控制器
 **/
@Controller
@RequestMapping(value = "/outsrcRate")
public class SysOutsrcRateController {

    @Resource
    private PlmsSysOutsrcRateService sysOutsrcRateService;

    /**
     * 委外费率页
     */
    @RequestMapping("/outsrcRateIndex")
    @RequiresPermissions(PermissionSign.OUT_RATE_SELECT)
    public String outsrcRateIndex() {
        return "jsp/sys_management/outsrcRateIndex";
    }
    
    /**
     * 委外费率数据
     */
    @RequestMapping(value = "/pageOutsrcRateData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_RATE_SELECT)
    public String pageOutsrcRateData(PlmsSysOutsrcRateExample example) {
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

        //设置排序
        example.setOrderByClause(dataTableParam);
        Page<PlmsSysOutsrcRate> pageData = new Page<PlmsSysOutsrcRate>(pageNo, pageSize);

    	pageData = sysOutsrcRateService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 新增委外费率
     * @param outsrcRate 委外费率
     */
    @RequestMapping("/addOutsrcRate")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_RATE_INSERT)
    public JSONResult addOutsrcRate(PlmsSysOutsrcRate outsrcRate) {
        if(outsrcRate == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(outsrcRate.getAging())){
            return new JSONResult(false,"请输入账龄阶段");
        }
//        if(outsrcRate.getOutsrcRate() == null){
//            return new JSONResult(false,"请输入委外费率");
//        }
        if(outsrcRate.getServiceRate() == null){
            return new JSONResult(false,"请输入服务费率");
        }
        if(outsrcRate.getOverdueDaysFrom() != null && outsrcRate.getOverdueDaysTo() != null && outsrcRate.getOverdueDaysFrom() - outsrcRate.getOverdueDaysTo() > 0){
            return new JSONResult(false,"逾期天数(起)不能大于逾期天数(止)");
        }

//        int count = sysOutsrcRateService.countByExample(new PlmsSysOutsrcRateExample().setAging(outsrcRate.getAging()));
//        if(count > 0){
//            return new JSONResult(false,"账龄阶段名称已存在");
//        }

//        outsrcRate.setOutsrcRate(N.div(outsrcRate.getOutsrcRate(), BigDecimal.valueOf(100), 8));
        outsrcRate.setServiceRate(N.div(outsrcRate.getServiceRate(),BigDecimal.valueOf(100),8));

        String userId = SubjectUtil.getUserId();
        outsrcRate.setIsActive("Y");
        outsrcRate.setCreatedBy(userId);
        outsrcRate.setUpdatedBy(userId);

        int ret = sysOutsrcRateService.insert(outsrcRate);
        if(ret < 1){
            return new JSONResult(false,"新增委外费率失败");
        }

        return new JSONResult(true,"操作成功");
    }

    /**
     * 修改委外费率
     * @param outsrcRate 委外费率
     */
    @RequestMapping("/updateOutsrcRate")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_RATE_UPDATE)
    public JSONResult updateOutsrcRate(PlmsSysOutsrcRate outsrcRate) {
        if(outsrcRate == null || outsrcRate.getId() == null || outsrcRate.getRecVer() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(outsrcRate.getAging())){
            return new JSONResult(false,"请输入账龄阶段");
        }

//        int count = sysOutsrcRateService.countByExample(new PlmsSysOutsrcRateExample().setAging(outsrcRate.getAging()));
//        if(count > 0){
//            return new JSONResult(false,"账龄阶段名称已存在");
//        }

        String userId = SubjectUtil.getUserId();
        outsrcRate.setUpdatedBy(userId);
        outsrcRate.setUpdateTime(new Date());

        int ret = sysOutsrcRateService.update(outsrcRate);
        if(ret < 1){
            return new JSONResult(false,"修改委外费率失败");
        }

        return new JSONResult(true,"操作成功");
    }

}
