package com.ljwd.plms.web.service.sys_management.inf;

import java.util.List;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoDto;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoInsertDto;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoSearchDto;

/**
 * 
 * ClassName: PlmsCorresManageService 
 * @Description: 信函模板管理service接口
 * @author zhengjizhao
 * @date 2016年11月1日下午3:27:12
 */
public interface PlmsCorresManageService {

	/**
	 * 
	 * @Description: 新增模板
	 * @param  plmsPdfCorresInfoDto   实体
	 * @author zhengjizhao
	 * @date 2016年11月1日下午4:32:37
	 */
	void insertPdfCorresFile(PlmsPdfCorresInfoInsertDto plmsPdfCorresInfoDto);
	/**
	 * 
	 * @Description: 根据主键ID删除模板
	 * @param  id   主键ID
	 * @author zhengjizhao
	 * @date 2016年11月1日下午4:32:56
	 */
	void deletePdfCorresFileById(Long id);
	/**
	 * 
	 * @Description: 通过模板ID查询模板存储的地址
	 * @param  id 模板ID
	 * @return PlmsPdfCorresInfoDto  
	 * @author zhengjizhao
	 * @date 2016年11月3日下午4:09:28
	 */
	PlmsPdfCorresInfoDto selectCorresPdfDataById(Long id);
	/**
	 * 
	 * @Description: 根据ID更新模板信息
	 * @param  plmsPdfCorresInfoDto   
	 * @author zhengjizhao
	 * @date 2016年11月1日下午4:37:59
	 */
	void updatePdfCorresFileByModel(PlmsPdfCorresInfoInsertDto plmsPdfCorresInfoDto); 
	/**
	 * 
	 * @Description: 分页查询模板数据
	 * @param  page
	 * @param  plmsPdfCorresInfoDto
	 * @return Page<PlmsPdfCorresInfoDto>  
	 * @author zhengjizhao
	 * @date 2016年11月3日上午11:14:50
	 */
	Page<PlmsPdfCorresInfoDto> selectCorresManaDataForPage(Page<PlmsPdfCorresInfoDto> page,PlmsPdfCorresInfoSearchDto dto);
	/**
	 * 
	 * @Description: 查询模板记录表中的所有模板记录
	 * @return List<PlmsPdfCorresInfoDto>  
	 * @author zhengjizhao
	 * @date 2016年12月29日上午11:41:57
	 */
	List<PlmsPdfCorresInfoDto> selectAllCorresPdfInfo();
}
