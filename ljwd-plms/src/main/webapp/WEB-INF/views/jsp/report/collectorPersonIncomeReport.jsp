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
<title>催收个人实收明细</title>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">催收个人实收明细</h3>
    </div>
    <div class="panel-body">
        <div>
            <form id="searchForm">
				<input type="hidden" name="type" value="collector">
 				<label class="right-space-1">合同编号</label>
                <input class="right-space collection input-border" name="cntrctNo">
                
                <!-- <label class="right-space-1">人员类型</label>
                <select class="right-space collection" name="workerType">
                    <option value=""></option>
                    <option value="collector">催收员</option>
  		            <option value="outVisit">外访员</option>
                </select> -->
                
                <label class="right-space-1">(代理)催收人员</label>
                <select class="right-space collection" name="collector" readonly>
                    <c:forEach items="${collectorList}" var="item">
                	<option value="${item.userName}">${item.userName}</option>
            		</c:forEach> 
                </select>     
                                             
                <label class="right-space-1">状态</label>
                <select class="right-space collection" name="status">
                    <option value="">全部</option>
                    <option value="ADDED">正常</option>
  		            <option value="REVERSED">作废</option>
                </select>

                <label class="right-space-1 line-bottom">数据有效性</label>
                <select class="right-space collection" name="isActive">
                    <option value="">全部</option>
                    <option value="Y">有效</option>
  		            <option value="N">无效</option>
                </select>
                <br/>
                 <label class="right-space-1">还款日期</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'repaymentDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'repaymentDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="repaymentDateStart" name="repaymentDateStart">
                <label class="label-center-1">至</label>
                <input size="10" type="text"  class="collection-number right-space" readonly onFocus="picker2rule(this,repaymentDateStart)" id="repaymentDateEnd" name="repaymentDateEnd">
                
                 <label class="right-space-1">&nbsp;&nbsp;操作入账日期</label>
                 <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'enterDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'enterDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="enterDateStart" name="enterDateStart">
                	<label class="label-center-1">至</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="picker2rule(this,enterDateStart)" id="enterDateEnd" name="enterDateEnd">
              
				<br/><br/>
                <shiro:hasPermission name="collectorPersonIncomeReport:select">
                <button type="button" class="btn btn-primary right-space-2" id="income-searchBtn">查询</button>&nbsp; 
                </shiro:hasPermission>
                <shiro:hasPermission name="collectorPersonIncomeReport:export"> 
                <button type="button" class="btn btn-primary right-space-2" id="income-exportBtn">导出</button>
                </shiro:hasPermission>  
                <button type="reset" class="btn btn-default">清除</button>
             </form>
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
     if (!$("#searchForm").valid()){
             return false;
         }
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
  
    $(document).ready(function() {
 		form_validate($('#searchForm'));
    });
    
  //查询条件表单验证
    function form_validate($validateForm){
      $validateForm.validate({
          unhighlight: function (element, errorClass, validClass) {
              //验证通过
              $(element).tooltip("destroy").removeClass(errorClass);
          },
          errorPlacement: function (label, element) {
              //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
              $(element).attr("data-placement","bottom");
              $(element).tooltip("destroy"); /* 必需 */
              $(element).attr("title", $(label).text()).tooltip("show");
          },
      	rules: {
      		collector:	{
	          		required: true
	          	}
          }
      });
  }   
    
    
    
</script>