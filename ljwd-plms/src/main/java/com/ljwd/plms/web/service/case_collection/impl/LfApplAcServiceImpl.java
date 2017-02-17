package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.web.dao.case_collection.LfApplAcMapper;
import com.ljwd.plms.web.model.case_collection.LfApplAc;
import com.ljwd.plms.web.model.case_collection.LfApplAcExample;
import com.ljwd.plms.web.service.case_collection.inf.LfApplAcService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhengzw on 2016/9/28
 * 合同概要表,LF_APPL_AC
 */
@Service
public class LfApplAcServiceImpl implements LfApplAcService {

    @Resource
    private LfApplAcMapper lfApplAcMapper;


    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LfApplAc> selectByExample(LfApplAcExample example) {
        return lfApplAcMapper.selectByExample(example);
    }

    /**
     * 批量添加
     * @param list 添加的数据集合
     */
    @Override
    public void insertBatch(List<LfApplAc> list) {
        if(list == null || list.size() <= 0){
            return;
        }
        lfApplAcMapper.insertBatch(list);
    }

    /**
     * 批量修改
     * @param list 添加的数据集合
     */
    @Override
    public void updateBatch(List<LfApplAc> list) {
        if(list == null || list.size() <= 0){
            return;
        }
        lfApplAcMapper.updateBatch(list);
    }

}
