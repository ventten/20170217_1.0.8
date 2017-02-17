<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!--外访人员弹出框  -->
<div class="modal fade hideModal" id="outVisitUserSearchModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">外访人员</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="collectorSearchForm">

                    <div class="form-group">
                        <label class="col-sm-4 control-label">外访区域</label>
                        <div class="col-sm-6">
                        <select id="out_areaId" name="areaId" class="right-space">
				            <option value="">请选择</option>
				            <c:forEach items="${areaList}" var="item">
		                	<option value="${item.id}">${item.areaName}</option>
		            		</c:forEach>        
				      	</select>
				      	</div>
                    </div>

                    <div class="form-group">
                    	<div class="searchList">
                    		<table>
	                    		 <thead>
		                        	<tr>
		                        		<th width="96px">序号</th>
		                        		<th width="158px">姓名</th>
		                        		<th width="334px">联系电话</th>
		                        	</tr>		
		                        </thead>
	                    	</table>
                    	</div>
                    	<span class="searchListTable listTable">
	                        <table class="table table-border dataTable">
	                        	<tbody id="outVisitUserTBody">
	                        	</tbody>
	                        </table>
                        </span>
                    </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitUserAddBtn">
                   	 确定
                </button>
                 <button class="btn btn-primary" type="button" class="btn blue" id="outVisitUserClearBtn">
                   	 清除
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 返回
                </button>
            </div>
        </div>
    </div>
</div>
