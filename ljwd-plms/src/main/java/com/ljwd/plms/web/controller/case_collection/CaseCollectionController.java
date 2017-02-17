package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfo;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecordExample;
import com.ljwd.plms.web.model.case_management.PlmsLTransferType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferTypeExample;
import com.ljwd.plms.web.model.cust.*;
import com.ljwd.plms.web.model.messageSystem.SysMessageTempLate;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitLog;
import com.ljwd.plms.web.model.type.*;
import com.ljwd.plms.web.security.RoleSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.service.case_collection.inf.LnCntrctService;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLnCollectCustInfoService;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.correspondence.inf.CorrespondenceService;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsClContactorInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsClUnitInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnAnnexService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnApplInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnPolyInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitLogService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcLogService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.service.sys_management.inf.SystemService;
import com.ljwd.plms.web.service.type.inf.*;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.*;
import com.ljwd.plms.web.vo.correspondence.PlmsCollectorInfo;
import com.ljwd.plms.web.vo.outVisit.OutVisitLogParamDto;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageExample;
import com.ljwd.plms.web.vo.outsource.OutsrcRecordDto;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;
import com.ljwd.plms.web.wsdl.webservice.service.Contact;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
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
import java.util.*;

/**
 * 案件催收控制器
 * */
