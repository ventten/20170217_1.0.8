<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--外访结果窗口 -->
<div class="modal fade hideModal" id="outVisitPlanResultModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">外访结果</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="outVisitResultForm">
                
                <input type="hidden" name="id" id="outVisitPlanId_result">
                <div class="form-group">
                    <label class="col-sm-3 control-label">签到信息</label>
                    <div class="col-sm-6" style="background-color:#BFEFFF" id="signInfo_result">
                        <!-- <input type="text" class="form-control"name="signInfo"  readonly> -->
                    </div>
                </div>

  				<div class="form-group">
                    <label class="col-sm-3 control-label">签到地址</label>
                    <div class="col-sm-6" style="background-color:#BFEFFF" id="signAddress_result">
                        <!-- <input type="text" class="form-control"name="signAddress"  readonly> -->
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="col-sm-3 control-label">外访地址</label>
                    <div class="col-sm-6" style="background-color:#BFEFFF" id="outVisitPlanAddr_result">
                        <!-- <input type="text" class="form-control"name="outVisitPlanAddr"  readonly> -->
                    </div>
                </div>
                
                 <div class="form-group">
                    <label class="col-sm-3 control-label">陪同人</label>
                    <div class="col-sm-6" style="background-color:#BFEFFF" id="assistBy_result">
                        <!-- <input type="text" class="form-control"name="assistBy"  readonly> -->
                    </div>
                </div>
                
                 <div class="form-group">
                            <label class="col-sm-3 control-label">地址有效性</label>
                            <span class="col-sm-6">
	        		   			<input type="radio" name="addressValidity" class="addressValidity" value="Y" checked>是               
	        		   			<input type="radio" name="addressValidity" class="addressValidity" value="N" >否
	        		   		</span>
                 </div>
                 
                 <div class="form-group">
                        <label class="col-sm-3 control-label">跟进结果</label>
                            <span class="col-sm-5" id="outResult_01">
                            		<c:forEach items="${outResult_01 }" var="result" varStatus="status">
		                            		<c:if test="${(status.index)%2==0 and status.index>0}">
		                                		<br/>
		                                	</c:if>
                            				<input type="radio" name="followupResults" <c:if test="${status.index==0 }"> checked</c:if> class="followupResults1" value="${result.code }"><span class="left-space-1 right-space-2">${result.val }</span>
                            		</c:forEach>
	        		   		</span>
	        		   		 <span class="col-sm-5" id="outResult_02">
	        		   			<c:forEach items="${outResult_02 }" var="result" varStatus="status">
	        		   				<c:if test="${(status.index)%2==0 and status.index>0 }">
                                		<br/>
                                	</c:if>
                            		<input type="radio" name="followupResults" <c:if test="${status.index==0 }"> checked</c:if> class="followupResults2" value="${result.code }"><span class="left-space-1 right-space-2"> ${result.val }</span>
                            	</c:forEach>
	        		   		</span>
                 </div>

 				<div class="form-group" id="validity_addressDiv">
                        <label class="col-sm-3 control-label">有效地址</label>
                    <div class="col-sm-6">
                        <!-- <input type="text" class="form-control" name=validAddress id="validity_address"> -->
                        <textarea rows="3" name=validAddress id="validity_address" style="max-width:276px;width:276px;height:60px"></textarea>
                    </div>                 
                 </div>
                 
                 <div class="form-group" >
                        <label class="col-sm-3 control-label">PTP日期</label>
                    <div class="col-sm-6">
                       	<input  type="text" readonly onFocus="WdatePicker({minDate:'%y-%M-%d'})" name="ptpDate" id="ptpDate">
                    
                    </div>                 
                 </div>
                 
                 <div class="form-group" >
                        <label class="col-sm-3 control-label">PTP金额</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control"name="ptpAmt" id="ptpAmt">
                    </div> 
                    <span id="ptpAmtError" class="checkMessage" style="color:red"></span>                
                 </div>
                 
                 <div class="form-group">
				    <label class="col-sm-3 control-label">外访详情</label>
				   	<div class="col-sm-6">
				        <textarea  rows="3" id="ovtresultDetail" name="ovtresultDetail" style="max-width:276px;width:276px;height:60px"></textarea>
				    </div>
				 </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitResultAddBtn">保存</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>