package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLCollectStatus;
import com.ljwd.plms.web.model.type.PlmsLCollectStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 跟进情况,PLMS_L_COLLECT_STATUS
 * */
public interface PlmsLCollectStatusMapper extends GenericDao<PlmsLCollectStatus,String>{

    int countByExample(PlmsLCollectStatusExample example);

    int deleteByExample(PlmsLCollectStatusExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLCollectStatus record);

    int insertSelective(PlmsLCollectStatus record);

    List<PlmsLCollectStatus> selectByExample(PlmsLCollectStatusExample example);

    PlmsLCollectStatus selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLCollectStatus record, @Param("example") PlmsLCollectStatusExample example);

    int updateByExample(@Param("record") PlmsLCollectStatus record, @Param("example") PlmsLCollectStatusExample example);

    int updateByPrimaryKeySelective(PlmsLCollectStatus record);

    int updateByPrimaryKey(PlmsLCollectStatus record);

}