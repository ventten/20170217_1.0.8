<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>个案查询</title>
</head>

<div>
    <form id="searchForm">
        <label for="cntrctNo">合同编号 </label>
        <input type="text" id="cntrctNo" name="cntrctNo"/>
        <label for="custName">主贷人 </label>
        <input type="text" id="custName" name="custName"/>
        <label for="idCardNo">身份证号 </label>
        <input type="text" id="idCardNo" name="idCardNo"/>
        <label for="tel">电话号码 </label>
        <input type="text" id="tel" name="tel"/>
        <input class="btn btn-primary" type="button" id="searchBtn" value="查询"/>
    </form>
</div>

<div class="row">
    </br>
    </br>
</div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">合同编号</th>
        <th class="text-center">主贷人</th>
        <th class="text-center">证件号</th>
        <th class="text-center">批核金额</th>
        <th class="text-center">合同期数</th>
        <th class="text-center">已还期数</th>
        <th class="text-center">逾期期数</th>
        <th class="text-center">逾期天数</th>
        <th class="text-center">贷款情况</th>
        <th class="text-center">贷款产品</th>
        <th class="text-center">所属网点</th>
        <th class="text-center">委外机构</th>
        <th class="text-center">业务类型</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
</table>

<script type="text/javascript" language="javascript">

    var table = P.dataTable($('#dataTable'),
            $("#searchForm"),
            "<%=request.getContextPath()%>/rest/cust/pageCaseData",
            [
                {"mData" : function(row, type, set, meta) { return meta.row + 1; }},//序号
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "apprAmt","sDefaultContent" : ""},
                {"mData" : "loanPeriod","sDefaultContent" : ""},
                {"mData" : "paidPeriod","sDefaultContent" : ""},
                {"mData" : "overCount","sDefaultContent" : ""},
                {"mData" : "overDays","sDefaultContent" : ""},
                {"mData" : "applStatus","sDefaultContent" : ""},
                {"mData" : "prdName","sDefaultContent" : ""},
                {"mData" : "siteName","sDefaultContent" : ""},
                {"mData" : "entrust","sDefaultContent" : ""},
                {"mData" : "bizCategoryText","sDefaultContent" : ""},
                {"mData" : "custId","sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        $(nTd).html("<a href=<%=request.getContextPath()%>/rest/cust/caseDetail?custId=" + oData.custId + ' onclick="return H.hrefA(this);">详情</a>&nbsp;&nbsp;');
                    }
                }
            ]
    );

    //查询按钮
    $('#searchBtn').on( 'click', function () {
        table.search($("#searchForm").serialize()).draw();
    });

</script>
