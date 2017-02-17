<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<style>
    .dataTables_scrollBody tbody tr td{
	    padding: 1px 10px !important;
	}
	table.dataTable tbody td{
		padding:2px 10px;
	}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>催收实收明细</title>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">催收实收明细</h3>
    </div>
    <div class="panel-body">
        <div>
            <form id="searchForm">
				<input type="hidden" name="type" value="all">
 				<label class="right-space-1">合&nbsp;同&nbsp;编&nbsp;号&nbsp;</label>
                <input class="right-space collection input-border" name="cntrctNo">
                
                <label class="right-space-1">(代理)催收人员</label>
                <select class="right-space collection" name="collector">
                    <option value=""></option>
                    <c:forEach items="${collectorList}" var="item">
                	<option value="${item.userName}">${item.userName}</option>
            		</c:forEach> 
                </select>     
                
                <label class="right-space-1 label-widthsbig">外访人员</label>
                <select class="right-space collection" name="outVisit">
                    <option value=""></option>
                    <c:forEach items="${outVisitUserList}" var="item">
                	<option value="${item.userName}">${item.userName}</option>
            		</c:forEach> 
                </select>                
                
                <label class="right-space-1 line-bottom">状态</label>
                <select class="right-space collection" name="status">
                    <option value="">全部</option>
                    <option value="ADDED">正常</option>
  		            <option value="REVERSED">作废</option>
                </select>

                <br/>
                <label class="right-space-1">数据有效性&nbsp;</label>
                <select class="right-space collection" name="isActive">
                    <option value="">全部</option>
                    <option value="Y">有效</option>
  		            <option value="N">无效</option>
                </select>
                 <label class="right-space-1 label-widthsbigger">还款日期</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'repaymentDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'repaymentDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="repaymentDateStart" name="repaymentDateStart">
                <label class="label-center-1">至</label>
                <input size="10" type="text"  class="collection-number right-space" readonly onFocus="picker2rule(this,repaymentDateStart)" id="repaymentDateEnd" name="repaymentDateEnd">
                
                 <label class="right-space-1 line-bottom">操作入账日期</label>
                 <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'enterDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'enterDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="enterDateStart" name="enterDateStart">
                	<label class="label-center-1">至</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="picker2rule(this,enterDateStart)" id="enterDateEnd" name="enterDateEnd">
              
				<br/>
				<shiro:hasPermission name="incomeReport:select">
                <button type="button" class="btn btn-primary right-space-2" id="income-searchBtn">查询</button>&nbsp; 
                </shiro:hasPermission>
                <shiro:hasPermission name="incomeReport:createData">
                <button type="button" class="btn btn-primary right-space-2" id="income-createDataBtn">生成电催人员数据</button> 
                </shiro:hasPermission>  
                <shiro:hasPermission name="outViistIncomeReport:createData">
                <button type="button" class="btn btn-primary right-space-2" id="incomeOutVisit-createDataBtn">生成外访人员数据</button>
                </shiro:hasPermission>
                <shiro:hasPermission name="incomeReport:export">
                <button type="button" class="btn btn-primary right-space-2" id="income-exportBtn">导出</button>
                </shiro:hasPermission>
                <button type="reset" class="btn btn-default">清除</button>
             </form>
        </div>
    </div>
</div>
<!-- 时间控件弹出框 -->
<div class="modal fade hideModal" id="createDataDateModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:450px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">生成电催人员数据</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="colsedForm">
                    <div class="form-group">
					    <label class="col-sm-4 control-label">生成日期</label>
					    <div class="col-sm-6">
                            <input type="text" onFocus="WdatePicker({maxDate:'%y-%M-%d'})" id="createDataDate" name="createDataDate" readonly>
                        </div>						
					</div>
					<span id="closedDateError" class="checkMessage" style="color:red"></span>
                </form>
            </div>
            <div class="modal-footer" style="text-align:center;">
                <button class="btn btn-primary" type="button" class="btn blue" id="createDataBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!-- 时间控件弹出框 -->
