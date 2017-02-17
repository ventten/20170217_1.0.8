<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>库存调整</title>
</head>

<div class="panel panel-default">
   <div class="panel-heading">
      <h3 class="panel-title">
		库存调整
      </h3>
   </div>
   <div class="panel-body">
    <div>
        <form class="searchForm" id="searchForm">
            <label for="cntrctNo">合同编号 </label>
        	<input type="text" id="cntrctNo"  name="cntrctNo" value=${pool.cntrctNo }>
            <input class="btn btn-primary" type="button" id="searchBtn" value="查询"/>
        </form>
    </div>
    <div>
    	<label for="cntrctNo">合同编号 </label>
        <input type="text" id="cntrctNo"  name="cntrctNo" value=${pool.cntrctNo }>
        <label for="custName">主贷人 </label>
        <input type="text" id="custName" name="custName" value=${pool.custName }>
        <label for="docno">身份证号 </label>
        <input type="text" id="docno"  name="docno" value=${pool.docno }>
        <label for="docno">贷款金额 </label>
        <input type="text" id="loanAmt"  name="loanAmt" value=${pool.loanAmt }>
        <br/>
        <table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
		    <thead>
		    <tr>
		        <th class="text-center">序号</th>
		        <th class="text-center">主贷人</th>
		        <th class="text-center">身份证号</th>
		        <th class="text-center">有效合同数</th>
		        <th class="text-center">合同在途数</th>
		        <th class="text-center">申请次数</th>
		        <th class="text-center">审批拒绝数</th>
		        <th class="text-center">累计逾期期数</th>
		        <th class="text-center">累计逾期天数</th>
		        <th class="text-center">操作</th>
		    </tr>
		    </thead>
		</table>
    </div>
	</div>
</div>