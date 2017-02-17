package com.ljwd.plms.web.service.case_collection.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.case_collection.LfOfferExemptMapper;
import com.ljwd.plms.web.model.case_collection.LfOfferExempt;
import com.ljwd.plms.web.model.case_collection.LfOfferExemptExample;
import com.ljwd.plms.web.service.case_collection.inf.LfOfferExemptService;
import com.ljwd.plms.web.vo.case_collection.ApplyExemptDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhengzw on 2016/9/1
 * 免除自动代扣,LF_OFFER_EXEMPT
 */
@Service
public class LfOfferExemptServiceImpl extends GenericServiceImpl<LfOfferExempt,Long> implements LfOfferExemptService {

    @Resource
    private LfOfferExemptMapper lfOfferExemptMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<LfOfferExempt, Long> getDao() {
        return lfOfferExemptMapper;
    }

    /**
     * 插入对象
     * @param lfOfferExempt 对象
     */
    @Override
    public int insert(LfOfferExempt lfOfferExempt) {
        return lfOfferExemptMapper.insert(lfOfferExempt);
    }

    /**
     * 根据条件计数
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(LfOfferExemptExample example) {
        return lfOfferExemptMapper.countByExample(example);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<LfOfferExempt> selectByExample(LfOfferExemptExample example) {
        return lfOfferExemptMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<LfOfferExempt> selectByExampleAndPage(Page<LfOfferExempt> page, LfOfferExemptExample example) {
        lfOfferExemptMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据主贷人或者合同编号查找合同
     * @param custName 主贷人
     * @param cntrctNo 合同编号
     * @return 实体集
     */
    @Override
    public List<ApplyExemptDto> selectApplyExempt(String custName, String cntrctNo) {
        return lfOfferExemptMapper.selectApplyExempt(custName, cntrctNo);
    }

}
