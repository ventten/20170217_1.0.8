<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>



<div class="modal fade hideModal" id="transferRefuseReasonModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:460px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">提前移交-拒绝原因</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="transferRefuseReasonForm">
               
               		<input type="hidden" name="refuseType" id="refuseType">
                    <div class="form-group">
                        <label class="col-sm-5 control-label label-base">拒绝原因</label>
                        <div class="col-sm-5">
                            <textarea type="text" class="form-control" name="refusalReason" id="refusalReason" style="width:168px;height:60px;max-width:168px"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-5 control-label"></label>
                        <div class="col-sm-5">
                            <span class="redStar checkMessage" id="transferRefuseReasonMessage"></span>
                        </div>
                    </div>

                </form>

            </div>
            <div class="modal-footer" style="text-align:center;padding-left:20px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="transferRefuseReasonBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
