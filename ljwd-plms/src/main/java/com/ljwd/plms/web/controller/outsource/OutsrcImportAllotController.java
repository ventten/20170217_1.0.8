package com.ljwd.plms.web.controller.outsource;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhengzw
 * 委外申请控制器-导入委外分配
 */
@Controller
@RequestMapping(value = "/outsrcAppl")
public class OutsrcImportAllotController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private PlmsLaApplOutsrcService outsrcService;

    /**
     * 导入委外分配
     * */
    @RequestMapping(value = "/importAllot",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.OUT_SRC_IMPORT_ALLOT)
    public JSONResult importAllot(HttpServletRequest request){
        //根据request获取上传的Excel文件
        JSONResult result = HttpUtils.getExcelMultipartFile(request);
        if(!result.isSuccess()){
            return result;
        }
        //文件结果
        HttpUtils.FileResult fileResult = (HttpUtils.FileResult) result.getData();
        String userId = SubjectUtil.getUserId();
        //Excel批量导入分配
        try {
            result = outsrcService.saveImportAllotByExcel(fileResult.getMultipartFile().getInputStream(),fileResult.getFileName(),userId);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            result = new JSONResult(false,e.getMessage());
        }
        return result;
    }

//    /**
//     * 字符串转日期类型参数
//     * */
//    @InitBinder
//    public void initBinder(WebDataBinder webDataBinder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }

}
