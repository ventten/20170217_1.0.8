package com.ljwd.plms.web.controller.sys_management;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.service.sys_management.inf.SystemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by zhengzw on 2016/11/26
 * 系统配置控制器
 **/
@Controller
@RequestMapping(value = "/system")
public class SystemController {

    @Resource
    private SystemService systemService;

    /**
     * 查找下一个工作日
     */
    @RequestMapping("/getNextWorkDay")
    @ResponseBody
    public String getNextWorkDay() {
        Date nextWorkDay = systemService.selectNextWorkDay();
        return D.parse(nextWorkDay);
    }

}
