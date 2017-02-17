package com.ljwd.plms.web.controller.case_collection;

import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionDto;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExportDto;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 案件催收-导出控制器
 * */
@Controller
@RequestMapping(value="/caseCollection")
public class CaseCollectionExportController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private PlmsWorkOrderPoolService workOrderPoolService;

    /**
     * 全部案件-导出Excel
     * @param example 查询条件
     */
    @RequestMapping(value = "/caseCollectionAllExportExcel", method = RequestMethod.POST)
    @RequiresPermissions(PermissionSign.CASE_ALL_EXPORT)
    public void exportExcel(CaseCollectionExample example, HttpServletRequest request, HttpServletResponse response){
        //如果催收员为空
        if(StringUtil.isEmpty(example.getCollector()) && StringUtil.isEmpty(example.getCollectorName())){
            Subject subject = SubjectUtil.getSubject();
            //如果没有查看全部催收员权限
            if(!subject.isPermitted(PermissionSign.CASE_ALL_ALL_COLLECTOR)){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }

        //查询数据
        List<CaseCollectionDto> pageList = workOrderPoolService.selectCaseCollectionByExampleForExcel(example);
        //导出数据的List
        List<CaseCollectionExportDto> exportList = new ArrayList<CaseCollectionExportDto>();

        if(pageList != null && pageList.size() > 0){
            //复制数据
            for(int index = 0; index < pageList.size(); index++){
                CaseCollectionDto dto = pageList.get(index);
                CaseCollectionExportDto excelDto = new CaseCollectionExportDto();
                BeanUtils.copyProperties(dto,excelDto);
                excelDto.setRowNo(index + 1L);
                if(dto.getOverduePeriod() != null){
                    excelDto.setOverduePeriodText("" + dto.getOverduePeriod() + "-" + dto.getMaxOverduePeriod());
                }
                exportList.add(excelDto);
            }
        }

        //文件临时保存路径
        String path = request.getSession().getServletContext().getRealPath("docs");
        if(FileUtil.createFile(path)){
            //系统分隔符
            String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
            //生成后临时保存到服务器的文件名称
            String fileName = "caseCollectionAllData.xls";
            workOrderPoolService.exportCaseCollectionToExcel("全部案件导出",fileName,path,exportList);
            String filePath = path + FILE_SEPARATOR + fileName;
            FileUtil.downloadFile("全部案件导出.xls", filePath, request, response);
        }else {
            logger.info("----导出全部案件-创建目录失败----");
        }
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
