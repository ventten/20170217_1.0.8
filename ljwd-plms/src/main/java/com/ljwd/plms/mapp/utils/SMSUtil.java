package com.ljwd.plms.mapp.utils;

import com.ljwd.plms.core.util.HttpUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.Random;

import static com.ljwd.plms.mapp.utils.SMSUtil.SMSChannel.ExmayCMS;
import static com.ljwd.plms.mapp.utils.SMSUtil.SMSChannel.Monternet;

/**
 * 短信接口，对短信接口地址进行拼接，提供公用
 * @author Administrator
 */
public class SMSUtil {
    /** 关联手机号码时,验证码临时存放KEY */
    public static final String VERIFY_CODE_ASSOCIATION_KEY = "SMS_VERIFY_CODE_ASSOCIATION";
    /** 取消关联手机号码时,验证码临时存放KEY */
    public static final String VERIFY_CODE_DISASSOCIATION_KEY = "SMS_VERIFY_CODE_DISASSOCIATION";
    /** 验证码生成时间戳临时存放KEY */
    public static final String VERIFY_CODE_SEND_TIME_KEY = "SMS_VERIFY_CODE_SEND_TIME";
    /** 验证码发送手机号临时存放KEY */
    public static final String VERIFY_CODE_MOBILE_KEY = "SMS_VERIFY_CODE_MOBILE";
    /** 短信发送渠道临时存放KEY */
    public static final String SEND_CHANNEL_KEY = "SMS_SEND_CHANNEL";

    public enum SMSChannel {
        Monternet("移动梦网", "PRO001", "PRO001", "http://58.251.24.65:7082/MWGate/wmgw.asmx/MongateCsSpSendSmsNew"),
        ExmayCMS("亿美平台", "9SDK-EMY-0999-JEVUM", "011716", "http://sdk999ws.eucp.b2m.cn:8080/sdkproxy/sendtimesms.action");
        private String name;
        private String account;
        private String password;
        private String url;

        SMSChannel(String name, String account, String password, String url) {
            this.name = name;
            this.account = account;
            this.password = password;
            this.url = url;
        }

    }

    public static Logger logger = LoggerFactory.getLogger(SMSUtil.class);

