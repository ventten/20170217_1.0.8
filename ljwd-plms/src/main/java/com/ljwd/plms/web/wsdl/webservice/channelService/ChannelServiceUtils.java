package com.ljwd.plms.web.wsdl.webservice.channelService;

import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.EncryptUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 调用WSDLService
 * @author linjun on 2016-05-25
 */
public class ChannelServiceUtils {
	private static Logger logger = LoggerFactory.getLogger(ChannelServiceUtils.class);

	/** 这个变量是做同步用的 */
	private static Object synchronizedObject = new Object();

	/** 私有构造函数,禁止实例化该类 */
	private ChannelServiceUtils() {

	}

	/**
	 * 获取微贷服务
	 * @return 返回连接代理
	 */
	public static ChannelService getService(String name,String pwd) {
        synchronized (synchronizedObject) {
            //创建连接
            ChannelService service = createService();
            //设置掉线重连代理处理器
            ReLoginInvocationHandler handler = new ReLoginInvocationHandler(service,name,pwd);
            return bindHandler(service, handler,name,pwd);
        }
	}

    /**
     * 创建原始的微贷连接
     * @return 返回微贷连接对象
     */
    private static ChannelService createService(){
        ChannelService service = null;
        String url = ConfigUtil.getStringVal("interface.config.mfbms.app.web.url");
        try {
            service = new ChannelServiceService(new URL(url)).getChannelServicePort();
        } catch (MalformedURLException e) {
            if(logger.isErrorEnabled()) logger.error("错误的微贷接口地址:" + url, e);
        }
        Client proxy = ClientProxy.getClient(service);
        HTTPConduit conduit = (HTTPConduit)proxy.getConduit();
        HTTPClientPolicy policy = new HTTPClientPolicy();
        long time = 1000L * 60 * 20;
        policy.setConnectionTimeout(time);
        policy.setReceiveTimeout(time);
        conduit.setClient(policy);
        ((BindingProvider) service).getRequestContext().put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
        return service;
    }

	/**
	 * 设置动态代理
	 * @param service 原始被代理对象
	 * @param handler 业务处理器
	 * @return 返回代理对象
	 */
	private static ChannelService bindHandler(ChannelService service, InvocationHandler handler,String name,String pwd) {
		synchronized (synchronizedObject) {
            //登录微贷系统
            login(service,name,pwd);
			//设置掉线重连代理,并返回代理对象
			service = (ChannelService) Proxy.newProxyInstance(ChannelService.class.getClassLoader(), new Class<?>[]{ChannelService.class}, handler);
		}
		return service;
	}

	/**
	 * 登录微贷服务
	 * @param service 原始WEBServer服务
	 */
    private static void login(ChannelService service,String name,String pwd) {
		try {
            String encryption = ConfigUtil.getStringVal("interface.config.mfbms.app.web.encryption");
			//登录微贷系统
			service.login(EncryptUtils.xorEncryptString(pwd, encryption), name);
		} catch (Exception e) {
			if (logger.isErrorEnabled()) logger.error(e.getLocalizedMessage(), e);
		}
	}

	/**
	 * 微贷掉线重连处理器
	 * @author linjun on 2016-01-04 0004.
	 */
	static class ReLoginInvocationHandler implements InvocationHandler {
		/** 被代理的原始对象 */
		private ChannelService target;
		private String name;
		private String pwd;

		public ReLoginInvocationHandler(ChannelService target,String name,String pwd) {
			this.target = target;
            this.name = name;
            this.pwd = pwd;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			try {
				return method.invoke(target, args);
			} catch (Exception e) {
				if (logger.isInfoEnabled()) logger.info("微贷系统重连:" + e.getLocalizedMessage());
				//出现异常的时候重新连接微贷系统并再次执行本次业务请求
				synchronized (synchronizedObject) {
					target = ChannelServiceUtils.createService();
					ChannelServiceUtils.bindHandler(target, this, name, pwd);
					return method.invoke(target, args);
				}
			}
		}
	}

}