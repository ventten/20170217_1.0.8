<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提前移交</title>
</head>
<div class="panel panel-default">
   <div class="panel-heading">
      <h3 class="panel-title">
         	提前移交
      </h3>
   </div>
   <div class="panel-body">
     <form id="searchForm">
     <input type="hidden" name="scope" value="${scope}">
    	<label for="transfertype">移&nbsp;&nbsp;交&nbsp;&nbsp;类&nbsp;&nbsp;型&nbsp;&nbsp;</label>
        <select id="transfertype" name="transfertype" class="right-space collection">
        	<option value="all">全部</option>
            <c:forEach items="${typeList}" var="item">
                <option value="${item.code}">${item.val}</option>
            </c:forEach>   
        </select>
        
        <label for="status" class="right-space-1">状态 </label>
        <select id="status" name="status" class="right-space collection">
        	<option value="all">全部</option>
            <c:forEach items="${statusMap}" var="item">
                <option value="${item.key}">${item.value}</option>
            </c:forEach>
        </select>
        
        <label for="custName" class="right-space-1">主贷人 </label>
        <input type="text" id="custName" name="custName" class="right-space collection"/>
        
        <label for="cntrctNo" class="right-space-1 line-bottom">合同编号 </label>
        <input type="text" id="cntrctNo" style="width:180px" name="cntrctNo"/>
      	<br/>
      	
      	<label for="applyDate" class="right-space-1 line-bottom">移交申请日期</label>
      	<input size="10" type="text"  readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'applyDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'applyDateEnd\',{d:-31})}',onpicked:pickedFunc_1,oncleared:clearedFunc})" class="collection-number" id="applyDateStart" name="applyDateStart">      	
		<label class="label-center-1">至</label>
		<input size="10" type="text"  readonly onFocus="picker2rule(this,applyDateStart)" class="collection-number" id="applyDateEnd" name="applyDateEnd">                	
		
        <br/>
        	 <shiro:hasPermission name="transferAdvanceCase:select">
             <button type="button" class="btn btn-primary right-space-2" id="searchBtn">查询</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="transferAdvanceCase:audit">
             <button type="button" class="btn btn-primary right-space-2" id="auditPassBtn">审核通过</button>
             <button type="button" class="btn btn-primary right-space-2" id="auditRejectBtn">审核拒绝</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="transferAdvanceCase:approved">
             <button type="button" class="btn btn-primary right-space-2" id="approvedPassBtn">审批通过</button>
             <button type="button" class="btn btn-primary right-space-2" id="approvedRejectBtn">审批拒绝</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="transferAdvanceCase:alloc">
             <button type="button" class="btn btn-primary right-space-2" id="allocBtn">分配</button>
             </shiro:hasPermission>
             <button type="reset" class="btn btn-default" >清除</button>
             
	</form>
   </div>
</div>

<div>
<table id="transfer_dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th><input type="checkbox" id="checkall" title="全选" />&nbsp;&nbsp;全选 </th>
        <th>合同编号</th>
        <th>主贷人</th>
        <th>贷款金额</th>
        <th>逾期天数</th>
        <th>移交类型</th>
        <th>移交原因</th>
        <th>申请人</th>
        <th>所属区间</th>
        <th>申请日期</th>
        <th>状态</th>
        <th>拒绝原因</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="13">没有检索到数据</td>
		</tr>
    </tbody>
</table>
</div>
<jsp:include page="detail_model/transferRefuseReason.jsp"></jsp:include>
<!-- 批量分配 -->
<div class="modal fade" id="do_alloc" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content" >
		 <div class="modal-header">
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="do_allocTitle">
				手工分配           
			</h4>
         </div>
			<div class="modal-body">
				<div class="tab-content">
		        	<div style="margin: 15px;padding: 15px;border: 1px solid #e4e4e4;">
		        	待分配案件数：<span id="count" style="color: red;"></span>件<br/><br>
		        	催收员：<c:forEach items="${collectors}" var="coll">
		        			<input type="checkbox" name="collectors" class="checkedCollector" value="${coll.collector }"> ${coll.collectorName} &nbsp;
		        		 </c:forEach>
	         		 </div>
	         			<button type="button" class="btn btn-default" id="alloc_Btn">分配</button>		
	         			<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>			
		        </div>
	        </div>
		</div>
	</div>
