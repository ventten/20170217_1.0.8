package com.ljwd.plms.web.dao.case_management;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvance;
import com.ljwd.plms.web.model.case_management.PlmsLTransferAdvanceExample;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceParam;
import com.ljwd.plms.web.vo.case_management.PlmsLTransferAdvanceResult;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 提前移交案件表,PLMS_L_TRANSFER_ADVANCE
 * */
public interface PlmsLTransferAdvanceMapper extends GenericDao<PlmsLTransferAdvance, Long>{

    int countByExample(PlmsLTransferAdvanceExample example);

    int deleteByExample(PlmsLTransferAdvanceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlmsLTransferAdvance record);

    int insertSelective(PlmsLTransferAdvance record);

    List<PlmsLTransferAdvance> selectByExample(PlmsLTransferAdvanceExample example);

    PlmsLTransferAdvance selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlmsLTransferAdvance record, @Param("example") PlmsLTransferAdvanceExample example);

    int updateByExample(@Param("record") PlmsLTransferAdvance record, @Param("example") PlmsLTransferAdvanceExample example);

    int updateByPrimaryKeySelective(PlmsLTransferAdvance record);

    int updateByPrimaryKey(PlmsLTransferAdvance record);

    /**
    * @Description: 提前移交案件分页数据
    * @param pageData 分页数据
    * @param example 查询条件
    * @return List<PlmsLTransferAdvance>
     */
    List<PlmsLTransferAdvanceResult> selectTransferAdvanceAndPage(Page<PlmsLTransferAdvanceResult> pageData, PlmsLTransferAdvanceParam example);
    
    /**
	 * 
	* @Description: 根据paymentId查询
	* @param map
	* @return
	* @return List<PlmsLTransferAdvance>
	 */
	PlmsLTransferAdvance selectMaxDateTransferAdvanceByPaymentId(Map<String,Object> map);

    /**
    * @Title: 根据借款IDS和状态查找
    * @Description: TODO(根据借款IDS和状态查找)
	* @param applIds 借款IDS
	* @param statusS 状态
	* @return 实体集
	*/
    List<PlmsLTransferAdvance> selectByApplIdsAndStatusS(@Param("applIds") List<Long> applIds,@Param("statusS") List<String> statusS);

}