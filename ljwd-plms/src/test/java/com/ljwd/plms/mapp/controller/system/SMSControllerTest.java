package com.ljwd.plms.mapp.controller.system;

import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-11-17 0017.
 */
public class SMSControllerTest extends AbstractControllerTest {
    @Test
    public void sendVerifyCode() throws Exception {
        String url = "/sms/sendVerifyCode";
        Map<String, String> data = new HashMap<>();
        data.put("type", "ASSOCIATION");
//        data.put("type", "DISASSOCIATION");
        data.put("mobile", "18578410010");
        String sendPost = autoSend(url, data);
    }

}