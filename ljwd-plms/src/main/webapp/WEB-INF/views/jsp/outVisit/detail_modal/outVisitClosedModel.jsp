<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--结案弹出框 -->
<div class="modal fade hideModal" id="outVisitClosedModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">结案</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="colsedForm">
                    <div class="form-group">
					    <label class="col-sm-3 control-label">结案日期</label>
					    <div class="col-sm-6">
                            <input type="text" onFocus="WdatePicker({maxDate:'%y-%M-%d'})" id="closedDate" name="closedDate" readonly>
                        </div>
					    
						<span id="closedDateError" class="checkMessage" style="color:red"></span>
						
					</div>
                    
                    <div class="form-group">
                        <label class="col-sm-3 control-label">结案类别</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="closedType" id= "closedType">
                                <option value="">请选择</option>
                                <option value="ErrorApply">错误申请</option>
                                <option value="Novisiter">该区无外访人员</option>
                            </select>
                        </div>
                        <span id="closedTypeError" class="checkMessage" style="color:red"></span>
                    </div>

                     <div class="form-group">
					    <label class="col-sm-3 control-label">结案原因</label>
					   	<div class="col-sm-6">
					        <textarea class="form-control" rows="3" id="colsedReason" name="closedReason"></textarea>
					    </div>
					 </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitclosedBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>