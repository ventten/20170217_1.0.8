package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outsource.PlmsLaApplOutsrcLogMapper;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLog;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLogExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcLogService;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcLogPageExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhengzw on 2016/11/11
 * 委外申请操作日志表,PLMS_LA_APPL_OUTSRC_LOG
 */
@Service
public class PlmsLaApplOutsrcLogServiceImpl extends GenericServiceImpl<PlmsLaApplOutsrcLog,Long> implements PlmsLaApplOutsrcLogService {

    @Resource
    private PlmsLaApplOutsrcLogMapper plmsLaApplOutsrcLogMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLaApplOutsrcLog, Long> getDao() {
        return plmsLaApplOutsrcLogMapper;
    }

    /**
     * 插入对象
     * @param plmsLaApplOutsrcLog 对象
     */
    @Override
    public int insert(PlmsLaApplOutsrcLog plmsLaApplOutsrcLog) {
        return plmsLaApplOutsrcLogMapper.insert(plmsLaApplOutsrcLog);
    }

    /**
     * 批量添加
     * @param list 添加的数据集合
     */
    @Override
    public void insertBatch(List<PlmsLaApplOutsrcLog> list) {
        super.insertBatch(list);
    }

    /**
     * 批量修改
     * @param list 添加的数据集合
     */
    @Override
    public void updateBatch(List<PlmsLaApplOutsrcLog> list) {
        super.updateBatch(list);
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsLaApplOutsrcLogExample example) {
        return plmsLaApplOutsrcLogMapper.countByExample(example);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLaApplOutsrcLog> selectByExample(PlmsLaApplOutsrcLogExample example) {
        return plmsLaApplOutsrcLogMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<OutsrcLogPageDto> selectByExampleAndPage(Page<OutsrcLogPageDto> page, OutsrcLogPageExample example) {
        plmsLaApplOutsrcLogMapper.selectByExampleAndPage(page, example);
        return page;
    }

}
