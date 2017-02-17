package com.ljwd.plms.web.service.cust.inf;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;

import java.util.List;

/**
 * 附件表,plms_ln_annex
 * */
public interface PlmsLnAnnexService extends GenericService<PlmsLnAnnex,Long> {

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsLnAnnex> selectByExampleAndPage(Page<PlmsLnAnnex> page, PlmsLnAnnexExample example);

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的附件
     * @param docnoList 客户身份证号集合
     * @return 实体集
     * */
    public List<PlmsLnAnnex> findMfbmsAnnexByDocnoList(List<String> docnoList);

    /**
     * 批量添加
     * @param list 添加的数据集合
     * */
    public void insertBatch(List<PlmsLnAnnex> list);
    /**
     * 
    * @Description: 根据条件查询附件列表 
    * @param example
    * @return
    * @return List<PlmsLnAnnex>
     */
    List<PlmsLnAnnex> selectByExample(PlmsLnAnnexExample example);

}