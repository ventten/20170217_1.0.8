package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.web.model.case_collection.LfReCollectReq;
import com.ljwd.plms.web.model.case_collection.LfReCollectReqExample;

import java.util.List;

/**
 * Created by zhengzw on 2016/12/10
 * 再扣申请表,LF_RE_COLLECT_REQ
 * */
public interface LfReCollectReqService {

    /**
     * 根据条件计数
     * @param example 查询条件
     * @return 数量
     * */
    int countByExample(LfReCollectReqExample example);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     * */
    List<LfReCollectReq> selectByExample(LfReCollectReqExample example);

}
