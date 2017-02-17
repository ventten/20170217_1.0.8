package com.ljwd.plms.web.dao.outVisit;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitArea;
import com.ljwd.plms.web.model.outVisit.PlmsOvmOutVisitAreaExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlmsOvmOutVisitAreaMapper extends GenericDao<PlmsOvmOutVisitArea,Long>{
    int countByExample(PlmsOvmOutVisitAreaExample example);

    int deleteByExample(PlmsOvmOutVisitAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOvmOutVisitArea record);

    int insertSelective(PlmsOvmOutVisitArea record);

    List<PlmsOvmOutVisitArea> selectByExample(PlmsOvmOutVisitAreaExample example);

    PlmsOvmOutVisitArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOvmOutVisitArea record, @Param("example") PlmsOvmOutVisitAreaExample example);

    int updateByExample(@Param("record") PlmsOvmOutVisitArea record, @Param("example") PlmsOvmOutVisitAreaExample example);

    int updateByPrimaryKeySelective(PlmsOvmOutVisitArea record);

    int updateByPrimaryKey(PlmsOvmOutVisitArea record);
    /**
     * 
    * @Description:   根据userId查找所属区域的编号  
    * @param userId
    * @return
    * @return String
     */
    String searchAreaCodeByUserId(@Param("userId")String userId);
}