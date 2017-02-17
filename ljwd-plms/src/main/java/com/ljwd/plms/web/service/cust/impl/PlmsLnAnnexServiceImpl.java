package com.ljwd.plms.web.service.cust.impl;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.web.dao.cust.PlmsLnAnnexMapper;
import com.ljwd.plms.web.model.cust.PlmsLnAnnex;
import com.ljwd.plms.web.model.cust.PlmsLnAnnexExample;
import com.ljwd.plms.web.service.cust.inf.PlmsLnAnnexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 附件表,plms_ln_annex
 * */
@Service
public class PlmsLnAnnexServiceImpl extends GenericServiceImpl<PlmsLnAnnex,Long> implements PlmsLnAnnexService {

    @Resource
    private PlmsLnAnnexMapper plmsLnAnnexMapper;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLnAnnex, Long> getDao() {
        return plmsLnAnnexMapper;
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<PlmsLnAnnex> selectByExampleAndPage(Page<PlmsLnAnnex> page, PlmsLnAnnexExample example) {
        plmsLnAnnexMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 根据客户身份证号集合查询微贷系统中未添加到贷后系统的附件
     * @param docnoList 客户身份证号集合
     * @return 实体集
     */
    @Override
    public List<PlmsLnAnnex> findMfbmsAnnexByDocnoList(List<String> docnoList) {
        if(docnoList == null || docnoList.size() <= 0){
            return null;
        }
        return plmsLnAnnexMapper.findMfbmsAnnexByDocnoList(docnoList);
    }

    /**
     * 插入对象
     * @param plmsLnAnnex 对象
     */
    @Override
    public int insert(PlmsLnAnnex plmsLnAnnex) {
        return plmsLnAnnexMapper.insert(plmsLnAnnex);
    }

    /**
    * @Description: 根据条件查询附件列表 
    * @param example
    * @return
    * @return
     */
	@Override
	public List<PlmsLnAnnex> selectByExample(PlmsLnAnnexExample example) {

		return plmsLnAnnexMapper.selectByExample(example);
	}

}
