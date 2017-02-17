package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.outsource.PlmsLaApplOutsrcLotMapper;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLot;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcLotExample;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcLotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 委外申请批次表,PLMS_LA_APPL_OUTSRC_LOT
 * */
@Service
public class PlmsLaApplOutsrcLotServiceImpl extends GenericServiceImpl<PlmsLaApplOutsrcLot,Long> implements PlmsLaApplOutsrcLotService {

    @Resource
    private PlmsLaApplOutsrcLotMapper plmsLaApplOutsrcLotMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLaApplOutsrcLot, Long> getDao() {
        return plmsLaApplOutsrcLotMapper;
    }

    /**
     * 插入对象
     * @param plmsLaApplOutsrcLot 对象
     * @return 新纪录ID
     */
    @Override
    public Long insertLot(PlmsLaApplOutsrcLot plmsLaApplOutsrcLot) {
        plmsLaApplOutsrcLotMapper.insert(plmsLaApplOutsrcLot);
        Long id = plmsLaApplOutsrcLot.getId();
        if(id == null){
            throw new RuntimeException("插入委外申请批次失败");
        }
        return id;
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsLaApplOutsrcLotExample example) {
        return plmsLaApplOutsrcLotMapper.countByExample(example);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLaApplOutsrcLot> selectByExample(PlmsLaApplOutsrcLotExample example) {
        return plmsLaApplOutsrcLotMapper.selectByExample(example);
    }

}
