<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外访计划</title>
<style>
    .dataTables_scrollBody tbody tr td{
	    padding: 2px 10px !important;
	}
</style>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">外访计划</h3>
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
                
                
			      <label for="outVisiter" class="right-space-1">外访人员 </label>
		          <span class="search_box">
		             <input type="text" id="outVisiterName" name="outVisiterName" class="search_input" <c:if test="${userName !=null }">  readonly  value=${userName} </c:if>/>
	         		 <shiro:hasPermission name="outVisitPlan:selectAll">
	         		 <div class="search_ionic input-group-addon" id="outVisiterSearchBtn">
	           			<i class="glyphicon glyphicon-search"></i>
	           		 </div>
	           		 </shiro:hasPermission>
		          </span>
			      
			      &nbsp;&nbsp;&nbsp;&nbsp;
                <label class="right-space-1">计划状态</label>
                <select class="right-space collection" name="planStatus">
                    <option value="">全部</option>
                    <option value="Start">计划中</option>
                    <option value="End">已外访</option>
                    <option value="Cancel">已取消</option>
                </select>
                
               
                
                <label class="right-space-1 line-bottom">计划日期</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'planDateEnd\')}',minDate:'#F{$dp.$D(\'planDateEnd\',{d:-31})}',onpicked:pickedFunc_02,oncleared:clearedFunc})" id="planDateStart" name="planDateStart">      	
                	<label class="label-center-1">至</label>
                <input size="10" type="text" class="collection-number" readonly onFocus="picker2rule(this,planDateStart)" id="planDateEnd" name="planDateEnd">
                
                <br/>
                <label class="right-space-1">分配日期</label>
                <input size="10" type="text" class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'assignDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'assignDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="assignDateStart" name="assignDateStart">      	
                <label class="label-center-1">至</label>
                <input size="10" type="text" class="collection-number right-space" readonly onFocus="picker2rule(this,assignDateStart)" id="assignDateEnd" name="assignDateEnd">                	
                
                <label class="right-space-1">外访类型</label>
                <select class="right-space collection" name="visitType">
                    <option value="">全部</option>
                    <option value="2">协催</option>
  		            <option value="1">考察</option>
                </select>
                
                <label class="right-space-1 label-widthshort">主&nbsp;贷&nbsp;人</label>
                <input class="right-space collection input-border" name="custName">
				
 				<label class="right-space-1 line-bottom">合同编号</label>
                <input class="right-space collection input-border" name="cntrctNo">
                
               	<br/>
                <label class="right-space-1 line-bottom">身份证号</label>
                <input class="right-space collection input-border" name="docno">
                
             	<br/>
                <shiro:hasPermission name="outVisitPlan:select,outVisitPlan:selectAll">
                <button type="button" class="btn btn-primary right-space-2" id="allOutVisitPlan-searchBtn">查询</button>&nbsp;
                </shiro:hasPermission>
               
               	<button type="reset" class="btn btn-default" >清除</button>
               
            </form>
        </div>
    </div>
</div>

<jsp:include page="detail_modal/outVisitUserModal.jsp"></jsp:include>

<table id="allOutVisitPlan-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr class="tableHead">
	    	<th class="text-center tableHead">序号</th>
	    	<th class="text-center tableHead">外访计划编号</th>
	    	<th class="text-center tableHead">外访计划日期</th>
	    	<th class="text-center tableHead">外访类型</th>
	        <th class="text-center tableHead">主贷人</th>
	        <th class="text-center tableHead">地址类型</th>
	        <th class="text-center tableHead">外访人员</th>
	        <th class="text-center tableHead">计划状态</th>
	     	<th class="text-center tableHead">地址有效性</th>
	        <th class="text-center tableHead">跟进结果</th>
	        <th class="text-center tableHead">预计结案日期</th>
	        <th class="text-center tableHead">操作</th>
	    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="12">没有检索到数据</td>
		</tr>
    </tbody>
</table>
<script type="text/javascript">

<%-- var allOutVisitPlan_table;

