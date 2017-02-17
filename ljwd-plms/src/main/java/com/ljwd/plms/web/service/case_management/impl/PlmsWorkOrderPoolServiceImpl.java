package com.ljwd.plms.web.service.case_management.impl;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.type.*;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectControlService;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectMthdService;
import com.ljwd.plms.web.service.type.inf.TypeService;

import com.ljwd.plms.web.vo.case_collection.CaseCollectionExportDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.ExportExcel;
import com.ljwd.plms.web.dao.case_management.PlmsWorkOrderPoolMapper;
import com.ljwd.plms.web.model.case_management.PlmsWorkOrderPool;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionDto;
import com.ljwd.plms.web.vo.case_collection.CaseCollectionExample;
import com.ljwd.plms.web.vo.case_management.PlmsFeeWaiveApprovalResultDto;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseParam;
import com.ljwd.plms.web.vo.case_management.PlmsProtectCaseResultDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderAssignDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDetailDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolExportDto;
import com.ljwd.plms.web.vo.case_management.PlmsWorkOrderPoolParam;
import com.ljwd.plms.web.vo.case_management.SysProduct;

/**
 * 工单池/案件
 * */
@Service
public class PlmsWorkOrderPoolServiceImpl extends GenericServiceImpl<PlmsWorkOrderPool,Long> implements PlmsWorkOrderPoolService {

	@Resource
	private PlmsWorkOrderPoolMapper plmsWorkOrderPoolMapper;
	@Resource
	private TypeService typeService;

	@Override
	public GenericDao<PlmsWorkOrderPool, Long> getDao() {
		return plmsWorkOrderPoolMapper;
	}

