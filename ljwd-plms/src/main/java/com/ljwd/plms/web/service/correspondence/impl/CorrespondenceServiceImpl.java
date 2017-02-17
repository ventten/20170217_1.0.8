package com.ljwd.plms.web.service.correspondence.impl;

import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.ExportExcel;
import com.ljwd.plms.web.dao.case_collection.PlmsLaCollectionRecordMapper;
import com.ljwd.plms.web.dao.correspondence.PlmsCorrespondenceMapper;
import com.ljwd.plms.web.dao.correspondence.PlmsCorrespondencePdfMapper;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.correspondence.PlmsLnCorresLog;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogDto;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogSearchParamDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateParamDto;
import com.ljwd.plms.web.model.correspondence.PlmsRebackTypeEntry;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.correspondence.inf.CorrespondenceService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.correspondence.PlmCoDig;
import com.ljwd.plms.web.vo.correspondence.PlmsAddrInfoEntry;
import com.ljwd.plms.web.vo.correspondence.PlmsAddrTypeSelectData;
import com.ljwd.plms.web.vo.correspondence.PlmsCollectorInfo;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresExportDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresLogDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresRebackInfo;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresondenceCategory;
import com.ljwd.plms.web.vo.correspondence.PlmsDocumentGenLogTelDto;
import com.ljwd.plms.web.vo.correspondence.PlmsSiteCodeSelectData;
@Service
public class CorrespondenceServiceImpl extends GenericServiceImpl<PlmsOverdueClientLetterGenerateDto, Long> implements CorrespondenceService{
	@Resource
    private PlmsLaCollectionRecordMapper plmsLaCollectionRecordMapper;
	@Resource
    private PlmsCorrespondenceMapper correspondenceMapper;
	@Resource
    private PlmsCorrespondencePdfMapper correspondencePdfMapper;
	@Override
	public Page<PlmsOverdueClientLetterGenerateDto> selectByCorrespondenceAndPage(
			Page<PlmsOverdueClientLetterGenerateDto> page,
			PlmsOverdueClientLetterGenerateParamDto example) {
		 correspondenceMapper.selectByCorrespondenceAndPage(page, example);
		 return page;
	}

	@Override
	public GenericDao<PlmsOverdueClientLetterGenerateDto, Long> getDao() {
		return correspondenceMapper;
	}

	@Override
	public Page<PlmsDocumentGenLogDto> selectLetterGenerateLogAndPage(
			Page<PlmsDocumentGenLogDto> page, PlmsDocumentGenLogSearchParamDto example) {
		correspondenceMapper.selectLetterGenerateLogAndPage(page, example);
		return page;
	}

	@Override
	public List<PlmsCorresondenceCategory> selectCategory() {
		return correspondenceMapper.selectCategory();
	}

	@Override
	public void updateCorresStatus(List<Long> id) {
		for(int i=0;i<id.size();i++){
			PlmsDocumentGenLogDto plmsDocumentGenLogDto = correspondenceMapper.selectCorresLogByLogId(id.get(i));
			PlmsLnCorresLog plmsCorresLogInfo = new PlmsLnCorresLog();
	    	plmsCorresLogInfo.setApplId(plmsDocumentGenLogDto.getApplyId());
	    	plmsCorresLogInfo.setLogContent("编号"+plmsDocumentGenLogDto.getCorresCode()+"的信函已由"+plmsDocumentGenLogDto.getGenByName()+"确认寄送");
	    	plmsCorresLogInfo.setGenByName(plmsDocumentGenLogDto.getGenByName());
	    	//登录用户
	        String loginUser = SubjectUtil.getUserId();
	        plmsCorresLogInfo.setCreatedBy(loginUser);
	        plmsCorresLogInfo.setUpdatedBy(loginUser);
	        correspondenceMapper.insertCorresLog(plmsCorresLogInfo);
		}
		correspondenceMapper.updateCorresStatus(id);
	}