</div>

<script type="text/javascript" language="javascript">
  <%-- var table = P.dataTable($('#transfer_dataTable'),
	        $("#searchForm"),
	        "<%=request.getContextPath()%>/rest/transferAdvance/pageTransferCaseData?"+new Date().toTimeString(),
	        [
		        {"mData" :  function(row, type, set, meta) { 
		        	return  "</span><input type='checkbox' name='transferCases' class='transferCases' value="+row.id+"|"+row.status+"></input>&nbsp;&nbsp;"+"<span>"+row.rowNo+"</span>"; 
		        }},
		        {"mData" : "cntrctNo","sDefaultContent" : ""},
		        {"mData" : "custName","sDefaultContent" : ""},
		        {"mData" : "loanAmt","sDefaultContent" : ""},
		        {"mData" : "overdueDays","sDefaultContent" : ""},
		        {"mData" : "transfertype","sDefaultContent" : ""},
		        {"mData" : "transferreason","sDefaultContent" : ""},
		        {"mData" : "applicant","sDefaultContent" : ""},
		        {"mData" : "circuStatusName","sDefaultContent" : ""},
		        {"mData" : "applydate","sDefaultContent" : ""},
		        {"mData" : "status","sDefaultContent" : ""},
		        {"mData" : "refusalReason","sDefaultContent" : ""},
		        {"mData" : "paymentId","sDefaultContent" : "",
	                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<a target='_blank' class='transferAdvance' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + '>催记</a>&nbsp;&nbsp;');
	                }
	            }
		    ]

	); --%>
	var table ;
	//初始化table
	function transfer_init(){
		table = $('#transfer_dataTable').DataTable({
             "scrollY": '364px',
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/transferAdvance/pageTransferCaseData?"+new Date().toTimeString(),
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
			        	return  "</span><input type='checkbox' name='transferCases' class='transferCases' value="+row.id+"|"+row.status+"></input>&nbsp;&nbsp;"+"<span>"+row.rowNo+"</span>"; 
			        }},
			        {"mData" : "cntrctNo","sDefaultContent" : ""},
			        {"mData" : "custName","sDefaultContent" : ""},
			        {"mData" : "loanAmt","sDefaultContent" : ""},
			        {"mData" : "overdueDays","sDefaultContent" : ""},
			        {"mData" : "transfertype","sDefaultContent" : ""},
			        {"mData" : "transferreason","sDefaultContent" : ""},
			        {"mData" : "applicant","sDefaultContent" : ""},
			        {"mData" : "circuStatusName","sDefaultContent" : ""},
			        {"mData" : "applydate","sDefaultContent" : ""},
			        {"mData" : "status","sDefaultContent" : ""},
			        {"mData" : "refusalReason","sDefaultContent" : ""},
			        {"mData" : "paymentId","sDefaultContent" : "",
		                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                        $(nTd).html("<a target='_blank' class='transferAdvance' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + '>催记</a>&nbsp;&nbsp;');
		                }
		            }
             ]
         });
       }
  //案件全选
  $('#checkall').click(function(){
  	if($(this).get(0).checked==true){
  		$(".transferCases").attr("checked", true);
  	}else{
  		$(".transferCases").attr("checked", false);
  	}
  });
  //查询按钮
  $('#searchBtn').click(function(){
	  /* if(checkApplyDate()){
	  } */
	  //table.search($("#searchForm").serialize()).draw();
	  
	  var $this = $(this);
      if($this.hasClass("hasInit")){
    	  table.search($("#searchForm").serialize()).draw();
      }else{
          $this.addClass("hasInit");
          transfer_init();
      }
  });
  
  
  	/* function toDateT(str){
	    var sd=str.split("-");
	    return new Date(sd[0],sd[1],sd[2]);
	}

    function addDate(date,days){ 
        var d=new Date(date); 
        d.setDate(d.getDate()+days); 
        var m=d.getMonth()+1; 
        return d.getFullYear()+'-'+m+'-'+d.getDate(); 
     } 
  //日期比较 
  function checkApplyDate(){
	  var applyDateStart = $('#applyDateStart').val();
	  var applyDateEnd = $('#applyDateEnd').val();
	  if(applyDateStart==""&&applyDateEnd==""){
		  return true;
	  }else if((applyDateStart==""&&applyDateEnd!="")||(applyDateStart!=""&&applyDateEnd=="")){
		  MSG.alert("请选择正确的移交申请日期");
		  return false;
	  }else{
		  var startDate = toDateT(applyDateStart);
		  var endDate = toDateT(applyDateEnd);
		  var maxDate = toDateT(addDate(applyDateStart,15));
		 if(startDate>endDate){
			 MSG.alert("截止日期应大于等于起始日期");
			 return false;
		 }else if(maxDate<endDate){
			 MSG.alert("移交申请日期范围为15天");
			 return false;
		 }else{
			 return true;
		 }
		  
	  }
	 
  }
   */
 //第二个输入框最大值的全局变量  
   //第一个输入框选择好日期的时候操作  
   function pickedFunc_1(ele){  
   var Y=$dp.cal.getP('y'); //用内置方法获取到选中的年月日  
   var M=$dp.cal.getP('M');  
   var D=$dp.cal.getP('d');  
   M=parseInt(M,10)-1;  
   D=parseInt(D,10)+14;//字符串的数字转换成int再运算。并且如果超过15天，也能自动处理。  
   var d = new Date()  
   d.setFullYear(Y,M,D) //设置时间  
   var nowDate=new Date(); 
   if(nowDate<=d){ //现在的时间比较，如果算出来的值大于现在时间，修改全局变量md为现在时间。  
       md=nowDate;  
   }else{ //全局变量设置为算出来的值得   
        var month=d.getMonth()+1; //月份的范围是（0到11）;  
       md=d.getFullYear()+"-"+month+"-"+d.getDate(); //直接把d给过去会有问题，所以拼成字符串发过去  
   }  
}
  
  //审核通过
  $('#auditPassBtn').click(function(){
	  getTransferCases("auditPass");
  });
  //审核拒绝 
  $('#auditRejectBtn').click(function(){
	  var count = 0;
	  var checkedCount =0;
	  $(".transferCases").each(function(){
		    if(this.checked){
		  	   		checkedCount++;
		    		if($(this).val().indexOf("待审核") != -1){
		    	    	checkedCount++;
		    		}else{
		    			MSG.alert("请选择待审核的案件");
		    			count++;
		    			return false;
		    		}	
			}
		});
	  if(checkedCount==0){
		  MSG.alert("请至少选择一条案件");
		  return false;  
	  }
	  if(count>0){
		  MSG.alert("请选择待审核的案件");
		  return false;
	  }
	  $('#refuseType').val('auditReject');
	  $('#transferRefuseReasonModal').modal('show');

  });
  //审批通过 
  $('#approvedPassBtn').click(function(){
	  getTransferCases("approvedPass");
  });
  //审批拒绝 
  $('#approvedRejectBtn').click(function(){
	  var count = 0;
	  var checkedCount =0;
	  $(".transferCases").each(function(){
		    if(this.checked){
		    		checkedCount++;
		    		if($(this).val().indexOf("待审批") != -1){
		    	    	
		    		}else{
		    			MSG.alert("请选择待审批的案件");
		    			count++;
		    			return false;
		    		}	
			}
		});
	  if(checkedCount==0){
		  MSG.alert("请至少选择一条案件");
		  return false;
	  }
	  if(count>0){
		  MSG.alert("请选择待审批的案件");
		  return false;
	  }
	  $('#refuseType').val('approvedReject');
	  $('#transferRefuseReasonModal').modal('show');

  });
  
  //拒绝
  $('#transferRefuseReasonBtn').click(function(){
	  var refuseType = $('#refuseType').val();
	  var refusalReason =  $('#refusalReason').val();
	  if(refusalReason.length==0){
		  $('.checkMessage').html("请填写拒绝原因");
		  return false;
	  }
	  getTransferCases(refuseType);

  });
  //弹出模态框
  $('#allocBtn').click(function(){
	  //检验是否选中正确的案件,
	  checkAllocCase();
  });
  //分配
  $('#alloc_Btn').click(function(){
	  var checkedIds = "";
	  var checkedCollector = "";
	//被选中案件
	  $(".transferCases").each(function(){
		    if(this.checked){
		    		if($(this).val().indexOf("待分配") != -1){
		    	    	checkedIds+=$(this).val().split("|")[0]+",";
		    		}
			}
		}); 
	//被选中催收员
	$('.checkedCollector').each(function(){
		if(this.checked){
			checkedCollector+=$(this).val()+",";
		}	
	});
	
	$.ajax({
		url:"<%=request.getContextPath()%>/rest/transferAdvance/transferCaseAlloc?"+new Date().toTimeString(),
		type:"post",
		data:{"ids":checkedIds,"checkedCollector":checkedCollector},
		dataType: "json",
		success:function(data){
			 $('#do_alloc').modal('hide');
			 MSG.show(data.message);
			if(data.success){
		        table.search($("#searchForm").serialize()).draw();
			}else{
				MSG.alert("处理失败 !");
			}
		}

	});
  });
  
 //检验是否选中正确的案件
  function checkAllocCase(){
	  var checkedCount = 0;
	  var flag = "Y";
	  $(".transferCases").each(function(){
		    if(this.checked){
		    		if($(this).val().indexOf("待分配") != -1){
		    	    	checkedCount++;
		    		}else{
		    			MSG.alert("请选择待分配的案件");
		    			flag = "N";
		    			return false;
		    		}	
			}
		});
	  if(checkedCount==0||flag=="N"){
			if(flag=="Y"){
				MSG.alert("请选择正确的操作案件 ");
			}
			return false;
	  }else{
		  $('#count').html(checkedCount);
		  $('#do_alloc').modal('show');

	  }
	  
  }


 
 //获取选中的案件
  function getTransferCases(action){
	var checkedCount = 0;
	var refusalReason =  $('#refusalReason').val();
	var checkedIds = "";
	var flag = "Y";
	$(".transferCases").each(function(){
	    if(this.checked){
	    	if(action=="auditPass"||action=="auditReject"){
	    		if($(this).val().indexOf("待审核") != -1){
	    	    	checkedCount++;
	    	    	checkedIds+=$(this).val().split("|")[0]+",";
	    		}else{
	    			MSG.alert("请选择待审核的案件");
	    			flag = "N";
	    			return false;
	    		}
	    	}else if(action=="approvedPass"||action=="approvedReject"){
				if($(this).val().indexOf("待审批") !=-1){
	    	    	checkedCount++;
	    	    	checkedIds+=$(this).val().split("|")[0]+",";
	    		}else{
	    			MSG.alert("请选择待审批的案件");
	    			flag = "N";
	    			return false;

	    		}
	    	}
		}
	}); 
	if(checkedCount==0||flag=="N"){
		if(flag=="Y"){
			MSG.alert("请选择正确的操作案件 ");
		}
		return false;
	}else{
		/* var allocData = checkedIds.split(",");
		var ids = "";
		for(var i=0;i<allocData.length;i++){
			var element = allocData[i].split("|");
			ids+=element[0]+",";
		} */
	 	$.ajax({
				url:"<%=request.getContextPath()%>/rest/transferAdvance/transferCaseHandel?"+new Date().toTimeString(),
				type:"post",
				data:{"ids":checkedIds,"handelResult":action,"refusalReason":refusalReason},
				dataType: "json",
				success:function(data){
					  $('#transferRefuseReasonModal').modal('hide');
					if(data.success){					
				        table.search($("#searchForm").serialize()).draw();
					}else{
						MSG.alert("处理失败 !");
					}
				}
	
			});
		}
  }
  
	//点击催记链接存储localStorage值
	$('#transfer_dataTable').on('click','.transferAdvance',function(){
		 var classVal=$(this).attr('class');
		 //使用localStorage存值	
		 window.localStorage.setItem("getVal",classVal);
	})
</script>
