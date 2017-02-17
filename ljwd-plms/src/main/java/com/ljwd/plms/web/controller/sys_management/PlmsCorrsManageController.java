package com.ljwd.plms.web.controller.sys_management;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.FileOperateUtil;
import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoDto;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoInsertDto;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoSearchDto;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.correspondence.inf.CorrespondenceService;
import com.ljwd.plms.web.service.sys_management.inf.PlmsCorresManageService;
import com.ljwd.plms.web.vo.DataTableParam;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresondenceCategory;

/**
 * 
 * ClassName: PlmsCorrsManageController 
 * @Description: 模板管理控制器
 * @author zhengjizhao
 * @date 2016年11月1日下午3:22:46
 */
@Controller
@RequestMapping(value="/corresManage")
public class PlmsCorrsManageController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Resource
	private PlmsCorresManageService plmsCorresManageService;
	@Resource
    private CorrespondenceService correspondenceService;
	/**
	 * 
	 * @Description: 打开信函模板页面
	 * @param model
	 * @return String  
	 * @author zhengjizhao
	 * @date 2016年11月2日下午1:57:17
	 */
	@RequestMapping(value = "/openCorresManegeJsp",method = RequestMethod.GET)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_SELECT)
	public String openCorresManegeJsp(Model model){
		List<PlmsCorresondenceCategory> categoryList = correspondenceService.selectCategory();
		model.addAttribute("categoryList",categoryList);
		return "/jsp/sys_management/corresManageinfo";
	}
	/**
	 * 
	 * @Description: 上传模板文件
	 * @param request
	 * @return JSONResult  
	 * @author zhengjizhao
	 * @date 2016年11月3日上午11:08:06
	 */
	@RequestMapping(value ="/uploadDocument",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_INSERT)
	@ResponseBody
	public JSONResult uploadDocument(HttpServletRequest request){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
		//获取系统时间戳，用来作为保存文件的底层文件夹
		long strTime = System.currentTimeMillis();
		String strDate = simpleDateFormat.format(strTime);
		 //配置的文件保存路劲
		String filePath = ConfigUtil.getStringVal("file.picture.url") + File.separator + "sysManage" + File.separator + "corres"+ File.separator+strDate+File.separator;
        try {
            String pathDoc = FileOperateUtil.upload(request,filePath);
            if("isnull".equals(pathDoc)){
            	return new JSONResult(false,"文件内容为空，请选择正确的文件！");
            }
            else if("error".equals(pathDoc)){
            	return new JSONResult(false,"文件上传失败！");
            }
            else{
            	return new JSONResult(pathDoc,"文件上传成功！",true);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONResult(false,"文件上传失败！");
	}
	/**
	 * 
	 * @Description: 保存模板信息数据
	 * @param  plmsPdfCorresInfoDto
	 * @return JSONResult  
	 * @author zhengjizhao
	 * @date 2016年11月3日上午11:08:22
	 */
	@RequestMapping(value ="/saveCorresPdfData",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_INSERT)
	@ResponseBody
	public JSONResult saveCorresPdfData(HttpServletRequest request,PlmsPdfCorresInfoInsertDto plmsPdfCorresInfoInsertDto){
		try{
			plmsPdfCorresInfoInsertDto.setFilePath(plmsPdfCorresInfoInsertDto.getFilePath().replace("\\", "/"));
			//当前登录用户
	        SessionMsg session = SubjectUtil.getSession(request);
	        plmsPdfCorresInfoInsertDto.setCreatedBy(session.getName());
	        plmsPdfCorresInfoInsertDto.setUpdatedBy(session.getName());
			plmsCorresManageService.insertPdfCorresFile(plmsPdfCorresInfoInsertDto);
			return new JSONResult(true,"数据保存成功！");
		}catch(Exception e){
			e.printStackTrace();
			return new JSONResult(false,"数据保存失败！");
		}
		
	}
	/**
	 * 
	 * @Description: 分页查找模板数据
	 * @param  dto
	 * @return String  
	 * @author zhengjizhao
	 * @date 2016年11月4日上午10:51:13
	 */
	@RequestMapping(value ="/selectCorresManaData",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_SELECT)
	@ResponseBody
	public String selectCorresManaData(PlmsPdfCorresInfoSearchDto dto){
			if(dto.getParamData() == null || "".equals(dto.getParamData())){
	            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
	        }

	        //分页条件
	        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(dto.getParamData());
	        //记录操作的次数
	        int sEcho = dataTableParam.getsEcho();
	        //每页记录数
	        int pageSize = dataTableParam.getiDisplayLength();
	        //页数
	        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;
	        //设置排序
	        dto.setOrderByClause(dataTableParam);
	        Page<PlmsPdfCorresInfoDto> pageData = new Page<PlmsPdfCorresInfoDto>(pageNo, pageSize); 
	        pageData = plmsCorresManageService.selectCorresManaDataForPage(pageData, dto);
	        deleteInvalidPdf();
	        return PageUtil.getPageJson(sEcho, pageData);
	}
	/**
	 * @Description: 每次进入模板管理都自动清理一次由于上传，却没有提交信息导致服务器产生的无效文件。
	 * @author zhengjizhao
	 * @date 2016年12月29日下午3:18:49
	 */
	private void deleteInvalidPdf(){
		//获取文件储存路径下的所有时间记录文件夹
		String filePath = ConfigUtil.getStringVal("file.picture.url") + File.separator + "sysManage" + File.separator + "corres"+ File.separator;
		File file = new File(filePath);
		//如果没有任何文件就返回
		if (!file.exists()) {
			return;
        }
		//查找文件信息表里的有效的文件信息
		List<PlmsPdfCorresInfoDto> list = plmsCorresManageService.selectAllCorresPdfInfo();
		File[] fileLists = file.listFiles(); // 获取该目录下的内容集合
		//如果数据库没有一个有效的文件信息就删除所有的无效文件
		if(list == null){
			for (int i = 0; i < fileLists.length; i++) { // 循环遍历这个集合内容
				//删除文件
				FileUtil.delFolder((fileLists[i]).toString());
			}
		//否则删除在数据表中没有信息的无效文件	
		}else{
			for (int j = 0; j < fileLists.length; j++) { // 循环遍历这个集合内容
				Boolean bool = false;
				toHere:
				for(int i=0;i<list.size();i++){
					String[] filePathList = (list.get(i).getFilePath()).split("/");
					//表中查询出来的文件名
					String FileName = filePathList[filePathList.length-2];
					System.out.println(FileName);
					//如果文件和存在表中的数据对应就不删除
					if((fileLists[j].getName()).equals(FileName)){
						bool = true;
						break toHere;
					}
				}
				if(!bool){
					//删除文件
					FileUtil.delFolder(fileLists[j].toString());
				}
			
			}
		}
	}
	/**
	 * 
	 * @Description: 下载模板
	 * @param  exportPath   文件在服务器存放的路径
	 * @author zhengjizhao
	 * @date 2016年11月4日上午10:51:35
	 */
	@RequestMapping(value="/download",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_PDFOUT)
    public void download(HttpServletRequest request, HttpServletResponse response,String exportPath){
    	String filePath = ""; //文件路径
    	String downloadfFileName = "";//文件名
    	if(exportPath != null && !"".equals(exportPath)){
    		String[] psList = exportPath.split("/");
    		for(int i=0;i<psList.length-1;i++){
    			filePath +=psList[i]+File.separator;
    		}
    		downloadfFileName = psList[psList.length-1];
    	}
        try {
           // downloadfFileName = new String(downloadfFileName.getBytes("iso-8859-1"),"utf-8");
            String fileName = downloadfFileName.substring(downloadfFileName.indexOf("_")+1);
            String userAgent = request.getHeader("User-Agent");
            byte[] bytes = userAgent.contains("MSIE") ? fileName.getBytes() : fileName.getBytes("UTF-8"); 
            fileName = new String(bytes, "ISO-8859-1");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));
            FileOperateUtil.download(downloadfFileName, response.getOutputStream(),filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	/**
	 * 
	 * @Description: 删除模板
	 * @param  id 模板ID
	 * @param  path  模板存放在服务器的路径  
	 * @author zhengjizhao
	 * @date 2016年11月4日上午10:52:17
	 */
	@RequestMapping(value="/deleteCorresPdf",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_DELETE)
	@ResponseBody
	public JSONResult deleteCorresPdf(Long id,String path){
		try{
			plmsCorresManageService.deletePdfCorresFileById(id);
			//删除文件
			FileUtil.deleteFile(path);
			return new JSONResult(true,"文件删除成功");
		}catch(Exception e){
			e.printStackTrace();
			return new JSONResult(true,"文件删除失败");
		}
	}
	/**
	 * 
	 * @Description: 查询信函模板信息并返回页面显示
	 * @param  id 模板ID
	 * @return JSONResult  
	 * @author zhengjizhao
	 * @date 2016年11月4日下午2:45:47
	 */
	@RequestMapping(value ="/selectPdfInfo",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CORRESMANAGE_SELECT)
	@ResponseBody
	public JSONResult selectPdfInfo(Long id){
			//通过ID查找数据
			PlmsPdfCorresInfoDto dto= plmsCorresManageService.selectCorresPdfDataById(id);
			
	        return new JSONResult(dto);
		
	}
	/**
	 * 
	 * @Description: 跟新模板信息数据
	 * @param  dto 模板信息实体
	 * @return JSONResult  
	 * @author zhengjizhao
	 * @date 2016年11月4日下午3:42:50
	 */
	@RequestMapping(value ="/upDatePdfInfo",method = RequestMethod.POST)
	@RequiresPermissions(PermissionSign.CASEMANAGEMENT_SELECT)
	@ResponseBody
	public JSONResult upDatePdfInfo(HttpServletRequest request,PlmsPdfCorresInfoInsertDto dto){
		try{
			dto.setFilePath(dto.getFilePath().replace("\\", "/"));
			//当前登录用户
	        SessionMsg session = SubjectUtil.getSession(request);
	        dto.setUpdatedBy(session.getName());
	        dto.setUpdateTime(new Date());
	        plmsCorresManageService.updatePdfCorresFileByModel(dto);
	        return new JSONResult(true,"更新数据成功！");
		}catch(Exception e){
			e.printStackTrace();
			return new JSONResult(false,"更新数据失败！");
		}
	}
}
