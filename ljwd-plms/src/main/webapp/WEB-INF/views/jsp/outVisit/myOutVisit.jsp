<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>    

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的外访</title>
<style>
	#myOutVisit-dataTable tr td{
		white-space: nowrap; 
	}
	.dataTables_scrollBody tbody tr td{
	    padding: 1px 10px !important;
	}
	table.dataTable thead th{
		padding:5px 20px;
	}
</style>
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">我的外访</h3>
    </div>
    <div class="panel-body">
        <div>
            <form id="searchForm">
                <label class="right-space-1 label-widthsbig">客户类型</label>
                <select class="right-space collection" name="custType">
                    <option value="">全部</option>
                    <c:forEach items="${custTypeList}" var="item">
                	<option value="${item.key}">${item.value}</option>
            		</c:forEach> 
                </select>
				<label for="applyNo" class="right-space-1">申请编号 </label>
	         	<input type="text" id="applyNo"  name="applyNo" class="right-space collection"/>


 				<label class="right-space-1">合同编号</label>
                <input class="right-space collection input-border" name="cntrctNo">
                
                <label class="right-space-1 label-widthshort line-bottom">主&nbsp;贷&nbsp;人</label>
                <input class="right-space collection input-border" name="custName">
                <br/>
                
                <label class="right-space-1 label-widthsbig">身份证号</label>
                <input class="right-space collection input-border" name="docno">
                
                <label class="right-space-1">案件状态</label>
                <select class="right-space collection" name="status">
                    <option value="">全部</option>
                    <option value="DOING" selected>处理中</option>
                    <option value="Visited">已外访</option>
                    <option value="NoVisit">已取消</option>
                    <!-- <option value="Closed">手工结案</option>
                    <option value="Overdued">已过期</option>
                    <option value="Settle">已结清</option>
                    <option value="Normal">已正常</option>
                    <option value="Outsourced">已外包</option> -->
                    
                </select>

                <label class="right-space-1">外访类型</label>
                <select class="right-space collection" name="visitType">
                    <option value="">全部</option>
                    <option value="2">协催</option>
  		            <option value="1">考察</option>
                </select>

                <label class="right-space-1 line-bottom">分配日期</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'assignDateEnd\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'assignDateEnd\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" id="assignDateStart" name="assignDateStart">
                <label class="label-center-1">至</label>
                <input size="10" type="text"  class="collection-number" readonly onFocus="picker2rule(this,assignDateStart)" id="assignDateEnd" name="assignDateEnd">
                
                <br/>
                
                <label class="right-space-1 label-widthsbig line-bottom">是否创建计划</label>
                <select class="right-space collection" name="isSetUp">
                    <option value="">全部</option>
                    <option value="1">已创建</option>
  		            <option value="0">未创建</option>
                </select>
                
                <br/>
               	<shiro:hasPermission name="myOutVisit:select">
                <button type="button" class="btn btn-primary right-space-2" id="myOutVisit-searchBtn">查询</button>&nbsp;
                </shiro:hasPermission>
                <shiro:hasPermission name="myOutVisit:addOutVisitPlan">
                <input class="btn btn-primary right-space-2" type="button" value="新增外访计划" data-toggle="modal" id="myOutVisit-addPlanBtn" />
                </shiro:hasPermission>
                <shiro:hasPermission name="myOutVisit:submitDelay">
                <button type="button" class="btn btn-primary right-space-2" id="myOutVisit-delayBtn">申请延期</button>
                </shiro:hasPermission>
                <button type="reset" class="btn btn-default">清除</button>
            </form>
        </div>
    </div>
</div>

 <!--新增外访计划窗口-->
 <jsp:include page="detail_modal/myOutVisitAddModal.jsp"/>
 <!-- 延期申请窗口 -->
 <div class="modal fade hideModal" id="outVisitDelayModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:450px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">申请延期</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outVisitdelaySubmitForm">
                
                	<input type="hidden" id="infoIds"/>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">延期时间</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="delayDuration" id= "delayDuration" readonly>
                                    <option value="weekend">一周</option>
                            </select>
                        </div>
                    </div>

                     <div class="form-group">
					    <label class="col-sm-4 control-label">延期原因</label>
					   	<div class="col-sm-6">
					        <textarea  rows="3" id="delayReason" name="delayReason" style="height:60px;width:184px;max-width:184px"></textarea>
					    </div>
					    <span id="delayReasonError" style="color:red"></span>
					   
					 </div>
                </form>
            </div>

            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitDelaySubmitBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
 

