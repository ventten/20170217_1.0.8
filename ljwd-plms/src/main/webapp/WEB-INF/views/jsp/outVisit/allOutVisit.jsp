<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    
<style>
    .dataTables_scrollBody tbody tr td{
	    padding: 1px 10px !important;
	}
	table.dataTable thead th{
		padding:5px 20px;
	}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全部外访</title>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">全部外访</h3>
    </div>
    <div class="panel-body">
        <div>
            <form id="searchForm">
                <label class="right-space-1">所属城市</label>
                <select class="right-space collection" name="areaId">
                    <option value="">全部</option>
                    <c:forEach items="${areaList}" var="item">
                	<option value="${item.id}">${item.areaName}</option>
            		</c:forEach> 
                </select>
                
                <label class="right-space-1">客户类型</label>
                <select class="right-space collection" name="custType">
                    <option value="">全部</option>
                    <c:forEach items="${custTypeList}" var="item">
                	<option value="${item.key}">${item.value}</option>
            		</c:forEach> 
                </select>
                
                <label class="right-space-1">案件状态</label>
                <select class="right-space collection" name="status">
                    <option value="">全部</option>
                    <option value="DOING" selected>处理中</option>
                    <option value="Visited">已外访</option>
                    <option value="NoVisit">已取消</option>
                    <option value="Closed">手工结案</option>
                    <option value="Overdued">已过期</option>
                    <option value="Settle">已结清</option>
                    <option value="Normal">已正常</option>
                    <option value="Outsourced">已外包</option>
                </select>
                 
           		<label for="outVisiter" class="right-space-1 line-bottom">外访人员 </label>
		        <span class="search_box">
		             <input type="text" id="outVisiterName" name="outVisiterName" class="search_input" <c:if test="${userName !=null }">  readonly  value=${userName} </c:if>/>
	         		 <shiro:hasPermission name="allOutVisit:selectAll">
	         		 <div class="search_ionic input-group-addon" id="outVisiterSearchBtn">
	           			<i class="glyphicon glyphicon-search"></i>
	           		 </div>
	           		 </shiro:hasPermission>
		         </span>
	         	<br/>
	             <label class="right-space-1">分配日期</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'assignDateEnd\')||\'%y-%M-%d\'}'})" id="assignDateStart" name="assignDateStart">
                	<label class="label-center-1">至</label>
                <input size="10" type="text"  class="collection-number right-space" readonly onFocus="WdatePicker({minDate:'#F{$dp.$D(\'assignDateStart\')}',maxDate:'%y-%M-%d'})" id="assignDateEnd" name="assignDateEnd">             	
                
                <label class="right-space-1">外访类型</label>
                <select class="right-space collection" name="visitType">
                    <option value="">全部</option>
                    <option value="2">协催</option>
  		            <option value="1">考察</option>
                </select>
				
				<label for="applyNo" class="right-space-1">申请编号 </label>
	         	<input type="text" id="applyNo"  name="applyNo" class="right-space collection"/>

 				<label class="right-space-1 line-bottom">合同编号</label>
                <input class="right-space collection input-border" name="cntrctNo">
                <br/>
                
                <label class="right-space-1 label-widthshort">主&nbsp;贷&nbsp;人</label>
                <input class="right-space collection input-border" name="custName">
               
                <label class="right-space-1 line-bottom">身份证号</label>
                <input class="right-space collection input-border" name="docno">
                
              <!--   <input type="checkBox" id="isOfferReplyFail" name="isOfferReplyFail" value="Y"/>
            	<label for="isOfferReplyFail">当天扣款失败客户</label> -->
            	
				<br/>
               	<shiro:hasPermission name="allOutVisit:select,allOutVisit:selectAll">
                <button type="button" class="btn btn-primary right-space-2" id="allOutVisit-searchBtn">查询</button>&nbsp;
                </shiro:hasPermission>
                <shiro:hasPermission name="allOutVisit:closed">
                <button type="button" class="btn btn-primary right-space-2" id="allOutVisit-closedBtn">结案</button>
                </shiro:hasPermission>
                <shiro:hasPermission name="allOutVisit:addOutVisitPlan">
                <input class="btn btn-primary right-space-2" type="button" value="新增外访计划" data-toggle="modal" id="allOutVisit-addPlanBtn" />
                </shiro:hasPermission>
                <shiro:hasPermission name="allOutVisit:export">
                <button type="button" class="btn btn-primary right-space-2" id="allOutVisit-exportBtn">导出</button>
                </shiro:hasPermission>
                <button type="reset" class="btn btn-default">清除</button>
<!--                 <button type="reset" class="btn btn-default" id="cancelBtn">清除</button>
 -->            </form>
        </div>
    </div>
