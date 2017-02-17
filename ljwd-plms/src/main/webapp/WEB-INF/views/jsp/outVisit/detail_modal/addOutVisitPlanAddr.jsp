<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!-- 新增外访地址 -->
 <div class="modal fade hideModal" id="address-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 600px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="closeAddAddre"></button>
                    <h4 class="modal-title">新增外访地址</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="addForm_addr">
                        <input type="hidden" value="${applDetail.custId}" name="clCustId">
                        <input type="hidden" value="${applId}" name="applId">
                        <input type="hidden" value="${applDetail.custName}" name="name">
                        
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>地址类型</label>
                            <div class="col-sm-addre6">
                                <select class="form-control collection" name="addrType" id="addrType">
                                	<option value="">请选择</option>
                                	<option value="REGISTER">户籍地址</option>
              	                    <option value="HOUSE">住宅地址</option>
              	                    <option value="COMPANY">单位地址</option>
                                	
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>地址</label>
                            <div class="col-sm-addre6">
                                <span >
	                                <select style="width: 120px;"  id="addrProvinceId" name="addrProvinceId" onchange="city_change(this,'addrCityId','','')">
	                                    <option value=''>请选择</option>
	                                </select>
                                    <lable>省</lable>
                                </span>
                                <span >
	                                <select style="width: 120px;" id="addrCityId" name="addrCityId" onchange="area_change(this,'addrAreaId','','')">
	                                    <option value=''>请选择</option>
	                                </select>
                                    <lable>市</lable>
                                </span>
                                <span >
	                                <select style="width: 120px;" id="addrAreaId" name="addrAreaId">
	                                    <option value=''>请选择</option>
	                                </select>
                                    <lable>区</lable>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>详细地址</label>
                            <div class="col-sm-addre6">
                                <textarea type="text" style="width: 420px;height:60px" id="addrDetails" name="addrDetails"></textarea>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"></label>
                            <div class="col-sm-addre6">
                                <span class="redStar redStarMessages"></span>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="address-addBtn">
                        新增
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
