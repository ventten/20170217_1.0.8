package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.SessionMsg;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw
 * 委外申请控制器-退回
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcBackController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 案件退回
     * @param idsArr 选中的委外申请IDS
     * @param startDate 委外日期
     * @param request request
     */
    @RequestMapping("/back")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_BACK)
    public JSONResult back(Long[] idsArr,Date startDate,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需退回的案件");
        }
        if(startDate == null){
            return new JSONResult(false,"请选择委外日期");
        }

        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids, idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids).setMaxEnded(true);
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            JSONResult checkResult = this.checkBack(outsrcList,startDate);
            if(!checkResult.isSuccess()){
                return checkResult;
            }

            SessionMsg session = SubjectUtil.getSession(request);
            //退回
            outsrcList = (List<OutsrcDto>)checkResult.getData();
            outsrcService.saveBack(startDate,outsrcList,session);
        }else {
            return new JSONResult(false,"未找到案件信息");
        }
        return new JSONResult(true,"退回成功");
    }

    /**
     * 案件退回时校验
     * @param outsrcList 委外信息
     * @param startDate 委外日期
     * @return JSONResult 校验结果
     */
    private JSONResult checkBack(List<OutsrcDto> outsrcList,Date startDate){
        StringBuffer sb = new StringBuffer("只有状态是[已结案]才可以做操作.合同号：");
        boolean flag = false;
        //借款ID集合
        List<Long> applIds = new ArrayList<Long>();
        for(OutsrcDto dto : outsrcList){
            if(dto.getId() - dto.getMaxEndedId() != 0){
                return new JSONResult(false,"请选择案件最新的结案记录进行操作.合同号：" + dto.getCntrctNo());
            }
            if(applIds.contains(dto.getApplId())){
                return new JSONResult(false,"不能选择相同的合同：" + dto.getCntrctNo());
            }else {
                applIds.add(dto.getApplId());
            }
            //不是已结案状态
            if(!PlmsLaApplOutsrc.STATUS_ENDED.equals(dto.getStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return new JSONResult(false,sb.toString().replaceFirst(",",""));
        }

        sb = new StringBuffer("只有[还款中]的案件才可以操作.合同号：");
        for(OutsrcDto dto : outsrcList){
            //不是还款中
            if(!LoanStatus.REPAYING.equals(dto.getWinfoStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return new JSONResult(false,sb.toString().replaceFirst(",",""));
        }

        sb = new StringBuffer("只有在[委外区间]的案件才可以操作.合同号：");
        for(OutsrcDto dto : outsrcList){
            //不在委外区间
            if(dto.getCircuRuleCode() == null || !"OUTSOURC".equals(dto.getCircuRuleCode())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return new JSONResult(false,sb.toString().replaceFirst(",",""));
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
            sb = new StringBuffer("案件已在委外流程，或委外日期重叠.合同号：");
            for(PlmsLaApplOutsrc src : checkList){
                sb.append("," + src.getCntrctNo());
            }
            return new JSONResult(false,sb.toString().replaceFirst(",",""));
        }

        //返回的list
        List<OutsrcDto> returnList = new ArrayList<OutsrcDto>();
        for(OutsrcDto dto : outsrcList){
            //同借款、同批次、已结案且ID小于最新的记录
            OutsrcExample example = new OutsrcExample().setIdMax(dto.getId()).setLotNo(dto.getLotNo()).setApplId(dto.getApplId()).setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
            example.setOrderByClause("outSrc.ID DESC");
            List<OutsrcDto> thisOutsrcList = outsrcService.selectOutsrcByExample(example);
            if(thisOutsrcList == null || thisOutsrcList.isEmpty()){
                return new JSONResult(false,"没有旧的结案记录,不能退回：" + dto.getCntrctNo());
            }else {
                OutsrcDto thisLastOutsrc = thisOutsrcList.get(0);
                if(thisLastOutsrc.getComId() - dto.getComId() == 0){
                    return new JSONResult(false,"不能退回给同一个外包公司：" + dto.getCntrctNo());
                }
                thisLastOutsrc.setLastComId(dto.getComId());        //将最新记录的外包公司ID做为下一条记录的上家委外公司ID
                returnList.add(thisLastOutsrc);
            }
        }

        return new JSONResult(returnList,"校验通过",true);
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
