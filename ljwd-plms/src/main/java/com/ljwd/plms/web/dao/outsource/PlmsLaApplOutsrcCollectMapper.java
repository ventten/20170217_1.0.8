package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcCollect;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcCollectExample;
import java.util.List;

import com.ljwd.plms.web.vo.outsource.OutsrcCollectPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcCollectPageExample;
import org.apache.ibatis.annotations.Param;

/**
 * 委外催记表,PLMS_LA_APPL_OUTSRC_COLLECT
 * */
public interface PlmsLaApplOutsrcCollectMapper extends GenericDao<PlmsLaApplOutsrcCollect,Long>{

    int countByExample(PlmsLaApplOutsrcCollectExample example);

    int deleteByExample(PlmsLaApplOutsrcCollectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaApplOutsrcCollect record);

    int insertSelective(PlmsLaApplOutsrcCollect record);

    List<PlmsLaApplOutsrcCollect> selectByExample(PlmsLaApplOutsrcCollectExample example);

    PlmsLaApplOutsrcCollect selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaApplOutsrcCollect record, @Param("example") PlmsLaApplOutsrcCollectExample example);

    int updateByExample(@Param("record") PlmsLaApplOutsrcCollect record, @Param("example") PlmsLaApplOutsrcCollectExample example);

    int updateByPrimaryKeySelective(PlmsLaApplOutsrcCollect record);

    int updateByPrimaryKey(PlmsLaApplOutsrcCollect record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<OutsrcCollectPageDto> selectByExampleAndPage(Page<OutsrcCollectPageDto> page, OutsrcCollectPageExample example);

}