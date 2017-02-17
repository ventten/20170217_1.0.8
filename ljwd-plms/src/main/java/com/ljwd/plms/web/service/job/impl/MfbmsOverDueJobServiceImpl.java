package com.ljwd.plms.web.service.job.impl;

import com.ljwd.plms.core.util.AppContext;
import com.ljwd.plms.core.util.D;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.enums.PurchaseMode;
import com.ljwd.plms.web.model.cust.*;
import com.ljwd.plms.web.service.cust.inf.*;
import com.ljwd.plms.web.service.job.inf.MfbmsOverDueJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by zhengzw on 2016/6/6
 * 客户信息管理-跑批
 */
@Service
public class MfbmsOverDueJobServiceImpl implements MfbmsOverDueJobService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final Boolean synchronizedObject = true;

    @Resource
    private PlmsLnAnnexService annexService;
    @Resource
    private PlmsClCarInfoService carInfoService;
    @Resource
    private PlmsClCustInfoService custInfoService;
    @Resource
    private PlmsLnApplInfoService applInfoService;
    @Resource
    private PlmsClUnitInfoService unitInfoService;
    @Resource
    private PlmsClHouseInfoService houseInfoService;
    @Resource
    private PlmsClPolicyInfoService policyInfoService;
    @Resource
    private PlmsClAccountInfoService accountInfoService;
    @Resource
    private PlmsClAddressInfoService addressInfoService;
    @Resource
    private PlmsClContactorInfoService contactorInfoService;

    /**
     * 将微贷系统贷款的状态同步到贷后系统
     */
    @Override
    public String doMfbmsApplyStatus() {
        synchronized (synchronizedObject){
            logger.info("开始跑批-同步贷款状态");
            //查找微贷系统已结清且贷后系统在途中的借款
            List<PlmsLnApplInfo> list = applInfoService.findSettleApplyFromMfbms();

            StringBuffer str = new StringBuffer();
            str.append("同步贷款状态:");

            int size = list == null ? 0 : list.size();

            if(size > 0){
                logger.info("发现" + size + "条借款需同步");
                String by = "system";
                Date time = new Date();
                for(PlmsLnApplInfo info : list){
                    info.setLoanState(PlmsLnApplInfo.STATUS_SETTLE);
                    info.setUpdatedBy(by);
                    info.setUpdateTime(time);
                }
                //批量更新
                applInfoService.updateBatch(list);
            }
            logger.info("结束跑批-同步贷款状态");

            str.append("成功同步" + size + "借款的状态");
            return str.toString();
        }
    }

    /**
     * 将微贷系统逾期客户的全部信息导入系统
     */
    @Override
    public String doMfbmsOverDueCust() {
        synchronized (synchronizedObject){
            logger.info("开始跑批-导入逾期客户信息");
            StringBuffer str = new StringBuffer();
            str.append("导入信息:");
            //获取事务管理器
            DataSourceTransactionManager transactionManager = (DataSourceTransactionManager)AppContext.getBean("transactionManager");

            List<PlmsClCustInfo> custList = custInfoService.findMfbmsOverDueCust(1000);              //查找逾期的客户集合,每次取1000条
            int size = custList == null ? 0 : custList.size();
            int total = 0;
            while(size > 0){

                DefaultTransactionDefinition def = new DefaultTransactionDefinition();
                def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);          // 事物隔离级别,开启新事务
                TransactionStatus status = transactionManager.getTransaction(def);                   // 获得事务状态

                try {
                    List<String> docnoList = new ArrayList<String>();                                //身份证号码集合
                    Map<String,Long> docnoIdMap = new HashMap<String,Long>();                        //存放 key-身份证号 value-用户ID 的Map

                    //循环添加用户,取得custId
                    for(PlmsClCustInfo info : custList){
                        Long custId = info.getId();                                                  //客户ID
                        String docno = info.getDocno();                                              //客户身份证号
                        //如果客户是第一次逾期
                        if(custId == null){
                            //添加用户
                            custId = custInfoService.addCust(info.getCustName(),info.getGender(),info.getMarriage(),info.getDoctype(),docno,info.getBirthPlace(),info.getEducation(),info.getBirthday());
                        }

                        docnoList.add(docno);
                        docnoIdMap.put(docno,custId);                                                  //放入map
                    }

                    List<PlmsLnApplInfo> applList = this.addAppl(docnoList, docnoIdMap);
                    List<PlmsClAccountInfo> accountList = this.addAccount(docnoList, docnoIdMap);
                    List<PlmsClUnitInfo> unitList = this.addUnit(docnoList,docnoIdMap);
                    List<PlmsClAddressInfo> addressList = this.addAddress(docnoList,docnoIdMap);
                    List<PlmsClPolicyInfo> policyList = this.addPolicy(docnoList, docnoIdMap);
                    List<PlmsClContactorInfo> contactorList = this.addContactorFromContactor(docnoList, docnoIdMap);
                    List<PlmsClCarInfo> carList = this.addCar(docnoList, docnoIdMap);
                    List<PlmsClHouseInfo> houseList = this.addHouse(docnoList, docnoIdMap);
                    List<PlmsLnAnnex> annexList = this.addAnnex(docnoList,docnoIdMap);

                    applInfoService.insertBatch(applList);                      //批量添加借款信息
                    accountInfoService.insertBatch(accountList);                //批量添加流水信息
                    unitInfoService.insertBatch(unitList);                      //批量添加公司信息
                    addressInfoService.insertBatch(addressList);                //批量添加地址信息
                    policyInfoService.insertBatch(policyList);                  //批量添加保单信息
                    contactorInfoService.insertBatch(contactorList);            //批量添加联系人信息
                    carInfoService.insertBatch(carList);                        //批量添加车辆信息
                    houseInfoService.insertBatch(houseList);                    //批量添加房产信息
                    annexService.insertBatch(annexList);                        //批量添加附件信息

                    transactionManager.commit(status);                          //提交事务

                    logger.info("成功从微贷系统将" + size + "位逾期客户的信息导入贷后系统");

                    total = total + size;
                    custList = custInfoService.findMfbmsOverDueCust(1000);       //重新取1000位逾期的客户
                    size = custList == null ? 0 : custList.size();

                }catch (Exception e){
                    e.printStackTrace();
                    size = 0;                                                   //发生异常,结束循环
                    transactionManager.rollback(status);                        //发生异常,事务回滚
                    str.append("导入逾期客户信息异常,跑批结束。");
                    logger.error("导入逾期客户信息异常,跑批结束:" + e.getMessage());
                }

            }

            logger.info("结束跑批-导入逾期客户信息");

            str.append("成功导入" + total + "位客户信息");

            return str.toString();
        }
    }

    private List<PlmsClUnitInfo> addUnit(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的公司集合
        List<PlmsClUnitInfo> addUnitList = new ArrayList<PlmsClUnitInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的单位信息
        List<PlmsClUnitInfo> units = unitInfoService.findMfbmsUnitByDocnoList(docnoList);
        if(units != null && units.size() > 0){
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClUnitInfo>> hasMap = new HashMap<Long,List<PlmsClUnitInfo>>();

            for(PlmsClUnitInfo unit : units){

                //如果公司名称和地址不为null
                if(!( StringUtil.isEmpty(unit.getUnitName()) && StringUtil.isEmpty(unit.getUnitAddr()) )){
                    Long clCustId = docnoIdMap.get(unit.getDocno());
                    unit.setClCustId(clCustId);
                    //是否重复
                    boolean isRepeat = false;
                    //此用户是否已有添加记录
                    List<PlmsClUnitInfo> hasList = hasMap.get(clCustId);
                    if(hasList == null){
                        hasList = new ArrayList<PlmsClUnitInfo>();
                    }else {
                        //校验重复的数据
                        String unitCheck = unit.getCheck();
                        for(PlmsClUnitInfo iteratorUnit : hasList){
                            //同一主贷人、单位名称、单位地址、姓名相同
                            if(unitCheck.equals(iteratorUnit.getCheck())){
                                isRepeat = true;
                                break;
                            }
                        }
                    }
                    //不重复
                    if(!isRepeat){
                        unit.setIsActive(isActive);
                        unit.setCreatedBy(by);
                        unit.setCreateTime(time);
                        unit.setUpdatedBy(by);
                        unit.setUpdateTime(time);
                        unit.setRecVer(verSeq);
                        unit.setTagSeq(tagSeq);

                        addUnitList.add(unit);  //添加到集合

                        hasList.add(unit);
                        hasMap.put(clCustId,hasList);
                    }
                }

            }
        }

        return addUnitList;
    }

    private List<PlmsLnAnnex> addAnnex(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的附件集合
        List<PlmsLnAnnex> annexList = new ArrayList<PlmsLnAnnex>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的附件
        List<PlmsLnAnnex> annexes = annexService.findMfbmsAnnexByDocnoList(docnoList);
        if(annexes != null && annexes.size() > 0){
            String srcCode = "WIN";
            String isDeleted = "N";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;
            for(PlmsLnAnnex annex : annexes){
                annex.setClCustId(docnoIdMap.get(annex.getDocno()));
                annex.setSrcCode(srcCode);
                annex.setIsDeleted(isDeleted);
                annex.setCreatedBy(by);
                annex.setCreateTime(time);
                annex.setUpdatedBy(by);
                annex.setUpdateTime(time);
                annex.setRecVer(verSeq);
                annex.setTagSeq(tagSeq);

                annexList.add(annex);  //添加到集合
            }
        }
        return annexList;
    }

    private List<PlmsClAddressInfo> addAddress(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的地址集合
        List<PlmsClAddressInfo> addressList = new ArrayList<PlmsClAddressInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的地址信息
        List<PlmsClAddressInfo> addresss = addressInfoService.findMfbmsAddressByDocnoList(docnoList);
        if(addresss != null && addresss.size() > 0){
            String srcCode = "WIN";
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClAddressInfo>> hasMap = new HashMap<Long,List<PlmsClAddressInfo>>();

            for(PlmsClAddressInfo address : addresss){

                //如果地址不为null
                if(!StringUtil.isEmpty(address.getAddr())){
                    Long clCustId = docnoIdMap.get(address.getDocno());
                    address.setClCustId(clCustId);
                    //是否重复
                    boolean isRepeat = false;
                    //此用户是否已有添加记录
                    List<PlmsClAddressInfo> hasList = hasMap.get(clCustId);
                    if(hasList == null){
                        hasList = new ArrayList<PlmsClAddressInfo>();
                    } else {
                        //校验重复的数据
                        String addressCheck = address.getCheck();
                        for(PlmsClAddressInfo iteratorAddr : hasList){
                            //同一个主贷人、姓名、详细地址、地址类型相同的
                            if(addressCheck.equals(iteratorAddr.getCheck())){
                                isRepeat = true;
                                break;
                            }
                        }
                    }
                    //不重复
                    if(!isRepeat){
                        address.setSrcCode(srcCode);
                        address.setIsActive(isActive);
                        address.setCreatedBy(by);
                        address.setCreateTime(time);
                        address.setUpdatedBy(by);
                        address.setUpdateTime(time);
                        address.setRecVer(verSeq);
                        address.setTagSeq(tagSeq);
                        addressList.add(address);                               //添加到集合

                        hasList.add(address);
                        hasMap.put(clCustId,hasList);
                    }
                }

            }
        }
        return addressList;
    }

    private List<PlmsClHouseInfo> addHouse(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的房产集合
        List<PlmsClHouseInfo> addHouseList = new ArrayList<PlmsClHouseInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的房产信息
        List<PlmsClHouseInfo> houses = houseInfoService.findMfbmsHouseByDocnoList(docnoList);
        if(houses != null && houses.size() > 0){
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClHouseInfo>> hasMap = new HashMap<Long,List<PlmsClHouseInfo>>();

            for(PlmsClHouseInfo house : houses){
                Long clCustId = docnoIdMap.get(house.getDocno());
                house.setClCustId(clCustId);
                //是否重复
                boolean isRepeat = false;
                //此用户是否已有添加记录
                List<PlmsClHouseInfo> hasList = hasMap.get(clCustId);
                if(hasList == null){
                    hasList = new ArrayList<PlmsClHouseInfo>();
                }else {
                    //校验重复的数据
                    String houseCheck = house.getCheck();
                    for(PlmsClHouseInfo iteratorHouse : hasList){
                        //同一主贷人、房产证号、房产地址相同
                        if(houseCheck.equals(iteratorHouse.getCheck())){
                            isRepeat = true;
                            break;
                        }
                    }
                }
                if(!isRepeat){
                    if(house.getMonRpmnt() == null || house.getMonRpmnt().compareTo(BigDecimal.ZERO) <= 0){
                        house.setPurchaseMode(PurchaseMode.DISPOSABLE);
                        house.setMonRpmnt(null);
                    }else {
                        house.setPurchaseMode(PurchaseMode.MORTGAGE);
                    }
                    house.setIsActive(isActive);
                    house.setCreatedBy(by);
                    house.setCreateTime(time);
                    house.setUpdatedBy(by);
                    house.setUpdateTime(time);
                    house.setRecVer(verSeq);
                    house.setTagSeq(tagSeq);

                    addHouseList.add(house);  //添加到集合

                    hasList.add(house);
                    hasMap.put(clCustId,hasList);
                }
            }
        }
        return addHouseList;
    }

    private List<PlmsClCarInfo> addCar(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的车辆集合
        List<PlmsClCarInfo> addCarList = new ArrayList<PlmsClCarInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的车辆信息
        List<PlmsClCarInfo> cars = carInfoService.findMfbmsCarByDocnoList(docnoList);
        if(cars != null && cars.size() > 0){
            String srcCode = "WIN";
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClCarInfo>> hasMap = new HashMap<Long,List<PlmsClCarInfo>>();

            for(PlmsClCarInfo car : cars){
                Long clCustId = docnoIdMap.get(car.getDocno());
                car.setClCustId(clCustId);
                //是否重复
                boolean isRepeat = false;
                //此用户是否已有添加记录
                List<PlmsClCarInfo> hasList = hasMap.get(clCustId);
                if(hasList == null){
                    hasList = new ArrayList<PlmsClCarInfo>();
                }else {
                    //校验是否重复
                    String carCheck = car.getCheck();
                    for(PlmsClCarInfo iteratorCar : hasList){
                        //同一主贷人、车牌号、车架号、车辆型号相同
                        if(carCheck.equals(iteratorCar.getCheck())){
                            isRepeat = true;
                            break;
                        }
                    }
                }
                if(!isRepeat){
                    car.setSrcCode(srcCode);
                    car.setIsActive(isActive);
                    car.setCreatedBy(by);
                    car.setCreateTime(time);
                    car.setUpdatedBy(by);
                    car.setUpdateTime(time);
                    car.setRecVer(verSeq);
                    car.setTagSeq(tagSeq);
                    addCarList.add(car);  //添加到集合

                    hasList.add(car);
                    hasMap.put(clCustId,hasList);
                }
            }
        }
        return addCarList;
    }

    private List<PlmsClPolicyInfo> addPolicy(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的保单集合
        List<PlmsClPolicyInfo> addPolicyList = new ArrayList<PlmsClPolicyInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的保单信息
        List<PlmsClPolicyInfo> policys = policyInfoService.findMfbmsPolicyByDocnoList(docnoList);
        if(policys != null && policys.size() > 0){
            String srcCode = "WIN";
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClPolicyInfo>> hasMap = new HashMap<Long,List<PlmsClPolicyInfo>>();

            for(PlmsClPolicyInfo policy : policys){
                Long clCustId = docnoIdMap.get(policy.getDocno());
                policy.setClCustId(clCustId);
                //是否重复
                boolean isRepeat = false;
                //此用户是否已有添加记录
                List<PlmsClPolicyInfo> hasList = hasMap.get(clCustId);
                if(hasList == null){
                    hasList = new ArrayList<PlmsClPolicyInfo>();
                }else {
                    //校验重复数据
                    String policyCheck = policy.getCheck();
                    for(PlmsClPolicyInfo iteratorPolicy : hasList){
                        //同一主贷人、其他信息都相同
                        if(policyCheck.equals(iteratorPolicy.getCheck())){
                            isRepeat = true;
                            break;
                        }
                    }
                }
                if(!isRepeat){
                    policy.setSrcCode(srcCode);
                    policy.setIsActive(isActive);
                    policy.setCreatedBy(by);
                    policy.setCreateTime(time);
                    policy.setUpdatedBy(by);
                    policy.setUpdateTime(time);
                    policy.setRecVer(verSeq);
                    policy.setTagSeq(tagSeq);

                    addPolicyList.add(policy);  //添加到集合

                    hasList.add(policy);
                    hasMap.put(clCustId,hasList);
                }
            }
        }
        return addPolicyList;
    }

    private List<PlmsClAccountInfo> addAccount(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的流水集合
        List<PlmsClAccountInfo> addAccountList = new ArrayList<PlmsClAccountInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的流水信息
        List<PlmsClAccountInfo> accounts = accountInfoService.findMfbmsAccountByDocnoList(docnoList);
        if(accounts != null && accounts.size() > 0){
            String srcCode = "WIN";
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClAccountInfo>> hasMap = new HashMap<Long,List<PlmsClAccountInfo>>();

            for(PlmsClAccountInfo account : accounts){
                Long clCustId = docnoIdMap.get(account.getDocno());
                account.setClCustId(clCustId);
                //是否重复
                boolean isRepeat = false;
                //此用户是否已有添加记录
                List<PlmsClAccountInfo> hasList = hasMap.get(clCustId);
                if(hasList == null){
                    hasList = new ArrayList<PlmsClAccountInfo>();
                } else {
                    //校验重复数据
                    String accountCheck = account.getCheck();
                    for(PlmsClAccountInfo iteratorAccount : hasList){
                        //同一主贷人、流水类别、账户户名、卡号/账号、开户行相同
                        if(accountCheck.equals(iteratorAccount.getCheck())){
                            isRepeat = true;
                            break;
                        }
                    }
                }
                if(!isRepeat){
                    account.setSrcCode(srcCode);
                    account.setIsActive(isActive);
                    account.setCreatedBy(by);
                    account.setCreateTime(time);
                    account.setUpdatedBy(by);
                    account.setUpdateTime(time);
                    account.setRecVer(verSeq);
                    account.setTagSeq(tagSeq);

                    addAccountList.add(account);  //添加到集合

                    hasList.add(account);
                    hasMap.put(clCustId,hasList);
                }

            }
        }
        return addAccountList;
    }

    private List<PlmsLnApplInfo> addAppl(List<String> docnoList,Map<String,Long> docnoIdMap){
        //要添加的借款集合
        List<PlmsLnApplInfo> applList = new ArrayList<PlmsLnApplInfo>();
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的借款申请
        List<PlmsLnApplInfo> appls = applInfoService.findMfbmsApplByDocnoList(docnoList);
        if(appls != null && appls.size() > 0){
            String srcCode = "WIN";
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;
            String com = "深圳赫美小额贷款股份有限公司";
            for(PlmsLnApplInfo appl : appls){
                appl.setClCustId(docnoIdMap.get(appl.getDocno()));
                appl.setLoanCompany(com);
                appl.setSrcCode(srcCode);
                appl.setLoanState(appl.getClearDate() == null ? PlmsLnApplInfo.STATUS_TRANSIT:PlmsLnApplInfo.STATUS_SETTLE);
                appl.setCreatedBy(by);
                appl.setCreateTime(time);
                appl.setUpdatedBy(by);
                appl.setUpdateTime(time);
                appl.setRecVer(verSeq);
                appl.setTagSeq(tagSeq);

                applList.add(appl);  //添加到集合
            }
        }
        return applList;
    }

    /**
     * 处理通讯信息(从电核表取数)
     * @param docnoList 身份证集合
     * @param docnoIdMap 身份证-客户ID Map
     * @return List<PlmsClContactorInfo>
     */
    private List<PlmsClContactorInfo> addContactorFromSurvey(List<String> docnoList,Map<String,Long> docnoIdMap){
        List<PlmsClContactorInfo> addContactorList = new ArrayList<PlmsClContactorInfo>();  //要添加的联系人集合
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的联系人信息
        List<PlmsClContactorInfo> contactors = contactorInfoService.findMfbmsContactorByDocnoList(docnoList);
        if(contactors != null && contactors.size() > 0){
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClContactorInfo>> hasMap = new HashMap<Long,List<PlmsClContactorInfo>>();

            for(PlmsClContactorInfo contactor : contactors){
                //如果电话不为空
                if(!StringUtil.isEmpty(contactor.getTel()) && !StringUtil.isEmpty(contactor.getTel().replaceAll("-",""))){
                    Long clCustId = docnoIdMap.get(contactor.getDocno());
                    contactor.setClCustId(clCustId);
                    String[] telS = contactor.getTel().split("-");
                    if(telS.length == 1){
                        contactor.setTel(telS[0]);
                    }else if(telS.length == 2){
                        contactor.setArea(telS[0]);
                        contactor.setTel(telS[1]);
                    }else if (telS.length >= 3){
                        contactor.setArea(telS[0]);
                        contactor.setTel(telS[1]);
                        contactor.setExt(telS[2]);
                    }

                    //如果tel不为空
                    if(!StringUtil.isEmpty(contactor.getTel())){
                        //是否重复
                        boolean isRepeat = false;
                        //此用户是否已有添加记录
                        List<PlmsClContactorInfo> hasList = hasMap.get(clCustId);
                        if(hasList == null){
                            hasList = new ArrayList<PlmsClContactorInfo>();
                        }else {
                            //校验重复数据
                            String contactorCheck = contactor.getCheck();
                            for(PlmsClContactorInfo iteratorContactor : hasList){
                                //同一主贷人、号码类型、区号、号码、分机号、姓名相同
                                if(contactorCheck.equals(iteratorContactor.getCheck())){
                                    isRepeat = true;
                                    break;
                                }
                            }
                        }
                        if(!isRepeat){
                            contactor.setIsActive(isActive);
                            contactor.setCreatedBy(by);
                            contactor.setCreateTime(time);
                            contactor.setUpdatedBy(by);
                            contactor.setUpdateTime(time);
                            contactor.setRecVer(verSeq);
                            contactor.setTagSeq(tagSeq);

                            addContactorList.add(contactor);  //添加到集合

                            hasList.add(contactor);
                            hasMap.put(clCustId,hasList);
                        }
                    }

                }
            }
        }
        return addContactorList;
    }

    /**
     * 处理通讯信息(从客户信息、职业信息、联系人信息表取数)
     * @param docnoList 身份证集合
     * @param docnoIdMap 身份证-客户ID Map
     * @return List<PlmsClContactorInfo>
     */
    private List<PlmsClContactorInfo> addContactorFromContactor(List<String> docnoList,Map<String,Long> docnoIdMap){
        List<PlmsClContactorInfo> addContactorList = new ArrayList<PlmsClContactorInfo>();  //要添加的联系人集合
        //根据客户身份证号集合查询微贷系统中未添加到贷后系统的联系人信息
        List<PlmsClContactorInfo> contactors = contactorInfoService.findMfbmsContactorByDocnoList2(docnoList);
        if(contactors != null && contactors.size() > 0){
            String isActive = "Y";
            String by = "system";
            Date time = new Date();
            Long verSeq = 0L;
            Long tagSeq = 1L;

            //已在添加集合的记录,key-贷后客户ID,value-此客户的添加集合
            Map<Long,List<PlmsClContactorInfo>> hasMap = new HashMap<Long,List<PlmsClContactorInfo>>();

            for(PlmsClContactorInfo contactor : contactors){
                //如果电话不为空
                if(!StringUtil.isEmpty(contactor.getTel()) && !StringUtil.isEmpty(contactor.getTel().replaceAll("-",""))){
                    Long clCustId = docnoIdMap.get(contactor.getDocno());
                    contactor.setClCustId(clCustId);

                    String[] telS = contactor.getTel().split("-");
                    if(telS.length == 1){
                        contactor.setTel(telS[0]);
                    }else if(telS.length == 2){
                        if(telS[0].length() >= 7){
                            contactor.setTel(telS[0]);
                            contactor.setExt(telS[1]);
                        }else {
                            contactor.setArea(telS[0]);
                            contactor.setTel(telS[1]);
                        }
                    }else if (telS.length >= 3){
                        contactor.setArea(telS[0]);
                        contactor.setTel(telS[1]);
                        contactor.setExt(telS[2]);
                    }

                    //如果tel不为空
                    if(!StringUtil.isEmpty(contactor.getTel())){
                        //如果是手机号码
                        if(StringUtil.isMobile(contactor.getTel())){
                            contactor.setTelType("MOBPHONE");
                        }else {
                            contactor.setTelType(contactor.getIfTelForType());
                        }
                        //是否重复
                        boolean isRepeat = false;
                        //此用户是否已有添加记录
                        List<PlmsClContactorInfo> hasList = hasMap.get(clCustId);
                        if(hasList == null){
                            hasList = new ArrayList<PlmsClContactorInfo>();
                        }else {
                            //校验重复数据
                            String contactorCheck = contactor.getCheck();
                            for(PlmsClContactorInfo iteratorContactor : hasList){
                                //同一主贷人、号码类型、区号、号码、分机号、姓名相同
                                if(contactorCheck.equals(iteratorContactor.getCheck())){
                                    isRepeat = true;
                                    break;
                                }
                            }
                        }
                        if(!isRepeat){
                            contactor.setIsActive(isActive);
                            contactor.setCreatedBy(by);
                            contactor.setCreateTime(time);
                            contactor.setUpdatedBy(by);
                            contactor.setUpdateTime(time);
                            contactor.setRecVer(verSeq);
                            contactor.setTagSeq(tagSeq);

                            addContactorList.add(contactor);  //添加到集合

                            hasList.add(contactor);
                            hasMap.put(clCustId,hasList);
                        }
                    }

                }
            }
        }
        return addContactorList;
    }

}