<div class="modal fade hideModal" id="createDataDateOutVisitModel" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:450px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">生成外访人员数据</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="createOutVisitDataForm">
                    <div class="form-group">
					    <label class="col-sm-4 control-label">生成日期</label>
					    <div class="col-sm-6">
                            <input type="text" onFocus="WdatePicker({maxDate:'%y-%M-%d'})" id="createOutVisitDataDate" name="createDataDate" readonly>
                        </div>						
					</div>
					<span id="closedDateError01" class="checkMessage" style="color:red"></span>
                </form>
            </div>
            <div class="modal-footer" style="text-align:center;">
                <button class="btn btn-primary" type="button" class="btn blue" id="createOutVisitDataBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<table id="income-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr class="tableHead">
	        <th class="text-center tableHead">合同编号</th>
	        <th class="text-center tableHead">主贷人</th>
	        <th class="text-center tableHead">证件号码</th>
	        <th class="text-center tableHead">催收员</th>
	        <th class="text-center tableHead">代理催收员</th>
 	        <th class="text-center tableHead">外访员</th>
 		    <th class="text-center tableHead">退款金额</th>
	        <th class="text-center tableHead">回款金额</th>
	        <th class="text-center tableHead">还款日期</th>
	        <th class="text-center tableHead">入账时间</th>
	        <th class="text-center tableHead">更新时间</th> 
      	    <th class="text-center tableHead">状态</th> 
      	    <th class="text-center tableHead">数据有效性</th> 
	    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="13">没有检索到数据</td>
		</tr>
    </tbody>
</table>



<script type="text/javascript">

