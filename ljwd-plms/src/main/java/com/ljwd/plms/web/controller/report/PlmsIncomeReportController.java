package com.ljwd.plms.web.controller.report;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.filefilter.MagicNumberFileFilter;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.controller.case_management.PlmsWorkOrderPoolCaseController;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSetExample;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.model.report.PlmsLaCollectorIncomeExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsEmpCollectSetService;
import com.ljwd.plms.web.service.job.inf.PlmsDayIncomeService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import com.ljwd.plms.web.service.report.inf.PlmsIncomeReportService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseResultDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolExportDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorIncomeResult;
import com.ljwd.plms.web.vo.report.PlmsLaCollectorPersonIncomeExportResult;
import com.ljwd.plms.web.vo.report.PlmsLaOutVisitPersonIncomeResult;
import com.ljwd.plms.web.vo.sys_management.PlmsEmpCollectorParam;



@Controller
@RequestMapping("incomeReport")
public class PlmsIncomeReportController {
	
	@Resource
	private PlmsEmpCollectSetService plmsEmpCollectSetService;
	@Resource
	private PlmsIncomeReportService plmsIncomeReportService;
	@Resource
	private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;
	@Resource
	private PlmsDayIncomeService plmsDayIncomeService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	/**
	 * 
	* @Description: 催收实收表
	* @param model
	* @param type
	* @param request
	* @return
	* @return String
	 */
	@RequestMapping(value="/view", method=RequestMethod.GET)
	@RequiresPermissions(value={PermissionSign.INCOMEREPORT_SELECT,PermissionSign.COLLECTORPERSONINCOMEREPORT_SELECT,PermissionSign.OUTVISITPERSONINCOMEREPORT_SELECT},logical=Logical.OR)
	public String searchIncomeView(Model model,String type,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
		if(msg==null){
        	return "登录信息已过期，请重新登录";
        }
		String userName = msg.getUserName(); 
		if(type==null){
			return null;
		}else{
			if(type.equals("all")){
				//催收员列表
				PlmsEmpCollectorParam example = new PlmsEmpCollectorParam();
				List<PlmsEmpCollectSet> collectorList = plmsEmpCollectSetService.selectCollector(example);
				model.addAttribute("collectorList", collectorList);
				//外访人员列表
				Map<String,Object> map = new HashMap<String,Object>();
				List<PlmsOvmOutVisitUser> outVisitUserList = plmsOvmOutVisitUserService.searchInfoByMap(map);
				model.addAttribute("outVisitUserList", outVisitUserList);
				return "/jsp/report/incomeReport";
			}else if(type.equals("collector")){
				PlmsEmpCollectorParam example = new PlmsEmpCollectorParam();
				example.setUserName(userName);
				List<PlmsEmpCollectSet> collectorList = plmsEmpCollectSetService.selectCollector(example);
				model.addAttribute("collectorList", collectorList);
				return "/jsp/report/collectorPersonIncomeReport";
			}else if(type.equals("outVisit")){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("userName", userName);
				List<PlmsOvmOutVisitUser> outVisitUserList = plmsOvmOutVisitUserService.searchInfoByMap(map);
				model.addAttribute("outVisitUserList", outVisitUserList);
				return "/jsp/report/outVisitPersonIncomeReport";
			}else{
				return null;
			}
		}
	}

	/**
	 * 
	* @Description: 催收实收明细分页
	* @param example
	* @return
	* @return String
	 */
	@RequestMapping("/pageAllIncomeData")
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.INCOMEREPORT_SELECT,PermissionSign.COLLECTORPERSONINCOMEREPORT_SELECT,PermissionSign.OUTVISITPERSONINCOMEREPORT_SELECT},logical=Logical.OR)
	public String pageAllIncomeData(PlmsLaCollectorIncomeExample example){
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

        Page<PlmsLaCollectorIncomeResult> pageData = new Page<PlmsLaCollectorIncomeResult>(pageNo, pageSize);

        //设置排序
        example.setOrderByClause(dataTableParam);

        pageData = plmsIncomeReportService.pageAllIncomeData(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
		
		
	}
	/**
	 * 
	* @Description: 导出excle
	* @param example
	* @param request
	* @param response
	* @return void
	 */
	@RequestMapping("/exportExcel")	
	@RequiresPermissions(value={PermissionSign.INCOMEREPORT_EXPORT,PermissionSign.COLLECTORPERSONINCOMEREPORT_EXPORT,PermissionSign.OUTVISITPERSONINCOMEREPORT_EXPORT},logical=Logical.OR)
	public void exportExcel(PlmsLaCollectorIncomeExample example,HttpServletRequest request, HttpServletResponse response){
				//系统分隔符
				String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
				String docsPath = request.getSession().getServletContext().getRealPath("docs");
				if(FileUtil.createFile(docsPath)){
					if(example.getType().equals("all")){
						List<PlmsLaCollectorIncomeExportResult> expotList = plmsIncomeReportService.selectByExampleForExport(example);
						plmsIncomeReportService.exportToExcelAll("", docsPath, expotList);
						String fileName = "incomeReport.xls";
						String filePath = docsPath + FILE_SEPARATOR + fileName;
						FileUtil.downloadFile("催收实收明细表.xls",filePath,request,response);
					}else if(example.getType().equals("collector")){
						List<PlmsLaCollectorPersonIncomeExportResult> expotList = plmsIncomeReportService.selectByExampleForPersonExport(example);
						plmsIncomeReportService.exportToExcelPerson("", docsPath, expotList);
						String fileName = "incomeReportPerson.xls";
						String filePath = docsPath + FILE_SEPARATOR + fileName;		
						FileUtil.downloadFile("催收个人实收明细表.xls",filePath,request,response);
					}else if(example.getType().equals("outVisit")){
						List<PlmsLaOutVisitPersonIncomeResult> expotList = plmsIncomeReportService.selectByExampleForPersonOutVisitExport(example);
						plmsIncomeReportService.exportToExcelOutvisitPerson("", docsPath, expotList);
						String fileName = "incomeReportOutvisitPerson.xls";
						String filePath = docsPath + FILE_SEPARATOR + fileName;				
						FileUtil.downloadFile("外访个人实收明细表.xls",filePath,request,response);
					}
				}else{
					logger.info("------创建目录失败-----");
				}
	}	
		
	@RequestMapping("/createData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.INCOMEREPORT_CREATEDATA)
	public JSONResult createData(PlmsLaCollectorIncomeExample example,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
		if(msg!=null){
			if(example.getCreateDataDate()!=null){
				String userIdString = msg.getName();
				plmsDayIncomeService.updatePlmsLaIncome_today(example,userIdString);
				return new JSONResult(true,"生成数据成功！");
			}else{
				return new JSONResult(false,"生成数据失败,请选择要生成数据的日期!");
			}
			
		}else{
			return new JSONResult(false,"生成数据失败！");
		}
		
	}
	
	@RequestMapping("/createOutVisitData")
	@ResponseBody
	@RequiresPermissions(PermissionSign.OUTVIISTINCOMEREPORT_CREATEDATA)
	public JSONResult createOutVisitData(PlmsLaCollectorIncomeExample example,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
		if(msg!=null){
			if(example.getCreateDataDate()!=null){
				String userIdString = msg.getName();
				plmsDayIncomeService.updatePlmsLaIncomeOutVisitUser_today(example, userIdString);
				return new JSONResult(true,"生成数据成功！");
			}else{
				return new JSONResult(false,"生成数据失败,请选择要生成数据的日期!");
			}
			
		}else{
			return new JSONResult(false,"生成数据失败！");
		}
		
	}
}