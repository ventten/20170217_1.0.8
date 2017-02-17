<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外访审核</title>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">外访审核</h3>
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
			 <label for="cntrctNo" class="right-space-1">合同编号 </label>
	         <input type="text" id="cntrctNo"  name="cntrctNo" class="right-space collection"/>
	         <label for="custName" class="right-space-1">&nbsp;主&nbsp;贷&nbsp;人 </label>
	         <input type="text" id="custName" name="custName" class="right-space collection"/>
	         <label for="docno" class="right-space-1 line-bottom">身份证号 </label>
	         <input type="text" id="docno"  name="docno" class="right-space collection" data-placement="bottom"/><span style="color:red" id="idCardError"></span>
	         <br/>
	         <label for="auditeStatus" class="right-space-1"> 审核状态 </label>
		     <select id="auditeStatus" name="auditeStatus" class="right-space collection">
		      	<option value="">全部</option>
		      	<option value="Submitted" selected>待审核</option>
		      	<option value="Audited">已审核</option>
		      	<option value="AuditRefused">审核失败</option>
		     </select>
	        
	         <label for="orgId" class="right-space-1">所属机构</label>
	         <select id="orgId" name="orgId" class="right-space collection">
	        	<option value="">全部</option>
	            <c:forEach items="${outVisitOrgList}" var="item">
	                <option value="${item.id}">${item.orgName}</option>
	            </c:forEach>   
	         </select>
	         <label for="endDateMin" class="right-space-1 line-bottom">申请日期 </label>
	         <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'submitDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'submitDateEnd\',{d:-15})}',onpicked:pickedFunc_1,oncleared:clearedFunc})" id="submitDateStart" name="submitDateStart">      	
             <label class="label-center-1">至</label>
             <input size="10" type="text" class="collection-number"  readonly onFocus="picker2rule(this,submitDateStart)" id="submitDateEnd" name="submitDateEnd">                	
             <br/>
             <shiro:hasPermission name="outVisitAudit:select">
             <button type="button" class="btn btn-primary right-space-2" id="searchBtn">查询</button>
             </shiro:hasPermission>
             <shiro:hasPermission name="outVisitAudit:audit">
             <button type="button" class="btn btn-primary right-space-2" id="auditedBtn">审核通过</button>
             <button type="button" class="btn btn-primary right-space-2" id="auditRefusedBtn">审核不通过</button>
             </shiro:hasPermission>
             <button type="reset" class="btn btn-default right-space-2" >清除</button>
        </form>
    </div>
</div>

<!-- 审核拒绝窗口 -->
<div class="modal fade hideModal" id="outVisitAuditRefusedModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">外访审核拒绝</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="outVisitAuditRefusedForm">
                     <div class="form-group">
					    <label for="name" class="col-sm-3 control-label" ><span style="color:red">*</span>外访审核拒绝原因</label>
					   	<div class="col-sm-6">
					    <textarea class="form-control" rows="3" id="auditRefusedReason" name="auditRefusedReason"></textarea>
					    </div>
					 </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="auditRefusedReasonBtn">
                   	 确定
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 返回
                </button>
            </div>
        </div>
    </div>
</div>
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr>
	    	<th><input type="checkbox" id="checkall" title="Select all" />&nbsp;&nbsp;全选  </th>
	    	<th>合同编号</th>
	        <th>主贷人</th>
	        <th>提交人</th>
	        <th>所属机构</th>
	     	<th>申请日期</th>
	        <th>签约网点</th>
	        <th>贷款金额</th>
	        <th>客户类型</th>
	        <th>剩余本金/保证金</th>
	        <th>逾期天数</th>
	        <th>审核状态</th>
	        <th>审核日期</th>
	        <th>历史外访申请次数</th>
	        <th>历史审核通过次数</th>
	        <th>备注</th> 
	    </tr>
    </thead>
</table>
<script type="text/javascript">

//分页Table
var table;

