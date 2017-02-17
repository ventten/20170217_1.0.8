package com.ljwd.plms.web.controller.outVisit;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.controller.case_management.PlmsWorkOrderPoolCaseController;
import com.ljwd.plms.web.enums.OutVisitCustType;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitAreaService;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolExportDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitExportResult;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitParamDto;
import com.ljwd.plms.web.vo.outVisit.AllOutVisitResult;
import com.ljwd.plms.web.vo.outVisit.MyOutVisitResult;

/**
 * <p>Title: AllOutVisitController</p>
 * @author pangshanxing
 * @date 2016年11月3日下午3:07:32
 * 全部外访
 */
@Controller
@RequestMapping("allOutVisit")
public class AllOutVisitController {

	@Resource
	private PlmsOvmOutVisitAreaService plmsOvmOutVisitAreaService;
	@Resource
	private PlmsOvmOutVisitInfoService plmsOvmOutVisitInfoService;
	
	private static Logger logger = LoggerFactory.getLogger(AllOutVisitController.class);

	@RequestMapping(value="/view",method = RequestMethod.GET)
	@RequiresPermissions(value={PermissionSign.ALLOUTVISIT_SELECT,PermissionSign.ALLOUTVISIT_SELECTALL},logical=Logical.OR)
	public String view(Model model,HttpServletRequest request){
		SessionMsg msg = SubjectUtil.getSession(request);
        if(msg==null){
        	return "登录信息已过期，请重新登录";
        }
	
		//客户类型
		Map<String, Object> custTypeMap = OutVisitCustType.getOutVisitCustType();
		//所属城市
		PlmsOvmOutVisitAreaExample example = new PlmsOvmOutVisitAreaExample();
		example.setIsActive("Y");
		List<PlmsOvmOutVisitArea> areaList = plmsOvmOutVisitAreaService.selectByExample(example);

		 if(SubjectUtil.isPermitted(PermissionSign.ALLOUTVISIT_SELECT)&&(!SubjectUtil.isPermitted(PermissionSign.ALLOUTVISIT_SELECTALL))){
	        	model.addAttribute("userName", msg.getUserName());
	     }

		
		model.addAttribute("custTypeList", custTypeMap);
		model.addAttribute("areaList", areaList);

		return "/jsp/outVisit/allOutVisit";
		
	}
	
	
	@RequestMapping("/pageAllOutVisitData")
	@ResponseBody
	@RequiresPermissions(value={PermissionSign.ALLOUTVISIT_SELECT,PermissionSign.ALLOUTVISIT_SELECTALL},logical=Logical.OR)
	public String pageAllOutVisitData(AllOutVisitParamDto example){
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

	        Page<AllOutVisitResult> pageData = new Page<AllOutVisitResult>(pageNo, pageSize);
	        
	        //设置排序
	        example.setOrderByClause(dataTableParam);

	        pageData = plmsOvmOutVisitInfoService.selectAllOutVisitByExampleAndPage(pageData, example);

	        return PageUtil.getPageJson_dataFormat(sEcho, pageData);

		
	}
	
	@RequestMapping("/exportExcel")
	@RequiresPermissions(PermissionSign.ALLOUTVISIT_EXPORT)
	public void exportExcel(AllOutVisitParamDto example,HttpServletRequest request, HttpServletResponse response){
		//系统分隔符
				String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
				List<AllOutVisitExportResult> expotList = plmsOvmOutVisitInfoService.selectByExampleForExport(example);
				String docsPath = request.getSession().getServletContext()
						.getRealPath("docs");
				if(FileUtil.createFile(docsPath)){
					plmsOvmOutVisitInfoService.exportToExcel("", docsPath, expotList);
					String fileName = "allOutVisit.xls";
					String filePath = docsPath + FILE_SEPARATOR + fileName;
					download(filePath,request,response);
				}else{
					logger.info("------创建目录失败-----");
				}
	}
	
	
	
	private void download(String path, HttpServletRequest request,HttpServletResponse response) {
		try {
			// path是指欲下载的文件的路径。
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();
			// 设置response的Header
			String fileName = "全部外访.xls";
			 try{
	                String userAgent = request.getHeader("User-Agent");
	                //针对各浏览器文件中文名称乱码问题
	                if (userAgent.contains("MSIE") || userAgent.contains("Trident")) {
	                    //针对IE或者以IE为内核的浏览器
	                    fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
	                } else {
	                    //非IE浏览器或者以IE为内核的处理
	                    fileName = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
	                }
	            }catch (Exception e){
	                e.printStackTrace();
	            }
			
		    response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));//文件名外的双引号处理firefox的空格截断问题
			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
			//删除文件
			FileUtil.deleteFile(path);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