</div>


<table id="allOutVisit-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr class="tableHead">
	    	<th class="text-center tableHead"><input type="checkbox" id="checkAllBtn" title="Select all" />&nbsp;&nbsp;全选  </th>
	    	<th class="text-center tableHead">操&nbsp;&nbsp;作</th>
	    	<th class="text-center tableHead">外访人员</th>
	    	<th class="text-center tableHead">申请编号</th>
	        <th class="text-center tableHead">分配日期</th>
	        <th class="text-center tableHead">预计结案时间</th>
	        <th class="text-center tableHead">外访类型</th>
	        <th class="text-center tableHead">客户类型</th>
	     	<th class="text-center tableHead">案件状态</th>
	        <th class="text-center tableHead">合同编号</th>
	        <th class="text-center tableHead">主贷人</th>
	        <th class="text-center tableHead">身份证号</th>
	        <th class="text-center tableHead">贷款金额</th>
	        <th class="text-center tableHead">剩余本金/保证金</th>
	        <th class="text-center tableHead">分配时逾期天数</th>
	        <th class="text-center tableHead">当前逾期天数</th>
	        <th class="text-center tableHead">计划外访次数</th>
	        <th class="text-center tableHead">完成外访次数</th>
	        <th class="text-center tableHead">历史外访次数</th>
	        <th class="text-center tableHead">户籍地址外访次数</th> 
      	    <th class="text-center tableHead">住宅地址外访次数</th> 
      	    <th class="text-center tableHead">单位地址外访次数</th> 
      	    <th class="text-center tableHead">提交人</th> 	        
	    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="23">没有检索到数据</td>
		</tr>
    </tbody>
</table>

<jsp:include page="detail_modal/outVisitUserModal.jsp"></jsp:include>
<jsp:include page="detail_modal/outVisitClosedModel.jsp"></jsp:include>
<jsp:include page="detail_modal/myOutVisitAddModal.jsp"></jsp:include>

<script type="text/javascript">

//分页Table
var allOutVisit_table;

//Table初始化方法
 //Table初始化方法
    function allOutVisit_table_init(){
    	allOutVisit_table = $('#allOutVisit-dataTable').DataTable({
            "scrollY": '379px',
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/allOutVisit/pageAllOutVisitData?"+new Date().toTimeString(),
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
					return  "<input type='checkBox' name='outVisitCases' class='outVisitCases' value="+row.applId+","+row.id+","+row.casetype+","+row.status+"></input>&nbsp;&nbsp;<span>"+(row.rowNo)+"&nbsp;&nbsp;</span>"; 
				}},
				{"mData" : null,"sDefaultContent" : "",
				    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
				        $(nTd).html("<a target='_blank' class='visitInfo' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + ">催记</a>");
				    }
				}, 
				{"mData" : "outVisitUserName","sDefaultContent" : ""},
				{"mData" : "applyNo","sDefaultContent" : ""},
				/* {"mData" : "areaName","sDefaultContent" : ""}, */
                {"mData" : "assignDate","sDefaultContent" : ""},
                {"mData" : "expectCloseTime","sDefaultContent" : ""},
                {"mData" : "visitType","sDefaultContent" : ""},
                {"mData" : "custType","sDefaultContent" : ""},
                {"mData" : "statusVal","sDefaultContent" : ""},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "loanAmt","sDefaultContent" : ""},
                {"mData" : "remainingPrincipal","sDefaultContent" : ""},
                {"mData" : "overdueDay","sDefaultContent" : ""},
                {"mData" : "overdueDayNow","sDefaultContent" : ""},
                {"mData" : "planNum","sDefaultContent" : ""},
                {"mData" : "finishNum","sDefaultContent" : ""},
                {"mData" : "historyNum","sDefaultContent" : ""},
                {"mData" : "registerOverNum","sDefaultContent" : ""},
                {"mData" : "houseOverNum","sDefaultContent" : ""},
                {"mData" : "companyOverNum","sDefaultContent" : ""},
                {"mData" : "userName","sDefaultContent" : ""}
            ],
            "aoColumnDefs":[
                            {"bSortable":false,"aTargets":[0,1]}
                        ]
        });
    }

//查询按钮 
$('#allOutVisit-searchBtn').click(function(){
	if (!$("#searchForm").valid()){
         return false;
     }
	var $this = $(this);
    if($this.hasClass("hasInit")){
   	 allOutVisit_table.search($('#searchForm').serialize()).draw();
    }else{
        $this.addClass("hasInit");
        allOutVisit_table_init();
    }

});


//全选按钮 
$('#checkAllBtn').click(function(){
  	if($(this).get(0).checked==true){
  		$(".outVisitCases").attr("checked", true);
  	}else{
  		$(".outVisitCases").attr("checked", false);
  	}
 });


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



