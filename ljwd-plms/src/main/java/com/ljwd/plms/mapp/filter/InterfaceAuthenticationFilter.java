package com.ljwd.plms.mapp.filter;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.utils.AES;
import com.ljwd.plms.mapp.utils.ComponentScan;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 接口认证过滤器
 * 用于验证app的请求是否合法
 * Created by tangjialin on 2016-08-29 0029.
 */
public class InterfaceAuthenticationFilter implements Filter {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    protected boolean isInfoEnabled = logger.isInfoEnabled();
    /** URL分离器.分离出请求地址中RequestMapping配置的部分 */
    protected UrlPathHelper urlPathHelper = new UrlPathHelper();
    /** URL模版分析器.分析RequestMapping中的URL配置是否匹配当前请求地址 */
    private PathMatcher antPathMatcher = new AntPathMatcher();
    /** URL和认证规则映射关系 */
    protected Map<String, AESAuthen> aesAuthenMapping = new HashMap<>(200);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String packages = filterConfig.getInitParameter("basePackages"); // 需要扫描的基础包
        if (packages == null || packages.isEmpty()) { return; }
        String[] basePackages = packages.split(",");

        for (String basePackage : basePackages) {
            Set<Class<?>> classes = ComponentScan.getClasses(basePackage);
            for (Class<?> zlass : classes) {
                RequestMapping classMapping = zlass.getAnnotation(RequestMapping.class);
                String[] baseArray = classMapping == null || classMapping.value().length == 0 ? new String[]{""} : classMapping.value();
                Method[] methods = zlass.getMethods(); // 返回该类及其父类中所有public的方法
                for (Method method : methods) {
                    AESAuthen aesAuthen = method.getAnnotation(AESAuthen.class);
                    if (aesAuthen == null) continue;
                    RequestMapping methodMapping = method.getAnnotation(RequestMapping.class);
                    for (String base : baseArray) {
                        String[] addressArray = (methodMapping == null || methodMapping.value().length == 0 ? new String[]{""} : methodMapping.value());
                        for (String address : addressArray) {
                            address = base + address;
                            address = address.startsWith("/") ? address : "/" + address;
                            address = address.replaceAll("/+", "/");
                            aesAuthenMapping.put(address, aesAuthen);
                        }
                    }
                }
            }
        }
    }

    /**
     * 解析对应请求的认证规则
     * @param request HttpServletRequest
     * @return 返回基于此请求的认证规则
     */
    public AESAuthen getAESAuthen(HttpServletRequest request) {
        String lookupPath = urlPathHelper.getLookupPathForRequest(request);
        AESAuthen aesAuthen = aesAuthenMapping.get(lookupPath);
        if (aesAuthen == null) {
            /** {@link PatternsRequestCondition#getMatchingPattern(java.lang.String, java.lang.String)} */
            Iterator<Map.Entry<String, AESAuthen>> iterator = aesAuthenMapping.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, AESAuthen> next = iterator.next();
                String pattern = next.getKey();
                boolean match = antPathMatcher.match(pattern, lookupPath);
                if (match) {
                    aesAuthen = next.getValue();
                    break;
                }
            }
        }
        if (isInfoEnabled) { logger.info("请求接口:[{}] 认证规则:[{}]", lookupPath, aesAuthen); }
        return aesAuthen;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        // 不是HTTP请求,则不进行后续的处理
        if (!(servletRequest instanceof HttpServletRequest)) { return; }
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        try {
            // 解析认证规则
            AESAuthen aesAuthen = getAESAuthen(request);
            // 封装请求的基本参数,并解密请求数据
            AESHttpServletRequestWrapper requestWrapper = new AESHttpServletRequestWrapper(aesAuthen, request);
            AESHttpServletResponseWrapper responseWrapper = new AESHttpServletResponseWrapper(requestWrapper, response);
            chain.doFilter(requestWrapper, responseWrapper);
        } catch (Exception e) {
            ServletOutputStream os = null;
            try {
                boolean authenticatedException = e instanceof AuthorizationException || e.getCause() instanceof AuthorizationException;
                String outData = JSONUtil.toJSONStringWithMApp(new JSONResult().setMessage(authenticatedException ? "请求未授权" : "请求异常"));
                if (authenticatedException) {
                    // 用于当客户端会话失效后重新生成新的会话.不可删除,否则APP会话失效后无法要求客户重新登录
                    // 在WEB系统中,request.getSession();和SecurityUtils.getSubject().getSession();等效
                    request.getSession();
                    logger.error("异常信息.[{}] 响应信息:[{}]", e.getLocalizedMessage(), outData);
                } else {
                    logger.error(String.format("请求异常.响应信息:[%s]", outData), e);
                }
                servletResponse.reset();
                os = servletResponse.getOutputStream();
                String method = request.getMethod();
                String responseData = "GET".equalsIgnoreCase(method) ? outData : AES.instance.encrypt(outData, AESHttpServletRequestWrapper.SECRET_KEY);
                IOUtils.write(responseData, os, servletRequest.getCharacterEncoding());
                String userAgent = HttpUtils.getUserAgent(request);
                Object[] argArray = {HttpUtils.getRequestFullIp(request), method, request.getRequestURI(), outData, userAgent};
                if (isInfoEnabled) { logger.info("请求异常.请求来源:[{}] 请求接口:[{}:{}] 响应信息:[{}] User-Agent:[{}]", argArray); }
            } finally {
                IOUtils.closeQuietly(os);
            }
        }
    }

    @Override
    public void destroy() {

    }
}