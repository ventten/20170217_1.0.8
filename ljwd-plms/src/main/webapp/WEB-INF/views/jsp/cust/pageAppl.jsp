<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>贷款信息</title>
</head>
<div class="plms-content">
    <div>
        <form class="searchForm" id="appl-searchForm">
            <!--客户ID，说明哪个用户下的数据-->
            <input type="hidden" value="${clCustId}" name="clCustId">
        </form>
    </div>
    <table id="appl-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">序号</th>
            <th class="text-center">来源</th>
            <th class="text-center">贷款公司</th>
            <th class="text-center">申请编号</th>
            <th class="text-center">合同编号</th>
            <th class="text-center">贷款期数</th>
            <th class="text-center">贷款金额</th>
            <th class="text-center">贷款状态</th>
            <th class="text-center">申请日期</th>
            <th class="text-center">放款日期</th>
            <th class="text-center">结清日期</th>
        </tr>
        </thead>
    </table>
</div>
<script type="text/javascript" language="javascript">

    $(document).ready(function(){
    	appl_table();
    })
    function appl_table(){
    	appl_table=$('#appl-dataTable').DataTable({
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

             "iDisplayLength": 15,
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageApplData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#appl-searchForm").serialize();
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
                    return (meta.row + 1);
                }},
                {"mData" : "srcVal","sDefaultContent" : ""},
                {"mData" : "loanCompany","sDefaultContent" : ""},   //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                {"mData" : "applCode","sDefaultContent" : ""},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "loanPeriod","sDefaultContent" : ""},
                {"mData" : "loanAmt","sDefaultContent" : ""},
                {"mData" : "loanStateText","sDefaultContent" : ""},
                {"mData" : function(row){
                    var str = row.applDate.split(" ");
                    return str[0];
                }},
                {"mData" : "payDateFmt","sDefaultContent" : ""},
                {"mData" : "clearDateFmt","sDefaultContent" : ""}
             ]
         });
       }
</script>

