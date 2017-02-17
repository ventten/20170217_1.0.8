<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>委外催记</title>
</head>

<style>
    #outsrcCollect-dataTable thead tr{
        background:#dff3fc;
        border-bottom:1px solid #111;
    }
    #outsrcCollect-dataTable thead tr th{
        padding: 10px 6px 10px 6px;
    }
    #outsrcCollect-dataTable tbody tr{
        border-bottom:1px solid #111;
    }
    #outsrcCollect-dataTable tbody tr td{
        padding: 3px 10px;
        white-space:nowrap;
    }
    #outsrcCollect-dataTable_wrapper thead tr th{
    	padding: 8px 25px 8px 25px;
        white-space:nowrap;
    }
    #outsrcCollect-dataTable_wrapper tbody tr th{
    	padding: 8px 10px;
        white-space:nowrap;
    }
   .tableHead {
        white-space:nowrap;
    }
</style>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">委外催记</h3>
    </div>
    <div class="panel-body">
        <div>
             <form id="outsrcCollect-searchForm">

                <label class="right-space-1">合同编号</label>
                <input class="right-space collection input-border" name="cntrctNo">

                <label class="right-space-1">主&nbsp;&nbsp;贷&nbsp;&nbsp;人</label>
                <input class="right-space collection input-border" name="custName">

                <label class="right-space-1">身份证号</label>
                <input class="right-space collection input-border" name="idCardNo">

                <label class="right-space-1 line-bottom">委外机构</label>
                <select class="right-space collection" name="comId">
                    <option value="">全部</option>
                    <c:forEach items="${outsrcComList}" var="item">
                        <option value="${item.id}">${item.outsrcComName}</option>
                    </c:forEach>
                </select>
				<br/>
                <label class="right-space-1 line-bottom">控管状态</label>
                <select class="right-space collection" name="controlStatus">
                    <option value="">全部</option>
                    <c:forEach items="${controlList}" var="item">
                        <option value="${item.code}">${item.val}</option>
                    </c:forEach>
                </select>

                <br/>
                <shiro:hasPermission name="out_collect:select">
                    <button type="button" class="btn btn-primary right-space-2" id="outsrcCollect-searchBtn">查询</button>
                </shiro:hasPermission>
                <shiro:hasPermission name="out_collect:import">
                    <button type="button" class="btn btn-primary right-space-2" data-toggle="modal" data-target="#outsrcCollect-addModal" onclick="P.resetModal('outsrcCollect-addForm')">导入</button>
                </shiro:hasPermission>
                <button type="reset" class="btn btn-default right-space-2">清除</button>

            </form>
        </div>
    </div>
</div>

<table id="outsrcCollect-dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr class="tableHead">
        <th class="text-center tableHead">序号</th>
        <th class="text-center tableHead">合同编号</th>
        <th class="text-center tableHead">主贷人</th>
        <th class="text-center tableHead">证件号码</th>
        <th class="text-center tableHead">逾期期数</th>
        <th class="text-center tableHead">逾期天数</th>
        <th class="text-center tableHead">委外机构</th>
        <th class="text-center tableHead">控管状态</th>
        <th class="text-center tableHead">委外金额</th>
        <th class="text-center tableHead">回收金额</th>
        <th class="text-center tableHead">最后跟进时间</th>
    </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="11">没有检索到数据</td>
		</tr>
    </tbody>
</table>

<!--导入通讯录窗口-->
<jsp:include page="collect_modal/outsrcCollectAddModal.jsp"/>

<script type="text/javascript" language="javascript">

    //查询按钮点击
    $('#outsrcCollect-searchBtn').on('click', function () {
        outsrcCollect_table_init();
    });

    //分页Table
    var outsrcCollect_table;

    //Table初始化方法
    function outsrcCollect_table_init(){
        outsrcCollect_table = $('#outsrcCollect-dataTable').DataTable({
            "scrollY": '394px',
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/outsrcCollect/pageOutsrcCollectData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                var data;
                //参数拼接
                data = "paramData=" + JSON.stringify(aoData) + "&" + $("#outsrcCollect-searchForm").serialize();
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
                    return "<span>" + (row.rowNo) + "</span>";
                }},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "overduePeriod","sDefaultContent" : ""},
                {"mData" : "overdueDays","sDefaultContent" : ""},
                {"mData" : "comName","sDefaultContent" : ""},
                {"mData" : "controlStatusText","sDefaultContent" : ""},
                {"mData" : "recivAmt","sDefaultContent" : ""},
                {"mData" : "recycleAmt","sDefaultContent" : ""},
                {"mData" : "followTimeFmt","sDefaultContent" : ""}
            ],
            "aoColumnDefs":[
                {"bSortable":false,"aTargets":[0]}
            ]
        });
    }

</script>