    /**
     * 根据借款申请ID查找
     * @param applId 借款申请ID
     * @return 实体
     */
    @Override
    public PlmsWorkOrderPool selectByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        return plmsWorkOrderPoolMapper.selectByApplId(applId);
    }

    /**
	* @Description:  查询微贷系统中新的逾期数据
	* @param map
	* @return List<PlmsWorkOrderPoolDto>
	 */
	@Override
	public List<PlmsWorkOrderPoolDto> searchReceiveOverdue(
			Map<String, Object> map) {
		return plmsWorkOrderPoolMapper.searchReceiveOverdue(map);
	}

	/**
	* @Description: 批量插入从微贷系统导出的逾期新数据，每次插入2000条
	* @param list
	 */
	@Override
	public void insertBatch(List<PlmsWorkOrderPool> list) {
        if(list == null || list.isEmpty()){
            return;
        }
		int comm = 2000;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsWorkOrderPool> newList = new ArrayList<PlmsWorkOrderPool>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsWorkOrderPoolMapper.insertBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}
		}else{
			plmsWorkOrderPoolMapper.insertBatch(list);
		}
	}

	@Override
	public void updateBatch(List<PlmsWorkOrderPool> list) {
        if(list == null || list.isEmpty()){
            return;
        }
		int comm = 2000;
		int size = list.size()-1;
		if(size>=comm){
			List<PlmsWorkOrderPool> newList = new ArrayList<PlmsWorkOrderPool>();
			for(int i=0;i<=size;i++){
				if(i!=0&&i%comm==0||i==size){
					newList.add(list.get(i));
					plmsWorkOrderPoolMapper.updateBatch(newList);
					newList.clear();
				}else{
					newList.add(list.get(i));
				}
			}	
		}else{
			plmsWorkOrderPoolMapper.updateBatch(list);
		}
	}

	/**
	* @Description: 查询贷后中已存在逾期数据的最新状态
	* @param map
	* @return List<PlmsWorkOrderPoolDto>
	 */
	@Override
	public List<PlmsWorkOrderPoolDto> selectExitsReceiveOverdue(
			Map<String, Object> map) {
		if(map.get("statu").equals("circu")){
			return plmsWorkOrderPoolMapper.selectExitsReceiveOverdueCircu(map);
		}else if(map.get("statu").equals("clear")){
			return plmsWorkOrderPoolMapper.selectExitsReceiveOverdueClear(map);
		}else{
			return null;
		}
	}

	@Override
	public List<PlmsWorkOrderPool> selectByExampleList(
			com.ljwd.plms.web.model.case_management.PlmsWorkOrderPoolExample example) {
		return plmsWorkOrderPoolMapper.selectByExample(example);
	}

	/**
	* @Description: 查询自动分配的区间的新数据 
	* @param status
	* @return List<PlmsWorkOrderAssignDto>
	 */
	@Override
	public List<PlmsWorkOrderAssignDto> selectNewCircuNotAssignList(
			String status) {
		return plmsWorkOrderPoolMapper.selectNewCircuNotAssignList(status);
	}

	/**
	* @Description: 查询自动分配区间的库存数据 
	* @param status
	* @return List<PlmsWorkOrderAssignDto>
	 */
	@Override
	public List<PlmsWorkOrderAssignDto> selectOldCircuAssignedList(String status) {
		return plmsWorkOrderPoolMapper.selectOldCircuAssignedList(status);
	}

	/**
    * @Description: 查找全部的产品 
    * @return List<SysProduct>
     */
	@Override
	public List<SysProduct> searchAllProducts() {
		return plmsWorkOrderPoolMapper.searchAllProducts();
	}

	/**
	* @Description: 工单池数据分页
	* @param pagedata
	* @param example
	* @return
	 */
	@Override
	public Page<PlmsWorkOrderPoolDto> selectByExampleAndPage(
			Page<PlmsWorkOrderPoolDto> pagedata, PlmsWorkOrderPoolParam example) {
		
		//如果分配日期不为空，若是否分配为全部则默认选择已分配，若是否分配为未分配则isConflict=Y
		if(example.getAllocDateStart()!=null||example.getAllocDateEnd()!=null){
			if(example.getIsAlloc().equals("0")){
				example.setIsAlloc("1");
			}else if(example.getIsAlloc().equals("2")){
				example.setIsConflict("Y");
				return pagedata;

			}
		}
		//如果是代理队列则默认选择已分配
		if(example.getQueue().equals("2")){
			example.setIsAlloc("1");
		}
		plmsWorkOrderPoolMapper.selectByExampleAndPage(pagedata, example);		
		return pagedata;
	}

	/**
    * @Description: 查看案件详情
    * @param map
    * @return PlmsWorkOrderPoolDetailDto
     */
	@Override
	public PlmsWorkOrderPoolDetailDto searchCaseDetail(Map<String, Object> map) {
		PlmsWorkOrderPoolDetailDto detail = plmsWorkOrderPoolMapper.searchCaseDetail(map);
		if(detail.getAgent()==null||detail.getAgentName()==null){
			detail.setIsAgent("否");
		}else if(detail.getAgent()!=null&&detail.getAgentName()!=null){
			detail.setIsAgent("是");
		}
		detail.setQueue("主队列");
		return detail;
	}

	 /**
    * @Description: 前台手动分配选中的案件 
    * @param map
    * @return List<PlmsWorkOrderAssignDto>
     */
	@Override
	public List<PlmsWorkOrderAssignDto> selectMaruAssignList(
			Map<String, Object> map) {
		return plmsWorkOrderPoolMapper.selectMaruAssignList(map);
	}

    /**
     * 我的案件、全部案件分页查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<CaseCollectionDto> selectCaseCollectionAndPage(Page<CaseCollectionDto> page, CaseCollectionExample example) {
        plmsWorkOrderPoolMapper.selectCaseCollectionAndPage(page, example);
		if(page.getResult() != null && !page.getResult().isEmpty()){
			//催收类型集合
			List<PlmsLCollectMthd> mthdList = typeService.selectPlmsLCollectMthd(new PlmsLCollectMthdExample());
			//跟进情况集合
			List<PlmsLCollectStatus> statusList = typeService.selectPlmsLCollectStatus(new PlmsLCollectStatusExample());
			//催收代码集合
			List<PlmsLCollectCode> codeList = typeService.selectPlmsLCollectCode(new PlmsLCollectCodeExample());
			//控管状态集合
			List<PlmsLCollectControl> controlList = typeService.selectPlmsLCollectControl(new PlmsLCollectControlExample());
			for(CaseCollectionDto dto : page.getResult()){
				setCodeVal(dto,mthdList,statusList,codeList,controlList);
			}
		}
        return page;
    }

	/**
	 * 全部案件导出查询
	 * @param example 查询条件
	 * @return List<CaseCollectionDto>
	 */
	@Override
	public List<CaseCollectionDto> selectCaseCollectionByExampleForExcel(CaseCollectionExample example) {
		List<CaseCollectionDto> list = plmsWorkOrderPoolMapper.selectCaseCollectionAndPage(example);
		if(list != null && !list.isEmpty()){
			//催收类型集合
			List<PlmsLCollectMthd> mthdList = typeService.selectPlmsLCollectMthd(new PlmsLCollectMthdExample());
			//跟进情况集合
			List<PlmsLCollectStatus> statusList = typeService.selectPlmsLCollectStatus(new PlmsLCollectStatusExample());
			//催收代码集合
			List<PlmsLCollectCode> codeList = typeService.selectPlmsLCollectCode(new PlmsLCollectCodeExample());
			//控管状态集合
			List<PlmsLCollectControl> controlList = typeService.selectPlmsLCollectControl(new PlmsLCollectControlExample());
			for(CaseCollectionDto dto : list){
				setCodeVal(dto,mthdList,statusList,codeList,controlList);
			}
		}
		return list;
	}

	/**
	 * excel操作,在服务器生成Excel文件
	 * @param title 生产文件名
	 * @param fileName   生成后临时保存到服务器的文件名称(带文件格式)
	 * @param path       文件保存路径
	 * @param exportList List数据
	 */
	@Override
	public void exportCaseCollectionToExcel(String title, String fileName, String path, List<CaseCollectionExportDto> exportList) {
		//系统分隔符
		String file_separator = System.getProperties().getProperty("file.separator");
		ExportExcel<CaseCollectionExportDto> ex = new ExportExcel<CaseCollectionExportDto>();
		String[] headers = {
				"序号",
				"合同编号",
				"主贷人",
				"证件号码",
				"联系电话",
				"贷款金额",
				"逾期期数",
				"逾期天数",
				"剩余本金/保证金",
				"是否跟进",
				"催收类型",
				"跟进情况",
				"催收代码",
				"控管状态",
				"分配日期",
				"催收员",
				"代理催收员",
				"代理截止日期"
		};

		try {
			OutputStream out = new FileOutputStream(path + file_separator + fileName);
			ex.cutDataAndToCreateExcel(title, headers, exportList, out, "yyyy-MM-dd");
			out.close();
			System.out.println("excel导出成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 设置催收记录的code显示值
	 * @param dto 案件数据
	 * @param mthdList 催收类型集合
	 * @param statusList 跟进情况集合
	 * @param codeList 催收代码集合
	 * @param controlList 控管状态集合
	 * */
    private void setCodeVal(CaseCollectionDto dto,List<PlmsLCollectMthd> mthdList
			,List<PlmsLCollectStatus> statusList,List<PlmsLCollectCode> codeList,List<PlmsLCollectControl> controlList){
		//催收类型
		if(mthdList != null && mthdList.size() > 0){
			if(!StringUtil.isEmpty(dto.getCollectMthd())){
				for(PlmsLCollectMthd mthd : mthdList){
					if(dto.getCollectMthd().equals(mthd.getCode())){
						dto.setCollectMthdText(mthd.getVal());
						break;
					}
				}
			}
		}
		//跟进情况
		if(statusList != null && statusList.size() > 0){
			if(!StringUtil.isEmpty(dto.getStatus())){
				for(PlmsLCollectStatus status : statusList){
					if(dto.getStatus().equals(status.getCode())){
						dto.setStatusText(status.getVal());
						break;
					}
				}
			}
		}
		//催收代码
		if(codeList != null && codeList.size() > 0){
			if(!StringUtil.isEmpty(dto.getResult())){
				for(PlmsLCollectCode code : codeList){
					if(dto.getResult().equals(code.getCode())){
						dto.setResultText(code.getVal());
						break;
					}
				}
			}
		}
		//控管状态
		if(controlList != null && controlList.size() > 0){
			if(!StringUtil.isEmpty(dto.getControlStatus())){
				for(PlmsLCollectControl control : controlList){
					if(dto.getControlStatus().equals(control.getCode())){
						dto.setControlStatusText(control.getVal());
						break;
					}
				}
			}
		}
	}

    /**
    * @Description: 保护案件分页数据
    * @param pagedata
    * @param example
    * @return
     */
	@Override
	public Page<PlmsProtectCaseResultDto> selectProtectCaseAndPage(
			Page<PlmsProtectCaseResultDto> pagedata,
			PlmsProtectCaseParam example) {
		//处于保护状态的案件
		List<PlmsProtectCaseResultDto> ResultList = plmsWorkOrderPoolMapper.selectProtectCaseAndPage(pagedata, example);
		if(ResultList!=null&&ResultList.size()>0){
			
			Iterator<PlmsProtectCaseResultDto> iter = ResultList.iterator();
			while(iter.hasNext()){
				PlmsProtectCaseResultDto rDto = iter.next();

				//离职
				if(rDto.getDefendStatus().equals("4")){
					rDto.setProtectStatus("待流转");
				}//豁免
				else if(rDto.getDefendStatus().equals("2")){
					if(rDto.getWaivdeStatus()!=null&&!(rDto.getWaivdeStatus().equals(""))){
						if(rDto.getWaivdeStatus().equals("1")){
							rDto.setProtectStatus("保护中");
						}else{
							rDto.setProtectStatus("待流转");
						}
					}else{
						rDto.setProtectStatus("异常数据");

					}
					
				}//保留
				else if(rDto.getDefendStatus().equals("1")){
					
					String endDateStr = rDto.getProtectEndDate();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date date = new Date();
					String dateStr = sdf.format(date);
					if(dateStr.equals(rDto.getCreateTime())){
						rDto.setIsRecall("Y");
					}else{
						rDto.setIsRecall("N");
					}
					Date endDate = null;
					Date theDayTenpoint = null;
					try {
						endDate = sdf.parse(endDateStr);
						theDayTenpoint= sdf.parse(sdf.format(new Date()));
					} catch (ParseException e) {
						e.printStackTrace();
					}
					if(endDate.getTime()-theDayTenpoint.getTime()>0){
						rDto.setProtectStatus("保护中");
					}else if(endDate.getTime()-theDayTenpoint.getTime()==0){
						Date time=new Date();
						SimpleDateFormat format=new SimpleDateFormat("HH");
						String x=format.format(time);
						if(Integer.parseInt(x)>=10){
							rDto.setProtectStatus("待流转");
							if(example.getProtectStatus().equals("2")){
								iter.remove();
							}
						}else{
							rDto.setProtectStatus("保护中");
							if(example.getProtectStatus().equals("1")){
								iter.remove();
							}
						}
					}else{
						rDto.setProtectStatus("待流转");
					}
				}
			
			}
			
			
		}
		
		return pagedata;
	}

	/**
	 * 
    * @Description: 根据查询条件查询案件 
	* @param param
	* @return
	* @return
	 */
	@Override
	public List<PlmsWorkOrderAssignDto> selectByParam(
			PlmsWorkOrderPoolParam param) {
		return plmsWorkOrderPoolMapper.selectByParam(param);
	}

	/**
	* @Description: 根据条件查询需要导出的案件  
	* @param example
	* @return
	* @return
	 */
	@Override
	public List<PlmsWorkOrderPoolExportDto> selectByExampleForExport(PlmsWorkOrderPoolParam example) {
        //如果催收员不为空，默认为选择已分配的
        if(example.getCollectorName()!=null&&(!example.getCollectorName().equals(""))){
            example.setIsAlloc("1");
        }
        //如果分配日期不为空，若是否分配为全部则默认选择已分配，若是否分配为未分配则isConflict=Y
        if(example.getAllocDateStart()!=null||example.getAllocDateEnd()!=null){
            if(example.getIsAlloc().equals("0")){
                example.setIsAlloc("1");
            }else if(example.getIsAlloc().equals("2")){
                example.setIsConflict("Y");
                return null;
            }
        }
        //如果是代理队列则默认选择已分配
        if(example.getQueue().equals("2")){
            example.setIsAlloc("1");
        }
        return plmsWorkOrderPoolMapper.selectByExampleExport(example);
    }

	/**
	* @Description: excel操作
	* @param imagesPath
	* @param docsPath
	* @param expotList
	* @return
	*/
	@Override
	public void exportToExcel(String imagesPath, String docsPath,
			List<PlmsWorkOrderPoolExportDto> expotList) {
		//系统分隔符
		String FILE_SEPARATOR = System.getProperties()
				.getProperty("file.separator");
		ExportExcel<PlmsWorkOrderPoolExportDto> ex = new ExportExcel<PlmsWorkOrderPoolExportDto>();
		String[] headers = { "序号", "合同编号", "主贷人", "身份证号", "贷款金额" ,"逾期天数","逾期金额","剩余本金/保证金","催收员","代理催收员","业务类型","贷款产品"};
		OutputStream out =null;
		try {
			 out = new FileOutputStream(docsPath + FILE_SEPARATOR
					+ "caseManagement.xls");
			ex.exportExcel(headers, expotList, out);
			out.close();
			System.out.println("excel导出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	* @Description:查找提前移交区间没有被分配的案件
	* @param map
	* @return List<PlmsWorkOrderPool>
	 */
	@Override
	public List<PlmsWorkOrderPool> selectTansferNotAssign(Map<String,Object> map) {
		return plmsWorkOrderPoolMapper.selectTansferNotAssign(map);
	}

	/**
	* @Description: 根据豁免状态和借款ID查询豁免信息
	 * @return List<PlmsFeeWaiveApprovalResultDto>
	 */
	@Override
	public List<PlmsFeeWaiveApprovalResultDto> searchFeeWaiveApproval(Map<String,Object> map) {
		return plmsWorkOrderPoolMapper.searchFeeWaiveApproval(map);
	}

}

