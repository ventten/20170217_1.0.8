package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegion;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComRegionExample;
import java.math.BigDecimal;
import java.util.List;

import com.ljwd.plms.web.vo.outsource.SiteRegionDto;
import org.apache.ibatis.annotations.Param;

/**
 * 委外机构辐射区域表,PLMS_OUTSRC_COM_REGION
 * */
public interface PlmsOutsrcComRegionMapper extends GenericDao<PlmsOutsrcComRegion,Long>{

    int countByExample(PlmsOutsrcComRegionExample example);

    int deleteByExample(PlmsOutsrcComRegionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOutsrcComRegion record);

    int insertSelective(PlmsOutsrcComRegion record);

    List<PlmsOutsrcComRegion> selectByExample(PlmsOutsrcComRegionExample example);

    PlmsOutsrcComRegion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOutsrcComRegion record, @Param("example") PlmsOutsrcComRegionExample example);

    int updateByExample(@Param("record") PlmsOutsrcComRegion record, @Param("example") PlmsOutsrcComRegionExample example);

    int updateByPrimaryKeySelective(PlmsOutsrcComRegion record);

    int updateByPrimaryKey(PlmsOutsrcComRegion record);

    /**
     * 查找网点区域
     * */
    List<SiteRegionDto> selectSiteRegion();

}