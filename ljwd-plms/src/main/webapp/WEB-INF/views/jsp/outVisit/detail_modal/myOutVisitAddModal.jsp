<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<div class="modal fade hideModal" id="myOutVisitAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">新增外访计划</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">
            
            <div id="hidden" align="center" style="display:'none'">
            	<form id="addressForm">
            		<input type="hidden" id="clCustIdByApplId" name="clCustIdByApplId">
            	</form>
            </div>

                <form class="form-horizontal" id="addOutVisitPlanForm" style="padding-bottom:20px;">
                	<input type="hidden" name = "applId" id="add_applId">
                	<input type="hidden" name = "infoId" id="add_infoId">
                    <div class="form-group">
                        <label class="col-sm-3 control-label">外访计划编号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control collection" name="planCode" id="planCode" readonly>
                            </div>                    
                    </div>

                     <div class="form-group">
					    <label class="col-sm-3 control-label">外访计划日期</label>
					   	<div class="col-sm-6">
					   		<input size="16" type="text" class="collection" readonly onFocus="WdatePicker({minDate:'%y-%M-%d'})" id="planStartTime" name="planStartTime">
					    </div>
					 </div>
					 
					  <div class="form-group">
					    <label class="col-sm-3 control-label">陪同人</label>
					   	<span class="col-sm-6" id ="userList">
						
					    </span>
					 </div>
					 
					 <div class="form-group">
					    <label class="col-sm-3 control-label"></label>
						<div class="col-sm-6">
					    <button class="btn btn-primary" type="button" class="btn blue" id="addOutVisitPlanBtn">
                      		  保存计划
                    	</button>
                    	<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                       			 返回
                    	</button>
                    	</div>
					 </div>
					 
					  <table id="addOutVisitPlan-dataTable" class="display dataTable" cellspacing="0" width="100%">
					        <thead>
					        <tr>
					            <th class="text-center">序号</th>
					            <th class="text-center">地址类型</th>
					            <th class="text-center">详细地址</th>
					        </tr>
					        </thead>
					    </table>
                </form>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
//分页Table
var addrtable;

//Table初始化方法
function addrInit(){
	
	addrtable = $('#addOutVisitPlan-dataTable').DataTable({
        "sScrollXInner": "100%",
        "bScrollCollapse": true,

        "sPaginationType": "full_numbers",      //设置分页控件的模式
        "bLengthChange": false,                 //改变每页显示数据数量
        "bPaginate": true,                      //是否翻页功能
        "bFilter": false,                       //是否过滤功能
        "bInfo": true,            			    //是否页脚信息
        "bSort": false,					        //是否排序功能

        "bAutoWidth": false,                    //是否自动宽度
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
        "sAjaxSource" :  "<%=request.getContextPath()%>/rest/myOutVisit/pageCollectionAddressData",
        "fnServerData" : function(sSource, aoData, fnCallback) {
            //参数拼接
            var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#addressForm").serialize();
            $.ajax({
                "type" : 'POST',
                "dataType" : "json",
                "url" : sSource,
                "data" : data,
                "success" : function(resp) {
                    fnCallback(resp);
                    $('#myOutVisitAddModal').modal('show');
                },
                "error":function(jqXHR,textStatus,errorThrown){
                    MSG.show("获取数据发生异常");
                }
            });
        },
        //dataTable显示
        "aoColumns" : [
              {"mData" :  function(row, type, set, meta) { 
	            	return  "<input type='radio' name='addr'  value="+row.addrType+","+row.addr+"></input>&nbsp;&nbsp;"+"<span>"+row.rowNo+"</span>"; 
	            }},
	          {"mData" : "addrTypeVal","sDefaultContent" : ""},
	          {"mData" : null,"sDefaultContent" : "",
	                "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
	                	nTd.title=oData.addr;
	                	if(oData!=null&&oData.addr!=null){
	                		var addr = oData.addr;
	                		if(addr.length>30){
	                			$(nTd).html(addr.substring(0,30)+"....");
	                		}else{
	                			$(nTd).html(oData.addr);
	                		}
	                	}
	                	
	                }
	         }
        ]
    });
}    

</script>
