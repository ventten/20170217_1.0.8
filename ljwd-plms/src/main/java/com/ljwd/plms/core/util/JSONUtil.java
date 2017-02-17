package com.ljwd.plms.core.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * JSON工具类
 */
public class JSONUtil {
    private JSONUtil() {
    }

    private static final Logger logger = LoggerFactory.getLogger(JSONUtil.class);
    private static final ObjectMapper objectMapper = new ObjectMapper().setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
    /**
     * 序列化对象为JSON字符串,并格式化日期为yyyy-MM-dd HH:mm:ss
     * @param o 需要序列化的对象
     * @return json字符串
     */
    public static String toJSONString(Object o) {
        return JSON.toJSONString(o, SerializerFeature.WriteDateUseDateFormat);
    }

    /**
     * 序列化对象为JSON字符串
     * 格式化日期为yyyy-MM-dd并包含null值
     * @param o 需要序列化的对象
     * @return json字符串
     */
    public static String toJSONStringWithDateFormat(Object o) {
        return JSON.toJSONStringWithDateFormat(o, "yyyy-MM-dd", SerializerFeature.WriteMapNullValue);
    }

    /**
     * 序列化对象为JSON字符串
     * 格式化日期为yyyy-MM-dd并包含null值
     * @param o 需要序列化的对象
     * @return json字符串
     */
    public static String toJSONStringWithMApp(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            logger.error("toJSONStringWithMApp异常", e);
            return null;
        }
    }

    /**
     * 解析JSON字符串为JSONObject对象
     * <pre>
     *     处理所有异常,恒返回一个JSONObject实例
     * </pre>
     * @param text 需要解析的JSON字符串
     * @return JSONObject对象
     */
    public static JSONObject parseObject(String text) {
        JSONObject jsonObject = null;
        try {
            jsonObject = JSON.parseObject(text);
        } catch (Exception e) {
            logger.error("JSON数据解析异常", e);
        }
        jsonObject = jsonObject == null ? new JSONObject() : jsonObject;
        return jsonObject;
    }

    /**
     * 解析JSON字符串为JAVA对象
     * <pre>
     *     处理JSON解析异常,恒返回一个JAVA实例
     *     当类无法实例化时,返回null
     * </pre>
     * @param text  需要解析的JSON字符串
     * @param clazz 解析后的JAVA类型
     * @return 返回JAVA对象, 当JAVA类无法实例化则返回null
     */
    public static <T> T parseObject(String text, Class<T> clazz) {
        T object = null;
        try {
            object = JSON.parseObject(text, clazz);
        } catch (Exception e) {
            logger.error("JSON数据解析异常", e);
        }
        if (object != null) { return object; }
        try {
            object = clazz.newInstance();
        } catch (InstantiationException e) {
            logger.error(String.format("类无法实例化:%s", clazz.getName()), e);
        } catch (IllegalAccessException e) {
            logger.error(String.format("构造函数权限异常:%s", clazz.getName()), e);
        }
        return object;
    }

    /**
     * 解析JSON字符串为JSONArray对象
     * <pre>
     *     处理JSON解析异常,恒返回一个JSONArray实例
     * </pre>
     * @param text 需要解析的JSON字符串
     * @return 返回JSONArray对象
     */
    public static JSONArray parseArray(String text) {
        JSONArray jsonArray = null;
        try {
            jsonArray = JSON.parseArray(text);
        } catch (Exception e) {
            logger.error("JSON数据解析异常", e);
        }
        jsonArray = jsonArray == null ? new JSONArray() : jsonArray;
        return jsonArray;
    }


    /**
     * 解析JSON字符串为JAVA对象
     * <pre>
     *     处理JSON解析异常,恒返回一个JAVA实例
     *     当类无法实例化时,返回null
     * </pre>
     * @param text  需要序列化的对象
     * @param clazz 解析后的集合泛型JAVA类型
     * @return 返回JAVA对象, 当JAVA类无法实例化则返回null
     */
    public static <T> List<T> parseArray(String text, Class<T> clazz) {
        List<T> list = null;
        try {
            list = JSON.parseArray(text, clazz);
        } catch (Exception e) {
            logger.error("JSON数据解析异常", e);
        }
        list = list == null ? new ArrayList<T>(0) : list;
        return list;
    }
}
