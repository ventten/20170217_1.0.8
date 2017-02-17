package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
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
 * 委外申请控制器-延期
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcExtentedController {

    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 委外申请-延期
     * @param idsArr 选中的委外申请IDS
     * @param months 延期月数
     * @param request request
     */
    @RequestMapping("/extented")
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_EXTENTED)
    public JSONResult extented(Long[] idsArr,Integer months,HttpServletRequest request) {
        //选中的委外申请IDS
        if(idsArr == null || idsArr.length == 0){
            return new JSONResult(false,"请选择需延期的案件");
        }
        if(months == null){
            return new JSONResult(false,"请选择延期月数");
        }
        if(months < 1){
            return new JSONResult(false,"月数参数错误");
        }

        //选中的委外申请IDS
        List<Long> ids = new ArrayList<>();
        Collections.addAll(ids,idsArr);

        //根据委外申请IDS查找
        OutsrcExample example = new OutsrcExample().setIds(ids);
        List<OutsrcDto> outsrcList = outsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            //校验
            String checkResult = this.checkExtented(outsrcList);
            if(checkResult != null){
                return new JSONResult(false,checkResult);
            }

            //session
            SessionMsg session = SubjectUtil.getSession(request);
            //保存延期结果
            outsrcService.saveExtented(outsrcList,months,session);
        }else {
            return new JSONResult(false,"未找到委外申请");
        }

        return new JSONResult(true,"延期成功");
    }

    /**
     * 延期时校验数据
     * @param outsrcList 委外数据
     * @return 校验结果:null时通过
     */
    private String checkExtented(List<OutsrcDto> outsrcList){
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

        sb = new StringBuffer("只有[还款中]的合同才能执行此操作.合同号：");
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