//结案弹出框
$('#allOutVisit-closedBtn').click(function(){
	P.resetModal('colsedForm');
	  var checkedCount = 0;
	  var errFlag = true;
	//被选中案件
	  $(".outVisitCases").each(function(){
		    if(this.checked){
		    	var status = $(this).val();
		    	if(status.indexOf("Closed") != -1||status.indexOf("Overdued") != -1||status.indexOf("Settle") != -1||status.indexOf("Outsourced") != -1||status.indexOf("Normal") != -1){
		    		MSG.alert("选择外访申请记录中,存在手动结案,已结清,已过期,已外包或者已正常数据,请重新选择!");
		    		errFlag = false;
		    		return false;
	    		}else{
		    		checkedCount++;
	    		}		    	 
			}
		}); 
	
	 if(checkedCount==0){
 			MSG.alert("选择外访申请记录中,存在手动结案,已结清,已过期,已外包或者已正常数据,请重新选择!");
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
		    	var arr = $(this).val().split(',');
		    	checkArray[i] = arr[1];
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
				allOutVisit_table.search($("#searchForm").serialize()).draw();
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


//新增外访计划 
$('#allOutVisit-addPlanBtn').click(function(){
	P.resetModal('addressForm');
	P.resetModal('addOutVisitPlanForm');
	var applId_info = $("input[name='outVisitCases']:checked");
	if(applId_info.length!=1){
		MSG.alert("新增外访计划时只能选择一条案件，请重新选择");
		return false;
	}else{
		var applId_infoId = applId_info.val();
		var ids = applId_infoId.split(",");
		var status = ids[3];
	    if(status.indexOf("Closed") != -1||status.indexOf("Overdued") != -1||status.indexOf("Settle") != -1||status.indexOf("Outsourced") != -1||status.indexOf("Normal") != -1){
			MSG.alert("选择外访申请记录中,存在手动结案,已结清,已过期,已外包或者已正常数据,请重新选择!");
			return false;
		}else{
			var applId = ids[0];
			var infoId = ids[1];
		  $.ajax({
				url:"<%=request.getContextPath()%>/rest/myOutVisit/searchMyOutVisitPlanCode?"+new Date().toTimeString(),
				type:"post",
				data:{"infoId":infoId},
				dataType: "json",
				success:function(data){
					//console.info(data);
					var planCode = data.planCode;
					var outVisitUserList = data.outVisitUserList;
					$('#planCode').val(planCode);
					var userList = $('#userList');
					var orgHtml="";
					if(outVisitUserList.length!=0){
						for(var i=0;i<outVisitUserList.length;i++){
							orgHtml +="<input type='checkbox' name='assistBy' class='assistBy' value='" + outVisitUserList[i].userId + "'>" +'<span class="left-space-2">'+outVisitUserList[i].userName+'</span>'
						}
						userList.html(orgHtml);
					}else{
						userList.html("此区域没有其他外访员");
					}
				
				}

			});
		  $('#add_applId').val(applId);
		  $('#add_infoId').val(infoId);
		  $('#clCustIdByApplId').val(applId);
		  addrInit();	
	}

}
		
		
		
	
}); 

//表单校验
function allOutVisit_searchForm_validate($validateForm){
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

//导出按钮
$('#allOutVisit-exportBtn').click(function(){
	var url = "<%=request.getContextPath()%>/rest/allOutVisit/exportExcel?"+new Date().toTimeString();
	$('#searchForm').attr('action', url);
	$('#searchForm').attr('method', "post");
	$('#searchForm').attr('target', "_black");
    $('#searchForm').submit();		
});

//保存外访计划 
$('#addOutVisitPlanBtn').click(function(){

	 var data = $('#addOutVisitPlanForm').serialize();
	$.ajax({
		url:"<%=request.getContextPath()%>/rest/myOutVisit/add_MyOutVisitPlan?"+new Date().toTimeString(),
		type:"post",
		data:data,
		dataType: "json",
		success:function(data){
			$('#myOutVisitAddModal').modal('hide');
			allOutVisit_table.search($("#searchForm").serialize()).draw();
			MSG.show(data.message);
		}
		
	});	
	
});





	$(document).ready(function() {
		// allOutVisit_table_init();
		allOutVisit_searchForm_validate($('#searchForm'));
	

});
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

//点击催记链接存储localStorage值
$('#allOutVisit-dataTable').on('click','.visitInfo',function(){
	 var classVal=$(this).attr('class');
	 //console.log(classVal);
	 //使用localStorage存值	
	 window.localStorage.setItem("getVal",classVal);
})

</script>
