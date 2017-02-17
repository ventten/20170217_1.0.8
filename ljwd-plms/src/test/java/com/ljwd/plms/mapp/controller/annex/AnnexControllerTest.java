package com.ljwd.plms.mapp.controller.annex;

import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import com.ljwd.plms.mapp.utils.AES;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-11-10 0010.
 */
public class AnnexControllerTest extends AbstractControllerTest {
    @Test
    public void upload() throws Exception {
        String url = "/annex/upload";
        url = packageUrl(url, "");

        // 上传参数组装
        Map<String, String> jsonMap = new HashMap<>();
        jsonMap.put("planId", "23");
        jsonMap.put("topic", "测试文件");
        jsonMap.put("fileType", "IMG");
        String json = JSONUtil.toJSONString(jsonMap);
        json = AES.instance.encrypt(json, secretKey);

        Map<String, String> data = new HashMap<>();
        data.put("json", json);

        // 上传文件组装
        Map<String, File> fileMap = new HashMap<>();
        String fileName = new SimpleDateFormat("测试-yyyyMMddHHmmss").format(new Date()) + ".txt";
        fileMap.put(fileName, new File(this.getClass().getClassLoader().getResource("point.json").getPath()));

        HttpUtils.HttpResult httpResult = HttpUtils.formUpload(url, fileMap, data, sessionId);
        logger.info("响应原始数据:[{}]", JSONUtil.toJSONString(httpResult));
        String response = AES.instance.decrypt(httpResult.getContext(), secretKey);
        logger.info("响应数据解密:[{}]", response);
    }

    @Test
    public void download() throws Exception {
        String url = "/annex/download";
        Map<String, String> data = new HashMap<>();
//        data.put("id", "661042");
        data.put("id", "66104");
        String reqData = AES.instance.encrypt(JSONUtil.toJSONString(data), secretKey);
        url = packageUrl(url, reqData);
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            connection = HttpUtils.connect(url, reqData, true, HttpUtils.TIME_OUT, sessionId);
            is = connection.getInputStream();
            String headerField = connection.getHeaderField("Content-Disposition");
            if (headerField == null) {
                logger.info(IOUtils.toString(is));
                return;
            }
            String fileName = headerField.substring(headerField.indexOf("=") + 1);
            fileName = URLDecoder.decode(fileName, "UTF-8");
            logger.info("文件名称:{}", fileName);
            URL resource = this.getClass().getClassLoader().getResource("");
            File outFile = new File(resource.getPath() + "/download", fileName);
            logger.info("文件下载路径:{}", outFile);
            outFile.getParentFile().mkdirs();
            os = new FileOutputStream(outFile);
            IOUtils.copy(is, os);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage(), e);
        } finally {
            IOUtils.closeQuietly(is);
            IOUtils.closeQuietly(os);
            if (connection != null) { connection.disconnect(); }
        }
    }

    @Test
    public void imgList() throws Exception {
        String url = "/annex/image";
        Map<String, String> data = new HashMap<>();
        data.put("planId", "23");
        autoSend(url, data);
    }

    @Test
    public void recordList() throws Exception {
        String url = "/annex/record";
        Map<String, String> data = new HashMap<>();
        data.put("planId", "23");
        autoSend(url, data);
    }

    @Test
    public void update() throws Exception {
        String url = "/annex/update";
        Map<String, String> data = new HashMap<>();
        data.put("id", "66104");
        data.put("topic", "测试文件-文件名");
        data.put("remark", "测试文件-备注");
        autoSend(url, data);
    }

    @Test
    public void delete() throws Exception {
        String url = "/annex/delete";
        Map<String, String> data = new HashMap<>();
        data.put("id", "66104");
        autoSend(url, data);
    }

}