@Controller
@RequestMapping(value="/caseCollection")
public class CaseCollectionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private PlmsLCollectControlService controlService;
    @Resource
    private PlmsWorkOrderPoolService workOrderPoolService;
    @Resource
    private PlmsLnCollectCustInfoService plmsLnCollectCustInfoService;
    @Resource
    private PlmsLaCollectionRecordService collectionRecordService;
    @Resource
    private PlmsLnAnnexService annexService;
    @Resource
    private PlmsLnApplInfoService applInfoService;
    @Resource
    private PlmsLnPolyInfoService plmsLnPolyInfoService;
    @Resource
    private PlmsClAddressInfoService addressInfoService;
    @Resource
    private PlmsClContactorInfoService contactorInfoService;
    @Resource
    private TypeService typeService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private PlmsLaApplOutsrcService plmsLaApplOutsrcService;
    @Resource
    private PlmsLaApplOutsrcLogService plmsLaApplOutsrcLogService;
    @Resource
    private PlmsOvmOutVisitLogService plmsOvmOutVisitLogService;
    @Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
    @Resource
	private LnCntrctService lnCntrctService;
    @Resource
    private SystemService systemService;
    @Resource
    private CorrespondenceService correspondenceService;
    @Resource
    private PlmsClUnitInfoService unitInfoService;
	/**
     * 我的案件页
     * */
    @RequestMapping(value="/caseCollectionMy")
    @RequiresPermissions(PermissionSign.CASE_MY_SELECT)
	public String caseCollectionIndex(Model model){
        String isActive = "Y";
        String orderByClause = "T.SEQ";

        //控管状态
        PlmsLCollectControlExample controlExample = new PlmsLCollectControlExample();
        controlExample.setIsSelected("Y").setIsActive(isActive);
        controlExample.setOrderByClause(orderByClause);
        List<PlmsLCollectControl> controlList = controlService.selectByExample(controlExample);

        model.addAttribute("controlList",controlList);
		return "/jsp/case_collection/caseCollectionMy";
	}
	
	/**
     * 我的案件页数据
     * */
    @RequestMapping(value = "/pageCollectionData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CASE_MY_SELECT)
    public String pageCollectionData(CaseCollectionExample example){
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

        //当前登录用户的催收案件
        String userId = SubjectUtil.getUserId();
        example.setCollector(userId);
        //逾期的案件
        example.setIsNormal(false);

        Page<CaseCollectionDto> pageData = new Page<CaseCollectionDto>(pageNo, pageSize);

        pageData = workOrderPoolService.selectCaseCollectionAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 我的案件催记页
     * @param cntrctNo 合同编号
     * */
    @RequestMapping(value="/caseCollectionMyDetail")
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL}, logical = Logical.OR)
    public String caseCollectionMyDetail(Model model,String cntrctNo){
        if(StringUtil.isEmpty(cntrctNo)){
            return "paramErrorOrDataNotFound";
        }
        //查找合同信息
        CntrctAllocDto dto = lnCntrctService.selectCntrctAllocByCntrctNo(cntrctNo);
        if(dto == null){
            return "paramErrorOrDataNotFound";
        }

//        String userId = SubjectUtil.getUserId();
//        String collector = dto.getCollector();              //当前催收员
//        String agent = dto.getAgent();                      //当前代理催收员
//        //催收员为空,或者登陆用户不是催收员和代理催收员
//        if(StringUtil.isEmpty(collector) || ( !collector.equals(userId) && ( agent == null || !agent.equals(userId)) )){
//            return "401";
//        }

        Integer overduePeriod = dto.getOverduePeriod();     //最早逾期期数
        Long applId = dto.getApplId();                      //借款ID
        //根据借款申请ID统计借款详细、破坏承诺次数、银行代扣情况、扣款账户
        ApplDetailDto applDetail = collectionRecordService.selectApplDetailByApplIdAndDuePeriod(applId,overduePeriod);
        //自定义信息
        PlmsLnCollectCustInfo collectCustInfo = plmsLnCollectCustInfoService.selectByApplId(applId);

        //短信模板
        /*List<SysMessageTempLate> listsmt1 = collectionRecordService.selectSysMessageTempLateSuiTableGroup();
        //去掉“区间”二字
        for(SysMessageTempLate smt:listsmt1){
            String str = smt.getSuiTableGroup();
            smt.setSuiTableGroup(str.substring(0, str.length()-2));
        }
        model.addAttribute("smt1",listsmt1);*/

        String isActive = "Y";
        String orderByClause = "T.SEQ";
        //来源类型
        PlmsLSourceTypeExample sourceParam = new PlmsLSourceTypeExample();
        sourceParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLSourceType> sourceList = typeService.selectPlmsLSourceType(sourceParam);
        model.addAttribute("sourceList",sourceList);

        //地址类型
        PlmsLAddressTypeExample addressExample = new PlmsLAddressTypeExample();
        addressExample.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAddressType> addressList = typeService.selectPlmsLAddressType(addressExample);
        model.addAttribute("addressList",addressList);

        //关系类型
        LRltnshpExample rltnshpParam = new LRltnshpExample();
        rltnshpParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<LRltnshp> rltnshpList = typeService.selectLRltnshp(rltnshpParam);
        model.addAttribute("rltnshpList",rltnshpList);
        /*List<LRltnshp> rltnshpListMes = collectionRecordService.selectRelationMesData(applDetail.getIdCardNo());
        if(rltnshpListMes.size()>0){
        	model.addAttribute("rltnshpListMes",rltnshpListMes);
        }else{
        	model.addAttribute("rltnshpListMes",null);
        }*/

        //附件类型
        PlmsLAnnexTypeExample annexParam = new PlmsLAnnexTypeExample();
        annexParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAnnexType> annexTypeList = typeService.selectPlmsLAnnexType(annexParam);
        model.addAttribute("annexTypeList",annexTypeList);

        //号码类型
        PlmsLTelTypeExample telParam = new PlmsLTelTypeExample();
        telParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLTelType> telList = typeService.selectPlmsLTelType(telParam);
        model.addAttribute("telList",telList);

        //移交类型
        PlmsLTransferTypeExample transferTypeExample = new PlmsLTransferTypeExample();
        transferTypeExample.setOrderByClause("SEQ");
        List<PlmsLTransferType> transferTypeList = typeService.selectPlmsLTransferType(transferTypeExample);
        model.addAttribute("transferTypeList",transferTypeList);

        //催收类型
        PlmsLCollectMthdExample mthdExample = new PlmsLCollectMthdExample();
        mthdExample.setOrderByClause(orderByClause);
        //全部催收类型
        List<PlmsLCollectMthd> allMthdList = typeService.selectPlmsLCollectMthd(mthdExample);
        //显示在下拉框的催收类型
        List<PlmsLCollectMthd> mthdList = new ArrayList<PlmsLCollectMthd>();
        if(allMthdList != null && allMthdList.size() > 0){
            for(PlmsLCollectMthd mthd : allMthdList){
                //有效且显示在下拉框
                if(isActive.equals(mthd.getIsSelected()) && isActive.equals(mthd.getIsActive())){
                    mthdList.add(mthd);
                }
            }
        }
        model.addAttribute("mthdList",mthdList);
        model.addAttribute("allMthdList",allMthdList);

        //个案情况
        PlmsLCollectAbnormityExample abnormityExample = new PlmsLCollectAbnormityExample();
        abnormityExample.setIsSelected("Y").setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLCollectAbnormity> abnormityList = typeService.selectPlmsLCollectAbnormity(abnormityExample);
        model.addAttribute("abnormityList",abnormityList);

        //获取保留截止日期
        String nextWorkDay = D.parse(systemService.getKeepDay(applDetail.getPrdNo(),applDetail.getOverDays()));
        
        //外访客户类型列表
        Map<String,Object> outVisitCustType = OutVisitCustType.getOutVisitCustType();

        //根据合同号查询对应的催收员的姓氏和办公电话信息
        PlmsCollectorInfo collectoeInfo = correspondenceService.selectCollectorInfo(cntrctNo);

        model.addAttribute("outVisitCustType", outVisitCustType);
        model.addAttribute("applId",applId);
        model.addAttribute("applDetail",applDetail);
        model.addAttribute("nextWorkDay",nextWorkDay);
        model.addAttribute("overduePeriod",overduePeriod);
        model.addAttribute("collectCustInfo",collectCustInfo);
        model.addAttribute("collectoeInfo", collectoeInfo);
        return "/jsp/case_collection/caseCollectionMyDetail";
    }

    /**
     * 催收记录数据
     * */
    @RequestMapping(value = "/pageCollectionRecordData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public Page<PlmsLaCollectionRecord> pageCollectionRecordData(PlmsLaCollectionRecordExample example,HttpServletRequest request){
    	if(example == null || example.getApplId() == null){
            //如果参数为空或借款ID为空就返回空数据
    		return null;
    	}
        int pageSize = example.getPageSize();      //每页记录数
        int pageNo = example.getPageNo();          //页数
        //设置排序
        example.setOrderByClause();
        Page<PlmsLaCollectionRecord> pageData = new Page<PlmsLaCollectionRecord>(pageNo, pageSize);
        pageData = collectionRecordService.selectByExampleAndPage(pageData, example);
        return pageData;
    }

    /**
     * 全部案件页
     * */
    @RequestMapping(value="/caseCollectionAll")
    @RequiresPermissions(PermissionSign.CASE_ALL_SELECT)
    public String caseCollectionAll(Model model){
        String isActive = "Y";
        String orderByClause = "T.SEQ";

        //控管状态
        PlmsLCollectControlExample controlExample = new PlmsLCollectControlExample();
        controlExample.setIsSelected("Y").setIsActive(isActive);
        controlExample.setOrderByClause(orderByClause);
        List<PlmsLCollectControl> controlList = controlService.selectByExample(controlExample);
        model.addAttribute("controlList",controlList);

        //所有催收人员列表
        List<UserEmpOrgDto> userEmpOrgList = null;

        Subject subject = SubjectUtil.getSubject();
        //如果有查看全部催收员权限,查询所有催收员
        if(subject.isPermitted(PermissionSign.CASE_ALL_ALL_COLLECTOR)){
            userEmpOrgList = sysUserService.selectUserEmpOrg(null,null);
        }else {
            userEmpOrgList = sysUserService.selectUserEmpOrg(null,(String)subject.getPrincipal());
        }
        model.addAttribute("userEmpOrgList",userEmpOrgList);

        //机构Map
        Map<Long,String> orgMap = new HashMap<Long,String>();
        if(userEmpOrgList != null && userEmpOrgList.size() > 0){
            for(UserEmpOrgDto ueo : userEmpOrgList){
                orgMap.put(ueo.getOrgId(),ueo.getOrgName());
            }
        }
        model.addAttribute("orgMap",orgMap);

        return "/jsp/case_collection/caseCollectionAll";
    }

    /**
     * 全部案件页数据
     * */
    @RequestMapping(value = "/pageCollectionDataAll",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CASE_ALL_SELECT)
    public String pageCollectionDataAll(CaseCollectionExample example,HttpServletRequest request){
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

        //如果催收员为空
        if(StringUtil.isEmpty(example.getCollector()) && StringUtil.isEmpty(example.getCollectorName())){
            Subject subject = SubjectUtil.getSubject();
            //如果没有查看全部催收员权限
            if(!subject.isPermitted(PermissionSign.CASE_ALL_ALL_COLLECTOR)){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }

        pageData = workOrderPoolService.selectCaseCollectionAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 全部案件催记页
     * @param cntrctNo 合同编号
     * */
    @RequestMapping(value="/caseCollectionAllDetail")
    @RequiresPermissions(value = {PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public String caseCollectionAllDetail(Model model,String cntrctNo){
        if(StringUtil.isEmpty(cntrctNo)){
            return "paramErrorOrDataNotFound";
        }
        //查找合同信息
        CntrctAllocDto dto = lnCntrctService.selectCntrctAllocByCntrctNo(cntrctNo);
        if(dto == null){
            return "paramErrorOrDataNotFound";
        }

        Integer overduePeriod = dto.getOverduePeriod();     //最早逾期期数
        Long applId = dto.getApplId();                      //借款ID
        //根据借款申请ID统计借款详细、破坏承诺次数、银行代扣情况、扣款账户
        ApplDetailDto applDetail = collectionRecordService.selectApplDetailByApplIdAndDuePeriod(applId,overduePeriod);
        //自定义信息
        PlmsLnCollectCustInfo collectCustInfo = plmsLnCollectCustInfoService.selectByApplId(applId);

        /*List<SysMessageTempLate> listsmt1 = collectionRecordService.selectSysMessageTempLateSuiTableGroup();
        //去掉“区间”二字
        for(SysMessageTempLate smt:listsmt1){
            String str = smt.getSuiTableGroup();
            smt.setSuiTableGroup(str.substring(0, str.length()-2));
        }
        model.addAttribute("smt1",listsmt1);*/

        String isActive = "Y";
        String orderByClause = "T.SEQ";
        //来源类型
        PlmsLSourceTypeExample sourceParam = new PlmsLSourceTypeExample();
        sourceParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLSourceType> sourceList = typeService.selectPlmsLSourceType(sourceParam);
        model.addAttribute("sourceList",sourceList);

        //地址类型
        PlmsLAddressTypeExample addressExample = new PlmsLAddressTypeExample();
        addressExample.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAddressType> addressList = typeService.selectPlmsLAddressType(addressExample);
        model.addAttribute("addressList",addressList);

        //关系类型
        LRltnshpExample rltnshpParam = new LRltnshpExample();
        rltnshpParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<LRltnshp> rltnshpList = typeService.selectLRltnshp(rltnshpParam);
        model.addAttribute("rltnshpList",rltnshpList);
        /*List<LRltnshp> rltnshpListMes = collectionRecordService.selectRelationMesData(applDetail.getIdCardNo());
        if(rltnshpListMes.size()>0){
        	model.addAttribute("rltnshpListMes",rltnshpListMes);
        }else{
        	model.addAttribute("rltnshpListMes",null);
        }*/

        //附件类型
        PlmsLAnnexTypeExample annexParam = new PlmsLAnnexTypeExample();
        annexParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLAnnexType> annexTypeList = typeService.selectPlmsLAnnexType(annexParam);
        model.addAttribute("annexTypeList",annexTypeList);

        //号码类型
        PlmsLTelTypeExample telParam = new PlmsLTelTypeExample();
        telParam.setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLTelType> telList = typeService.selectPlmsLTelType(telParam);
        model.addAttribute("telList",telList);

        //移交类型
        PlmsLTransferTypeExample transferTypeExample = new PlmsLTransferTypeExample();
        transferTypeExample.setOrderByClause("SEQ");
        List<PlmsLTransferType> transferTypeList = typeService.selectPlmsLTransferType(transferTypeExample);
        model.addAttribute("transferTypeList",transferTypeList);

        //催收类型
        PlmsLCollectMthdExample mthdExample = new PlmsLCollectMthdExample();
        mthdExample.setOrderByClause(orderByClause);
        //全部催收类型
        List<PlmsLCollectMthd> allMthdList = typeService.selectPlmsLCollectMthd(mthdExample);
        //显示在下拉框的催收类型
        List<PlmsLCollectMthd> mthdList = new ArrayList<PlmsLCollectMthd>();
        if(allMthdList != null && allMthdList.size() > 0){
            for(PlmsLCollectMthd mthd : allMthdList){
                //有效且显示在下拉框
                if(isActive.equals(mthd.getIsSelected()) && isActive.equals(mthd.getIsActive())){
                    mthdList.add(mthd);
                }
            }
        }
        model.addAttribute("mthdList",mthdList);
        model.addAttribute("allMthdList",allMthdList);

        //个案情况
        PlmsLCollectAbnormityExample abnormityExample = new PlmsLCollectAbnormityExample();
        abnormityExample.setIsSelected("Y").setIsActive(isActive).setOrderByClause(orderByClause);
        List<PlmsLCollectAbnormity> abnormityList = typeService.selectPlmsLCollectAbnormity(abnormityExample);
        //根据合同号查询对应的催收员的姓氏和办公电话信息
        PlmsCollectorInfo collectoeInfo = correspondenceService.selectCollectorInfo(cntrctNo);
        model.addAttribute("abnormityList",abnormityList);
        model.addAttribute("collectoeInfo", collectoeInfo);
        model.addAttribute("applId",applId);
        model.addAttribute("applDetail",applDetail);
        model.addAttribute("overduePeriod",overduePeriod);
        model.addAttribute("collectCustInfo",collectCustInfo);
        return "/jsp/case_collection/caseCollectionAllDetail";
    }

    /**
     * 客户通讯信息数据
     * */
    @RequestMapping(value = "/pageCollectionContactorData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public Page<PlmsClContactorInfo> pageCollectionContactorData(PlmsClContactorInfoExample example,HttpServletRequest request){
    	if(request.getParameter("applIdCol")==null || "".equals(request.getParameter("applIdCol"))){
    		return null;
    	}
        //每页记录数
        int pageSize = Integer.parseInt(request.getParameter("beginPageSizeCol"));
        //页数
        int pageNo = Integer.parseInt(request.getParameter("beginPageNoCol"));
        example.setClCustIdByApplId(Long.parseLong(request.getParameter("applIdCol")));
        //关联呼叫记录表查最近拨打时间、拨通时间
        example.setSelectCall(true);
        example.setOrderByClause("T.ID DESC");

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

        return pageData;
    }

    /**
     * 客户地址信息数据
     * */
    @RequestMapping(value = "/pageCollectionAddressData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public String pageCollectionAddressData(PlmsClAddressInfoExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustIdByApplId() == null){
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

        Page<PlmsClAddressInfo> pageData = new Page<PlmsClAddressInfo>(pageNo, pageSize);

        pageData = addressInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }
    /**
     * 客户单位信息数据
     * */
    @RequestMapping(value = "/pageCollectionUnitData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public String pageCollectionUnitData(PlmsClUnitInfoExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustIdByApplId() == null){
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

        Page<PlmsClUnitInfo> pageData = new Page<PlmsClUnitInfo>(pageNo, pageSize);

        pageData = unitInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }
    /**
     * 客户附件信息数据
     * */
    @RequestMapping(value = "/pageCollectionAnnexData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public String pageCollectionAnnexData(PlmsLnAnnexExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getApplIdOrNull() == null){
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

        Page<PlmsLnAnnex> pageData = new Page<PlmsLnAnnex>(pageNo, pageSize);

        pageData = annexService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 客户贷款信息数据
     * */
    @RequestMapping(value = "/pageCollectionApplData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public String pageCollectionApplData(PlmsLnApplInfoExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustIdByApplId() == null){
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

    /**
    * @Title: 聚信立数据查询
    * @Description: TODO(聚信立数据查询) 
    */
    @RequestMapping(value="/pageClollectionPolyData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public List<ContactNew> pageClollectionPolyData(PlmsLnPolyInfoExample example,HttpServletRequest request){
        List<ContactNew> polyNewList = new ArrayList<ContactNew>();
        //接口查到的聚信立数据
        List<Contact> polyList = plmsLnPolyInfoService.selectByExampleAndPage(example);
        if(polyList != null && polyList.size() > 0){
            //客户联系人信息
            List<PlmsClContactorInfo> contactorList = contactorInfoService.selectByExample(new PlmsClContactorInfoExample().setSelectCall(true).setApplId(example.getApplId()));
            for(Contact contact : polyList){
                ContactNew contactNew = new ContactNew();
                contactNew.setCallCnt(contact.getCallCnt());
                contactNew.setCallLen(contact.getCallLen());
                contactNew.setContactor(contact.getContactor());
                contactNew.setPhone(contact.getPhone());
                contactNew.setPhoneLoc(contact.getPhoneLoc());
                contactNew.setRelation(contact.getRelation());
                if(contactorList != null && contactorList.size() > 0){
                    for(PlmsClContactorInfo info : contactorList){
                        String area = info.getArea() == null ? "" : info.getArea() + "-";
                        String ext = info.getExt() == null ? "" : "-" + info.getExt();
                        String telNo = area + info.getTel() + ext;
                        //如果号码匹配
                        if(contact.getPhone().equals(telNo)){
                            contactNew.setPhoneRepet(true);
                            contactNew.setRecentlyCallDate(info.getMaxCallDate());
                            contactNew.setRecentlyDialDate(info.getMaxCreateTime());
                        }
                    }
                }
                polyNewList.add(contactNew);
            }
        }
        return polyNewList;
    }

    /**
     * 银行代扣数据
     * */
    @RequestMapping(value = "/pageLoanStuationData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_LOAN)
    public String pageLoanStuationData(LoanStuationExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getApplId() == null){
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

        Page<LoanStuationDto> pageData = new Page<LoanStuationDto>(pageNo, pageSize);

        pageData = collectionRecordService.selectLoanStuationAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 委外记录数据
     * */
    @RequestMapping(value = "/pageCollectionOutData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public String pageCollectionOutData(OutsrcLogPageExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getApplId() == null){
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

        Page<OutsrcLogPageDto> pageData = new Page<OutsrcLogPageDto>(pageNo, pageSize);

        pageData = plmsLaApplOutsrcLogService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 根据借款申请ID获取最新的委外记录
     * @param applId 借款申请ID
     */
    @RequestMapping(value = "/getOutByApplId", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    public OutsrcRecordDto getOutByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        return plmsLaApplOutsrcService.selectOutsrcRecordByApplId(applId);
    }

    
    /**
     * 
    * @Description: 查询外访日志 
    * @param example
    * @return
    * @return String
     */
    @RequestMapping("/pageCollectionOutVisitData")
    @ResponseBody
    public String pageCollectionOutVisitData(OutVisitLogParamDto example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getApplId() == null){
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

        Page<PlmsOvmOutVisitLog> pageData = new Page<PlmsOvmOutVisitLog>(pageNo, pageSize);

        pageData = plmsOvmOutVisitLogService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }
   
    
    @RequestMapping("/getTheNewestOutVisitByApplId")
    @ResponseBody
    public PlmsOvmOutVisitInfo getTheNewestOutVisitByApplId(Long applId){
    	 if(applId == null){
             return null;
         }
    	PlmsOvmOutVisitInfo outInfo = plmsOvmOutVisitInfoService.getTheNewestOutVisitByApplId(applId);
		
    	return outInfo;
    	
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
