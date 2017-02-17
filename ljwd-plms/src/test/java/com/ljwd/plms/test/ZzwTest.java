package com.ljwd.plms.test;

import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.service.jms.inf.JmsSendService;
import com.ljwd.plms.web.service.case_collection.inf.LnCntrctService;
import com.ljwd.plms.web.service.job.inf.MfbmsOverDueJobService;
import com.ljwd.plms.web.service.job.inf.OutsrcJobService;
import com.ljwd.plms.web.service.job.inf.PlmsDoOverdueDataService;
import com.ljwd.plms.web.service.sys_management.inf.SysUserService;
import com.ljwd.plms.web.thread.OutsrcMsgThread;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.exception.ErrorInfoException_Exception;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;

import javax.annotation.Resource;
import javax.jms.Destination;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by zhengzw on 2016/6/2
 */
public class ZzwTest extends TestSupport {
    @Resource
    private SysUserService sysUserService;
    @Resource
    private OutsrcJobService outsrcJobService;
    @Resource
    private LnCntrctService lnCntrctService;

    @Test
    public void test_000(){
        System.out.println("*****************");
        BigDecimal bigDecimal = new BigDecimal(0.00000);
        System.out.println("*****************" + BigDecimal.ZERO.equals(bigDecimal));
    }

    @Test
    public void test_111(){
        System.out.println("********************" + System.getProperty("line.separator"));
//        jobService.doMfbmsOverDueCust();
        System.out.println("********************" + UUID.randomUUID().toString());
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
    }

    @Test
    public void test_222(){
        BigDecimal bigDecimal = BigDecimal.valueOf(2000).divide(BigDecimal.valueOf(2));
//        System.out.println("********************" + PasswordHelper.PasswordEncode("abcd1234", ("" + "谢燕妮".hashCode())));
        System.out.println("********************" + bigDecimal);
        System.out.println("********************" + bigDecimal);
        System.out.println("********************" + bigDecimal);
        System.out.println("********************" + bigDecimal);
    }

    @Test
    public void test_333(){
        System.out.println("********************");
        System.out.println(PasswordHelper.PasswordEncode("abcd1234", ("" + "廖艳".hashCode())));
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
        System.out.println("********************");
    }

    @Test
    public void test_444(){
//        jobService.doMfbmsOverDueCust();
        System.out.println("**********************");
    }

    @Test
    public void test_555() throws ErrorInfoException_Exception, com.ljwd.plms.web.wsdl.webservice.service.ErrorInfoException_Exception {
        System.out.println("********************");
//        String str = HttpUtils.sendHttpGet("http://192.168.10.251/SmartWS.php?Act=Call_Originate&retType=json&Dest=913828140299&Ext=8346&Area=0755");
//        String str = HttpUtils.sendHttpGet("http://192.168.10.251/SmartWS.php?Act=Info_Extension_States&Extention=8346");
        System.out.println(JSONUtil.toJSONString(LoanServiceWSDL.getService().getAllCollector()));
        System.out.println("********************");
    }

    @Test
    public void test_666() throws ErrorInfoException_Exception, com.ljwd.plms.web.wsdl.webservice.service.ErrorInfoException_Exception {
        System.out.println("********************");
//        String str = HttpUtils.sendHttpGet("http://192.168.10.251/SmartWS.php?Act=Call_Originate&retType=json&Dest=913828140299&Ext=8346&Area=0755");
//        String str = HttpUtils.sendHttpGet("http://192.168.10.251/SmartWS.php?Act=Info_Extension_States&Extention=8346");
        System.out.println(JSONUtil.toJSONString(LoanServiceWSDL.getService().getAllCollector()));
        System.out.println("********************");
    }

}
