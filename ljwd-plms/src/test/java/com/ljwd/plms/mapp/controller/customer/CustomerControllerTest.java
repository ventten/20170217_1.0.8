package com.ljwd.plms.mapp.controller.customer;

import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-11-04 0004.
 */
public class CustomerControllerTest extends AbstractControllerTest {
    @Test
    public void baseInfo() throws Exception {
        String url = "/customer/base";
        Map<String, String> data = new HashMap<>();
        data.put("id", "1479");
        String sendPost = autoSend(url, data);
    }

    @Test
    public void loan() throws Exception {
        String url = "/customer/loan";
        Map<String, String> data = new HashMap<>();
        data.put("id", "1304");
        String sendPost = autoSend(url, data);
    }

}