<table id="myOutVisit-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center"><input type="checkBox" id="checkall" title="checked"/>全选</th>
        <th class="text-center">操作</th>
        <th class="text-center">分配日期</th>
        <th class="text-center">预计结案日期</th>
        <th class="text-center">外访类型</th>
        <th class="text-center">客户类型</th>
        <th class="text-center">案件状态</th>
        <th class="text-center">是否创建计划</th>
        <th class="text-center">申请编号</th>
        <th class="text-center">合同编号</th>
        <th class="text-center">主贷人</th>
        <th class="text-center">户籍地址</th>
       	<th class="text-center">住宅地址</th>
        <th class="text-center">单位地址</th>
        <th class="text-center">分配时逾期天数</th>
        <th class="text-center">当前逾期天数</th>
        <th class="text-center">计划外访次数</th>
        <th class="text-center">完成外访次数</th>
        <th class="text-center">历史外访次数</th>
        <th class="text-center">案件类型</th>
        
       </tr>
    </thead>
    <tbody id="myOutVisit-dataTable-tbody">
    </tbody>
</table>
</body>

<script type="text/javascript">




//Table初始化方法
function init(){
    <%-- table = P.dataTable($('#myOutVisit-dataTable'),
            $("#searchForm"),
            "<%=request.getContextPath()%>/rest/myOutVisit/pageMyOutVisitData",
            [
                {"mData" :  function(row, type, set, meta) { 
	            	return  "<input type='checkBox' name='outVisitCases' class='outVisitCases' value="+row.applId+","+row.id+","+row.casetype+","+row.status+","+row.expectCloseTime+"></input>&nbsp;&nbsp;<span>"+(row.rowNo)+"&nbsp;&nbsp;</span>"; 
	            }},
		        {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<a target='_blank' class='visitInfo_my' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + ">催记</a>&nbsp;&nbsp;<a target='_blank' class='visitInfo_my' href=<%=request.getContextPath()%>/rest/outVisitPlan/outVisitDetail?applId=" + oData.applId + "&infoId=" + oData.id + ">计划</a>&nbsp;&nbsp;");
                    }
                },
		        {"mData" : "assignDate","sDefaultContent" : ""},
		        {"mData" : "expectCloseTime","sDefaultContent" : ""},
		        {"mData" : "visitType","sDefaultContent" : ""},
		        {"mData" : "custType","sDefaultContent" : ""},
		        {"mData" : "statusVal","sDefaultContent" : ""},
		        {"mData" : "applyNo","sDefaultContent" : ""},
		        {"mData" : "cntrctNo","sDefaultContent" : ""},
		        {"mData" : "custName","sDefaultContent" : ""},
		        {"mData" : "overdueDay","sDefaultContent" : ""},
		        {"mData" : "overdueDayNow","sDefaultContent" : ""},
		        {"mData" : "planNum","sDefaultContent" : ""},
		        {"mData" : "finishNum","sDefaultContent" : ""},
		        {"mData" : "historyNum","sDefaultContent" : ""},
		        {"mData" : "casetypeName","sDefaultContent" : ""}
		     ],
            10,$('#checkall')
    ); --%>
}    

//滚动条事件
$(document).ready(function(){
	table_myOutVisit();
});
var table_myOutVisit;
function table_myOutVisit(){
	table_myOutVisit = $('#myOutVisit-dataTable').DataTable({
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
      "bProcessing": false,       //加载数据时显示正在加载信息
      "bServerSide": true,        //指定从服务器端获取数据
      "sAjaxSource" : "<%=request.getContextPath()%>/rest/myOutVisit/pageMyOutVisitData?"+new Date().toTimeString(),
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
            	return  "<input type='checkBox' name='outVisitCases' class='outVisitCases' value="+row.applId+","+row.id+","+row.casetype+","+row.status+","+row.expectCloseTime+"></input>&nbsp;&nbsp;<span>"+(row.rowNo)+"&nbsp;&nbsp;</span>"; 
            }},
	        {"mData" : null,"sDefaultContent" : "",
                   "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                       $(nTd).html("<a target='_blank' class='visitInfo_my' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + ">催记</a>&nbsp;&nbsp;<a target='_blank' class='visitInfo_my' href=<%=request.getContextPath()%>/rest/outVisitPlan/outVisitDetail?applId=" + oData.applId + "&infoId=" + oData.id + ">计划</a>&nbsp;&nbsp;");
                   }
               },
	        {"mData" : "assignDate","sDefaultContent" : ""},
	        {"mData" : "expectCloseTime","sDefaultContent" : ""},
	        {"mData" : "visitType","sDefaultContent" : ""},
	        {"mData" : "custType","sDefaultContent" : ""},
	        {"mData" : "statusVal","sDefaultContent" : ""},
	        {"mData" : "isSetUp","sDefaultContent" : ""},
	        {"mData" : "applyNo","sDefaultContent" : ""},
	        {"mData" : "cntrctNo","sDefaultContent" : ""},
	        {"mData" : "custName","sDefaultContent" : ""},
	        {"mData" : "registerAddr","sDefaultContent" : ""},
	        {"mData" : "houseAddr","sDefaultContent" : ""},
	        {"mData" : "companyAddr","sDefaultContent" : ""}, 
	        {"mData" : "overdueDay","sDefaultContent" : ""},
	        {"mData" : "overdueDayNow","sDefaultContent" : ""},
	        {"mData" : "planNum","sDefaultContent" : ""},
	        {"mData" : "finishNum","sDefaultContent" : ""},
	        {"mData" : "historyNum","sDefaultContent" : ""},
	        {"mData" : "casetypeName","sDefaultContent" : ""}
      ],
      "aoColumnDefs":[                               //设定各列宽度   
	          {"sWidth": "50px","aTargets": [0]},   
	          {"sWidth": "80px","aTargets": [1]},   
	          {"sWidth": "130px","aTargets": [2]},
	          {"sWidth": "130px","aTargets": [3]},   
	          {"sWidth": "100px","aTargets": [4]},
	          {"sWidth": "90px","aTargets": [5]},   
	          {"sWidth": "90px","aTargets": [6]},
	          {"sWidth": "90px","aTargets": [7]},
	          {"sWidth": "180px","aTargets": [8]},
	          {"sWidth": "160px","aTargets": [9]},   
	          {"sWidth": "60px","aTargets": [10]},
	          {"sWidth": "180px","aTargets": [11]},
	          {"sWidth": "180px","aTargets": [12]},
	          {"sWidth": "180px","aTargets": [13]}, 
	          {"sWidth": "110px","aTargets": [14]},   
	          {"sWidth": "110px","aTargets": [15]},
	          {"sWidth": "110px","aTargets": [16]},   
	          {"sWidth": "110px","aTargets": [17]},
	          {"sWidth": "110px","aTargets": [18]},   
	          {"sWidth": "110px","aTargets": [19]},
	          {"bSortable":false,"aTargets":[0,1]}
       ],
                       
  });
	

}

