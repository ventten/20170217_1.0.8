package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.enums.PurchaseMode;
import com.ljwd.plms.web.model.cust.PlmsClCarInfo;
import com.ljwd.plms.web.model.cust.PlmsClCarInfoExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClCarInfoService;
import com.ljwd.plms.web.vo.DataTableParam;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhengzw on 2016/6/12.
 * 客户车辆信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class CarController {

    @Resource
    private PlmsClCarInfoService carInfoService;

    /**
     * 客户车辆信息数据
     * */
    @RequestMapping(value = "/pageCarData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CAR_SELECT)
    public String pageCarData(PlmsClCarInfoExample example){
        if(example.getParamData() == null || "".equals(example.getParamData()) || example.getClCustId() == null){
            return PageUtil.getPageJson(1, new Page<Object>()); //参数有误返回返回空数据
        }

        //分页条件
        DataTableParam dataTableParam = PageUtil.getDataTableParamByJsonParam(example.getParamData());
        //记录操作的次数
        int sEcho = dataTableParam.getsEcho();
        //每页记录数
        int pageSize = dataTableParam.getiDisplayLength();
        //页数
        int pageNo = dataTableParam.getiDisplayStart() / dataTableParam.getiDisplayLength() + 1;

        example.setOrderByClause("T.ID DESC");

        Page<PlmsClCarInfo> pageData = new Page<PlmsClCarInfo>(pageNo, pageSize);

        pageData = carInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addCar",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CAR_INSERT)
    public JSONResult addCar(PlmsClCarInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(info.getFrameNo())){
            return new JSONResult(false,"请输入车架号");
        }

        //去重校验
        PlmsClCarInfoExample example = new PlmsClCarInfoExample();
        example.setClCustId(info.getClCustId()).setFrameNo(info.getFrameNo()).setLicenseNo(info.getLicenseNo()).setModel(info.getModel());
        int count = carInfoService.countByExample(example);
        if(count > 0){
            return new JSONResult(false,"该车辆已存在,请重新输入");
        }

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);

        int ret = carInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updateCar",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.CAR_UPDATE)
    public JSONResult updateCar(PlmsClCarInfo info){
        if(info.getId() == null || info.getRecVer() == null || info.getIsActive() == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误.");
        }

        if(!StringUtil.isEmpty(info.getFrameNo())
                && !StringUtil.isEmpty(info.getLicenseNo())
                && !StringUtil.isEmpty(info.getModel())){
            //去重校验
            PlmsClCarInfoExample example = new PlmsClCarInfoExample();
            example.setNoThisId(info.getId()).setClCustId(info.getClCustId()).setFrameNo(info.getFrameNo()).setLicenseNo(info.getLicenseNo()).setModel(info.getModel());
            int count = carInfoService.countByExample(example);
            if(count > 0){
                return new JSONResult(false,"该车辆已存在,请重新输入");
            }
        }

        //如果改为有效,清空无效原因
        if("Y".equals(info.getIsActive())){
            info.setRemark("");
        }
        //如果是一次性购买,清空月供、抵押时间、抵押银行、还款时间、评估金额
        if(info.getPurchaseMode() != null && info.getPurchaseMode() == PurchaseMode.DISPOSABLE){
            info.setMonRpmnt(null);
            info.setEstimationAmt(null);
            info.setMortgageDate(null);
            info.setRpmntDate(null);

            info.setMortgageBank("");
            info.setMonRpmntIsNull(true);
            info.setEstimationAmtIsNull(true);
            info.setMortgageDateIsNull(true);
            info.setRpmntDateIsNull(true);
        }

        String loginUser = SubjectUtil.getUserId();
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        
        int ret = carInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改车辆信息
     * */
    @RequestMapping(value = "/deleteCar",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteCar(PlmsClCarInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClCarInfo car = carInfoService.selectById(info.getId());
        if(car == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(car.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = carInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 字符串转日期类型参数
     * */
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

}
