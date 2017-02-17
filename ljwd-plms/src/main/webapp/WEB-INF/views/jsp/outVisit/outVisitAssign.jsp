<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外访分配</title>
<style>
  	.dataTables_scrollBody tbody tr td{
	    padding: 1px 10px !important;
	}
	table.dataTable thead th{
		padding:5px 20px;
	}
</style>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">外访分配</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">
			  <label for="custType" class="right-space-1"> 客户类型 </label>
		      <select id="custType" name="custType" class="right-space collection">
		            <option value="">全部</option>
		            <c:forEach items="${custTypeList}" var="item">
                	<option value="${item.key}">${item.value}</option>
            		</c:forEach>        
		      </select>
		      <label for="area" class="right-space-1"> 所属城市</label>
		      <select id="areaId" name="areaId" class="right-space collection">
		            <option value="">全部</option>
		            <c:forEach items="${areaList}" var="item">
                	<option value="${item.id}">${item.areaName}</option>
            		</c:forEach>        
		      </select>
		      <label for="assignStatus" class="right-space-1"> 分配状态</label>
		      <select id="assignStatus" name="assignStatus" class="right-space collection">
		            <option value="">全部</option>
		            <option value="Audited" selected>待分配</option>
		           	<option value="Assigned">已分配</option>
		        	<option value="Closed">手工结案</option>
		      </select>
		      <label for="prdNo" class="right-space-1 line-bottom">贷款产品 </label>
		        <select id="prdNo" name="prdNo" class="right-space collection">
		            <option value="">全部</option>
		            <c:forEach items="${productList}" var="item">
		                <option value="${item.productNo}">${item.productName}</option>
		            </c:forEach>
		        </select> 
		        <br/>
		       <label for="visitType" class="right-space-1">外访类型 </label>
		        <select id="visitType" name="visitType" class="right-space collection">
		            <option value="">全部</option>
		            <option value="2">协催</option>
  		            <option value="1">考察</option>
		        </select>  
		 
		     <label for="applyNo" class="right-space-1">申请编号 </label>
	         <input type="text" id="applyNo"  name="applyNo" class="right-space collection"/>
			 <label for="cntrctNo" class="right-space-1">合同编号 </label>
	         <input type="text" id="cntrctNo"  name="cntrctNo" class="right-space collection"/>
	         <label for="custName" class="right-space-1 label-widthshort line-bottom">主&nbsp;贷&nbsp;人</label>
	         <input type="text" id="custName" name="custName" class="right-space collection"/>
	         <br/>
	         <label for="docno" class="right-space-1">身份证号 </label>
	         <input type="text" id="docno"  name="docno" class="right-space collection" data-placement="bottom"/><span style="color:red" id="idCardError"></span>
	         <label for="outVisiter" class="right-space-1">外访人员 </label>
	        
		     <span class="search_box right-space">
	             <input type="text" id="outVisiterName" name="outVisiterName" class="search_input" />
	         	 <span class="search_ionic input-group-addon" id="outVisiterSearchBtn">
	           		<i class="glyphicon glyphicon-search"></i>
	           	 </span>
           	 </span>
	         <label for="endDateMin" class="right-space-1">分配日期 </label>
             <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'assignDateEnd\')||\'%y-%M-%d\'}'})" id="assignDateStart" name="assignDateStart">
             	  <label class="label-center-1">至</label>
             <input size="10" type="text"  class="collection-number right-space" readonly onFocus="WdatePicker({minDate:'#F{$dp.$D(\'assignDateStart\')}',maxDate:'%y-%M-%d'})" id="assignDateEnd" name="assignDateEnd">
	         <label for="endDateMin" class="right-space-1 line-bottom">申请日期 </label>
	         <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'submitDateEnd\')||\'%y-%M-%d\'}'})" id="submitDateStart" name="submitDateStart">
             	 <label class="label-center-1">至</label>
             <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({minDate:'#F{$dp.$D(\'submitDateStart\')}',maxDate:'%y-%M-%d'})" id="submitDateEnd" name="submitDateEnd">
             <br/>
             <shiro:hasPermission name="outVisitAssign:select">
             <button type="button" class="btn btn-primary right-space-2" id="searchBtn">查询</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="outVisitAssign:autoAssign">
             <button type="button" class="btn btn-primary right-space-2" id="assignAutoBtn">自动分配</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="outVisitAssign:maruAssign">
             <button type="button" class="btn btn-primary right-space-2" id="assignMaruBtn">手工分配</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="outVisitAssign:closed">
             <button type="button" class="btn btn-primary right-space-2" id="closedBtn">结案</button>
             </shiro:hasPermission>
             <button type="reset" class="btn btn-default" >清除</button>                         
        </form>
    </div>
 </div>
  
    <table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr>
	    	<th><input type="checkbox" id="checkall" title="Select all" />&nbsp;&nbsp;全选  </th>
	        <th>申请日期</th>
	        <th>外访类型</th>
	        <th>客户类型</th>
	        <th>所属城市</th>
	        <th>主贷人</th>
	        <th>申请编号</th>
	    	<th>合同编号</th>
	        <th>贷款产品</th>
	        <th>签约网点</th>
	        <th>提交人员</th>
	        <th>外访人员</th>
	        <th>分配状态</th>
	        <th>状态</th>
	    	<th>分配日期</th> 
	    	<th>审核日期</th>
	    </tr>
    </thead>
