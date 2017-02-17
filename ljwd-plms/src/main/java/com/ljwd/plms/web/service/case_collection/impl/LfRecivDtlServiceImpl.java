package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.LoanUtils;
import com.ljwd.plms.web.dao.case_collection.LfRecivDtlMapper;
import com.ljwd.plms.web.model.case_collection.LfReciv;
import com.ljwd.plms.web.model.case_collection.LfRecivDtl;
import com.ljwd.plms.web.model.case_collection.LfRecivDtlExample;
import com.ljwd.plms.web.service.case_collection.inf.LfRecivDtlService;
import com.ljwd.plms.web.vo.case_collection.CustRecivDetailExample;
import com.ljwd.plms.web.vo.case_collection.RecivPageDto;
import com.ljwd.plms.web.vo.sys_management.SysPaymentTypeDto;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 应收款明细,LF_RECIV_DTL
 * */
@Service
public class LfRecivDtlServiceImpl implements LfRecivDtlService {

    @Resource
    private LfRecivDtlMapper lfRecivDtlMapper;

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LfRecivDtl> selectByExample(LfRecivDtlExample example) {
        return lfRecivDtlMapper.selectByExample(example);
    }

    /**
     * 
    * @Description: 客户应收明细表
    * @param pageData
    * @param example
    * @return
    * @return
     */
	@Override
	public Page<RecivPageDto> searchReceivableAndPage(
			Page<RecivPageDto> pageData, CustRecivDetailExample example) {
		List<RecivPageDto>  RecivPageList  = lfRecivDtlMapper.searchReceivableAndPage(pageData, example);
		if(RecivPageList!=null&&RecivPageList.size()>0){
			List<Long> ids = new ArrayList<Long>();
            for (RecivPageDto recDto : RecivPageList) {
                ids.add(recDto.getRecivId());
            }
            String idsStr = ids.toString();
            LfRecivDtlExample examp = new LfRecivDtlExample();
            examp.setRecivIds(idsStr.substring(1, idsStr.length()-1));
            //费用明细
            List<LfRecivDtl> receivableDetailList = lfRecivDtlMapper.selectByExample(examp);
            for(RecivPageDto recDto : RecivPageList){
            	Date calculDate = new Date();
                if (recDto.getStatus().equals(LfReciv.STATUS_PAID)&& recDto.getActualRpmntDate() != null) {
                    calculDate = recDto.getActualRpmntDate();
                }
                int overdueDays = LoanUtils.calculateOverdueDays(recDto.getRpmntDate(), recDto.getMaxRpmntDate(), recDto.getRpmntDate(), calculDate);
                recDto.setOverdueDays(overdueDays);
                if (receivableDetailList != null && receivableDetailList.isEmpty() == false) {
                    List<LfRecivDtl> receivableDetails = new ArrayList<LfRecivDtl>();
                    for (LfRecivDtl receivableDetail : receivableDetailList) {
                        if (receivableDetail.getRecivId().compareTo(recDto.getRecivId()) == 0) {
                        	
                            receivableDetails.add(receivableDetail);
                        }
                    }
                    recDto.setReceivableDetails(receivableDetails);
                }
                
            }
            
		}
		return pageData;
	}

    /**
     * @Description: 查询所有的放款类别
     * @return List<SysPaymentTypeDto>
     */
	@Override
    @Cacheable(value="typeCache", key="'LfRecivDtlService_selectAllPaymentType'")
	public List<SysPaymentTypeDto> selectAllPaymentType() {
		return lfRecivDtlMapper.selectAllPaymentType();
	}

}
