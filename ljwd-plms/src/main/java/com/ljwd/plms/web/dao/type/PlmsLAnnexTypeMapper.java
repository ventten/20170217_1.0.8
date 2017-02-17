package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.PlmsLAnnexType;
import com.ljwd.plms.web.model.type.PlmsLAnnexTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 附件类型,PLMS_L_ANNEX_TYPE
 * */
public interface PlmsLAnnexTypeMapper extends GenericDao<PlmsLAnnexType,String> {

    int countByExample(PlmsLAnnexTypeExample example);

    int deleteByExample(PlmsLAnnexTypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(PlmsLAnnexType record);

    int insertSelective(PlmsLAnnexType record);

    List<PlmsLAnnexType> selectByExample(PlmsLAnnexTypeExample example);

    PlmsLAnnexType selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") PlmsLAnnexType record, @Param("example") PlmsLAnnexTypeExample example);

    int updateByExample(@Param("record") PlmsLAnnexType record, @Param("example") PlmsLAnnexTypeExample example);

    int updateByPrimaryKeySelective(PlmsLAnnexType record);

    int updateByPrimaryKey(PlmsLAnnexType record);

}