</table>
<!-- 手动分配弹出框 -->
<div class="modal fade" id="outVisitMaruAssignTable" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document" style="width:650px">
		<div class="modal-content">
			<div class="modal-header">
	            <button type="button" class="close" 
	               data-dismiss="modal" aria-hidden="true">
	                  &times;
	            </button>
	            <h4 class="modal-title" id="Title">
					手工分配          
				</h4>
	         </div>
			<div class="modal-body" style="padding:10px;">
				<table>
					<thead>
						<tr class="outVisittableHeader">
							<td width="320px" style="border-right:1px solid #333">待分配案件</td>
							<td width="259px">外访区域&nbsp;&nbsp;<select id="outVisitAreaOpt" onchange="changeOutVisitOpt()"><option>无数据</option></select></td>
						</tr>
						<tr>
							<td style="border-right:1px solid #333">
								<div class="checkedAssignCasesHeader">
									<table>
										<thead>
									         <tr>
									            <th width="250px">合同编号</th>
									            <th width="86px">主贷人</th>
									         </tr>
									      </thead>
									</table>
								</div>
								<div  class="checkedAssignCasesBox">
							         <table class="table dataTable" >
									      <tbody id="checkedAssignCases">
						        		  </tbody>
						         	 </table>	 
						         </div>
							</td>
							<td>
								<div class="outVisitUserHeader">
						         	<table>
						         		<thead>
							         	<tr>
								            <th width="148px"><input type="checkbox" id="checkallOutVisitUser" title="Select all" />&nbsp;&nbsp;全选</th>
								            <th width="266px">姓名</th>
								            <th width="144px">当前单数</th>
								         </tr>
								        </thead>
						         	</table>
						         </div>
							     <div class="outVisitUserBox">
								     <table class="display dataTable" id="outVisitUser">
									      <tbody id="outVisitUserTbody">
									      </tbody>
								     </table>
							     </div>
							</td>
						</tr>
					</thead>
				</table>
	     	</div>
		    <div class="modal-footer">
		          <button class="btn btn-primary" type="button" class="btn blue" id="outVisitUserMaruBtn">
		             	 分配
		          </button>
		          <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
		             	 返回
		          </button>
		     </div>
		</div>
	</div>
</div>
<!-- 手工分配提示 -->
<div class="modal fade hideModal" id="msgModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
<!--                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
 -->                <h4 class="modal-title">提示</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" >
                     <div class="form-group">
					         <span style='width:500px; height:20px; line-height:20px; text-align:center; float:left;'> 仅支持对同一城市的案件进行分配，请重新选择！</span>
					 </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 确定
                </button>
            </div>
        </div>
    </div>
</div>


