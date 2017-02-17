package com.ljwd.plms.core.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by zhengzw on 2016/7/1
 * spring上下文
 */
public class AppContext implements ApplicationContextAware {

    private static ApplicationContext context = null;

    public static Object getBean(String beanName) {
        return context.getBean(beanName);
    }

    public static Object getBean(Class aClass) {
        return context.getBean(aClass);
    }

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

}
