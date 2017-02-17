package com.ljwd.plms.web.thread;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.AppContext;
import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JaxbBinder;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcMsgService;
import com.ljwd.plms.web.vo.outsource.OutsourceUpdateMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

/**
 * Created by zhengzw on 2016/11/24
 * 同步委外信息到微贷的线程
 */
public class OutsrcMsgThread extends Thread {

    private Logger logger = LoggerFactory.getLogger(OutsrcMsgThread.class);

    private PlmsLaApplOutsrcMsg msg;        //委外同步信息

    public OutsrcMsgThread(PlmsLaApplOutsrcMsg plmsLaApplOutsrcMsg) {
        this.msg = plmsLaApplOutsrcMsg;
    }

    @Override
    public void run() {
        if(msg != null){
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
                ((PlmsLaApplOutsrcMsgService)AppContext.getBean(PlmsLaApplOutsrcMsgService.class)).update(updateMsg);
            }else {
                logger.info("推送委外信息失败:" + xmlObj);
                //如果同步失败，并且是新增状态的委外同步信息，将同步状态改为 SEND_FAIL-同步失败
                if(PlmsLaApplOutsrcMsg.MSG_STATUS_NEW.equals(msg.getMsgStatus())){
                    updateMsg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND_FAIL);
                    ((PlmsLaApplOutsrcMsgService)AppContext.getBean(PlmsLaApplOutsrcMsgService.class)).update(updateMsg);
                }
            }
        }
    }

}
