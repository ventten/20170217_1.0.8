package com.ljwd.plms.mapp.controller.egress;

import com.ljwd.plms.mapp.controller.AbstractControllerTest;
import org.junit.Test;

/**
 * Created by tangjialin on 2016-11-16 0016.
 */
public class UserControllerTest extends AbstractControllerTest {
    @Test
    public void baseInfo() throws Exception {
        String url = "/user/base";
        String sendPost = autoSend(url, null);
    }

    @Test
    public void mobile() throws Exception {
        String url = "/user/mobile";
        String sendPost = autoSend(url, null);
    }

}