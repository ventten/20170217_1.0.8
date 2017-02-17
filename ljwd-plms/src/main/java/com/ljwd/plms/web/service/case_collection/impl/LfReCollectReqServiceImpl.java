package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.web.dao.case_collection.LfReCollectReqMapper;
import com.ljwd.plms.web.model.case_collection.LfReCollectReq;
import com.ljwd.plms.web.model.case_collection.LfReCollectReqExample;
import com.ljwd.plms.web.service.case_collection.inf.LfReCollectReqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhengzw on 2016/12/10
 * 再扣申请表,LF_RE_COLLECT_REQ
 * */
@Service
public class LfReCollectReqServiceImpl implements LfReCollectReqService {

    @Resource
    private LfReCollectReqMapper lfReCollectReqMapper;

    /**
     * 根据条件计数
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(LfReCollectReqExample example) {
        return lfReCollectReqMapper.countByExample(example);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LfReCollectReq> selectByExample(LfReCollectReqExample example) {
        return lfReCollectReqMapper.selectByExample(example);
    }

}
