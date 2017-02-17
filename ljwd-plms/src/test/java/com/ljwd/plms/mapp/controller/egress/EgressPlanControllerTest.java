package com.ljwd.plms.mapp.controller.egress;

import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-11-01 0001.
 */
public class EgressPlanControllerTest extends AbstractControllerTest {
    /**
     * 外访计划列表-协催
     * @throws Exception
     */
    @Test
    public void urgingList() throws Exception {
        String url = "/egressPlan/urging";
        Map<String, String> data = new HashMap<>();
        data.put("date", "2016-10-19");
        String sendPost = autoSend(url, data);
    }

    /**
     * 外访计划列表-考查
     * @throws Exception
     */
    @Test
    public void examineList() throws Exception {
        String url = "/egressPlan/examine";
        Map<String, String> data = new HashMap<>();
        data.put("date", "2016-10-19");
        String sendPost = autoSend(url, data);
    }

    /**
     * 外访计划结果提交
     * @throws Exception
     */
    @Test
    public void submitResult() throws Exception {
        String url = "/egressPlan/submitResult";
        // 上传参数组装
        Map<String, String> jsonMap = new HashMap<>();
        jsonMap.put("planId", "1");
        jsonMap.put("visitType", "1");
        jsonMap.put("ovtResultDetail", "测试外访详情201612091718");
        jsonMap.put("lng", "114.397428");
        jsonMap.put("lat", "22.90923");
        autoSend(url, jsonMap);
    }
//
//    /**
//     * 外访计划结果提交
//     * @throws Exception
//     */
//    @Test
//    public void submitResult() throws Exception {
//        String url = "/egressPlan/submitResult";
//        url = packageUrl(url, "");
//        // 上传参数组装
//        Map<String, String> jsonMap = new HashMap<>();
//        jsonMap.put("planId", "23");
//        jsonMap.put("visitType", "1");
//        jsonMap.put("ovtResultDetail", "测试外访详情");
//        String json = JSONUtil.toJSONString(jsonMap);
//        json = AES.instance.encrypt(json, secretKey);
//
//        Map<String, String> data = new HashMap<>();
//        data.put("json", json);
//
//        // 上传文件组装
//        Map<String, File> fileMap = new HashMap<>();
//        String fileName = new SimpleDateFormat("测试-yyyyMMddHHmmss").format(new Date()) + ".txt";
//        fileMap.put(fileName, new File(this.getClass().getClassLoader().getResource("point.json").getPath()));
//
//        HttpUtils.HttpResult httpResult = HttpUtils.formUpload(url, fileMap, data, sessionId);
//        logger.info("响应原始数据:[{}]", JSONUtil.toJSONString(httpResult));
//        String response = AES.instance.decrypt(httpResult.getContext(), secretKey);
//        logger.info("响应数据解密:[{}]", response);
//    }

    /**
     * 外访计划历史列表
     * @throws Exception
     */
    @Test
    public void historyList() throws Exception {
        String url = "/egressPlan/history";
        Map<String, String> data = new HashMap<>();
        data.put("pageNo", "1");
        String sendPost = autoSend(url, data);
    }

}