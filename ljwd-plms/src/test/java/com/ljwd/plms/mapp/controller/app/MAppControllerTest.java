package com.ljwd.plms.mapp.controller.app;

import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-08-31 0031.
 */
public class MAppControllerTest extends AbstractControllerTest {
    protected String baseUrl = "http://127.0.0.1:8083/mapp";

    @Test
    public void checkClientVersion() {
        String url = "/app/checkClientVersion";
        Map<String, String> data = new HashMap<>();
        data.put("clientVersion", "1.0.0");
        String sendPost = send(baseUrl + url, JSONUtil.toJSONString(data), sessionId);
    }

    @Test
    public void test() {
        String url = "/app/test";
        autoSend(url, "哈哈哈test");
    }

    @Test
    public void write() {
        String url = "/app/write";
        autoSend(url, "哈哈哈write");
    }

    @Test
    public void json() {
        String url = "/app/json";
        autoSend(url, "哈哈哈json");
    }

    @Test
    public void encrypt() {
        String url = "/app/encrypt";
        autoSend(url, "哈哈哈encrypt");
    }

    @Test
    public void queryAppInterface() {
        String url = baseUrl + "/app/queryAppInterface?version=1.1.3";
        HttpUtils.HttpResult httpResult = null;
        try {
            httpResult = HttpUtils.sendPost(url, null, sessionId);
        } catch (Exception e) {
            logger.error("接口地址请求异常", e);
        }
        logger.info("响应原始数据:[{}]", JSONUtil.toJSONString(httpResult));
    }

    @Test
    public void checkVersion() {
        String url = baseUrl + "/app/checkVersion";
        HttpUtils.HttpResult httpResult = null;
        try {
            httpResult = HttpUtils.sendPost(url, null, sessionId);
        } catch (Exception e) {
            logger.error("banner请求异常", e);
        }
        logger.info("响应原始数据:[{}]", JSONUtil.toJSONString(httpResult));
    }

}
