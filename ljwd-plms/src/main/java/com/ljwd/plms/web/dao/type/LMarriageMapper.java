package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.LMarriage;

import java.util.List;

import com.ljwd.plms.web.model.type.LMarriageExample;
import org.apache.ibatis.annotations.Param;

/**
 * 婚姻状况,l_marriage
 * */
public interface LMarriageMapper extends GenericDao<LMarriage,String> {

    int countByExample(LMarriageExample example);

    int deleteByExample(LMarriageExample example);

    int deleteByPrimaryKey(String code);

    int insert(LMarriage record);

    int insertSelective(LMarriage record);

    List<LMarriage> selectByExample(LMarriageExample example);

    LMarriage selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") LMarriage record, @Param("example") LMarriageExample example);

    int updateByExample(@Param("record") LMarriage record, @Param("example") LMarriageExample example);

    int updateByPrimaryKeySelective(LMarriage record);

    int updateByPrimaryKey(LMarriage record);

}