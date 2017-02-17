package com.ljwd.plms.web.service.outsource.impl;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.generic.GenericDao;
import com.ljwd.plms.core.generic.GenericServiceImpl;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.ExcelUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.dao.outsource.PlmsLaApplOutsrcCollectMapper;
import com.ljwd.plms.web.model.case_collection.LnCntrct;
import com.ljwd.plms.web.model.outsource.*;
import com.ljwd.plms.web.model.type.PlmsLCollectControl;
import com.ljwd.plms.web.model.type.PlmsLCollectControlExample;
import com.ljwd.plms.web.service.case_collection.inf.LnCntrctService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcCollectService;
import com.ljwd.plms.web.service.outsource.inf.PlmsLaApplOutsrcService;
import com.ljwd.plms.web.service.outsource.inf.PlmsOutsrcComService;
import com.ljwd.plms.web.service.type.inf.PlmsLCollectControlService;
import com.ljwd.plms.web.vo.outsource.OutsrcCollectPageDto;
import com.ljwd.plms.web.vo.outsource.OutsrcCollectPageExample;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

/**
 * 委外催记表,PLMS_LA_APPL_OUTSRC_COLLECT
 * */
@Service
public class PlmsLaApplOutsrcCollectServiceImpl extends GenericServiceImpl<PlmsLaApplOutsrcCollect,Long> implements PlmsLaApplOutsrcCollectService {

    @Resource
    private PlmsLaApplOutsrcCollectMapper plmsLaApplOutsrcCollectMapper;
    @Resource
    private PlmsLCollectControlService plmsLCollectControlService;
    @Resource
    private PlmsLaApplOutsrcService plmsLaApplOutsrcService;
    @Resource
    private PlmsOutsrcComService plmsOutsrcComService;
    @Resource
    private LnCntrctService lnCntrctService;

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     * @return GenericDao实现类
     */
    @Override
    public GenericDao<PlmsLaApplOutsrcCollect, Long> getDao() {
        return plmsLaApplOutsrcCollectMapper;
    }

    /**
     * 插入对象
     * @param plmsLaApplOutsrcCollect 对象
     */
    @Override
    public int insert(PlmsLaApplOutsrcCollect plmsLaApplOutsrcCollect) {
        return plmsLaApplOutsrcCollectMapper.insert(plmsLaApplOutsrcCollect);
    }

    /**
     * 批量添加
     * @param list 添加的数据集合
     */
    @Override
    public void insertBatch(List<PlmsLaApplOutsrcCollect> list) {
        if(list == null || list.isEmpty()){
            return;
        }
        int comm = 500;
        int size = list.size()-1;
        if(size>=comm){
            List<PlmsLaApplOutsrcCollect> newList = new ArrayList<PlmsLaApplOutsrcCollect>();
            for(int i=0;i<=size;i++){
                if(i!=0&&i%comm==0||i==size){
                    newList.add(list.get(i));
                    plmsLaApplOutsrcCollectMapper.insertBatch(newList);
                    newList.clear();
                }else{
                    newList.add(list.get(i));
                }
            }
        }else{
            plmsLaApplOutsrcCollectMapper.insertBatch(list);
        }
    }

    /**
     * 批量修改
     * @param list 添加的数据集合
     */
    @Override
    public void updateBatch(List<PlmsLaApplOutsrcCollect> list) {
        if(list == null || list.isEmpty()){
            return;
        }
        plmsLaApplOutsrcCollectMapper.updateBatch(list);
    }

    /**
     * 根据条件统计数量
     * @param example 查询条件
     * @return 数量
     */
    @Override
    public int countByExample(PlmsLaApplOutsrcCollectExample example) {
        return plmsLaApplOutsrcCollectMapper.countByExample(example);
    }

    /**
     * 根据条件查询
     * @param example 查询条件
     * @return 实体集
     */
    @Override
    public List<PlmsLaApplOutsrcCollect> selectByExample(PlmsLaApplOutsrcCollectExample example) {
        return plmsLaApplOutsrcCollectMapper.selectByExample(example);
    }

    /**
     * 分页条件查询
     * @param page    Page信息
     * @param example 查询条件
     * @return Page数据
     */
    @Override
    public Page<OutsrcCollectPageDto> selectByExampleAndPage(Page<OutsrcCollectPageDto> page, OutsrcCollectPageExample example) {
        plmsLaApplOutsrcCollectMapper.selectByExampleAndPage(page, example);
        return page;
    }

