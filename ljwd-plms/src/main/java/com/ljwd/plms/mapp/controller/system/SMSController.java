package com.ljwd.plms.mapp.controller.system;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.security.SessionManage;
import com.ljwd.plms.mapp.utils.SMSUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 联金催收安全中心
 * Created by tangjialin on 2016-11-17 0017.
 */
@RestController
@RequestMapping("/sms")
public class SMSController extends MAppAbstractController {

    /**
     * 发送手机验证码
     * <pre>
     * 请求信息:{"type":"ASSOCIATION","mobile":"135****0012"}
     *     type   : 验证码类型
     *              ASSOCIATION    绑定手机
     *              DISASSOCIATION 解绑手机
     *     mobile : 接收验证码的手机号码
     *              当type为DISASSOCIATION时,传入的手机号码无效
     *
     * 响应信息:
     * {"message":"验证码发送成功","statusCode":0,"success":true,"data":null}
     * 键值对说明:
     *     success    : 处理成功返回true,否则返回false
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 响应结果时携带的数据,暂时为空
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/sendVerifyCode")
    public Result sendVerifyCode(AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            String verifyCodeKey = null;
            Session session = SecurityUtils.getSubject().getSession();
            String mobile = SessionManage.api.getLoginUser(session).getTel();
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            String type = jsonObject.getString("type");
            if ("ASSOCIATION".equals(type)) {
                if (mobile != null && !mobile.isEmpty()) { return result.setMessage("已绑定手机号码"); }
                mobile = jsonObject.getString("mobile");
                verifyCodeKey = SMSUtil.VERIFY_CODE_ASSOCIATION_KEY;
                if (mobile == null || mobile.isEmpty()) { return result.setMessage("手机号码不能为空"); }
            } else if ("DISASSOCIATION".equals(type)) {
                if (mobile == null || mobile.isEmpty()) { return result.setMessage("未绑定手机号码"); }
                verifyCodeKey = SMSUtil.VERIFY_CODE_DISASSOCIATION_KEY;
            } else {
                return result.setMessage("发送类型错误");
            }
            if (!StringUtil.isMobile(mobile)) { return result.setMessage("手机号码格式错误"); }
            Long verifyCodeSendTime = (Long) session.getAttribute(SMSUtil.VERIFY_CODE_SEND_TIME_KEY);
            long currentTimeMillis = System.currentTimeMillis();
            if (verifyCodeSendTime != null && verifyCodeSendTime + 1000L * 60 > currentTimeMillis) {
                // 验证码一分钟限制
                return result.setMessage("您的操作太快了,请稍做休息");
            }
            // 轮换验证码发送渠道Begin
            SMSUtil.SMSChannel smsChannel = (SMSUtil.SMSChannel) session.getAttribute(SMSUtil.SEND_CHANNEL_KEY);
            smsChannel = smsChannel == null || smsChannel == SMSUtil.SMSChannel.Monternet ? SMSUtil.SMSChannel.ExmayCMS : SMSUtil.SMSChannel.Monternet;
            session.setAttribute(SMSUtil.SEND_CHANNEL_KEY, smsChannel);
            // 轮换验证码发送渠道End
            String sendVerifyCode = SMSUtil.sendVerifyCode(mobile, smsChannel); // 发送验证码
            result.setSuccess(sendVerifyCode != null);
            if (result.isSuccess()) {
                session.setAttribute(verifyCodeKey, sendVerifyCode);
                session.setAttribute(SMSUtil.VERIFY_CODE_SEND_TIME_KEY, currentTimeMillis);
                session.setAttribute(SMSUtil.VERIFY_CODE_MOBILE_KEY, mobile);
            }
        } catch (Exception e) {
            logger.error("验证码发送异常", e);
        }
        result.setMessage(result.isSuccess() ? "验证码发送成功" : "验证码发送失败");
        return result;
    }

}
