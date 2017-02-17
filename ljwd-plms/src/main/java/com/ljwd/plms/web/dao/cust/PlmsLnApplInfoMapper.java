package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.mapp.vo.customer.APPApplInfoVo;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfo;
import com.ljwd.plms.web.model.cust.PlmsLnApplInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户贷款信息,plms_ln_appl_info
 * */
public interface PlmsLnApplInfoMapper extends GenericDao<PlmsLnApplInfo,Long>{

    int countByExample(PlmsLnApplInfoExample example);

    int deleteByExample(PlmsLnApplInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLnApplInfo record);

    int insertSelective(PlmsLnApplInfo record);

    List<PlmsLnApplInfo> selectByExample(PlmsLnApplInfoExample example);

    PlmsLnApplInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLnApplInfo record, @Param("example") PlmsLnApplInfoExample example);

    int updateByExample(@Param("record") PlmsLnApplInfo record, @Param("example") PlmsLnApplInfoExample example);

    int updateByPrimaryKeySelective(PlmsLnApplInfo record);

    int updateByPrimaryKey(PlmsLnApplInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsLnApplInfo> selectByExampleAndPage(Page<PlmsLnApplInfo> page, PlmsLnApplInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的借款申请
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsLnApplInfo> findMfbmsApplByDocnoList(List<String> docnoList);

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
    APPApplInfoVo selectByApplId(Long applId);
}