$('#myOutVisit-searchBtn').click(function(){
	if (!$("#searchForm").valid()){
        return false;
    }
	table_myOutVisit.search($("#searchForm").serialize()).draw();
});
//新增外访计划 
$('#myOutVisit-addPlanBtn').click(function(){
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

//申请延期弹出框 
 $('#myOutVisit-delayBtn').click(function(){
	 P.resetModal('outVisitdelaySubmitForm');
	 $('#delayReasonError').html("");
	var checkeds = $("input[name='outVisitCases']:checked");
	var len = checkeds.length;
	var infoIds = "";
	if(len==0){
		MSG.alert("请至少选择一条案件");
		return false;
	}else{
		var flag = true;
		for(var i=0;i<len;i++){
			var checkedDom = checkeds[i].value;
			var checked = checkedDom.split(",");
			if(checked[2]==null||checked[2]=="undefined"){
				flag = false;
				MSG.alert("案件类型不为新增案件或延期案件！不可再提交申请");
				return false;
			}else if(checked[2]=="CASE_DELAYING"){
				flag = false;
				MSG.alert("案件正在审核中！不可再提交申请");
				return false;
			}else if(checked[4]==null||checked[4]=="undefined"){
				flag = false;
				MSG.alert("无效预计结案日期！不可再提交申请");
				return false;
			}
			infoIds+=checked[1]+",";
		}
		if(flag){
			$('#infoIds').val(infoIds);
			$('#outVisitDelayModal').modal('show');
		}

	}
	
	
}); 

//延期提交
$('#outVisitDelaySubmitBtn').click(function(){
	var checkeds = $("input[name='outVisitCases']:checked");
	var delayDuration = $('#delayDuration').val();
	var delayReason = $('#delayReason').val();
	if(delayReason.length==0){
		$('#delayReasonError').html("请填写延期原因");
		return false;
	}
	var infoIds = $('#infoIds').val();		
	$.ajax({
		url:"<%=request.getContextPath()%>/rest/outVisitDelay/submitDelay?date="+new Date().toTimeString(),
		type:"post",
		data:{"infoIdStrs":infoIds,"delayDuration":delayDuration,"delayReason":delayReason},
		dataType: "json",
		success:function(data){
			$('#outVisitDelayModal').modal('hide');
			MSG.show(data.message);
			table_myOutVisit.search($("#searchForm").serialize()).draw();
		}

	});
	
});

$('#delayReason').blur(function(){
	if($(this).val()!=""){
		$('#delayReasonError').html("");	
	}
});
//案件全选
$('#checkall').click(function(){
	if($(this).get(0).checked==true){
		$(".outVisitCases").attr("checked", true);
	}else{
		$(".outVisitCases").attr("checked", false);
	}
});

//表单校验
function myOutVisit_searchForm_validate($validateForm){
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
			table_myOutVisit.search($("#searchForm").serialize()).draw();
			MSG.show(data.message);
		}
		
	});	
	
});

$(document).ready(function() {
	myOutVisit_searchForm_validate($('#searchForm'));
	/* init(); */
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

//点击催记链接存储localStorage值
$('#myOutVisit-dataTable').on('click','.visitInfo_my',function(){
	 var classVal=$(this).attr('class');
	 //console.log(classVal);
	 //使用localStorage存值	
	 window.localStorage.setItem("getVal",classVal);
})
</script>
