package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComRegionService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.outsource.SiteRegionDto;
import com.ljwd.plms.web.vo.outsource.WdCorpDto;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw
 * 委外机构控制器
 */
@Controller
@RequestMapping(value = "/outsrcCom")
public class ComController {

    @Resource
    private PlmsOutsrcComService outsrcComService;
    @Resource
    private PlmsOutsrcComRegionService outsrcComRegionService;

    /**
     * 委外机构页
     */
    @RequestMapping("/outsrcComIndex")
    @RequiresPermissions(PermissionSign.OUT_COM_SELECT)
    public String outsrcComIndex(Model model) {
        //网点区域
        List<SiteRegionDto> siteRegionList = outsrcComRegionService.selectSiteRegion();
        model.addAttribute("siteRegionList",siteRegionList);

        //贷后委外机构集合
        List<PlmsOutsrcCom> outsrcComList = outsrcComService.selectByExample(new PlmsOutsrcComExample());
        model.addAttribute("outsrcComList",outsrcComList);

        //微贷外包公司集合
        List<WdCorpDto> wdCorpList = outsrcComService.selectWdCorp();
        model.addAttribute("wdCorpList",wdCorpList);

        return "jsp/outsource/outsrcComIndex";
    }

    /**
     * 委外机构数据
     */
    @RequestMapping(value = "/pageOutsrcComData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_COM_SELECT)
    public String pageOutsrcComData(PlmsOutsrcComExample example) {
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

        example.setOrderByClause("T.WEIGHT DESC,T.ID DESC");

        Page<PlmsOutsrcCom> pageData = new Page<PlmsOutsrcCom>(pageNo, pageSize);

        pageData = outsrcComService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加委外机构
     * @param outsrcCom 委外机构
     * @param regionIds 辐射区域IDS
     */
    @RequestMapping("/addOutsrcCom")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_COM_INSERT)
    public JSONResult addOutsrcCom(PlmsOutsrcCom outsrcCom,Long[] regionIds) {
        if(outsrcCom == null){
            return new JSONResult(false,"参数错误");
        }
        if(outsrcCom.getWdCorpId() == null){
            return new JSONResult(false,"请选择微贷对应的外包公司");
        }

        //校验映射机构是否存在
        int count = outsrcComService.countByExample(new PlmsOutsrcComExample().setWdCorpId(outsrcCom.getWdCorpId()));
        if(count > 0){
            return new JSONResult(false,"此微贷外包公司映射的委外机构已存在");
        }

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();
        outsrcCom.setIsActive("Y");
        outsrcCom.setCreatedBy(loginUser);
        outsrcCom.setUpdatedBy(loginUser);

        outsrcComService.addOutsrcCom(outsrcCom, regionIds, loginUser);

        return new JSONResult(true,"添加委外机构成功");
    }

    /**
     * 修改委外机构
     * @param outsrcCom 委外机构
     * @param regionIds 辐射区域IDS
     */
    @RequestMapping("/updateOutsrcCom")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_COM_UPDATE)
    public JSONResult updateOutsrcCom(PlmsOutsrcCom outsrcCom,Long[] regionIds) {
        if(outsrcCom == null || outsrcCom.getId() == null || outsrcCom.getRecVer() == null){
            return new JSONResult(false,"参数错误");
        }
        if(regionIds == null){
            return new JSONResult(false,"请选择辐射区域");
        }

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();
        outsrcCom.setUpdatedBy(loginUser);
        outsrcCom.setUpdateTime(new Date());

        //修改委外机构
        outsrcComService.updateOutsrcCom(outsrcCom, regionIds, loginUser);

        return new JSONResult(true,"修改委外机构成功");
    }

    /**
     * 启用或停用委外机构
     * @param outsrcComId 委外机构id
     */
    @RequestMapping("/enableOrCancel")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_COM_SWITCH)
    public JSONResult enableOrCancel(Long outsrcComId) {
        if(outsrcComId == null){
            return new JSONResult(false,"参数错误");
        }

        PlmsOutsrcCom plmsOutsrcCom = outsrcComService.selectById(outsrcComId);
        if(plmsOutsrcCom == null){
            return new JSONResult(false,"不存在的委外机构");
        }

        PlmsOutsrcCom outsrcCom = new PlmsOutsrcCom();
        outsrcCom.setId(outsrcComId);
        outsrcCom.setRecVer(plmsOutsrcCom.getRecVer());

        //当前登录用户
        String loginUser = SubjectUtil.getUserId();
        outsrcCom.setUpdatedBy(loginUser);
        outsrcCom.setUpdateTime(new Date());

        if("Y".equals(plmsOutsrcCom.getIsActive())){
            outsrcCom.setIsActive("N");
        }else {
            outsrcCom.setIsActive("Y");
        }

        //修改委外机构
        int ret = outsrcComService.update(outsrcCom);
        if(ret < 1){
            return new JSONResult(true,"操作失败");
        }

        return new JSONResult(true,"操作成功");
    }

}
