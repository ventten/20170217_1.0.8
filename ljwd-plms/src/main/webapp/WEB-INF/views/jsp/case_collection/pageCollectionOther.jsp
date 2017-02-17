<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>催收记录-其他</title>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active">
			<a href="#reciv" aria-controls="home" role="tab" data-toggle="tab">应还金额</a>
		</li>
		<li>
			<a href="#loan" aria-controls="profile" role="tab" data-toggle="tab" id="loan_a_id">代扣情况</a>
		</li>
	</ul>
	
	<div class="tab-content">
		<div role="tabpanel" class="tab-pane active" id="reciv">
			<div class="container-fluid">
				<!-- <h5>应还金额</h5> -->
				<div class="form-group">
					<form id="reciv-searchForm">
						<input type="hidden" name="cntrctNo" value="${applDetail.cntrctNo}" />
						<input type="hidden" name="idCardNo" value="${applDetail.idCardNo}" />
						<label for="payType" class="control-label left-space right-space-1">
							<span class="redStar">* </span>
							还款方式
						</label>
						<span class="right-space">
							<select class="collection" id="payType" name="payType">
								<option value="NORMAL">正常还款</option>
								<option value="ADV_CLEAR">提前结清</option>
							</select>
						</span>
						<label for="repaymentDate" class="control-label right-space-1">
							<span class="redStar">* </span>
							还款日期
						</label>
						<span class="right-space">
							<input type="text" class="input-border collection" id="repaymentDate" name="repaymentDate"
								onFocus="WdatePicker({readOnly:true,onpicked:function(){}})" readonly>
						</span>
						<span class="right-space">
							<input type="button" value="查询" class="btn btn-primary" id="reciv-searchBtn" />
						</span>
						<label for="repaymentAmount" class="control-label left-space-2">应还金额</label>
						<span class="left-space-2">
							<input type="text" class="input-border collection" id="repaymentAmount" readonly>
						</span>
					</form>
					<br>
					<div style="width:100%; height:auto; overflow-x:scroll;">
						<table  class="table-bordered" id="recivInfomation_info">
	                    </table>
                    </div>
				</div>
			</div>
		</div>
		
		<div role="tabpanel" class="tab-pane" id="loan">
			<shiro:hasPermission name="collect_rec:loan">
				<div class="container-fluid">
					<!-- <h5>代扣情况</h5> -->
					<div class="form-group">
						<form id="loan-searchForm">
							<input type="hidden" name="applId" value="${applId}" />
							<label for="loanDateMin" class="control-label left-space right-space-1">&nbsp;&nbsp;扣款日期</label>
							<span class="right-space">
								<input size="10" type="text" class="input-border collection" id="loanDateMin" name="loanDateMin"
									onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'loanDateMax\')||\'%y-%M-%d\'}'})" readonly>
							</span>
							<label for="loanDateMax" class="control-label right-space-1">至</label>
							<span class="right-space">
								<input size="10" type="text" class="input-border collection" id="loanDateMax" name="loanDateMax"
									onFocus="WdatePicker({minDate:'#F{$dp.$D(\'loanDateMin\')}',maxDate:'%y-%M-%d'})" readonly>
							</span>
							<span class="right-space">
								<input type="button" id="loan-searchBtn" value="查询" class="btn btn-primary" />
							</span>
						</form>
					</div>
				</div>
				<table id="loan_dataTable" class="display dataTable" cellspacing="0" width="60%">
					<thead>
						<tr>
							<th class="text-center">序号</th>
							<th class="text-center">扣款时间</th>
							<th class="text-center">应扣金额</th>
							<th class="text-center">实扣金额</th>
							<th class="text-center">扣款状态</th>
							<th class="text-center">备注</th>
						</tr>
					</thead>
				</table>
			</shiro:hasPermission>
		</div>
	</div>
