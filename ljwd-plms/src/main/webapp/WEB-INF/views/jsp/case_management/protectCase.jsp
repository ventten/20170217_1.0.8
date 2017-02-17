<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>保护案件</title>
</head>
<div class="panel panel-default">
   <div class="panel-heading">
      <h3 class="panel-title">
         	保护案件
      </h3>
   </div>
   <div class="panel-body">
     <form id="searchForm">
    	<label for="scopeStatus" class="right-space-1">催收区间 </label>
        <select id="scopeStatus" name="scopeStatus" class="right-space collection">
        	<option value="all">全部</option>
            <c:forEach items="${scope}" var="item">
                <option value="${item.status}">${item.name}</option>
            </c:forEach>
            
        </select>
        
        <label for="protectStatus" class="right-space-1">保护状态 </label>
        <select id="protectStatus" name="protectStatus" class="right-space collection">
        	<option value="all">全部</option>
            <option value="1" selected>待流转</option>
            <option value="2">保护中</option>
        </select>
        
        <label for="protectCondition" class="right-space-1">保护条件 </label>
        <select id="protectCondition" name="protectCondition" class="right-space collection">
        	<option value="all">全部</option>
            <option value="4">离职</option>
            <option value="2">豁免</option>
            <option value="1">保留</option>
        </select>
        
        <label for="isWaive" class="right-space-1">是否在豁免中 </label>
        <select id="isWaive" name="isWaive" class="right-space collection">
            <option value="N" selected>否</option>
            <option value="Y">是</option>
        </select>
        <br/><br/>
            <shiro:hasPermission name="protectCase:select">
             <button type="button" class="btn btn-primary right-space-2" id="searchBtn">查询</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="protectCase:alloc">
             <button type="button" class="btn btn-primary" id="allocBtn">分配</button>
             </shiro:hasPermission>
	</form>
   </div>
</div>
<div>
<table id="protect_dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th><input type="checkbox" id="checkall" title="全选" />&nbsp;&nbsp;全选 </th>
        <th>所属区间</th>
        <th>合同编号</th>
        <th>主贷人姓名</th>
        <th>主贷人身份证号</th>
        <th>保护条件</th>
        <th>保护状态</th>
        <th>是否在豁免中</th>
        <th>催收员</th>
        <th>保留截止日期</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="11">没有检索到数据</td>
		</tr>
    </tbody>
</table>
</div>

<script type="text/javascript" language="javascript">

<%-- var table = P.dataTable($('#protect_dataTable'),
        $("#searchForm"),
        "<%=request.getContextPath()%>/rest/protectCase/pageProtectCaseData?"+new Date().toTimeString(),
        [
	        {"mData" :  function(row, type, set, meta) { 
	        	return  "</span><input type='checkbox' name='cases' class='cases' value="+row.applId+"|"+row.protectStatus+"></input>&nbsp;&nbsp;"+"<span>"+(row.rowNo)+"</span>"; 
	        }},
	        {"mData" : "statusName","sDefaultContent" : ""},
	        {"mData" : "cntrctNo","sDefaultContent" : ""},
	        {"mData" : "custName","sDefaultContent" : ""},
	        {"mData" : "docno","sDefaultContent" : ""},
	        {"mData" : "protectCondition","sDefaultContent" : ""},
	        {"mData" : "protectStatus","sDefaultContent" : ""},
	        {"mData" : "collectorName","sDefaultContent" : ""},
	        {"mData" : "protectEndDate","sDefaultContent" : ""},
	        {"mData" : null,"sDefaultContent" : "",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                	if(oData.isRecall=='Y'){
                		$(nTd).html("<a href='javascript:void(0);' " +           
            	                "onclick='recall_retains(\"" + oData.logId + "\")'>撤回&nbsp;&nbsp;</a>");
                	}
                	
                }
            }

	    ]

); --%>

