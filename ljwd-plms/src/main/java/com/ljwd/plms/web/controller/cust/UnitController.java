package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfo;
import com.ljwd.plms.web.model.cust.PlmsClUnitInfoExample;
import com.ljwd.plms.web.model.cust.SysAdministrativeRegion;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsClUnitInfoService;
import com.ljwd.plms.web.vo.DataTableParam;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import java.util.Date;

/**
 * Created by zhengzw on 2016/6/12.
 * 客户单位信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class UnitController {

    @Resource
    private PlmsClUnitInfoService unitInfoService;
    @Resource
    private PlmsClAddressInfoService addressInfoService;

    /**
     * 客户单位信息数据
     * */
    @RequestMapping(value = "/pageUnitData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.UNIT_SELECT)
    public String pageUnitData(PlmsClUnitInfoExample example){
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

        Page<PlmsClUnitInfo> pageData = new Page<PlmsClUnitInfo>(pageNo, pageSize);

        pageData = unitInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addUnit",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.UNIT_INSERT)
    public JSONResult addUnit(PlmsClUnitInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        if(StringUtil.isEmpty(info.getUnitName())){
            return new JSONResult(false,"请输入单位名称");
        }
        if(StringUtil.isEmpty(info.getName())){
            return new JSONResult(false,"请输入姓名");
        }
        String provinceName = null;
        String cityName = null;
        String areaName = null;
        String addrDetails = null;
        //拼接地址
        //省
        if(info.getUnitAddrProvinceId() != null){
            provinceName = findAddreNameById(info.getUnitAddrProvinceId()).getRname();
        }
        //市
        if(info.getUnitAddrCityId() != null){
            cityName = findAddreNameById(info.getUnitAddrCityId()).getRname();
        }
        //区域
        if(info.getUnitAddrAreaId() != null){
            areaName = findAddreNameById(info.getUnitAddrAreaId()).getRname();
        }
        //去掉详细地址中的空格和讲非法的"<"和">"转换成"（"和"）"
        if(info.getUnitAddrDetails() != null){
        	addrDetails = (info.getUnitAddrDetails()).replaceAll("\\s*", "");
        	addrDetails = addrDetails.replaceAll("<", "（");
        	addrDetails = addrDetails.replaceAll(">", "）");
        }
        //长地址
        String addre = (provinceName==null?"":provinceName)+(cityName==null?"":cityName)+(areaName==null?"":areaName)+(addrDetails==null?"":addrDetails);
        if(!"".equals(addre)){
            info.setUnitAddr(addre);
        }else {
            return new JSONResult(false,"请输入单位地址");
        }

        //去重校验
        PlmsClUnitInfoExample example = new PlmsClUnitInfoExample();
        example.setClCustId(info.getClCustId()).setName(info.getName()).setUnitName(info.getUnitName()).setUnitAddr(info.getUnitAddr());
        int count = unitInfoService.countByExample(example);
        if(count > 0){
            return new JSONResult(false,"该单位信息已存在");
        }

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);

        int ret = unitInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updateUnit",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.UNIT_UPDATE)
    public JSONResult updateUnit(PlmsClUnitInfo info){
        if(info.getId() == null || info.getRecVer() == null || info.getIsActive() == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误.");
        }
        String provinceName = null;
        String cityName = null;
        String areaName = null;
        String addrDetails = null;
        //拼接地址
        //省
        if(info.getUnitAddrProvinceId() != null){
            provinceName = findAddreNameById(info.getUnitAddrProvinceId()).getRname();
        }
        //市
        if(info.getUnitAddrCityId() != null){
            cityName = findAddreNameById(info.getUnitAddrCityId()).getRname();
        }
        //区域
        if(info.getUnitAddrAreaId() != null){
            areaName = findAddreNameById(info.getUnitAddrAreaId()).getRname();
        }
        //去掉详细地址中的空格和讲非法的"<"和">"转换成"（"和"）"
        if(info.getUnitAddrDetails() != null){
        	addrDetails = (info.getUnitAddrDetails()).replaceAll("\\s*", "");
        	addrDetails = addrDetails.replaceAll("<", "（");
        	addrDetails = addrDetails.replaceAll(">", "）");
        }
        //长地址
        String addre = (provinceName==null?"":provinceName)+(cityName==null?"":cityName)+(areaName==null?"":areaName)+(addrDetails==null?"":addrDetails);
        if(!"".equals(addre)){
            info.setUnitAddr(addre);
        }

        if(!StringUtil.isEmpty(info.getName()) && !StringUtil.isEmpty(info.getUnitName()) && !StringUtil.isEmpty(info.getUnitAddr())){
            //去重校验
            PlmsClUnitInfoExample example = new PlmsClUnitInfoExample();
            example.setNoThisId(info.getId()).setClCustId(info.getClCustId()).setName(info.getName()).setUnitName(info.getUnitName()).setUnitAddr(info.getUnitAddr());
            int count = unitInfoService.countByExample(example);
            if(count > 0){
                return new JSONResult(false,"该单位信息已存在");
            }
        }

        String loginUser = SubjectUtil.getUserId();
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        int ret = unitInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 删除单位信息
     * */
    @RequestMapping(value = "/deleteUnit",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteUnit(PlmsClUnitInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClUnitInfo unit = unitInfoService.selectById(info.getId());
        if(unit == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(unit.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = unitInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * @Description: 通过ID查询客户单位信息数据
     * @param @param id
     * @return JSONResult
     * @author zhengjizhao
     * @date 2016年11月10日下午4:21:36
     */
    @RequestMapping(value = "/selectPlmsClUnitInfoByPrimaryKey",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.UNIT_SELECT)
    public JSONResult selectPlmsClUnitInfoByPrimaryKey(String id){
    	
    	PlmsClUnitInfo info = unitInfoService.selectByPrimaryKey(Long.parseLong(id));
    	return  new JSONResult(info);
    }

    /**
     * 通过记录ID查询行政区域的名称
     * @param id 记录ID
     * @return
     */
    private SysAdministrativeRegion findAddreNameById(Long id){
    	if(id == null){
    		return null;
    	}
    	SysAdministrativeRegion sar = addressInfoService.findAddreNameById(id);
    	return sar;
    }

}
