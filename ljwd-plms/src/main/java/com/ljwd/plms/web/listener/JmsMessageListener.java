package com.ljwd.plms.web.listener;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.*;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsgExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcMsgService;
import com.ljwd.plms.web.vo.outsource.OutsourceUpdateMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import javax.jms.*;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/23
 * JMS消息监听器
 */
public class JmsMessageListener implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static PlmsLaApplOutsrcMsgService plmsLaApplOutsrcMsgService;
    static {
        plmsLaApplOutsrcMsgService = ((PlmsLaApplOutsrcMsgService)AppContext.getBean(PlmsLaApplOutsrcMsgService.class));
    }

    @Override
    public void onMessage(Message message) {
        logger.info("监听到内容：" + message.toString());
        try {
            //ActiveMQQueue destination = (ActiveMQQueue)message.getJMSDestination();
            String textMsg = ((TextMessage) message).getText();
            if(!StringUtil.isEmail(textMsg)){
                PlmsLaApplOutsrcMsg msg = JSONUtil.parseObject(textMsg, PlmsLaApplOutsrcMsg.class);
                if(msg != null && msg.getApplId() != null && !StringUtil.isEmpty(msg.getUuNo())){
                    PlmsLaApplOutsrcMsgExample example = new PlmsLaApplOutsrcMsgExample();
                    example.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND_FAIL);
                    example.setApplId(msg.getApplId());
                    example.setOrderByClause("T.ID ASC");
                    List<PlmsLaApplOutsrcMsg> failMsgList = plmsLaApplOutsrcMsgService.selectByExample(example);
                    boolean result = true;  //执行结果
                    if(failMsgList != null && failMsgList.size() > 0){
                        for(PlmsLaApplOutsrcMsg failMsg : failMsgList){
                            result = this.pushOutsrcToMfbms(failMsg);
                            if(!result){
                                break;
                            }
                        }
                    }
                    if(result){
                        this.pushOutsrcToMfbms(msg);
                    }else {
                        try {
                            PlmsLaApplOutsrcMsg updateMsg = new PlmsLaApplOutsrcMsg();
                            updateMsg.setUuNo(msg.getUuNo());
                            updateMsg.setRecVer(msg.getRecVer());
                            updateMsg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND_FAIL);
                            plmsLaApplOutsrcMsgService.update(updateMsg);
                        }catch (Exception e){
                            e.printStackTrace();
                            logger.error("msg修改为SEND_FAIL失败:" + textMsg);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("推送内容失败：" + message.toString());
        }
    }

    private boolean pushOutsrcToMfbms(PlmsLaApplOutsrcMsg msg){
        //请求参数实体
        OutsourceUpdateMsg xmlMsg = new OutsourceUpdateMsg();
        BeanUtils.copyProperties(msg,xmlMsg);
        xmlMsg.setContractNo(msg.getCntrctNo());
        xmlMsg.setOutsourceTypeCode(msg.getOutsrcType());
        xmlMsg.setReceivableAmount(msg.getRecivAmt());

        //使用JAXB实现XML序列号
        JaxbBinder binder = new JaxbBinder(OutsourceUpdateMsg.class, JaxbBinder.CollectionWrapper.class);
        String xmlObj = binder.toXml(xmlMsg,"UTF-8");
        logger.info("开始推送委外信息:" + xmlObj);
        JSONResult result = HttpUtils.sendHttpToMfbms(xmlObj,"MSG","OutsourceUpdateMsg");

        PlmsLaApplOutsrcMsg updateMsg = new PlmsLaApplOutsrcMsg();
        updateMsg.setUuNo(msg.getUuNo());
        updateMsg.setRecVer(msg.getRecVer());

        if(result.isSuccess()){
            logger.info("成功推送委外信息:" + xmlObj);
            //如果同步成功,将委外同步信息同步状态改为 SEND-同步成功
            updateMsg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND);
            try {
                plmsLaApplOutsrcMsgService.update(updateMsg);
            }catch (Exception e){
                e.printStackTrace();
                logger.error("msg修改为SEND失败:" + xmlObj);
                return false;
            }
            return true;
        }else {
            logger.info("推送委外信息失败:" + xmlObj);
            //如果同步失败，并且是新增状态的委外同步信息，将同步状态改为 SEND_FAIL-同步失败
            if(PlmsLaApplOutsrcMsg.MSG_STATUS_NEW.equals(msg.getMsgStatus())){
                updateMsg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND_FAIL);
                try {
                    plmsLaApplOutsrcMsgService.update(updateMsg);
                }catch (Exception e){
                    e.printStackTrace();
                    logger.error("msg修改为SEND_FAIL失败:" + xmlObj);
                }
            }
            return false;
        }
    }

//    private PlmsLaApplOutsrcMsgService getMsgService() {
//        if(plmsLaApplOutsrcMsgService == null){
//            plmsLaApplOutsrcMsgService = ((PlmsLaApplOutsrcMsgService)AppContext.getBean(PlmsLaApplOutsrcMsgService.class));
//        }
//        return plmsLaApplOutsrcMsgService;
//    }

}
