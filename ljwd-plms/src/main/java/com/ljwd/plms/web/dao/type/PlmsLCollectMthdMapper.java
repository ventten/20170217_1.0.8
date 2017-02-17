package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLCollectMthd;
import com.ljwd.plms.web.model.type.PlmsLCollectMthdExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 催收类型,PLMS_L_COLLECT_MTHD
 * */
public interface PlmsLCollectMthdMapper extends GenericDao<PlmsLCollectMthd,String>{

    int countByExample(PlmsLCollectMthdExample example);

    int deleteByExample(PlmsLCollectMthdExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLCollectMthd record);

    int insertSelective(PlmsLCollectMthd record);

    List<PlmsLCollectMthd> selectByExample(PlmsLCollectMthdExample example);

    PlmsLCollectMthd selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLCollectMthd record, @Param("example") PlmsLCollectMthdExample example);

    int updateByExample(@Param("record") PlmsLCollectMthd record, @Param("example") PlmsLCollectMthdExample example);

    int updateByPrimaryKeySelective(PlmsLCollectMthd record);

    int updateByPrimaryKey(PlmsLCollectMthd record);

}