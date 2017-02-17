package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLCollectCode;
import com.ljwd.plms.web.model.type.PlmsLCollectCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 催收代码,PLMS_L_COLLECT_CODE
 * */
public interface PlmsLCollectCodeMapper extends GenericDao<PlmsLCollectCode,String>{

    int countByExample(PlmsLCollectCodeExample example);

    int deleteByExample(PlmsLCollectCodeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLCollectCode record);

    int insertSelective(PlmsLCollectCode record);

    List<PlmsLCollectCode> selectByExample(PlmsLCollectCodeExample example);

    PlmsLCollectCode selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLCollectCode record, @Param("example") PlmsLCollectCodeExample example);

    int updateByExample(@Param("record") PlmsLCollectCode record, @Param("example") PlmsLCollectCodeExample example);

    int updateByPrimaryKeySelective(PlmsLCollectCode record);

    int updateByPrimaryKey(PlmsLCollectCode record);

}