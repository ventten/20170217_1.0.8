package com.ljwd.plms.web.service.jms.inf;

import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;

import javax.jms.Destination;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/23
 * JMS消息发送Service
 */
public interface JmsSendService {

    /**
     * 发送委外信息到ActiveMQ
     * @param msgList 委外信息
     */
    void sendOutsrcMessage(List<PlmsLaApplOutsrcMsg> msgList);

    /**
     * 发送JMS消息
     * @param destination 实现类 ActiveMQQueue(点对点) 或 ActiveMQTopic(一对多)
     * @param message 消息内容
     * */
    boolean sendMessage(Destination destination,final String message);

}
