<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<head>
    <title>我的案件</title>
    <style>
        .dataTables_scrollBody tbody tr td{
            padding: 3px 10px !important;
        }
    </style>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">我的案件</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">
            <label for="queue" class="right-space-1">所属队列 </label>
            <select id="queue" name="queue" class="collection right-space">
                <option value="">全部</option>
                <option value="MainQueue">主队列</option>
                <option value="ProxyQueue">代理队列</option>
                <option value="NewQueue">新增客户队列</option>
                <option value="AdvanceQueue">提前移交队列</option>
            </select>
            <label for="controlStatus" class="right-space-1 label-widths">控管状态 </label>
            <select id="controlStatus" name="controlStatus" class="collection right-space">
                <option value="">全部</option>
                <c:forEach items="${controlList}" var="item">
                    <option value="${item.code}">${item.val}</option>
                </c:forEach>
            </select>
            <label class="right-space-1" for="overDaysMin">逾期天数 </label>
            <input size="16" type="text" id="overDaysMin" name="overDaysMin" class="collection-data" data-placement="bottom">
            <label class="label-center-1">至 </label>
            <input size="16" type="text" id="overDaysMax" name="overDaysMax" class="collection-data right-space" data-placement="bottom">
            <label for="isFollowed" class="right-space-1 line-bottom">是否跟进 </label>
            <select id="isFollowed" name="isFollowed" class="collection right-space-1">
                <option value="">全部</option>
                <option value="false">未跟进</option>
                <option value="true">已跟进</option>
            </select>
            <br/>
            <label for="cntrctNo" class="right-space-1">合同编号 </label>
            <input type="text" id="cntrctNo" name="cntrctNo" class="collection right-space"/>
            <label for="custName" class="right-space-1 label-widths">主&nbsp;&nbsp;贷&nbsp;&nbsp;人 </label>
            <input type="text" id="custName" name="custName" class="collection right-space"/>
            <label class="right-space-1" for="docno">身份证号 </label>
            <input type="text" id="docno" name="docno" class="collection right-space" data-placement="bottom"/>
            <label class="right-space-1 line-bottom" for="docno">联系电话 </label>
            <input type="text" id="mobile" name="mobile" class="collection right-space" data-placement="bottom"/>
            <br/>
            <button type="button" class="btn btn-primary right-space-1" id="searchBtn">查询</button>
            <button type="reset" class="btn btn-default">清除</button>
        </form>
    </div>
</div>
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr class="tableHead">
        <th class="text-center tableHead"><input type="checkbox" id="checkallCase" title="Select all"/><label for="checkallCase" class="left-space-1">全选</label></th>
        <th class="text-center tableHead">操作</th>
        <th class="text-center tableHead">合同编号</th>
        <th class="text-center tableHead">主贷人</th>
        <th class="text-center tableHead">证件号码</th>
        <th class="text-center tableHead">联系电话</th>
        <th class="text-center tableHead">贷款金额</th>
        <th class="text-center tableHead">逾期期数</th>
        <th class="text-center tableHead">逾期天数</th>
        <th class="text-center tableHead">剩余本金/保证金</th>
        <th class="text-center tableHead">是否跟进</th>
        <th class="text-center tableHead">催收类型</th>
        <th class="text-center tableHead">业务类型</th>
        <th class="text-center tableHead">跟进情况</th>
        <th class="text-center tableHead">最后跟进时间</th>
        <th class="text-center tableHead">催收代码</th>
        <th class="text-center tableHead">控管状态</th>
        <th class="text-center tableHead">分配日期</th>
        <th class="text-center tableHead">代理催收员</th>
        <th class="text-center tableHead">代理截止日期</th>
    </tr>
    </thead>
    <tbody>
        <tr class="dataTable_show">
             <td colspan="20">没有检索到数据</td>
        </tr>
    </tbody>
