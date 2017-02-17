package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.LfApplAc;
import com.ljwd.plms.web.model.case_collection.LfApplAcExample;
import java.util.List;

/**
 * 合同概要表,LF_APPL_AC
 * */
public interface LfApplAcMapper {

    int countByExample(LfApplAcExample example);

    List<LfApplAc> selectByExample(LfApplAcExample example);

    LfApplAc selectByPrimaryKey(Long paymentId);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    void insertBatch(List<LfApplAc> list);

    /**
     * 批量修改
     * @param list 添加的数据集合
     * */
    void updateBatch(List<LfApplAc> list);

}