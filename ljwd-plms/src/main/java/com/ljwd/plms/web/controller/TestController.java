package com.ljwd.plms.web.controller;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.web.security.RoleSign;
import com.ljwd.plms.web.service.job.inf.CollectionRecordJobService;
import com.ljwd.plms.web.service.job.inf.OutsrcJobService;
import com.ljwd.plms.web.service.job.inf.MfbmsOverDueJobService;
import com.ljwd.plms.web.service.job.inf.PlmsDayIncomeService;
import com.ljwd.plms.web.service.job.inf.PlmsDoOverdueDataService;
import com.ljwd.plms.web.service.job.inf.PlmsOutVisitOverduedService;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhengzw on 2016/7/18
 * 跑批测试控制器
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private MfbmsOverDueJobService mfbmsOverDueJobService;
    @Resource
	private PlmsDoOverdueDataService plmsDoOverdueDataService;
    @Resource
	private CollectionRecordJobService collectionRecordJobService;
    @Resource
	private OutsrcJobService outsrcJobService;
    @Resource
    private PlmsOutVisitOverduedService plmsOutVisitOverduedService;
    @Resource
    private PlmsDayIncomeService plmsDayIncomeService;

    @RequestMapping("toTest")
    @RequiresRoles(value = RoleSign.ADMIN)
    public String toTest(){
        return "jsp/test/toTest";
    }

    /**
     * 同步贷款状态
     * */
    @RequestMapping("applyStatus")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public JSONResult applyStatus(){
        String ret = mfbmsOverDueJobService.doMfbmsApplyStatus();
        return new JSONResult(true,ret);
    }

    /**
     * 导入逾期客户
     * */
    @RequestMapping("overDueCust")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public JSONResult overDueCust(){
        String ret = mfbmsOverDueJobService.doMfbmsOverDueCust();
        return new JSONResult(true,ret);
    }

    /**
     * 破坏承诺
     * */
    @RequestMapping("breakPromise")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public JSONResult breakPromise(){
        String ret = collectionRecordJobService.doBreakPromise();
        return new JSONResult(true,ret);
    }

    /**
     * 自动结案
     * */
    @RequestMapping("endedOutsrc")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public JSONResult endedOutsrc(){
        String ret = outsrcJobService.doEndedOutsrc();
        return new JSONResult(true,ret);
    }

    /**
     * 再次推送同步失败的委外信息
     * */
    @RequestMapping("sendOutsrc")
    @ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
    public JSONResult sendOutsrc(){
        String ret = outsrcJobService.doSendOutsrcToMfbms();
        return new JSONResult(true,ret);
    }

    /**
     * 自动流程
     * */
    @RequestMapping("autoCircu")
	@ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
	public JSONResult autoCircu(){
    	plmsDoOverdueDataService.doUpdateAutoCircu();
		return new JSONResult(true,"数据流转完成");
	}

    /**
     * 自动分配
     * */
    @RequestMapping("autoAlloc")
	@ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
	public JSONResult autoAlloc(){
		plmsDoOverdueDataService.updateAutoAlloc();
		return new JSONResult(true,"数据分配完成");
	}
    
    /**
     * 
    * @Description: 外访跑批 
    * @return
    * @return JSONResult
     */
    @RequestMapping("outVisit")
   	@ResponseBody
    @RequiresRoles(value = RoleSign.ADMIN)
   	public JSONResult outVisit(){
    	plmsOutVisitOverduedService.updateOutVisitStatus();
   		return new JSONResult(true,"外访已委外，已过期跑批完成");
   	}
    
    
    @RequestMapping("income")
    @ResponseBody
    public JSONResult income(){
    	plmsDayIncomeService.updatePlmsLaIncome_yesterday();
    	return new JSONResult(true,"昨日实收统计完成");
    	
    }
}
