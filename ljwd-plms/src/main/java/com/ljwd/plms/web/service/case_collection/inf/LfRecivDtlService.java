package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.model.case_collection.LfRecivDtl;
import com.ljwd.plms.web.model.case_collection.LfRecivDtlExample;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.case_collection.CustRecivDetailExample;
import com.ljwd.plms.web.vo.case_collection.RecivPageDto;
import com.ljwd.plms.web.vo.sys_management.SysPaymentTypeDto;

import java.util.List;

/**
 * 应收款明细,LF_RECIV_DTL
 * */
public interface LfRecivDtlService {

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     * */
    List<LfRecivDtl> selectByExample(LfRecivDtlExample example);

    /**
    * @Description: 客户应收明细表
    * @param pageData
    * @param example
    * @return Page<RecivPageDto>
     */
    Page<RecivPageDto> searchReceivableAndPage(Page<RecivPageDto> pageData,CustRecivDetailExample example);

    /**
    * @Description: 查询所有的放款类别
    * @return List<SysPaymentTypeDto>
     */
    List<SysPaymentTypeDto>	selectAllPaymentType();

}
