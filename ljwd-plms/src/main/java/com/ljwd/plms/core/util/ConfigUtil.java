package com.ljwd.plms.core.util;

import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * Created by zhengzw on 2016/6/29
 * 参数工具类
 */
public class ConfigUtil {

    private static PropertiesConfiguration config = null;

    static{
        try{
            config = new PropertiesConfiguration();
            config.setEncoding("UTF-8");
            config.load("config.properties");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据key获取value
     * @param key 键值
     * @return value
     * */
    public static String getStringVal(String key){
        if(key == null || "".equals(key)){
            return null;
        }
        return config.getString(key);
    }

}
