package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.web.model.case_collection.LfApplAc;
import com.ljwd.plms.web.model.case_collection.LfApplAcExample;

import java.util.List;

/**
 * Created by zhengzw on 2016/9/28
 * 合同概要表,LF_APPL_AC
 */
public interface LfApplAcService {

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<LfApplAc> selectByExample(LfApplAcExample example);

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
