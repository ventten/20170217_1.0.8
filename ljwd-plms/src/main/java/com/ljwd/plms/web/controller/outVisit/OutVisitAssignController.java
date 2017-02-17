package com.ljwd.plms.web.controller.outVisit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.dao.outVisit.PlmsOvmOutVisitUserMapper;
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitInfoExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.SysProduct;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignParamDto;
import com.ljwd.plms.web.vo.outVisit.OutVisitAssignResult;
import com.ljwd.plms.web.vo.outVisit.PlmsOvmOutVisitDto;

@Component
@RequestMapping("outVisitAssign")
public class OutVisitAssignController {
	
	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	@Resource
	private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService; 


	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.OUTVISITASSIGN_SELECT)
	public String view(Model model){
		//客户类型
		Map<String, Object> custTypeMap = OutVisitCustType.getOutVisitCustType();
		//所属城市
		PlmsOvmOutVisitAreaExample example = new PlmsOvmOutVisitAreaExample();
		example.setIsActive("Y");
		List<PlmsOvmOutVisitArea> areaList = plmsOvmOutVisitAreaService.selectByExample(example);
		//商品类别
		List<SysProduct> productList = plmsWorkOrderPoolService.searchAllProducts();

		model.addAttribute("custTypeList", custTypeMap);
		model.addAttribute("areaList", areaList);
		model.addAttribute("productList", productList);

		return "/jsp/outVisit/outVisitAssign";
		
	}
	/**
	 * 
	* @Description: 外访分配分页
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageOutVisitAssignData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITASSIGN_SELECT)
	public String pageOutVisitAssignData(OutVisitAssignParamDto example){
		
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

	        Page<OutVisitAssignResult> pageData = new Page<OutVisitAssignResult>(pageNo, pageSize);
	        
	        //设置排序
	        example.setOrderByClause(dataTableParam,"assign");

	        pageData = plmsOvmOutVisitInfoService.selectAssignByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson_dataFormat(sEcho, pageData);

		
	}
	
	/**
	 * 
	* @Description: 自动分配
	* @param ids
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/outVisitAutoAssign")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITASSIGN_AUTOASSIGN)
	public JSONResult outVisitAutoAssign(OutVisitAssignParamDto example,HttpServletRequest request){
			SessionMsg loginUser = SubjectUtil.getSession(request);
			if(loginUser==null){
				return new JSONResult(false,"登录信息已过期，请重新登录");
			}
			plmsOvmOutVisitInfoService.outVisitAutoAssign(example,loginUser);
			return new JSONResult(true,"分配成功！");

		
		
	}
	
	/**
	 * 根据区域查找外访人员
	* @Description:  
	* @param areaId
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/searchOutVisitUserByAreaId")
	@ResponseBody
	public JSONResult searchOutVisitUserByAreaId(Long areaId){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("areaId", areaId);
		List<PlmsOvmOutVisitUser> outVisitUser = plmsOvmOutVisitUserService.searchInfoByMap(map);
		if(outVisitUser == null || outVisitUser.size() == 0){
			return new JSONResult(false,"此区域下没有外访员！");
		}
		String result = JSONUtil.toJSONString(outVisitUser);
		return new JSONResult(true,result);
	}
	/**
	 * 
	 * @Description: 查找外访区域
	 * @return JSONResult  
	 * @author zhengjizhao
	 * @date 2017年2月10日下午4:09:14
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/searchOutVisitAreaAll",method = RequestMethod.POST)
	@ResponseBody
	public JSONResult searchOutVisitAreaAll(){
			List<PlmsOvmOutVisitDto> outVisitArea = plmsOvmOutVisitUserService.searchOutVisitArea();
			return new JSONResult(outVisitArea);
	}
	
	/**
	 * 
	* @Description: 查找所有外访员 
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/searchOutVisitAllUser")
	@ResponseBody
	public JSONResult searchOutVisitAllUser(){
			Map<String,Object> map = new HashMap<String,Object>();
			List<PlmsOvmOutVisitUser> outVisitUser = plmsOvmOutVisitUserService.searchInfoByMap(map);
			String result = JSONUtil.toJSONString(outVisitUser);
			return new JSONResult(true,result);
	}
	/**
	 * 
	* @Description: 手工分配 
	* @param checkedUserId
	* @param checkedIds
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/outVisitMaruAssign")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVISITASSIGN_MARUASSIGN)
	public JSONResult outVisitMaruAssign(String checkedUserId,String checkedIds,HttpServletRequest request){
		if(checkedUserId ==null){
			return new JSONResult(false,"请选择外访人员");
		}
		if(checkedIds==null){
			return new JSONResult(false,"请选择要分配的案件！");
		}
		SessionMsg loginUser = SubjectUtil.getSession(request);
		if(loginUser==null){
			return new JSONResult(false,"登录信息已过期，请重新登录");
		}

		plmsOvmOutVisitInfoService.outVisitMaruAssign(checkedUserId,checkedIds,loginUser);
		return new JSONResult(true,"分配成功！");

		
	}
	
	/**
	 * 
	* @Description: 结案 
	* @param example
	* @return
	* @return JSONResult
	 */
	@RequestMapping("/OutVisitClosed")
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.OUTVISITASSIGN_CLOSED,PermissionSign.ALLOUTVISIT_CLOSED},logical=Logical.OR)
	public JSONResult OutVisitClosed(PlmsOvmOutVisitInfoExample example,HttpServletRequest request){
		SessionMsg loginUser = SubjectUtil.getSession(request);
		if(loginUser==null){
			return new JSONResult(false,"登录信息已过期，请重新登录");
		}
		Long [] ids = example.getIds();
		if(example.getClosedDate()==null){
			return new JSONResult(false,"请填写结案日期");
		}
		if(example.getClosedType()==null){
			return new JSONResult(false,"请选择结案类别");

		}
		if(ids.length==0){
			return new JSONResult(false,"请选择要结案的案件");

		}else{
			plmsOvmOutVisitInfoService.OutVisitClosed(example,loginUser);
		}
		return new JSONResult(true,"结案成功！");
		
		
	}
}
