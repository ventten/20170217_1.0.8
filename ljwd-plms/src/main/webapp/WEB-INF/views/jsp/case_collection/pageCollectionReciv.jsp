<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>客户应收明细</title>
</head>

<div class="plms-content">

    <table id="receivable-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">合同编号</th>
            <th class="text-center">客户名称</th>
            <th class="text-center">证件号码</th>
            <th class="text-center">贷款金额</th>
            <th class="text-center">还款期数</th>
            <th class="text-center">还款状态</th>
            <th class="text-center">逾期天数</th>
            <th class="text-center">发放日期</th>
            <th class="text-center">到期日期</th>
            <th class="text-center">应还款日期</th>
            <th class="text-center">最大还款日期</th>
            <th class="text-center">还款日期</th>
            <th class="text-center">应还款合计</th>
            <th class="text-center">豁免金额合计</th>
            <th class="text-center">实收金额合计</th>
        </tr>
        </thead>
    </table>

</div>
<script type="text/javascript" language="javascript">

    var receivable_table = $('#receivable-dataTable').DataTable( {
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
            },
            "sProcessing": "<img src='assets/img/loading.gif'/>"
        },
        "bProcessing": true,            //加载数据时显示正在加载信息
        "bServerSide": true,            //指定从服务器端获取数据
        "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionRecivData",
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
            {"mData" : "contractNo","sDefaultContent" : ""},
            {"mData" : "custName","sDefaultContent" : ""},
            {"mData" : "idCardNo","sDefaultContent" : ""},
            {"mData" : "loanAmount","sDefaultContent" : ""},
            {"mData" : "periodNum","sDefaultContent" : ""},
            {"mData" : "status","sDefaultContent" : ""},
            {"mData" : "overdueDays","sDefaultContent" : ""},
            {"mData" : "startDate","sDefaultContent" : ""},
            {"mData" : "endDate","sDefaultContent" : ""},
            {"mData" : "rpmntDate","sDefaultContent" : ""},
            {"mData" : "maxRpmntDate","sDefaultContent" : ""},
            {"mData" : "actualRpmntDate","sDefaultContent" : ""},
            {"mData" : "ttlRecivAmt","sDefaultContent" : ""},
            {"mData" : "ttlWaivedAmt","sDefaultContent" : ""},
            {"mData" : "ttlActualAmt","sDefaultContent" : ""}
        ]
    });
    
</script>