//Table初始化方法
function init(){
	
	 table = $('#dataTable').DataTable({
         "scrollY": '369px',
         "scrollX":'100%',
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
         "sAjaxSource" : "<%=request.getContextPath()%>/rest/outVisitAudit/pageOutVisitAuditData",
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
					var auditStatus = row.auditStatus;
					if(auditStatus=="Submitted"){
				    	return  "<input type='checkbox' name='outVisitCases' class='outVisitCases' value="+row.id+"></input>&nbsp;&nbsp;<span>"+(row.rowNo)+"</span>"; 	
					}else{
				    	return  "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>"+(row.rowNo)+"</span>"; 	
				
					}
				}},
				{"mData" : "cntrctNo","sDefaultContent" : ""},
				{"mData" : "custName","sDefaultContent" : ""},
				{"mData" : "submitBy","sDefaultContent" : ""},
				{"mData" : "submitOrgName","sDefaultContent" : ""},
				{"mData" : "submitDate","sDefaultContent" : ""},
				{"mData" : "siteName","sDefaultContent" : ""},
				{"mData" : "loanAmt","sDefaultContent" : ""},
				{"mData" : "custTypeName","sDefaultContent" : ""},
				{"mData" : "remainingPrincipal","sDefaultContent" : ""},
				{"mData" : "overDays","sDefaultContent" : ""},
				{"mData" : "auditStatusName","sDefaultContent" : ""},
				{"mData" : "auditDate","sDefaultContent" : ""},
				{"mData" : "submitdNum","sDefaultContent" : ""},
				{"mData" : "auditedNum","sDefaultContent" : ""},
				{"mData" : "remark","sDefaultContent" : ""}
            
         ],
         "aoColumnDefs":[
              {"bSortable":false,"aTargets":[0]}
          ]
     });
	
	
	
	
	
    <%-- table = P.dataTable($('#dataTable'),
            $("#searchForm"),
            "<%=request.getContextPath()%>/rest/outVisitAudit/pageOutVisitAuditData",
            [
                {"mData" :  function(row, type, set, meta) { 
                	var auditStatus = row.auditStatus;
                	if(auditStatus=="Submitted"){
    	            	return  "<input type='checkbox' name='outVisitCases' class='outVisitCases' value="+row.id+"></input>&nbsp;&nbsp;<span>"+(row.rowNo)+"</span>"; 	
                	}else{
    	            	return  "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>"+(row.rowNo)+"</span>"; 	

                	}
	            }},
	            {"mData" : "cntrctNo","sDefaultContent" : ""},
	            {"mData" : "custName","sDefaultContent" : ""},
	            {"mData" : "submitBy","sDefaultContent" : ""},
	            {"mData" : "submitOrgName","sDefaultContent" : ""},
	            {"mData" : "submitDate","sDefaultContent" : ""},
	            {"mData" : "siteName","sDefaultContent" : ""},
	            {"mData" : "loanAmt","sDefaultContent" : ""},
	            {"mData" : "custTypeName","sDefaultContent" : ""},
	            {"mData" : "remainingPrincipal","sDefaultContent" : ""},
	            {"mData" : "overDays","sDefaultContent" : ""},
	            {"mData" : "auditStatusName","sDefaultContent" : ""},
	            {"mData" : "auditDate","sDefaultContent" : ""},
	            {"mData" : "submitdNum","sDefaultContent" : ""},
	            {"mData" : "auditedNum","sDefaultContent" : ""},
	            {"mData" : "remark","sDefaultContent" : ""},
            ],
            10,$('#checkall')
    );
 --%>
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
//审核通过
$('#auditedBtn').click(function(){
	updateAuditedStatus("Audited");
});
//审核不通过
$('#auditRefusedBtn').click(function(){
	P.resetModal('outVisitAuditRefusedForm');
	updateAuditedStatus("AuditRefused");
});

function updateAuditedStatus(result){
	var checkedCount = 0;
	var ids = new Array();
	var i =0;
	$(".outVisitCases").each(function(){
	    if(this.checked){
	    	checkedCount++;
	    	ids[i] = $(this).val();
	    	i++;
		}
	}); 
	if(checkedCount==0){
		MSG.alert("请至少选择一条未审核的案件 ");
		return false;
	}else{
		if(result=="Audited"){
			$.ajax({
				url:"<%=request.getContextPath()%>/rest/outVisitAudit/updateOutVisitAuditedStatus?ids="+ids+"&date="+new Date().toTimeString(),
				type:"post",
				data:{"handelResult":result},
				dataType: "json",
				success:function(data){
					MSG.alert(data.message);
				    table.search($("#searchForm").serialize()).draw();
					
				}
			});	
		}else if(result=="AuditRefused"){
			$('#outVisitAuditRefusedModal').modal('show');
			
		}
	}

}
//确定审核不通过
$('#auditRefusedReasonBtn').click(function(){
	var auditRefusedReason = $('#auditRefusedReason').val();
	if(auditRefusedReason.length==0){
		MSG.alert("请填写审核不通过的原因 !");
		return false;
	}else{
		var ids = new Array();
		var i =0;
		$(".outVisitCases").each(function(){
		    if(this.checked){
		    	ids[i] = $(this).val();
		    	i++;
			}
		}); 
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitAudit/updateOutVisitAuditedStatus?ids="+ids+"&date="+new Date().toTimeString(),
			type:"post",
			data:{"handelResult":"AuditRefused","auditRefusedReason":auditRefusedReason},
			dataType: "json",
			success:function(data){
				$('#outVisitAuditRefusedModal').modal('hide');
				MSG.alert(data.message);
			    table.search($("#searchForm").serialize()).draw();
			}
		});	
		
		
	}
});

//表单校验
function outVisitAudit_searchForm_validate($validateForm){
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
//第二个输入框最大值的全局变量  
//第一个输入框选择好日期的时候操作  
function pickedFunc_1(ele){  
var Y=$dp.cal.getP('y'); //用内置方法获取到选中的年月日  
var M=$dp.cal.getP('M');  
var D=$dp.cal.getP('d');  
M=parseInt(M,10)-1;  
D=parseInt(D,10)+15;//字符串的数字转换成int再运算。并且如果超过30天，也能自动处理。  
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

$(document).ready(function() {
	init();
	outVisitAudit_searchForm_validate($('#searchForm'));
});


</script>