</table>
<script type="text/javascript" language="javascript">
    //查询按钮点击
    $('#searchBtn').on( 'click', function () {
        var $form = $('#searchForm');
        //表单校验
        if (!$form.valid()){
            return false;
        }
        var $this = $(this);
        if($this.hasClass("hasInit")){
            table.search($form.serialize()).draw();
        }else{
            $this.addClass("hasInit");
            init();
        }
    });
    //分页Table
    var table;
    //Table初始化方法
    function init(){
        table = $('#dataTable').DataTable({
            "scrollY": '514px',
            "scrollX": true,
            "sScrollXInner": "100%",
            "bScrollCollapse": true,
            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //是否翻页功能
            "bFilter": false,                       //是否过滤功能
            "bInfo": true,                          //是否页脚信息
            "bSort": true,                          //是否排序功能
            "bAutoWidth": true,                     //是否自动宽度
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm").serialize();
                $.ajax({
                    "type" : 'POST',
                    "dataType" : "json",
                    "url" : sSource,
                    "data" : data,
                    "success" : function(resp) {
                        $('#checkallCase').attr("checked", false);
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
                    return "<input type='checkbox' class='case' name='case' value=" + row.applId + "/><label class='left-space-1'>" + (row.rowNo) + "</label>";
                }},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="case_my:detail">
                            $(nTd).html("<a target='_blank' class='caseInfo' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + '>催记</a>&nbsp;&nbsp;');
                        </shiro:hasPermission>
                    }
                },
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "docno","sDefaultContent" : ""},
                {"mData" : "mobile","sDefaultContent" : ""},
                {"mData" : "loanAmt","sDefaultContent" : ""},
                {"mData" : "overduePeriod","sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        if(oData.overduePeriod >= 0){
                            $(nTd).html(oData.overduePeriod + "-" + oData.maxOverduePeriod);
                        }
                    }
                },
                {"mData" : "overDays","sDefaultContent" : ""},
                {"mData" : "remainingPrincipal","sDefaultContent" : ""},
                {"mData" : "isFollowed","sDefaultContent" : ""},
                {"mData" : "collectMthdText","sDefaultContent" : ""},
                {"mData" : "bizCategory","sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                    	if(oData.bizCategory == "NORMAL"){
                    		$(nTd).html("等本等息");
                        }else if(oData.bizCategory == "WHOLE"){
                        	$(nTd).html("趸缴");
                        }else if(oData.bizCategory == "MATURE_PAYMENT"){
                        	$(nTd).html("平缴");
                        }else if(oData.bizCategory == "INT_FIRST_PRIN_LAST"){
                        	$(nTd).html("先息后本");
                        }else{
                        	$(nTd).html("");
                        }
                    }
                },
                {"mData" : "statusText","sDefaultContent" : ""},
                {"mData" : "lastFollowedDate","sDefaultContent" : ""},
                {"mData" : "resultText","sDefaultContent" : ""},
                {"mData" : "controlStatusText","sDefaultContent" : ""},
                {"mData" : "assignTime","sDefaultContent" : ""},
                {"mData" : "agentName","sDefaultContent" : ""},
                {"mData" : "agentEndDateFmt","sDefaultContent" : ""}
            ],
            "aoColumnDefs":[
                {"bSortable":false,"aTargets":[0,1]}
            ]
        });
    }

    $(document).ready(function() {
        //表单校验
        validate($("#searchForm"));
    });

    //案件全选按钮
    $('#checkallCase').click(function(){
        if($(this).get(0).checked==true){
            $(".case").attr("checked", true);
        }else{
            $(".case").attr("checked", false);
        }
    });

    //表单校验
    function validate($validateForm){
        P.validateForm($validateForm,{
            overDaysMin: {
                digits: true
            },
            overDaysMax: {
                digits: true
            },
            docno:{
                idCard: true
            }
        });
    }

    // 设置模态框垂直居中函数
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
    $('#dataTable').on('click','.caseInfo',function(){
         var classVal=$(this).attr('class');
         //console.log(classVal);
         //使用localStorage存值 
         window.localStorage.setItem("getVal",classVal);
    });

</script>
