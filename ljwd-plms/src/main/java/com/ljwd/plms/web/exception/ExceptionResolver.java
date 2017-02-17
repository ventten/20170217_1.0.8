package com.ljwd.plms.web.exception;

import com.ljwd.plms.core.util.D;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengzw on 2016/7/5
 * springMVC异常处理
 */
public class ExceptionResolver implements HandlerExceptionResolver {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ModelAndView resolveException(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("ex", ex);
        ex.printStackTrace();

        //根据不同错误转向不同页面
        if(ex instanceof org.apache.shiro.authz.UnauthorizedException) {
            //没有权限
            return new ModelAndView("401");
        }else if(ex instanceof org.springframework.web.multipart.MaxUploadSizeExceededException){
            //SpringMVC文件上传超出限制
            logger.error("异常:" + D.parse(new Date(),D.PATTERN_SECONDS) + "-->" + ex);
            return new ModelAndView("exception", model);
        }else {
            logger.error("异常:" + D.parse(new Date(),D.PATTERN_SECONDS) + "-->" + ex);
            return new ModelAndView("exception", model);
        }
    }

}