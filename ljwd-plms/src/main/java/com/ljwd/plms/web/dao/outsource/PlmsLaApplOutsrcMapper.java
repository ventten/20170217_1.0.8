package com.ljwd.plms.web.dao.outsource;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import java.util.List;

import com.ljwd.plms.web.vo.outsource.*;
import org.apache.ibatis.annotations.Param;

/**
 * 委外申请表,PLMS_LA_APPL_OUTSRC
 * */
public interface PlmsLaApplOutsrcMapper extends GenericDao<PlmsLaApplOutsrc,Long>{

    int countByExample(PlmsLaApplOutsrcExample example);

    int deleteByExample(PlmsLaApplOutsrcExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLaApplOutsrc record);

    int insertSelective(PlmsLaApplOutsrc record);

    List<PlmsLaApplOutsrc> selectByExample(PlmsLaApplOutsrcExample example);

    PlmsLaApplOutsrc selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLaApplOutsrc record, @Param("example") PlmsLaApplOutsrcExample example);

    int updateByExample(@Param("record") PlmsLaApplOutsrc record, @Param("example") PlmsLaApplOutsrcExample example);

    int updateByPrimaryKeySelective(PlmsLaApplOutsrc record);

    int updateByPrimaryKey(PlmsLaApplOutsrc record);

    /**
     * 查找委外最大限制次数
     * */
    Integer selectOutsourceMaxNum();

    /**
     * 发起委外申请时根据借款IDS查找案件信息
     * @param applIds 查询条件
     * @return 实体集
     */
    List<AddOutsrcApplDto> selectAddOutsrcApplByApplIds(List<Long> applIds);

    /**
     * 条件查询操作时需要的委外申请信息
     * @param example 查询条件
     * @return 实体集
     */
    List<OutsrcDto> selectOutsrcByExample(OutsrcExample example);

    /**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<OutsrcPageDto> selectByExampleAndPage(Page<OutsrcPageDto> page, OutsrcPageExample example);

    /**
     * 条件查询导出的数据
     * @param example 查询条件
     * @return List数据
     */
    List<OutsrcPageDto> selectByExampleAndPage(OutsrcPageExample example);

    /**
     * 根据借款ID查询最新的委外记录
     * @param applId 借款ID
     * @return 实体
     */
    OutsrcRecordDto selectOutsrcRecordByApplId(Long applId);

    /**
     * 查询委外导出联系人通讯信息
     * @param example 查询条件
     * @return List数据
     */
    List<OutsrcContactorExcelDto> selectOutsrcContactorExcel(OutsrcPageExample example);

    /**
     * 查询委外导出联系人地址信息
     * @param example 查询条件
     * @return List数据
     */
    List<OutsrcAddressExcelDto> selectOutsrcAddressExcel(OutsrcPageExample example);

}