    /**
     * 发送短信接口地址
     * 宽带通讯 http://kltx.sms10000.com.cn/sdk/SMS?cmd=send&uid=用户&psw=密码&mobiles=电话&msgid=10002&msg=test
     * 移动梦网http://58.251.24.65:7082/MWGate/wmgw.asmx/MongateCsSpSendSmsNew
     * 亿美平台 http://sdk999ws.eucp.b2m.cn:8080/sdkproxy/sendtimesms.action?cdkey=序列号&password=密码&phone=电话1,电话2&message=即时短信测试内容&addserial="分机号"
     * @param content 内容
     * @param phones  电话号码，多个用；隔开
     * @param channel 发送通道.详见{@link SMSChannel}
     * @return true:发送成功;false:发送失败
     * @throws Exception
     */
    public static boolean sendSms(String content, String phones, SMSChannel channel) {
        if (channel == null) { return false; }
        if (phones == null || phones.isEmpty()) { return false; }
        if (content == null || content.isEmpty()) { return false; }
        try {
            if (logger.isInfoEnabled()) { logger.info("发送短信,通道:{}, 短信内容:{}", channel.name, content); }
            StringBuffer buffer = new StringBuffer();
            if (Monternet == channel) {
                // add by chenglei 20140520
                content = URLEncoder.encode(content, "UTF-8");
                buffer.append(channel.url);
                buffer.append("?userId=").append(channel.account);
                buffer.append("&password=").append(channel.password);
                buffer.append("&pszMobis=").append(phones);
                buffer.append("&pszMsg=").append(content);
                buffer.append("&iMobiCount=1&pszSubPort=*");
            } else if (ExmayCMS == channel) {
                content = URLEncoder.encode(content, "UTF-8");
                buffer.append(channel.url);
                buffer.append("?cdkey=").append(channel.account);
                buffer.append("&password=").append(channel.password);
                buffer.append("&phone=").append(phones);
                buffer.append("&message=").append(content);
                buffer.append("&addserialt=");
                buffer.append("&seqid=");
            } else {
                return false;
            }

            String reqUrl = buffer.toString();
            if (logger.isInfoEnabled()) { logger.info("发送短信,通道:{}, 请求参数:{}", channel.name, reqUrl); }
            String responseXmlText = HttpUtils.sendGet(reqUrl);
            if (logger.isInfoEnabled()) { logger.info("发送短信,通道:{}, 响应信息:{}", channel.name, responseXmlText); }
            responseXmlText = responseXmlText.trim(); // 去掉<?xml version="1.0" encoding="UTF-8"?>前面的空格和换行.否则导致异常:org.xml.sax.SAXParseException; lineNumber:不允许有匹配 "[xX][mM][lL]" 的处理指令目标。
            ByteArrayInputStream is = new ByteArrayInputStream(responseXmlText.getBytes());
            SAXReader reader = new SAXReader();
            Document rootDocument = reader.read(is);
            is.close();
            Element rootElement = rootDocument.getRootElement();
            // 移动梦网 发送平台  返回状态处理
            if (Monternet == channel) {
                String res = rootElement.getTextTrim();
                if (res != null && !res.isEmpty()) {
                    if (res.length() > 10 && res.length() < 25) {
                        return true;
                    } else if (res.equals("-1")) {
                        logger.error("短信发送失败，原因为参数为空");
                    } else if (res.equals("-2")) {
                        logger.error("短信发送失败，原因为电话号码个数超过100");
                    } else if (res.equals("-10")) {
                        logger.error("短信发送失败，原因为申请缓存空间失败");
                    } else if (res.equals("-11")) {
                        logger.error("短信发送失败，原因为电话号码中有非数字字符");
                    } else if (res.equals("-12")) {
                        logger.error("短信发送失败，原因为有异常电话号码");
                    } else if (res.equals("-13")) {
                        logger.error("短信发送失败，原因为电话号码个数与实际个数不相等");
                    } else if (res.equals("-14")) {
                        logger.error("短信发送失败，原因为实际号码个数超过100");
                    } else if (res.equals("-101")) {
                        logger.error("短信发送失败，原因为发送消息等待超时");
                    } else if (res.equals("-102")) {
                        logger.error("短信发送失败，原因为发送或接收消息失败");
                    } else if (res.equals("-103")) {
                        logger.error("短信发送失败，原因为接收消息超时");
                    } else if (res.equals("-200")) {
                        logger.error("短信发送失败，原因为其他错误");
                    } else if (res.equals("-999")) {
                        logger.error("短信发送失败，原因为web服务器内部错误");
                    } else {
                        logger.error("短信发送失败.返回的结果码是：" + res);
                    }
                    return false;
                } else {
                    logger.error("无结果返回，系统默认成功");
                    return true;
                }
                //亿美发送平台  返回状态处理
            } else if (ExmayCMS == channel) {
                String message = rootElement.elementTextTrim("message"); // 得到状态的描述信息
                String error = rootElement.elementTextTrim("error");     // 得到状态值
                //根据状态值判断
                if ("0".equals(error)) {
                    if (logger.isInfoEnabled()) {
                        logger.info("发送状态值为：{}  返回状态描述信息：{}", error, message == null || message.isEmpty() ? "发送成功" : message);
                    }
                    return true;
                } else if ("1".equals(error)) {
                    if (logger.isInfoEnabled()) {
                        logger.info("发送状态值为：{}  返回状态描述信息：{}", error, message == null || message.isEmpty() ? "发送失败" : message);
                    }
                    return false;
                } else {
                    if (logger.isInfoEnabled()) {
                        logger.info("发送状态值为：{}  返回状态描述信息：{} 发送状态异常", error, message);
                    }
                    return false;
                }
            }
        } catch (Throwable e) {
            logger.error("短信响应信息解析异常", e);
        }
        return false;
    }

    /**
     * 发送手机验证码
     * @param phones  手机号码
     * @param channel 渠道
     * @return 发送成功返回发送的验证码, 发送失败返回null
     */
    public static String sendVerifyCode(String phones, SMSChannel channel) {
        String verifyCode = getRandomCode(6);
        String content = String.format("尊敬的联金微贷用户，您好！本次手机动态验证码为:%s。客服电话400-809-0040。", verifyCode);
        if (!sendSms(content, phones, channel)) { return null; }
        return verifyCode;
    }

    /**
     * 生成指定长度的纯数字字符串
     * @param len 指定生成的长度
     * @return 返回生成的字符串
     */
    public static String getRandomCode(int len) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int index = 0; index < len; index++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
//        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><string xmlns=\"http://tempuri.org/\">-5103290035049110171</string>";
        String xml = "\n\n\n<?xml version=\"1.0\" encoding=\"UTF-8\"?><response><error>0</error><message></message></response>\n";
        xml = xml.trim();

//        JDK API解析
//        ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes());
//        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//        Document root = builder.parse(is);
//        Element rootDocumentElement = root.getDocumentElement();
//        System.out.println(rootDocumentElement.getElementsByTagName("error").item(0).getTextContent());

//        DOM4J解析
        ByteArrayInputStream is = new ByteArrayInputStream(xml.getBytes());
        SAXReader reader = new SAXReader();
        Document rootDocument = reader.read(is);
        Element rootElement = rootDocument.getRootElement();

        System.out.println(rootElement.getName());
        System.out.println(rootElement.getTextTrim());
        System.out.println(rootElement.elementTextTrim("error"));
        System.out.println(rootElement.elementTextTrim("message"));
    }
}