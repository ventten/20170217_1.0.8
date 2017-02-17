package com.ljwd.plms.web.controller;

import com.ljwd.plms.core.util.D;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhengzw on 2016/7/19
 * 基础控制器
 */
public class BaseController {

//    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    /**
//     * 基于@ExceptionHandler异常处理
//     * */
//    @ExceptionHandler
//    public String exp(HttpServletRequest request, Exception ex) {
//
//        request.setAttribute("ex", ex);
//
//        // 根据不同错误转向不同页面
//        if(ex instanceof org.springframework.web.multipart.MaxUploadSizeExceededException) {
//            //SpringMVC文件上传超出限制
//            logger.error("异常:" + D.parse(new Date(), D.PATTERN_SECONDS) + "-->" + ex);
//            return "exception";
//        }else if(ex instanceof org.apache.shiro.authz.UnauthorizedException){
//            //没有权限
//            return "401";
//        }else {
//            logger.error("异常:" + D.parse(new Date(),D.PATTERN_SECONDS) + "-->" + ex);
//            return "exception";
//        }
//
//    }

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
