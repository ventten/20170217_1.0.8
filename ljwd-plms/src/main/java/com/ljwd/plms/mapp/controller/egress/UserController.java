package com.ljwd.plms.mapp.controller.egress;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.security.SessionManage;
import com.ljwd.plms.mapp.utils.SMSUtil;
import com.ljwd.plms.mapp.vo.egress.AppUserVo;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitUser;
import com.ljwd.plms.web.service.outVisit.inf.PlmsOvmOutVisitUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 联金催收登录用户模块
 * Created by tangjialin on 2016-11-15 0015.
 */
@RestController
@RequestMapping("/user")
public class UserController extends MAppAbstractController {
    @Resource
    private PlmsOvmOutVisitUserService plmsOvmOutVisitUserService;

    /**
     * 获取联金催收登录用户信息
     * <pre>
     * 请求信息:无
     *
     * 响应信息:
     * {"message":null,"statusCode":0,"success":true,
     * "data":{
     *   "name":"陈业X",
     *   "empNo":"1234",
     *   "tel":"139****1997"
     * }}
     * 键值对说明:
     *     success    : true:用户信息获取成功,false:请求成功，用户信息获取失败。对应中文描述在message中返回
     *     statusCode : 状态码.未定义,默认为0.
     *     message    : 当success返回为false时,此处返回服务器的错误描述
     *     data       : 用户信息.
     *      {
     *      name  : 姓名
     *      empNo : 工号
     *      tel   : 手机号
     *      }
     * </pre>
     * @param request
     * @return
     */
    @RequestMapping("/base")
    public Result baseInfo (AESHttpServletRequestWrapper request) {
        JSONResult jsonResult = new JSONResult();
        try {
            AppUserVo loginUser = SessionManage.api.getLoginUser();
            jsonResult.setData(loginUser).setSuccess(true);
        } catch (Exception e) {
            logger.error("用户信息获取异常", e);
            jsonResult.setMessage("用户信息获取失败");
        }
        return jsonResult;
    }

    /**
     * 绑定和解绑手机号码
     * <pre>
     * 请求信息:{"type":"ASSOCIATION","mobile":"135****0012","verifyCode":"123456"}
     *     type       : 操作类型
     *                  ASSOCIATION    绑定手机
     *                  DISASSOCIATION 解绑手机
     *     mobile     : 接收验证码的手机号码
     *                  当type为DISASSOCIATION时,传入的手机号码无效
     *     verifyCode : 用户收到的验证码
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
    @RequestMapping("/mobile")
    public Result mobile (AESHttpServletRequestWrapper request) {
        JSONResult result = new JSONResult();
        try {
            JSONObject jsonObject = JSONUtil.parseObject(request.getDecryptedBodyContent());
            String verifyCode = jsonObject.getString("verifyCode");
            if (verifyCode == null || verifyCode.isEmpty()) { return result.setMessage("手机验证码不能为空"); }
            Session session = SecurityUtils.getSubject().getSession();
            AppUserVo loginUser = SessionManage.api.getLoginUser(session);
            String type = jsonObject.getString("type");
            String mobile = loginUser.getTel();
            String verifyCodeKey = null;
            if ("ASSOCIATION".equals(type)) {           // 绑定手机号码
                if (mobile != null && !mobile.isEmpty()) { return result.setMessage("已绑定手机号码"); }
                mobile = jsonObject.getString("mobile");
                verifyCodeKey = SMSUtil.VERIFY_CODE_ASSOCIATION_KEY;
                if (mobile == null || mobile.isEmpty()) { return result.setMessage("手机号码不能为空"); }
                if (!StringUtil.isMobile(mobile)) { return result.setMessage("手机号码格式错误"); }
            } else if ("DISASSOCIATION".equals(type)) { // 解绑手机号码
                if (mobile == null || mobile.isEmpty()) { return result.setMessage("未绑定手机号码"); }
                verifyCodeKey = SMSUtil.VERIFY_CODE_DISASSOCIATION_KEY;
            } else {
                return result.setMessage("操作类型错误");
            }

            String sendMobile = (String) session.getAttribute(SMSUtil.VERIFY_CODE_MOBILE_KEY);
            if (sendMobile == null || sendMobile.isEmpty()) { return result.setMessage("未发送验证码"); }

            long endTime = System.currentTimeMillis() - 1000L * 60 * 3; // 3分钟
            Long verifyCodeSendTime = (Long) session.getAttribute(SMSUtil.VERIFY_CODE_SEND_TIME_KEY);
            if (verifyCodeSendTime == null || verifyCodeSendTime.longValue() < endTime) { return result.setMessage("验证码已失效,请重新发送"); }

            String sendVerifyCode = (String) session.getAttribute(verifyCodeKey);
            if (sendVerifyCode == null || !verifyCode.equals(sendVerifyCode)) { return result.setMessage("验证码错误"); }

            if (!sendMobile.equals(mobile)) { return result.setMessage("手机号码不一致"); } // 为了尽量不暴露用户隐私,手机号码一致性验证在最后
            mobile = "DISASSOCIATION".equals(type) ? "" : mobile;
            PlmsOvmOutVisitUser ovmOutVisitUser = plmsOvmOutVisitUserService.selectById(loginUser.getOutVisitUserId());
            PlmsOvmOutVisitUser updateOvmOutVisitUser = new PlmsOvmOutVisitUser();
            updateOvmOutVisitUser.setId(ovmOutVisitUser.getId());
            updateOvmOutVisitUser.setRecVer(ovmOutVisitUser.getRecVer());
            updateOvmOutVisitUser.setTel(mobile);
            updateOvmOutVisitUser.setUpdateTime(new Date());
            int update = plmsOvmOutVisitUserService.update(updateOvmOutVisitUser);
            result.setSuccess(update == 1);
            if (result.isSuccess()) { // 更新会话中的用户信息缓存
                loginUser.setTel(mobile == null || mobile.isEmpty() ? null : mobile);
                SessionManage.api.setLoginUser(loginUser);
            }
            result.setMessage(String.format("%s成功", "ASSOCIATION".equals(type) ? "绑定" : "解绑"));
        } catch (Exception e) {
            logger.error("手机绑定/解绑异常", e);
            result.setMessage("操作失败");
        }
        return result;
    }
}
