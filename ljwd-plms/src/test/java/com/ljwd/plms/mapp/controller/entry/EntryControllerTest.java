package com.ljwd.plms.mapp.controller.entry;

import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tangjialin on 2016-10-19 0019.
 */
public class EntryControllerTest extends AbstractControllerTest {
    @Test
    public void login() throws Exception {
        String url = "/entry/login";
        Map<String, String> data = new HashMap<>();
        data.put("account", "4012");
        data.put("password", "abcd1234");
        String sendPost = autoSend(url, data);
    }

    @Test
    public void logout() throws Exception {
        String url = "/entry/logout";
        String sendPost = autoSend(url, null);
    }

}