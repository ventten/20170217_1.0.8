package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComRegionService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.*;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw
 * 委外申请控制器-查询数据
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcPageController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;
    @Resource
    private PlmsOutsrcComService outsrcComService;
    @Resource
    private PlmsOutsrcComRegionService outsrcComRegionService;

    /**
     * 委外管理页
     */
    @RequestMapping("/outsrcIndex")
    @RequiresPermissions(PermissionSign.OUT_SRC_SELECT)
    public String outsrcIndex(Model model) {
        //网点区域
        List<SiteRegionDto> siteRegionList = outsrcComRegionService.selectSiteRegion();
        model.addAttribute("siteRegionList",siteRegionList);

        //所有委外机构
        List<PlmsOutsrcCom> outsrcComList = outsrcComService.selectByExample(new PlmsOutsrcComExample());
        model.addAttribute("outsrcComList",outsrcComList);
        return "jsp/outsource/outsrcIndex";
    }

    /**
     * 委外申请数据
     */
    @RequestMapping(value = "/pageOutsrcApplData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_SELECT)
    public String pageOutsrcApplData(OutsrcPageExample example,HttpServletRequest request) {
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

        Page<OutsrcPageDto> pageData = new Page<OutsrcPageDto>(pageNo, pageSize);

        //查询未再委案
        if(example.getNotApplAgain() != null && example.getNotApplAgain()){
            example.setMaxId(true);
            example.setWinfoStatus(LoanStatus.REPAYING);
            example.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
        }else {
            //如果不是管理员并且查询待审核状态的数据,则加上机构ID
            if(!SubjectUtil.hasRole("admin") && !StringUtil.isEmpty(example.getStatus()) && PlmsLaApplOutsrc.STATUS_AUDIT.equals(example.getStatus())){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }

        pageData = outsrcService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
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
