<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>委外记录</title>
</head>

<div class="plms-content">
	<div class="outVisit_box">
		<div class="outVisit_list">
			<span>委外状态</span>
    		<span id="outsrcRecord_status" class="visitVal"></span>
		</div>
		<div class="outVisit_list">
			<span>委外时间</span>
    		<span id="outsrcRecord_startDate" class="visitVal"></span>
		</div>
		<div class="outVisit_list">
			<span>预计退案时间</span>
    		<span id="outsrcRecord_endDate" class="visitVal"></span>
		</div>
		<div class="outVisit_list">
			<span>实际结案日期</span>
    		<span id="outsrcRecord_acutalEndDate" class="visitVal"></span>
		</div>
	</div>

    <!-- <table class="table">
        <tr>
            <td width="5%" class="active text-center">委外状态</td>
            <td width="5%" class=" text-center" id="outsrcRecord_status"></td>
            <td width="5%" class="active text-center">委外时间</td>
            <td width="5%" class=" text-center" id="outsrcRecord_startDate"></td>
            <td width="5%" class="active text-center">预计退案时间</td>
            <td width="5%" class=" text-center" id="outsrcRecord_endDate"></td>
            <td width="5%" class="active text-center">实际结案日期</td>
            <td width="5%" class=" text-center" id="outsrcRecord_acutalEndDate"></td>
        </tr>
    </table> -->

    <table id="out-dataTable" class="display dataTable" cellspacing="0" width="1000px">
        <thead>
            <tr>
                <th class="text-center" style="width:15%">操作时间</th>
                <th class="text-center" style="width:10%">操作人</th>
                <th class="text-center" style="width:75%">内容</th>
            </tr>
        </thead>
    </table>
</div>

<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageCollectionOutLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            out_init();
            out_info();
        }
    });

    //分页Table
    var out_table;

    //Table初始化方法
    function out_init(){
        out_table = $('#out-dataTable').DataTable( {
            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //翻页功能
            "bFilter": false,                       //过滤功能
            "bInfo": true,            			    //页脚信息
            "bSort": false  ,					    //无排序功能
            "bScrollCollapse" : true,
            "bAutoWidth": false,
            "iDisplayLength": 10,
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
            "bProcessing": false,           //加载数据时显示正在加载信息
            "bServerSide": true,            //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionOutData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&applId="+$("#applId").val();
                $.ajax({
                    "type" : 'POST',
                    "url" : sSource,
                    "dataType" : "json",
                    "data" : data,
                    "success" : function(resp) {
                        fnCallback(resp);
                    },
                    "error":function(errorData){
                        MSG.show('获取数据发生异常');
                    }
                });
            },
            //dataTable显示
            "aoColumns"  : [
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "content","sDefaultContent" : ""}
            ]
        });
    }

    function out_info(){
        $.ajax({
            "type" : 'POST',
            "url" : "<%=request.getContextPath()%>/rest/caseCollection/getOutByApplId",
            "dataType" : "json",
            "data" : {applId:$("#applId").val()},
            "success" : function(result) {
                if(result){
                    $("#outsrcRecord_status").text(result.statusText);
                    $("#outsrcRecord_startDate").text(result.startDateFmt);
                    $("#outsrcRecord_endDate").text(result.endDateFmt);
                    $("#outsrcRecord_acutalEndDate").text(result.acutalEndDateFmt);
                }
            },
            "error":function(errorData){
                MSG.show('获取数据发生异常');
            }
        });
    }

</script>

