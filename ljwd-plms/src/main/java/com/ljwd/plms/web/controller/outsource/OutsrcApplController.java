package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.enums.TransferStatusType;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolLog;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsLTransferAdvanceService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolLogService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.AddOutsrcApplDto;
import com.ljwd.plms.web.vo.outsource.AddOutsrcApplVo;
import com.ljwd.plms.web.vo.outsource.OutsrcDto;
import com.ljwd.plms.web.vo.outsource.OutsrcExample;
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
import java.util.*;

/**
 * Created by zhengzw
 * 委外申请控制器-申请委外
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcApplController {

    @Resource
    private PlmsWorkOrderPoolService poolService;
    @Resource
    private PlmsLaApplOutsrcService outsrcService;
    @Resource
    private PlmsWorkOrderPoolLogService poolLogService;
    @Resource
    private PlmsOvmOutVisitInfoService ovmOutVisitInfoService;
    @Resource
    private PlmsLTransferAdvanceService transferAdvanceService;

    /**
     * 电催催收员发起委外申请
     * @param vo 发起委外申请封装VO类
     * @param request request
     */
    @RequestMapping("/addOutsrcAppl")
    @ResponseBody
    @RequiresPermissions(PermissionSign.CASE_MY_OUT_ADD)
    public JSONResult addOutsrcAppl(AddOutsrcApplVo vo,HttpServletRequest request) {
        if(vo == null){
            return new JSONResult(false,"发起委外申请-参数异常");
        }
        if(vo.getStartDate() == null){
            return new JSONResult(false,"请选择委外日期");
        }
        //委外日期
        Date startDate = vo.getStartDate();
        if(D.trunc(startDate).getTime() < D.getSystemCalendar().getTime().getTime()){
            return new JSONResult(false,"委外日期不能小于当前日期");
        }
        //委外原因
        String reason = vo.getReason();
        if(StringUtil.isEmpty(reason)){
            return new JSONResult(false,"请输入委外原因");
        }
        //案件借款IDS
        List<Long> applIds = vo.getApplIds();
        if(applIds == null || applIds.isEmpty()){
            return new JSONResult(false,"请选择需委外的案件");
        }
        if(applIds.size() > 1){
            return new JSONResult(false,"不支持批量操作");
        }

        //校验
        String checkResult = this.checkAddOne(startDate,applIds);
        if(checkResult != null){
            return new JSONResult(false,checkResult);
        }

        //查找案件信息
        List<AddOutsrcApplDto> dtoList = outsrcService.selectAddOutsrcApplByApplIds(applIds);
        if(dtoList != null && dtoList.size() > 0){
            //校验
            checkResult = this.checkAddTwo(dtoList);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }
        }else {
            return new JSONResult(false,"案件信息不存在");
        }

        SessionMsg session = SubjectUtil.getSession(request);
        outsrcService.saveAdd(startDate,reason,dtoList,session);     //保存

        return new JSONResult(true,"申请委外成功");
    }

    /**
     * 委外专员发起委外申请
     * @param idsArr 选中的委外申请IDS
     * @param startDate 委外日期
     * @param request request
     */
    @RequestMapping("/appl")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_INSERT)
    public JSONResult appl(Long[] idsArr,Date startDate,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需申请委外的案件");
        }
        if(startDate == null){
            return new JSONResult(false,"请选择委外日期");
        }
        startDate = D.trunc(startDate);
        if(startDate.getTime() < D.getSystemCalendar().getTime().getTime()){
            return new JSONResult(false,"委外日期不能小于当前日期");
        }

        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids,idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids).setStatus(PlmsLaApplOutsrc.STATUS_ENDED)
                .setWinfoStatus(LoanStatus.REPAYING).setMaxId(true).setHasOverDaysNum(true);
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkAppl(outsrcList,startDate);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }

            SessionMsg session = SubjectUtil.getSession(request);
            //委外专员发起委外申请
            outsrcService.saveAppl(startDate,outsrcList,session);
        }else {
            return new JSONResult(false,"未找到可以发起委外申请的案件");
        }
        return new JSONResult(true,"申请成功");
    }

    /**
     * 发起申请时校验
     * @param applIds 借款IDS
     * @return 校验结果:null时通过
     */
    private String checkAddOne(Date startDate,List<Long> applIds){
        //判断是否在外访流程
        Long[] applIdsArr = (Long[])applIds.toArray(new Long[applIds.size()]);
        Map<String,Object> mapOutVisit = new HashMap<String,Object>();
        mapOutVisit.put("applIds", applIdsArr);
        List<PlmsOvmOutVisitInfo> exitList = ovmOutVisitInfoService.checkIfExistOutVisitInfo(mapOutVisit);
        if(exitList != null && exitList.size() > 0){
            return "案件已在外访流程";
        }

        for(Long applId : applIds){
            PlmsWorkOrderPool workOrderPool = poolService.selectByApplId(applId);
            if(workOrderPool == null){
                return "案件不存在";
            }
            if(!"M1".equals(workOrderPool.getCircuRuleCode()) && !"M2".equals(workOrderPool.getCircuRuleCode()) && !"TRANINAD".equals(workOrderPool.getCircuRuleCode())){
                return "只有M1、M2、提前移交区间的案件才可以申请委外";
            }

            //根据借款ID判断是否在提前移交流程
            boolean checkResult = transferAdvanceService.selectCheckIsAdvance(applId);
            if(checkResult){
                return "案件已申请提前移交";
            }

            //豁免要实时判断，要去查找微贷的状态
            checkResult = poolLogService.selectCheckIsWaive(applId);
            if(checkResult){
                return "案件已提交豁免申请，不能申请委外";
            }

            //根据借款ID, 判断最新的日志
            int logResult = poolLogService.selectCheckMaxLog(applId);
            switch (logResult){
                case 1:
                    return "案件已申请保留";
                case 2:
                    return "案件在豁免保护中";
                case 4:
                    return "案件在离职保护中";
                case 5:
                    return "案件已申请委外保留";
            }
        }

        //委外申请状态
        List<String> statusS = new ArrayList<String>();
        statusS.add(PlmsLaApplOutsrc.STATUS_AUDIT);         //状态:待审核
        statusS.add(PlmsLaApplOutsrc.STATUS_DRAFT);         //状态:待提交
        statusS.add(PlmsLaApplOutsrc.STATUS_SUBMITTED);     //状态:待审批(已提交)
        statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);      //状态:已审批

        //根据状态集合和借款IDS查找
        List<PlmsLaApplOutsrc> checkList = outsrcService.selectByExample(new PlmsLaApplOutsrcExample().setCheck(true).setApplIds(applIds).setStatusS(statusS).setStartDate(startDate));
        if(checkList != null && checkList.size() > 0){
            return "案件已在委外流程,或委外日期重叠";
        }
        return null;
    }

    /**
     * 发起申请时校验
     * @param dtoList 案件信息
     * @return 校验结果:null时通过
     */
    private String checkAddTwo(List<AddOutsrcApplDto> dtoList){
        for(AddOutsrcApplDto dto : dtoList){
            if(!LoanStatus.REPAYING.equals(dto.getWfStatus())){
                return "不在还款中的合同,不能申请委外";
            }
        }

        return null;
    }

    /**
     * 委外专员发起委外申请时校验
     * @param outsrcList 委外信息
     * @param startDate 委外日期
     * @return 校验结果:null时通过
     */
    private String checkAppl(List<OutsrcDto> outsrcList,Date startDate){
        StringBuffer sb = new StringBuffer("合同不在还款中，不能申请委外.合同号：");
        boolean flag = false;
        for(OutsrcDto dto : outsrcList){
            //不是还款中状态
            if(!LoanStatus.REPAYING.equals(dto.getWinfoStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return sb.toString().replaceFirst(",","");
        }

        //委外申请状态
        List<String> statusS = new ArrayList<String>();
        statusS.add(PlmsLaApplOutsrc.STATUS_AUDIT);         //状态:待审核
        statusS.add(PlmsLaApplOutsrc.STATUS_DRAFT);         //状态:待提交
        statusS.add(PlmsLaApplOutsrc.STATUS_SUBMITTED);     //状态:待审批(已提交)
        statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);      //状态:已审批

        List<Long> applIds = new ArrayList<Long>();
        for(OutsrcDto dto : outsrcList){
            applIds.add(dto.getApplId());
        }

        //根据状态集合和借款IDS查找
        List<PlmsLaApplOutsrc> checkList = outsrcService.selectByExample(new PlmsLaApplOutsrcExample().setCheck(true).setApplIds(applIds).setStatusS(statusS).setStartDate(startDate));
        if(checkList != null && checkList.size() > 0){
            sb = new StringBuffer("案件已在委外流程，或委外日期重叠.合同号：");
            for(PlmsLaApplOutsrc src : checkList){
                sb.append("," + src.getCntrctNo());
            }
            return sb.toString().replaceFirst(",","");
        }

        return null;
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
