package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecordExample;
import com.ljwd.plms.web.model.type.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.type.inf.TypeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 案件催收-新增催记控制器
 */
@Controller
@RequestMapping(value="/caseCollection")
public class CollectionRecordController {

    @Resource
    private TypeService typeService;
    @Resource
    private PlmsLaCollectionRecordService collectionRecordService;

    /**
     * 新增催记
     * */
    @RequestMapping(value = "/addCollectionRecord",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_INSERT)
    public JSONResult addCollectionRecord(PlmsLaCollectionRecord collectionRecord){
        if(collectionRecord == null || collectionRecord.getApplId() == null){
            return new JSONResult(false,"新增催记-参数错误");
        }

        Long applId = collectionRecord.getApplId();
        String control = collectionRecord.getControlStatus();
        //控管状态为承诺还款、家人代偿、第三方代偿、申请再扣、承诺还款需再次跟进、家人代偿需再次跟进、第三方代偿需再次跟进
        if( control != null
                && ( "PTP".equals(control) || "FPTP".equals(control) || "TPTP".equals(control) || "AD".equals(control))
                     || "PTPF".equals(control) || "FPTPF".equals(control) || "TPTPF".equals(control)){
            if(collectionRecord.getRpmntDate() == null){
                return new JSONResult(false,"请选择承诺还款时间");
            }
            if(collectionRecord.getRpmntAmt() == null){
                return new JSONResult(false,"请输入承诺还款金额");
            }
            if(D.trunc(collectionRecord.getRpmntDate()).getTime() < D.getSystemCalendar().getTime().getTime()){
                return new JSONResult(false,"承诺还款时间不能小于当天");
            }
            if(collectionRecord.getRpmntAmt().compareTo(BigDecimal.valueOf(0)) <= 0){
                return new JSONResult(false,"承诺还款金额不能小于0");
            }
            int count = collectionRecordService.selectCountByExample(new PlmsLaCollectionRecordExample().setApplId(applId)
                    .setControlStatusIn("'PTP','FPTP','TPTP','AD','PTPF','FPTPF','TPTPF'").setRpmntDateMin(new Date()));
            if(count > 0){
                return new JSONResult(false,"当前存在未结束的发起再扣或承诺还款(代偿)的催收记录");
            }
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();
        collectionRecord.setCreatedBy(loginUser);
        collectionRecord.setUpdatedBy(loginUser);

        collectionRecordService.insert(collectionRecord);

        return new JSONResult(true,"操作成功");
    }

    /**
     * 修改催记
     * */
    @RequestMapping(value = "/updateCollectionRecord",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.COLLECT_REC_INSERT)
    public JSONResult updateCollectionRecord(PlmsLaCollectionRecord collectionRecord){
        if(collectionRecord == null || collectionRecord.getId() == null || collectionRecord.getRecVer() == null){
            return new JSONResult(false,"修改催记-参数错误");
        }
        if(collectionRecord.getTableType() == null || collectionRecord.getTableType() - 2 != 0){
            return new JSONResult(false,"当前催记不允许修改");
        }

        //根据记录ID查找
        PlmsLaCollectionRecord thisRecord = collectionRecordService.selectById(collectionRecord.getId());
        if(thisRecord == null){
            return new JSONResult(false,"未找到催记信息");
        }
        //登录用户
        String loginUser = SubjectUtil.getUserId();
        if(!loginUser.equals(thisRecord.getCreatedBy())){
            return new JSONResult(false,"只能修改自己创建的催记");
        }
        if(D.trunc(thisRecord.getCollectTime()).getTime() != D.getSystemCalendar().getTime().getTime()){
            return new JSONResult(false,"只能修改当天创建的催记");
        }

        Long applId = collectionRecord.getApplId();
        String control = collectionRecord.getControlStatus();
        //控管状态为承诺还款、家人代偿、第三方代偿、申请再扣、承诺还款需再次跟进、家人代偿需再次跟进、第三方代偿需再次跟进
        if( control != null
                && ( "PTP".equals(control) || "FPTP".equals(control) || "TPTP".equals(control) || "AD".equals(control))
                || "PTPF".equals(control) || "FPTPF".equals(control) || "TPTPF".equals(control)){
            if(collectionRecord.getRpmntDate() == null){
                return new JSONResult(false,"请选择承诺还款时间");
            }
            if(collectionRecord.getRpmntAmt() == null){
                return new JSONResult(false,"请输入承诺还款金额");
            }
            if(D.trunc(collectionRecord.getRpmntDate()).getTime() < D.getSystemCalendar().getTime().getTime()){
                return new JSONResult(false,"承诺还款时间不能小于当天");
            }
            if(collectionRecord.getRpmntAmt().compareTo(BigDecimal.valueOf(0)) <= 0){
                return new JSONResult(false,"承诺还款金额不能小于0");
            }
            int count = collectionRecordService.selectCountByExample(new PlmsLaCollectionRecordExample().setApplId(applId)
                    .setNoThisId(collectionRecord.getId()).setControlStatusIn("'PTP','FPTP','TPTP','AD','PTPF','FPTPF','TPTPF'").setRpmntDateMin(new Date()));
            if(count > 0){
                return new JSONResult(false,"当前存在未结束的发起再扣或承诺还款(代偿)的催收记录");
            }
        }

        PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();
        record.setId(collectionRecord.getId());
        record.setApplId(collectionRecord.getApplId());
        record.setRecVer(collectionRecord.getRecVer());
        record.setCollectMthd(collectionRecord.getCollectMthd());
        record.setStatus(collectionRecord.getStatus());
        record.setResult(collectionRecord.getResult());
        record.setControlStatus(control);
        record.setAbnormityCode(collectionRecord.getAbnormityCode());
        record.setContactor(collectionRecord.getContactor());
        record.setTel(collectionRecord.getTel());
        record.setRltn(collectionRecord.getRltn());
        record.setFollowedBy(collectionRecord.getFollowedBy());
        record.setContent(collectionRecord.getContent());
        record.setRpmntDate(collectionRecord.getRpmntDate());
        record.setRpmntAmt(collectionRecord.getRpmntAmt());
        record.setUpdatedBy(loginUser);
        record.setUpdateTime(new Date());

        collectionRecordService.update(record);

        return new JSONResult(true,"修改成功");
    }

    /**
     * 根据 催收类型 获取 跟进情况、催收代码、控管状态
     * */
    @RequestMapping(value = "/getCollectStatusAndControl",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getCollectStatusAndControl(String collectMthd){
        Map<String,Object> map = new HashMap<>();
        if(collectMthd == null || collectMthd.isEmpty()){
            return map;
        }
        if("NEWPHONE".equals(collectMthd)){
            //电话和新增电话的一样,表里只存PHONE
            collectMthd = "PHONE";
        }
        //跟进情况
        List<PlmsLCollectStatus> statusList = typeService.selectPlmsLCollectStatus(new PlmsLCollectStatusExample().setIsSelected("Y").setIsActive("Y").setGrpName(collectMthd));
        map.put("statusList",statusList);
        //控管状态
        List<PlmsLCollectControl> controlList = typeService.selectPlmsLCollectControl(new PlmsLCollectControlExample().setIsSelected("Y").setIsActive("Y").setGrpName(collectMthd));
        map.put("controlList",controlList);

        return map;
    }

    /**
     * 根据 跟进情况 获取 催收代码
     * */
    @RequestMapping(value = "/getCollectCode",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getCollectCode(String statusCode){
        Map<String,Object> map = new HashMap<>();
        if(statusCode == null || statusCode.isEmpty()){
            return map;
        }
        PlmsLCollectStatus collectStatus = typeService.selectPlmsLCollectStatusByCode(statusCode);
        if(collectStatus != null && collectStatus.getCollectCodeGroup() != null){
            //催收代码
            List<PlmsLCollectCode> codeList = typeService.selectPlmsLCollectCode(new PlmsLCollectCodeExample().setIsSelected("Y").setIsActive("Y").setGrpName(collectStatus.getCollectCodeGroup()));
            map.put("codeList",codeList);
        }
        return map;
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
