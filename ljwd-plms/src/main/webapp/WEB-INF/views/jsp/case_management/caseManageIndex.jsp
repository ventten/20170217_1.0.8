<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>案件管理</title>
<style>
  	#dataTable tbody tr td{
	    padding: 1px 10px !important;
	}
	#dataTable_wrapper thead tr th {
    	padding: 5px 20px;
	}
</style>
</head>
<div class="panel panel-default">
	<div class="panel-heading">
      <h3 class="panel-title">
         	案件分配
      </h3>
   </div>
   <div class="panel-body">
		<div>
		    <form id="searchForm">
		    	<input type="hidden" id="statusChecked" value="${statusChecked}">
		    	<input type="hidden" id="transfer_outSrc_code" value="${transferOutsrcCode }">
		        <label for="status" class="right-space-1 label-width"><span style="color:red">*</span>催收区间 </label>
		        <select id="status" name="status" class="right-space-1 collection">
		            <c:forEach items="${collectionList}" var="item">
		                <option value="${item.status}" >${item.name}</option>
		            </c:forEach>
		        </select>
		        <label for="queue" class="right-space-1 label-width">所属队列 </label>
		        <select id="queue" name="queue" class="right-space-1 collection">
		            <option value="1">主队列</option>
		            <option value="2">代理队列</option>
		        </select>
		        
		        <label for="cntrctNo" class="right-space-1 label-width">合同编号 </label>
		        <input type="text" id="cntrctNo"  name="cntrctNo" class="right-space-1 collection"/>
		        
		        <label for="custName" class="right-space-1 label-width line-bottom">&nbsp;主&nbsp;&nbsp;贷&nbsp;&nbsp;人 </label>
		        <input type="text" id="custName" name="custName" class="right-space-1 collection"/>
		        <br/>
		        
		        <label for="docno" class="right-space-1 label-width">身份证号 </label>
		        <input type="text" id="docno"  name="docno" class="right-space-1 collection"/>		        
		        <label for="prdNo" class="right-space-1 label-width">贷款产品 </label>
		        <select id="prdNo" name="prdNo" class="right-space-1 collection">
		            <option value="">全部</option>
		            <c:forEach items="${productList}" var="item">
		                <option value="${item.productNo}">${item.productName}</option>
		            </c:forEach>
		        </select> 
		        
		       <!--  <label for="allocDate" class="right-space-1 label-width">分配日期</label>
				<input size="16" type="text"  readonly class="form_datetime input-border collection-number" id="allocDateStart" name="allocDateStart">
				<label for="allocDate" class="label-center-1">&nbsp;至&nbsp;</label>
				<input size="16" type="text"  readonly class="form_datetime input-border collection-number right-space-1" id="allocDateEnd" name="allocDateEnd"> -->
				 <label for="allocDate" class="right-space-1 label-width">分配日期</label>
				<input size="16" type="text"  readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'allocDateEnd\')||\'%y-%M-%d\'}'})" class="collection-number" id="allocDateStart" name="allocDateStart">
				<label for="allocDate" class="label-center-1">&nbsp;至&nbsp;</label>
				<input size="16" type="text"  readonly onFocus="WdatePicker({minDate:'#F{$dp.$D(\'allocDateStart\')}',maxDate:'%y-%M-%d'})" class="collection-number right-space-1" id="allocDateEnd" name="allocDateEnd">
		        
		       <label for="collector" class="right-space-1 label-width line-bottom">&nbsp;催&nbsp;&nbsp;收&nbsp;&nbsp;员 </label>
		       <span class="search_box">
		      		<input type="text" class="search_input" id="collectorName" name="collectorName"  <c:if test="${isLeader == false }">  readonly  value=${userName} </c:if>>
	           		<shiro:hasPermission name="casemanagement:collectorSelect">
	           		<span class="search_ionic input-group-addon" id="collectorSearchBtn" >
	           			<i class="glyphicon glyphicon-search"></i>
	           		</span>
	           		</shiro:hasPermission>
           		</span>
		        
		        <br/>
		        
		        <label for="isAlloc" class="right-space-1 label-width">是否分配</label>
		        <select id="isAlloc" name="isAlloc" class="collection">
		            <option value="0">全部</option>
		            <option value="1">已分配</option>
		            <option value="2" selected>待分配</option>
		        </select>
		        
		        <label for="siteCode" class="right-space-1 label-width">&nbsp;&nbsp;&nbsp;所属网点</label>
		        &nbsp;<select id="siteCode" name="siteCode" class="right-space-1 collection">
		        	<c:forEach items="${siteList}" var="item">
		                <option value="${item.siteCode}" >${item.siteName}</option>
		            </c:forEach>
		        </select>
		        
		        <label class="right-space-1 label-width line-bottom" for="overDaysMin">逾期天数 </label>
            	<input size="16" type="text" id="overDaysFrom" name="overDaysFrom" class="collection-data">
             	<label class="label-center-1">&nbsp;至&nbsp;</label> 
	         	<input size="16" type="text"  id="overDaysTo" name="overDaysTo" class="collection-data right-space">
	         	
	         
	          <br/>
	           <shiro:hasPermission name="casemanagement:select,casemanagement:branchSelect">
	             <button type="button" class="btn btn-primary left-space-2 right-space-2" id="searchBtn">查询</button>
	           </shiro:hasPermission>
	           <shiro:hasPermission name="casemanagement:alloc">  
	             <button type="button" class="btn btn-primary right-space-2" id="allocBtn">手工调整</button>
	           </shiro:hasPermission>  
	           <shiro:hasPermission name="casemanagement:batchAlloc">  
	             <button type="button" class="btn btn-primary right-space-2" id="allocBatchBtn">批量分配</button>
	           </shiro:hasPermission>  
	           <shiro:hasPermission name="casemanagement:exportExcel">
	           <button type="button" class="btn btn-primary right-space-2" id="exportBtn">导出</button> 
	           </shiro:hasPermission>  
	          
	           <button type="reset" class="btn btn-default" >清除</button>  
	            	     
		    </form>
		</div>
	</div>
