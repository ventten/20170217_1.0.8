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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhengzw
 * 委外申请控制器-撤销结案
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcUnDoEndedController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 撤销结案
     * @param idsArr 选中的委外申请IDS
     * @param request request
     */
    @RequestMapping("/unDoEnded")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_UNDO_ENDED)
    public JSONResult unDoEnded(Long[] idsArr,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需撤销的案件");
        }

        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids, idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids);
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkUnDoEnded(outsrcList);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }

            SessionMsg session = SubjectUtil.getSession(request);
            //撤销结案
            outsrcService.saveUnDoEnded(outsrcList,session);
        }else {
            return new JSONResult(false,"未找到案件信息");
        }
        return new JSONResult(true,"撤销成功");
    }

    /**
     * 撤销结案时校验
     * @param outsrcList 委外信息
     * @return 校验结果:null时通过
     */
    private String checkUnDoEnded(List<OutsrcDto> outsrcList){
        StringBuffer sb = new StringBuffer("只有状态是[已结案]才可以做操作.合同号：");
        boolean flag = false;
        //借款ID集合
        List<Long> applIds = new ArrayList<Long>();
        for(OutsrcDto dto : outsrcList){
            if(applIds.contains(dto.getApplId())){
                return "不能选择相同的合同：" + dto.getCntrctNo();
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
            return sb.toString().replaceFirst(",","");
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
            return sb.toString().replaceFirst(",","");
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
            return sb.toString().replaceFirst(",","");
        }

        //委外申请状态
        List<String> statusS = new ArrayList<String>();
        statusS.add(PlmsLaApplOutsrc.STATUS_AUDIT);         //状态:待审核
        statusS.add(PlmsLaApplOutsrc.STATUS_DRAFT);         //状态:待提交
        statusS.add(PlmsLaApplOutsrc.STATUS_SUBMITTED);     //状态:待审批(已提交)
        statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);      //状态:已审批
        statusS.add(PlmsLaApplOutsrc.STATUS_ENDED);         //状态:已结案
        for(OutsrcDto dto : outsrcList){
            int count = outsrcService.countByExample(new PlmsLaApplOutsrcExample().setApplId(dto.getApplId()).setMinId(dto.getId()).setStatusS(statusS));
            if(count > 0){
                return "案件已在委外流程或存在更后结案的记录" + dto.getCntrctNo();
            }
        }

        return null;
    }

//    /**
//     * 字符串转日期类型参数
//     * */
//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }

}
