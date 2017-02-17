package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outsource.PlmsOutsrcComLogMapper;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLog;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComLogExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 委外机构沟通日志,PLMS_OUTSRC_COM_LOG
 * */
@Service
public class PlmsOutsrcComLogServiceImpl extends GenericServiceImpl<PlmsOutsrcComLog,Long> implements PlmsOutsrcComLogService {

    @Resource
    private PlmsOutsrcComLogMapper plmsOutsrcComLogMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsOutsrcComLog, Long> getDao() {
        return plmsOutsrcComLogMapper;
    }

    /**
     * 插入对象
     * @param outsrcComLog 对象
     */
    @Override
    public int insert(PlmsOutsrcComLog outsrcComLog) {
        return plmsOutsrcComLogMapper.insert(outsrcComLog);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsOutsrcComLog> selectByExampleAndPage(Page<PlmsOutsrcComLog> page, PlmsOutsrcComLogExample example) {
        plmsOutsrcComLogMapper.selectByExampleAndPage(page, example);
        return page;
    }

}