    /**
     * Excel批量导入
     * @param inputStream 输入流
     * @param fileName    文件名称
     * @param loginUserId 登录用户ID
     * @return JSONResult
     */
    @Override
    public JSONResult saveCollectByExcel(InputStream inputStream, String fileName, String loginUserId) throws Exception {
        JSONResult result = this.getOutsrcCollectList(inputStream, fileName, loginUserId);
        if(!result.isSuccess()){
            return result;
        }
        List<PlmsLaApplOutsrcCollect> collectList = (List<PlmsLaApplOutsrcCollect>)result.getData();
        if(collectList.isEmpty()){
            return new JSONResult(false,"Excel文件为空");
        }
        this.insertBatch(collectList);
        return new JSONResult(true,"导入成功");
    }

    /**
     * 根据上传的Excel文件获取委外催记
     * @param inputStream 输入流
     * @param fileName 文件名称
     * @param loginUserId 登录用户ID
     * @return JSONResult
     * */
    private JSONResult getOutsrcCollectList(InputStream inputStream,String fileName,String loginUserId) throws Exception {
        Workbook workbook = ExcelUtil.createWorkbook(inputStream, fileName);
        if(workbook == null){
            return new JSONResult(false,"表格不能为空");
        }

        //委外催记集合
        List<PlmsLaApplOutsrcCollect> collectList = new ArrayList<PlmsLaApplOutsrcCollect>();

        Sheet sheet = null;
        Row row = null;

        Date time = new Date();

        //外包公司名称 - 外包公司信息 Map
        Map<String,PlmsOutsrcCom> comMap = new HashMap<String,PlmsOutsrcCom>();
        //合同编号 - 合同信息 Map
        Map<String,LnCntrct> cntrctMap = new HashMap<String,LnCntrct>();
        //合同ID_外包公司ID - 委外次数 Map
        Map<String,Integer> outsrcCountMap = new HashMap<String,Integer>();

        //委外状态集合
        List<String> statusS = new ArrayList<String>();
        statusS.add(PlmsLaApplOutsrc.STATUS_APPROVED);  //已审批
        statusS.add(PlmsLaApplOutsrc.STATUS_ENDED);     //已结案

        //所以控管状态
        List<PlmsLCollectControl> controlList = plmsLCollectControlService.selectByExample(new PlmsLCollectControlExample().setIsActive("Y"));
        List<String> controlStrS = new ArrayList<String>();
        if(controlList != null && controlList.size() > 0){
            for(PlmsLCollectControl control : controlList){
                controlStrS.add(control.getCode());
            }
        }

        DecimalFormat df = new DecimalFormat("0.000000");

        //遍历Excel中所有的sheet
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            sheet = workbook.getSheetAt(i);
            if(sheet == null) continue;

            //遍历当前sheet中的所有行
            for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++){
                row = sheet.getRow(j);
                //排除第一行
                if(j == 0 || row == null) continue;

                if(row.getLastCellNum() >= 9){
                    String comName = ExcelUtil.getCellValue(row.getCell(0)).toString();
                    if(StringUtil.isEmpty(comName)) return new JSONResult(false,"委外机构不能为空");

                    String cntrctNo = ExcelUtil.getCellValue(row.getCell(1)).toString();
                    if(StringUtil.isEmpty(cntrctNo)) return new JSONResult(false,"合同编号不能为空");

                    //逾期期数
                    Integer overduePeriod = null;
                    try {
                        overduePeriod = Integer.valueOf(ExcelUtil.getCellValue(row.getCell(4)).toString());
                    }catch (Exception e){
                        e.printStackTrace();
                        return new JSONResult(false,"逾期期数为空或格式错误");
                    }
                    if(overduePeriod == null || overduePeriod < 1){
                        return new JSONResult(false,"逾期期数错误");
                    }

                    //逾期天数
                    Integer overdueDays = null;
                    try {
                        overdueDays = Integer.valueOf(ExcelUtil.getCellValue(row.getCell(5)).toString());
                    }catch (Exception e){
                        e.printStackTrace();
                        return new JSONResult(false,"逾期天数为空或格式错误");
                    }
                    if(overdueDays == null || overdueDays < 0){
                        return new JSONResult(false,"逾期天数错误");
                    }

                    //控管状态
                    String controlStatus = ExcelUtil.getCellValue(row.getCell(6)).toString();
                    if(StringUtil.isEmpty(controlStatus)){
                        return new JSONResult(false,"控管状态为空");
                    }
                    if(!controlStrS.contains(controlStatus)){
                        return new JSONResult(false,"不存在的控管状态：" + controlStatus);
                    }

                    //委外金额
                    BigDecimal recivAmt = null;
                    try {
                        recivAmt = BigDecimal.valueOf(Double.valueOf(df.format(row.getCell(7).getNumericCellValue())));
                    }catch (Exception e){
                        e.printStackTrace();
                        return new JSONResult(false,"委外金额为空或格式错误");
                    }
                    if(recivAmt == null || recivAmt.compareTo(BigDecimal.ZERO) < 0){
                        return new JSONResult(false,"委外金额错误");
                    }

                    //回收金额
                    BigDecimal recycleAmt = null;
                    try {
                        recycleAmt = BigDecimal.valueOf(Double.valueOf(df.format(row.getCell(8).getNumericCellValue())));
                    }catch (Exception e){
                        e.printStackTrace();
                        return new JSONResult(false,"回收金额为空或格式错误");
                    }
                    if(recycleAmt == null || recycleAmt.compareTo(BigDecimal.ZERO) < 0){
                        return new JSONResult(false,"回收金额错误");
                    }

                    //最后跟进时间
                    Date followTime = null;
                    try {
                        followTime = D.toDate(ExcelUtil.getCellValue(row.getCell(9)).toString());
                    }catch (Exception e){
                        e.printStackTrace();
                        return new JSONResult(false,"最后跟进时间为空或格式错误(yyyy/mm/dd)");
                    }
                    if(followTime == null){
                        return new JSONResult(false,"最后跟进时间错误");
                    }

                    PlmsOutsrcCom com = comMap.get(comName);
                    if(com == null){
                        //根据委外公司名称查询
                        com = plmsOutsrcComService.selectByComName(comName);
                        if(com == null){
                            return new JSONResult(false,"委外机构不存在：" + comName);
                        }else {
                            comMap.put(comName,com);
                        }
                    }

                    LnCntrct cntrct = cntrctMap.get(cntrctNo);
                    if(cntrct == null){
                        //根据合同编号查找
                        cntrct = lnCntrctService.selectByCntrctNo(cntrctNo);
                        if(cntrct == null){
                            return new JSONResult(false,"合同不存在：" + cntrctNo);
                        }else {
                            cntrctMap.put(cntrctNo,cntrct);
                        }
                    }

                    Integer count = outsrcCountMap.get(cntrct.getId() + "_" + com.getId());
                    if(count == null){
                        //根据数量判断此合同是否委外过给该公司
                        count = plmsLaApplOutsrcService.countByExample(new PlmsLaApplOutsrcExample()
                                .setCntrctId(cntrct.getId()).setComId(com.getId()).setStatusS(statusS));
                        outsrcCountMap.put(cntrct.getId() + "_" + com.getId(),count);
                    }
                    if(count < 1){
                        return new JSONResult(false,"合同" + cntrctNo + "未曾委外给" + comName);
                    }

                    PlmsLaApplOutsrcCollect collect = new PlmsLaApplOutsrcCollect();
                    collect.setApplId(cntrct.getApplId());
                    collect.setCntrctId(cntrct.getId());
                    collect.setComId(com.getId());

                    collect.setOverduePeriod(overduePeriod);
                    collect.setOverdueDays(overdueDays);
                    collect.setControlStatus(controlStatus);
                    collect.setRecivAmt(recivAmt);
                    collect.setRecycleAmt(recycleAmt);
                    collect.setFollowTime(followTime);

                    collect.setCreateTime(time);
                    collect.setUpdateTime(time);
                    collect.setCreatedBy(loginUserId);
                    collect.setUpdatedBy(loginUserId);
                    collect.setRecVer(0L);
                    collect.setTagSeq(1L);

                    collectList.add(collect);
                }
            }
        }

        return new JSONResult(collectList,"成功",true);
    }

}
