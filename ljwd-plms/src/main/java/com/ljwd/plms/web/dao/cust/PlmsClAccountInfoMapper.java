package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfo;
import java.util.List;

import com.ljwd.plms.web.model.cust.PlmsClAccountInfoExample;
import org.apache.ibatis.annotations.Param;

/**
 * 客户流水账号信息,plms_cl_account_info
 * */
public interface PlmsClAccountInfoMapper extends GenericDao<PlmsClAccountInfo, Long> {

    int countByExample(PlmsClAccountInfoExample example);

    int deleteByExample(PlmsClAccountInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsClAccountInfo record);

    int insertSelective(PlmsClAccountInfo record);

    List<PlmsClAccountInfo> selectByExample(PlmsClAccountInfoExample example);

    PlmsClAccountInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsClAccountInfo record, @Param("example") PlmsClAccountInfoExample example);

    int updateByExample(@Param("record") PlmsClAccountInfo record, @Param("example") PlmsClAccountInfoExample example);

    int updateByPrimaryKeySelective(PlmsClAccountInfo record);

    int updateByPrimaryKey(PlmsClAccountInfo record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsClAccountInfo> selectByExampleAndPage(Page<PlmsClAccountInfo> page, PlmsClAccountInfoExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的流水信息
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsClAccountInfo> findMfbmsAccountByDocnoList(List<String> docnoList);

}