<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../taglib/base.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>案件详情</title>
<jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>

<script type="text/javascript">
$(function(){
	$('#goback').click(function(){
		var status = $('#status').val();
		var url = "<%=request.getContextPath()%>/rest/caseManagement/view?status="+status+"&date="+new Date().toTimeString();
		 $.get(url, function(data) {
             $('#main-content').html(data);
         });
	});
	
//	$('input').attr("readonly","readonly");
/************设置页面加载时修改页面左侧菜单栏状态*************/
	Val=$('.transferAdvance').attr('class');
	$('#'+Val).click();
	$('#'+Val+'_allot').addClass('choose_active');
	//点击菜单移除选中项class
	$('.sub-menu li').click(function(){
		$('.sub-menu li').find('a').removeClass('choose_active');
	})
})
</script>
<style type="text/css">
input{
	height:26px;
	width:180px;
}

</style>
</head>
<body>
<div class="transferAdvance">
<div class="panel panel-default">
<input type="hidden" id='status' value=${status }>
   <div class="panel-heading">
      <h3 class="panel-title">
		案件详情
      </h3>
   </div>
   <div class="panel-body">
	 <div class="tab-content">
	        <div role="tabpanel" class="tab-pane active" id="contract-info">
	            <div class="container-fluid">
	                <div class="row">
	                    <div class="col-xs-12">
	                        <table class="table table-bordered">
	                            <tr>
	                                <td width="8%" class="active text-center">合同编号</td>
	                                <td width="12%" class=" text-center">${caseDetail.cntrctNo}</td>
	                                <td width="8%" class="active text-center">放款渠道</td>
	                                <td width="12%" class=" text-center">${caseDetail.paymentType}</td>
	                                <td width="8%" class="active text-center">贷款产品</td>
	                                <td width="12%" class=" text-center">${caseDetail.proName}</td>
	                                <td width="8%" class="active text-center">所属网点</td>
	                                <td width="12%" class=" text-center">${caseDetail.siteName}</td>
	                            </tr>
	                            <tr>
	                                <td width="8%" class="active text-center">主贷人</td>
	                                <td width="12%" class=" text-center">${caseDetail.custName}</td>
	                                <td width="8%" class="active text-center">身份证号</td>
	                                <td width="12%" class=" text-center">${caseDetail.docno}</td>
	                                <td width="8%" class="active text-center">业务类型</td>
	                                <td width="12%" class=" text-center">${caseDetail.businessCategory}</td>
	                                <td width="8%" class="active text-center">案件性质</td>
	                                <td width="12%" class=" text-center">${caseDetail.caseNature}</td>
	                            </tr>
	                            <tr>
	                            	<td width="8%" class="active text-center">贷款金额</td>
	                                <td width="12%" class=" text-center">${caseDetail.loanAmt}</td>
	                                <td width="8%" class="active text-center">逾期期数</td>
	                                <td width="12%" class=" text-center">
	                                <c:choose>
						             <c:when test="${caseDetail.overduePeriod == null || '' eq caseDetail.overduePeriod}">
						            </c:when>
						            <c:otherwise>
	                                		${caseDetail.overduePeriod}-${caseDetail.maxOverduePeriod }
						            </c:otherwise>
						            </c:choose>
	                                </td>
	                                <td width="8%" class="active text-center">逾期金额</td>
	                                <td width="12%" class=" text-center">${caseDetail.overdueAmount}</td>
	                                <td width="8%" class="active text-center">剩余本金/保证金</td>
	                                <td width="12%" class=" text-center">${caseDetail.remainingPrincipal}</td>
	                            </tr>
	                            <tr>
	                                <td width="8%" class="active text-center">逾期天数</td>
	                                <td width="12%" class=" text-center">${caseDetail.overDays}</td>
	                                <td width="8%" class="active text-center">应还日期</td>
	                                <td width="12%" class=" text-center"><fmt:formatDate value="${caseDetail.rpmntDate}" pattern="yyyy-MM-dd"/>
	                                </td>
	                                <td width="8%" class="active text-center">催收员</td>
	                                <td width="12%" class=" text-center">${caseDetail.collectorName}</td>
	                                <td width="8%" class="active text-center">所属队列</td>
	                                <td width="12%" class=" text-center">${caseDetail.queue}</td>
	                            </tr>
	                            <tr>
	                                <td width="8%" class="active text-center">分配日期</td>
	                                <td width="12%" class=" text-center"><fmt:formatDate value="${caseDetail.assignDate}" pattern="yyyy-MM-dd"/></td>
	                                <td width="8%" class="active text-center">已代理</td>
	                                <td width="12%" class=" text-center">${caseDetail.isAgent}</td>
	                                <td width="8%" class="active text-center">代理催收员</td>
	                                <td width="12%" class=" text-center">${caseDetail.agentName}</td>
	                                <td width="8%" class="active text-center">代理日期(起)</td>
	                                <td width="12%" class=" text-center"><fmt:formatDate value="${caseDetail.allocBeginDate}" pattern="yyyy-MM-dd"/></td>
	                            </tr>
	                            <tr>
	                                <td width="8%" class="active text-center">代理日期(止)</td>
	                                <td width="12%" class=" text-center"><fmt:formatDate value="${caseDetail.allocEndDate}" pattern="yyyy-MM-dd"/></td>
	                        	</tr>
	                        </table>
	                    </div>
	                </div>
	            </div>
	        </div>
    	</div>
    	<!--  <div class="modal-footer">
			<button type="button" class="btn btn-default" id="goback">返回</button>
		</div> -->
    </div>
    </div>
</div>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>    
</body>
