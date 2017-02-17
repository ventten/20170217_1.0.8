package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.LRltnshp;

import java.util.List;

import com.ljwd.plms.web.model.type.LRltnshpExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户亲属关系,l_rltnshp
 * */
public interface LRltnshpMapper extends GenericDao<LRltnshp,String>{

    int countByExample(LRltnshpExample example);

    int deleteByExample(LRltnshpExample example);

    int deleteByPrimaryKey(String code);

    int insert(LRltnshp record);

    int insertSelective(LRltnshp record);

    List<LRltnshp> selectByExample(LRltnshpExample example);

    LRltnshp selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") LRltnshp record, @Param("example") LRltnshpExample example);

    int updateByExample(@Param("record") LRltnshp record, @Param("example") LRltnshpExample example);

    int updateByPrimaryKeySelective(LRltnshp record);

    int updateByPrimaryKey(LRltnshp record);

}