package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.*;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAddressInfoService;
import com.ljwd.plms.web.service.cust.inf.PlmsLnApplInfoService;
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
import java.util.List;

/**
 * Created by zhengzw on 2016/6/12.
 * 客户地址信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class AddressController {

    @Resource
    private PlmsLnApplInfoService applInfoService;
    @Resource
    private PlmsClAddressInfoService addressInfoService;

    /**
     * 客户地址信息数据
     * */
    @RequestMapping(value = "/pageAddressData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ADDRESS_SELECT)
    public String pageAddressData(PlmsClAddressInfoExample example){
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

        Page<PlmsClAddressInfo> pageData = new Page<PlmsClAddressInfo>(pageNo, pageSize);

        pageData = addressInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 通过ID查询客户地址信息数据
     * */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/findAddressDataOneById",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ADDRESS_SELECT)
    public JSONResult findAddressDataOneById(Long id){
    	if(id == null){
    		return new JSONResult(false,"参数错误");
    	}
    	PlmsClAddressInfo pi = addressInfoService.selectById(id);
        if(pi == null){
            return new JSONResult(false,"数据不存在");
        }
    	return new JSONResult(pi);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addAddress",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ADDRESS_INSERT)
    public JSONResult addAddress(PlmsClAddressInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
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
        try{
        	//判断地址重复
            PlmsClAddressInfoExample example = new PlmsClAddressInfoExample();
            example.setClCustId(info.getClCustId()).setAddrType(info.getAddrType()).setAddr(info.getAddr()).setName(info.getName());
        	int count = addressInfoService.countByExample(example);
        	if(count > 0){
        		return new JSONResult(false,"地址已存在，不能再次添加");
        	}
        	info.setIsActive("Y");
        	String loginUser = SubjectUtil.getUserId();
        	info.setCreatedBy(loginUser);
        	info.setUpdatedBy(loginUser);
        	int ret = addressInfoService.insert(info);
        	if(ret < 1){
        		return new JSONResult(false,"添加失败");
        	}
        	return new JSONResult(true,"添加成功");
        }catch(Exception e){
        	e.printStackTrace();
        	return new JSONResult(false,"添加失败");
        }
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updateAddress",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ADDRESS_UPDATE)
    public JSONResult updateAddress(PlmsClAddressInfo info){
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
        try{
            if(!StringUtil.isEmpty(info.getAddrType()) && !StringUtil.isEmpty(info.getAddr()) && !StringUtil.isEmpty(info.getName())){
                //判断地址重复
                PlmsClAddressInfoExample example = new PlmsClAddressInfoExample();
                example.setNoThisId(info.getId()).setClCustId(info.getClCustId()).setAddrType(info.getAddrType()).setAddr(info.getAddr()).setName(info.getName());
                int count = addressInfoService.countByExample(example);
                if(count > 0){
                    return new JSONResult(false,"地址已存在，不能重复");
                }
            }
        	String loginUser = SubjectUtil.getUserId();
        	info.setUpdatedBy(loginUser);
        	info.setUpdateTime(new Date());
        	int ret = addressInfoService.updateByPrimaryKey(info);
	        if(ret < 1){
	            return new JSONResult(false,"修改失败");
	        }
	        return new JSONResult(true,"操作成功");
        }catch(Exception e){
        	e.printStackTrace();
        	return new JSONResult(false,"修改失败");
        }

    }

    /**
     * 删除地址信息
     * */
    @RequestMapping(value = "/deleteAddress",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteAddress(PlmsClAddressInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClAddressInfo address = addressInfoService.selectById(info.getId());
        if(address == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(address.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = addressInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 查询行政单位
     * @param id 记录ID
     * @param pid 上级ID
     * @param rlevel 行政区域层级
     * @return List
     */
    @RequestMapping(value = "/findAddressByMore",method = RequestMethod.POST)
    @ResponseBody
    public List<SysAdministrativeRegion> findAddressByMore(Long id,Long pid,String rlevel){
    	if(id == null && pid == null && rlevel == null){
    		return null;
    	}
    	List<SysAdministrativeRegion> list = addressInfoService.findAddressByMore(id,pid,rlevel);
    	return list;
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

}