	@Override
	public List<PlmsCorresExportDto> findExportExcelCorres(
			PlmsDocumentGenLogSearchParamDto example) {
		List<PlmsCorresExportDto> list = correspondenceMapper.findExportExcelCorres(example);
		return list;
	}

	@Override
	public void getExportExcelCorres(String title, String[] headers,List<PlmsCorresExportDto> list, OutputStream out, String pattern) {
		ExportExcel<PlmsCorresExportDto> ex = new ExportExcel<PlmsCorresExportDto>();
		try{
			ex.cutDataAndToCreateExcel(title, headers, list, out, pattern);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public List<PlmsSiteCodeSelectData> findSiteCodeSelect() {
		return correspondenceMapper.findSiteCodeSelect();
	}

	@Override
	public List<PlmsAddrTypeSelectData> findAddrTypeSelect() {
		return correspondenceMapper.findAddrTypeSelect();
	}

	@Override
	public List<PlmsOverdueClientLetterGenerateDto> findSelectDataByContractNo(
			List<String> contractNo) {
		return correspondencePdfMapper.findSelectDataByContractNo(contractNo);
	}

	@Override
	public void insertPlmsDocumentGenLogDto(PlmsDocumentGenLogDto plmsDocumentGenLogDto) {
		correspondencePdfMapper.insertPlmsDocumentGenLogDto(plmsDocumentGenLogDto);
	}

	@Override
	public PlmsDocumentGenLogDto selectCorrImfomationById(Long corrId,String clientName,String idCardNo) {
		PlmsDocumentGenLogDto plmsDocumentGenLogDto= new PlmsDocumentGenLogDto();
		try{
			plmsDocumentGenLogDto =correspondenceMapper.selectCorrImfomationById(corrId,clientName);
			//查找最新的电话号显示
			PlmsDocumentGenLogTelDto  telInfo= correspondenceMapper.selectCorrTelImfomationById(clientName,idCardNo);
			if(telInfo != null){
				plmsDocumentGenLogDto.setClientPhone(telInfo.getTel());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return plmsDocumentGenLogDto;
	}

	@Override
	public PlmsCollectorInfo selectCollectorInfo(String contrctNo) {
		return correspondenceMapper.selectCollectorInfo(contrctNo);
	}

	@Override
	public PlmsDocumentGenLogTelDto selectCorrTelImfomationById(String clientName,
			String idCardNo) {
		return correspondenceMapper.selectCorrTelImfomationById(clientName,idCardNo);
	}

	@Override
	public List<PlmsOverdueClientLetterGenerateDto> selectByCorrespondenceList(
			PlmsOverdueClientLetterGenerateParamDto example) {
		return correspondenceMapper.selectByCorrespondenceAndPage(example);
	}

	@Override
	public void updateStatusRebackInfo(PlmsCorresRebackInfo plmsCorresRebackInfo) {
		correspondenceMapper.updateStatusRebackInfo(plmsCorresRebackInfo);
	}

	@Override
	public List<PlmsRebackTypeEntry> selectRebackTypeOne(String para) {
		return correspondenceMapper.selectRebackTypeOne(para);
		 
	}

	@Override
	public void insertCorresLog(PlmsLnCorresLog plmsCorresLogInfo) {
		correspondenceMapper.insertCorresLog(plmsCorresLogInfo);
		
	}

	@Override
	public Page<PlmsCorresLogDto> selectCorresLogAndPage(Page<PlmsCorresLogDto> page,PlmsDocumentGenLogSearchParamDto example) {
		 correspondenceMapper.selectCorresLogAndPage(page, example);
		 return page;
	}

	@Override
	public PlmsDocumentGenLogDto selectCorresLogByLogId(Long id) {
		return correspondenceMapper.selectCorresLogByLogId(id);
	}

	@Override
	public Boolean insertCorresData(PlmsDocumentGenLogDto plmsDocumentGenLogDto) {
		try {
			correspondencePdfMapper.insertPlmsDocumentGenLogDto(plmsDocumentGenLogDto);
			PlmsLnCorresLog plmsCorresLogInfo = new PlmsLnCorresLog();
	    	plmsCorresLogInfo.setApplId(plmsDocumentGenLogDto.getApplyId());
	    	plmsCorresLogInfo.setLogContent(plmsDocumentGenLogDto.getGenByName()+"通过系统生成《"+plmsDocumentGenLogDto.getDocumentName()+"》，寄送地址为"+plmsDocumentGenLogDto.getAddrType());
	    	plmsCorresLogInfo.setGenByName(plmsDocumentGenLogDto.getGenByName());
	    	//登录用户
	        String loginUser = SubjectUtil.getUserId();
	        plmsCorresLogInfo.setCreatedBy(loginUser);
	        plmsCorresLogInfo.setUpdatedBy(loginUser);
	        correspondenceMapper.insertCorresLog(plmsCorresLogInfo);
			addCollectionRecordCorres(plmsDocumentGenLogDto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	/**
     * 新增催记
     * */
    private void addCollectionRecordCorres(PlmsDocumentGenLogDto plmsDocumentGenLogDto) throws Exception{
        PlmsLaCollectionRecord collectionRecord = new PlmsLaCollectionRecord();
        collectionRecord.setApplId(plmsDocumentGenLogDto.getApplyId()); //借款申请id
        collectionRecord.setCollectTime(plmsDocumentGenLogDto.getGenTime()); //催收时间---等于信函的生成时间
        collectionRecord.setFollowedBy(plmsDocumentGenLogDto.getFollowedBy()); //跟进人
        collectionRecord.setCollectMthd("LETTER"); //催收类型 -- 信函
        if("住宅地址".equals(plmsDocumentGenLogDto.getAddrType())){  
        	collectionRecord.setResult("LETTER_HOME"); //催收代码
        	//跟进情况
            collectionRecord.setStatus("LETTER_HOME");
        }else if("公司地址".equals(plmsDocumentGenLogDto.getAddrType())){
        	collectionRecord.setResult("LETTER_UNIT");
        	//跟进情况
            collectionRecord.setStatus("LETTER_UNIT");
        }else if("户口地址".equals(plmsDocumentGenLogDto.getAddrType())){
        	collectionRecord.setResult("LETTER_HOUSEHOLD");
        	//跟进情况
            collectionRecord.setStatus("LETTER_HOUSEHOLD");
        }else{
        	collectionRecord.setResult("LETTER_NEW"); //其他地址
        	//跟进情况
            collectionRecord.setStatus("LETTER_NEW");
        }
        collectionRecord.setContent(plmsDocumentGenLogDto.getGenByName()+"通过系统生成《"+plmsDocumentGenLogDto.getDocumentName()+"》，寄送地址为"+plmsDocumentGenLogDto.getAddrType());  //内容
        //管控状态
        collectionRecord.setControlStatus("Letters");
        collectionRecord.setRltn("12"); //关系
        
        collectionRecord.setContactor(plmsDocumentGenLogDto.getClientName()); //联系人
        if(plmsDocumentGenLogDto.getClientPhone() != null){
        	collectionRecord.setTel(plmsDocumentGenLogDto.getClientPhone()); //电话
        }
        //登录用户
        String loginUser = SubjectUtil.getUserId();
        collectionRecord.setCreatedBy("system");
        collectionRecord.setUpdatedBy(loginUser);
        plmsLaCollectionRecordMapper.insert(collectionRecord);
    }

	@Override
	public PlmCoDig selectCorresSNo(String differ) {
		return correspondenceMapper.selectCorresSNo(differ);
	}

	@Override
	public void updateCorresSNo(Integer countNo,Date nowTime,String differ) {
		correspondenceMapper.updateCorresSNo(countNo,nowTime,differ);
	}

	

	

	



}