</body>
<script type="text/javascript" language="javascript">
	//点击代扣情况
	$("#loan_a_id").on('click', function () {
	        loan_init();
	});
	//分页Table
	var loan_table;
	//Table初始化方法
	function loan_init() {
		loan_table = $("#loan_dataTable").DataTable(
						{
							"sPaginationType" : "full_numbers", //设置分页控件的模式
							"bLengthChange" : false, //改变每页显示数据数量
							"bPaginate" : true, //翻页功能
							"bRetrieve": true, //是否允许从新生成表格  <<解决多标签跳转时datatable加载问题
							"bFilter" : false, //过滤功能
							"bInfo" : true, //页脚信息
							"bSort" : false, //无排序功能
							"bScrollCollapse" : true,
							"bAutoWidth" : false,
							"iDisplayLength" : 10,
							"oLanguage" : {
								"sZeroRecords" : "没有检索到数据",
								"sInfo" : "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
								"sInfoEmpty" : "没有数据",
								"sInfoFiltered" : "(从 _MAX_ 条数据中检索)",
								"oPaginate" : {
									"sFirst" : "首页",
									"sPrevious" : "前一页",
									"sNext" : "后一页",
									"sLast" : "尾页"
								}
							},
							"bProcessing" : false, //加载数据时显示正在加载信息
							"bServerSide" : true, //指定从服务器端获取数据
							"sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageLoanStuationData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#loan-searchForm").serialize();
                $.ajax({
                    "type" : 'POST',
                    "url" : sSource,
                    "dataType" : "json",
                    "data" : data,
                    "success" : function(resp) {
                        fnCallback(resp);
                    },
                    "error":function(errorData){
                        MSG.show('获取数据发生异常');
                    }
                });
            },
            //dataTable显示
            "aoColumns"  : [
                {"mData" :  function(row, type, set, meta) {
                    return (meta.row + 1);
                }},
                {"mData" : "createTime","sDefaultContent" : ""},
                {"mData" : "loanMoney","sDefaultContent" : ""},
                {"mData" : "loanRealMoney","sDefaultContent" : ""},
                {"mData" : "loanType","sDefaultContent" : ""},
                {"mData" : "loanRemark","sDefaultContent" : ""}
            ]
        });
    }

    $(document).ready(function(){
        $("#repaymentDate").val(new Date().FormatTwo("yyyy-MM-dd"));
    });

    //代扣情况查询
    $('#loan-searchBtn').on( 'click', function () {
        loan_table.search($("#loan-searchForm").serialize()).draw();  //刷新页面
    });

    //应收金额计算
    $('#reciv-searchBtn').on('click', function () {
        $.ajax({
            "type" : 'POST',
            "dataType" : "json",
            "url" : "<%=request.getContextPath()%>/rest/caseCollection/getRepaymentAmountAll",
            "data" : $('#reciv-searchForm').serialize(),
            "success" : function(result) {
                if(result && result.clearAmt){
                    $("#repaymentAmount").val(result.clearAmt);
                    var objectList = new Array();
                    function dateObj(name,value){
                        this.name=name;
                        this.value=value;
                    }
                    objectList.push(new dateObj("本金/保证金",result.principal));
                    objectList.push(new dateObj("利息",result.interest));
                    objectList.push(new dateObj("居间费",result.brokerFee));
                    objectList.push(new dateObj("服务费",result.handlingFee));
                    objectList.push(new dateObj("违约金",result.penalty));
                    objectList.push(new dateObj("逾期利息",result.overdueInterest));
                    objectList.push(new dateObj("代扣费",result.failCollectFee));
                    objectList.push(new dateObj("展期费",result.extendFee));
                    objectList.push(new dateObj("催收费",result.collectCost));
                    objectList.push(new dateObj("延期费",result.delayFee));
                    objectList.push(new dateObj("房产查询费用",result.houseQueryFee));
                    objectList.push(new dateObj("实地考察费用",result.surveyFee));
                    objectList.push(new dateObj("总费用(含月利率)",result.ttlFee));
                    objectList.push(new dateObj("划扣手续费",result.creditQueryFee));
                    objectList.push(new dateObj("预付款",result.advanceFee));
                    objectList.push(new dateObj("房产调查费",result.houseSurveyFee));
                    objectList.push(new dateObj("贷款手续费",result.agencyHandlingFee));
                    objectList.push(new dateObj("GPS费用",result.gpsCost));
                    objectList.push(new dateObj("退还GPS费用",result.returnGpsCost));
                    objectList.push(new dateObj("风险保证金",result.riskDeposit));
                    objectList.push(new dateObj("检测评估费",result.estimationFee));
                    objectList.push(new dateObj("抵押登记费",result.mortgageFee));
                    objectList.push(new dateObj("车辆查档费",result.vehicleChadangFee));
                    objectList.push(new dateObj("其它",result.otherFee));
                    objectList.push(new dateObj("停车费",result.parkingFee));
                    objectList.push(new dateObj("拖车费",result.towingFee));
                    //按金额从大到小排序
                    objectList.sort(function(a,b){
                        return b.value-a.value;
                        });
                    var html1 = "<tr style=\"background-color: #dff3fc !important;\"><td width=\"120px\" class=\"active text-center\" noWrap=\"noWrap\">费用</td>";
                    var html2 = "<tr style=\"background-color: #dff3fc !important;\"><td width=\"120px\" class=\"text-center\" noWrap=\"noWrap\">金额（元）</td>";
                    for(var i=0;i<objectList.length;i++){
                        html1 += "<td width=\"150px\" class=\"active text-center\" noWrap=\"noWrap\">"+objectList[i].name+"</td>";
                        html2 += "<td width=\"150px\" class=\"text-center\" noWrap=\"noWrap\">"+objectList[i].value+"</td>";
                    }
                    html1 +="</tr>";
                    html2 +="</tr>";
                    var html = html1 + html2;
                    $("#recivInfomation_info").html(html);
                }
            },
            "error":function(errorData){
                MSG.show('应收金额获取失败');
            }
        });
    });

</script>