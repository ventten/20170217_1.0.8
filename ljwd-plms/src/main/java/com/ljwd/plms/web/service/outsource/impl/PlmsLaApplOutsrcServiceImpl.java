package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.AppContext;
import com.ljwd.plms.core.util.ExcelUtil;
import com.ljwd.plms.core.util.ExportExcel;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.constants.LoanStatus;
import com.ljwd.plms.web.dao.outsource.PlmsLaApplOutsrcMapper;
import com.ljwd.plms.web.model.BaseModel;
import com.ljwd.plms.web.model.case_collection.PlmsLaCollectionRecord;
import com.ljwd.plms.web.model.case_management.*;
import com.ljwd.plms.web.model.outsource.*;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRate;
import com.ljwd.plms.web.model.sys_management.PlmsSysOutsrcRateExample;
import com.ljwd.plms.web.service.case_collection.inf.PlmsLaCollectionRecordService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAgentService;
import com.ljwd.plms.web.service.case_management.inf.PlmsLaCollectAllocService;
import com.ljwd.plms.web.service.case_management.inf.PlmsWorkOrderPoolService;
import com.ljwd.plms.web.service.jms.inf.JmsSendService;
import com.ljwd.plms.web.service.outsource.inf.*;
import com.ljwd.plms.web.service.sys_management.inf.PlmsSysOutsrcRateService;
import com.ljwd.plms.web.service.workorder_pool.inf.PlmsCollectionRuleSetService;
import com.ljwd.plms.web.vo.SessionMsg;
import com.ljwd.plms.web.vo.outsource.*;
import com.ljwd.plms.web.vo.workorder_pool.CollectionCircuDto;
import com.ljwd.plms.web.wsdl.webservice.LoanServiceWSDL;
import com.ljwd.plms.web.wsdl.webservice.service.CalculateSummaryReceivableParamDto;
import com.ljwd.plms.web.wsdl.webservice.service.SimulateCalculateSummaryReceivableResultDto;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhengzw on 2016/9/27
 * 委外申请表,PLMS_LA_APPL_OUTSRC
 */
@Service
public class PlmsLaApplOutsrcServiceImpl extends GenericServiceImpl<PlmsLaApplOutsrc,Long> implements PlmsLaApplOutsrcService {

    @Resource
    private PlmsLaApplOutsrcMapper plmsLaApplOutsrcMapper;
    @Resource
    private PlmsOutsrcComService plmsOutsrcComService;
    @Resource
    private PlmsSysOutsrcRateService plmsSysOutsrcRateService;
    @Resource
    private PlmsWorkOrderPoolService plmsWorkOrderPoolService;
    @Resource
    private PlmsLaCollectAllocService plmsLaCollectAllocService;
    @Resource
    private PlmsLaCollectAgentService plmsLaCollectAgentService;
    @Resource
    private PlmsLaCollectionRecordService collectionRecordService;
    @Resource
    private PlmsLaApplOutsrcLotService plmsLaApplOutsrcLotService;
    @Resource
    private PlmsLaApplOutsrcLogService plmsLaApplOutsrcLogService;
    @Resource
    private PlmsLaApplOutsrcMsgService plmsLaApplOutsrcMsgService;
    @Resource
    private PlmsCollectionRuleSetService plmsCollectionRuleSetService;
    @Resource
    private JmsSendService jmsSendService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLaApplOutsrc, Long> getDao() {
        return plmsLaApplOutsrcMapper;
    }

    /**
     * 批量添加
     * @param list 添加的数据集合
     */
    @Override
    public void insertBatch(List<PlmsLaApplOutsrc> list) {
        if(list == null || list.isEmpty()){
            return;
        }
        int comm = 1000;
        int size = list.size()-1;
        if(size>=comm){
            List<PlmsLaApplOutsrc> newList = new ArrayList<PlmsLaApplOutsrc>();
            for(int i=0;i<=size;i++){
                if(i!=0&&i%comm==0||i==size){
                    newList.add(list.get(i));
                    plmsLaApplOutsrcMapper.insertBatch(newList);
                    newList.clear();
                }else{
                    newList.add(list.get(i));
                }
            }
        }else{
            plmsLaApplOutsrcMapper.insertBatch(list);
        }
    }

    /**
     * 批量修改
     * @param list 添加的数据集合
     */
    @Override
    public void updateBatch(List<PlmsLaApplOutsrc> list) {
        if(list == null || list.isEmpty()){
            return;
        }
        plmsLaApplOutsrcMapper.updateBatch(list);
    }

    /**
     * 根据借款ID查询最新的委外记录
     * @param applId 借款ID
     * @return 实体
     */
    @Override
    public OutsrcRecordDto selectOutsrcRecordByApplId(Long applId) {
        if(applId == null){
            return null;
        }
        return plmsLaApplOutsrcMapper.selectOutsrcRecordByApplId(applId);
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsLaApplOutsrcExample example) {
        return plmsLaApplOutsrcMapper.countByExample(example);
    }

    /**
     * 根据借款ID统计在委外流程的数据数量,判断是否在委外流程
     * @param applId 借款ID
     * @return true-是
     */
    @Override
    public boolean selectCheckIsOut(Long applId) {
        //委外申请状态
        List<String> statusS = new ArrayList<String>();
        statusS.add(PlmsLaApplOutsrc.STATUS_AUDIT);         //状态:待审核
        statusS.add(PlmsLaApplOutsrc.STATUS_DRAFT);         //状态:待提交
        statusS.add(PlmsLaApplOutsrc.STATUS_SUBMITTED);     //状态:待审批(已提交)
        statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);      //状态:已审批
        int count = plmsLaApplOutsrcMapper.countByExample(new PlmsLaApplOutsrcExample().setApplId(applId).setStatusS(statusS));
        return count > 0;
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLaApplOutsrc> selectByExample(PlmsLaApplOutsrcExample example) {
        return plmsLaApplOutsrcMapper.selectByExample(example);
    }

    /**
     * 条件查询操作时需要的委外申请信息
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<OutsrcDto> selectOutsrcByExample(OutsrcExample example) {
        return plmsLaApplOutsrcMapper.selectOutsrcByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<OutsrcPageDto> selectByExampleAndPage(Page<OutsrcPageDto> page, OutsrcPageExample example) {
        plmsLaApplOutsrcMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * 条件查询导出的数据
     * @param example 查询条件
     * @return List数据
     */
    @Override
    public List<OutsrcPageDto> selectByExampleForExcel(OutsrcPageExample example) {
        return plmsLaApplOutsrcMapper.selectByExampleAndPage(example);
    }

