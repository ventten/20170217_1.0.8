package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.vo.SessionMsg;
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
 * 委外申请控制器-修改委外信息
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcModifyController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;
    @Resource
    private PlmsOutsrcComService outsrcComService;

    /**
     * 待审批状态时修改委外信息
     * @param idsArr 选中的委外申请IDS
     * @param comId 外包公司ID
     * @param months 委外期限
     * @param request request
     */
    @RequestMapping("/modify")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_MODIFY)
    public JSONResult modify(Long[] idsArr,Long comId,int months,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需修改外包公司的案件");
        }
        if(comId == null){
            return new JSONResult(false,"请选择外包公司");
        }
        if(months < 2){
            return new JSONResult(false,"委外期限参数错误");
        }
        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids,idsArr);

        //根据委外申请IDS查找
        List<PlmsLaApplOutsrc> outsrcList = outsrcService.selectByExample(new PlmsLaApplOutsrcExample().setIds(ids));
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkModify(outsrcList,comId);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }
            //session
            SessionMsg session = SubjectUtil.getSession(request);
            //修改委外信息
            outsrcService.saveModify(outsrcList,comId,months,session);
        }else {
            return new JSONResult(false,"未找到委外申请");
        }
        return new JSONResult(true,"修改外包公司成功");
    }

    /**
     * 修改委外信息时校验数据
     * @param outsrcList 委外数据
     * @param comId 外包公司ID
     * @return 校验结果:null时通过
     */
    private String checkModify(List<PlmsLaApplOutsrc> outsrcList,Long comId){
        StringBuffer sb = new StringBuffer("只有[待审批]状态才能执行此操作.合同号：");
        boolean flag = false;
        for(PlmsLaApplOutsrc dto : outsrcList){
            if(dto.getIsBack() != null && dto.getIsBack() - 1 == 0){
                return "退回的记录不能修改外包公司：" + dto.getCntrctNo();
            }
            //不是待审批状态
            if(!PlmsLaApplOutsrc.STATUS_SUBMITTED.equals(dto.getStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return sb.toString().replaceFirst(",","");
        }

        //根据ID查找外包公司
        PlmsOutsrcCom com = outsrcComService.selectById(comId);
        if(com == null){
            return "未找到此外包公司";
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
