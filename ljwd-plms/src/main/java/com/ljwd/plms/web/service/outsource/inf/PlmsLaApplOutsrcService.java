package com.ljwd.plms.web.service.outsource.inf;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericService;
import com.ljwd.plms.web.model.case_management.PlmsEmpCollectSet;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrc;
import com.ljwd.plms.web.model.outsource.PlmsLaApplOutsrcExample;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.*;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by zhengzw on 2016/9/27
 * 委外申请表,PLMS_LA_APPL_OUTSRC
 */
public interface PlmsLaApplOutsrcService extends GenericService<PlmsLaApplOutsrc,Long>{

    /**
     * 根据借款ID查询最新的委外记录
     * @param applId 借款ID
     * @return 实体
     */
    OutsrcRecordDto selectOutsrcRecordByApplId(Long applId);

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    int countByExample(PlmsLaApplOutsrcExample example);

    /**
     * 根据借款ID统计在委外流程的数据数量,判断是否在委外流程
     * @param applId 借款ID
     * @return true-是
     */
    boolean selectCheckIsOut(Long applId);

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    List<PlmsLaApplOutsrc> selectByExample(PlmsLaApplOutsrcExample example);

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
    Page<OutsrcPageDto> selectByExampleAndPage(Page<OutsrcPageDto> page, OutsrcPageExample example);

    /**
     * 条件查询导出的数据
     * @param example 查询条件
     * @return List数据
     */
    List<OutsrcPageDto> selectByExampleForExcel(OutsrcPageExample example);

    /**
     * 导出委外列表数据
     * @param title 导出之后的文件名
     * @param fileName 生成后临时保存到服务器的文件名称(带文件格式)
     * @param path 文件保存路径
     * @param exportList List数据
     */
    void exportToExcel(String title,String fileName, String path,List<OutsrcExcelDto> exportList);

    /**
     * 导出委外明细
     * @param title 导出之后的文件名
     * @param fileName 生成后临时保存到服务器的文件名称(带文件格式)
     * @param path 文件保存路径
     * @param exportList List数据
     */
    void exportDetailToExcel(String title,String fileName, String path,List<OutsrcDetailExcelDto> exportList);

    /**
     * 导出委外导出联系人通讯信息
     * @param title 导出之后的文件名
     * @param fileName 生成后临时保存到服务器的文件名称(带文件格式)
     * @param path 文件保存路径
     * @param exportList List数据
     */
    void exportContactorToExcel(String title,String fileName, String path,List<OutsrcContactorExcelDto> exportList);

    /**
     * 导出委外导出联系人地址信息
     * @param title 导出之后的文件名
     * @param fileName 生成后临时保存到服务器的文件名称(带文件格式)
     * @param path 文件保存路径
     * @param exportList List数据
     */
    void exportAddressToExcel(String title,String fileName, String path,List<OutsrcAddressExcelDto> exportList);

    /**
     * 查找委外最大限制次数
     * */
    Integer selectOutsourceMaxNum();

    /**
     * 根据借款ID和委外日期校验案件是否在委外流程
     * @param applId 借款ID
     * @param startDate 委外日期
     * @return true-在委外流程
     */
    boolean selectCheck(Long applId,Date startDate);

    /**
     * 根据借款ID和委外日期校验案件是否在委外流程
     * @param applId 借款ID
     * @param startDate 委外日期
     * @param noThisId 委外ID(校验时排除此ID)
     * @return true-在委外流程
     */
    boolean selectCheck(Long applId,Date startDate,Long noThisId);

    /**
     * 发起委外申请时根据借款IDS查找案件信息
     * @param applIds 查询条件
     * @return 实体集
     */
    List<AddOutsrcApplDto> selectAddOutsrcApplByApplIds(List<Long> applIds);

    /**
     * 电催催收员发起委外申请
     * @param startDate 委外日期
     * @param reason 委外原因
     * @param dtoList 案件信息
     * @param session 登录用户
     */
    void saveAdd(Date startDate,String reason,List<AddOutsrcApplDto> dtoList,SessionMsg session);

    /**
     * 委外专员发起委外申请
     * @param startDate 委外日期
     * @param outsrcList 委外数据
     * @param session 登录用户
     */
    void saveAppl(Date startDate,List<OutsrcDto> outsrcList,SessionMsg session);

    /**
     * 系统跑批或保护案件分配时流入委外区间,获取应收金额成功则预分配,失败则不预分配
     * @param addOutsrcApplList 案件信息
     * @param reason 委外原因
     * @param userId 操作人ID
     * @param userName 操作人姓名
     */
    void saveAutoAppl(List<AddOutsrcApplDto> addOutsrcApplList,String reason,String userId,String userName);

    /**
     * 审核
     * @param result 审核结果:1-审核通过,2-审核拒绝
     * @param outsrcList 委外申请集合
     * @param session 登录用户
     */
    void saveAudit(int result,List<OutsrcDto> outsrcList,SessionMsg session);

    /**
     * 提交—预分配委外公司
     * @param outsrcList 委外数据
     * @param session 登录用户
     */
    void saveSubmit(List<OutsrcDto> outsrcList,SessionMsg session);

    /**
     * 修改委外信息
     * @param outsrcList 委外申请集合
     * @param comId 外包公司ID
     * @param months 委外期限
     * @param session 登录用户
     */
    void saveModify(List<PlmsLaApplOutsrc> outsrcList,Long comId,int months,SessionMsg session);

    /**
     * 审批
     * @param result 审批结果:1-审批通过,2-审批拒绝
     * @param outsrcList 委外数据
     * @param session 登录用户
     * @param empCollect 委外区间的催收员
     */
    void saveApprove(int result, List<OutsrcDto> outsrcList, SessionMsg session, PlmsEmpCollectSet empCollect);

    /**
     * 延期
     * @param outsrcList 委外数据
     * @param months 延期月数
     * @param session 登录用户
     */
    void saveExtented(List<OutsrcDto> outsrcList,int months,SessionMsg session);

    /**
     * 结案
     * @param outsrcList 委外数据
     * @param endDate 结案日期
     * @param userId 登录用户ID
     * @param userName 登录用户名字
     * @param isJob 是否定时器调用
     */
    void saveEnded(List<OutsrcDto> outsrcList,Date endDate,String userId,String userName,boolean isJob);

    /**
     * 撤销结案
     * @param outsrcList 委外数据
     * @param session 登录用户
     */
    void saveUnDoEnded(List<OutsrcDto> outsrcList,SessionMsg session);

    /**
     * 案件转正常
     * @param outsrcList 委外数据
     * @param session 登录用户
     */
    void saveToNormal(List<OutsrcDto> outsrcList,SessionMsg session);

    /**
     * 退回
     * @param startDate 委外日期
     * @param outsrcList 委外数据,lastComId做过处理
     * @param session 登录用户
     */
    void saveBack(Date startDate,List<OutsrcDto> outsrcList,SessionMsg session);

    /**
     * Excel批量导入委外分配
     * @param inputStream 输入流
     * @param fileName    文件名称
     * @param userId 登录用户ID
     * @return JSONResult
     */
    JSONResult saveImportAllotByExcel(InputStream inputStream, String fileName,String userId) throws Exception;

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
