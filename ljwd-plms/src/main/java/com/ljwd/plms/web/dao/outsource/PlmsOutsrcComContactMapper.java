package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContact;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 委外机构联系人,PLMS_OUTSRC_COM_CONTACT
 * */
public interface PlmsOutsrcComContactMapper extends GenericDao<PlmsOutsrcComContact,Long>{

    int countByExample(PlmsOutsrcComContactExample example);

    int deleteByExample(PlmsOutsrcComContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOutsrcComContact record);

    int insertSelective(PlmsOutsrcComContact record);

    List<PlmsOutsrcComContact> selectByExample(PlmsOutsrcComContactExample example);

    PlmsOutsrcComContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOutsrcComContact record, @Param("example") PlmsOutsrcComContactExample example);

    int updateByExample(@Param("record") PlmsOutsrcComContact record, @Param("example") PlmsOutsrcComContactExample example);

    int updateByPrimaryKeySelective(PlmsOutsrcComContact record);

    int updateByPrimaryKey(PlmsOutsrcComContact record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsOutsrcComContact> selectByExampleAndPage(Page<PlmsOutsrcComContact> page, PlmsOutsrcComContactExample example);

}