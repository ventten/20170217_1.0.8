<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外访延期</title>

<style>
     .dataTables_scrollBody tbody tr td{
	    padding: 2px 10px !important;
	}
</style>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">外访延期</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">
			  <label for="area" class="right-space-1 label-widthslarge"> 所属城市</label>
		      <select id="areaId" name="areaId" class="right-space collection">
		            <option value="">全部</option>
		            <c:forEach items="${areaList}" var="item">
                	<option value="${item.id}">${item.areaName}</option>
            		</c:forEach>        
		      </select>
		      <label for="auditeStatus" class="right-space-1"> 审批状态 </label>
			  <select id="auditeStatus" name="auditeStatus" class="right-space collection">
			      	<option value="">全部</option>
			      	<option value="NOT_APPROVED" selected>待审批</option>
			      	<option value="PASS">审批通过</option>
			      	<option value="REJECT">审批拒绝</option>
			  </select>
			  
			 <label for="delaySubmitBy" class="right-space-1">延期申请人</label>
	         <input type="text" id="delaySubmitBy"  name="delaySubmitBy" class="right-space collection"/> 
			 <label for="cntrctNo" class="right-space-1 line-bottom">合同编号 </label>
	         <input type="text" id="cntrctNo"  name="cntrctNo" class="right-space collection"/>
	         <br/>
	         <label for="custName" class="right-space-1 label-widthslarge">&nbsp;主&nbsp;贷&nbsp;人 </label>
	         <input type="text" id="custName" name="custName" class="right-space collection"/>
	         <label for="docno" class="right-space-1">身份证号 </label>
	         <input type="text" id="docno"  name="docno" class="right-space collection"/><span style="color:red" id="idCardError"></span>
                <label for="endDateMin" class="right-space-1 label-widthslarge">审&nbsp;批&nbsp;日&nbsp;期 </label>
             <input size="10" type="text" class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'delayAuditTimeEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'delayAuditTimeEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="delayAuditTimeStart" name="delayAuditTimeStart">      	
             	  <label class="label-center-1">至</label>
             <input size="10" type="text" class="collection-number right-space" readonly onFocus="picker2rule(this,delayAuditTimeStart)" id="delayAuditTimeEnd" name="delayAuditTimeEnd">
	         <label for="endDateMin" class="right-space-1 line-bottom">申请日期 </label>
             <input size="10" type="text" class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'submitDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'submitDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="submitDateStart" name="submitDateStart">      	
             	 <label class="label-center-1">至</label>
             <input size="10" type="text" class="collection-number right-space" readonly onFocus="picker2rule(this,submitDateStart)" id="submitDateEnd" name="submitDateEnd">
             <br/>	 
             <label class="right-space-1 label-widthslarge line-bottom" for="delayTimes" >已延期次数 </label>
	         <input size="16" type="text" id="delayTimesMin" name="delayTimesMin" class="collection-data">
			 <label class="label-center-1">至</label>
	         <input size="16" type="text"  id="delayTimesMax" name="delayTimesMax" class="collection-data">
             <br/>
             <shiro:hasPermission name="outVisitDelay:select">
             <button type="button" class="btn btn-primary right-space-2" id="searchBtn">查询</button>
			 </shiro:hasPermission>
             <shiro:hasPermission name="outVisitDelay:audit">
             <button type="button" class="btn btn-primary right-space-2" id="auditedBtn">审批通过</button>
             <button type="button" class="btn btn-primary right-space-2" id="auditRefusedBtn">审批拒绝</button>
             </shiro:hasPermission>
             <button type="reset" class="btn btn-default right-space-2" >清除</button>
        </form>
    </div>
</div>
<!-- 审批拒绝窗口 -->
<div class="modal fade hideModal" id="outVisitDelayRefusedModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">审核延期</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="outVisitDelayRefusedForm">
                     <div class="form-group">
					    <label for="name" class="col-sm-3 control-label" ><span style="color:red">*</span>拒绝原因</label>
					   	<div class="col-sm-6">
					    <textarea class="form-control" rows="3" id="delayAuditRefuse" name="delayAuditRefuse"></textarea>
					    </div>
					 </div>
                </form>
            </div>

            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="delayAuditRefuseBtn">
                   	 确定
                </button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                   	 返回
                </button>
            </div>
        </div>
    </div>
</div>
<table id="outVisitDelay-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
	    <tr class="tableHead">
	    	<th class="text-center tableHead"><input type="checkbox" id="checkAllBtn" title="Select all" />&nbsp;&nbsp;全选  </th>
	    	<th class="text-center tableHead">所属区域</th>
	    	<th class="text-center tableHead">合同编号</th>
	        <th class="text-center tableHead">主贷人</th>
	        <th class="text-center tableHead">身份证号</th>
	        <th class="text-center tableHead">分配日期</th>
	        <th class="text-center tableHead">当前结案日期</th>
	     	<th class="text-center tableHead">延期申请日期</th>
	        <th class="text-center tableHead">延期申请人</th>
	        <th class="text-center tableHead">延期时长</th>
	        <th class="text-center tableHead">已延期次数</th>
	        <th class="text-center tableHead">完成外访次数</th>
	        <th class="text-center tableHead">最后一次跟进时间</th>
	        <th class="text-center tableHead">审批状态</th>
	        <th class="text-center tableHead">延期审批日期</th>
	        <th class="text-center tableHead">延期审批人</th>
	        <th class="text-center tableHead">延期原因</th>
	        <th class="text-center tableHead">拒绝原因</th>
	        <th class="text-center tableHead">操作</th> 
	    </tr>
    </thead>
    <tbody>
    </tbody>
</table>
<script type="text/javascript">

//分页Table
var outVisitDelay_table;