    /**
     * 导出委外列表数据
     * @param title 导出之后的文件名
     * @param fileName 生成后临时保存到服务器的文件名称(带文件格式)
     * @param path 文件保存路径
     * @param exportList List数据
     */
    @Override
    public void exportToExcel(String title,String fileName, String path, List<OutsrcExcelDto> exportList) {
        //系统分隔符
        String separator = System.getProperties().getProperty("file.separator");
        ExportExcel<OutsrcExcelDto> ex = new ExportExcel<OutsrcExcelDto>();
        String[] headers = {
                "序号",
                "区域",
                "合同编号",
                "主贷人",
                "证件号码",
                "委外类型",
                "待委外公司",
                "委外日期",
                "预计结案日期",
                "实际结案日期",
                "委外状态",
                "逾期天数",
                "委外费率",
                "委外金额",
                "贷款状态",
                "剩余本金",
                "外包次数",
                "委外区间",
                "业务类型",
                "贷款日期",
                "贷款金额",
                "期数",
                "所属分行",
                "申请委外日期",
                "提交人",
                "申请人"
        };
        try {
            OutputStream out = new FileOutputStream(path + separator + fileName);
            ex.cutDataAndToCreateExcel(title, headers, exportList, out, "yyyy-MM-dd");
            out.close();
            System.out.println("excel导出成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.info("excel导出失败！未找到文件" + path + separator + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("excel导出失败！" + e.getMessage());
        }
    }

    /**
     * 导出委外明细
     * @param title      导出之后的文件名
     * @param fileName   生成后临时保存到服务器的文件名称(带文件格式)
     * @param path       文件保存路径
     * @param exportList List数据
     */
    @Override
    public void exportDetailToExcel(String title, String fileName, String path, List<OutsrcDetailExcelDto> exportList) {
        //系统分隔符
        String separator = System.getProperties().getProperty("file.separator");
        ExportExcel<OutsrcDetailExcelDto> ex = new ExportExcel<OutsrcDetailExcelDto>();
        String[] headers = {
                "序号",
                "姓名",
                "合同编号",
                "区域",
                "性别",
                "婚姻状况",
                "证件号码",
                "上家委外公司",
                "本次委外公司",
                "委外类型",
                "逾期天数",
                "委外金额",
                "剩余本金",
                "贷款金额",
                "贷款期数",
                "贷款日期",
                "已还期数",
                "委外区间",
                "最后一次还款时间",
                "最后一次还款金额",
                "主贷人电子邮箱",
                "主贷人单位名称",
                "主贷人职位",
                "配偶姓名",
                "配偶身份证号"
        };
        try {
            OutputStream out = new FileOutputStream(path + separator + fileName);
            ex.cutDataAndToCreateExcel(title, headers, exportList, out, "yyyy-MM-dd");
            out.close();
            System.out.println("excel导出成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.info("excel导出失败！未找到文件" + path + separator + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("excel导出失败！" + e.getMessage());
        }
    }

    /**
     * 导出委外导出联系人通讯信息
     * @param title 导出之后的文件名
     * @param fileName   生成后临时保存到服务器的文件名称(带文件格式)
     * @param path       文件保存路径
     * @param exportList List数据
     */
    @Override
    public void exportContactorToExcel(String title, String fileName, String path, List<OutsrcContactorExcelDto> exportList) {
        //系统分隔符
        String separator = System.getProperties().getProperty("file.separator");
        ExportExcel<OutsrcContactorExcelDto> ex = new ExportExcel<OutsrcContactorExcelDto>();
        String[] headers = {
                "合同编号",
                "主贷人姓名",
                "联系人姓名",
                "与主贷人关系",
                "号码类型",
                "号码",
                "号码有效性"
        };
        try {
            OutputStream out = new FileOutputStream(path + separator + fileName);
            ex.cutDataAndToCreateExcel(title, headers, exportList, out, "yyyy-MM-dd");
            out.close();
            System.out.println("excel导出成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.info("excel导出失败！未找到文件" + path + separator + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("excel导出失败！" + e.getMessage());
        }
    }

    /**
     * 导出委外导出联系人地址信息
     * @param title 导出之后的文件名
     * @param fileName   生成后临时保存到服务器的文件名称(带文件格式)
     * @param path       文件保存路径
     * @param exportList List数据
     */
    @Override
    public void exportAddressToExcel(String title, String fileName, String path, List<OutsrcAddressExcelDto> exportList) {
        //系统分隔符
        String separator = System.getProperties().getProperty("file.separator");
        ExportExcel<OutsrcAddressExcelDto> ex = new ExportExcel<OutsrcAddressExcelDto>();
        String[] headers = {
                "合同编号",
                "主贷人姓名",
                "联系人姓名",
                "与主贷人关系",
                "地址类型",
                "详细地址",
                "地址有效性"
        };
        try {
            OutputStream out = new FileOutputStream(path + separator + fileName);
            ex.cutDataAndToCreateExcel(title, headers, exportList, out, "yyyy-MM-dd");
            out.close();
            System.out.println("excel导出成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.info("excel导出失败！未找到文件" + path + separator + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info("excel导出失败！" + e.getMessage());
        }
    }

    /**
     * 查找委外最大限制次数
     */
    @Override
    public Integer selectOutsourceMaxNum() {
        return plmsLaApplOutsrcMapper.selectOutsourceMaxNum();
    }

    /**
     * 根据借款ID和委外日期校验案件是否在委外流程
     * @param applId    借款ID
     * @param startDate 委外日期
     * @return true-在委外流程
     */
    @Override
    public boolean selectCheck(Long applId, Date startDate) {
        return this.selectCheck(applId, startDate,null);
    }

    /**
     * 根据借款ID和委外日期校验案件是否在委外流程
     * @param applId    借款ID
     * @param startDate 委外日期
     * @param noThisId  委外ID(校验时排除此ID)
     * @return true-在委外流程
     */
    @Override
    public boolean selectCheck(Long applId, Date startDate, Long noThisId) {
        //委外申请状态
        List<String> statusS = new ArrayList<String>();
        statusS.add(PlmsLaApplOutsrc.STATUS_AUDIT);         //状态:待审核
        statusS.add(PlmsLaApplOutsrc.STATUS_DRAFT);         //状态:待提交
        statusS.add(PlmsLaApplOutsrc.STATUS_SUBMITTED);     //状态:待审批(已提交)
        statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);      //状态:已审批

        List<Long> applIds = new ArrayList<Long>();
        applIds.add(applId);

        PlmsLaApplOutsrcExample example = new PlmsLaApplOutsrcExample();
        example.setCheck(true).setApplIds(applIds).setStatusS(statusS).setStartDate(startDate);
        if(noThisId != null){
            example.setNoThisId(noThisId);
        }

        //根据状态集合和借款ID查找
        List<PlmsLaApplOutsrc> check = this.selectByExample(example);
        if(check != null && check.size() > 0){
            return true;
        }
        return false;
    }

    /**
     * 发起委外申请时根据借款IDS查找案件信息
     * @param applIds 查询条件
     * @return 实体集
     */
    @Override
    public List<AddOutsrcApplDto> selectAddOutsrcApplByApplIds(List<Long> applIds) {
        if(applIds == null || applIds.isEmpty()){
            return null;
        }
        return plmsLaApplOutsrcMapper.selectAddOutsrcApplByApplIds(applIds);
    }

    /**
     * 电催催收员发起委外申请
     * @param startDate 委外日期
     * @param reason 委外原因
     * @param dtoList 案件信息
     * @param session 登录用户
     */
    @Override
    public void saveAdd(Date startDate,String reason,List<AddOutsrcApplDto> dtoList,SessionMsg session) {
        if(dtoList != null && dtoList.size() > 0){
            //委外申请集合
            List<PlmsLaApplOutsrc> addApplOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
            //新增催收记录集合
            List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
            //新增委外操作日志集合
            List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
            //新增委外批次集合
            List<PlmsLaApplOutsrcLot> lotList = new ArrayList<PlmsLaApplOutsrcLot>();

            //计算委外次数的状态值
            List<String> countStatuS = new ArrayList<>();
            countStatuS.add(PlmsLaApplOutsrc.STATUS_APPROVED);
            countStatuS.add(PlmsLaApplOutsrc.STATUS_ENDED);

            Date time = new Date();
            for(AddOutsrcApplDto dto : dtoList){
                //添加委外申请批次
                PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                lot.setApplId(dto.getApplId());
                lot.setPaymentId(dto.getPaymentId());
                lot.setCntrctId(dto.getCntrctId());
                lot.setStatus(PlmsLaApplOutsrcLot.STATUS_USE);                 //使用中
                lot.setCreatedBy(session.getName());
                lot.setUpdatedBy(session.getName());
                lot.setCreateTime(time);
                lot.setUpdateTime(time);
                lot.setRecVer(0L);
                lot.setTagSeq(1L);
                String lotNo = UUID.randomUUID().toString();
                lot.setLotNo(lotNo);
                lotList.add(lot);

                PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
                outsrc.setPaymentId(dto.getPaymentId());                        //放款ID
                outsrc.setApplId(dto.getApplId());                              //借款ID
                outsrc.setCntrctId(dto.getCntrctId());                          //合同ID
                outsrc.setStatus(PlmsLaApplOutsrc.STATUS_AUDIT);                //待审核状态
                outsrc.setReason(reason);                                       //委外原因
                outsrc.setLotNo(lotNo);                                         //批次编号

                //委外次数
                Integer outsrcCount = 0;
                PlmsLaApplOutsrcExample example = new PlmsLaApplOutsrcExample();
                example.setApplId(dto.getApplId()).setStatusS(countStatuS);
                example.setOrderByClause("T.ID DESC");
                List<PlmsLaApplOutsrc> countList = plmsLaApplOutsrcMapper.selectByExample(example);
                if(countList != null && countList.size() > 0){
                    outsrcCount = countList.size();
                    outsrc.setLastComId(countList.get(0).getComId());           //上家委外公司
                }
                outsrc.setOutsrcCount(outsrcCount);                             //委外次数

                outsrc.setStartDate(startDate);                                 //委外日期/申请日期
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(startDate);
                calendar.add(Calendar.MONTH,2);
                outsrc.setEndDate(calendar.getTime());                          //预计退案日期
                outsrc.setEndMonths(2);                                         //预计委外月数

                outsrc.setFeeRate(BigDecimal.ZERO);                             //外包催收费率
                outsrc.setOutsrcType(PlmsLaApplOutsrc.OUT_SRC_TYPE_FIRST);      //催收员手动申请的都为一手外包

                outsrc.setCreateType(PlmsLaApplOutsrc.CREATE_TYPE_HAND);        //手动申请
                outsrc.setAllot(dto.getAllot());                                //发起申请时案件的催收员
                outsrc.setWorkStatus(dto.getPoolStatus());                      //发起申请时案件的催收区间

                outsrc.setIsBack(0);
                outsrc.setCreatedBy(session.getName());
                outsrc.setUpdatedBy(session.getName());
                outsrc.setCreateTime(time);
                outsrc.setUpdateTime(time);
                outsrc.setRecVer(0L);
                outsrc.setTagSeq(1L);
                addApplOutsrcList.add(outsrc);                                  //添加到集合

                PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
                outLog.setApplId(dto.getApplId());
                outLog.setType(PlmsLaApplOutsrcLog.TYPE_ADD);                   //操作类型：申请
                outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                outLog.setContent("催收员" + session.getUserName() +"发起委外申请");
                outLog.setCreatedBy(session.getName());
                outLog.setUpdatedBy(session.getName());
                outLog.setCreateTime(time);
                outLog.setUpdateTime(time);
                outLog.setRecVer(0L);
                outLog.setTagSeq(1L);
                outLogList.add(outLog);                                         //添加到集合

                PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();   //催收记录
                record.setApplId(dto.getApplId());
                record.setPeriodNum(dto.getOverduePeriod());
                record.setCollectTime(time);
                record.setFollowedBy(session.getUserName());
                record.setInputTime(time);
                record.setCollectMthd("OUTSOURCING");                           //委托外包
                record.setStatus("OUTSOURCING");
                record.setResult("OUTSOURCING");
                record.setControlStatus("CO");
                record.setContent("申请委外");
                record.setCreatedBy("system");
                record.setUpdatedBy(session.getName());
                record.setCreateTime(time);
                record.setUpdateTime(time);
                record.setRecVer(0L);
                record.setTagSeq(1L);
                recordList.add(record);                                         //添加到集合
            }

            //执行批量添加委外申请
            this.insertBatch(addApplOutsrcList);
            //执行批量添加委外批次
            plmsLaApplOutsrcLotService.insertBatch(lotList);
            //执行批量添加委外操作日志
            plmsLaApplOutsrcLogService.insertBatch(outLogList);
            //执行批量添加催收记录
            collectionRecordService.insertBatch(recordList);
        }
    }

    /**
     * 委外专员发起委外申请
     * @param startDate 委外日期
     * @param outsrcList 委外数据
     * @param session    登录用户
     */
    @Override
    public void saveAppl(Date startDate,List<OutsrcDto> outsrcList, SessionMsg session) {
        //登录用户ID
        String loginUserId = session.getName();
        Date time = new Date();
        //添加委外申请集合
        List<PlmsLaApplOutsrc> addOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        //新增催收记录集合
        List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
        //新增委外批次集合
        List<PlmsLaApplOutsrcLot> lotList = new ArrayList<PlmsLaApplOutsrcLot>();

        //计算委外次数的状态值
        List<String> countStatuS = new ArrayList<>();
        countStatuS.add(PlmsLaApplOutsrc.STATUS_APPROVED);
        countStatuS.add(PlmsLaApplOutsrc.STATUS_ENDED);

        for(OutsrcDto dto : outsrcList){
            PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
            outsrc.setPaymentId(dto.getPaymentId());                        //放款ID
            outsrc.setApplId(dto.getApplId());                              //借款ID
            outsrc.setCntrctId(dto.getCntrctId());                          //合同ID
            outsrc.setStatus(PlmsLaApplOutsrc.STATUS_DRAFT);                //待提交

            //委外次数
            Integer outsrcCount = 0;
            PlmsLaApplOutsrcExample example = new PlmsLaApplOutsrcExample();
            example.setApplId(dto.getApplId()).setStatusS(countStatuS);
            example.setOrderByClause("T.ID DESC");
            List<PlmsLaApplOutsrc> countList = plmsLaApplOutsrcMapper.selectByExample(example);
            if(countList != null && countList.size() > 0){
                outsrcCount = countList.size();
                outsrc.setLastComId(countList.get(0).getComId());           //上家委外公司
            }
            outsrc.setOutsrcCount(outsrcCount);                             //委外次数

            String lotNo = dto.getLotNo();                                  //批次编号
            if(StringUtil.isEmpty(lotNo)){
                //添加委外申请批次
                PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                lot.setApplId(dto.getApplId());
                lot.setPaymentId(dto.getPaymentId());
                lot.setCntrctId(dto.getCntrctId());
                lot.setStatus(PlmsLaApplOutsrcLot.STATUS_USE);              //使用中
                lot.setCreatedBy(session.getName());
                lot.setUpdatedBy(session.getName());
                lot.setCreateTime(time);
                lot.setUpdateTime(time);
                lot.setRecVer(0L);
                lot.setTagSeq(1L);
                lotNo = UUID.randomUUID().toString();
                lot.setLotNo(lotNo);
                lotList.add(lot);
            }
            outsrc.setLotNo(lotNo);

            outsrc.setStartDate(startDate);                                 //委外日期/申请日期
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            calendar.add(Calendar.MONTH,2);
            outsrc.setEndDate(calendar.getTime());                          //预计退案日期
            outsrc.setEndMonths(2);                                         //预计委外月数

            outsrc.setFeeRate(BigDecimal.ZERO);                             //外包催收费率
            outsrc.setOutsrcType(PlmsLaApplOutsrc.OUT_SRC_TYPE_SECOND);     //催收员手动申请的都为二手外包

            outsrc.setCreateType(PlmsLaApplOutsrc.CREATE_TYPE_HAND);        //手动申请
            outsrc.setAllot(null);                                          //发起申请时案件的催收员
            outsrc.setWorkStatus(dto.getPoolStatus());                      //发起申请时案件的催收区间

            outsrc.setIsBack(0);
            outsrc.setCreatedBy(session.getName());
            outsrc.setUpdatedBy(session.getName());
            outsrc.setCreateTime(time);
            outsrc.setUpdateTime(time);
            outsrc.setRecVer(0L);
            outsrc.setTagSeq(1L);

            addOutsrcList.add(outsrc);                                      //添加到集合

            PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
            outLog.setApplId(dto.getApplId());
            outLog.setType(PlmsLaApplOutsrcLog.TYPE_ADD);                   //操作类型：申请
            outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
            outLog.setContent("委外专员" + session.getUserName() + "发起委外申请");
            outLog.setCreatedBy(session.getName());
            outLog.setUpdatedBy(session.getName());
            outLog.setCreateTime(time);
            outLog.setUpdateTime(time);
            outLog.setRecVer(0L);
            outLog.setTagSeq(1L);
            outLogList.add(outLog);                                         //添加到集合

            PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();   //催收记录
            record.setApplId(dto.getApplId());
            record.setPeriodNum(dto.getOverduePeriod());
            record.setCollectTime(time);
            record.setFollowedBy(session.getUserName());
            record.setInputTime(time);
            record.setCollectMthd("OUTSOURCING");                           //委托外包
            record.setStatus("OUTSOURCING");
            record.setResult("OUTSOURCING");
            record.setControlStatus("CO");
            record.setContent("申请委外");
            record.setCreatedBy("system");
            record.setUpdatedBy(session.getName());
            record.setCreateTime(time);
            record.setUpdateTime(time);
            record.setRecVer(0L);
            record.setTagSeq(1L);

            recordList.add(record);                                         //添加到集合
        }
        //批量插入委外申请信息
        this.insertBatch(addOutsrcList);
        //执行批量添加委外批次
        plmsLaApplOutsrcLotService.insertBatch(lotList);
        //执行批量添加委外操作日志
        plmsLaApplOutsrcLogService.insertBatch(outLogList);
        //执行批量添加催收记录
        collectionRecordService.insertBatch(recordList);
    }

    /**
     * 系统跑批或保护案件分配时流入委外区间,获取应收金额成功则预分配,失败则不预分配
     * @param addOutsrcApplList 案件信息
     * @param reason 委外原因
     * @param userId 操作人ID
     * @param userName 操作人姓名
     */
    @Override
    public void saveAutoAppl(List<AddOutsrcApplDto> addOutsrcApplList,String reason,String userId,String userName) {
        if(addOutsrcApplList != null && addOutsrcApplList.size() > 0){
            Date time = new Date();
            //计算应收金额成功的委外申请集合
            List<PlmsLaApplOutsrc> hasAmtOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
            //计算应收金额失败的委外申请集合
            List<PlmsLaApplOutsrc> noHasAmtOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
            //新增委外操作日志集合
            List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
            //新增催收记录集合
            List<PlmsLaCollectionRecord> recordList = new ArrayList<PlmsLaCollectionRecord>();
            //新增委外批次集合
            List<PlmsLaApplOutsrcLot> lotList = new ArrayList<PlmsLaApplOutsrcLot>();
            //查询有效的费率集合
            List<PlmsSysOutsrcRate> rateList = plmsSysOutsrcRateService.selectByExample(new PlmsSysOutsrcRateExample().setIsActive("Y"));

            //微贷计算应收金额参数
            CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
            param.setIsInAdvanceRepayment(Boolean.TRUE);        //是以提前结清方式计算
            param.setIsRenewLoanRepayment(Boolean.FALSE);
            param.setRenewLoanPenaltyRate(null);
            //应收金额计算结果
            SimulateCalculateSummaryReceivableResultDto result = null;

            //计算委外次数的状态值
            List<String> countStatuS = new ArrayList<>();
            countStatuS.add(PlmsLaApplOutsrc.STATUS_APPROVED);
            countStatuS.add(PlmsLaApplOutsrc.STATUS_ENDED);

            for(AddOutsrcApplDto dto : addOutsrcApplList){
                param.setContractNo(dto.getCntrctNo());
                param.setRepaymentDate(time);
                param.setIdCardNo(dto.getIdCardNo());
                try {
                    result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
                } catch (Exception e) {
                    e.printStackTrace();
                    logger.error("合同号:" + dto.getCntrctNo() + "计算应收金额失败:" + e.getMessage());
                }

                //最小期未还期数的逾期天数
                int overDaysNum = (dto.getOverDays() == null ? 0 : dto.getOverDays().intValue());
                //服务费率
                BigDecimal feeRate = this.getOutsrcRateByOverDays(rateList,overDaysNum);
                //计算的应收金额
                BigDecimal recivAmt = null;
                if(result == null || result.getReceivableSumaryAmount() == null){
                    logger.error("合同号:" + dto.getCntrctNo() + "计算应收金额失败,结果为null");
                }else {
                    recivAmt = result.getReceivableSumaryAmount();
                }

                //添加委外申请批次
                PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                lot.setApplId(dto.getApplId());
                lot.setPaymentId(dto.getPaymentId());
                lot.setCntrctId(dto.getCntrctId());
                lot.setStatus(PlmsLaApplOutsrcLot.STATUS_USE);                 //使用中
                lot.setCreatedBy(userId);
                lot.setUpdatedBy(userId);
                lot.setCreateTime(time);
                lot.setUpdateTime(time);
                lot.setRecVer(0L);
                lot.setTagSeq(1L);
                String lotNo = UUID.randomUUID().toString();
                lot.setLotNo(lotNo);
                lotList.add(lot);

                PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
                outsrc.setPaymentId(dto.getPaymentId());                        //放款ID
                outsrc.setApplId(dto.getApplId());                              //借款ID
                outsrc.setCntrctId(dto.getCntrctId());                          //合同ID
                outsrc.setLotNo(lotNo);                                         //批次编号

                //委外次数
                Integer outsrcCount = 0;
                PlmsLaApplOutsrcExample example = new PlmsLaApplOutsrcExample();
                example.setApplId(dto.getApplId()).setStatusS(countStatuS);
                example.setOrderByClause("T.ID DESC");
                List<PlmsLaApplOutsrc> countList = plmsLaApplOutsrcMapper.selectByExample(example);
                if(countList != null && countList.size() > 0){
                    outsrcCount = countList.size();
                    outsrc.setLastComId(countList.get(0).getComId());           //上家委外公司
                }
                outsrc.setOutsrcCount(outsrcCount);                             //委外次数

                outsrc.setRecivAmt(recivAmt);                                   //委外金额
                outsrc.setFeeRate(feeRate);                                     //外包催收费率
                outsrc.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);            //待审批状态

                outsrc.setStartDate(time);                                      //委外日期/申请日期
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(time);
                calendar.add(Calendar.MONTH,2);
                outsrc.setEndDate(calendar.getTime());                          //预计结案日期
                outsrc.setEndMonths(2);                                         //预计委外月数
                outsrc.setOutsrcType(PlmsLaApplOutsrc.OUT_SRC_TYPE_FIRST);      //系统跑批申请的都为一手外包
                outsrc.setCreateType(PlmsLaApplOutsrc.CREATE_TYPE_AUTO);        //系统跑批申请
                outsrc.setAllot(dto.getAllot());                                //发起申请时案件的催收员
                outsrc.setWorkStatus(dto.getPoolStatus());                      //发起申请时案件的催收区间

                outsrc.setReason(reason);                                       //委外原因
                outsrc.setRemark(reason);                                       //备注
                outsrc.setSubmittedBy(userId);
                outsrc.setSubmitTime(time);

                outsrc.setIsBack(0);
                outsrc.setSubmittedBy(userId);
                outsrc.setCreatedBy(userId);
                outsrc.setUpdatedBy(userId);
                outsrc.setSubmitTime(time);
                outsrc.setCreateTime(time);
                outsrc.setUpdateTime(time);
                outsrc.setRecVer(0L);
                outsrc.setTagSeq(1L);

                outsrc.setRegionId(dto.getRegionId());                          //区域ID(预分配时排序用)

                if(recivAmt == null){
                    //计算应收金额失败
                    noHasAmtOutsrcList.add(outsrc);                             //添加到集合
                }else {
                    //计算应收金额成功
                    hasAmtOutsrcList.add(outsrc);                               //添加到集合
                }

                PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
                outLog.setApplId(dto.getApplId());
                outLog.setType(PlmsLaApplOutsrcLog.TYPE_ADD);                   //操作类型：申请
                outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                outLog.setContent(reason);
                outLog.setCreatedBy(userId);
                outLog.setUpdatedBy(userId);
                outLog.setCreateTime(time);
                outLog.setUpdateTime(time);
                outLog.setRecVer(0L);
                outLog.setTagSeq(1L);
                outLogList.add(outLog);                                         //添加到集合

                PlmsLaCollectionRecord record = new PlmsLaCollectionRecord();   //催收记录
                record.setApplId(dto.getApplId());
                record.setPeriodNum(dto.getOverduePeriod());
                record.setCollectTime(time);
                record.setFollowedBy(userName);
                record.setInputTime(time);
                record.setCollectMthd("OUTSOURCING");                           //委托外包
                record.setStatus("OUTSOURCING");
                record.setResult("OUTSOURCING");
                record.setControlStatus("CO");
                record.setContent(reason);
                record.setCreatedBy(userId);
                record.setUpdatedBy(userId);
                record.setCreateTime(time);
                record.setUpdateTime(time);
                record.setRecVer(0L);
                record.setTagSeq(1L);

                recordList.add(record);                                         //添加到集合
            }

            //委外预分配
            hasAmtOutsrcList = this.saveAllotAutoOutsrc(hasAmtOutsrcList);
            //执行批量添加委外申请-已预分配
            this.insertBatch(hasAmtOutsrcList);
            //执行批量添加委外申请-未预分配
            this.insertBatch(noHasAmtOutsrcList);
            //执行批量添加委外批次
            plmsLaApplOutsrcLotService.insertBatch(lotList);
            //执行批量添加委外操作日志
            plmsLaApplOutsrcLogService.insertBatch(outLogList);
            //执行批量添加催收记录
            collectionRecordService.insertBatch(recordList);
        }

    }

    /**
     * 审核
     * @param result 审核结果:1-审核通过,2-审核拒绝
     * @param outsrcList 委外申请集合
     * @param session 登录用户
     */
    @Override
    public void saveAudit(int result,List<OutsrcDto> outsrcList,SessionMsg session){
        String status = null;
        String content = null;
        if(result == 1){
            status = PlmsLaApplOutsrc.STATUS_DRAFT;         //审核通过到待提交
            content = "审核通过";
        }else if(result == 2){
            status = PlmsLaApplOutsrc.STATUS_AUDIT_REJECT;  //审核拒绝
            content = "审核拒绝";
        }else {
            throw new RuntimeException("未知的委外审核结果");
        }

        //登录用户ID
        String loginUserId = session.getName();
        Date time = new Date();
        //修改集合
        List<PlmsLaApplOutsrc> updateList = new ArrayList<PlmsLaApplOutsrc>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();

        for(OutsrcDto dto : outsrcList){
            PlmsLaApplOutsrc applOutsrc = new PlmsLaApplOutsrc();
            applOutsrc.setId(dto.getId());
            applOutsrc.setStatus(status);
            applOutsrc.setAuditBy(loginUserId);
            applOutsrc.setAuditTime(time);
            applOutsrc.setUpdatedBy(loginUserId);
            applOutsrc.setUpdateTime(time);
            applOutsrc.setRecVer(dto.getRecVer());

            updateList.add(applOutsrc);

            PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
            outLog.setApplId(dto.getApplId());
            outLog.setType(PlmsLaApplOutsrcLog.TYPE_AUDIT);                 //操作类型：审核
            outLog.setResult(result);
            outLog.setContent(session.getUserName() + content);
            outLog.setCreatedBy(session.getName());
            outLog.setUpdatedBy(session.getName());
            outLog.setCreateTime(time);
            outLog.setUpdateTime(time);
            outLog.setRecVer(0L);
            outLog.setTagSeq(1L);
            outLogList.add(outLog);                                         //添加到集合
        }

        //如果审核通过,将案件区间设为委外,并修改案件催收员分配记录和代理记录
        if(result == 1){
            //委外区间值
            String poolStatus = plmsCollectionRuleSetService.selectStatusByCircuCode("OUTSOURC");
            if(poolStatus == null ){
                throw new RuntimeException("未找到有效的委外区间");
            }

            //放款IDS
            List<Long> paymentIds = new ArrayList<Long>();
            for(OutsrcDto dto : outsrcList){
                paymentIds.add(dto.getPaymentId());
            }

            PlmsWorkOrderPoolExample example = new PlmsWorkOrderPoolExample();
            PlmsWorkOrderPoolExample.Criteria criteria = example.createCriteria();
            criteria.andPaymentIdIn(paymentIds);
            //根据放款IDS查找案件集合
            List<PlmsWorkOrderPool> poolList = plmsWorkOrderPoolService.selectByExampleList(example);

            //案件修改集合
            List<PlmsWorkOrderPool> updatePoolList = new ArrayList<PlmsWorkOrderPool>();
            for(PlmsWorkOrderPool pool : poolList){
                PlmsWorkOrderPool newPool = new PlmsWorkOrderPool();
                newPool.setPaymentId(pool.getPaymentId());
                newPool.setRecVer(pool.getRecVer());
                newPool.setStatus(poolStatus);
                newPool.setUpdatedBy(loginUserId);
                newPool.setUpdateTime(time);
                updatePoolList.add(newPool);
            }
            //批量修改工单池状态
            plmsWorkOrderPoolService.updateBatch(updatePoolList);
            //结束催收员
            plmsLaCollectAllocService.saveEendAlloc(paymentIds,loginUserId,time);
            //结束代理催收员
            plmsLaCollectAgentService.saveEndAgent(paymentIds,loginUserId,time);
        }else {
            //如果审核不通过,将委外批次设为结束
            List<PlmsLaApplOutsrcLot> updateLotList = new ArrayList<PlmsLaApplOutsrcLot>();
            for(OutsrcDto dto : outsrcList){
                if(!StringUtil.isEmpty(dto.getLotNo())){
                    PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                    lot.setLotNo(dto.getLotNo());
                    lot.setStatus(PlmsLaApplOutsrcLot.STATUS_END);  //结束
                    lot.setUpdatedBy(loginUserId);
                    lot.setUpdateTime(time);
                    updateLotList.add(lot);
                }
            }
            //将委外批次设为结束
            plmsLaApplOutsrcLotService.updateBatch(updateLotList);
        }
        //批量修改委外申请信息
        this.updateBatch(updateList);
        //执行批量添加委外操作日志
        plmsLaApplOutsrcLogService.insertBatch(outLogList);
    }

    /**
     * 提交—预分配委外公司
     * @param outsrcList 委外数据
     * @param session  登录用户
     */
    @Override
    public void saveSubmit(List<OutsrcDto> outsrcList, SessionMsg session) {
        //查询有效的费率集合
        List<PlmsSysOutsrcRate> rateList = plmsSysOutsrcRateService.selectByExample(new PlmsSysOutsrcRateExample().setIsActive("Y"));
        //一手案件集合
        List<OutsrcDto> firstList = new ArrayList<OutsrcDto>();
        //二手案件集合
        List<OutsrcDto> secondList = new ArrayList<OutsrcDto>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        //需修改的委外申请集合
        List<PlmsLaApplOutsrc> updateOutsrcList = new ArrayList<PlmsLaApplOutsrc>();

        String userId = session.getName();
        Date time = new Date();

        //循环：根据逾期天数获取费率,并计算委外金额
        for(OutsrcDto dto : outsrcList){
            int overDaysNum = (dto.getOverDaysNum() == null ? 0 : dto.getOverDaysNum());            //最小期未还期数的逾期天数
            dto.setOverDaysNum(overDaysNum);
            BigDecimal feeRate = null;                                                              //服务费率
            //如果是退回的,用原先的费率
            if(dto.getIsBack() != null && dto.getIsBack() - 1 == 0){
                feeRate = dto.getFeeRate();
            }else {
                feeRate = this.getOutsrcRateByOverDays(rateList,overDaysNum);
                dto.setFeeRate(feeRate);
            }
            BigDecimal recivAmt = dto.getRecivAmt();
            recivAmt = recivAmt.add(recivAmt.multiply(feeRate).setScale(2, RoundingMode.HALF_UP));  //委外金额
            dto.setRecivAmt(recivAmt);

            String type = dto.getOutsrcType();
            if(PlmsLaApplOutsrc.OUT_SRC_TYPE_FIRST.equals(type)){
                firstList.add(dto);
            }else {
                secondList.add(dto);
            }

            PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
            outLog.setApplId(dto.getApplId());
            outLog.setType(PlmsLaApplOutsrcLog.TYPE_SUBMIT);                //操作类型：提交
            outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
            outLog.setContent(session.getUserName() + "提交");
            outLog.setCreatedBy(userId);
            outLog.setUpdatedBy(userId);
            outLog.setCreateTime(time);
            outLog.setUpdateTime(time);
            outLog.setRecVer(0L);
            outLog.setTagSeq(1L);
            outLogList.add(outLog);                                         //添加到集合
        }

        //1.分配一手案件-开始
        if(firstList.size() > 0){
            //先进行排序
            firstList = this.sortOutsrc(firstList,1);

            //区域-委外机构map
            Map<Long,List<PlmsOutsrcCom>> firstRegionComMap = new HashMap<Long,List<PlmsOutsrcCom>>();
            List<PlmsOutsrcCom> comFirstList = null;    //委外机构集合
            Long lastRegionId = null;                   //上一条记录的区域ID
            int comIndex = 0;                           //委外机构循环下标
            for(OutsrcDto firstDto : firstList){
                Long regionId = firstDto.getRegionId();
                comFirstList = firstRegionComMap.get(regionId);

                PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                out.setId(firstDto.getId());
                out.setFeeRate(firstDto.getFeeRate());
                out.setRecivAmt(firstDto.getRecivAmt());
                out.setSubmittedBy(userId);
                out.setSubmitTime(time);
                out.setUpdatedBy(userId);
                out.setUpdateTime(time);
                out.setRecVer(firstDto.getRecVer());
                out.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);       //待审批

                out.setStartDate(firstDto.getStartDate());              //委外开始日期
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(firstDto.getStartDate());
                calendar.add(Calendar.MONTH,firstDto.getEndMonths());   //开始日期 + 预计委外月数
                out.setEndDate(calendar.getTime());                     //预计结案日期

                //如果是退回的,还是原来的公司
                if(firstDto.getIsBack() != null && firstDto.getIsBack() - 1 == 0){
                    out.setOverdueDays(firstDto.getOverdueDays());
                    updateOutsrcList.add(out);
                }else {
                    out.setOverdueDays(firstDto.getOverDaysNum());

                    if(comFirstList == null){
                        //根据区域ID查询启用的委外机构,并按优先级降序排序
                        comFirstList = plmsOutsrcComService.selectFirstByRegionId(regionId);
                        //如果此区域没有辐射的委外机构
                        if(comFirstList == null || comFirstList.isEmpty()){
                            comFirstList = new ArrayList<PlmsOutsrcCom>();
                            firstRegionComMap.put(regionId,comFirstList);
                            updateOutsrcList.add(out);              //一手案件没有辐射区域,委外机构为空且进入待审批
                            lastRegionId = regionId;
                            continue;
                        }else {
                            firstRegionComMap.put(regionId,comFirstList);
                        }
                    }
                    //如果此区域没有辐射的委外机构
                    if(comFirstList.isEmpty()){
                        updateOutsrcList.add(out);                  //一手案件没有辐射区域,委外机构为空且进入待审批
                        lastRegionId = regionId;
                        continue;
                    }

                    //防止下标越界,如果上一条记录的区域和当前记录不同,下标重置
                    if((lastRegionId != null && lastRegionId - regionId != 0) || comIndex == comFirstList.size()){
                        comIndex = 0;
                    }
                    firstDto.setComId(comFirstList.get(comIndex).getId());

                    out.setComId(comFirstList.get(comIndex).getId());      //预分配的委外机构

                    updateOutsrcList.add(out);

                    comIndex++;
                    lastRegionId = regionId;
                }
            }

        }
        //1.分配一手案件-结束

        //没有辐射区域的二手案件集合
        List<OutsrcDto> noComSecondList = new ArrayList<OutsrcDto>();
        //2.分配二手案件-开始
        if(secondList.size() > 0){
            //先进行排序
            secondList = this.sortOutsrc(secondList,2);

            //区域-委外机构map
            Map<Long,List<PlmsOutsrcCom>> secondRegionComMap = new HashMap<Long,List<PlmsOutsrcCom>>();
            List<PlmsOutsrcCom> comSecondList = null;       //委外机构集合
            Long lastRegionId = null;                       //上一条记录的区域ID
            int comIndex = 0;                               //委外机构循环下标
            for(OutsrcDto secondDto : secondList){
                //如果是退回的,还是原来的公司
                if(secondDto.getIsBack() != null && secondDto.getIsBack() - 1 == 0){
                    PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                    out.setId(secondDto.getId());
                    out.setFeeRate(secondDto.getFeeRate());
                    out.setRecivAmt(secondDto.getRecivAmt());
                    out.setOverdueDays(secondDto.getOverdueDays());
                    out.setSubmittedBy(userId);
                    out.setSubmitTime(time);
                    out.setUpdatedBy(userId);
                    out.setUpdateTime(time);
                    out.setRecVer(secondDto.getRecVer());
                    out.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);       //待审批

                    out.setStartDate(secondDto.getStartDate());             //委外开始日期
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(secondDto.getStartDate());
                    calendar.add(Calendar.MONTH,secondDto.getEndMonths());  //开始日期 + 预计委外月数
                    out.setEndDate(calendar.getTime());                     //预计结案日期

                    updateOutsrcList.add(out);
                }else {
                    Long regionId = secondDto.getRegionId();    //区域ID
                    comSecondList = secondRegionComMap.get(regionId);

                    if(comSecondList == null){
                        //根据区域ID查询启用的委外机构和机构二手案件在户数,并按在户数升序、优先级降序排序
                        comSecondList = plmsOutsrcComService.selectSecondByRegionId(regionId);
                        //如果此区域没有辐射的委外机构
                        if(comSecondList == null || comSecondList.isEmpty()){
                            comSecondList = new ArrayList<PlmsOutsrcCom>();
                            secondRegionComMap.put(regionId, comSecondList);
                            lastRegionId = regionId;
                            noComSecondList.add(secondDto);     //没有辐射区域的二手案件
                            continue;
                        }else {
                            secondRegionComMap.put(regionId,comSecondList);
                        }
                    }
                    //如果此区域没有辐射的委外机构
                    if(comSecondList.isEmpty()){
                        lastRegionId = regionId;
                        noComSecondList.add(secondDto);         //没有辐射区域的二手案件
                        continue;
                    }

                    //防止下标越界,如果上一条记录的区域和当前记录不同,下标重置
                    if((lastRegionId != null && lastRegionId - regionId != 0) || comIndex == comSecondList.size()){
                        comIndex = 0;
                    }

                    Long comId = comSecondList.get(comIndex).getId();   //循环取到的委外机构ID
                    Long applId = secondDto.getApplId();                //借款ID
                    String lotNo = secondDto.getLotNo();                //批次编号

                    //检查是否委外过给此机构
                    int count = plmsLaApplOutsrcMapper.countByExample(new PlmsLaApplOutsrcExample().setStatus(PlmsLaApplOutsrc.STATUS_ENDED).setComId(comId).setApplId(applId).setLotNo(lotNo));
                    if(count > 0){
                        //如果委外过且此区域只有一家机构
                        if(comSecondList.size() == 1){
                            lastRegionId = regionId;
                            noComSecondList.add(secondDto);         //没有辐射区域的二手案件
                            continue;
                        }else {
                            comIndex++;
                            comIndex = comIndex == comSecondList.size() ? 0 : comIndex;
                            comId = comSecondList.get(comIndex).getId();
                        }
                    }

                    secondDto.setComId(comId);

                    PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                    out.setId(secondDto.getId());
                    out.setFeeRate(secondDto.getFeeRate());
                    out.setRecivAmt(secondDto.getRecivAmt());
                    out.setOverdueDays(secondDto.getOverDaysNum());
                    out.setSubmittedBy(userId);
                    out.setSubmitTime(time);
                    out.setUpdatedBy(userId);
                    out.setUpdateTime(time);
                    out.setRecVer(secondDto.getRecVer());
                    out.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);       //待审批
                    out.setComId(comId);                                    //预分配的委外机构

                    out.setStartDate(secondDto.getStartDate());             //委外开始日期
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(secondDto.getStartDate());
                    calendar.add(Calendar.MONTH,secondDto.getEndMonths());  //开始日期 + 预计委外月数
                    out.setEndDate(calendar.getTime());                     //预计结案日期

                    updateOutsrcList.add(out);

                    comIndex++;
                    lastRegionId = regionId;
                }
            }
        }
        //2.分配二手案件-结束