function allOutVisitPlanInit(){
 	allOutVisitPlan_table = P.dataTable($('#allOutVisitPlan-dataTable'),
             $("#searchForm"),
             "<%=request.getContextPath()%>/rest/allOutVisitPlan/pageAllOIutVisitPlanData",
             [
                 {"mData" :  function(row, type, set, meta) { 
		            	return  "&nbsp;&nbsp;"+"<span>"+row.rowNo+"</span>"; 
		            }},
		            {"mData" : "planCode","sDefaultContent" : ""},
		            {"mData" : "planStartTime","sDefaultContent" : ""},
		            {"mData" : "visitType","sDefaultContent" : ""},
		            {"mData" : "custName","sDefaultContent" : ""},
		            {"mData" : "addressType","sDefaultContent" : ""},
		            {"mData" : "outVisiterName","sDefaultContent" : ""},
		            {"mData" : "planStatusName","sDefaultContent" : ""},
		            {"mData" : "addressValidity","sDefaultContent" : ""},
		            {"mData" : "followupResults","sDefaultContent" : ""},
		            {"mData" : "expectCloseTime","sDefaultContent" : ""},
		            {"mData" : null,"sDefaultContent" : "",
		                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
		                	<shiro:hasPermission name='outVisitPlan:selectDetail'>
		                    $(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/allOutVisitPlan/outVisitPlanDetail?planId="+oData.planId+"&applId=" + oData.applId +"&infoId=" + oData.infoId + ">详情</a>&nbsp;&nbsp;");
		                    </shiro:hasPermission>
		                }
		            }
             ]
     );
} --%>
//滚动条事件
var table_OutVisitPlanInit;
 function table_OutVisitPlanInit(){
	 table_OutVisitPlanInit=$('#allOutVisitPlan-dataTable').DataTable({
       "scrollY": '349px',
       "scrollX": '100%',
       "sScrollXInner": "100%",
       "bScrollCollapse": true,

       "sPaginationType": "full_numbers",      //设置分页控件的模式
       "bLengthChange": false,                 //改变每页显示数据数量
       "bPaginate": true,                      //是否翻页功能
       "bFilter": false,                       //是否过滤功能
       "bInfo": true,                         //是否页脚信息
       "bSort": true,                            //是否排序功能

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
       "sAjaxSource" : "<%=request.getContextPath()%>/rest/allOutVisitPlan/pageAllOIutVisitPlanData",
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
				return  "&nbsp;&nbsp;"+"<span>"+row.rowNo+"</span>"; 
			}},
			{"mData" : "planCode","sDefaultContent" : ""},
			{"mData" : "planStartTime","sDefaultContent" : ""},
			{"mData" : "visitType","sDefaultContent" : ""},
			{"mData" : "custName","sDefaultContent" : ""},
			{"mData" : "addressType","sDefaultContent" : ""},
			{"mData" : "outVisiterName","sDefaultContent" : ""},
			{"mData" : "planStatusName","sDefaultContent" : ""},
			{"mData" : "addressValidity","sDefaultContent" : ""},
			{"mData" : "followupResults","sDefaultContent" : ""},
			{"mData" : "expectCloseTime","sDefaultContent" : ""},
			{"mData" : null,"sDefaultContent" : "",
			    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
			    	<shiro:hasPermission name='outVisitPlan:selectDetail'>
			        $(nTd).html("<a target='_blank' href=<%=request.getContextPath()%>/rest/allOutVisitPlan/outVisitPlanDetail?planId="+oData.planId+"&applId=" + oData.applId +"&infoId=" + oData.infoId + ">详情</a>&nbsp;&nbsp;");
			        </shiro:hasPermission>
			    }
			}
       ],
       "aoColumnDefs":[                               //设定各列宽度   
            {"sWidth": "50px","aTargets": [0]},   
            {"sWidth": "150px","aTargets": [1]},   
            {"sWidth": "150px","aTargets": [2]},
            {"sWidth": "80px","aTargets": [3]},   
            {"sWidth": "70px","aTargets": [4]},
            {"sWidth": "80px","aTargets": [5]},   
            {"sWidth": "80px","aTargets": [6]},
            {"sWidth": "80px","aTargets": [7]},
            {"sWidth": "90px","aTargets": [8]},   
            {"sWidth": "80px","aTargets": [9]},
            {"sWidth": "150px","aTargets": [10]},
            {"sWidth": "50px","aTargets": [11]} ,
            {"bSortable":false,"aTargets":[0,11]}
        ]
   });
  

 }

//查询按钮
$('#allOutVisitPlan-searchBtn').click(function(){
	if (!$("#searchForm").valid()){
        return false;
    }
	var $this = $(this);
   if($this.hasClass("hasInit")){
	   table_OutVisitPlanInit.search($('#searchForm').serialize()).draw();
   }else{
       $this.addClass("hasInit");
       table_OutVisitPlanInit();
   }
	
	
	
	
});

//外访员查找
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
   //  $("#outVisiter_hidden").val(collector);
     $("#outVisiterName").val(collectorName);
     $("#outVisitUserSearchModal").modal("hide");
});
//查找外访员清除按钮 
$('#outVisitUserClearBtn').click(function(){
//	 $("#outVisiter_hidden").val('');
     $("#outVisiterName").val('');
     $("#outVisitUserSearchModal").modal("hide");
});



//表单校验
function outVisitPlan_searchForm_validate($validateForm){
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
	outVisitPlan_searchForm_validate($('#searchForm'));
	/* allOutVisitPlanInit(); */
	//table_OutVisitPlanInit();
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
