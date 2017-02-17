package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfo;
import com.ljwd.plms.web.model.case_collection.PlmsLnCollectCustInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 催收记录自定义信息,PLMS_LN_COLLECT_CUST_INFO
 * */
public interface PlmsLnCollectCustInfoMapper extends GenericDao<PlmsLnCollectCustInfo,Long>{

    int countByExample(PlmsLnCollectCustInfoExample example);

    int deleteByExample(PlmsLnCollectCustInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLnCollectCustInfo record);

    int insertSelective(PlmsLnCollectCustInfo record);

    List<PlmsLnCollectCustInfo> selectByExample(PlmsLnCollectCustInfoExample example);

    PlmsLnCollectCustInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLnCollectCustInfo record, @Param("example") PlmsLnCollectCustInfoExample example);

    int updateByExample(@Param("record") PlmsLnCollectCustInfo record, @Param("example") PlmsLnCollectCustInfoExample example);

    int updateByPrimaryKeySelective(PlmsLnCollectCustInfo record);

    int updateByPrimaryKey(PlmsLnCollectCustInfo record);

}