<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>客户信息</title>
    <style>
        .dataTables_scrollBody tbody tr td{
            padding: 2px 10px !important;
        }
    </style>
</head>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">客户查询</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm_custSelect">  
            <label for="cntrctNo_custSelect" class="right-space-1">合同编号 </label>
            <input type="text" id="cntrctNo_custSelect" name="cntrctNo" class="collection right-space"/>
            <label for="custName_custSelect" class="right-space-1 label-widths">主&nbsp;&nbsp;贷&nbsp;&nbsp;人 </label>
            <input type="text" id="custName_custSelect" name="custName" class="collection right-space"/>
            <label class="right-space-1 line-bottom" for="docno_custSelect">身份证号 </label>
            <input type="text" id="docno_custSelect" name="docno" class="collection right-space" data-placement="bottom"/>
            <br/>
            <button type="button" class="btn btn-primary right-space-2" id="searchBtn_custSelect">查询</button>
            <button type="reset" class="btn btn-default">清除</button>
        </form>
    </div>
</div>
<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr class="tableHead">
        <th class="text-center tableHead">选择</th>
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
        <th class="text-center tableHead">跟进情况</th>
        <th class="text-center tableHead">催收代码</th>
        <th class="text-center tableHead">控管状态</th>
        <th class="text-center tableHead">分配日期</th>
        <th class="text-center tableHead">催收员</th>
        <th class="text-center tableHead">代理催收员</th>
        <th class="text-center tableHead">代理截止日期</th>
    </tr>
    </thead>
     <tbody>
        <tr class="dataTable_show">
             <td colspan="19">没有检索到数据</td>
        </tr>
    </tbody>
</table>
<!--催收员查找页面-->
<jsp:include page="../case_collection/collectorSearchModal.jsp"/>
<script type="text/javascript" language="javascript">

    //查询按钮点击
    $('#searchBtn_custSelect').on( 'click', function () {
    	var bool1 = true;
    	var bool2 = true;
    	var bool3 = true;
    	//合同编号
    	var contrctNo = $("#cntrctNo_custSelect").val();
    	//姓名
    	var custName = $("#custName_custSelect").val();
    	//身份证号
    	var docno = $("#docno_custSelect").val();
    	if(contrctNo == null || contrctNo == ""){
    		bool1 = false;
    	}else{
    		bool1 = true;
    	}
    	if(custName == null || custName == ""){
            bool2 = false;
        }else{
            bool2 = true;
        }
    	if(docno == null || docno == ""){
            bool3 = false;
        }else{
            bool3 = true;
        }
    	if(bool1 == false && bool2 == false && bool3 == false){
    		MSG.show("至少输入一个查询条件");
    		return false;
    	}
        var $form = $('#searchForm_custSelect');
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
            "scrollY": '364px',
            "scrollX": true,
            "sScrollXInner": "100%",
            "bScrollCollapse": true,

            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //是否翻页功能
            "bFilter": false,                       //是否过滤功能
            "bInfo": true,                          //是否页脚信息
            "bSort": true,                          //是否排序功能

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
                //,"sProcessing": "<img src='assets/img/loading.gif' />"
            },
            "bProcessing": false,        //加载数据时显示正在加载信息
            "bServerSide": true,        //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageCustSelect",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#searchForm_custSelect").serialize();
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
                    return row.rowNo;
                }},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="case_my:detail">
                            $(nTd).html("<a target='_blank' class='customerInfo_select' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + '>催记</a>&nbsp;&nbsp;');
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
                {"mData" : "statusText","sDefaultContent" : ""},
                {"mData" : "resultText","sDefaultContent" : ""},
                {"mData" : "controlStatusText","sDefaultContent" : ""},
                {"mData" : "assignTime","sDefaultContent" : ""},
                {"mData" : "collectorName","sDefaultContent" : ""},
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
        validate($("#searchForm_custSelect"));
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
    $('#dataTable').on('click','.customerInfo_select',function(){
         var classVal=$(this).attr('class');
         //使用localStorage存值 
         window.localStorage.setItem("getVal",classVal);
    })

</script>
