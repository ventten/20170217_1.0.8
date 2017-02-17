package com.ljwd.plms.web.service.jms.impl;

import com.ljwd.plms.core.util.AppContext;
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.JSONUtil;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.service.jms.inf.JmsSendService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcMsgService;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/23
 * JMS消息发送Service
 */
@Service
public class JmsSendServiceImpl implements JmsSendService {
    private static Logger logger = LoggerFactory.getLogger(JmsSendServiceImpl.class);
    private JmsTemplate jmsTemplate;
    private PlmsLaApplOutsrcMsgService plmsLaApplOutsrcMsgService;
    private static Destination destination;
    static {
        String queueDestination = null;
        try {
            PropertiesConfiguration config = new PropertiesConfiguration();
            config.setEncoding("UTF-8");
            config.load("application.properties");
            queueDestination = config.getString("jms.activeMq.queueDestination");
            logger.info("jms.activeMq.queueDestination=" + queueDestination);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
        destination = new ActiveMQQueue(queueDestination);
    }

    /**
     * 发送委外信息到ActiveMQ
     * @param msgList 委外信息
     */
    @Override
    public void sendOutsrcMessage(List<PlmsLaApplOutsrcMsg> msgList) {
        if(msgList != null && msgList.size() > 0){
            for(PlmsLaApplOutsrcMsg msg : msgList){
                try {
                    final String jsonMsg = JSONUtil.toJSONString(msg);
                    this.getJmsTemplate().send(destination, new MessageCreator() {
                        public Message createMessage(Session session) throws JMSException {
                            return session.createTextMessage(jsonMsg);
                        }
                    });
                }catch (Exception e){
                    e.printStackTrace();
                    logger.info(msg.getUuNo() + " 发送jms.activeMq失败:" + e.getMessage());
                    PlmsLaApplOutsrcMsg updateMsg = new PlmsLaApplOutsrcMsg();
                    updateMsg.setUuNo(msg.getUuNo());
                    updateMsg.setRecVer(msg.getRecVer());
                    updateMsg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND_FAIL);
                    this.getPlmsLaApplOutsrcMsgService().update(updateMsg);
                }
            }
        }
    }

    /**
     * 发送JMS消息
     * @param destination 实现类 ActiveMQQueue(点对点) 或 ActiveMQTopic(一对多)
     * @param message 消息内容
     * */
    @Override
    public boolean sendMessage(Destination destination,final String message) {
        logger.info("sendJMSMessage...Destination：" + destination + "，Message：" + message);
        try {
            if(jmsTemplate == null){
                jmsTemplate = (JmsTemplate)AppContext.getBean(JmsTemplate.class);
            }
            jmsTemplate.send(destination, new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage(message);
                }
            });
            logger.info("sendJMSMessage...成功");
            return true;
        }catch (Exception e){
            e.printStackTrace();
            logger.info("sendJMSMessage...失败");
            logger.error("sendJMSMessage..." + e.getMessage());
            return false;
        }
    }

    private JmsTemplate getJmsTemplate() {
        if(jmsTemplate == null){
            jmsTemplate = (JmsTemplate)AppContext.getBean(JmsTemplate.class);
        }
        return jmsTemplate;
    }

    private PlmsLaApplOutsrcMsgService getPlmsLaApplOutsrcMsgService() {
        if(plmsLaApplOutsrcMsgService == null){
            plmsLaApplOutsrcMsgService = (PlmsLaApplOutsrcMsgService)AppContext.getBean(PlmsLaApplOutsrcMsgService.class);
        }
        return plmsLaApplOutsrcMsgService;
    }
}
