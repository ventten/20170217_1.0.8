package com.ljwd.plms.web.dao.correspondence;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.web.model.correspondence.PlmsLnCorresLog;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogDto;
import com.ljwd.plms.web.model.correspondence.PlmsDocumentGenLogSearchParamDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateDto;
import com.ljwd.plms.web.model.correspondence.PlmsOverdueClientLetterGenerateParamDto;
import com.ljwd.plms.web.model.correspondence.PlmsRebackTypeEntry;
import com.ljwd.plms.web.vo.correspondence.PlmCoDig;
import com.ljwd.plms.web.vo.correspondence.PlmsAddrTypeSelectData;
import com.ljwd.plms.web.vo.correspondence.PlmsCollectorInfo;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresExportDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresLogDto;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresRebackInfo;
import com.ljwd.plms.web.vo.correspondence.PlmsCorresondenceCategory;
import com.ljwd.plms.web.vo.correspondence.PlmsDocumentGenLogTelDto;
import com.ljwd.plms.web.vo.correspondence.PlmsSiteCodeSelectData;

public interface PlmsCorrespondenceMapper extends GenericDao<PlmsOverdueClientLetterGenerateDto, Long>{

	/**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    List<PlmsOverdueClientLetterGenerateDto> selectByCorrespondenceAndPage(Page<PlmsOverdueClientLetterGenerateDto> page, PlmsOverdueClientLetterGenerateParamDto example);
    
    /**
     * 查询出信涵生成记录
     * @param page
     * @param example
     * @return
     */
    List<PlmsDocumentGenLogDto> selectLetterGenerateLogAndPage(Page<PlmsDocumentGenLogDto> page, PlmsDocumentGenLogSearchParamDto example);
    /**
     * 查询出 催记 信涵记录 数据
     * @param page
     * @param example
     * @return
     */
    List<PlmsCorresLogDto> selectCorresLogAndPage(Page<PlmsCorresLogDto> page, PlmsDocumentGenLogSearchParamDto example);
    							
    /**
     * 查询信函的类型 数据
     * @return
     */
    List<PlmsCorresondenceCategory> selectCategory();
    /**
     * 修改信函的发送状态
     * @param id
     */
    void updateCorresStatus(List<Long> ids);
    /**
     * 查询需要导出的信函生成记录
     * @param example
     * @return
     */
    List<PlmsCorresExportDto> findExportExcelCorres(PlmsDocumentGenLogSearchParamDto example);
    /**
     * 查询所属城市下拉列表
     * @return
     */
    List<PlmsSiteCodeSelectData> findSiteCodeSelect();
    /**
     * 查询地址类型下拉列表数据
     * @return
     */
    List<PlmsAddrTypeSelectData> findAddrTypeSelect();
    /**
     * 
     * @Description: T通过信函信息的ID查询其数据
     * @param  corrId 信函信息ID
     * @return PlmsDocumentGenLogDto  
     * @author zhengjizhao
     * @date 2016年10月31日上午11:51:34
     */
    PlmsDocumentGenLogDto selectCorrImfomationById(@Param("corrId")Long corrId,@Param("clientName")String clientName);
    /**
     * 
     * @Description: 通过贷款申请ID和地址类型查询地址信息
     * @param  applId
     * @param  addrType
     * @return PlmsAddrInfoEntry  
     * @author zhengjizhao
     * @date 2016年10月31日下午5:53:52
     */
    //PlmsAddrInfoEntry getAddrInfo(PlmsCorresExportDto example);
    /**
     * 
     * @Description: 通过合同号查询催收员的姓氏称呼和 办公电话
     * @param  contrctNo
     * @return PlmsCollectorInfo  
     * @author zhengjizhao
     * @date 2016年11月28日下午2:23:06
     */
    PlmsCollectorInfo selectCollectorInfo(@Param("contrctNo")String contrctNo);
    /**
     * 
     * @Description: 查询信函详情的时候查询对应的电话号码
     * @param  clientName 主贷人姓名
     * @param  idCardNo 主贷人身份证号
     * @return PlmsDocumentGenLogTelDto  
     * @author zhengjizhao
     * @date 2016年11月29日下午4:53:18
     */
    PlmsDocumentGenLogTelDto selectCorrTelImfomationById(@Param("clientName")String clientName,@Param("idCardNo")String idCardNo);
    /**
     * 
     * @Description: 通过查询条件查询信函生成记录
     * @param example
     * @return List<PlmsOverdueClientLetterGenerateDto>  
     * @author zhengjizhao
     * @date 2016年12月1日下午3:44:45
     */
    List<PlmsOverdueClientLetterGenerateDto> selectByCorrespondenceAndPage(PlmsOverdueClientLetterGenerateParamDto example);
    /**
     * 
     * @Description: 修改信函的退回信息
     * @param  plmsCorresRebackInfo   修改的参数实体
     * @return void  
     * @author zhengjizhao
     * @date 2016年12月5日上午10:56:21
     */
    void updateStatusRebackInfo(PlmsCorresRebackInfo plmsCorresRebackInfo);
    /**
     * 
     * @Description: 查询信函退回类型
     * @return     	List<PlmsRebackTypeEntry>  
     * @param para 区分是查询父级数据还是查询子级数据
     * @author zhengjizhao
     * @date 2016年12月5日下午2:13:45
     */
	List<PlmsRebackTypeEntry> selectRebackTypeOne(@Param("para")String para);
	/**
	 * 
	 * @Description: 插入催记页面中的信函记录 数据
	 * @param  plmsCorresLogInfo   
	 * @return void  
	 * @author zhengjizhao
	 * @date 2016年12月15日下午4:14:11
	 */
	void insertCorresLog(PlmsLnCorresLog plmsCorresLogInfo);
	 /**
	  * 
	  * @Description: 根据ID查询信函生成记录实体
	  * @param id
	  * @return PlmsDocumentGenLogDto  
	  * @author zhengjizhao
	  * @date 2016年12月15日下午7:39:09
	  */
	PlmsDocumentGenLogDto selectCorresLogByLogId(@Param("id")Long id);
	/**
	 * 
	 * @Description: 获取信函编号的流水号
	 * @return PlmCoDig  
	 * @author zhengjizhao
	 * @date 2016年12月20日下午3:34:14
	 */
	PlmCoDig selectCorresSNo(@Param("differ")String differ);
	/**
	 * 
	 * @Description: 更新流水号基数
	 * @param countNo    流水号
	 * @return void  
	 * @author zhengjizhao
	 * @date 2016年12月20日下午3:42:21
	 */
	void updateCorresSNo(@Param("countNo")Integer countNo,@Param("nowTime")Date nowTime,@Param("differ")String differ);
}
