package com.ljwd.plms.web.listener;

import com.ljwd.plms.core.util.ConfigUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/29
 * 系统启动监听器,可在项目启动时配置参数
 */
public class SysInitServletListener implements ServletContextListener {

    /**
     * 应用程序加载时调用
     * Receives notification that the web application initialization
     * process is starting.
     * <p>
     * <p>All ServletContextListeners are notified of context
     * initialization before any filters or servlets in the web
     * application are initialized.
     *
     * @param sce the ServletContextEvent containing the ServletContext
     *            that is being initialized
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        //以时间戳做为js和css文件的版本号
        context.setAttribute("jsOrCssFileVersion",new SimpleDateFormat("yyyyMMddHHmmssSSSS").format(new Date()));
        //高德地图JavaScript API Key
        String mapKeyUrl = ConfigUtil.getStringVal("interface.config.amap.api.js.url");
        context.setAttribute("mapKeyUrl",mapKeyUrl);
    }

    /**
     * 应用程序退出时调用
     * Receives notification that the ServletContext is about to be
     * shut down.
     * <p>
     * <p>All servlets and filters will have been destroyed before any
     * ServletContextListeners are notified of context
     * destruction.
     *
     * @param sce the ServletContextEvent containing the ServletContext
     *            that is being destroyed
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
