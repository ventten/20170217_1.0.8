package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outsource.PlmsLaApplOutsrcMsgMapper;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsg;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcMsgExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/15
 * 委外申请同步记录表,PLMS_LA_APPL_OUTSRC_MSG
 */
@Service
public class PlmsLaApplOutsrcMsgServiceImpl extends GenericServiceImpl<PlmsLaApplOutsrcMsg,Long> implements PlmsLaApplOutsrcMsgService {

    @Resource
    private PlmsLaApplOutsrcMsgMapper plmsLaApplOutsrcMsgMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLaApplOutsrcMsg, Long> getDao() {
        return plmsLaApplOutsrcMsgMapper;
    }

    /**
     * 插入对象
     * @param plmsLaApplOutsrcMsg 对象
     */
    @Override
    public int insert(PlmsLaApplOutsrcMsg plmsLaApplOutsrcMsg) {
        return plmsLaApplOutsrcMsgMapper.insert(plmsLaApplOutsrcMsg);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLaApplOutsrcMsg> selectByExample(PlmsLaApplOutsrcMsgExample example) {
        return plmsLaApplOutsrcMsgMapper.selectByExample(example);
    }

}
