package com.ljwd.plms.web.controller.cust;

import com.ljwd.plms.core.entity.JSONResult;
import com.ljwd.plms.core.feature.orm.mybatis.Page;
import com.ljwd.plms.core.util.PageUtil;
import com.ljwd.plms.core.util.StringUtil;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfo;
import com.ljwd.plms.web.model.cust.PlmsClAccountInfoExample;
import com.ljwd.plms.web.security.PermissionSign;
import com.ljwd.plms.web.security.SubjectUtil;
import com.ljwd.plms.web.service.cust.inf.PlmsClAccountInfoService;
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
 * 客户流水账号信息控制器
 */
@Controller
@RequestMapping(value = "/cust")
public class AccountController {

    @Resource
    private PlmsClAccountInfoService accountInfoService;

    /**
     * 客户流水账号信息数据
     * @param example 查询条件
     * */
    @RequestMapping(value = "/pageAccountData",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ACCOUNT_SELECT)
    public String pageAccountData(PlmsClAccountInfoExample example){
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

        Page<PlmsClAccountInfo> pageData = new Page<PlmsClAccountInfo>(pageNo, pageSize);

        pageData = accountInfoService.selectByExampleAndPage(pageData, example);

        return PageUtil.getPageJson(sEcho, pageData);
    }

    /**
     * 添加
     * */
    @RequestMapping(value = "/addAccount",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ACCOUNT_INSERT)
    public JSONResult addAccount(PlmsClAccountInfo info){
        if(info == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误");
        }
        //判断重复
        PlmsClAccountInfoExample example = new PlmsClAccountInfoExample();
        example.setClCustId(info.getClCustId()).setName(info.getName()).setCardno(info.getCardno()).setBankname(info.getBankname()).setType(info.getType());
        int count = accountInfoService.countByExample(example);
        if(count > 0){
            return new JSONResult(false,"流水账号已存在，不能再次添加");
        }

        info.setIsActive("Y");
        String loginUser = SubjectUtil.getUserId();
        info.setCreatedBy(loginUser);
        info.setCreateTime(new Date());
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());
        info.setRecVer(0L);
        info.setTagSeq(0L);

        int ret = accountInfoService.insert(info);
        if(ret < 1){
            return new JSONResult(false,"添加失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 修改
     * */
    @RequestMapping(value = "/updateAccount",method = RequestMethod.POST)
    @ResponseBody
    @RequiresPermissions(PermissionSign.ACCOUNT_UPDATE)
    public JSONResult updateAccount(PlmsClAccountInfo info){
        if(info.getId() == null || info.getRecVer() == null || info.getIsActive() == null || info.getClCustId() == null){
            return new JSONResult(false,"参数错误.");
        }

        if(!StringUtil.isEmpty(info.getName()) && !StringUtil.isEmpty(info.getCardno())
                && !StringUtil.isEmpty(info.getBankname()) && !StringUtil.isEmpty(info.getType())){
            //判断重复
            PlmsClAccountInfoExample example = new PlmsClAccountInfoExample();
            example.setClCustId(info.getClCustId()).setName(info.getName()).setCardno(info.getCardno())
                    .setBankname(info.getBankname()).setType(info.getType()).setNoThisId(info.getId());
            int count = accountInfoService.countByExample(example);
            if(count > 0){
                return new JSONResult(false,"流水账号已存在");
            }
        }

        String loginUser = SubjectUtil.getUserId();
        info.setUpdatedBy(loginUser);
        info.setUpdateTime(new Date());

        int ret = accountInfoService.update(info);
        if(ret < 1){
            return new JSONResult(false,"修改失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

    /**
     * 删除客户流水
     * */
    @RequestMapping(value = "/deleteAccount",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult deleteAccount(PlmsClAccountInfo info){
        if(info.getId() == null){
            return new JSONResult(false,"参数错误.");
        }

        PlmsClAccountInfo account = accountInfoService.selectById(info.getId());
        if(account == null){
            return new JSONResult(false,"数据不存在");
        }

        //登录用户
        String loginUser = SubjectUtil.getUserId();

        if(!loginUser.equals(account.getCreatedBy())){
            return new JSONResult(false,"只能删除自己新增的数据");
        }

        int ret = accountInfoService.delete(info.getId());
        if(ret < 1){
            return new JSONResult(false,"删除失败.");
        }
        return new JSONResult(true,"操作成功.");
    }

}
