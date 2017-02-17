package com.ljwd.plms.mapp.controller.map;

import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import com.ljwd.plms.mapp.utils.AES;
import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-10-14 0014.
 */
public class MapPointControllerTest extends AbstractControllerTest {

    @Test
    public void upload() throws Exception {
        String url = "/map/upload";
        url = packageUrl(url, "");

        Map<String, String> data = new HashMap<>();
        data.put("json", null);

        // 上传文件组装
        Map<String, File> fileMap = new HashMap<>();
        String fileName = new SimpleDateFormat("测试-yyyyMMddHHmmss").format(new Date()) + ".txt";
        fileMap.put(fileName, new File(this.getClass().getClassLoader().getResource("point.json").getPath()));

        HttpUtils.HttpResult httpResult = HttpUtils.formUpload(url, fileMap, data, sessionId);
        logger.info("响应原始数据:[{}]", JSONUtil.toJSONString(httpResult));
        String response = AES.instance.decrypt(httpResult.getContext(), secretKey);
        logger.info("响应数据解密:[{}]", response);
    }

}