<jsp:include page="detail_modal/outVisitUserModal.jsp"></jsp:include>
<jsp:include page="detail_modal/outVisitClosedModel.jsp"></jsp:include>

<script type="text/javascript">

//分页Table
var table;

//Table初始化方法
function init(){
    table = $('#dataTable').DataTable({
        "scrollY": '379px',
        "scrollX": true,
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
            //,"sProcessing": "<img src='assets/img/loading.gif' />"
        },
        "bProcessing": false,        //加载数据时显示正在加载信息
        "bServerSide": true,        //指定从服务器端获取数据
        "sAjaxSource" : "<%=request.getContextPath()%>/rest/outVisitAssign/pageOutVisitAssignData",
        "fnServerData" : function(sSource, aoData, fnCallback) {
            //参数拼接
            var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm").serialize();
            $.ajax({
                "type" : 'POST',
                "dataType" : "json",
                "url" : sSource,
                "data" : data,
                "success" : function(resp) {
                    $('#checkallCase').attr("checked", false);
                    fnCallback(resp);
                },
                "error":function(jqXHR,textStatus,errorThrown){
                    MSG.show("获取数据发生异常");
                }
            });
        },
        //dataTable显示
        "aoColumns" : [
				{"mData" :  function(row, type, set, meta) { 
					return  "<input type='checkbox' name='outVisitCases' class='outVisitCases' value="+row.id+"|"+row.assignStatus+"|"+row.areaId+"|"+row.cntrctNo+"|"+row.custName+"|"+row.outVisitStatus+"></input><span>&nbsp;&nbsp;"+row.rowNo+"&nbsp;&nbsp;</span>"; 
				}},
				{"mData" : "submitDate","sDefaultContent" : ""},
				{"mData" : "visitType","sDefaultContent" : ""},
				{"mData" : "custType","sDefaultContent" : ""},
				{"mData" : "areaName","sDefaultContent" : ""},
				{"mData" : "custName","sDefaultContent" : ""},
				{"mData" : "applyNo","sDefaultContent" : ""},
				{"mData" : "cntrctNo","sDefaultContent" : ""},
				{"mData" : "proName","sDefaultContent" : ""},
				{"mData" : "siteName","sDefaultContent" : ""},
				{"mData" : "submitBy","sDefaultContent" : ""},
				{"mData" : "visitBy","sDefaultContent" : ""},
				{"mData" : "assignStatus","sDefaultContent" : ""},
				{"mData" : "outVisitStatusName","sDefaultContent" : ""},
				{"mData" : "assignDate","sDefaultContent" : ""},
				{"mData" : "auditDate","sDefaultContent" : ""}
				
        ],
        "aoColumnDefs":[
                        {"bSortable":false,"aTargets":[0]}
                    ]
    });
}

//查询按钮 
$('#searchBtn').click(function(){
	 if (!$("#searchForm").valid()){
         return false;
     }
    table.search($("#searchForm").serialize()).draw();
});

//全选按钮 
$('#checkall').click(function(){
  	if($(this).get(0).checked==true){
  		$(".outVisitCases").attr("checked", true);
  	}else{
  		$(".outVisitCases").attr("checked", false);
  	}
 });
//自动分配
$('#assignAutoBtn').click(function(){
	var data = $('#searchForm').serialize();
	  $.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitAssign/outVisitAutoAssign?"+new Date().toTimeString(),
			type:"post",
			data:data,
			dataType: "json",
			success:function(data){
				if(data.success){
			        table.search($("#searchForm").serialize()).draw();
				}else{
					MSG.alert("处理失败 !");
				}
			}

		});
});

