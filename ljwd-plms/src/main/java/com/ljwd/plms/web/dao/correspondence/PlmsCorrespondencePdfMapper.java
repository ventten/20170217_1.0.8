package com.ljwd.plms.web.dao.correspondence;

import java.util.List;


import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateDto;
/**
 * 
 * ClassName: CorrespondencePdfMapper 
 * @Description: 信函信息
 * @author zhengjizhao
 * @date 2016年10月19日下午5:01:21
 */
public interface PlmsCorrespondencePdfMapper extends GenericDao<PlmsOverdueClientLetterGenerateDto, Long>{

	/**
	 * 
	 * @Description: 通过合同号查询被选中的信函信息
	 * @param  contractNo 合同号
	 * @return List<PlmsOverdueClientLetterGenerateDto>  
	 * @author zhengjizhao
	 * @date 2016年10月19日下午5:00:09
	 */
	List<PlmsOverdueClientLetterGenerateDto>  findSelectDataByContractNo(List<String> contractNoss);
	/**
	 * 
	 * @Description: 在信函信息表中插入生成信函的数据信息
	 * @param pcgd
	 * @return int  
	 * @author zhengjizhao
	 * @date 2016年10月26日下午2:21:48
	 */
	int insertPlmsDocumentGenLogDto(PlmsDocumentGenLogDto pcgd);
}