        //3.分配没有辐射区域机构的二手案件-开始
        if(noComSecondList.size() > 0){
            //先进行排序
            noComSecondList = this.sortOutsrc(noComSecondList,3);

            //按优先级降序排序的启用的委外机构
            PlmsOutsrcComExample example = new PlmsOutsrcComExample().setIsActive("Y");
            example.setOrderByClause("T.WEIGHT DESC");
            List<PlmsOutsrcCom> comList = plmsOutsrcComService.selectByExample(example);
            //如果没有启用的委外机构
            if(comList == null || comList.isEmpty()){
                for(OutsrcDto noComDto : noComSecondList){
                    PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                    out.setId(noComDto.getId());
                    out.setFeeRate(noComDto.getFeeRate());
                    out.setRecivAmt(noComDto.getRecivAmt());
                    out.setOverdueDays(noComDto.getOverDaysNum());
                    out.setSubmittedBy(userId);
                    out.setSubmitTime(time);
                    out.setUpdatedBy(userId);
                    out.setUpdateTime(time);
                    out.setRecVer(noComDto.getRecVer());
                    out.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);       //待审批

                    out.setStartDate(noComDto.getStartDate());              //委外开始日期
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(noComDto.getStartDate());
                    calendar.add(Calendar.MONTH,noComDto.getEndMonths());   //开始日期 + 预计委外月数
                    out.setEndDate(calendar.getTime());                     //预计结案日期

                    updateOutsrcList.add(out);
                }
            }else {
                int comIndex = 0;                                           //委外机构循环下标
                for(OutsrcDto noComDto : noComSecondList){
                    if(comIndex == comList.size()){
                        comIndex = 0;
                    }

                    Long comId = comList.get(comIndex).getId();
                    Long applId = noComDto.getApplId();                     //借款ID
                    String lotNo = noComDto.getLotNo();                     //批次编号

                    //检查是否委外过给此机构
                    int count = plmsLaApplOutsrcMapper.countByExample(new PlmsLaApplOutsrcExample().setStatus(PlmsLaApplOutsrc.STATUS_ENDED).setComId(comId).setApplId(applId).setLotNo(lotNo));
                    if(count > 0){
                        //如果委外过且此区域只有一家机构
                        if(comList.size() == 1){
                            comId = null;
                        }else {
                            comIndex++;
                            comIndex = comIndex == comList.size() ? 0 : comIndex;
                            comId = comList.get(comIndex).getId();
                        }
                    }
                    PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                    out.setId(noComDto.getId());
                    out.setFeeRate(noComDto.getFeeRate());
                    out.setRecivAmt(noComDto.getRecivAmt());
                    out.setOverdueDays(noComDto.getOverDaysNum());
                    out.setSubmittedBy(userId);
                    out.setSubmitTime(time);
                    out.setUpdatedBy(userId);
                    out.setUpdateTime(time);
                    out.setRecVer(noComDto.getRecVer());
                    out.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);       //待审批
                    out.setComId(comId);                                    //预分配的委外机构,也可能为空

                    out.setStartDate(noComDto.getStartDate());              //委外开始日期
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(noComDto.getStartDate());
                    calendar.add(Calendar.MONTH,noComDto.getEndMonths());   //开始日期 + 预计委外月数
                    out.setEndDate(calendar.getTime());                     //预计结案日期

                    updateOutsrcList.add(out);
                    comIndex++;
                }
            }
        }
        //3.分配没有辐射区域机构的二手案件-结束

        //批量修改委外申请
        this.updateBatch(updateOutsrcList);
        //执行批量添加委外操作日志
        plmsLaApplOutsrcLogService.insertBatch(outLogList);
    }

    /**
     * 修改委外信息
     * @param outsrcList 委外申请集合
     * @param comId    外包公司ID
     * @param months    委外期限
     * @param session    登录用户
     */
    @Override
    public void saveModify(List<PlmsLaApplOutsrc> outsrcList,Long comId,int months, SessionMsg session) {
        String userId = session.getName();
        Date time = new Date();
        //修改集合
        List<PlmsLaApplOutsrc> updateList = new ArrayList<PlmsLaApplOutsrc>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        for(PlmsLaApplOutsrc outsrc : outsrcList){
            PlmsLaApplOutsrc updateOutsrc = new PlmsLaApplOutsrc();
            updateOutsrc.setId(outsrc.getId());
            updateOutsrc.setComId(comId);                  //外包公司ID

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(outsrc.getStartDate());
            calendar.add(Calendar.MONTH,months);
            updateOutsrc.setEndDate(calendar.getTime());    //预计退案时间
            updateOutsrc.setEndMonths(months);              //预计委外月数

            updateOutsrc.setUpdatedBy(userId);
            updateOutsrc.setUpdateTime(time);
            updateOutsrc.setRecVer(outsrc.getRecVer());
            updateList.add(updateOutsrc);

            PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
            outLog.setApplId(outsrc.getApplId());
            outLog.setType(PlmsLaApplOutsrcLog.TYPE_MODIFY);                //操作类型：修改
            outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
            outLog.setContent(session.getUserName() + "修改委外信息,委外期限:" + months + "个月");
            outLog.setCreatedBy(userId);
            outLog.setUpdatedBy(userId);
            outLog.setCreateTime(time);
            outLog.setUpdateTime(time);
            outLog.setRecVer(0L);
            outLog.setTagSeq(1L);
            outLogList.add(outLog);                                         //添加到集合
        }
        //批量修改委外信息
        this.updateBatch(updateList);
        //执行批量添加委外操作日志
        plmsLaApplOutsrcLogService.insertBatch(outLogList);
    }

    /**
     * 审批
     * @param result 审批结果:1-审批通过,2-审批拒绝
     * @param outsrcList 委外数据
     * @param session  登录用户
     * @param empCollect 委外区间的催收员
     */
    @Override
    public void saveApprove(int result,List<OutsrcDto> outsrcList, SessionMsg session, PlmsEmpCollectSet empCollect) {
        String userId = session.getName();
        Date time = new Date();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        //审批通过
        if(result == 1){
            //修改的委外申请集合
            List<PlmsLaApplOutsrc> updateOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
            //同步记录集合
            List<PlmsLaApplOutsrcMsg> msgList = new ArrayList<PlmsLaApplOutsrcMsg>();
            //委外案件分配给外包专员集合
            List<PlmsLaCollectAlloc> allocList = new ArrayList<PlmsLaCollectAlloc>();

            //获取事务管理器
            DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) AppContext.getBean("transactionManager");
            DefaultTransactionDefinition def = new DefaultTransactionDefinition();
            def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
            TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态
            try {
                //费率集合
                List<PlmsSysOutsrcRate> rateList = plmsSysOutsrcRateService.selectByExample(new PlmsSysOutsrcRateExample().setIsActive("Y"));

                //基础model
                BaseModel base = new BaseModel();
                base.setCreatedBy(userId);
                base.setUpdatedBy(userId);
                base.setCreateTime(time);
                base.setUpdateTime(time);
                base.setRecVer(0L);
                base.setTagSeq(1L);

                for(OutsrcDto dto : outsrcList){

                    PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                    out.setId(dto.getId());                                 //委外申请ID
                    out.setStatus(PlmsLaApplOutsrc.STATUS_APPROVED);        //已审批状态

                    out.setStartDate(dto.getStartDate());                   //委外开始时间

                    out.setApprovedBy(userId);                              //审批人
                    out.setApproveTime(time);                               //审批时间
                    out.setUpdatedBy(userId);
                    out.setUpdateTime(time);
                    out.setRecVer(dto.getRecVer());

                    out.setStartDate(dto.getStartDate());                   //委外开始日期
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(dto.getStartDate());
                    calendar.add(Calendar.MONTH,dto.getEndMonths());        //开始日期 + 预计委外月数
                    out.setEndDate(calendar.getTime());                     //预计结案日期

                    int overDaysNum = (dto.getOverDaysNum() == null ? 0 : dto.getOverDaysNum());            //最小期未还期数的逾期天数
                    BigDecimal feeRate = null;                                                              //服务费率
                    //如果是退回的,用原先的费率
                    if(dto.getIsBack() != null && dto.getIsBack() == 1){
                        feeRate = dto.getFeeRate();
                        overDaysNum = dto.getOverdueDays();
                    }else {
                        feeRate = this.getOutsrcRateByOverDays(rateList,overDaysNum);
                    }
                    BigDecimal recivAmt = dto.getRecivAmt();
                    recivAmt = recivAmt.add(recivAmt.multiply(feeRate).setScale(2, RoundingMode.HALF_UP));  //委外金额
                    dto.setOverDaysNum(overDaysNum);
                    dto.setFeeRate(feeRate);
                    dto.setRecivAmt(recivAmt);

                    out.setOverdueDays(overDaysNum);                        //逾期天数
                    out.setFeeRate(feeRate);                                //服务费率
                    out.setRecivAmt(recivAmt);                              //委外金额
                    out.setOutsrcCount(dto.getOutsrcCount() + 1);           //审批通过委外次数加1

                    updateOutsrcList.add(out);

                    PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog(base);     //委外操作日志
                    outLog.setApplId(dto.getApplId());
                    outLog.setType(PlmsLaApplOutsrcLog.TYPE_APPROVED);              //操作类型：审批
                    outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                    outLog.setContent(session.getUserName() + "审批通过");
                    outLogList.add(outLog);                                         //添加到集合

                    PlmsLaApplOutsrcMsg msg = new PlmsLaApplOutsrcMsg(base);
                    msg.setApplId(dto.getApplId());
                    msg.setPaymentId(dto.getPaymentId());
                    msg.setCntrctNo(dto.getCntrctNo());
                    msg.setCorpId(dto.getCorpId());
                    msg.setStartDate(dto.getStartDate());
                    msg.setEndDate(calendar.getTime());     //同步信息预计结案日
                    msg.setAcutalEndDate(null);
                    msg.setFeeRate(feeRate);
                    msg.setOutsrcType(dto.getOutsrcType());
                    msg.setRecivAmt(recivAmt);
                    msg.setStatus(PlmsLaApplOutsrc.STATUS_APPROVED);
                    msg.setSubmittedBy(dto.getSubmittedBy());
                    msg.setSubmitTime(dto.getSubmitTime());
                    msg.setApprovedBy(userId);
                    msg.setApproveTime(time);
                    msg.setLastExtentedBy(null);
                    msg.setLastExtentTime(null);
                    msg.setOverdueDays(overDaysNum);
                    msg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_NEW);
                    msg.setUuNo(UUID.randomUUID().toString());
                    msgList.add(msg);

                    //添加外包专员分配记录
                    allocList.add(this.setApproveAlloc(dto,empCollect,session.getName()));
                }

                //批量修改委外申请
                this.updateBatch(updateOutsrcList);
                //添加同步记录
                plmsLaApplOutsrcMsgService.insertBatch(msgList);
                //执行批量添加委外操作日志
                plmsLaApplOutsrcLogService.insertBatch(outLogList);
                //执行批量插入分配记录
                plmsLaCollectAllocService.insertBatch(allocList);

                transactionManager.commit(status);                          //提交事务
            }catch (Exception e){
                transactionManager.rollback(status);                        //发生异常,事务回滚
                e.printStackTrace();
                throw new RuntimeException(e);
            }

            try {
                //推送消息
                jmsSendService.sendOutsrcMessage(msgList);
            }catch (Exception e){
                e.printStackTrace();
                logger.error("发送消息队列失败");
            }

        }
        //审批拒绝
        else if(result == 2){
            //修改的委外申请集合
            List<PlmsLaApplOutsrc> updateOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
            //案件修改集合
            List<PlmsWorkOrderPool> updatePoolList = new ArrayList<PlmsWorkOrderPool>();
            //案件分配无效原催收员集合
            List<PlmsLaCollectAlloc> oldAllocList = new ArrayList<PlmsLaCollectAlloc>();
            //案件分配新增给原催收员集合
            List<PlmsLaCollectAlloc> allocList = new ArrayList<PlmsLaCollectAlloc>();
            //添加的待提交状态的委外申请集合
            List<PlmsLaApplOutsrc> addOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
            //如果审批不通过,将委外批次设为结束
            List<PlmsLaApplOutsrcLot> updateLotList = new ArrayList<PlmsLaApplOutsrcLot>();
            //区间与流转规则
            Map<String, Object> map = new HashMap<String, Object>();
            List<CollectionCircuDto> collectionCircuList = plmsCollectionRuleSetService.selectCollectionCircu(map);

            for(OutsrcDto dto : outsrcList){
                PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
                outLog.setApplId(dto.getApplId());
                outLog.setType(PlmsLaApplOutsrcLog.TYPE_APPROVED);              //操作类型：审批
                outLog.setResult(PlmsLaApplOutsrcLog.RESULT_REJECTED);
                outLog.setContent(session.getUserName() + "审批拒绝");
                outLog.setCreatedBy(userId);
                outLog.setUpdatedBy(userId);
                outLog.setCreateTime(time);
                outLog.setUpdateTime(time);
                outLog.setRecVer(0L);
                outLog.setTagSeq(1L);
                outLogList.add(outLog);                                         //添加到集合

                //最小期未还期数的逾期天数
                long overDaysNum = (dto.getOverDaysNum() == null ? 0 : dto.getOverDaysNum());
                //根据逾期天数,案件对应的区间
                String workStatus = null;
                if(overDaysNum == 0){
                    workStatus = "0";   //逾期天数为0,案件正常
                }else {
                    //根据逾期天数获取对应的区间与流转规则
                    CollectionCircuDto ccDto = this.getCollectionCircu(collectionCircuList,overDaysNum);
                    if(ccDto == null){
                        throw new RuntimeException("未找到对应逾期天数的区间:" + dto.getCntrctNo());
                    }
                    workStatus = ccDto.getStatus();
                    //如果发起申请时所在区间为空且逾期天数是在委外区间,或发起时且当前都在委外区间,添加一条待提交状态的记录
                    if( (StringUtil.isEmpty(dto.getWorkStatus()) && "OUTSOURC".equals(ccDto.getCircuRuleCode()))
                            || (!StringUtil.isEmpty(dto.getWorkStatus()) && dto.getWinfoStatus().equals(workStatus) && "OUTSOURC".equals(ccDto.getCircuRuleCode()))){
                        PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
                        outsrc.setPaymentId(dto.getPaymentId());                        //放款ID
                        outsrc.setApplId(dto.getApplId());                              //借款ID
                        outsrc.setCntrctId(dto.getCntrctId());                          //合同ID
                        outsrc.setStatus(PlmsLaApplOutsrc.STATUS_DRAFT);                //待提交状态
                        outsrc.setReason("审批拒绝时案件在委外区间");                      //委外原因
                        outsrc.setRemark("审批拒绝时案件在委外区间");                      //备注
                        outsrc.setLotNo(dto.getLotNo());                                //批次ID

                        outsrc.setOutsrcCount(dto.getOutsrcCount());                    //委外次数
                        outsrc.setLastComId(dto.getLastComId());                        //上家委外公司

                        outsrc.setStartDate(time);                                      //委外日期
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(time);
                        calendar.add(Calendar.MONTH,2);
                        outsrc.setEndDate(calendar.getTime());                          //预计退案日期
                        outsrc.setEndMonths(2);                                         //预计委外月数

                        outsrc.setFeeRate(BigDecimal.ZERO);                             //外包催收费率
                        outsrc.setOutsrcType(dto.getOutsrcType());                      //委外类型

                        outsrc.setCreateType(PlmsLaApplOutsrc.CREATE_TYPE_HAND);        //手动申请
                        outsrc.setAllot(null);                                          //发起申请时案件的催收员
                        outsrc.setWorkStatus(workStatus);                               //发起申请时案件的催收区间

                        outsrc.setIsBack(0);
                        outsrc.setCreatedBy(userId);
                        outsrc.setUpdatedBy(userId);
                        outsrc.setCreateTime(time);
                        outsrc.setUpdateTime(time);
                        outsrc.setRecVer(0L);
                        outsrc.setTagSeq(1L);

                        addOutsrcList.add(outsrc);                                      //添加到集合

                        PlmsLaApplOutsrcLog log = new PlmsLaApplOutsrcLog();            //委外操作日志
                        log.setApplId(dto.getApplId());
                        log.setType(PlmsLaApplOutsrcLog.TYPE_ADD);                      //操作类型：申请
                        log.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                        log.setContent(session.getUserName() + "审批拒绝时案件在委外区间,发起待提交的委外申请");
                        log.setCreatedBy(userId);
                        log.setUpdatedBy(userId);
                        log.setCreateTime(time);
                        log.setUpdateTime(time);
                        log.setRecVer(0L);
                        log.setTagSeq(1L);
                        outLogList.add(log);                                         //添加到集合
                    }else {
                        //如果原区间不为空,将案件移到原区间
                        if(!StringUtil.isEmpty(dto.getWorkStatus())){
                            workStatus = dto.getWorkStatus();
                            //如果案件原催收员不为空,分配给原催收员
                            if(!StringUtil.isEmpty(dto.getAllot())){
                                Map<String,Object> allocMap = new HashMap<String,Object>();
                                allocMap.put("paymentId", dto.getPaymentId());
                                allocMap.put("collector", dto.getAllot());
                                //此案件之前的分配记录
                                PlmsLaCollectAlloc oldAlloc = plmsLaCollectAllocService.selectMaxDateByMap(allocMap).get(0);
                                //1-将之前的分配记录置为无效 2-插入新纪录
                                PlmsLaCollectAlloc newAlloc = new PlmsLaCollectAlloc();
                                setNewAllocModel(oldAlloc,newAlloc,userId);
                                setUpdateOldAllocModel(oldAlloc,userId);
                                oldAllocList.add(oldAlloc);
                                allocList.add(newAlloc);

                                //如果审批不通过且案件此时不在委外区间
                                if(!StringUtil.isEmpty(dto.getLotNo())){
                                    PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                                    lot.setLotNo(dto.getLotNo());
                                    lot.setStatus(PlmsLaApplOutsrcLot.STATUS_END);  //结束
                                    lot.setUpdatedBy(userId);
                                    lot.setUpdateTime(time);
                                    updateLotList.add(lot);
                                }
                            }
                        }
                    }
                }

                //修改案件区间
                if(!workStatus.equals(dto.getPoolStatus()) && dto.getPoolRecVer() != null){
                    PlmsWorkOrderPool updateWork = new PlmsWorkOrderPool();
                    updateWork.setPaymentId(dto.getPaymentId());
                    updateWork.setStatus(workStatus);
                    updateWork.setRecVer(dto.getPoolRecVer());
                    updateWork.setUpdatedBy(userId);
                    updateWork.setUpdateTime(time);

                    updatePoolList.add(updateWork);
                }

                //修改委外申请
                PlmsLaApplOutsrc out = new PlmsLaApplOutsrc();
                out.setId(dto.getId());                                 //委外申请ID
                out.setStatus(PlmsLaApplOutsrc.STATUS_REJECTED);        //审批拒绝

                out.setApprovedBy(userId);                              //审批人
                out.setApproveTime(time);                               //审批时间
                out.setUpdatedBy(userId);
                out.setUpdateTime(time);
                out.setRecVer(dto.getRecVer());

                updateOutsrcList.add(out);
            }

            //批量修改委外申请
            this.updateBatch(updateOutsrcList);
            //批量添加待提交状态的委外申请
            this.insertBatch(addOutsrcList);
            //批量修改工单池案件状态
            plmsWorkOrderPoolService.updateBatch(updatePoolList);
            //批量无效原催收员分配记录
            plmsLaCollectAllocService.updateBatch(oldAllocList);
            //批量添加分配记录
            plmsLaCollectAllocService.insertBatch(allocList);
            //将委外批次设为结束
            plmsLaApplOutsrcLotService.updateBatch(updateLotList);
            //执行批量添加委外操作日志
            plmsLaApplOutsrcLogService.insertBatch(outLogList);

        }else {
            throw new RuntimeException("未知的审批结果");
        }

    }

    /**
     * 延期
     * @param outsrcList 委外数据
     * @param months 延期月数
     * @param session 登录用户
     */
    @Override
    public void saveExtented(List<OutsrcDto> outsrcList, int months, SessionMsg session) {
        String userId = session.getName();
        Date time = new Date();
        //修改集合
        List<PlmsLaApplOutsrc> updateList = new ArrayList<PlmsLaApplOutsrc>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        //同步记录集合
        List<PlmsLaApplOutsrcMsg> msgList = new ArrayList<PlmsLaApplOutsrcMsg>();

        //获取事务管理器
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) AppContext.getBean("transactionManager");
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
        TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态
        try {
            //基础model
            BaseModel base = new BaseModel();
            base.setCreatedBy(userId);
            base.setUpdatedBy(userId);
            base.setCreateTime(time);
            base.setUpdateTime(time);
            base.setRecVer(0L);
            base.setTagSeq(1L);
            for(OutsrcDto dto : outsrcList){
                PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
                outsrc.setId(dto.getId());

                Calendar c = Calendar.getInstance();
                c.setTime(dto.getEndDate());
                c.add(Calendar.MONTH,months);
                Date endDate = c.getTime();
                outsrc.setEndDate(endDate);         //预计结案日期

                outsrc.setLastExtentedBy(userId);
                outsrc.setLastExtentTime(time);

                outsrc.setUpdatedBy(userId);
                outsrc.setUpdateTime(time);
                outsrc.setRecVer(dto.getRecVer());
                updateList.add(outsrc);

                //同步记录
                PlmsLaApplOutsrcMsg msg = new PlmsLaApplOutsrcMsg(base);
                msg.setApplId(dto.getApplId());
                msg.setPaymentId(dto.getPaymentId());
                msg.setCntrctNo(dto.getCntrctNo());
                msg.setCorpId(dto.getCorpId());
                msg.setStartDate(dto.getStartDate());
                msg.setEndDate(endDate);
                msg.setAcutalEndDate(null);
                msg.setFeeRate(dto.getFeeRate());
                msg.setOutsrcType(dto.getOutsrcType());
                msg.setRecivAmt(dto.getRecivAmt());
                msg.setStatus(dto.getStatus());
                msg.setSubmittedBy(dto.getSubmittedBy());
                msg.setSubmitTime(dto.getSubmitTime());
                msg.setApprovedBy(dto.getApprovedBy());
                msg.setApproveTime(dto.getApproveTime());
                msg.setLastExtentedBy(userId);
                msg.setLastExtentTime(time);
                msg.setOverdueDays(dto.getOverdueDays());
                msg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_NEW);
                msg.setUuNo(UUID.randomUUID().toString());
                msgList.add(msg);

                PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog(base);     //委外操作日志
                outLog.setApplId(dto.getApplId());
                outLog.setType(PlmsLaApplOutsrcLog.TYPE_EXTENTED);              //操作类型：延期
                outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                outLog.setContent(session.getUserName() + "延期" + months + "个月");
                outLogList.add(outLog);                                         //添加到集合
            }
            //批量修改委外信息
            this.updateBatch(updateList);
            //添加同步记录
            plmsLaApplOutsrcMsgService.insertBatch(msgList);
            //执行批量添加委外操作日志
            plmsLaApplOutsrcLogService.insertBatch(outLogList);

            transactionManager.commit(status);                          //提交事务
        }catch (Exception e){
            transactionManager.rollback(status);                        //发生异常,事务回滚
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        try {
            jmsSendService.sendOutsrcMessage(msgList);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("发送消息队列失败");
        }

    }

    /**
     * 结案
     * @param outsrcList 委外数据
     * @param endDate    结案日期
     * @param userId 登录用户ID
     * @param userName 登录用户名字
     * @param isJob 是否定时器调用
     */
    @Override
    public void saveEnded(List<OutsrcDto> outsrcList, Date endDate,String userId,String userName,boolean isJob) {
        Date time = new Date();
        //委外申请修改集合
        List<PlmsLaApplOutsrc> updateList = new ArrayList<PlmsLaApplOutsrc>();
        //结案时将委外批次设为结束
        List<PlmsLaApplOutsrcLot> updateLotList = new ArrayList<PlmsLaApplOutsrcLot>();
        //案件修改集合
        List<PlmsWorkOrderPool> updatePoolList = new ArrayList<PlmsWorkOrderPool>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        //同步记录集合
        List<PlmsLaApplOutsrcMsg> msgList = new ArrayList<PlmsLaApplOutsrcMsg>();
        //放款IDS集合
        List<Long> paymentIds = new ArrayList<Long>();

        //获取事务管理器
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) AppContext.getBean("transactionManager");
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
        TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态
        try {
            //基础model
            BaseModel base = new BaseModel();
            base.setCreatedBy(userId);
            base.setUpdatedBy(userId);
            base.setCreateTime(time);
            base.setUpdateTime(time);
            base.setRecVer(0L);
            base.setTagSeq(1L);

            String content = null;
            for(OutsrcDto dto : outsrcList){
                //添加放款ID
                paymentIds.add(dto.getPaymentId());

                PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
                outsrc.setId(dto.getId());
                outsrc.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);        //已结案

                if(isJob){
                    //如果是结清且没到期的记录
                    if(LoanStatus.CLEAR.equals(dto.getWinfoStatus()) && endDate.before(dto.getEndDate())){
                        outsrc.setAcutalEndDate(endDate);
                        content = "案件结清自动结案";
                    }else {
                        //到期的记录实际结案日期为预计结案日期
                        outsrc.setAcutalEndDate(dto.getEndDate());
                        content = "到期自动结案";
                    }
                }else {
                    content = userName + "手动结案";
                    outsrc.setAcutalEndDate(endDate);
                }

                outsrc.setUpdatedBy(userId);
                outsrc.setUpdateTime(time);
                outsrc.setRecVer(dto.getRecVer());
                updateList.add(outsrc);

                //同步记录
                PlmsLaApplOutsrcMsg msg = new PlmsLaApplOutsrcMsg(base);
                msg.setApplId(dto.getApplId());
                msg.setPaymentId(dto.getPaymentId());
                msg.setCntrctNo(dto.getCntrctNo());
                msg.setCorpId(dto.getCorpId());
                msg.setStartDate(dto.getStartDate());
                msg.setEndDate(dto.getEndDate());
                msg.setAcutalEndDate(endDate);
                msg.setFeeRate(dto.getFeeRate());
                msg.setOutsrcType(dto.getOutsrcType());
                msg.setRecivAmt(dto.getRecivAmt());
                msg.setStatus(PlmsLaApplOutsrc.STATUS_ENDED);
                msg.setSubmittedBy(dto.getSubmittedBy());
                msg.setSubmitTime(dto.getSubmitTime());
                msg.setApprovedBy(dto.getApprovedBy());
                msg.setApproveTime(dto.getApproveTime());
                msg.setLastExtentedBy(dto.getLastExtentedBy());
                msg.setLastExtentTime(dto.getLastExtentTime());
                msg.setOverdueDays(dto.getOverdueDays());
                msg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_NEW);
                msg.setUuNo(UUID.randomUUID().toString());
                msgList.add(msg);

                PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog(base);     //委外操作日志
                outLog.setApplId(dto.getApplId());
                outLog.setType(PlmsLaApplOutsrcLog.TYPE_ENDED);                 //操作类型：结案
                outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                outLog.setContent(content);
                outLogList.add(outLog);                                         //添加到集合

                //如果案件结清了,将案件设置为正常
                if(LoanStatus.CLEAR.equals(dto.getWinfoStatus())){
                    //根据借款ID查询案件
                    PlmsWorkOrderPool workOrderPool = plmsWorkOrderPoolService.selectByApplId(dto.getApplId());
                    if(workOrderPool != null){
                        PlmsWorkOrderPool updateWork = new PlmsWorkOrderPool();
                        updateWork.setPaymentId(workOrderPool.getPaymentId());
                        //正常状态
                        updateWork.setStatus("0");
                        updateWork.setRecVer(workOrderPool.getRecVer());
                        updateWork.setUpdatedBy(userId);
                        updateWork.setUpdateTime(time);

                        updatePoolList.add(updateWork);
                    }

                    //如果结清,且有委外批次,把委外批次结束
                    if(!StringUtil.isEmpty(dto.getLotNo())){
                        PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                        lot.setLotNo(dto.getLotNo());
                        lot.setStatus(PlmsLaApplOutsrcLot.STATUS_END);  //结束
                        lot.setUpdatedBy(userId);
                        lot.setUpdateTime(time);
                        updateLotList.add(lot);
                    }
                }
            }

            //将委外批次设为结束
            plmsLaApplOutsrcLotService.updateBatch(updateLotList);
            //批量修改工单池案件状态
            plmsWorkOrderPoolService.updateBatch(updatePoolList);
            //批量修改委外信息
            this.updateBatch(updateList);
            //添加同步记录
            plmsLaApplOutsrcMsgService.insertBatch(msgList);
            //执行批量添加委外操作日志
            plmsLaApplOutsrcLogService.insertBatch(outLogList);
            //结束催收员
            plmsLaCollectAllocService.saveEendAlloc(paymentIds,userId,time);
            //结束代理催收员
            plmsLaCollectAgentService.saveEndAgent(paymentIds,userId,time);

            transactionManager.commit(status);                          //提交事务
        }catch (Exception e){
            transactionManager.rollback(status);                        //发生异常,事务回滚
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        try {
            jmsSendService.sendOutsrcMessage(msgList);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("发送消息队列失败:");
        }

    }

    /**
     * 撤销结案
     * @param outsrcList 委外数据
     * @param session    登录用户
     */
    @Override
    public void saveUnDoEnded(List<OutsrcDto> outsrcList, SessionMsg session) {
        String userId = session.getName();
        Date time = new Date();
        //委外申请修改集合
        List<PlmsLaApplOutsrc> updateList = new ArrayList<PlmsLaApplOutsrc>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();
        //同步记录集合
        List<PlmsLaApplOutsrcMsg> msgList = new ArrayList<PlmsLaApplOutsrcMsg>();

        //获取事务管理器
        DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) AppContext.getBean("transactionManager");
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
        TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态
        try {
            //基础model
            BaseModel base = new BaseModel();
            base.setCreatedBy(userId);
            base.setUpdatedBy(userId);
            base.setCreateTime(time);
            base.setUpdateTime(time);
            base.setRecVer(0L);
            base.setTagSeq(1L);

            for(OutsrcDto dto : outsrcList){
                PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
                outsrc.setId(dto.getId());
                outsrc.setStatus(PlmsLaApplOutsrc.STATUS_APPROVED);        //已审批

                outsrc.setIsSetAcutalEndDateNull(true);                     //实际结案日期设为null

                outsrc.setUpdatedBy(userId);
                outsrc.setUpdateTime(time);
                outsrc.setRecVer(dto.getRecVer());
                updateList.add(outsrc);

                //同步记录
                PlmsLaApplOutsrcMsg msg = new PlmsLaApplOutsrcMsg(base);
                msg.setApplId(dto.getApplId());
                msg.setPaymentId(dto.getPaymentId());
                msg.setCntrctNo(dto.getCntrctNo());
                msg.setCorpId(dto.getCorpId());
                msg.setStartDate(dto.getStartDate());
                msg.setEndDate(dto.getEndDate());
                msg.setAcutalEndDate(null);
                msg.setFeeRate(dto.getFeeRate());
                msg.setOutsrcType(dto.getOutsrcType());
                msg.setRecivAmt(dto.getRecivAmt());
                msg.setStatus(PlmsLaApplOutsrc.STATUS_APPROVED);
                msg.setSubmittedBy(dto.getSubmittedBy());
                msg.setSubmitTime(dto.getSubmitTime());
                msg.setApprovedBy(dto.getApprovedBy());
                msg.setApproveTime(dto.getApproveTime());
                msg.setLastExtentedBy(dto.getLastExtentedBy());
                msg.setLastExtentTime(dto.getLastExtentTime());
                msg.setOverdueDays(dto.getOverdueDays());
                msg.setMsgStatus(PlmsLaApplOutsrcMsg.MSG_STATUS_NEW);
                msg.setUuNo(UUID.randomUUID().toString());
                msgList.add(msg);

                PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog(base);     //委外操作日志
                outLog.setApplId(dto.getApplId());
                outLog.setType(PlmsLaApplOutsrcLog.TYPE_UN_DO_ENDED);           //操作类型：撤销结案
                outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
                outLog.setContent(session.getUserName() + "撤销结案");
                outLogList.add(outLog);                                         //添加到集合
            }
            //批量修改委外信息
            this.updateBatch(updateList);
            //添加同步记录
            plmsLaApplOutsrcMsgService.insertBatch(msgList);
            //执行批量添加委外操作日志
            plmsLaApplOutsrcLogService.insertBatch(outLogList);

            transactionManager.commit(status);                          //提交事务
        }catch (Exception e){
            transactionManager.rollback(status);                        //发生异常,事务回滚
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        try {
            jmsSendService.sendOutsrcMessage(msgList);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("发送消息队列失败:");
        }

    }

    /**
     * 案件转正常
     * @param outsrcList 委外数据
     * @param session    登录用户
     */
    @Override
    public void saveToNormal(List<OutsrcDto> outsrcList, SessionMsg session) {
        String userId = session.getName();
        Date time = new Date();

        //委外批次设为结束的集合
        List<PlmsLaApplOutsrcLot> updateLotList = new ArrayList<PlmsLaApplOutsrcLot>();
        //案件修改集合
        List<PlmsWorkOrderPool> updatePoolList = new ArrayList<PlmsWorkOrderPool>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();

        //区间与流转规则
        Map<String, Object> map = new HashMap<String, Object>();
        List<CollectionCircuDto> collectionCircuList = plmsCollectionRuleSetService.selectCollectionCircu(map);

        for(OutsrcDto dto : outsrcList){
            //最小期未还期数的逾期天数
            long overDaysNum = (dto.getOverDaysNum() == null ? 0 : dto.getOverDaysNum());
            //根据逾期天数,案件所对应的区间
            String workStatus = null;
            String ruleName = "";
            if(overDaysNum == 0){
                workStatus = "0";   //逾期天数为0,案件正常
                ruleName = "正常区间";
            }else {
                //根据逾期天数获取对应的区间与流转规则
                CollectionCircuDto ccDto = this.getCollectionCircu(collectionCircuList,overDaysNum);
                if(ccDto == null){
                    throw new RuntimeException("未找到对应逾期天数的区间:" + dto.getCntrctNo());
                }
                ruleName = ccDto.getName() + "区间";
                //如果案件的逾期天数对应在委外区间
                if("OUTSOURC".equals(ccDto.getCircuRuleCode())){
                    continue;
                }
                //如果案件的逾期天数不在委外区间,将案件移到对应天数区间、并将委外批次结束
                else {
                    workStatus = ccDto.getStatus();
                    //修改批次
                    if(!StringUtil.isEmpty(dto.getLotNo())){
                        PlmsLaApplOutsrcLot lot = new PlmsLaApplOutsrcLot();
                        lot.setLotNo(dto.getLotNo());
                        lot.setStatus(PlmsLaApplOutsrcLot.STATUS_END);  //结束
                        lot.setUpdatedBy(userId);
                        lot.setUpdateTime(time);
                        updateLotList.add(lot);
                    }
                }
            }

            //修改案件
            if(dto.getPoolRecVer() != null){
                PlmsWorkOrderPool updateWork = new PlmsWorkOrderPool();
                updateWork.setPaymentId(dto.getPaymentId());
                updateWork.setStatus(workStatus);
                updateWork.setRecVer(dto.getPoolRecVer());
                updateWork.setUpdatedBy(userId);
                updateWork.setUpdateTime(time);

                updatePoolList.add(updateWork);
            }

            PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
            outLog.setApplId(dto.getApplId());
            outLog.setType(PlmsLaApplOutsrcLog.TYPE_TO_NORMAL);             //操作类型：转正常
            outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
            outLog.setContent(session.getUserName() + "将案件转正常进入" + ruleName);
            outLog.setCreatedBy(userId);
            outLog.setUpdatedBy(userId);
            outLog.setCreateTime(time);
            outLog.setUpdateTime(time);
            outLog.setRecVer(0L);
            outLog.setTagSeq(1L);
            outLogList.add(outLog);                                         //添加到集合
        }

        //批量修改工单池案件状态
        plmsWorkOrderPoolService.updateBatch(updatePoolList);
        //将委外批次设为结束
        plmsLaApplOutsrcLotService.updateBatch(updateLotList);
        //执行批量添加委外操作日志
        plmsLaApplOutsrcLogService.insertBatch(outLogList);
    }

    /**
     * 退回
     * @param startDate 委外日期
     * @param outsrcList 委外数据,lastComId做过处理
     * @param session    登录用户
     */
    @Override
    public void saveBack(Date startDate,List<OutsrcDto> outsrcList, SessionMsg session) {
        //登录用户ID
        String userId = session.getName();
        Date time = new Date();
        //添加委外申请集合
        List<PlmsLaApplOutsrc> addOutsrcList = new ArrayList<PlmsLaApplOutsrc>();
        //新增委外操作日志集合
        List<PlmsLaApplOutsrcLog> outLogList = new ArrayList<PlmsLaApplOutsrcLog>();

        for(OutsrcDto dto : outsrcList){
            PlmsLaApplOutsrc outsrc = new PlmsLaApplOutsrc();
            outsrc.setPaymentId(dto.getPaymentId());                        //放款ID
            outsrc.setApplId(dto.getApplId());                              //借款ID
            outsrc.setCntrctId(dto.getCntrctId());                          //合同ID
            outsrc.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);            //待审批状态
            outsrc.setReason("已结案的记录执行退回");                          //委外原因
            outsrc.setRemark("已结案的记录执行退回");                          //备注
            outsrc.setLotNo(dto.getLotNo());                                //批次编号

            outsrc.setStartDate(startDate);                                 //委外日期/申请日期
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            calendar.add(Calendar.MONTH,2);
            outsrc.setEndDate(calendar.getTime());                          //预计退案日期
            outsrc.setEndMonths(2);                                         //预计委外月数

            //退回新增的待提交的记录,外包公司、催收费率、逾期天数用旧的
            outsrc.setComId(dto.getComId());                                //外包公司ID
            outsrc.setFeeRate(dto.getFeeRate());                            //外包催收费率
            outsrc.setOverdueDays(dto.getOverdueDays());                    //逾期天数
            outsrc.setIsBack(1);                                            //是退回时添加的记录
            outsrc.setOutsrcCount(dto.getOutsrcCount() + 1);                //委外次数
            outsrc.setLastComId(dto.getLastComId());                        ////将最新记录的外包公司ID做为下一条记录的上家委外公司ID

            //微贷计算应收金额参数
            CalculateSummaryReceivableParamDto param = new CalculateSummaryReceivableParamDto();
            param.setIsInAdvanceRepayment(Boolean.TRUE);        //是以提前结清方式计算
            param.setIsRenewLoanRepayment(Boolean.FALSE);
            param.setRenewLoanPenaltyRate(null);
            param.setContractNo(dto.getCntrctNo());
            param.setIdCardNo(dto.getIdCardNo());
            param.setRepaymentDate(startDate);
            //应收金额计算结果
            SimulateCalculateSummaryReceivableResultDto result = null;
            try {
                result = LoanServiceWSDL.getService().calculateSummaryReceivable(param);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("应收金额计算失败:" + e.getMessage());
            }
            if(result == null || result.getReceivableSumaryAmount() == null){
                throw new RuntimeException("应收金额计算失败");
            }
            //应收金额
            BigDecimal recivAmt = result.getReceivableSumaryAmount();
            //委外金额
            recivAmt = recivAmt.add(recivAmt.multiply(dto.getFeeRate()).setScale(2, RoundingMode.HALF_UP));
            outsrc.setRecivAmt(recivAmt);

            outsrc.setOutsrcType(PlmsLaApplOutsrc.OUT_SRC_TYPE_SECOND);     //委外类型:二手
            outsrc.setCreateType(PlmsLaApplOutsrc.CREATE_TYPE_HAND);        //手动申请
            outsrc.setAllot(null);                                          //发起申请时案件的催收员
            outsrc.setWorkStatus(dto.getPoolStatus());                      //发起申请时案件的催收区间

            outsrc.setSubmittedBy(userId);
            outsrc.setSubmitTime(time);
            outsrc.setCreatedBy(userId);
            outsrc.setUpdatedBy(userId);
            outsrc.setCreateTime(time);
            outsrc.setUpdateTime(time);
            outsrc.setRecVer(0L);
            outsrc.setTagSeq(1L);

            addOutsrcList.add(outsrc);                                      //添加到集合

            PlmsLaApplOutsrcLog outLog = new PlmsLaApplOutsrcLog();         //委外操作日志
            outLog.setApplId(dto.getApplId());
            outLog.setType(PlmsLaApplOutsrcLog.TYPE_BACK);                  //操作类型：退回
            outLog.setResult(PlmsLaApplOutsrcLog.RESULT_PASS);
            outLog.setContent(session.getUserName() + "退回");
            outLog.setCreatedBy(userId);
            outLog.setUpdatedBy(userId);
            outLog.setCreateTime(time);
            outLog.setUpdateTime(time);
            outLog.setRecVer(0L);
            outLog.setTagSeq(1L);
            outLogList.add(outLog);                                         //添加到集合
        }

        //批量插入委外申请信息
        this.insertBatch(addOutsrcList);
        //执行批量添加委外操作日志
        plmsLaApplOutsrcLogService.insertBatch(outLogList);
    }

    /**
     * Excel批量导入委外分配
     * @param inputStream 输入流
     * @param fileName    文件名称
     * @param userId      登录用户ID
     * @return JSONResult
     */
    @Override
    public JSONResult saveImportAllotByExcel(InputStream inputStream, String fileName, String userId) throws Exception {
        JSONResult result = this.getOutsrcList(inputStream, fileName, userId);
        if(!result.isSuccess()){
            return result;
        }
        //修改的委外信息集合
        List<PlmsLaApplOutsrc> updateOutsrcList = (List<PlmsLaApplOutsrc>)result.getData();
        if(updateOutsrcList.isEmpty()){
            return new JSONResult(false,"Excel文件为空");
        }

        //批量修改
        this.updateBatch(updateOutsrcList);

        return new JSONResult(true,"导入分配成功");
    }

    /**
     * 查询委外导出联系人通讯信息
     * @return List数据
     */
    @Override
    public List<OutsrcContactorExcelDto> selectOutsrcContactorExcel(OutsrcPageExample example) {
        return plmsLaApplOutsrcMapper.selectOutsrcContactorExcel(example);
    }

    /**
     * 查询委外导出联系人地址信息
     * @param example 查询条件
     * @return List数据
     */
    @Override
    public List<OutsrcAddressExcelDto> selectOutsrcAddressExcel(OutsrcPageExample example) {
        return plmsLaApplOutsrcMapper.selectOutsrcAddressExcel(example);
    }

    /**
     * 根据上传的Excel文件获取委外信息
     * @param inputStream 输入流
     * @param fileName 文件名称
     * @param userId 登录用户ID
     * @return JSONResult
     * */
    private JSONResult getOutsrcList(InputStream inputStream,String fileName,String userId) throws Exception {
        Workbook workbook = ExcelUtil.createWorkbook(inputStream, fileName);
        if(workbook == null){
            return new JSONResult(false,"表格不能为空");
        }

        //修改的委外信息集合
        List<PlmsLaApplOutsrc> updateOutsrcList = new ArrayList<PlmsLaApplOutsrc>();

        Sheet sheet = null;
        Row row = null;

        Date time = new Date();

        //外包公司名称 - 外包公司信息 Map
        Map<String,PlmsOutsrcCom> comMap = new HashMap<String,PlmsOutsrcCom>();
        //合同编号 - 数量 Map
        Map<String,Integer> cntrctNoMap = new HashMap<String,Integer>();

        //遍历Excel中所有的sheet
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            sheet = workbook.getSheetAt(i);
            if(sheet == null) continue;

            //遍历当前sheet中的所有行
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++){
                row = sheet.getRow(j);
                //排除第一行
                if(j == 0 || row == null) continue;

                if(row.getLastCellNum() >= 2){
                    //合同编号
                    String cntrctNo = ExcelUtil.getCellValue(row.getCell(0)).toString();
                    if(StringUtil.isEmpty(cntrctNo)) return new JSONResult(false,"合同编号不能为空");
                    if(cntrctNoMap.get(cntrctNo) != null){
                        return new JSONResult(false,"合同编号重复:" + cntrctNo);
                    }
                    cntrctNoMap.put(cntrctNo,1);

                    //外包公司名称
                    String comName = ExcelUtil.getCellValue(row.getCell(1)).toString();
                    if(StringUtil.isEmpty(comName)) return new JSONResult(false,"委外机构不能为空");

                    //委外期限
                    Integer months = null;
                    try {
                        months = Integer.valueOf(ExcelUtil.getCellValue(row.getCell(2)).toString());
                    }catch (Exception e){
                        e.printStackTrace();
                        return new JSONResult(false,"委外期限为空或格式错误");
                    }
                    if(months == null || months < 1){
                        return new JSONResult(false,"委外期限不能小于1个月");
                    }
                    if(months > 12){
                        return new JSONResult(false,"委外期限不能大于12个月");
                    }

                    PlmsOutsrcCom com = comMap.get(comName);
                    if(com == null){
                        //根据委外公司名称查询
                        com = plmsOutsrcComService.selectByComName(comName);
                        if(com == null){
                            return new JSONResult(false,"委外机构不存在：" + comName);
                        }else {
                            if(!"Y".equals(com.getIsActive())){
                                return new JSONResult(false,"委外机构已停用：" + comName);
                            }
                            comMap.put(comName,com);
                        }
                    }

                    PlmsLaApplOutsrcExample example = new PlmsLaApplOutsrcExample();
                    example.setCntrctNo(cntrctNo);
                    example.setStatus(PlmsLaApplOutsrc.STATUS_SUBMITTED);       //待审批
                    List<PlmsLaApplOutsrc> submittedList = this.selectByExample(example);
                    if(submittedList == null || submittedList.isEmpty()){
                        return new JSONResult(false,"未找到待审批状态的记录：" + cntrctNo);
                    }
                    if(submittedList.size() > 1){
                        return new JSONResult(false,"找到多条待审批状态的记录：" + cntrctNo);
                    }
                    //待审批的记录
                    PlmsLaApplOutsrc submittedOut = submittedList.get(0);

                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(submittedOut.getStartDate());
                    calendar.add(Calendar.MONTH,months);

                    PlmsLaApplOutsrc updateOut = new PlmsLaApplOutsrc();
                    updateOut.setId(submittedOut.getId());
                    updateOut.setRecVer(submittedOut.getRecVer());
                    updateOut.setComId(com.getId());                        //外包公司ID
                    updateOut.setEndDate(calendar.getTime());               //预计结案日期
                    updateOut.setEndMonths(months);                         //预计委外月数
                    updateOut.setUpdatedBy(userId);
                    updateOut.setUpdateTime(time);
                    updateOutsrcList.add(updateOut);
                }
            }
        }

        return new JSONResult(updateOutsrcList,"成功",true);
    }

    /**
     * 根据逾期天数获取对应的区间与流转规则
     * @param collectionCircuList 区间与流转规则集合
     * @param overDaysNum 逾期天数
     * @return 区间与流转规则
     */
    private CollectionCircuDto getCollectionCircu(List<CollectionCircuDto> collectionCircuList,long overDaysNum){
        if(collectionCircuList == null || collectionCircuList.isEmpty()){
            throw new RuntimeException("未找到区间流转规则");
        }
        for(CollectionCircuDto dto : collectionCircuList){
            if(overDaysNum >= dto.getOverduedaysFrom() && overDaysNum <= dto.getOverduedaysTo()){
                return dto;
            }
        }
        return null;
    }

    /**
     * 根据逾期天数获取费率
     * @param rateList 费率集合
     * @param overDaysNum 最小期未还期数的逾期天数
     * @return 费率
     */
    private BigDecimal getOutsrcRateByOverDays(List<PlmsSysOutsrcRate> rateList,int overDaysNum){
        BigDecimal rate = BigDecimal.ZERO;
        if(rateList != null && rateList.size() > 0){
            for(PlmsSysOutsrcRate sysOutsrcRate : rateList){
                Integer overdueDaysFrom = sysOutsrcRate.getOverdueDaysFrom() == null ? 0 : sysOutsrcRate.getOverdueDaysFrom();
                Integer overdueDaysTo = sysOutsrcRate.getOverdueDaysTo() == null ? 999999999 : sysOutsrcRate.getOverdueDaysTo();
                if(overDaysNum >= overdueDaysFrom && overDaysNum <= overdueDaysTo){
                    rate = sysOutsrcRate.getServiceRate();
                }
            }
        }
        return rate;
    }

    /**
     * 将委外信息进行排序
     * @param outsrcList 委外信息
     * @param type 类型:1-一手案件、2-二手案件、3-没有辐射区域的案件
     * @return List 排序后的委外信息
     */
    private List<OutsrcDto> sortOutsrc(List<OutsrcDto> outsrcList,int type){
        if(type == 1){
            //委外金额降序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o2.getRecivAmt().compareTo(o1.getRecivAmt());
                }
            });
            //区域降序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o2.getRegionId().compareTo(o1.getRegionId());
                }
            });
        }else if(type == 2){
            //委外金额降序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o2.getRecivAmt().compareTo(o1.getRecivAmt());
                }
            });
            //逾期天数升序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o1.getOverDaysNum().compareTo(o2.getOverDaysNum());
                }
            });
            //区域降序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o2.getRegionId().compareTo(o1.getRegionId());
                }
            });
        }else if(type == 3){
            //委外金额降序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o2.getRecivAmt().compareTo(o1.getRecivAmt());
                }
            });
            //逾期天数升序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o1.getOverDaysNum().compareTo(o2.getOverDaysNum());
                }
            });
            //外包次数升序
            Collections.sort(outsrcList, new Comparator<OutsrcDto>() {
                @Override
                public int compare(OutsrcDto o1, OutsrcDto o2) {
                    return o1.getOutsrcCount().compareTo(o2.getOutsrcCount());
                }
            });
        }else {
            throw new RuntimeException("未知的排序类型");
        }
        return outsrcList;
    }

    /**
     * 委外预分配(系统跑批流入委外区间时用)
     * @param outsrcList 委外信息
     * @return List 分配后的委外信息
     */
    private List<PlmsLaApplOutsrc> saveAllotAutoOutsrc(List<PlmsLaApplOutsrc> outsrcList){
        if(outsrcList.size() > 0){
            //先进行排序
            outsrcList = this.sortAutoOutsrc(outsrcList);

            //区域-委外机构map
            Map<Long,List<PlmsOutsrcCom>> firstRegionComMap = new HashMap<Long,List<PlmsOutsrcCom>>();
            List<PlmsOutsrcCom> comFirstList = null;    //委外机构集合
            Long lastRegionId = null;                   //上一条记录的区域ID
            int comIndex = 0;                           //委外机构循环下标
            for(PlmsLaApplOutsrc dto : outsrcList){
                Long regionId = dto.getRegionId();
                comFirstList = firstRegionComMap.get(regionId);

                if(comFirstList == null){
                    //根据区域ID查询启用的委外机构,并按优先级降序排序
                    comFirstList = plmsOutsrcComService.selectFirstByRegionId(regionId);
                    //如果此区域没有辐射的委外机构

                    if(comFirstList == null || comFirstList.isEmpty()){
                        comFirstList = new ArrayList<PlmsOutsrcCom>();
                        firstRegionComMap.put(regionId,comFirstList);
                        lastRegionId = regionId;
                        continue;
                    }else {
                        firstRegionComMap.put(regionId,comFirstList);
                    }
                }
                //如果此区域没有辐射的委外机构
                //没有辐射区域,委外机构为空且进入待审批
                if(comFirstList.isEmpty()){
                    lastRegionId = regionId;
                    continue;
                }

                //防止下标越界,如果上一条记录的区域和当前记录不同,下标重置
                if((lastRegionId != null && lastRegionId - regionId != 0) || comIndex == comFirstList.size()){
                    comIndex = 0;
                }

                dto.setComId(comFirstList.get(comIndex).getId());      //预分配的委外机构

                comIndex++;
                lastRegionId = regionId;
            }
        }
        return outsrcList;
    }

    /**
     * 将委外信息进行排序(系统跑批流入委外区间时用)
     * @param outsrcList 委外信息
     * @return List 排序后的委外信息
     */
    private List<PlmsLaApplOutsrc> sortAutoOutsrc(List<PlmsLaApplOutsrc> outsrcList){
        //委外金额降序
        Collections.sort(outsrcList, new Comparator<PlmsLaApplOutsrc>() {
            @Override
            public int compare(PlmsLaApplOutsrc o1, PlmsLaApplOutsrc o2) {
                return o2.getRecivAmt().compareTo(o1.getRecivAmt());
            }
        });
        //区域降序
        Collections.sort(outsrcList, new Comparator<PlmsLaApplOutsrc>() {
            @Override
            public int compare(PlmsLaApplOutsrc o1, PlmsLaApplOutsrc o2) {
                return o2.getRegionId().compareTo(o1.getRegionId());
            }
        });
        return outsrcList;
    }

    /**
     * 审批拒绝时构造新的分配记录
     * @param oldAlloc 旧的分配记录
     * @param newAlloc 新的分配记录
     * @param userId 操作人
     */
    private void setNewAllocModel(PlmsLaCollectAlloc oldAlloc,PlmsLaCollectAlloc newAlloc, String userId){
        newAlloc.setApplId(oldAlloc.getApplId());
        newAlloc.setPaymentId(oldAlloc.getPaymentId());
        newAlloc.setCollector(oldAlloc.getCollector());
        newAlloc.setOverdueDays(oldAlloc.getOverdueDays());
        newAlloc.setRemainingPrincipal(oldAlloc.getRemainingPrincipal());
        newAlloc.setAllocBeginDate(oldAlloc.getAllocBeginDate());
        newAlloc.setAssignTime(new Date());
        newAlloc.setAdjustedBy(userId);
        newAlloc.setAdjustTime(new Date());
        newAlloc.setAllocType("ADJUST");
        newAlloc.setRemark("委外审批拒绝时退回原催收员");
        newAlloc.setIsActive("Y");
        newAlloc.setCreatedBy(userId);
        newAlloc.setCreateTime(new Date());
        newAlloc.setUpdatedBy(userId);
        newAlloc.setUpdateTime(new Date());
        newAlloc.setRecVer(0L);
        newAlloc.setTagSeq(1L);
    }

    /**
     * 审批拒绝时构造需要修改的分配记录
     * @param oldAlloc 旧的分配记录
     * @param userId 操作人
     */
    private void setUpdateOldAllocModel(PlmsLaCollectAlloc oldAlloc,String userId) {
        oldAlloc.setAllocType("ADJUST");
        oldAlloc.setAdjustedBy(userId);
        oldAlloc.setAdjustTime(new Date());
        oldAlloc.setIsActive("N");
        oldAlloc.setUpdatedBy(userId);
        oldAlloc.setUpdateTime(new Date());
        oldAlloc.setRecVer(oldAlloc.getRecVer() + 1);
        oldAlloc.setTagSeq(oldAlloc.getTagSeq());
    }

    /**
     * 构造委外审批通过时分配记录
     * @param dto 委外信息
     * @param empCollect 催收员
     * @param sessionId 操作人
     * @return 分配记录
     */
    private PlmsLaCollectAlloc setApproveAlloc(OutsrcDto dto, PlmsEmpCollectSet empCollect,String sessionId){
        Date time = new Date();
        PlmsLaCollectAlloc alloc = new PlmsLaCollectAlloc();
        alloc.setPaymentId(dto.getPaymentId());
        alloc.setApplId(dto.getApplId());
        alloc.setOverdueDays(dto.getOverDaysNum() == null ? 0L : dto.getOverDaysNum());
        alloc.setRemainingPrincipal(dto.getResidueAmount() == null ? BigDecimal.ZERO : dto.getResidueAmount());
        alloc.setCollector(empCollect.getUserId());
        alloc.setAssignTime(time);
        alloc.setAllocBeginDate(time);
        alloc.setAllocType(PlmsLaCollectAlloc.TYPE_AUTO);
        alloc.setAdjustedBy(sessionId);
        alloc.setAdjustTime(time);
        alloc.setIsActive("Y");
        alloc.setCreatedBy(sessionId);
        alloc.setUpdatedBy(sessionId);
        alloc.setCreateTime(time);
        alloc.setUpdateTime(time);
        alloc.setRecVer(0L);
        alloc.setTagSeq(1L);
        return alloc;
    }

}
