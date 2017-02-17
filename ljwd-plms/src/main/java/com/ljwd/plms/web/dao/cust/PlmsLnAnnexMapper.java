package com.ljwd.plms.web.dao.cust;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 附件表,plms_ln_annex
 * */
public interface PlmsLnAnnexMapper extends GenericDao<PlmsLnAnnex,Long>{

    int countByExample(PlmsLnAnnexExample example);

    int deleteByExample(PlmsLnAnnexExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PlmsLnAnnex record);

    int insertSelective(PlmsLnAnnex record);

    List<PlmsLnAnnex> selectByExample(PlmsLnAnnexExample example);

    PlmsLnAnnex selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PlmsLnAnnex record, @Param("example") PlmsLnAnnexExample example);

    int updateByExample(@Param("record") PlmsLnAnnex record, @Param("example") PlmsLnAnnexExample example);

    int updateByPrimaryKeySelective(PlmsLnAnnex record);

    int updateByPrimaryKey(PlmsLnAnnex record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsLnAnnex> selectByExampleAndPage(Page<PlmsLnAnnex> page, PlmsLnAnnexExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的附件
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsLnAnnex> findMfbmsAnnexByDocnoList(List<String> docnoList);

}