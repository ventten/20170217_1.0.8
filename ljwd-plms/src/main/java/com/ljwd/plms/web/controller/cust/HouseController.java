package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.enums.PurchaseMode;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfo;
import com.ljwd.plms.web.model.cust.PlmsClHouseInfoExample;
import com.ljwd.plms.web.model.cust.SysAdministrativeRegion;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsClHouseInfoService;
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
 * 客户房产信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class HouseController {

    @Resource
    private PlmsClHouseInfoService houseInfoService;
    @Resource
    private PlmsClAddressInfoService addressInfoService;
    /**
     * 客户房产信息数据
     * */
    @RequestMapping(value = "/pageHouseData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ASSETS_SELECT)
    public String pageHouseData(PlmsClHouseInfoExample example){
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

        Page<PlmsClHouseInfo> pageData = new Page<PlmsClHouseInfo>(pageNo, pageSize);

        pageData = houseInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addHouse",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ASSETS_INSERT)
    public JSONResult addHouse(PlmsClHouseInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(info.getHpcNumber())){
            return new JSONResult(false,"请输入房产证号");
        }

        String provinceName = null;
        String cityName = null;
        String areaName = null;
        String addrDetails = null;
        //拼接地址
        //省
        if(info.getAddrProvinceId() != null){
        	provinceName = findAddreNameById(info.getAddrProvinceId()).getRname();
        }
        //市
        if(info.getAddrCityId() != null){
        	cityName = findAddreNameById(info.getAddrCityId()).getRname();
        }
        //区域
        if(info.getAddrAreaId() != null){
        	areaName = findAddreNameById(info.getAddrAreaId()).getRname();
        }
      //去掉详细地址中的空格和讲非法的"<"和">"转换成"（"和"）"
        if(info.getAddrDetails() != null){
        	addrDetails = (info.getAddrDetails()).replaceAll("\\s*", "");
        	addrDetails = addrDetails.replaceAll("<", "（");
        	addrDetails = addrDetails.replaceAll(">", "）");
        }
        //长地址
        String addr = (provinceName==null?"":provinceName)+(cityName==null?"":cityName)+(areaName==null?"":areaName)+(addrDetails==null?"":addrDetails);
        if(!"".equals(addr)){
        	info.setAddr(addr);
        }
        //去重校验
        PlmsClHouseInfoExample example = new PlmsClHouseInfoExample();
        example.setClCustId(info.getClCustId()).setHpcNumber(info.getHpcNumber()).setAddr(info.getAddr());
        int count = houseInfoService.countByExample(example);
        if(count > 0){
            return new JSONResult(false,"该房产已存在,请重新输入");
        }

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);

        int ret = houseInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updateHouse",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ASSETS_UPDATE)
    public JSONResult updateHouse(PlmsClHouseInfo info){
        if(info.getId() == null || info.getRecVer() == null || info.getIsActive() == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误.");
        }

        String provinceName = null;
        String cityName = null;
        String areaName = null;
        String addrDetails = null;
        //拼接地址
        //省
        if(info.getAddrProvinceId() != null){
        	provinceName = findAddreNameById(info.getAddrProvinceId()).getRname();
        }
        //市
        if(info.getAddrCityId() != null){
        	cityName = findAddreNameById(info.getAddrCityId()).getRname();
        }
        //区域
        if(info.getAddrAreaId() != null){
        	areaName = findAddreNameById(info.getAddrAreaId()).getRname();
        }
        //去掉详细地址中的空格和讲非法的"<"和">"转换成"（"和"）"
        if(info.getAddrDetails() != null){
        	addrDetails = (info.getAddrDetails()).replaceAll("\\s*", "");
        	addrDetails = addrDetails.replaceAll("<", "（");
        	addrDetails = addrDetails.replaceAll(">", "）");
        }
        //长地址
        String addr = (provinceName==null?"":provinceName)+(cityName==null?"":cityName)+(areaName==null?"":areaName)+(addrDetails==null?"":addrDetails);
        if(!"".equals(addr)){
        	info.setAddr(addr);
        }

        if(!StringUtil.isEmpty(info.getHpcNumber()) && !StringUtil.isEmpty(info.getAddr())){
            //去重校验
            PlmsClHouseInfoExample example = new PlmsClHouseInfoExample();
            example.setNoThisId(info.getId()).setClCustId(info.getClCustId()).setHpcNumber(info.getHpcNumber()).setAddr(info.getAddr());
            int count = houseInfoService.countByExample(example);
            if(count > 0){
                return new JSONResult(false,"该房产已存在,请重新输入");
            }
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

        int ret = houseInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 删除房产信息
     * */
    @RequestMapping(value = "/deleteHouse",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteHouse(PlmsClHouseInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClHouseInfo house = houseInfoService.selectById(info.getId());
        if(house == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(house.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = houseInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }
    /**
     * 通过记录ID查询行政区域的名称
     * @param id 记录ID
     * @return SysAdministrativeRegion
     */
    private SysAdministrativeRegion findAddreNameById(Long id){
    	if(id == null){
    		return null;
    	}
        return addressInfoService.findAddreNameById(id);
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
