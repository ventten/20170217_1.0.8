package com.ljwd.plms.web.service.case_collection.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_collection.LfOfferExempt;
import com.ljwd.plms.web.model.case_collection.LfOfferExemptExample;
import com.ljwd.plms.web.vo.case_collection.ApplyExemptDto;

import java.util.List;

/**
 * Created by zhengzw on 2016/9/1
 * 免除自动代扣,LF_OFFER_EXEMPT
 */
public interface LfOfferExemptService extends GenericService<LfOfferExempt,Long>{

    /**
     * 根据条件计数
     * @param example 查询条件
     * @return 数量
     * */
    int countByExample(LfOfferExemptExample example);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     * */
    List<LfOfferExempt> selectByExample(LfOfferExemptExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<LfOfferExempt> selectByExampleAndPage(Page<LfOfferExempt> page, LfOfferExemptExample example);

    /**
     * 根据主贷人或者合同编号查找合同
     * @param custName 主贷人
     * @param cntrctNo 合同编号
     * @return 实体集
     * */
    List<ApplyExemptDto> selectApplyExempt(String custName,String cntrctNo);

}
