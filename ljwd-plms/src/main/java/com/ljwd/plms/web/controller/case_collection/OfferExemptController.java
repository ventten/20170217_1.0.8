package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.model.case_collection.*;
import com.ljwd.plms.web.model.messageSystem.CalculateSummaryReceivableParamMyDto;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.RoleSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.LfOfferExemptService;
import com.ljwd.plms.web.service.case_collection.inf.LfReCollectReqService;
import com.ljwd.plms.web.service.case_collection.inf.LfRecivDtlService;
import com.ljwd.plms.web.service.case_collection.inf.LnPaymentService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.ErrorInfo;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.ApplyExemptDto;
import com.ljwd.plms.web.vo.case_collection.OfferExemptCancelMsg;
import com.ljwd.plms.web.vo.case_collection.OfferExemptReqMsg;
import com.ljwd.plms.web.vo.sys_management.SysPaymentTypeDto;
import com.ljwd.plms.web.vo.sys_management.UserEmpOrgDto;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.ReceivableDetailDto;
import com.ljwd.plms.web.wsdl.webservice.service.ReceivableSearchResultDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;

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

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhengzw on 2016/9/2
 * 案件催收-免扣管理控制器
 */
@Controller
@RequestMapping(value="/caseCollection")
public class OfferExemptController {

    @Resource
    private LfOfferExemptService lfOfferExemptService;
    @Resource
    private LfReCollectReqService reCollectReqService;
    @Resource
    private LnPaymentService lnPaymentService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private LfRecivDtlService lfRecivDtlService;
    /**
     * 免扣管理页
     * */
    @RequestMapping(value="/offerExemptIndex")
    @RequiresPermissions(PermissionSign.OFFER_EXEMPT_SELECT)
    public String offerExemptIndex(Model model){
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
        return "/jsp/case_collection/offerExemptIndex";
    }

