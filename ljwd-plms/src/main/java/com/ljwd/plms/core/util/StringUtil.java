package com.ljwd.plms.core.util;

import java.util.regex.Pattern;

/**
 * Created by zhengzw on 2016/9/2
 * 字符串工具类
 */
public class StringUtil {

    //正则表达式：验证手机号
    public static final String REGEX_MOBILE = "^1[3|4|5|7|8][0-9]\\d{8}$";
//    public static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
    //正则表达式：验证邮箱
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    //正则表达式：验证固话
    public static final String REGEX_TEL = "^\\d{3,4}-\\d{7,8}$";
//    //正则表达式：验证用户名
//    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";
//    //正则表达式：验证密码
//    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";
//    //正则表达式：验证汉字
//    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
//    //正则表达式：验证身份证
//    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
//    //正则表达式：验证URL
//    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
//    //正则表达式：验证IP地址
//    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    /**
     * 判断字符串是否为null或空字符串
     * @param str 字符串
     * @return boolean
     * */
    public static boolean isEmpty(String str){
        return (str == null || "".equals(str.trim()));
    }

    /**
     * 判断字符串是否为手机号
     * @param str 字符串
     * @return boolean
     * */
    public static boolean isMobile(String str){
        if(isEmpty(str)) return false;
        return Pattern.matches(REGEX_MOBILE, str.trim());
    }

    /**
     * 判断字符串是否为固话
     * @param str 字符串
     * @return boolean
     * */
    public static boolean isTel(String str){
        if(isEmpty(str)) return false;
        return Pattern.matches(REGEX_TEL, str.trim());
    }

    /**
     * 判断字符串是否为Email
     * @param str 字符串
     * @return boolean
     * */
    public static boolean isEmail(String str){
        if(isEmpty(str)) return false;
        return Pattern.matches(REGEX_EMAIL, str.trim());
    }

}
