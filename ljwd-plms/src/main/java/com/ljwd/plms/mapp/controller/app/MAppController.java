package com.ljwd.plms.mapp.controller.app;

import com.alibaba.fastjson.JSONObject;
import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.entity.Result;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.mapp.controller.MAppAbstractController;
import com.ljwd.plms.mapp.filter.AESAuthen;
import com.ljwd.plms.mapp.filter.AESHttpServletRequestWrapper;
import com.ljwd.plms.mapp.filter.AESHttpServletResponseWrapper;
import com.ljwd.plms.web.service.sys_management.inf.SystemService;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import java.io.IOException;

/**
 * Android和IOS App客户端对接控制器
 * @author tangjialin on 2016-04-15 0015.
 */
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/app")
public class MAppController extends MAppAbstractController {
    @Resource
    private SystemService systemService;

    /**
     * 校验IOS版本号,提交应用商城时用
     * @param request request
     * @return statusCode:1-匹配,0-不匹配
     */
    @RequestMapping(value = "/checkClientVersion")
    public Result checkClientVersion(AESHttpServletRequestWrapper request){
        Result result = new JSONResult<>().setSuccess(true);
        try {
            JSONObject requestData = JSONUtil.parseObject(request.getDecryptedBodyContent());
            String clientVersion = requestData.getString("clientVersion");
            if(StringUtil.isEmpty(clientVersion)){
                return result.setStatusCode(0);
            }
            //服务器配置的IOS版本号
            String appVersion = systemService.selectParamValByCode("APP.VERSION.IOS");
            return result.setStatusCode(clientVersion.equals(appVersion) ? 1 : 0);
        }catch (Exception e){
            e.printStackTrace();
            return result.setStatusCode(0);
        }
    }

//	/**
//	 * 检测App版本
//	 * @param request
//	 * @return 返回版本信息
//	 */
//	@RequestMapping("/checkVersion")
//	public Map<String, String> checkVersion(AESHttpServletRequestWrapper request) {
//		ServletContext servletContext = request.getSession().getServletContext();
//		String configValue = ConfigManageUtil.getConfigValue("system.config.app.android.config");
//		Properties properties = ConfigManageUtil.loadProperties(new File(servletContext.getRealPath(configValue)));
//		// 版本号
//		String version = properties.getProperty("android.app.config.version", "0");
//		// 下载连接
//		String downloadUrl = request.getContextPath();
//		downloadUrl = downloadUrl.endsWith("/") ? downloadUrl : downloadUrl + "/";
//		StringBuilder url = new StringBuilder();
//		url.append(request.getScheme()).append("://").append(request.getServerName());
//		url.append(":").append(request.getServerPort()).append(downloadUrl).append("app/download");
//
//		downloadUrl = url.toString();
//
//		// 更新日志
//		String upgradelog = properties.getProperty("android.app.config.upgradelog");
//		upgradelog = servletContext.getRealPath(upgradelog);
//		InputStream in = null;
//		try {
//			in = new FileInputStream(upgradelog);
//			upgradelog = IOUtils.toString(in, "UTF-8");
//		} catch (Exception e) {
//			logger.error(e.getLocalizedMessage(), e);
//			upgradelog = "修复已发现的问题";
//		} finally {
//			IOUtils.closeQuietly(in);
//		}
//		Map<String, String> message = new HashMap<>();
//		// 版本号,由客户端每次发布新版本定义.必须是数字
//		message.put("VERSION", version);
//		message.put("DOWNLOAD_URL", downloadUrl); // 下载地址
//		message.put("DESC", upgradelog); // 更新内容
//		return message;
//	}
//
//	/**
//	 * 下载最新的App
//	 * @param request
//	 * @param response
//	 */
//	@RequestMapping("/download")
//	public void download(AESHttpServletRequestWrapper request, AESHttpServletResponseWrapper response) {
//		InputStream inputStream = null;
//		OutputStream outputStream = null;
//		try {
//			ServletContext servletContext = request.getSession().getServletContext();
//			String configValue = ConfigManageUtil.getConfigValue("system.config.app.android.config");
//			Properties properties = ConfigManageUtil.loadProperties(new File(servletContext.getRealPath(configValue)));
//			String path = properties.getProperty("android.app.config.apk");
//			path = request.getSession().getServletContext().getRealPath(path);
//			File app = new File(path);
//			String name = URLEncoder.encode(app.getName(), "UTF-8");
//			response.reset();
//			response.setContentLength((int) app.length());
//			response.setHeader("Pragma", "No-cache");
//			response.setHeader("Cache-Control", "No-cache");
//			response.setDateHeader("Expires", 0);
//			response.setContentType("application/octet-stream");
//			response.addHeader("Content-Disposition", "attachment;filename=" + name);
//			inputStream = new FileInputStream(app);
//			outputStream = response.getOutputStream();
//			IOUtils.copyLarge(inputStream, outputStream);
//		} catch (IOException e) {
//			logger.error(e.getLocalizedMessage(), e);
//		}
//		IOUtils.closeQuietly(inputStream);
//		IOUtils.closeQuietly(outputStream);
//	}

    /**
     * 接口对接测试(响应不加密的原始请求内容)
     * @param request
     */
    @AESAuthen(responseEncrypt = false)
    @RequestMapping("/test")
    public String test(AESHttpServletRequestWrapper request) {
        return request.getDecryptedBodyContent();
    }

    /**
     * 接口对接测试(响应不加密的原始请求内容)
     * @param request
     * @param response
     */
    @RequestMapping("/write")
    public void write(AESHttpServletRequestWrapper request, AESHttpServletResponseWrapper response) {
        ServletOutputStream os = null;
        try {
            String bodyContent = request.getDecryptedBodyContent();
            byte[] bodyBytes = request.getDecryptedBodyBytes();
            os = response.getOutputStream();
            IOUtils.write(bodyBytes, os);
            if (isInfoEnabled) { logger.info("响应信息:[{}]", bodyContent); }
        } catch (IOException e) {
            logger.error("接口对接测试数据响应异常", e);
        } finally {
            IOUtils.closeQuietly(os);
        }
    }

    /**
     * 接口对接测试(响应加密JSON)
     * @param request
     * @return
     */
    @RequestMapping("/json")
    public Result json(AESHttpServletRequestWrapper request) {
        return new JSONResult<String>(null, request.getDecryptedBodyContent(), true);
    }

    /**
     * 接口对接测试(响应加密的原始请求内容)
     * @param request
     * @return
     */
    @RequestMapping("/encrypt")
    public String encrypt(AESHttpServletRequestWrapper request) {
        return request.getDecryptedBodyContent();
    }
}