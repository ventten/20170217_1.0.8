package com.ljwd.plms.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhengzw on 2016/6/23
 * 日期工具类
 */
public class D {

    public static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final String PATTERN_HOUR = "yyyy-MM-dd HH";
    public static final String PATTERN_MINUTE = "yyyy-MM-dd HH:mm";
    public static final String PATTERN_SECONDS = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String CHINA_DATE_PATTEN = "yyyy年MM月dd日";
    /**
     * 字符串转日期
     * @param dateStr 字符串格式的日期
     * */
    public static Date toDate(String dateStr){
        Date date = null;
        if(dateStr == null || "".equals(dateStr.trim())){
            return date;
        }
        try {
            date = new SimpleDateFormat(PATTERN_DATE).parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 字符串转日期
     * @param dateStr 字符串格式的日期
     * @param pattern 格式
     * */
    public static Date toDate(String dateStr,String pattern){
        Date date = null;
        if(dateStr == null || "".equals(dateStr.trim())){
            return date;
        }
        if(pattern == null || "".equals(pattern.trim())){
            pattern = PATTERN_DATE;
        }
        try {
            date = new SimpleDateFormat(pattern).parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 日期转字符串
     * @param date 日期
     * */
    public static String parse(Date date){
        if(date == null){
            return "";
        }
        return new SimpleDateFormat(PATTERN_DATE).format(date);
    }

    /**
     * 日期转字符串
     * @param date 日期
     * @param pattern 格式
     * */
    public static String parse(Date date,String pattern){
        if(date == null){
            return "";
        }
        if(pattern == null || "".equals(pattern.trim())){
            pattern = PATTERN_DATE;
        }
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 获取当天0时0分0秒0毫秒
     * */
    public static Calendar getSystemCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar;
    }

    /**
     * 截取到0时0分0秒
     * */
    public static Date trunc(Date date){
        if(date == null){
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    /**
     * 日期转字符串
     * @param date 日期
     * */
    public static String parseTo(Date date){
        if(date == null){
            return "";
        }
        return new SimpleDateFormat(DEFAULT_DATETIME_PATTERN).format(date);
    }

}
