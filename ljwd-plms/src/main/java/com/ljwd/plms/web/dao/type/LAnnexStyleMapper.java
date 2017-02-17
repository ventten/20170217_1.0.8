package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.LAnnexStyle;
import com.ljwd.plms.web.model.type.LAnnexStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 附件类别,L_ANNEX_STYLE
 * */
public interface LAnnexStyleMapper extends GenericDao<LAnnexStyle,String>{

    int countByExample(LAnnexStyleExample example);

    int deleteByExample(LAnnexStyleExample example);

    int deleteByPrimaryKey(String code);

    int insert(LAnnexStyle record);

    int insertSelective(LAnnexStyle record);

    List<LAnnexStyle> selectByExample(LAnnexStyleExample example);

    LAnnexStyle selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") LAnnexStyle record, @Param("example") LAnnexStyleExample example);

    int updateByExample(@Param("record") LAnnexStyle record, @Param("example") LAnnexStyleExample example);

    int updateByPrimaryKeySelective(LAnnexStyle record);

    int updateByPrimaryKey(LAnnexStyle record);

}