<%-- //手动分配弹出框
$('#assignMaruBtn').click(function(){
	$("#checkallOutVisitUser").attr("checked", false);
	$("#checkedAssignCases  tr:not(:first)").empty();
	  var checkedCount = 0;
	  var checkedIds = "";
	  var map = {};
	  var count = 0; 
	//被选中案件
	  $(".outVisitCases").each(function(){
		    if(this.checked){
		    		var arr = $(this).val().split('|');
		    		var assignStatus = arr[1];
		    		if(assignStatus!="未分配"){
		    			count++;
		    		}
		    		map[arr[2]] = true;
		    	    checkedIds+=$(this).val()+",";
		    	    checkedCount++;
			}
		}); 
	if(count>0){
		MSG.alert("只有待分配的案件才能被分配，请重新选择");
		return false;
	}
	if(checkedCount==0){
			MSG.alert("请至少选择一条待分配的案件");
			return false;
	}
	if(Object.keys(map).length>1){
		$('#msgModal').modal('show');
	}else{
		var payments = checkedIds.split(",");
		var areaId = "";
		for(var i=0;i<payments.length-1;i++){
			var elements = payments[i].split("|");
			areaId = elements[2];
			var newRow='<tr><td>'+elements[3]+'</td><td>'+elements[4]+'</td></tr>';  
			$('#checkedAssignCases').append(newRow);
		}
		//根据区域查找外访员
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitAssign/searchOutVisitUserByAreaId?"+new Date().toTimeString(),
			type:"post",
			data:{"areaId":areaId},
			dataType: "json",
			success:function(data){
				if(data.success){
					var msg = data.message;
					msg = eval("(" + msg + ")");
					var outVisitUserTbody = $('#outVisitUserTbody');
					var bodyHtml = "";
	                    for(var i = 0; i < msg.length; i++){
	                        bodyHtml += "<tr><td><input type='checkBox' class='checkOutVisitUser' value='"+ msg[i].userId +"'></td><td><span>" + msg[i].userName + "</span></td><td><span>" + msg[i].caseCount + "</span></td></tr>";
	                    }
	                outVisitUserTbody.html(bodyHtml);
				}else{
					MSG.alert(data.message);
				}
			}

		});
		$('#outVisitMaruAssignTable').modal('show');
	}
}); --%>


//手动分配弹出框
$('#assignMaruBtn').click(function(){
	$("#checkallOutVisitUser").attr("checked", false);
	$("#checkedAssignCases").empty();
	  var checkedCount = 0;
	  var checkedIds = "";
	  var map = {};
	  var count = 0; 
	//被选中案件
	  $(".outVisitCases").each(function(){
		    if(this.checked){
		    		var arr = $(this).val().split('|');
		    		var assignStatus = arr[1];
		    		if(assignStatus!="未分配"){
		    			count++;
		    		}
		    		map[arr[2]] = true;
		    	    checkedIds+=$(this).val()+",";
		    	    checkedCount++;
			}
		}); 
	if(count>0){
		MSG.alert("只有待分配的案件才能被分配，请重新选择");
		return false;
	}
	if(checkedCount==0){
			MSG.alert("请至少选择一条待分配的案件");
			return false;
	}
	var payments = checkedIds.split(",");
	var areaId = "";
	for(var i=0;i<payments.length-1;i++){
		var elements = payments[i].split("|");
		areaId = elements[2];
		var newRow='<tr><td>'+elements[3]+'</td><td>'+elements[4]+'</td></tr>';  
		$('#checkedAssignCases').append(newRow);
	}
	//查找所有的外访区域
	$.ajax({
        type : "post",
        dataType : "json",
        url : "<%=request.getContextPath()%>/rest/outVisitAssign/searchOutVisitAreaAll",
        success:function(data){
        	var option ="<option value=''>全部</option>";
            if(data.data != null){
                for(var i=0;i<data.data.length;i++){
                    option+="<option value='"+data.data[i].id+"'>"+data.data[i].areaName+"</option>";
                }
                $("#outVisitAreaOpt").empty();
                $("#outVisitAreaOpt").html(option);
                changeOutVisitOpt();
            }
        }
    }); 
	//查找所有有效的外访员
	<%-- $.ajax({
		url:"<%=request.getContextPath()%>/rest/outVisitAssign/searchOutVisitAllUser?"+new Date().toTimeString(),
		type:"post",
		dataType: "json",
		success:function(data){
			if(data.success){
				var msg = data.message;
				msg = eval("(" + msg + ")");
				var outVisitUserTbody = $('#outVisitUserTbody');
				var bodyHtml ="";
                    for(var i = 0; i < msg.length; i++){
                        bodyHtml += "<tr><td><input type='checkBox' class='checkOutVisitUser' value='"+ msg[i].userId +"'></td><td><span>" + msg[i].userName + "</span></td><td><span>" + msg[i].caseCount + "</span></td></tr>";
                    }
                outVisitUserTbody.html(bodyHtml);
			}else{
				MSG.alert(data.message);
			}
		}

	}); --%>
	$('#outVisitMaruAssignTable').modal('show');
});
//外访区域change事件
function changeOutVisitOpt(){
	//下拉框选中的数据
	var areaId = $("#outVisitAreaOpt").val();
    var outVisitUserTbody = $('#outVisitUserTbody');
	$.ajax({
        url:"<%=request.getContextPath()%>/rest/outVisitAssign/searchOutVisitUserByAreaId?"+new Date().toTimeString(),
        type:"post",
        dataType: "json",
        data:{"areaId": areaId},
        success:function(data){
            if(data.success){
                var msg = data.message;
                msg = eval("(" + msg + ")");
                var bodyHtml ="";
                    for(var i = 0; i < msg.length; i++){
                        bodyHtml += "<tr><td><input type='checkBox' class='checkOutVisitUser' value='"+ msg[i].userId +"'></td><td><span>" + msg[i].userName + "</span></td><td><span>" + msg[i].caseCount + "</span></td></tr>";
                    }
                outVisitUserTbody.empty();
                outVisitUserTbody.html(bodyHtml);
            }else{
            	outVisitUserTbody.empty();
                MSG.alert(data.message);
            }
        }

    });
}
//外访员全选按钮 
$('#checkallOutVisitUser').click(function(){
  	if($(this).get(0).checked==true){
  		$(".checkOutVisitUser").attr("checked", true);
  	}else{
  		$(".checkOutVisitUser").attr("checked", false);
  	}
 });

