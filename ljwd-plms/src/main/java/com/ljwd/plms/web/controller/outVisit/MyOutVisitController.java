package com.ljwd.plms.web.controller.outVisit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfo;
import com.ljwd.plms.web.model.cust.PlmsClAddressInfoExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitPlan;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;
import com.ljwd.plms.web.service.job.impl.PlmsDoOverdueDataServiceImpl;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.MyOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitPlanStatusType;

@Controller
@RequestMapping("myOutVisit")
public class MyOutVisitController {
	
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;
	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private PlmsClAddressInfoService addressInfoService;

	private static Logger logger = LoggerFactory.getLogger(MyOutVisitController.class);

	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.MYOUTVISIT_SELECT)
	public String view(Model model){
		//客户类型
		Map<String, Object> custTypeMap = OutVisitCustType.getOutVisitCustType();
		model.addAttribute("custTypeList", custTypeMap);
		return "/jsp/outVisit/myOutVisit";
	}
	
	
	/**
	 * 
	* @Description: 我的外访分页
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageMyOutVisitData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_SELECT)
	public String pageMyOutVisitData(OutVisitAssignParamDto example){
		
		  if(example.getParamData() == null || "".equals(example.getParamData())){
	            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
	        }
		   String loginUser = SubjectUtil.getUserId();
		   if(loginUser==null){
			   	return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
		   }else{
			   example.setLoginUser(loginUser);
		   }
	        //分页条件
	        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
	        //记录操作的次数
	        int sEcho = dataTableParam.getsEcho();
	        //每页记录数
	        int pageSize = dataTableParam.getiDisplayLength();
	        //页数
	        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

	        Page<MyOutVisitResult> pageData = new Page<MyOutVisitResult>(pageNo, pageSize);       
	        //设置排序
	        example.setOrderByClause(dataTableParam,"myOutVisit");

	        pageData = plmsOvmOutVisitInfoService.selectMyOutVisitByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson_dataFormat(sEcho, pageData);

		
	}

	/**
	 * 
	* @Description: 生成新增外访计划的编号 
	* @return
	* @return JSONResult
	 */
	@RequestMapping(value= "/searchMyOutVisitPlanCode",method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_SELECTOUTVISITPLAN)
	public Map<String,Object> searchMyOutVisitPlanCode(Long infoId){
		Map<String,Object> result = new HashMap<String,Object>();
		if(infoId!=null){
			PlmsOvmOutVisitInfo outVisitInfo = plmsOvmOutVisitInfoService.selectById(infoId);
			if(outVisitInfo!=null){
				String visitor = outVisitInfo.getVisitBy();
				String areaCode = plmsOvmOutVisitAreaService.searchAreaCodeByUserId(visitor);
				//外访计划编号
				String planCode = "";
				SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
				String str = sdf.format(new Date());
				String planCodeTemp = areaCode+"_"+str;
				Map<String,Object> plancodeMap = new HashMap<String,Object>();
				plancodeMap.put("planCode", planCodeTemp);
				List<PlmsOvmOutVisitPlan> planList = plmsOvmOutVisitPlanService.searchByMap(plancodeMap);
				if(planList.size()>0){
					String[] planCodeT = planList.get(0).getPlanCode().split("_");
					int  num = Integer.parseInt(planCodeT[1].substring(8,planCodeT[1].length()))+1;
					if(num<10){
						planCode = planCodeTemp+"0"+num;
					}else{
						planCode = planCodeTemp+num;
					}
				}else{
					planCode = planCodeTemp+"01";
				}
				//陪同人
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("userId", visitor);
				List<PlmsOvmOutVisitUser> outVisitUserList = plmsOvmOutVisitUserService.searchInfoByMap(map);
				result.put("planCode", planCode);
				result.put("outVisitUserList", outVisitUserList);				
			}else{
				logger.info("找不到对应的外访案件");
			}
			
		}else{
			
			logger.info("找不到对应的外访案件");
		}
		
		return result;

	}
	
	
	/**
     * 客户地址信息数据
     * */
    @RequestMapping(value = "/pageCollectionAddressData",method = RequestMethod.POST)
    @ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_SELECTOUTVISITPLAN)
    public String pageCollectionAddressData(PlmsClAddressInfoExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustIdByApplId() == null){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }

        example.setRltnshp("12");
        example.setIsActive("Y");
        //分页条件
        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
        //记录操作的次数
        int sEcho = dataTableParam.getsEcho();
        //每页记录数
        int pageSize = dataTableParam.getiDisplayLength();
        //页数
        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

        example.setOrderByClause("T.ID DESC");

        Page<PlmsClAddressInfo> pageData = new Page<PlmsClAddressInfo>(pageNo, pageSize);

        pageData = addressInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson_dataFormat(sEcho, pageData);
    }

/**
 * 
* @Description: 新增外访计划 
* @param planDto
* @return
* @return JSONResult
 */
    @RequestMapping(value= "/add_MyOutVisitPlan",method=RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions(PermissionSign.MYOUTVISIT_SELECTOUTVISITPLAN)
	public JSONResult add_MyOutVisitPlan(OutVisitPlanDto planDto,HttpServletRequest request){
    	SessionMsg loginUser = SubjectUtil.getSession(request);
		if(loginUser==null){
			return new JSONResult(false,"请重新登录！");
		}
    	String addr = planDto.getAddr();
    	if(addr==null){
			return new JSONResult(false,"请选择要外访的地址！");
    	}
    	if(planDto.getPlanStartTime()==null){
			return new JSONResult(false,"请输入计划外访日期！"); 
    	}
    	String[] addrs = addr.split(",");
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("infoId", planDto.getInfoId());
    	map.put("address", addrs[1]);
    	map.put("addrType", addrs[0]);
    	map.put("planStatus",OutVisitPlanStatusType.Start );
		List<PlmsOvmOutVisitPlan> planList = plmsOvmOutVisitPlanService.searchByMap(map);
		if(planList.size()>0){
			return new JSONResult(false,"此案件的此地址已有外访计划，不能重复提交"); 
		}
		int i = plmsOvmOutVisitPlanService.addOutVisitPlan(planDto, loginUser);
    	if(i>0){
			return new JSONResult(true,"添加成功！");
    	}else{
			return new JSONResult(false,"添加失败！");
    	}
		
		
	}

}