//Table初始化方法
 //Table初始化方法
    function outVisitDelay_table_init(){
        outVisitDelay_table = $('#outVisitDelay-dataTable').DataTable({
            "scrollY": '500px',
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/outVisitDelay/pageOutVisitDelayData",
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
					var  delayAuditResult = row.delayAuditResult;
					if(delayAuditResult=="NOT_APPROVED"){
	                    return "<input type='checkbox' class='outVisitCases' name='outVisitCases' value=" + row.delayId +","+row.id+","+row.delayAuditResult+"></input>&nbsp;&nbsp;<span>" + (row.rowNo) + "</span>";
					}else{
	                    return "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>" + (row.rowNo) + "</span>";
					}

                }},  
                
                {"mData" : "areaName","sDefaultContent" : ""},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "docno","sDefaultContent" : ""},
                {"mData" : "assignDate","sDefaultContent" : ""},
                {"mData" : "expectCloseTime","sDefaultContent" : ""},
                {"mData" : "delaySubmitTime","sDefaultContent" : ""},
                {"mData" : "delaySubmitName","sDefaultContent" : ""},
                {"mData" : "delayDuration","sDefaultContent" : ""},
                {"mData" : "delayTimes","sDefaultContent" : ""},
                {"mData" : "visitOverNum","sDefaultContent" : ""},
                {"mData" : "lastFollowTime","sDefaultContent" : ""},
                {"mData" : "delayAuditResultName","sDefaultContent" : ""},
                {"mData" : "delayAuditTime","sDefaultContent" : ""},
                {"mData" : "delayAuditName","sDefaultContent" : ""},
                {"mData" : "delayReason","sDefaultContent" : ""},
                {"mData" : "delayAuditRefuse","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<a target='_blank' class='visitInfo_delay' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + ">催记</a>&nbsp;&nbsp;");
                    }
                }
            ],
            "aoColumnDefs":[
                            {"bSortable":false,"aTargets":[0,18]}
                        ]
        });
    }

//查询按钮 
$('#searchBtn').click(function(){
	 if (!$("#searchForm").valid()){
         return false;
     }
	outVisitDelay_table.search($('#searchForm').serialize()).draw();

});
//全选按钮 
$('#checkAllBtn').click(function(){
  	if($(this).get(0).checked==true){
  		$(".outVisitCases").attr("checked", true);
  	}else{
  		$(".outVisitCases").attr("checked", false);
  	}
 });
//审批通过
$('#auditedBtn').click(function(){
	updateAuditedStatus("PASS");
});
//审批不通过
$('#auditRefusedBtn').click(function(){
	P.resetModal('outVisitDelayRefusedForm');
	updateAuditedStatus("REJECT");
});

function updateAuditedStatus(result){
	var checkedCount = 0;
	var delayIds = "";
	var delayDtlIds = "";
	$(".outVisitCases").each(function(){
	    if(this.checked){
	    	checkedCount++;
	    	var ids = $(this).val().split(",");
	    	delayIds +=ids[0]+",";
	    	delayDtlIds +=ids[1]+",";
		}
	}); 
	if(checkedCount==0){
		MSG.alert("请至少选择一条未审批的案件 ");
		return false;
	}else{
		if(result=="PASS"){
			MSG.confirm("确定审批通过 ?",function(){
				$.ajax({
					url:"<%=request.getContextPath()%>/rest/outVisitDelay/updateOutVisitDelayAuditedStatus?date="+new Date().toTimeString(),
					type:"post",
					data:{"delayAuditResult":result,"delayIdsStr":delayIds,"delayDtlIdsStr":delayDtlIds},
					dataType: "json",
					success:function(data){
						MSG.alert(data.message);
						outVisitDelay_table.search($("#searchForm").serialize()).draw();
					}
				});	
			});	
		}else if(result=="REJECT"){
			$('#outVisitDelayRefusedModal').modal('show');
			
		}
	}

}
//确定审核不通过
$('#delayAuditRefuseBtn').click(function(){
	var delayAuditRefuse = $('#delayAuditRefuse').val();
	if(delayAuditRefuse.length==0){
		MSG.alert("请填写审核不通过的原因 !");
		return false;
	}else{
		var delayIds = "";
		var delayDtlIds = "";
		$(".outVisitCases").each(function(){
			var ids = $(this).val().split(",");
	    	delayIds +=ids[0]+",";
	    	delayDtlIds +=ids[1]+",";
		}); 
		$.ajax({
			url:"<%=request.getContextPath()%>/rest/outVisitDelay/updateOutVisitDelayAuditedStatus?date="+new Date().toTimeString(),
			type:"post",
			data:{"delayAuditResult":"REJECT","delayIdsStr":delayIds,"delayDtlIdsStr":delayDtlIds,"delayAuditRefuse":delayAuditRefuse},
			dataType: "json",
			success:function(data){
				$('#outVisitDelayRefusedModal').modal('hide');
				MSG.alert(data.message);
				outVisitDelay_table.search($("#searchForm").serialize()).draw();
			    
			}
		});	
		
		
	}
});

//表单校验
function outVisitDelay_searchForm_validate($validateForm){
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
            },
            delayTimesMin:{
            	upNum:true
            },
            delayTimesMax:{
            	upNum:true
            }
        }
    });
}



	$(document).ready(function() {
		outVisitDelay_table_init();
		outVisitDelay_searchForm_validate($('#searchForm'));
	

});

//点击催记链接存储localStorage值
$('#outVisitDelay-dataTable').on('click','.visitInfo_delay',function(){
	 var classVal=$(this).attr('class');
	 //console.log(classVal);
	 //使用localStorage存值	
	 window.localStorage.setItem("getVal",classVal);
})	

</script>
