package com.ljwd.plms.web.service.sys_management.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.web.dao.sys_management.PlmsCorresManagerMapper;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoDto;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoInsertDto;
import com.ljwd.plms.web.model.sys_management.PlmsPdfCorresInfoSearchDto;
import com.ljwd.plms.web.service.sys_management.inf.PlmsCorresManageService;

/**
 * 
 * ClassName: PlmsCorresManageServiceImpl 
 * @Description: 信函模板管理service接口实现类
 * @author zhengjizhao
 * @date 2016年11月1日下午3:27:57
 */
@Service
public class PlmsCorresManageServiceImpl implements PlmsCorresManageService{

	@Resource
	private PlmsCorresManagerMapper plmsCorresManagerMapper;
	@Override
	public void insertPdfCorresFile(PlmsPdfCorresInfoInsertDto plmsPdfCorresInfoDto) {
		plmsCorresManagerMapper.insertPdfCorresFile(plmsPdfCorresInfoDto);
		
	}

	@Override
	public void deletePdfCorresFileById(Long id) {
		plmsCorresManagerMapper.deletePdfCorresFileById(id);
		
	}

	@Override
	public void updatePdfCorresFileByModel(PlmsPdfCorresInfoInsertDto plmsPdfCorresInfoDto) {
		plmsCorresManagerMapper.updatePdfCorresFileByModel(plmsPdfCorresInfoDto);
		
	}

	@Override
	public Page<PlmsPdfCorresInfoDto> selectCorresManaDataForPage(
			Page<PlmsPdfCorresInfoDto> page,
			PlmsPdfCorresInfoSearchDto dto) {
		 plmsCorresManagerMapper.selectCorresManaDataForPage(page,dto);
		 return page;
	}

	@Override
	public PlmsPdfCorresInfoDto selectCorresPdfDataById(Long id) {
		return plmsCorresManagerMapper.selectCorresPdfDataById(id);
	}

	@Override
	public List<PlmsPdfCorresInfoDto> selectAllCorresPdfInfo() {
		return plmsCorresManagerMapper.selectAllCorresPdfInfo();
	}

}
