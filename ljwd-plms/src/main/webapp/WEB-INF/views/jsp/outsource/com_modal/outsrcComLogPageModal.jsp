<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<style>
	#outsrcComLog-dataTable thead tr th{
		white-space:nowrap;
	}
	#outsrcComLog-dataTable_wrapper .dataTables_scrollHeadInner{
		width: 98% !important;
	}
</style>

<!--查看沟通日志窗口-开始-->
<div class="modal fade hideModal" id="outsrcComLogPageModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:700px;height:350px">
        <div class="modal-content" style="width:700px;height:350px">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">沟通日志</h4>
            </div>
            <form id="outsrcComLog-searchForm">
                <input type="hidden" name="outsrcComId" id="log_outsrcComId"/>
            </form>
            <div class="modal-body">
                <table id="outsrcComLog-dataTable" class="display dataTable" cellspacing="0" width="100%" style="table-layout:fixed">
                    <thead>
                    <tr>
                        <th class="text-center">序号</th>
                        <th class="text-center">维护人</th>
                        <th class="text-center">沟通内容</th>
                        <th class="text-center">维护时间</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>
<!--查看沟通日志窗口-结束-->

<script type="text/javascript" language="javascript">

    var outsrcComLog_table;

    //查看沟通日志
   <%--  function pageOutsrcComLogLog(comId){
        $("#log_outsrcComId").val(comId);
        outsrcComLog_table = P.dataTable($('#outsrcComLog-dataTable'),
                $("#outsrcComLog-searchForm"),
                "<%=request.getContextPath()%>/rest/outsrcCom/pageOutsrcComLogData",
                [
                    {"mData"  : function(row, type, set, meta) { return meta.row + 1; }},
                    {"mData"  : "updatedUserName","sDefaultContent" : ""},
                    {"mData" : "content","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""}
                ],
                10
        );
        $("#outsrcComLogPageModal").modal("show");
    } --%>
    
  	//查看沟通日志
    function pageOutsrcComLogLog(comId){
    	$("#log_outsrcComId").val(comId);
    	outsrcComLog_table = $('#outsrcComLog-dataTable').DataTable({
            "scrollY": '178px',
            "scrollX": '100%',
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

            "iDisplayLength": 10,
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/outsrcCom/pageOutsrcComLogData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                var data;
                //参数拼接
                data = "paramData=" + JSON.stringify(aoData) + "&" + $("#outsrcComLog-searchForm").serialize();
                
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
					{"mData"  : function(row, type, set, meta) { return meta.row + 1; }},
                    {"mData"  : "updatedUserName","sDefaultContent" : ""},
                    {"mData" : "content","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""}
            ],
            "aoColumnDefs":[     //设定各列宽度   
     	          {"sWidth": "10%","aTargets": [0]},   
     	          {"sWidth": "15%","aTargets": [1]},   
     	          {"sWidth": "50%","aTargets": [2],"className":'title-content'},
     	          {"sWidth": "25%","aTargets": [3],"className":'title-content'}               
            ]
        });
    	$("#outsrcComLogPageModal").modal("show");
    	//表格设置鼠标移入显示隐藏的内容
      	$("#outsrcComLog-dataTable").on("mouseover mouseout", '.title-content', function(event){
			  if(event.type == "mouseover"){
				  var titleContent=$(this).html();
				  $(this).attr('title',titleContent);
			  }else if(event.type == "mouseout"){
				  $(this).attr('title','');
			  }
		});
    }
  	
  	

</script>
