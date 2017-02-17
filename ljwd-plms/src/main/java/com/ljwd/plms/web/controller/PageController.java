package com.ljwd.plms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 视图控制器,返回jsp视图给前端
 **/
@Controller
public class PageController {
    //private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 首页
     * @param request request
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "index";
    }

    /**
     * 登录页
     */
    @RequestMapping("/page/login")
    public String login(HttpServletRequest request) {
        Object obj = request.getSession().getAttribute("session");
        // 已登陆 跳到首页
        if (obj != null) {
            return "redirect:/";
        }
        return "login";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/page/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * 401页
     */
    @RequestMapping("/page/401")
    public String error401() {
        return "401";
    }

    /**
     * 404页
     */
    @RequestMapping("/page/404")
    public String error404() {
        return "404";
    }

    /**
     * 500页
     */
    @RequestMapping("/page/500")
    public String error500() {
        return "500";
    }

    /**
     * exception页
     */
    @RequestMapping("/page/exception")
    public String errorException() {
        return "exception";
    }

    /**
     * paramErrorOrDataNotFound页
     */
    @RequestMapping("/page/paramErrorOrDataNotFound")
    public String paramErrorOrDataNotFound() {
        return "paramErrorOrDataNotFound";
    }

//    /**
//     * 校验页面登录信息和后台session信息
//     * */
//    @RequestMapping(value = "/page/checkUser",method = RequestMethod.POST)
//    @ResponseBody
//    public Boolean checkUser(String currentUser,HttpServletRequest request){
//        SessionMsg sessionMsg = SubjectUtil.getSession(request);
//        if(StringUtil.isEmpty(currentUser) || sessionMsg == null){
//            return false;
//        }
//        return currentUser.equals(sessionMsg.getName());
//    }

}