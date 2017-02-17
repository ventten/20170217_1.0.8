<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>协催计划详情</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
    <style>
    	.table>tbody>tr>td{
    		padding:4px;
    	}
    </style>
</head>
 <!--表格-开始-->
 <div class="visitInfo">
	 <div class="panel panel-default">
	   <div class="panel-heading">
	      <h3 class="panel-title">
			协催计划详情
	      </h3>
	   </div>
	   <div class="panel-body" style="width:100%;">
	   	<input type="hidden" id="applId" value=${applId }>
	   	<input type="hidden" id="infoId" value=${infoId }>
	    <div class="tab-content">
	        <div role="tabpanel" class="tab-pane active" id="contract-info">
	            <div class="container-fluid">
	                <div class="row">
	                    <div class="col-xs-12">
	                   	<div class="margin-bottom">客户信息</div> 	
	                        <table class="table table-bordered">
	                            <tr>
	                                <td width="8%" class="active text-center">申请编号</td>
	                                <td width="14%" class=" text-center" >${applDetail.applyNo}</td>
	                                <td width="8%" class="active text-center">合同编号</td>
	                                <td width="14%" class=" text-center" >${applDetail.cntrctNo}</td>
	                                <td width="8%" class="active text-center">主贷人</td>
	                                <td width="12%" class=" text-center">${applDetail.custName}</td>
	                                <td width="8%" class="active text-center">客户类型</td>
	                                <td width="12%" class=" text-center">${applDetail.custType}</td>
	                            </tr>
	                            <tr>
	                            	<td width="8%" class="active text-center">贷款金额</td>
	                                <td width="14%" class=" text-center">${applDetail.loanAmt}</td>
	                                <td width="8%" class="active text-center">贷款期数</td>
	                                <td width="14%" class=" text-center">${applDetail.periodNum}</td>
	                                <td width="8%" class="active text-center">已还期数</td>
	                                <td width="12%" class=" text-center">${applDetail.paidPeriod}</td>
	                                <td width="8%" class="active text-center">应还金额</td>
	                                <td width="12%" class=" text-center">${applDetail.overdueAmount}</td>
	                            </tr>
	                            <tr>
	                            	<td width="8%" class="active text-center">提前结清金额</td>
	                                <td width="14%" class=" text-center">${applDetail.clearAmount}</td>
	                                <td width="8%" class="active text-center">当前逾期天数</td>
	                                <td width="14%" class=" text-center">${applDetail.overdueDayNow}</td>
	                                <td width="8%" class="active text-center">分配时的逾期天数</td>
	                                <td width="12%" class=" text-center">${applDetail.overdueDay}</td>
	                                <td width="8%" class="active text-center">计划状态</td>
	                                <td width="12%" class=" text-center">${applDetail.planStatus}</td>
	                            </tr>
	                            <tr>
	                            	<td width="8%" class="active text-center">地址类别</td>
	                                <td width="14%" class=" text-center">${applDetail.addressType}</td>
	                                <td width="8%" class="active text-center">详细地址</td>
	                                <td colspan="5" class=" text-center">${applDetail.address}</td>
	                            </tr>
	                        </table>
	                    </div>
	                </div>
	            </div>
	        </div>
	          <div role="tabpanel" class="tab-pane active" id="contract-info">
	            <div class="container-fluid">
	                <div class="row">
	                    <div class="col-xs-12">
	                   	<div class="margin-bottom">外访信息</div> 	
	                        <table class="table table-bordered" >
	                            <tr>
	                                <td width="8%" class="active text-center">计划编号</td>
	                                <td width="14%" class=" text-center" >${outplanDetail.planCode}</td>
	                                <td width="8%" class="active text-center">签到信息</td>
	                                <td width="14%" class=" text-center">${outplanDetail.signInfo}</td>
	                                <td width="8%" class="active text-center">计划日期</td>
	                                <td width="12%" class=" text-center" ><fmt:formatDate value="${outplanDetail.planStartTime}" pattern="yyyy-MM-dd"/></td>
	                                <td width="8%" class="active text-center">陪同人</td>
	                                <td width="12%" class=" text-center">${outplanDetail.assistByNames}</td>
	                            </tr>
	                            <tr>
	                                <td width="8%" class="active text-center">跟进结果</td>
	                                <td width="14%" class=" text-center">${outplanDetail.followupResultsVal}</td>
	                                 <td width="8%" class="active text-center">PTP日期</td>
	                                <td width="14%" class=" text-center"><fmt:formatDate value="${outplanDetail.ptpDate}" pattern="yyyy-MM-dd"/></td>
	                                <td width="8%" class="active text-center">PTP金额</td>
	                                <td width="12%" class=" text-center">${outplanDetail.ptpAmt}</td>
	                                <td width="8%" class="active text-center">地址有效性</td>
	                                <td width="12%" class=" text-center">${outplanDetail.addressValidityVal}</td>
	                            </tr>
	                            <tr>
	                                <td width="8%" class="active text-center">签到地址</td>
	                                <td colspan="7" class=" text-center">${outplanDetail.signAddress}</td>
	                            </tr>
	                            <tr>
	                            	<td width="8%" class="active text-center">实际地址</td>
	                                <td colspan="7" class=" text-center">
	                                <c:choose>
	                                	<c:when test="${outplanDetail.addressValidity=='N' }">
	                                		${outplanDetail.validAddress }
	                                	</c:when>
	                                	<c:when test="${outplanDetail.addressValidity=='Y' }">
	                                		${outplanDetail.address }
	                                	</c:when>
	                                </c:choose>
	                                </td>
	                            </tr>
	                            <tr>
	                            	<td width="8%" class="active text-center">外访详情</td>
	                                <td colspan="7" class=" text-center">${outplanDetail.ovtresultDetail}</td>
	                            </tr>
	                        </table>
	                    </div>
	                </div>
	            </div>
	        </div>
	          <div role="tabpanel" class="tab-pane active" id="contract-info">
	            <div class="container-fluid">
	                <div class="row">
	                    <div class="col-xs-12">
	                   	<div class="margin-bottom">相关附件</div> 	
	                        <table class="table table-bordered">
	                           <tr>
	                           		<td width="4%">序号</td>
	                           		<td width="15%">文件名</td>
	                           		<td width="15%">上传日期</td>
	                           		<td width="15%">备注</td>
	                           		<td width="4%">操作</td>
	                           </tr>
	                           <tbody>
	                           		<c:forEach items="${annexList}" var="annex" varStatus="status"> 
	                           			<tr>
	                         			<td>${status.index +1}</td>
	                           			<td>${annex.fileName }</td>
	                           			<td><fmt:formatDate value="${annex.updateTime }" pattern="yyyy-MM-dd"/></td>
	                           			<td>${annex.remark }</td>
	                           			<td>
	                           			<shiro:hasPermission name="outVisitPlan:outVisitOptions">
	                           			<a href='javascript:void(0);' onclick='downloadFun( ${annex.id }  )'>下载</a>
	                           			</shiro:hasPermission>
	                           			</td>
	                           			</tr>
	                           		</c:forEach>
	                           </tbody>
	                        </table>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	    <!--表格-结束-->
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true" />
<script type="text/javascript">
//下载
function downloadFun(id) {
    //定义一个form表单
    var $form=$("<form>");
    $form.attr("style","display:none");
    $form.attr("target","_black");
    $form.attr("method","post");
    $form.attr("action","<%=request.getContextPath()%>/rest/outVisitPlan/download");

    var $id=$("<input>");
    $id.attr("type","hidden");
    $id.attr("name","id");
    $id.attr("value",id);
    $form.append($id);

    //将表单放置在web中
    $("body").append($form);

    $form.submit();
}

/************设置页面加载时修改页面左侧菜单栏状态*************/
$(function(){
	var Val=$('.visitInfo').attr('class');		
	$('#'+Val).click();
	$('#'+Val+'_plan').addClass('choose_active');
	//点击菜单移除选中项class
	$('.sub-menu li').click(function(){
		$('.sub-menu li').find('a').removeClass('choose_active');
	})
})
</script>
