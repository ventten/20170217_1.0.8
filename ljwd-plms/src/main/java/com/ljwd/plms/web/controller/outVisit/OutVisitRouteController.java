package com.ljwd.plms.web.controller.outVisit;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.model.PlmsAppMapPoint;
import com.ljwd.plms.mapp.service.map.inf.MapPointService;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUserExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitPlanService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitPlanResult;
import com.ljwd.plms.web.vo.outVisit.OutVisitMapDisplayParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitRouteResult;
import com.ljwd.plms.web.vo.outVisit.PlmsAppMapPointResult;

@RequestMapping("outVisitRoute")
@Controller
public class OutVisitRouteController {

	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	@Resource
	private PlmsOvmOutVisitPlanService plmsOvmOutVisitPlanService;
	@Resource
	private MapPointService mapPointService;
    private Logger logger = LoggerFactory.getLogger(getClass());

	
	
	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(value={PermissionSign.OUTVISITROUTE_SELECT,PermissionSign.OUTVISITROUTE_SELECTALL},logical=Logical.OR)
	public String view(Model model,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
        if(msg==null){
        	return "登录信息已过期，请重新登录";
        }
		//所属城市
		PlmsOvmOutVisitAreaExample example = new PlmsOvmOutVisitAreaExample();
		example.setIsActive("Y");
		List<PlmsOvmOutVisitArea> areaList = plmsOvmOutVisitAreaService.selectByExample(example);
		
		if(SubjectUtil.isPermitted(PermissionSign.OUTVISITROUTE_SELECT)&&(!SubjectUtil.isPermitted(PermissionSign.OUTVISITROUTE_SELECTALL))){
			model.addAttribute("userName", msg.getUserName());
		}
		
		model.addAttribute("areaList", areaList);
		return "/jsp/outVisit/outVisitRoute";
		
	}
	
	
	@RequestMapping("/pageOutVisitRouteData")
	@ResponseBody
	public String pageOutVisitRouteData(OutVisitRouteParamDto example){
		if(example.getParamData() == null || "".equals(example.getParamData())){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }		   
        //分页条件
        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
        //记录操作的次数
        int sEcho = dataTableParam.getsEcho();
        //每页记录数
        int pageSize = dataTableParam.getiDisplayLength();
        //页数
        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

        Page<OutVisitRouteResult> pageData = new Page<OutVisitRouteResult>(pageNo, pageSize);
        
        //设置排序
        example.setOrderByClause(dataTableParam);

        pageData = plmsOvmOutVisitPlanService.selectPageOutVisitRouteData(pageData, example);

        return PageUtil.getPageJson_dataFormat(sEcho, pageData);
		
	}
	
	/**
	 * 
	* @Description: 外访路线
	* @param example
	* @param model
	* @return
	* @return String
	 */
	@RequestMapping(value="/outVisitMapDisplay",method=RequestMethod.GET)
	public String outVisitMapDisplay(OutVisitRouteParamDto example, Model model){
		//List<PlmsAppMapPoint> routeList = mapPointService.selectByOutVisitRouteParamDto(example);
		model.addAttribute("outVisitDateStr", example.getOutVisitDateStr());
		model.addAttribute("outVisiter", example.getOutVisiter());
	//	model.addAttribute("routeList", routeList);
		return "/jsp/outVisit/outVisitMapDisplay";
		
	}
	
	/**
	 * 
	* @Description: 轨迹数据 
	* @return
	* @return String
	 */
	@RequestMapping("/outVisitMapData")
	@ResponseBody
	public Result outVisitMapData(OutVisitMapDisplayParamDto example){
	 		JSONResult result = new JSONResult();
	        Map<Integer,List<PlmsAppMapPointResult>> plmsAppMapPoints = null;
			if(example==null){
				return result.setMessage("查询条件错误"); 
			}else{
				 try {
			            if (example.getOutVisiter()==null||StringUtils.isEmpty(example.getOutVisiter())) {
			            	return result.setMessage("查询条件错误"); 
			            }
			            if(example.getOutVisitDate()==null||"".equals(example.getOutVisitDate())){
			            	return result.setMessage("查询条件错误"); 
			            }
			            plmsAppMapPoints = mapPointService.selectByOutVisitRouteParamDto(example);
			            result.setData(plmsAppMapPoints).setSuccess(true);
			        } catch (Exception e) {
			            logger.error("用户坐标信息上传异常", e);
			            result.setData(plmsAppMapPoints).setMessage("查询失败");
			        }		
			}
	       
	        return result;
	    }
		   
}
