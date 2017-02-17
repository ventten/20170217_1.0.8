package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.util.FileUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
 * Created by zhengzw
 * 委外申请控制器-导出Excel
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcExportController {
    private static Logger logger = LoggerFactory.getLogger(OutsrcExportController.class);
    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 委外-导出委外列表Excel
     * @param example 查询条件
     */
    @RequestMapping(value = "/exportExcel", method = RequestMethod.POST)
    @RequiresPermissions(PermissionSign.OUT_SRC_EXPORT)
    public void exportExcel(OutsrcPageExample example,HttpServletRequest request, HttpServletResponse response){
        //查询未再委案
        if(example.getNotApplAgain() != null && example.getNotApplAgain()){
            example.setMaxId(true);
            example.setWinfoStatus(LoanStatus.REPAYING);
            example.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
        }else {
            //如果不是管理员并且查询待审核状态的数据,则加上机构ID
            if(!SubjectUtil.hasRole("admin") && !StringUtil.isEmpty(example.getStatus()) && PlmsLaApplOutsrc.STATUS_AUDIT.equals(example.getStatus())){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }
        //查询数据
        List<OutsrcPageDto> pageList = outsrcService.selectByExampleForExcel(example);
        //导出数据的List
        List<OutsrcExcelDto> exportList = new ArrayList<OutsrcExcelDto>();

        if(pageList != null && pageList.size() > 0){
            //复制数据
            for(int index = 0; index < pageList.size(); index++){
                OutsrcPageDto dto = pageList.get(index);
                OutsrcExcelDto excelDto = new OutsrcExcelDto();
                BeanUtils.copyProperties(dto,excelDto);
                excelDto.setRowNo(index + 1L);
                exportList.add(excelDto);
            }
        }
        //文件临时保存路径
        String path = request.getSession().getServletContext().getRealPath("docs");
        if(FileUtil.createFile(path)){
            //系统分隔符
            String FILE_SEPARATOR = System.getProperties().getProperty("file.separator");
            //生成后临时保存到服务器的文件名称
            String fileName = "outsrcData.xls";
            outsrcService.exportToExcel("委外数据导出",fileName,path,exportList);
            String filePath = path + FILE_SEPARATOR + fileName;
            FileUtil.downloadFile("委外数据导出.xls", filePath, request, response);
        }else {
            logger.info("----导出委外数据-创建目录失败----");
        }
    }

    /**
     * 委外-导出委外明细Excel
     * @param example 查询条件
     */
    @RequestMapping(value = "/exportDetailExcel", method = RequestMethod.POST)
    @RequiresPermissions(PermissionSign.OUT_SRC_EXPORT_DETAIL)
    public void exportDetailExcel(OutsrcPageExample example,HttpServletRequest request, HttpServletResponse response){
        //查询未再委案
        if(example.getNotApplAgain() != null && example.getNotApplAgain()){
            example.setMaxId(true);
            example.setWinfoStatus(LoanStatus.REPAYING);
            example.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
        }else {
            //如果不是管理员并且查询待审核状态的数据,则加上机构ID
            if(!SubjectUtil.hasRole("admin") && !StringUtil.isEmpty(example.getStatus()) && PlmsLaApplOutsrc.STATUS_AUDIT.equals(example.getStatus())){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }
        //导出单位和职位信息
        example.setExportDetail(true);
        //查询数据
        List<OutsrcPageDto> pageList = outsrcService.selectByExampleForExcel(example);
        //导出数据的List
        List<OutsrcDetailExcelDto> exportList = new ArrayList<OutsrcDetailExcelDto>();

        if(pageList != null && pageList.size() > 0){
            //复制数据
            for(int index = 0; index < pageList.size(); index++){
                OutsrcPageDto dto = pageList.get(index);
                OutsrcDetailExcelDto excelDto = new OutsrcDetailExcelDto();
                BeanUtils.copyProperties(dto,excelDto);
                excelDto.setRowNo(index + 1L);
                exportList.add(excelDto);
            }
        }
        //文件临时保存路径
        String path = request.getSession().getServletContext().getRealPath("docs");
        if(FileUtil.createFile(path)){
            //系统分隔符
            String separator = System.getProperties().getProperty("file.separator");
            //生成后临时保存到服务器的文件名称
            String fileName = "outsrcDetailData.xls";
            outsrcService.exportDetailToExcel("委外明细数据导出",fileName,path,exportList);
            String filePath = path + separator + fileName;
            FileUtil.downloadFile("委外明细数据导出.xls", filePath, request, response);
        }else {
            logger.info("----导出委外数据-创建目录失败----");
        }
    }

    /**
     * 委外-导出通讯信息Excel
     * @param example 查询条件
     */
    @RequestMapping(value = "/exportContactorExcel", method = RequestMethod.POST)
    @RequiresPermissions(PermissionSign.OUT_SRC_EXPORT_CONTACTOR)
    public void exportContactorExcel(OutsrcPageExample example,HttpServletRequest request, HttpServletResponse response){
        //查询未再委案
        if(example.getNotApplAgain() != null && example.getNotApplAgain()){
            example.setMaxId(true);
            example.setWinfoStatus(LoanStatus.REPAYING);
            example.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
        }else {
            //如果不是管理员并且查询待审核状态的数据,则加上机构ID
            if(!SubjectUtil.hasRole("admin") && !StringUtil.isEmpty(example.getStatus()) && PlmsLaApplOutsrc.STATUS_AUDIT.equals(example.getStatus())){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }
        //查询导出数据的List
        List<OutsrcContactorExcelDto> exportList = outsrcService.selectOutsrcContactorExcel(example);
        //排序
        if(exportList != null && exportList.size() > 0){
            Collections.sort(exportList, new Comparator<OutsrcContactorExcelDto>() {
                @Override
                public int compare(OutsrcContactorExcelDto o1, OutsrcContactorExcelDto o2) {
                    return o2.getCntrctNo().compareTo(o1.getCntrctNo());
                }
            });
        }

        //文件临时保存路径
        String path = request.getSession().getServletContext().getRealPath("docs");
        if(FileUtil.createFile(path)){
            //系统分隔符
            String separator = System.getProperties().getProperty("file.separator");
            //生成后临时保存到服务器的文件名称
            String fileName = "outsrcContactorData.xls";
            outsrcService.exportContactorToExcel("委外导出联系人通讯信息",fileName,path,exportList);
            String filePath = path + separator + fileName;
            FileUtil.downloadFile("委外导出联系人通讯信息.xls", filePath, request, response);
        }else {
            logger.info("----导出委外数据-创建目录失败----");
        }
    }

    /**
     * 委外-导出地址信息Excel
     * @param example 查询条件
     */
    @RequestMapping(value = "/exportAddressExcel", method = RequestMethod.POST)
    @RequiresPermissions(PermissionSign.OUT_SRC_EXPORT_ADDRESS)
    public void exportAddressExcel(OutsrcPageExample example,HttpServletRequest request, HttpServletResponse response){
        //查询未再委案
        if(example.getNotApplAgain() != null && example.getNotApplAgain()){
            example.setMaxId(true);
            example.setWinfoStatus(LoanStatus.REPAYING);
            example.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
        }else {
            //如果不是管理员并且查询待审核状态的数据,则加上机构ID
            if(!SubjectUtil.hasRole("admin") && !StringUtil.isEmpty(example.getStatus()) && PlmsLaApplOutsrc.STATUS_AUDIT.equals(example.getStatus())){
                SessionMsg session = SubjectUtil.getSession(request);
                example.setOrgId(session.getOrgId());
            }
        }

        //查询导出数据的List
        List<OutsrcAddressExcelDto> exportList = outsrcService.selectOutsrcAddressExcel(example);
        //排序
        if(exportList != null && exportList.size() > 0){
            Collections.sort(exportList, new Comparator<OutsrcAddressExcelDto>() {
                @Override
                public int compare(OutsrcAddressExcelDto o1, OutsrcAddressExcelDto o2) {
                    return o2.getCntrctNo().compareTo(o1.getCntrctNo());
                }
            });
        }

        //文件临时保存路径
        String path = request.getSession().getServletContext().getRealPath("docs");
        if(FileUtil.createFile(path)){
            //系统分隔符
            String separator = System.getProperties().getProperty("file.separator");
            //生成后临时保存到服务器的文件名称
            String fileName = "outsrcAddressData.xls";
            outsrcService.exportAddressToExcel("委外导出联系人地址信息",fileName,path,exportList);
            String filePath = path + separator + fileName;
            FileUtil.downloadFile("委外导出联系人地址信息.xls", filePath, request, response);
        }else {
            logger.info("----导出委外数据-创建目录失败----");
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
