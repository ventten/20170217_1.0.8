package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfo;
import com.ljwd.plms.web.model.cust.PlmsClAssetsInfoExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAssetsInfoService;
import com.ljwd.plms.web.service.type.inf.PlmsLAssetsTypeService;
import com.ljwd.plms.web.service.type.inf.PlmsLSourceTypeService;
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
 * 客户其它资产信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class AssetsController {

    @Resource
    private PlmsClAssetsInfoService assetsInfoService;

    /**
     * 客户其它资产信息数据
     * */
    @RequestMapping(value = "/pageAssetsData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ASSETS_SELECT)
    public String pageAssetsData(PlmsClAssetsInfoExample example){
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

        Page<PlmsClAssetsInfo> pageData = new Page<PlmsClAssetsInfo>(pageNo, pageSize);

        pageData = assetsInfoService.selectByExampleAndPage(pageData,example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addAssets",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ASSETS_INSERT)
    public JSONResult addAssets(PlmsClAssetsInfo info){

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);

        int ret = assetsInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updateAssets",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ASSETS_UPDATE)
    public JSONResult updateAssets(PlmsClAssetsInfo info){
        if(info.getId() == null || info.getRecVer() == null || info.getIsActive() == null){
            return new JSONResult(false,"参数错误.");
        }

        String loginUser = SubjectUtil.getUserId();
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());

        int ret = assetsInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 删除其他资产
     * */
    @RequestMapping(value = "/deleteAssets",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteAssets(PlmsClAssetsInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClAssetsInfo assets = assetsInfoService.selectById(info.getId());
        if(assets == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(assets.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = assetsInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

}