var table_protectCase;
function table_protectCase(){
	 table_protectCase=$('#protect_dataTable').DataTable({
      "scrollY": '349px',
      "scrollX": '100%',
      "sScrollXInner": "100%",
      "bScrollCollapse": true,

      "sPaginationType": "full_numbers",      //设置分页控件的模式
      "bLengthChange": false,                 //改变每页显示数据数量
      "bPaginate": true,                      //是否翻页功能
      "bFilter": false,                       //是否过滤功能
      "bInfo": true,                         //是否页脚信息
      "bSort": false,                            //是否排序功能

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
      "bProcessing": false,       //加载数据时显示正在加载信息
      "bServerSide": true,        //指定从服务器端获取数据
      "sAjaxSource" : "<%=request.getContextPath()%>/rest/protectCase/pageProtectCaseData?"+new Date().toTimeString(),
      "fnServerData" : function(sSource, aoData, fnCallback) {
          //参数拼接
          var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm").serialize();
          $.ajax({
              "type" : 'POST',
              "dataType" : "json",
              "url" : sSource,
              "data" : data,
              "success" : function(resp) {
               $('#checkall').attr("checked", false);
                  fnCallback(resp);
              }
              ,"error":function(jqXHR,textStatus,errorThrown){
                  MSG.show("获取数据发生异常");
                  $('#main-content').html(jqXHR.responseText);
              }
          });
      },
      //dataTable显示
      "aoColumns" : [
			{"mData" :  function(row, type, set, meta) { 
	        	return  "</span><input type='checkbox' name='cases' class='cases' value="+row.applId+"|"+row.protectStatus+"></input>&nbsp;&nbsp;"+"<span>"+(row.rowNo)+"</span>"; 
	        }},
	        {"mData" : "statusName","sDefaultContent" : ""},
	        {"mData" : "cntrctNo","sDefaultContent" : ""},
	        {"mData" : "custName","sDefaultContent" : ""},
	        {"mData" : "docno","sDefaultContent" : ""},
	        {"mData" : "protectCondition","sDefaultContent" : ""},
	        {"mData" : "protectStatus","sDefaultContent" : ""},
	        {"mData" : "isWaive","sDefaultContent" : ""},
	        {"mData" : "collectorName","sDefaultContent" : ""},
	        {"mData" : "protectEndDate","sDefaultContent" : ""},
	        {"mData" : null,"sDefaultContent" : "",
                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                	if(oData.isRecall=='Y'){
                		$(nTd).html("<a href='javascript:void(0);' " +           
            	                "onclick='recall_retains(\"" + oData.logId + "\")'>撤回&nbsp;&nbsp;</a>");
                	}
                	
                }
            }
      ]
  });
}
	//页面打开时加载表格
	/*  $(document).ready(function(){
		 table_protectCase();
	 }) */
	$('#searchBtn').click(function(){
        var $this = $(this);
        if($this.hasClass("hasInit")){
    	    table_protectCase.search($("#searchForm").serialize()).draw();
        }else{
            $this.addClass("hasInit");
            table_protectCase();
        }
        var isWaive = $('#isWaive').val();
		if(isWaive=='Y'){
			$('#allocBtn').hide();
		}else{
			$('#allocBtn').show();
		}
	});
	//案件全选
	$('#checkall').click(function(){
		if($(this).get(0).checked==true){
			$(".cases").attr("checked", true);
		}else{
			$(".cases").attr("checked", false);
		}
	});
	
	//分配按钮 
	$('#allocBtn').click(function(){
		var checkedCount = 0;
		var checkedPaymentIds = "";
		var flag = "Y";
		$(".cases").each(function(){
		    if(this.checked){
		    	checkedCount++;
		    	checkedPaymentIds+=$(this).val()+",";
		    	if(checkedPaymentIds.indexOf("保护中") !=-1){
		    		MSG.alert("保护中的案件不能被分配！");
		    		flag = "N";
		    		return false;
		    	}
			}
		}); 
		if(checkedCount==0||flag =="N"){
			if(flag=="Y"){
				MSG.alert("请选择需要分配的案件 ");
			}
			return false;
		}else{
			var allocData = checkedPaymentIds.split(",");
			var applIds = "";
			for(var i=0;i<allocData.length;i++){
				var element = allocData[i].split("|");
				applIds+=element[0]+",";
			}
			$.ajax({
				url:"<%=request.getContextPath()%>/rest/protectCase/protectCaseAlloc?"+new Date().toTimeString(),
				type:"post",
				data:{"applIds":applIds},
				dataType: "json",
				success:function(data){
					$(".cases").attr("checked", false);
					table_protectCase.search($("#searchForm").serialize()).draw();
				    MSG.show(data.message);
				}
				});
		}
		
	});
	//撤回保留 
	function recall_retains(logId){
		MSG.confirm("确定撤回?",function(){
			$.ajax({
				url:"<%=request.getContextPath()%>/rest/protectCase/recallRetains?"+new Date().toTimeString(),
				type:"post",
				data:{"logId":logId},
				dataType: "json",
				success:function(data){
					$(".cases").attr("checked", false);
					table_protectCase.search($("#searchForm").serialize()).draw();
				    MSG.show(data.message);
				}
				});
			
		});
		
	}
</script>
