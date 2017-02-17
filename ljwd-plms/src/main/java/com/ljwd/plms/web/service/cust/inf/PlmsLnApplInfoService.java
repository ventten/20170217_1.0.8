package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.mapp.vo.customer.APPApplInfoVo;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfo;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfoExample;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;

import java.util.List;

/**
 * 客户贷款信息,plms_ln_appl_info
 * */
public interface PlmsLnApplInfoService extends GenericService<PlmsLnApplInfo,Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsLnApplInfo> selectByExampleAndPage(Page<PlmsLnApplInfo> page, PlmsLnApplInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的借款申请
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsLnApplInfo> findMfbmsApplByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    public void insertBatch(List<PlmsLnApplInfo> list);

    /**
     * 批量更新
     * @param list 添加的数据集合
     * */
    public void updateBatch(List<PlmsLnApplInfo> list);

    /**
     * 查找微贷系统已结清且贷后系统在途中的借款(只有id、recVer、clearDate三字段有值)
     * */
    public List<PlmsLnApplInfo> findSettleApplyFromMfbms();

    /**
     * 根据贷后的客户ID,查找最大的未结清的微贷借款ID
     * @param clCustId 贷后客户ID
     * @return 最大未结清的借款ID
     * */
    public Long findNoSettleApplIdByClCustId(Long clCustId);

    /**
     * 通过微贷系统订单ID查询订单信息
     * @param applId 微贷系统订单ID
     * @return 返回该订单信息
     */
    public APPApplInfoVo selectByApplId(Long applId);

}