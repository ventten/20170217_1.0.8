package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcCom;
import com.ljwd.plms.web.model.outsource.PlmsOutsrcComExample;
import java.math.BigDecimal;
import java.util.List;

import com.ljwd.plms.web.vo.outsource.WdCorpDto;
import org.apache.ibatis.annotations.Param;

/**
 * 委外机构,PLMS_OUTSRC_COM
 * */
public interface PlmsOutsrcComMapper extends GenericDao<PlmsOutsrcCom,Long>{

    int countByExample(PlmsOutsrcComExample example);

    int deleteByExample(PlmsOutsrcComExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsOutsrcCom record);

    int insertSelective(PlmsOutsrcCom record);

    List<PlmsOutsrcCom> selectByExample(PlmsOutsrcComExample example);

    PlmsOutsrcCom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsOutsrcCom record, @Param("example") PlmsOutsrcComExample example);

    int updateByExample(@Param("record") PlmsOutsrcCom record, @Param("example") PlmsOutsrcComExample example);

    int updateByPrimaryKeySelective(PlmsOutsrcCom record);

    int updateByPrimaryKey(PlmsOutsrcCom record);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsOutsrcCom> selectByExampleAndPage(Page<PlmsOutsrcCom> page, PlmsOutsrcComExample example);

    /**
     * 根据区域ID查询启用的委外机构,并按优先级降序排序(一手案件分配用)
     * @param regionId 区域ID
     * @return 实体集
     */
    List<PlmsOutsrcCom> selectFirstByRegionId(Long regionId);

    /**
     * 根据区域ID查询启用的委外机构和机构二手案件在户数,并按在户数升序、优先级降序排序(二手案件分配用)
     * @param regionId 区域ID
     * @return 实体集
     */
    List<PlmsOutsrcCom> selectSecondByRegionId(Long regionId);

    /**
     * 根据区域ID查询启用的委外机构,及委外机构的二手案件在户数,并根据借款ID、委外批次编号查询此借款是否委外过给委外机构,并按照是否委外(先否后是)、在户数升序、机构优先级降序排序
     * @param regionId 区域ID
     * @param applId 借款ID
     * @param lotNo 委外批次编号
     * @return 实体集
     */
    List<PlmsOutsrcCom> selectByRegionIdApplIdLotNo(@Param("regionId")Long regionId,@Param("applId")Long applId,@Param("lotNo")String lotNo);

    /**
     * 查找微贷有效的外包公司
     * @return 实体集
     */
    List<WdCorpDto> selectWdCorp();

}