package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.*;
import com.ljwd.plms.web.model.type.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.cust.inf.PlmsClCustInfoService;
import com.ljwd.plms.web.service.type.inf.*;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionDto;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.cust.PageCustDto;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * Created by zhengzw on 2016/6/8
 * 客户信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class CustController {

    private Logger logger = LoggerFactory.getLogger(CustController.class);

    @Resource
    private LBankService bankService;
    @Resource
    private LRltnshpService rltnshpService;
    @Resource
    private PlmsLTelTypeService telTypeService;
    @Resource
    private PlmsClCustInfoService custInfoService;
    @Resource
    private PlmsLAnnexTypeService annexTypeService;
    @Resource
    private PlmsLSourceTypeService sourceTypeService;
    @Resource
    private LAccwaterTypeService accwaterTypeService;
    @Resource
    private PlmsLAssetsTypeService assetsTypeService;
    @Resource
    private PlmsLAddressTypeService addressTypeService;
    @Resource
    private PlmsWorkOrderPoolService workOrderPoolService;
    /**
     * 客户信息管理首页
     * */
    @RequestMapping("custIndex")
    @RequiresPermissions(PermissionSign.CUST_SELECT)
    public String custIndex(){
        return "jsp/cust/custIndex";
    }
    /**
     * 客户查询
     * */
    @RequestMapping("custSelect")
    @RequiresPermissions(PermissionSign.CUST_SELECT)
    public String custSelect(){
        return "jsp/cust/custSelect";
    }
    /**
     * 客户信息详情
     * @param clCustId 贷后客户ID
     * @param custName 主贷人
     * @param docno 身份证号
     */
    @RequestMapping("custDetail")
    @RequiresPermissions(PermissionSign.CUST_DETAIL)
    public String custDetail(Model model,Long clCustId,String custName,String docno){
        String isActive = "Y";
        String orderByClause = "T.SEQ";
        //来源类型
        PlmsLSourceTypeExample sourceParam = new PlmsLSourceTypeExample();
        sourceParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLSourceType> sourceList = sourceTypeService.selectByExample(sourceParam);
        model.addAttribute("sourceList",sourceList);

        //关系类型
        LRltnshpExample rltnshpParam = new LRltnshpExample();
        rltnshpParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<LRltnshp> rltnshpList = rltnshpService.selectByExample(rltnshpParam);
        model.addAttribute("rltnshpList",rltnshpList);

        //流水类型
        LAccwaterTypeExample accwaterParam = new LAccwaterTypeExample();
        accwaterParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<LAccwaterType> accwaterList = accwaterTypeService.selectByExample(accwaterParam);
        model.addAttribute("accwaterList",accwaterList);

        //地址类型
        PlmsLAddressTypeExample addressExample = new PlmsLAddressTypeExample();
        addressExample.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAddressType> addressList = addressTypeService.selectByExample(addressExample);
        model.addAttribute("addressList",addressList);

        //附件类型
        PlmsLAnnexTypeExample annexParam = new PlmsLAnnexTypeExample();
        annexParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAnnexType> annexTypeList = annexTypeService.selectByExample(annexParam);
        model.addAttribute("annexTypeList",annexTypeList);

        //其他资产类型
        PlmsLAssetsTypeExample assetsParam = new PlmsLAssetsTypeExample();
        assetsParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAssetsType> assetsList = assetsTypeService.selectByExample(assetsParam);
        model.addAttribute("assetsList",assetsList);

        //号码类型
        PlmsLTelTypeExample telParam = new PlmsLTelTypeExample();
        telParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLTelType> telList = telTypeService.selectByExample(telParam);
        model.addAttribute("telList",telList);

        //银行字典
        LBankExample bankExample = new LBankExample();
        bankExample.setIsActive(isActive).setOrderByClause(orderByClause);
        List<LBank> bankList = bankService.selectByExample(bankExample);
        model.addAttribute("bankList",bankList);

        model.addAttribute("clCustId",clCustId);
        model.addAttribute("custName",custName);
        model.addAttribute("docno",docno);

        return "jsp/cust/custDetail";
    }

    /**
     * 客户信息管理首页数据
     * @param example 查询条件
     */
    @RequestMapping(value = "/pageCustData",method = {RequestMethod.POST})
    @ResponseBody
    @RequiresPermissions(PermissionSign.CUST_SELECT)
    public String pageCustData(PlmsClCustInfoExample example){
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

        Page<PageCustDto> pageData = new Page<PageCustDto>(pageNo, pageSize);

        pageData = custInfoService.selectIndexAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }
    /**
     * 客户查询
     * */
    @RequestMapping(value = "/pageCustSelect",method = RequestMethod.POST)
    @ResponseBody
    public String pageCustSelect(CaseCollectionExample example,HttpServletRequest request){
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

        Page<CaseCollectionDto> pageData = new Page<CaseCollectionDto>(pageNo, pageSize);

        pageData = workOrderPoolService.selectCaseCollectionAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }
}