//分页Table
var income_dataTable;

 //Table初始化方法
    function income_dataTable_init(){
    	income_dataTable = $('#income-dataTable').DataTable({
            "scrollY": '333px',
            "scrollX": '100%',
            "sScrollXInner": "100%",
            "bScrollCollapse": true,

            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //是否翻页功能
            "bFilter": false,                       //是否过滤功能
            "bInfo": true,            			    //是否页脚信息
            "bSort": true,					        //是否排序功能

            "bAutoWidth": true,                    //是否自动宽度
            "bStateSave": false,                    //是否记忆配置,记录在cookies中

            "iDisplayLength": 100,
            "destroy":true,                         //允许销毁Table(即第二次点击会清空第一次的Table)
            "oLanguage": {
                "sZeroRecords": "没有检索到数据",
                "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty": "没有数据",
                "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "前一页",
                    "sNext": "后一页",
                    "sLast": "尾页"
                }
            },
            "bProcessing": false,        //加载数据时显示正在加载信息
            "bServerSide": true,        //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/incomeReport/pageAllIncomeData?"+new Date().toTimeString(),
            "fnServerData" : function(sSource, aoData, fnCallback) {
                var data;
                //参数拼接
                data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm").serialize();
                
                $.ajax({
                    "type" : 'POST',
                    "dataType" : "json",
                    "url" : sSource,
                    "data" : data,
                    "success" : function(resp) {
                        $('#checkAllBtn').attr("checked", false);
                        fnCallback(resp);
                    },
                    "error":function(jqXHR,textStatus,errorThrown){
                        MSG.show("获取数据发生异常");
                    }
                });
            },
            //dataTable显示
            "aoColumns" : [
				{"mData" : "cntrctNo","sDefaultContent" : ""},
				{"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "idCard","sDefaultContent" : ""},
                {"mData" : "collector","sDefaultContent" : ""},
                {"mData" : "collectorAgent","sDefaultContent" : ""},
                {"mData" : "outVisit","sDefaultContent" : ""},
                {"mData" : "refundAmt","sDefaultContent" : ""},
                {"mData" : "rpmntAmt","sDefaultContent" : ""},
                {"mData" : "rpmntDateFmt","sDefaultContent" : ""},
                {"mData" : "operationDate","sDefaultContent" : ""},
                {"mData" : "updatedTime","sDefaultContent" : ""},
                {"mData" : "status","sDefaultContent" : ""},
                {"mData" : "isActive","sDefaultContent" : ""}
            ]
        });
    }
    
    
  //查询按钮 
    $('#income-searchBtn').click(function(){
    	/* if (!$("#searchForm").valid()){
             return false;
         }*/
    	var $this = $(this); 
        if($this.hasClass("hasInit")){
        	income_dataTable.search($('#searchForm').serialize()).draw();
        }else{
            $this.addClass("hasInit");
            income_dataTable_init();
        }

    });
    
  	//导出按钮
	$('#income-exportBtn').click(function(){
		var url = "<%=request.getContextPath()%>/rest/incomeReport/exportExcel?"+new Date().toTimeString();
		$('#searchForm').attr('action', url);
		$('#searchForm').attr('method', "post");
		$('#searchForm').attr('target', "_black");
	    $('#searchForm').submit();		
	});
  	//弹出生成数据弹出框
  	$('#income-createDataBtn').click(function(){
  		P.resetModal('colsedForm');
  		$("#createDataDate").val(new Date().FormatTwo("yyyy-MM-dd"));
  		$('#createDataDateModel').modal('show');
  	});
	//生成电催数据
    $('#createDataBtn').click(function(){
    	if(checkOutcolsedForm()){
    		var createDataDate = $('#createDataDate').val();
    		if(createDataDate.length>0){
        		$.ajax({
        			url:"<%=request.getContextPath()%>/rest/incomeReport/createData?"+new Date().toTimeString(),
        			data:{"createDataDate":createDataDate},
        			type:"post",
        			dataType: "json",
        			success:function(data){
        				$('#createDataDateModel').modal('hide');
        				MSG.alert(data.message);
        				if(data.success){
        					income_dataTable.search($("#searchForm").serialize()).draw();
        				}else{
        					//MSG.alert("生成数据失败 !");
        				}
        			}
        		});
        	}else{
        		$('#closedDateError').html('请选择要生成数据的日期');
        	}
    	}
    });
	//弹出外访人员数据生成框
	$('#incomeOutVisit-createDataBtn').click(function(){
		P.resetModal('createOutVisitDataForm');
  		$("#createOutVisitDataDate").val(new Date().FormatTwo("yyyy-MM-dd"));
  		$('#createDataDateOutVisitModel').modal('show');
	});
	//生成外访数据
	$('#createOutVisitDataBtn').click(function(){
		if(checkOutVisitForm()){
    		var createDataDate = $('#createOutVisitDataDate').val();
    		if(createDataDate.length>0){
        		$.ajax({
        			url:"<%=request.getContextPath()%>/rest/incomeReport/createOutVisitData?"+new Date().toTimeString(),
        			data:{"createDataDate":createDataDate},
        			type:"post",
        			dataType: "json",
        			success:function(data){
        				$('#createDataDateOutVisitModel').modal('hide');
        				MSG.alert(data.message);
        				if(data.success){
        					income_dataTable.search($("#searchForm").serialize()).draw();
        				}else{
        					//MSG.alert("生成数据失败 !");
        				}
        			}
        		});
        	}else{
        		$('#closedDateError').html('请选择要生成数据的日期');
        	}
    	}
		
		
		
	});
	
    function checkOutcolsedForm(){
    	var closedDate = $('#createDataDate').val();
    	if(closedDate.length==0){
    		$('#closedDateError').html("请选择要生成数据的日期");
    		return false;
    	}else{
    		$('#closedDateError').html("");
    	}
    	
    	return true;
    }
    
    function checkOutVisitForm(){
    	var closedDate = $('#createOutVisitDataDate').val();
    	if(closedDate.length==0){
    		$('#closedDateError01').html("请选择要生成数据的日期");
    		return false;
    	}else{
    		$('#closedDateError01').html("");
    	}
    	
    	return true;
    }
 	// 设置模态框垂直居中函数
    function centerModals(){
        $('.modal').each(function(i){
            var $clone = $(this).clone().css('display', 'block').appendTo('body');
            var top = Math.round(($clone.height() - $clone.find('.modal-content').height()) / 2);
            top = top > 20 ? top : 0;
            $clone.remove();
            $(this).find('.modal-content').css("margin-top", top-20);
        });
    }

    // 在模态框出现的时候调用垂直居中函数
    $(window).on('resize', centerModals);
    // 在窗口大小改变的时候调用垂直居中函数
    $('.modal').on('show.bs.modal', centerModals);
    
</script>