//手工分配确认按钮
$('#outVisitUserMaruBtn').click(function(){
	  var checkedUserId = "";
	  var checkedIds = "" ;
	  var checkedCount = 0;
	  $(".checkOutVisitUser").each(function(){
		    if(this.checked){
		    	    checkedUserId+=$(this).val()+",";
		    	    checkedCount++;
			}
		}); 

	  if(checkedCount==0){
		  MSG.alert("请选择外访人员!");
		  return false;
	  }
	//被选中案件
	  $(".outVisitCases").each(function(){
		    if(this.checked){
		    		var arr = $(this).val().split('|');
		    	    checkedIds+=arr[0]+",";
			}
	  }); 
	  $.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitAssign/outVisitMaruAssign?"+new Date().toTimeString(),
			type:"post",
			data:{"checkedUserId":checkedUserId,"checkedIds":checkedIds},
			dataType: "json",
			success:function(data){
				 $('#outVisitMaruAssignTable').modal('hide');
				if(data.success){
					table.search($("#searchForm").serialize()).draw();
				}else{
					MSG.alert(data.message);
				}
			}

		});
});
//结案弹出框
$('#closedBtn').click(function(){
	  P.resetModal('colsedForm');
	  var checkedCount = 0;
	  var errFlag = true;
	//被选中案件
	  $(".outVisitCases").each(function(){
		    if(this.checked){
		    	var status = $(this).val();
		    	if(status.indexOf("Closed") != -1||status.indexOf("Overdued") != -1||status.indexOf("Settle") != -1||status.indexOf("Outsourced") != -1||status.indexOf("Normal") != -1){
		    		MSG.alert("选择的外访申请记录中,存在手动结案,已结清,已过期,已外包或者已正常数据,请重新选择!");
		    		errFlag = false;
		    		return false;
	    		}else{
		    		checkedCount++;
	    		}		    	 
			}
		}); 
	
	 if(checkedCount==0){
 			MSG.alert("选择的外访申请记录中,存在手动结案,已结清,已过期,已外包或者已正常数据,请重新选择!");
			return false;
	 }else{
		if(errFlag){
			 $('#outVisitClosedModel').modal('show');
			 $("#closedDate").val(new Date().FormatTwo("yyyy-MM-dd"));
		}
	  }
	 
});


