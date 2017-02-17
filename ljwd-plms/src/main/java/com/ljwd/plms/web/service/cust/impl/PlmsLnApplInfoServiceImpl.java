package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.mapp.vo.customer.APPApplInfoVo;
import com.ljwd.plms.web.dao.cust.PlmsLnApplInfoMapper;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfo;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfoExample;
import com.ljwd.plms.web.model.cust.PlmsLnPolyInfoExample;
import com.ljwd.plms.web.service.cust.inf.PlmsLnApplInfoService;
import com.ljwd.plms.web.wsdl.webservice.util.WebServiceUtil;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 客户贷款信息,plms_ln_appl_info
 * */
@Service
public class PlmsLnApplInfoServiceImpl extends GenericServiceImpl<PlmsLnApplInfo,Long> implements PlmsLnApplInfoService {

    @Resource
    private PlmsLnApplInfoMapper plmsLnApplInfoMapper;
    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLnApplInfo, Long> getDao() {
        return plmsLnApplInfoMapper;
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsLnApplInfo> selectByExampleAndPage(Page<PlmsLnApplInfo> page, PlmsLnApplInfoExample example) {
        plmsLnApplInfoMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的借款申请
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsLnApplInfo> findMfbmsApplByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsLnApplInfoMapper.findMfbmsApplByDocnoList(docnoList);
    }

    /**
     * 查找微贷系统已结清且贷后系统在途中的借款(只有id、recVer、clearDate三字段有值)
     */
    @Override
    public List<PlmsLnApplInfo> findSettleApplyFromMfbms() {
        return plmsLnApplInfoMapper.findSettleApplyFromMfbms();
    }

    /**
     * 根据贷后的客户ID,查找最大的未结清的微贷借款ID
     * @param clCustId 贷后客户ID
     * @return 最大未结清的借款ID
     */
    @Override
    public Long findNoSettleApplIdByClCustId(Long clCustId) {
        if(clCustId == null){
            return null;
        }
        return plmsLnApplInfoMapper.findNoSettleApplIdByClCustId(clCustId);
    }

    /**
     * 通过微贷系统订单ID查询订单信息
     * @param applId 微贷系统订单ID
     * @return 返回该订单信息
     */
    @Override
    public APPApplInfoVo selectByApplId(Long applId) {
        return plmsLnApplInfoMapper.selectByApplId(applId);
    }

}