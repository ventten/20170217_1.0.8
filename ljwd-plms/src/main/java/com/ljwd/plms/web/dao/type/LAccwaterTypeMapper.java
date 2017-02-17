package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.LAccwaterType;
import com.ljwd.plms.web.model.type.LAccwaterTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 账户流水类型,l_accwater_type
 * */
public interface LAccwaterTypeMapper extends GenericDao<LAccwaterType,String> {

    int countByExample(LAccwaterTypeExample example);

    int deleteByExample(LAccwaterTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(LAccwaterType record);

    int insertSelective(LAccwaterType record);

    List<LAccwaterType> selectByExample(LAccwaterTypeExample example);

    LAccwaterType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") LAccwaterType record, @Param("example") LAccwaterTypeExample example);

    int updateByExample(@Param("record") LAccwaterType record, @Param("example") LAccwaterTypeExample example);

    int updateByPrimaryKeySelective(LAccwaterType record);

    int updateByPrimaryKey(LAccwaterType record);
    
}