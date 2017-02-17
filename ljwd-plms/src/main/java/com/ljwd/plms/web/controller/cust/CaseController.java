package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.cust.inf.PlmsClCustInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.cust.CustCaseDto;
import com.ljwd.plms.web.vo.cust.CustCaseExample;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhengzw on 2016/7/15
 * 个案查询控制器
 */
//@Controller
//@RequestMapping(value = "/cust")
public class CaseController {

//    private Logger logger = LoggerFactory.getLogger(CaseController.class);
//
//    @Resource
//    private PlmsClCustInfoService custInfoService;
//
//
//    /**
//     * 个案查询首页
//     */
//    @RequestMapping("caseIndex")
//    public String caseIndex(){
//        return "jsp/cust/caseIndex";
//    }
//
//    /**
//     * 个案查询详情页
//     * @param custId 微贷客户ID
//     */
//    @RequestMapping("caseDetail")
//    public String caseDetail(Model model,Long custId){
//        return "jsp/cust/caseDetail";
//    }
//
//    /**
//     * 个案查询页数据
//     * @param example 查询条件
//     */
//    @RequestMapping(value = "/pageCaseData",method = {RequestMethod.POST})
//    @ResponseBody
//    public String pageCaseData(CustCaseExample example){
//        if(example.getParamData() == null || "".equals(example.getParamData())){
//            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
//        }
//
//        //分页条件
//        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
//        //记录操作的次数
//        int sEcho = dataTableParam.getsEcho();
//        //每页记录数
//        int pageSize = dataTableParam.getiDisplayLength();
//        //页数
//        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;
//
//        example.setOrderByClause("CU.ID DESC");
//
//        Page<CustCaseDto> pageData = new Page<CustCaseDto>(pageNo, pageSize);
//
//        pageData = custInfoService.selectCustCaseAndPage(pageData, example);
//
//        return PageUtil.getPageJson(sEcho, pageData);
//    }

}