//确认结案
$('#outVisitclosedBtn').click(function(){
	if(checkOutcolsedForm()){
		var checkArray = new Array();
		var i=0;
    	$(".outVisitCases").each(function(){
		    if(this.checked){
		    	var arr = $(this).val().split('|');
		    	checkArray[i] = arr[0];
		    	i++;
			}
		});  
    	var data = $('#colsedForm').serialize();
    	 $.ajax({
    		url:"<%=request.getContextPath()%>/rest/outVisitAssign/OutVisitClosed?ids="+checkArray+"&date="+new Date().toTimeString(),
			type:"post",
			data:data,
			dataType: "json",
			success:function(data){
				$('#outVisitClosedModel').modal('hide');
				table.search($("#searchForm").serialize()).draw();
			},
			error:function(jqXHR,textStatus,errorThrown){
                 MSG.show("获取数据发生异常");
            }
    	});
	}
});


function checkOutcolsedForm(){
	var closedDate = $('#closedDate').val();
	var closedType = $('#closedType').val();
	if(closedDate.length==0){
		$('#closedDateError').html("请填写结案日期");
		return false;
	}else{
		$('#closedDateError').html("");
	}
	if(closedType.length==0){
		$('#closedTypeError').html("请选择结案类别 ");
		return false;
	}else{
		$('#closedTypeError').html("");
	}
	return true;
}

//查找外访人员
$('#outVisiterSearchBtn').click(function(){
	$('#out_areaId').val("");
	$('#outVisitUserTBody').html("");
	$('#outVisitUserSearchModal').modal('show');
});
//根据所属机构查找外访人员
$('#out_areaId').change(function(){
	var out_areaId = $('#out_areaId').val();
	if(out_areaId.length>0){
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitAssign/searchOutVisitUserByAreaId?"+new Date().toTimeString(),
			type:"post",
			data:{"areaId":out_areaId},
			dataType: "json",
			success:function(data){
				if(data.success){
					var msg = data.message;
					msg = eval("(" + msg + ")");
					var outVisitUserTbody = $('#outVisitUserTBody');
					var bodyHtml = "";
	                    for(var i = 0; i < msg.length; i++){
	                        bodyHtml += "<tr><td><input type='radio' name='OutVisitUser_search' value='"+ msg[i].userId +"'></td><td><span>" + msg[i].userName + "</span></td><td><span>" + msg[i].tel + "</span></td></tr>";
	                    }
	                outVisitUserTbody.html(bodyHtml);
				}else{
					MSG.alert(data.message);
				}
			}

		});
	}
});
//查找外访员确认按钮
$('#outVisitUserAddBtn').click(function(){
	 var collector = $('input[name="OutVisitUser_search"]').filter(':checked').val();
     var collectorName = $('input[name="OutVisitUser_search"]').filter(':checked').parent().next().text();
     if(!collector){
         MSG.show('请选择一个外访员');
         return;
     }
     $("#outVisiterName").val(collectorName);
     $("#outVisitUserSearchModal").modal("hide");
});
//查找外访员清除按钮 
$('#outVisitUserClearBtn').click(function(){
     $("#outVisiterName").val('');
     $("#outVisitUserSearchModal").modal("hide");
});

//表单校验
function outVisitAssign_searchForm_validate($validateForm){
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
        	docno:{
                idCard: true
            }
        }
    });
}

$(document).ready(function() {
	init();
	outVisitAssign_searchForm_validate($('#searchForm'));
	 $('#closedDate').blur(function(){
     	if($(this).val()!=""){
 			$('#closedDateError').html("");	
     	}
     });
     $('#closedType').change(function(){
     	if($(this).val()!=""){
 			$('#closedTypeError').html("");	
     	}
     });
});

//设置模态框垂直居中函数
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