    /**
     * 免扣管理页数据
     * */
    @RequestMapping(value = "/pageOfferExemptData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OFFER_EXEMPT_SELECT)
    public String pageOfferExemptData(LfOfferExemptExample example, HttpServletRequest request){
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

        Page<LfOfferExempt> pageData = new Page<LfOfferExempt>(pageNo, pageSize);

        //如果申请人姓名为空
        if(StringUtil.isEmpty(example.getReqByName())){
            Subject subject = SubjectUtil.getSubject();
            //如果没有查看全部催收员权限
            if(!subject.isPermitted(PermissionSign.CASE_ALL_ALL_COLLECTOR)){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }

        pageData = lfOfferExemptService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }
    /**
     * 免扣作废
     * @param offerExemptId 免扣申请ID
     */
    @RequestMapping("/cancelOfferExempt")
    @ResponseBody
    public JSONResult cancelOfferExempt(Long offerExemptId) {
        if(offerExemptId == null){
            return new JSONResult(false,"请选择需作废的申请");
        }
        LfOfferExempt exempt = lfOfferExemptService.selectById(offerExemptId);
        if(exempt == null){
            return new JSONResult(false,"找不到免扣申请");
        }
        if(LfOfferExempt.STATUS_CANCELLED.equals(exempt.getStatus())){
            return new JSONResult(false,"此记录已经处于作废状态");
        }
        String userId = SubjectUtil.getUserId();
        if(!userId.equals(exempt.getReqBy())){
            return new JSONResult(false,"无法取消其他人提交的免扣申请");
        }

        //请求参数实体
        OfferExemptCancelMsg xmlMsg = new OfferExemptCancelMsg();
        xmlMsg.setOfferExemptId(exempt.getId());
        xmlMsg.setCancelledBy(userId);
        xmlMsg.setRecordVersion(exempt.getRecVer());

        //使用JAXB实现XML序列号
        JaxbBinder binder = new JaxbBinder(OfferExemptCancelMsg.class, JaxbBinder.CollectionWrapper.class);
        String xmlObj = binder.toXml(xmlMsg,"UTF-8");
        return HttpUtils.sendHttpToMfbms(xmlObj,"RPC","OfferExemptCancelMsg");

//        LfOfferExempt lfOfferExempt = new LfOfferExempt();
//        lfOfferExempt.setId(exempt.getId());
//        lfOfferExempt.setRecVer(exempt.getRecVer());
//        lfOfferExempt.setStatus(LfOfferExempt.STATUS_CANCELLED);
//        lfOfferExempt.setCancelledBy(userId);
//        lfOfferExempt.setCancelTime(new Date());
//
//        int ret = lfOfferExemptService.update(lfOfferExempt);
//        if(ret <= 0){
//            return new JSONResult(false,"作废失败,请刷新重试");
//        }

//        return new JSONResult(true,"操作成功");
    }

    /**
     * 查找免扣合同
     * @param custName 主贷人
     * @param cntrctNo 合同编号
     */
    @RequestMapping("/getApplyExempt")
    @ResponseBody
    public List<ApplyExemptDto> getApplyExempt(String custName,String cntrctNo) {
        return lfOfferExemptService.selectApplyExempt(custName, cntrctNo);
    }

    /**
     * 申请免扣
     * @param offerExempt 免扣申请
     */
    @RequestMapping("/addOfferExempt")
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.OFFER_EXEMPT_INSERT, PermissionSign.COLLECT_REC_OFFER_EXEMPT}, logical = Logical.OR)
    public JSONResult addOfferExempt(LfOfferExempt offerExempt) {
        if(offerExempt == null || offerExempt.getPaymentId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(offerExempt.getEndDate() == null){
            return new JSONResult(false,"请选择免扣结束日期");
        }
        if(D.getSystemCalendar().getTime().compareTo(offerExempt.getEndDate()) > 0){
            return new JSONResult(false,"免扣截止日期必须大于等于当天日期");
        }

        Long paymentId = offerExempt.getPaymentId();

        LnPayment payment = lnPaymentService.selectByPrimaryKey(paymentId);
        if(payment == null){
            return new JSONResult(false,"can't find the payment of payment id:" + paymentId);
        }

//        List<String> statusS = new ArrayList<String>();
//        statusS.add(LfReCollectReq.STATUS_CREATED);
//        statusS.add(LfReCollectReq.STATUS_OFFERED);
//        int count = reCollectReqService.countByExample(new LfReCollectReqExample().setCntrctId(payment.getCntrctId()).setStatusS(statusS));
//        if(count > 0){
//            return new JSONResult(false,"案件已在再扣流程,不能申请免扣");
//        }

        String userId = SubjectUtil.getUserId();
        //请求参数实体
        OfferExemptReqMsg xmlMsg = new OfferExemptReqMsg();
        xmlMsg.setContractNo(payment.getCntrctNo());
        xmlMsg.setEndDate(offerExempt.getEndDate());
        xmlMsg.setRequestBy(userId);

        //使用JAXB实现XML序列号
        JaxbBinder binder = new JaxbBinder(OfferExemptReqMsg.class, JaxbBinder.CollectionWrapper.class);
        String xmlObj = binder.toXml(xmlMsg,"UTF-8");
        return HttpUtils.sendHttpToMfbms(xmlObj,"RPC","OfferExemptReqMsg");

//        //此借款新增状态的免扣申请
//        int count = lfOfferExemptService.countByExample(new LfOfferExemptExample().setPaymentId(paymentId).setEndDateMin(new Date()).setStatus(LfOfferExempt.STATUS_ADDED));
//        if(count > 0){
//            return new JSONResult(false,"当前案件已申请免扣");
//        }
//
//        offerExempt.setCreatedBy(userId);
//        offerExempt.setUpdatedBy(userId);
//        offerExempt.setReqBy(userId);
//        offerExempt.setReqTime(new Date());
//        offerExempt.setStatus(LfOfferExempt.STATUS_ADDED);
//
//        int ret = lfOfferExemptService.insert(offerExempt);
//        if(ret < 1){
//            return new JSONResult(false,"申请免扣失败");
//        }
//        return new JSONResult(true,"免扣申请成功");
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
