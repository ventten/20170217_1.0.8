package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.web.model.case_collection.LfRecivFeeDtl;
import com.ljwd.plms.web.model.case_collection.LfRecivFeeDtlExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 银行费用明细,LF_RECIV_FEE_DTL
 * */
public interface LfRecivFeeDtlMapper {

    int countByExample(LfRecivFeeDtlExample example);

    List<LfRecivFeeDtl> selectByExample(LfRecivFeeDtlExample example);

    LfRecivFeeDtl selectByPrimaryKey(Long id);

}