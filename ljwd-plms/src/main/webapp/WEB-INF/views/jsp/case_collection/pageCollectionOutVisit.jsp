<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>外访记录</title>
</head>

<div class="plms-content">
    <div class="outVisit_box">
    	<div class="outVisit_list">
    		<span>外访状态</span>
    		<span id="outVisit_status" class="visitVal"></span>
    	</div>
    	<div class="outVisit_list">
    		<span>外访人员</span>
    		<span id="outVisit_User" class="visitVal"></span>
    	</div>
    	<div class="outVisit_list">
    		<span>分配日期</span>
    		<span id="outVisit_assginDate" class="visitVal"></span>
    	</div>
    	<div class="outVisit_list">
    		<span>预计结案日期</span>
    		<span id="outVisit_expectCloseTime" class="visitVal"></span>
    	</div>
    </div>
    
    <!-- <table class="table">
        <tr>
            <td width="5%" class="active text-center">外访状态</td>
            <td width="5%" class=" text-center" id="outVisit_status"></td>
            <td width="5%" class="active text-center">外访人员</td>
            <td width="5%" class=" text-center" id="outVisit_User"></td>
            <td width="5%" class="active text-center">分配日期</td>
            <td width="5%" class=" text-center" id="outVisit_assginDate"></td>
            <td width="5%" class="active text-center">预计结案日期</td>
            <td width="5%" class=" text-center" id="outVisit_expectCloseTime"></td>
    	</tr>
    </table> -->

    <table id="outVisit-dataTable" class="display dataTable" cellspacing="0" width="1000px">
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
    $("#pageCollectionOutVisitLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            outVisit_init();
            outVisit_info();
        }
    });

    //分页Table
    var outVisit_table;

    //Table初始化方法
    function outVisit_init(){
    	outVisit_table = $('#outVisit-dataTable').DataTable( {
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionOutVisitData",
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
                {"mData" : "handleBy","sDefaultContent" : ""},
                {"mData" : "content","sDefaultContent" : ""}
            ]
        });
    }

    function outVisit_info(){
        $.ajax({
            "type" : 'POST',
            "url" : "<%=request.getContextPath()%>/rest/caseCollection/getTheNewestOutVisitByApplId",
            "dataType" : "json",
            "data" : {applId:$("#applId").val()},
            "success" : function(result) {
                if(result){
                	if(result.status!=null){
                        $("#outVisit_status").text(result.status);
                	}
                    if(result.visitBy!=null){
                        $("#outVisit_User").text(result.visitBy);
                	}
                	if(result.assignDateStr!=null){
                        $("#outVisit_assginDate").text(result.assignDateStr);
                	}
                	if(result.expectCloseTimeStr!=null){
                        $("#outVisit_expectCloseTime").text(result.expectCloseTimeStr);
	
                	}
                }
            },
            "error":function(errorData){
                MSG.show('获取数据发生异常');
            }
        });
    }

</script>

