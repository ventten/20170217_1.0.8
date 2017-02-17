package com.ljwd.plms.web.service.job.impl;

import com.ljwd.plms.core.util.D;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.job.inf.CollectionRecordJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/8/23
 * 案件催收-是否破坏承诺定时器
 */
@Service
public class CollectionRecordJobServiceImpl implements CollectionRecordJobService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private PlmsLaCollectionRecordService plmsLaCollectionRecordService;

    /**
     * 案件催收-是否破坏承诺定时器
     */
    @Override
    public String doBreakPromise() {
        logger.info("开始跑批-案件催收-是否破坏承诺");

        StringBuffer str = new StringBuffer();
        str.append("结果:");

        //查找到期的申请再扣、承诺还款或代偿的入账结果
        List<PlmsLaCollectionRecord> list = plmsLaCollectionRecordService.selectTPJournalReport();
        if(list != null && !list.isEmpty()){

            str.append(list.size() + "条发起再扣或承诺还款(代偿)的催记到期");
            //破坏承诺的IDS
            List<Long> yesList = new ArrayList<>();
            //按承诺还款的IDS
            List<Long> noList = new ArrayList<>();
            //新增破坏承诺的催记集合
            List<PlmsLaCollectionRecord> newRecordList = new ArrayList<PlmsLaCollectionRecord>();
            Date time = new Date();
            for(PlmsLaCollectionRecord rec : list){
                //已入账金额大于等于承诺还款金额,按承诺还款
                if(rec.getRepaymentAmount().compareTo(rec.getRpmntAmt()) >= 0){
                    noList.add(rec.getId());
                }else {
                    yesList.add(rec.getId());

                    PlmsLaCollectionRecord collectionRecord = new PlmsLaCollectionRecord();
                    collectionRecord.setApplId(rec.getApplId());
                    collectionRecord.setPeriodNum(rec.getPeriodNum());
                    collectionRecord.setCollectTime(time);
                    collectionRecord.setInputTime(time);
                    collectionRecord.setCollectMthd("DESTROYCOMMIT");
                    collectionRecord.setResult("DESTROYCOMMIT");
                    collectionRecord.setStatus("DESTROYCOMMIT");
                    collectionRecord.setContent("未能在承诺还款日" + D.parse(rec.getRpmntDate()) +"之前处理还款");

                    collectionRecord.setCreatedBy("system");
                    collectionRecord.setUpdatedBy("system");
                    collectionRecord.setCreateTime(time);
                    collectionRecord.setUpdateTime(time);
                    collectionRecord.setRecVer(0L);
                    collectionRecord.setTagSeq(0L);

                    newRecordList.add(collectionRecord);
                }
            }

            plmsLaCollectionRecordService.updateTagByIds(2L,noList);
            plmsLaCollectionRecordService.updateTagByIds(3L,yesList);
            plmsLaCollectionRecordService.insertBatch(newRecordList);

            str.append(",破坏承诺数:" + yesList.size() + ",按承诺还款(代偿)数:" + noList.size());
        }else {
            str.append(0 + "条承诺还款(代偿)的催记到期");
        }

        logger.info(str.toString());
        logger.info("结束跑批-案件催收-是否破坏承诺==>" + str.toString());

        return str.toString();
    }

}
