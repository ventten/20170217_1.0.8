package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLCollectControl;
import com.ljwd.plms.web.model.type.PlmsLCollectControlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 控管状态,PLMS_L_COLLECT_CONTROL
 * */
public interface PlmsLCollectControlMapper extends GenericDao<PlmsLCollectControl,String>{

    int countByExample(PlmsLCollectControlExample example);

    int deleteByExample(PlmsLCollectControlExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLCollectControl record);

    int insertSelective(PlmsLCollectControl record);

    List<PlmsLCollectControl> selectByExample(PlmsLCollectControlExample example);

    PlmsLCollectControl selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLCollectControl record, @Param("example") PlmsLCollectControlExample example);

    int updateByExample(@Param("record") PlmsLCollectControl record, @Param("example") PlmsLCollectControlExample example);

    int updateByPrimaryKeySelective(PlmsLCollectControl record);

    int updateByPrimaryKey(PlmsLCollectControl record);

}