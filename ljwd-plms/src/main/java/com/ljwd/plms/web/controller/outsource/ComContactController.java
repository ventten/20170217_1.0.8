package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContact;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContactExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComContactService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;

/**
 * Created by zhengzw
 * 委外机构-联系人控制器
 */
@Controller
@RequestMapping(value = "/outsrcCom")
public class ComContactController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PlmsOutsrcComService outsrcComService;
    @Resource
    private PlmsOutsrcComContactService outsrcComContactService;

    /**
     * 委外机构联系人数据
     */
    @RequestMapping(value = "/pageOutsrcComContactData", method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_CONTACT_SELECT)
    public String pageOutsrcComContactData(PlmsOutsrcComContactExample example) {
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getOutsrcComId() == null){
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

        example.setOrderByClause("T.ID DESC");

        Page<PlmsOutsrcComContact> pageData = new Page<PlmsOutsrcComContact>(pageNo, pageSize);

        pageData = outsrcComContactService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 导入委外机构通讯录
     * @param outsrcComId 委外机构ID
     * */
    @RequestMapping(value = "/importOutsrcComContact",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_CONTACT_IMPORT)
    public JSONResult importOutsrcComContact(Long outsrcComId,HttpServletRequest request){
        if(outsrcComId == null){
            return new JSONResult(false,"参数错误");
        }

        //创建一个通用的文件解析器
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());

        //判断request是否有文件上传,即多文件请求
        if(multipartResolver.isMultipart(request)){
            try {
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;              //转换request
                if(multiRequest.getMultiFileMap().size()==0){
                    return new JSONResult(false,"请选择一个Excel文件");
                }
                if(multiRequest.getMultiFileMap().size() > 1){
                    return new JSONResult(false,"一次只能上传一个文件");
                }
                Iterator<String> iterator = multiRequest.getFileNames();                                      //取得request中的所有文件名
                while(iterator.hasNext()){
                    MultipartFile file = multiRequest.getFile(iterator.next());                               //取得上传文件
                    if(file == null || StringUtil.isEmpty(file.getOriginalFilename())){
                        return new JSONResult(false,"文件不存在");
                    }
                    String fileName = file.getOriginalFilename();                                         //取得当前上传文件的文件名称
                    //如果名称不为"",说明该文件存在,否则说明该文件不存在
                    try {
                        String ext = fileName.substring(fileName.lastIndexOf("."),fileName.length());
                        if(!".XLS".equalsIgnoreCase(ext.toUpperCase()) && !".XLSX".equalsIgnoreCase(ext.toUpperCase()) ){
                            return new JSONResult(false,"请选择Excel文件");
                        }
                    }catch (Exception e){
                        return new JSONResult(false,"请选择Excel文件");
                    }

                    String loginUserId = SubjectUtil.getUserId();
                    outsrcComContactService.saveContactByExcel(file.getInputStream(),fileName,outsrcComId,loginUserId);
                }
            }catch (Exception e){
                e.printStackTrace();
                logger.error(e.getMessage());
                return new JSONResult(false,e.getMessage());
            }
        }else {
            return new JSONResult(false,"请选择一个Excel文件");
        }

        return new JSONResult(true,"上传成功");
    }

}
