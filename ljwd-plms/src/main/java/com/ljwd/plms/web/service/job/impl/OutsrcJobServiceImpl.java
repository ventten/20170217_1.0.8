package com.ljwd.plms.web.service.job.impl;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.util.AppContext;
import com.ljwd.plms.core.util.ConfigUtil;
import com.ljwd.plms.core.util.HttpUtils;
import com.ljwd.plms.core.util.JaxbBinder;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsgExample;
import com.ljwd.plms.web.service.job.inf.OutsrcJobService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcMsgService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.thread.OutsrcMsgThread;
import com.ljwd.plms.web.vo.outsource.OutsourceUpdateMsg;
import com.ljwd.plms.web.vo.outsource.OutsrcDto;
import com.ljwd.plms.web.vo.outsource.OutsrcExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springside.modules.utils.encode.JaxbBinder;
//import org.springside.modules.utils.encode.JaxbBinder.CollectionWrapper;

import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengzw on 2016/10/26
 * 委外管理定时器
 */
@Service
public class OutsrcJobServiceImpl implements OutsrcJobService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private PlmsLaApplOutsrcService plmsLaApplOutsrcService;
    @Resource
    private PlmsLaApplOutsrcMsgService plmsLaApplOutsrcMsgService;

    /**
     * 委外管理-预计结案日期到期自动结案
     */
    @Override
    public String doEndedOutsrc() {
        logger.info("开始跑批-委外管理-自动结案");

        StringBuffer str = new StringBuffer();
        str.append("结果:");

        OutsrcExample example = new OutsrcExample();
        example.setEnd(true);   //查询已审批且(系统时间大于预计结案日期或已结清)的数据
        List<OutsrcDto> outsrcList = plmsLaApplOutsrcService.selectOutsrcByExample(example);
        if(outsrcList != null && outsrcList.size() > 0){
            plmsLaApplOutsrcService.saveEnded(outsrcList,new Date(),"system","系统用户",true);
        }
        int size = outsrcList == null ? 0 : outsrcList.size();
        str.append(size + "条记录自动结案");

        logger.info(str.toString());
        logger.info("结束跑批-委外管理-自动结案");

        return str.toString();
    }

    /**
     * 委外管理-将同步失败的委外信息发送到微贷
     */
    @Override
    public String doSendOutsrcToMfbms() {
        boolean isInfoEnabled = logger.isInfoEnabled();
        if(isInfoEnabled){
            logger.info("开始跑批-委外管理-将同步失败的委外信息发送到微贷");
        }

        StringBuffer str = new StringBuffer();
        str.append("结果:");

        //查询同步失败的记录
        PlmsLaApplOutsrcMsgExample example = new PlmsLaApplOutsrcMsgExample();
        example.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND_FAIL);
        example.setOrderByClause("T.ID ASC");
        List<PlmsLaApplOutsrcMsg> list = plmsLaApplOutsrcMsgService.selectByExample(example);

        int count = 0;

        //推送失败的借款ID map,key-applId
        Map<Long,Integer> failMap = new HashMap<Long,Integer>();

        if(list != null && list.size() > 0){
            //获取事务管理器
            DataSourceTransactionManager transactionManager = (DataSourceTransactionManager)AppContext.getBean("transactionManager");

            for(PlmsLaApplOutsrcMsg msg : list){
                //如果此借款之前有失败的
                if(failMap.get(msg.getApplId()) != null){
                    continue;
                }

                DefaultTransactionDefinition def = new DefaultTransactionDefinition();
                def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
                TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态

                try {

                    //请求参数实体
                    OutsourceUpdateMsg xmlMsg = new OutsourceUpdateMsg();
                    BeanUtils.copyProperties(msg,xmlMsg);
                    xmlMsg.setContractNo(msg.getCntrctNo());
                    xmlMsg.setOutsourceTypeCode(msg.getOutsrcType());
                    xmlMsg.setReceivableAmount(msg.getRecivAmt());

                    //使用JAXB实现XML序列号
                    JaxbBinder binder = new JaxbBinder(OutsourceUpdateMsg.class, JaxbBinder.CollectionWrapper.class);
                    String xmlObj = binder.toXml(xmlMsg,"UTF-8");
                    logger.info("推送委外信息:" + xmlObj);
                    JSONResult result = HttpUtils.sendHttpToMfbms(xmlObj,"MSG","OutsourceUpdateMsg");

                    if(result.isSuccess()){
                        count++;
                        logger.info("推送成功:" + xmlObj);
                        //如果同步成功,将委外同步信息同步状态改为 SEND-同步成功
                        PlmsLaApplOutsrcMsg updateMsg = new PlmsLaApplOutsrcMsg();
                        updateMsg.setUuNo(msg.getUuNo());
                        updateMsg.setRecVer(msg.getRecVer());
                        updateMsg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_SEND);
                        plmsLaApplOutsrcMsgService.update(updateMsg);

                        transactionManager.commit(status);                          //提交事务
                    }else {
                        //失败了放进map,同一案件的将不再继续
                        failMap.put(msg.getApplId(),1);
                        logger.info("推送失败:" + xmlObj);
                    }

                }catch (Exception e){
                    //失败了放进map,同一案件的将不再继续
                    failMap.put(msg.getApplId(),1);
                    e.printStackTrace();
                    transactionManager.rollback(status);                        //发生异常,事务回滚
                    logger.info("推送失败 msgId:" + msg.getId());
                }
            }

        }

        str.append(count + "条记录同步成功。");

        if(isInfoEnabled){
            logger.info(str.toString());
            logger.info("结束跑批-委外管理-将同步失败的委外信息发送到微贷");
        }

        return str.toString();
    }

}
