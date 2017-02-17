package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_collection.LfOfferExempt;
import com.ljwd.plms.web.model.case_collection.LfOfferExemptExample;
import java.math.BigDecimal;
import java.util.List;

import com.ljwd.plms.web.vo.case_collection.ApplyExemptDto;
import org.apache.ibatis.annotations.Param;

/**
 * 免除自动代扣,LF_OFFER_EXEMPT
 * */
public interface LfOfferExemptMapper extends GenericDao<LfOfferExempt,Long>{

    int countByExample(LfOfferExemptExample example);

    int deleteByExample(LfOfferExemptExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LfOfferExempt record);

    int insertSelective(LfOfferExempt record);

    List<LfOfferExempt> selectByExample(LfOfferExemptExample example);

    LfOfferExempt selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LfOfferExempt record, @Param("example") LfOfferExemptExample example);

    int updateByExample(@Param("record") LfOfferExempt record, @Param("example") LfOfferExemptExample example);

    int updateByPrimaryKeySelective(LfOfferExempt record);

    int updateByPrimaryKey(LfOfferExempt record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<LfOfferExempt> selectByExampleAndPage(Page<LfOfferExempt> page, LfOfferExemptExample example);

    /**
     * 根据主贷人或者合同编号查找合同
     * @param custName 主贷人
     * @param cntrctNo 合同编号
     * @return 实体集
     * */
    List<ApplyExemptDto> selectApplyExempt(@Param("custName")String custName,@Param("cntrctNo")String cntrctNo);

}