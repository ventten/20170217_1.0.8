<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--催收员窗口-->
<div class="modal fade hideModal modalBox" id="collectorSearchModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">查找催收员</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="collectorSearchForm">

                    <div class="form-group">
                        <label class="col-sm-4 control-label">所属机构</label>
                        <div class="col-sm-5">
                            <select class="form-control" name="orgId" id="orgId" >
                            </select>
                        </div>
                    </div>

                    <div class="form-group" style="height: 450px;overflow-y:auto;overflow-x:hidden;  ">
                        <table class="table table-border dataTable">
                        	<thead>
                        	<tr>
                        		<th>选择</th>
                        		<th>员工姓名</th>
                        		<th>所属机构</th>
                        	</tr>
                        	</thead>
                        	<tbody id="collectorTBody">
                        	</tbody>
                        </table>
                    </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="collectorAddBtn">
                   	 确定
                </button>
                 <button class="btn btn-primary" type="button" class="btn blue" id="collectorClearBtn">
                   	 清除
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 返回
                </button>
            </div>
        </div>
    </div>
</div>
