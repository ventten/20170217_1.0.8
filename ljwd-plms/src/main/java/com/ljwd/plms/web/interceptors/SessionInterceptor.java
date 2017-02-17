package com.ljwd.plms.web.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class SessionInterceptor implements HandlerInterceptor {

    private static final String LOGIN_URL="/rest/page/login";

    private List<String> unCheckUrls = new ArrayList<String>();

    @Override
    public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex)throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception {
        String url = request.getRequestURI();
        if(!unCheckUrls.contains(url)){
            //session中获取用户名信息
            Object obj = request.getSession(true).getAttribute("session");
            if (obj == null || "".equals(obj.toString())) {
                //如果是ajax请求响应头会有,x-requested-with
                if(request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
                    //在响应头设置session状态
                    response.setHeader("sessionStatus","timeout");
                }else{
                    response.sendRedirect(request.getContextPath() + LOGIN_URL);
                }
                return false;
            }
        }
        return true;
    }

    public List<String> getUnCheckUrls() {
        return unCheckUrls;
    }

    public void setUnCheckUrls(List<String> unCheckUrls) {
        this.unCheckUrls = unCheckUrls;
    }

}
