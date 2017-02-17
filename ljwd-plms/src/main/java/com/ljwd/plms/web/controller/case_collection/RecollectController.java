package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.enums.RepayType;
import com.ljwd.plms.web.model.case_collection.LfOfferExempt;
import com.ljwd.plms.web.model.case_collection.LfOfferExemptExample;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.LfOfferExemptService;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.RecollectReqMsg;
import com.ljwd.plms.web.vo.case_collection.RecollectVo;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/17
 * 案件催收-发起再扣控制器
 */
@Controller
@RequestMapping(value="/caseCollection")
public class RecollectController {

    @Resource
    private PlmsLaCollectionRecordService plmsLaCollectionRecordService;
    @Resource
    private LfOfferExemptService lfOfferExemptService;

    /**
     * 发起再扣
     * @param vo 再扣参数
     */
    @RequestMapping("/recollect")
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.COLLECT_REC_RE_COLLECT, PermissionSign.OUT_SRC_RE_COLLECT}, logical = Logical.OR)
    public JSONResult addOfferExempt(RecollectVo vo,HttpServletRequest request) {
        if(vo == null || StringUtil.isEmpty(vo.getCntrctNo())){
            return new JSONResult(false,"合同编号不能为空");
        }
        if(vo.getPaymentId() == null){
            return new JSONResult(false,"参数错误[paymentId]");
        }
        if(vo.getOverduePeriod() == null){
            return new JSONResult(false,"期数不能为空");
        }
        if(vo.getPayType() == null){
            return new JSONResult(false,"请选择还款方式");
        }
        if(vo.getCollectAmt() == null){
            return new JSONResult(false,"请输入再扣金额");
        }
        if(vo.getRepaymentDate() == null){
            return new JSONResult(false,"请选择再扣日期");
        }
//        if(D.getSystemCalendar().getTime().compareTo(vo.getCollectDate()) > 0){
//            return new JSONResult(false,"再扣日期必须大于等于当天日期");
//        }

//        //此借款新增状态的免扣申请且未过期的免扣申请
//        int count = lfOfferExemptService.countByExample(new LfOfferExemptExample().setPaymentId(vo.getPaymentId())
//                .setEndDateMin(new Date()).setStatus(LfOfferExempt.STATUS_ADDED));
//        if(count > 0){
//            return new JSONResult(false,"当前案件已申请免扣");
//        }

        SessionMsg session = SubjectUtil.getSession(request);
        //请求参数实体
        RecollectReqMsg xmlMsg = new RecollectReqMsg();
        xmlMsg.setContractNo(vo.getCntrctNo());
        xmlMsg.setPeriodNum(vo.getOverduePeriod());
        xmlMsg.setRepayType(vo.getPayType());
        xmlMsg.setCollectDate(vo.getRepaymentDate());
        xmlMsg.setCollectAmt(vo.getCollectAmt());
        xmlMsg.setRequestBy(session.getName());

        //使用JAXB实现XML序列号
        JaxbBinder binder = new JaxbBinder(RecollectReqMsg.class, JaxbBinder.CollectionWrapper.class);
        String xmlObj = binder.toXml(xmlMsg,"UTF-8");
        JSONResult result = HttpUtils.sendHttpToMfbms(xmlObj,"RPC","RecollectReqMsg");

        if(result.isSuccess()){
            Date time = new Date();
            String payType = "";
            if(vo.getPayType() == RepayType.NORMAL){
                payType = "正常还款";
            }else {
                payType = "提前结清";
            }
            //如果成功,添加一条发起再扣的催收记录
            PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
            record.setApplId(vo.getApplId());
            record.setPeriodNum(Long.valueOf(vo.getOverduePeriod()));
            record.setCollectTime(time);
            record.setFollowedBy(session.getUserName());
            record.setInputTime(time);
            record.setCollectMthd("AGAINDEDUCT");
            record.setStatus("AGAINDEDUCT");
            record.setResult("AGAINDEDUCT");
            record.setContent("再扣日期：" + D.parse(vo.getRepaymentDate()) + "，再扣金额：" + vo.getCollectAmt() + "，还款方式：" + payType);
            record.setCreatedBy("system");
            record.setUpdatedBy(session.getName());
            plmsLaCollectionRecordService.insert(record);
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
