package com.ljwd.plms.web.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/21
 * springMvc session过滤器,需配置在shiro之前执行
 */
public class SessionFilter extends OncePerRequestFilter {
    private static final String LOGIN_URL = "/rest/page/login";
    private static List<String> unCheckUrls = new ArrayList<String>();
    static {
        unCheckUrls.add("/rest/page/login");                //登录页
        unCheckUrls.add("/rest/user/login");                //登录方法(loginKey)
        unCheckUrls.add("/rest/user/logout");               //退出登录
        unCheckUrls.add("/rest/surveyCall/callBack");       //通话记录回调接口
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response,FilterChain filterChain) throws ServletException,IOException {
        //请求的url
        String url = request.getRequestURI();
        //是否过滤
        boolean doFilter = true;
        for(String unCheckUrl : unCheckUrls){
            if(url.indexOf(unCheckUrl) != -1){
                //如果url中包含不过滤的url，则不进行过滤
                doFilter = false;
                break;
            }
        }
        //执行过滤
        if (doFilter){
            //从session中获取登录信息
            Object obj = request.getSession().getAttribute("session");
            if (obj == null) {
                //如果session中不存在登录信息，则弹出框提示重新登录
                //如果是ajax请求响应头会有,x-requested-with
                if(request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
                    //在响应头设置session状态
                    response.setHeader("sessionStatus","timeout");
                }else{
                    response.sendRedirect(request.getContextPath() + LOGIN_URL);
                }
            } else {
                //如果session中存在登录信息，则继续
                filterChain.doFilter(request, response);
            }
        } else {
            //如果不执行过滤，则继续
            filterChain.doFilter(request, response);
        }
    }

}
