package com.ljwd.plms.web.dao.type;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.type.LBank;
import com.ljwd.plms.web.model.type.LBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 银行字典,L_BANK
 * */
public interface LBankMapper extends GenericDao<LBank,String>{

    int countByExample(LBankExample example);

    int deleteByExample(LBankExample example);

    int deleteByPrimaryKey(String code);

    int insert(LBank record);

    int insertSelective(LBank record);

    List<LBank> selectByExample(LBankExample example);

    LBank selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") LBank record, @Param("example") LBankExample example);

    int updateByExample(@Param("record") LBank record, @Param("example") LBankExample example);

    int updateByPrimaryKeySelective(LBank record);

    int updateByPrimaryKey(LBank record);

}