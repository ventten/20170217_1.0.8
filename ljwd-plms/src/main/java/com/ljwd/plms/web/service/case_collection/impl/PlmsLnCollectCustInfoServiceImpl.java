package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_collection.PlmsLnCollectCustInfoMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfo;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfoExample;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLnCollectCustInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 催收记录自定义信息,PLMS_LN_COLLECT_CUST_INFO
 * */
@Service
public class PlmsLnCollectCustInfoServiceImpl extends GenericServiceImpl<PlmsLnCollectCustInfo,Long> implements PlmsLnCollectCustInfoService {

    @Resource
    private PlmsLnCollectCustInfoMapper plmsLnCollectCustInfoMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLnCollectCustInfo, Long> getDao() {
        return plmsLnCollectCustInfoMapper;
    }

//    /**
//     * 根据借款ID、逾期期数、催收员查找
//     * @param applId 借款ID
//     * @param periodNum 逾期期数
//     * @param collector 催收员
//     * @return LnCollectCustInfo实体
//     */
//    @Override
//    public PlmsLnCollectCustInfo selectByApplId(Long applId,Integer periodNum,String collector) {
//        if(applId == null || periodNum == null || collector == null){
//            return null;
//        }
//        List<PlmsLnCollectCustInfo> list = plmsLnCollectCustInfoMapper.selectByExample(new PlmsLnCollectCustInfoExample()
//                .setApplId(applId).setPeriodNum(periodNum).setCollector(collector));
//        if(list == null || list.size() == 0){
//            return null;
//        }
//        return list.get(0);
//    }

    /**
     * 根据借款ID查找
     * @param applId 借款ID
     * @return LnCollectCustInfo实体
     */
    @Override
    public PlmsLnCollectCustInfo selectByApplId(Long applId) {
        if(applId == null){
            return null;
        }

        PlmsLnCollectCustInfoExample example = new PlmsLnCollectCustInfoExample();
        example.setApplId(applId);
        example.setOrderByClause("T.ID DESC");
        List<PlmsLnCollectCustInfo> list = plmsLnCollectCustInfoMapper.selectByExample(example);
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
    }

    /**
     * 保存自定义信息
     * @param custInfo  自定义信息
     * @param loginUser 登录用户
     */
    @Override
    public void saveInfo(PlmsLnCollectCustInfo custInfo, String loginUser) {
        //根据借款ID查找
        PlmsLnCollectCustInfo thisInfo = this.selectByApplId(custInfo.getApplId());
        //若不存在则新增
        if(thisInfo == null){
            PlmsLnCollectCustInfo newInfo = new PlmsLnCollectCustInfo();
            newInfo.setApplId(custInfo.getApplId());
            newInfo.setPeriodNum(custInfo.getPeriodNum());
            newInfo.setCollector(loginUser);
            newInfo.setCustInfo(custInfo.getCustInfo());
            newInfo.setCreatedBy(loginUser);
            newInfo.setUpdatedBy(loginUser);
            plmsLnCollectCustInfoMapper.insert(newInfo);
        }else {
            //如果存在则修改
            PlmsLnCollectCustInfo updateInfo = new PlmsLnCollectCustInfo();
            updateInfo.setId(thisInfo.getId());
            updateInfo.setRecVer(thisInfo.getRecVer());
            updateInfo.setCustInfo(custInfo.getCustInfo());
            updateInfo.setUpdatedBy(loginUser);
            updateInfo.setUpdateTime(new Date());
            int ret = plmsLnCollectCustInfoMapper.updateByPrimaryKeySelective(updateInfo);
            if(ret < 1){
                throw new RuntimeException("修改自定义信息失败");
            }
        }
    }

    /**
     * 插入对象
     * @param custInfo 对象
     */
    @Override
    public int insert(PlmsLnCollectCustInfo custInfo) {
        return plmsLnCollectCustInfoMapper.insert(custInfo);
    }
}
