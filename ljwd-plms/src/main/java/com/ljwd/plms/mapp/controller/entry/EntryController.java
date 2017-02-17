package com.ljwd.plms.mapp.controller.entry;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.filter.AESHttpServletResponseWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入口控制器
 * Created by tangjialin on 2016-10-12 0012.
 */
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/entry")
public class EntryController extends MAppAbstractController {

    /**
     * 登录执行操作
     * <pre>
     * 请求信息:{"account":"test2","password":"abcd1234"}
     *     account      : 登录帐号
     *     password     : 登录密码
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,"data":null}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     * </pre>
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/login")
    public Result login(AESHttpServletRequestWrapper request, AESHttpServletResponseWrapper response) {
        Result result = new JSONResult<>().setSuccess(true);
        Subject subject = SecurityUtils.getSubject();
        if (subject != null && subject.isAuthenticated()) { return result; }
        try {
            JSONObject requestData = JSONUtil.parseObject(request.getDecryptedBodyContent());
            String account = requestData.getString("account");    // 登录账号
            String password = requestData.getString("password");  // 登录密码
            subject.login(new UsernamePasswordToken(account, password));
        } catch (AuthenticationException e) {
            result.setSuccess(false).setMessage(e.getMessage());
        }
        return result;
    }

    /**
     * 退出登录
     * <pre>
     * 请求信息:无
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     * </pre>
     * @return
     */
    @RequiresAuthentication
    @RequestMapping("/logout")
    public Result logout() {
        Result result = new JSONResult<>();
        Subject subject = SecurityUtils.getSubject();
        if (subject != null && subject.isAuthenticated()) {
            subject.logout();
        }
        return result.setSuccess(true);
    }

    /**
     * 401:权限不足
     * @return
     */
    @AESAuthen(requestCheck = false)
    @RequestMapping("/401")
    public Result error401() {
        // 用于当客户端会话失效后重新生成新的会话.不可删除,否则APP会话失效后无法要求客户重新登录
        // 在WEB系统中,request.getSession();和SecurityUtils.getSubject().getSession();等效
        SecurityUtils.getSubject().getSession();
        return new JSONResult<>(false, "请求未授权");
    }

}
