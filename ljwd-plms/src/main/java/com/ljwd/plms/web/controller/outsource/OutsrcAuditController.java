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
import org.apache.shiro.authz.annotation.Logical;
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
 * 委外申请控制器-审核
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcAuditController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 委外申请-审核
     * @param idsArr 选中的委外申请IDS
     * @param result 审核结果:1-审核通过,2-审核拒绝
     * @param request request
     */
    @RequestMapping("/audit")
    @ResponseBody
    @RequiresPermissions(value = {PermissionSign.OUT_SRC_AUDIT_PASS, PermissionSign.OUT_SRC_AUDIT_REJECT}, logical = Logical.OR)
    public JSONResult audit(Long[] idsArr,int result,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需审核的案件");
        }
        if(result != 1 && result != 2){
            return new JSONResult(false,"委外审核-未知的审核结果");
        }
        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids, idsArr);

        //根据委外申请IDS查找
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(new OutsrcExample().setIds(ids));
        if(outsrcList != null && outsrcList.size() > 0){

            StringBuffer sb = new StringBuffer("案件已结清，不能审核通过.合同号：");
            boolean flag = false;

            //如果是审核通过
            if(result == 1){
                for(OutsrcDto dto : outsrcList){
                    //如果案件已结清
                    if(LoanStatus.CLEAR.equals(dto.getWinfoStatus())){
                        sb.append("," + dto.getCntrctNo());
                        flag = true;
                    }
                }
                if(flag){
                    return new JSONResult(false,sb.toString().replaceFirst(",",""));
                }
            }

            sb = new StringBuffer("此些委外申请不是待审核状态.合同号：");
            for(OutsrcDto dto : outsrcList){
                //不是待审核状态
                if(!PlmsLaApplOutsrc.STATUS_AUDIT.equals(dto.getStatus())){
                    sb.append("," + dto.getCntrctNo());
                    flag = true;
                }
                //如果是审核通过,校验案件是否在委外流程(防止和跑批流转进委外区间的申请数据重复)
                if(result == 1){
                    boolean check = outsrcService.selectCheck(dto.getApplId(),dto.getStartDate(),dto.getId());
                    if(check){
                        return new JSONResult(false,"案件已在委外流程，或委外日期重叠.合同号：" + dto.getCntrctNo());
                    }
                }
            }
            if(flag){
                return new JSONResult(false,sb.toString().replaceFirst(",",""));
            }
        }else {
            return new JSONResult(false,"未找到委外申请");
        }

        SessionMsg session = SubjectUtil.getSession(request);

        //保存审核结果
        outsrcService.saveAudit(result,outsrcList,session);

        return new JSONResult(true,"审核成功");
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
