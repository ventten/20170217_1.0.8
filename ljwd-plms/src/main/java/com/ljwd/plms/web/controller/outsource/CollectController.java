package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComExample;
import com.ljwd.plms.web.model.type.PlmsLCollectControl;
import com.ljwd.plms.web.model.type.PlmsLCollectControlExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcCollectService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectControlService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.outsource.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * 委外催记控制器
 */
@Controller
@RequestMapping(value = "/outsrcCollect")
public class CollectController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PlmsOutsrcComService outsrcComService;
    @Resource
    private PlmsLCollectControlService controlService;
    @Resource
    private PlmsLaApplOutsrcCollectService outsrcCollectService;

    /**
     * 委外催记管理页
     */
    @RequestMapping("/outsrcCollectIndex")
    @RequiresPermissions(PermissionSign.OUT_COLLECT_SELECT)
    public String outsrcCollectIndex(Model model) {
        //控管状态
        PlmsLCollectControlExample controlExample = new PlmsLCollectControlExample();
        controlExample.setIsSelected("Y").setIsActive("Y").setCodeNotIn("'OTHER'");
        controlExample.setOrderByClause("T.SEQ");
        List<PlmsLCollectControl> controlList = controlService.selectByExample(controlExample);
        model.addAttribute("controlList",controlList);

        //所有委外机构
        List<PlmsOutsrcCom> outsrcComList = outsrcComService.selectByExample(new PlmsOutsrcComExample());
        model.addAttribute("outsrcComList",outsrcComList);
        return "jsp/outsource/outsrcCollectIndex";
    }

    /**
     * 委外催记数据
     */
    @RequestMapping(value = "/pageOutsrcCollectData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_COLLECT_SELECT)
    public String pageOutsrcCollectData(OutsrcCollectPageExample example) {
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

        Page<OutsrcCollectPageDto> pageData = new Page<OutsrcCollectPageDto>(pageNo, pageSize);

        pageData = outsrcCollectService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 导入委外催记
     * */
    @RequestMapping(value = "/importCollect",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_COLLECT_IMPORT)
    public JSONResult importCollect(HttpServletRequest request){
        //根据request获取上传的Excel文件
        JSONResult result = HttpUtils.getExcelMultipartFile(request);
        if(!result.isSuccess()){
            return result;
        }
        //文件结果
        HttpUtils.FileResult fileResult = (HttpUtils.FileResult) result.getData();
        String userId = SubjectUtil.getUserId();
        //Excel批量导入
        try {
            result = outsrcCollectService.saveCollectByExcel(fileResult.getMultipartFile().getInputStream(),fileResult.getFileName(),userId);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            result = new JSONResult(false,e.getMessage());
        }
        return result;
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
