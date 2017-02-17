package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
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
 * 委外申请控制器-结案
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcEndedController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 委外申请-结案
     * @param idsArr 选中的委外申请IDS
     * @param request request
     */
    @RequestMapping("/ended")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_ENDED)
    public JSONResult ended(Long[] idsArr,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需结案的案件");
        }

        Date endDate = new Date();

        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids,idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids);
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkEnded(outsrcList,endDate);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }

            //session
            SessionMsg session = SubjectUtil.getSession(request);
            //保存结案结果
            outsrcService.saveEnded(outsrcList,endDate,session.getName(),session.getUserName(),false);
        }else {
            return new JSONResult(false,"未找到委外申请");
        }

        return new JSONResult(true,"结案成功");
    }

    /**
     * 结案时校验数据
     * @param outsrcList 委外数据
     * @param endDate 结案日期
     * @return 校验结果:null时通过
     */
    private String checkEnded(List<OutsrcDto> outsrcList,Date endDate){
        StringBuffer sb = new StringBuffer("只有[已审批]状态才能执行此操作.合同号：");
        boolean flag = false;
        for(OutsrcDto dto : outsrcList){
            //不是已审批状态
            if(!PlmsLaApplOutsrc.STATUS_APPROVED.equals(dto.getStatus())){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
            return sb.toString().replaceFirst(",","");
        }

        sb = new StringBuffer("结案日期不能小于委外日期.合同号：");
        for(OutsrcDto dto : outsrcList){
            //结案日期和委外日期比较
            if(D.trunc(endDate).before(D.trunc(dto.getStartDate()))){
                sb.append("," + dto.getCntrctNo());
                flag = true;
            }
        }
        if(flag){
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
