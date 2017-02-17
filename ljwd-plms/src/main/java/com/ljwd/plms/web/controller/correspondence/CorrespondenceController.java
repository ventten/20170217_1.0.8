package com.ljwd.plms.web.controller.correspondence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogDto;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogSearchParamDto;
import com.ljwd.plms.web.model.correspondence.PlmsLnCorresLog;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateParamDto;
import com.ljwd.plms.web.model.correspondence.PlmsRebackTypeEntry;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.correspondence.inf.CorrespondenceService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.correspondence.PlmsAddrTypeSelectData;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresExportDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresLogDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresRebackInfo;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresondenceCategory;
/**
 * 信函管理 控制器
 * @author zhengjizhao
 *   20161009 15：29
 */
@Controller
@RequestMapping(value="/correspondence")
public class CorrespondenceController {
	@Resource
    private CorrespondenceService correspondenceService;
	/**
	 * 显示信函管理首页
	 * @return
	 */
	@RequestMapping(value = "/showCorresponIndexJsp",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_SELECT)
	public String showCorresponIndexJsp(Model model){
		List<PlmsAddrTypeSelectData> addList = correspondenceService.findAddrTypeSelect();
		List<PlmsCorresondenceCategory> categoryList = correspondenceService.selectCategory();
		model.addAttribute("categoryList",categoryList);
		model.addAttribute("addList", addList);
		return "/jsp/correspondence/corresponIndex";
	}
	/**
	 * 查询 信函 的分页数据
	 * @return
	 */
	@RequestMapping(value = "/selectCorrespondencePage",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_SELECT)
    @ResponseBody
	public String selectCorrespondencePage(PlmsOverdueClientLetterGenerateParamDto example){
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
        //设置排序
        example.setOrderByClause(dataTableParam);
        Page<PlmsOverdueClientLetterGenerateDto> pageData = new Page<PlmsOverdueClientLetterGenerateDto>(pageNo, pageSize); 
        pageData = correspondenceService.selectByCorrespondenceAndPage(pageData, example);
        
        return PageUtil.getPageJson(sEcho, pageData);
	}
	/**
	 * 显示信涵生成记录（全部信函列表查询的页面）
	 * @return
	 */
	@RequestMapping(value = "/showCorresponListJsp",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_ALL_SELECT)
   // @ResponseBody
	public String showCorresponListJsp(Model model){
		List<PlmsCorresondenceCategory> categoryList = correspondenceService.selectCategory();
		model.addAttribute("categoryList",categoryList);
		return "/jsp/correspondence/correspondenceDetail";
	}
	/**
	 * 查询出信涵生成记录（全部信函的数据查询）
	 * @param example
	 * @return
	 */
	@RequestMapping(value = "/selectCorrespondencePagelist",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_ALL_SELECT)
    @ResponseBody
	public String selectCorrespondencePagelist(PlmsDocumentGenLogSearchParamDto example){
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
        //设置排序
        example.setOrderByClause(dataTableParam);
        Page<PlmsDocumentGenLogDto> pageData = new Page<PlmsDocumentGenLogDto>(pageNo, pageSize); 
        pageData = correspondenceService.selectLetterGenerateLogAndPage(pageData, example);
        
        return PageUtil.getPageJson(sEcho, pageData);
	}
	/**
	 * 查询出信涵生成记录（全部信函的数据查询）<<<<催记页面的信函记录查询
	 * @param example
	 * @return
	 */
	@RequestMapping(value = "/selectCorrespondencePagelistCui",method = RequestMethod.POST)
	@RequiresPermissions(value = {PermissionSign.CASE_MY_DETAIL, PermissionSign.CASE_ALL_DETAIL}, logical = Logical.OR)
    @ResponseBody
	public String selectCorrespondencePagelistCui(PlmsDocumentGenLogSearchParamDto example){
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
        Page<PlmsCorresLogDto> pageData = new Page<PlmsCorresLogDto>(pageNo, pageSize); 
        pageData = correspondenceService.selectCorresLogAndPage(pageData, example);
        
        return PageUtil.getPageJson(sEcho, pageData);
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
    /**
     * 修改信函发送状态
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/changeStatus",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_ALL_UPDATE)
    @ResponseBody
    public JSONResult changeStatus(String ids){
    	if(ids == null || "".equals(ids)){
    		return new JSONResult(false,"参数错误！");
    	}
    	//把字符串参数转换为list数组格式
    	List<Long> idss = new ArrayList<Long>();
    	try{
    		String[] strId = ids.split(",");
    		for(int i=0;i<strId.length;i++){
    			String[] st = strId[i].split("&&");
    			long lon = Long.parseLong(st[0]);
    			idss.add(lon);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	try{
    		correspondenceService.updateCorresStatus(idss);
    	}catch(Exception e){
    		e.printStackTrace();
    		return new JSONResult(false,"更新数据失败！");
    	}
    	return new JSONResult(true,"数据更新成功！");
    }

    /**
     * 导出信函列表数据
     * @param example
     * @param request
     * @param response
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/exportExcelCorres",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_ALL_EXPORT)
    @ResponseBody
    public void exportExcelCorres(PlmsDocumentGenLogSearchParamDto example,HttpServletRequest request, HttpServletResponse response){
    	if(example == null || "".equals(example)){
            //return new JSONResult(false,"导出数据生成错误！"); //参数有误返回返回空数据
        }
    	//系统分隔符
    	String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
    	//导出的数据
    	List<PlmsCorresExportDto> list = correspondenceService.findExportExcelCorres(example);
    	String title = "逾期信涵生成记录";//生成excel表的默认名
    	String[] headers = {"文档名称","收件人","身份证号码","合同编号","生成人","生成日期","逾期天数","地址类别","客户地址","贷款人","逾期本金/保证金","逾期违约金","扣款失败手续费","利息和居间费","催收费","划扣手续费","共计","联系人","联系电话"}; // 表的列名
    	String pattern = "yyyy/MM/dd hh:mm:ss"; //时间格式
    	String docsPath = request.getSession().getServletContext().getRealPath("docs");
    	OutputStream out = null;
    	File f = new File(docsPath);
    	//如果文件夹不存在就创建文件夹
    	if(!f.exists()){
    		f.mkdirs();
    	} 
    	// 在文件夹下创建文件名
    	String fileName="caseManagement.xls";
    	File file = new File(f,fileName);
    	if(!file.exists()){
    		try {
    			file.createNewFile();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    	String filePath = docsPath + FILE_SEPARATOR + fileName;
		try {
			out = new FileOutputStream(filePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try{
			correspondenceService.getExportExcelCorres(title, headers, list, out, pattern);
			FileUtil.downloadFile("逾期信涵生成记录.xls",filePath,request,response);
		}catch(Exception e){
			e.printStackTrace();
		}
    }
	
    /**
     * @Description: 查看信函列表数据详情信息
     * @param @param corrId log信函详情主键ID
     * @return JSONResult
     * @author zhengjizhao
     * @date 2016年11月1日上午11:30:01
     */
    @RequestMapping(value = "/getCorrImfomationById",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_ALL_SELECT)
    @ResponseBody
    public JSONResult getCorrImfomationById(String corrId,String clientName,String idCardNo){
    	if(corrId == null || clientName == null || idCardNo  == null){
    		return new JSONResult(false,"参数错误，查询详情失败");
    	}
    	PlmsDocumentGenLogDto plmsDocumentGenLogDto = new PlmsDocumentGenLogDto();
    	plmsDocumentGenLogDto = correspondenceService.selectCorrImfomationById(Long.parseLong(corrId),clientName,idCardNo);
    	if(plmsDocumentGenLogDto == null){
    		return new JSONResult(false,"数据查询失败");
    	}
    	return new JSONResult<PlmsDocumentGenLogDto>(plmsDocumentGenLogDto);
    }
    
    /**
     * 修改信函发送状态-信函退回
     * @param id
     * @return
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/changeStatusAndAddRebackInfo",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESPONDENCE_ALL_UPDATE)
    @ResponseBody
    public JSONResult changeStatusAndAddRebackInfo(HttpServletRequest request,PlmsCorresRebackInfo plmsCorresRebackInfo){
    	if(plmsCorresRebackInfo.getParas() == null || "".equals(plmsCorresRebackInfo.getParas())){
    		return new JSONResult(false,"参数错误！");
    	}
    	//当前登录用户
        SessionMsg session = SubjectUtil.getSession(request);
    	try{
    		String[] strId = plmsCorresRebackInfo.getParas().split(",");
    		for(int i=0;i<strId.length;i++){
    			String[] st = strId[i].split("&&");
    			Long ids = Long.parseLong(st[0]);
    			PlmsDocumentGenLogDto plmsDocumentGenLogDto = correspondenceService.selectCorresLogByLogId(ids);
    			PlmsLnCorresLog plmsCorresLogInfo = new PlmsLnCorresLog();
    	    	plmsCorresLogInfo.setApplId(plmsDocumentGenLogDto.getApplyId());
    	    	plmsCorresLogInfo.setLogContent("编号"+plmsDocumentGenLogDto.getCorresCode()+"的信函已由"+plmsDocumentGenLogDto.getGenByName()+"确认退回");
    	    	plmsCorresLogInfo.setGenByName(plmsDocumentGenLogDto.getGenByName());
    	    	//登录用户
    	        String loginUser = SubjectUtil.getUserId();
    	        plmsCorresLogInfo.setCreatedBy(loginUser);
    	        plmsCorresLogInfo.setUpdatedBy(loginUser);
    	        correspondenceService.insertCorresLog(plmsCorresLogInfo);
    			plmsCorresRebackInfo.setIds(ids);
    			plmsCorresRebackInfo.setUpdatedBy(session.getName());
    			//plmsCorresRebackInfo.setUpdateTime(new Date());
    			correspondenceService.updateStatusRebackInfo(plmsCorresRebackInfo);
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    		return new JSONResult(false,"更新数据失败！");
    	}
    	return new JSONResult(true,"数据更新成功！");
    }
    /**
     * 
     * @Description: 下拉信函退回类型的下拉框数据
     * @param  para
     * @return JSONResult  
     * @author zhengjizhao
     * @date 2016年12月5日下午2:40:16
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/selectRebackTypeOne",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult selectRebackTypeOne(String para){
    	List<PlmsRebackTypeEntry> rebackType =  correspondenceService.selectRebackTypeOne(para);
    	return new JSONResult(rebackType);
    }
}