</div>

<input type="hidden" name="userName" id="userName" value="${userId }">
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th><input type="checkbox" id="checkall" title="Select all" />&nbsp;&nbsp;全选 </th>
        <th>合同编号</th>
        <th>主贷人</th>
        <th>身份证号</th>
        <th>贷款金额</th>
        <th>逾期天数</th>
        <th>逾期金额</th>
        <th>剩余本金/保证金</th>
        <th>催收员</th>
        <th>代理催收员</th>
        <th>业务类型</th>
        <!-- <th>所属网点</th> -->
        <th>贷款产品</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="13">没有检索到数据</td>
		</tr>
    </tbody>
</table>
<jsp:include page="detail_model/caseManageAutoAssign.jsp"></jsp:include>
<jsp:include page="detail_model/caseManageMaruAssign.jsp"></jsp:include>
<jsp:include page="detail_model/caseManageCollector.jsp"></jsp:include>

<script type="text/javascript" language="javascript">
		 	$(document).ready(function() {
		 		form_validate($('#searchForm'));
		    	var statusChecked = $('#statusChecked').val();
		    	if(statusChecked.length>0){
			    	$("#status option[value='"+statusChecked+"']").attr("selected","selected");
		    	}
		    	var transfer_outSrc_code = $('#transfer_outSrc_code').val();
		    	var statusVal = $('#status').val();
		    	if(statusVal.length>0){
		    		if(transfer_outSrc_code.indexOf(statusVal) != -1){
		    			 $('#allocBtn').hide();
		    			 $('#allocBatchBtn').hide();
		    		}else{
		    			 $('#allocBtn').show();
		    			 $('#allocBatchBtn').show();
		    			
		    		}
		    	}
		    	
		    });
		    
		 	$('#status').change(function(){
		 		var transfer_outSrc_code = $('#transfer_outSrc_code').val();
		 		var status = $(this).val();
		 		if(status.length>0){
		    		if(transfer_outSrc_code.indexOf(status) != -1){
		    			 $('#allocBtn').hide();
		    			 $('#allocBatchBtn').hide();
		    		}else{
		    			 $('#allocBtn').show();
		    			 $('#allocBatchBtn').show();
		    		}
		    	}
		    	
		 	});
		    //分页Table
		    var table;
		    //选中代理案件的催收员
		    var collector;

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
		              },
		              "bProcessing": false,        //加载数据时显示正在加载信息
		              "bServerSide": true,        //指定从服务器端获取数据
		             "sAjaxSource":"<%=request.getContextPath()%>/rest/caseManagement/pageCaseData",
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
		                 {"mData" :  function(row, type, set, meta) { 
				            	return  "<input type='checkbox' name='cases' class='cases' value="+row.paymentId+"|"+row.cntrctNo+"|"+row.custName+"|"+row.collector+"></input>&nbsp;&nbsp;"+"<span>"+row.rowNo+"</span>"; 
				            }},
				            {"mData" : "cntrctNo","sDefaultContent" : ""},
				            {"mData" : "custName","sDefaultContent" : ""},
				            {"mData" : "docno","sDefaultContent" : ""},
				            {"mData" : "loanAmt","sDefaultContent" : ""},
				            {"mData" : "overDays","sDefaultContent" : ""},
				            {"mData" : "overdueAmount","sDefaultContent" : ""},
				            {"mData" : "remainingPrincipal","sDefaultContent" : ""},
				            {"mData" : "collectorName","sDefaultContent" : ""},
				            {"mData" : "agentName","sDefaultContent" : ""},
				            {"mData" : "bizCategory","sDefaultContent" : ""},
 				           /*  {"mData" : "siteName","sDefaultContent" : ""}, */
 				            {"mData" : "proName","sDefaultContent" : ""},
				            {"mData" : null,"sDefaultContent" : "",
				                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
				                	<shiro:hasPermission name='casemanageDetail:select'>
				                	$(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/caseManagement/caseDetail?status="+oData.status+"&paymentId=" + oData.paymentId + '>详情</a>&nbsp;&nbsp;');
				                	</shiro:hasPermission>
				                }
				            }
		             ],
		             "aoColumnDefs":[
		                             {"bSortable":false,"aTargets":[0,12]}
		              ]
		         });
		    }	
		   
      //查询按钮
    $('#searchBtn').on( 'click', function () {
    	  var $form = $('#searchForm');
         //表单校验
         if (!$form.valid()){
             return false;
         } 
         
         var $this = $(this);
         if($this.hasClass("hasInit")){
             table.search($form.serialize()).draw();
         }else{
             $this.addClass("hasInit");
             init();
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
	
	//催收员全选
	$('#checkallCollector').click(function(){
		if($(this).get(0).checked==true){
    		$(".checkCollector").attr("checked", true);
    	}else{
    		$(".checkCollector").attr("checked", false);
    	}	
	});
	//批量分配时催收员全选 
	$('#checkallBatchCollector').click(function(){
		if($(this).get(0).checked==true){
    		$(".checkallBatchCollector").attr("checked", true);
    	}else{
    		$(".checkallBatchCollector").attr("checked", false);
    	}	
	});
	
	//批量分配弹出框 
	$('#allocBatchBtn').click(function(){
		$("#batchCollectors  tr:not(:first)").empty();
		$("#checkallBatchCollector").attr("checked", false);
		$('#batchBtn').removeAttr("disabled");
		getCollectorInfo();
	});
	
	//手工调整按钮
	$('#allocBtn').click(function(){
	// 	$("#collectors  tr:not(:first)").empty();
		$('#agentDateStart').val("");
		$('#agentDateEnd').val("");
		$("#checkallCollector").attr("checked", false);
		$("#agentTable  tr:not(:first)").empty();
		var checkedCount = 0;
		var checkedPaymentIds = "";
		$(".cases").each(function(){
		    if(this.checked){
		    	checkedCount++;
		    	checkedPaymentIds+=$(this).val()+",";
			}
		}); 
		if(checkedCount==0){
			MSG.alert("请选择需要分配的案件 ");
			return false;
		}else{
			var payments = checkedPaymentIds.split(",");
			$('#count').html(payments.length-1+"个");
			for(var i=0;i<payments.length-1;i++){
				var elements = payments[i].split("|");
				var newRow='<tr><td>'+(i+1)+'</td><td>'+elements[1]+'</td><td>'+elements[2]+'</td></tr>';  
				collector = elements[3];
				$('#agentTable').append(newRow);
			}
			getDoAllocColllectorInfo(1,null,0,collector);
		}
	});
	
	//获取手工调整的催收员信息
	function getDoAllocColllectorInfo(type,orgId,mode,collector){
		var status = $('#status').val();
		if(mode==0){
			$("#collectors  tr:not(:first)").empty();
			$("#agentForm").empty();
		}else if(mode==1){
			$("#collectors  tr:not(:first)").empty();
		}else if(mode==2){
			$("#agentForm").empty();
		}
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/caseManagement/getCollector?"+new Date().toTimeString(),
			type:"post",
			data:{"status":status,"orgId":orgId},
			dataType: "json",
			success:function(data){
				var collectorList = data.collectorList;
				var orgMap = data.orgMap;
				var assignRule = data.assignRule;
				if(assignRule=='DOT_DIST'){
					assignRule = "AVRG_DIST";
				}
				$("input[type=radio][name=assignRule][value="+assignRule+"]").attr("checked",'checked')
				$.each(collectorList,function(i,result){ 
					if(mode==0){
						var newRow='<tr><td><input type="checkbox" name="checkCollector" class="checkCollector" value='+result['collector']+'></td><td>'+result['collectorName']+'</td><td>'+result['orgName']+'</td><td>'+result['monthRemainingPrincipal']+'</td><td>'+result['monthCaseCount']+'</td><td>'+result['currentRemainingPrincipal']+'</td><td>'+result['currentCaseCount']+'</td></tr>';  
					    $('#collectors').append(newRow);
					    if(result['collector']==collector){
						    var checkElement = '<input type="checkbox" name="checkAgent" disabled class="checkAgent" value='+result['collector']+'>&nbsp;&nbsp;'+result['collectorName']+'<br/>';	
					    }else{
						    var checkElement = '<input type="checkbox" name="checkAgent"  class="checkAgent" value='+result['collector']+'>&nbsp;&nbsp;'+result['collectorName']+'<br/>';	
					    }
					    $('#agentForm').append(checkElement);
					}else if(mode==1){
						var newRow='<tr><td><input type="checkbox" name="checkCollector" class="checkCollector" value='+result['collector']+'></td><td>'+result['collectorName']+'</td><td>'+result['orgName']+'</td><td>'+result['monthRemainingPrincipal']+'</td><td>'+result['monthCaseCount']+'</td><td>'+result['currentRemainingPrincipal']+'</td><td>'+result['currentCaseCount']+'</td></tr>';  
					    $('#collectors').append(newRow);
					}else if(mode==2){
						
						if(result['collector']==collector){
						    var checkElement = '<input type="checkbox" name="checkAgent" disabled class="checkAgent" value='+result['collector']+'>&nbsp;&nbsp;'+result['collectorName']+'<br/>';	
					    }else{
						    var checkElement = '<input type="checkbox" name="checkAgent"  class="checkAgent" value='+result['collector']+'>&nbsp;&nbsp;'+result['collectorName']+'<br/>';	
					    }
						$('#agentForm').append(checkElement);
					}
					
				});
				if(orgMap&&type==1){
					//手动分配下拉框
					 var $orgId = $("#do_alloc_orgId");
	                 var orgHtml = "<option value=''>全部</option>";
                     for (var key in orgMap) {
                        if(orgMap.hasOwnProperty(key)) {
                            orgHtml += "<option value='" + key + "'>" + orgMap[key] + "</option>"
                        }
                     }
                     $orgId.html(orgHtml);
                     //代理分配下拉框  
                     var $orgId = $("#agent_alloc_orgId");
	                 var orgHtml = "<option value=''>全部</option>";
                     for (var key in orgMap) {
                        if(orgMap.hasOwnProperty(key)) {
                            orgHtml += "<option value='" + key + "'>" + orgMap[key] + "</option>"
                        }
                     }
                     $orgId.html(orgHtml);
				}
			}
			
		});
		
		$('#do_alloc').modal('show');
	}
	
	//根据所属机构查询催收员信息（手动分配）
	$('#do_alloc_orgId').change(function(){
		var orgId = $(this).val();
		getDoAllocColllectorInfo(2,orgId,1); 

	});
	
	//根据所属机构查询催收员信息(代理分配 )
	$('#agent_alloc_orgId').change(function(){
		var orgId = $(this).val();
		getDoAllocColllectorInfo(2,orgId,2,collector); 

	});
	
	
	//获取批量分配的催收员信息
	function getCollectorInfo(){
		var status = $('#status').val();
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/caseManagement/getCollector?"+new Date().toTimeString(),
			type:"post",
			data:{"status":status},
			dataType: "json",
			success:function(data){
				var collectorList = data.collectorList;
				var orgMap = data.orgMap;
				
				$.each(collectorList,function(i,result){ 
					var newRow='<tr><td><input type="checkbox" name="checkCollector" class="checkallBatchCollector" value='+result['collector']+'></td><td>'+result['collectorName']+'</td><td>'+result['orgName']+'</td><td>'+result['monthRemainingPrincipal']+'</td><td>'+result['monthCaseCount']+'</td><td>'+result['currentRemainingPrincipal']+'</td><td>'+result['currentCaseCount']+'</td></tr>';  
				    $('#batchCollectors').append(newRow);
				});
				$('#do_batch_alloc').modal('show');
			}
			
		});		
		
	}
	
	//手动分配提交按钮
	$("#submaruBtn").click(function(){
		var rule = $('input[name="assignRule"]:checked').val();
		if(rule.length==0){
			MSG.alert("请选择分配规则 ！");
			return false;
		}
		var status = $('#status').val();
		var checkedCollector = "";
		var checkedCollectorCount = 0;
		var checkedPaymentIds = "";
		$(".cases").each(function(){
		    if(this.checked){
		    	var val = $(this).val();
		    	var elements = val.split("|");
		    	checkedPaymentIds+=elements[0]+",";
			}
		});
		$(".checkCollector").each(function(){
		    if(this.checked){
		    	checkedCollectorCount++;
		    	checkedCollector+=$(this).val()+",";
			}
		}); 
		if(checkedCollectorCount<=0){
			MSG.alert("请至少选择一个催收员！");
			return false;
		}
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/caseManagement/caseAlloc?"+new Date().toTimeString(),
			type:"post",
			data:{"paymentIds":checkedPaymentIds,"collectors":checkedCollector,"mode":"maru","assignRule":rule,"status":status},
			dataType: "json",
			success:function(data){
				 $('#do_alloc').modal('hide');
				//alert(data.message);
				if(data.success){
			        table.search($("#searchForm").serialize()).draw();
				}else{
					MSG.alert("分配失败 !");
				}
			}
		});
		
	});
	//代理分配提交按钮
	$("#subagentBtn").click(function(){
		var agentDateStart = $("#agentDateStart").val();
		var agentDateEnd = $("#agentDateEnd").val();
		if(agentDateStart.length<1||agentDateEnd<1){
			MSG.alert("请选择代理分配的日期！");
			return false;
		}
		var checkedCollector = "";
		var checkedCollectorCount = 0;
		var checkedPaymentIds = "";
		$(".cases").each(function(){
		    if(this.checked){
		    	var val = $(this).val();
		    	var elements = val.split("|");
		    	checkedPaymentIds+=elements[0]+",";
			}
		});
		$(".checkAgent").each(function(){
		    if(this.checked){
		    	checkedCollectorCount++;
		    	checkedCollector+=$(this).val()+",";
			}
		}); 
		if(checkedCollectorCount<=0){
			MSG.alert("请至少选择一个催收员！");
			return false;
		}
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/caseManagement/caseAlloc?"+new Date().toTimeString(),
			type:"post",
			data:{"paymentIds":checkedPaymentIds,"collectors":checkedCollector,"mode":"agent","agentDateStart":agentDateStart,"agentDateEnd":agentDateEnd},
			dataType: "json",
			success:function(data){
				$('#do_alloc').modal('hide');
				if(data.success){
			        table.search($("#searchForm").serialize()).draw();
				}else{
					MSG.alert("分配失败 !");
				}
			}
		});
	});
	
	//批量分配 
	$('#batchBtn').click(function(){
		var data = $("#searchForm").serialize();
	//	var rule = $('input[name="assignRule"]:checked').val();
		var checkedCollector = "";
		var checkedCollectorCount = 0;
		$(".checkallBatchCollector").each(function(){
		    if(this.checked){
		    	checkedCollectorCount++;
		    	checkedCollector+=$(this).val()+",";
			}
		}); 
		if(checkedCollectorCount<=0){
			MSG.alert("请至少选择一个催收员！");
			return false;
		}
		$(this).attr("disabled","disabled");
		var d = data+"&collectors="+checkedCollector;
	 	$.ajax({
			url:"<%=request.getContextPath()%>/rest/caseManagement/caseBatchAlloc?"+new Date().toTimeString(),
			type:"post",
			data:d,
			dataType: "json",
			success:function(data){
				 $('#do_batch_alloc').modal('hide');
				 $(this).attr("disabled",false);
				if(data.success){
					MSG.show(data.message);
			        table.search($("#searchForm").serialize()).draw();
			        
				}else{
					MSG.alert("分配失败 !");
				}
			}
		}); 
		
	});
	
	//导出按钮
	$('#exportBtn').click(function(){
		var url = "<%=request.getContextPath()%>/rest/caseManagement/exportExcel?"+new Date().toTimeString();
		$('#searchForm').attr('action', url);
		$('#searchForm').attr('method', "post");
		$('#searchForm').attr('target', "_black");
	    $('#searchForm').submit();		
	});
	
	
    //页面跳转控制
    function personClick(e) {
        var url = e.href;
        if (url != null && url != 'javascript:;') {
            $.get(url+"&date="+new Date().toTimeString(), function(data) {
                $(".sub-menu li").removeClass('title_active');
                $('#main-content').html(data);
            });
        }
        return false;
    }
    
  //查找催收员按钮
    $('#collectorSearchBtn').on('click', function (){
        getUserEmpOrg(1);
        $("#collectorSearchModal").modal("show");
    });

  //所属机构change事件
    $("#orgId").change(function(){
        getUserEmpOrg(2,$(this).val());
    });
  
  //获取机构和催收员
    function getUserEmpOrg(type,orgId){
    	var status = $('#status').val(); 
    	if(status.length>0){
    		 $.ajax({
    	            type : 'POST',
    	            dataType : "json",
    	            url : "<%=request.getContextPath()%>/rest/org/getUserEmpOrgByStatus?"+new Date().toTimeString(),
    	            data : {type:type,orgId:orgId,"status":status},
    	            success : function(data) {
    	                var userEmpOrgList = data.userEmpOrgList;
    	                var orgMap = data.orgMap;
    	                if(userEmpOrgList){
    	                    var $collectorTBody = $("#collectorTBody");
    	                    var bodyHtml = "";
    	                    for(var i = 0; i < userEmpOrgList.length; i++){
    	                        bodyHtml += "<tr><td><input type='radio' name='checkCollector' class='checkCollector_' value='"+ userEmpOrgList[i].userId +"'></td><td><span>" + userEmpOrgList[i].userName + "</span></td><td>" + userEmpOrgList[i].orgName + "</td></tr>";
    	                    }
    	                    $collectorTBody.html(bodyHtml);
    	                }

    	                if(type == 1 && orgMap){
    	                    var $orgId = $("#orgId");
    	                    var orgHtml = "<option value=''>全部</option>";
    	                    for (var key in orgMap) {
    	                        if(orgMap.hasOwnProperty(key)) {
    	                            orgHtml += "<option value='" + key + "'>" + orgMap[key] + "</option>"
    	                        }
    	                    }
    	                    $orgId.html(orgHtml);
    	                }
    	            },
    	            error:function(){
    	                MSG.show("获取催收员机构信息失败");
    	            }
    	        });
    	}
       
    }
  
 //确定催收员按钮
    $('#collectorAddBtn').on('click', function (){
        var collector_ = $('.checkCollector_').filter(':checked').val();
        var collectorName = $('.checkCollector_').filter(':checked').parent().next().text();
        if(!collector_){
            MSG.show('请选择一个催收员');
            return;
        }
     //   $("#collector").val(collector);
        $("#collectorName").val(collectorName);
        $("#collectorSearchModal").modal("hide");
    });

    //清除催收员按钮
    $('#collectorClearBtn').on('click', function (){
      //  $("#collector").val('');
        $("#collectorName").val('');
        $("#collectorSearchModal").modal("hide");
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
        	status:	{
        		required: true
        	},
        	docno:{
                idCard: true
            },
            overDaysFrom:{
            	posiviteNum:true
            },
            overDaysTo:{
            	posiviteNum:true,
            	comparaToFrom:true
            	
            }
        },
        messages: {
        	status: {
                required: "请选择所属区间 "
            } 
        }
    });
}

  	//设置模态框垂直居中函数
    function centerModals(){
        $('.modalBox').each(function(i){
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
