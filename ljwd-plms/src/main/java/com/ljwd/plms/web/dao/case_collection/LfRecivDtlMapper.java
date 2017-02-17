package com.ljwd.plms.web.dao.case_collection;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_collection.LfOfferExempt;
import com.ljwd.plms.web.model.case_collection.LfRecivDtl;
import com.ljwd.plms.web.model.case_collection.LfRecivDtlExample;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.case_collection.CustRecivDetailExample;
import com.ljwd.plms.web.vo.case_collection.RecivPageDto;
import com.ljwd.plms.web.vo.sys_management.SysPaymentTypeDto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 应收款明细,LF_RECIV_DTL
 * */
public interface LfRecivDtlMapper extends GenericDao<LfRecivDtl,Long>{

    int countByExample(LfRecivDtlExample example);

    List<LfRecivDtl> selectByExample(LfRecivDtlExample example);

    LfRecivDtl selectByPrimaryKey(Long id);
    
    /**
     * @Description: 客户应收明细表
     * @param pageData
     * @param example
     * @return Page<RecivPageDto>
      */
     List<RecivPageDto> searchReceivableAndPage(Page<RecivPageDto> pageData,CustRecivDetailExample example);

     /**
     * @Description: 查询所有的放款类别
     * @return List<SysPaymentTypeDto>
      */
     List<SysPaymentTypeDto> selectAllPaymentType();

}