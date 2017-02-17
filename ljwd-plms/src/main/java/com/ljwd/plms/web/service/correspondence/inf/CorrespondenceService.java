package com.ljwd.plms.web.service.correspondence.inf;

import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
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

/**
 * 信函管理
 * @author zhengjizhao
 *
 */
public interface CorrespondenceService extends GenericService<PlmsOverdueClientLetterGenerateDto,Long>{

	/**
     * 分页条件查询
     * @param page Page信息
     * @param example 查询条件
     * @return Page数据
     */
    Page<PlmsOverdueClientLetterGenerateDto> selectByCorrespondenceAndPage(Page<PlmsOverdueClientLetterGenerateDto> page, PlmsOverdueClientLetterGenerateParamDto example);
    /**
     * 查询出信涵生成记录
     * @param page
     * @param example
     * @return
     */
    Page<PlmsDocumentGenLogDto> selectLetterGenerateLogAndPage(Page<PlmsDocumentGenLogDto> page, PlmsDocumentGenLogSearchParamDto example);
    /**
     * 查询 催记 信涵记录 数据
     * @param page
     * @param example
     * @return
     */
    Page<PlmsCorresLogDto> selectCorresLogAndPage(Page<PlmsCorresLogDto> page, PlmsDocumentGenLogSearchParamDto example);
    /**
     * 查询信函的类型数据
     * @return
     */
    List<PlmsCorresondenceCategory> selectCategory();
    /**
     * 修改信函的发送状态
     * @param id
     */
    void updateCorresStatus(List<Long> ids);
    /**
     * 导出信函生成记录的时候查询数据
     * @param example
     * @return
     */
    List<PlmsCorresExportDto> findExportExcelCorres(PlmsDocumentGenLogSearchParamDto example);
    /**
     * 导出excel
     * @param title
     * @param headers
     * @param list
     * @param out
     * @param pattern
     */
    void getExportExcelCorres(String title, String[] headers,List<PlmsCorresExportDto> list, OutputStream out, String pattern);
    /**
     * 查询所属城市下拉列表数据
     * @return
     */
    List<PlmsSiteCodeSelectData> findSiteCodeSelect();
    /**
     * 查询地址类型下拉数据
     * @return
     */
    List<PlmsAddrTypeSelectData> findAddrTypeSelect();
    /**
     * 
     * @Description: 通过合同号查询被选中的信函信息
     * @param  contractNo 合同号
     * @return List<PlmsOverdueClientLetterGenerateDto>  
     * @author zhengjizhao
     * @date 2016年10月19日下午5:04:43
     */
    List<PlmsOverdueClientLetterGenerateDto>  findSelectDataByContractNo(List<String> contractNo);
    /**
     * 
     * @Description: 在表中插入信函生成记录
     * @param  plmsDocumentGenLogDto   
     * @author zhengjizhao
     * @date 2016年10月27日下午6:41:56
     */
    void insertPlmsDocumentGenLogDto(PlmsDocumentGenLogDto plmsDocumentGenLogDto);
    /**
     * 
     * @Description: 通过信函发送记录ID查询信函信息
     * @param  corrId 信函记录ID
     * @return PlmsDocumentGenLogDto  
     * @author zhengjizhao
     * @date 2016年10月31日上午9:34:41
     */
    PlmsDocumentGenLogDto selectCorrImfomationById(Long corrId,String clientName,String idCardNo);
    /**
     * 
     * @Description: 通过合同号查询催收员的姓氏称呼和 办公电话
     * @param  contrctNo
     * @return PlmsCollectorInfo  
     * @author zhengjizhao
     * @date 2016年11月28日下午2:23:06
     */
    PlmsCollectorInfo selectCollectorInfo(String contrctNo);
    /**
     * 
     * @Description: 通过主贷人名称和身份证号查询电话
     * @param  clientName 主贷人姓名
     * @param  idCardNo 主贷人身份证号
     * @return PlmsDocumentGenLogTelDto  
     * @author zhengjizhao
     * @date 2016年11月29日下午6:35:37
     */
    PlmsDocumentGenLogTelDto selectCorrTelImfomationById(String clientName,String idCardNo);
    /**
     * 
     * @Description: 通过查询条件查询信函生成记录
     * @param  example
     * @return List<PlmsOverdueClientLetterGenerateDto>  
     * @author zhengjizhao
     * @date 2016年12月1日下午3:44:45
     */
    List<PlmsOverdueClientLetterGenerateDto> selectByCorrespondenceList(PlmsOverdueClientLetterGenerateParamDto example);
    /**
     * 
     * @Description: 通过选定的信函ID批量修改其退回详情
     * @param  idss 选定的信函ID
     * @param  plmsCorresRebackInfo   修改信函状态为“已退回”时 的参数 实体
     * @author zhengjizhao
     * @date 2016年12月5日上午9:44:21
     */
    void updateStatusRebackInfo(PlmsCorresRebackInfo plmsCorresRebackInfo);
    /**
     * 
     * @Description: 查询信函退回类型
     * @return   List<PlmsRebackTypeEntry>  
     * @param para 区分是查询父级数据还是查询子级数据
     * @author zhengjizhao
     * @date 2016年12月5日下午2:13:45
     */
	List<PlmsRebackTypeEntry> selectRebackTypeOne(String para);
	/**
	 * 
	 * @Description: 添加催记页面的信函记录 数据
	 * @param @param plmsCorresLogInfo   
	 * @return void  
	 * @throws
	 * @author zhengjizhao
	 * @date 2016年12月15日下午4:12:55
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
	PlmsDocumentGenLogDto selectCorresLogByLogId(Long id);
	/**
	 * 
	 * @Description: 在生成信函的时候新增“信函生成”记录，和案件管理中的“催记”和“信函记录”
	 * @param plmsDocumentGenLogDto 查询出信涵生成记录实体
	 * @return Boolean  
	 * @author zhengjizhao
	 * @date 2016年12月19日上午9:11:44
	 */
	Boolean insertCorresData(PlmsDocumentGenLogDto plmsDocumentGenLogDto);
	/**
	 * 
	 * @Description: 查询流水号
	 * @return PlmCoDig  
	 * @author zhengjizhao
	 * @date 2016年12月20日下午3:25:37
	 */
	PlmCoDig selectCorresSNo(String differ);
	/**
	 * 
	 * @Description: 更新流水号基数
	 * @param  countNo  流水号
	 * @return void  
	 * @author zhengjizhao
	 * @date 2016年12月20日下午3:39:37
	 */
	void updateCorresSNo(Integer countNo,Date nowTime,String differ);
}
