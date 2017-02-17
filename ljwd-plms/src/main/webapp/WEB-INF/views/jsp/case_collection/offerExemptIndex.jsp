<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>免扣管理</title>
</head>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">免扣管理</h3>
    </div>
    <div class="panel-body">
        <form id="searchForm">

            <label for="custName" class="right-space-1">主贷人 </label>
            <input type="text" id="custName" name="custName" class="right-space collection"/>

            <label for="cntrctNo" class="right-space-1">合同编号 </label>
            <input type="text" id="cntrctNo" name="cntrctNo" class="right-space collection"/>

            <label for="idCardNo" class="right-space-1">身份证号 </label>
            <input type="text" id="idCardNo" name="idCardNo" class="right-space collection" data-placement="bottom"/>
            
			<!-- <br/><br/> -->
            <label for="endDateMin" class="right-space-1 line-bottom">免扣截止日期 </label>
            <input type="text" class="input-border collection-number" id="endDateMin" name="endDateMin" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'endDateMax\')}',minDate:'#F{$dp.$D(\'endDateMax\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})" readonly>
		    <label class="label-center-1">至</label>
            <input type="text" class="input-border collection-number" id="endDateMax" name="endDateMax" onFocus="picker2rule(this,endDateMin)" readonly>

            <br/>
            <label for="collectorName" class="right-space-1 line-bottom">申请人 </label>
            <span class="search_box">
	            <input type="text" id="collectorName" name="reqByName" class="search_input" readonly/>
	            <span class="search_ionic input-group-addon" id="collectorSearchBtn" data-toggle="modal" data-target="#collectorSearchModal">
	            	<i class="glyphicon glyphicon-search"></i>
	            </span>
			</span>
            <br/>
            <button type="button" class="btn btn-primary right-space-2" id="searchBtn">查询</button>
            <shiro:hasPermission name="offer_exempt:insert">
                <button type="button" class="btn btn-primary right-space-2" data-toggle="modal" data-target="#offerExempt-add" onclick="resetOfferExemptAddForm();">新增</button>
            </shiro:hasPermission>
            <button type="reset" class="btn btn-default">清除</button>
        </form>
    </div>
</div>

</div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="text-center">序号</th>
        <th class="text-center">合同编号</th>
        <th class="text-center">主贷人</th>
        <th class="text-center">身份证号</th>
        <th class="text-center">逾期期数</th>
        <th class="text-center">免扣截止日期</th>
        <th class="text-center">申请人</th>
        <th class="text-center">申请时间</th>
        <th class="text-center">状态</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
    <tbody>
     	<tr class="dataTable_show">
		     <td colspan="10">没有检索到数据</td>
		</tr>
    </tbody>
</table>

<!--催收员查找页面-->
<jsp:include page="collectorSearchModal.jsp"/>

<!--新增窗口-->
<div class="modal fade" id="offerExempt-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:640px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">免扣申请</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="offerExempt-searchForm" style="margin-bottom:20px;">
                    <label for="custName2" class="right-space-2">主贷人</label>
                    <input type="text" name="custName" id="custName2" class="right-space collection">
                    <label for="cntrctNo2" class="right-space-2">合同编号</label>
                    <input type="text" name="cntrctNo" id="cntrctNo2" class="right-space collection">
                    <button class="btn btn-primary" type="button" class="btn blue" id="offerExempt-searchBtn">查询</button>
                </form>

                <form class="form-horizontal" id="offerExempt-addForm">

                    <div class="form-group" style="height:300px;overflow-y:auto;overflow-x:hidden;">
                        <table class="table table-border dataTable">
                            <thead>
                            <th>序号</th>
                            <th>主贷人</th>
                            <th>合同编号</th>
                            </thead>
                            <tbody id="offerExemptAddTBody">
                            </tbody>
                        </table>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-3 control-label label-base"><span class="redStar">* </span>免扣截止日期</label>
                        <div class="col-sm-5">
                            <input type="text" class="form-control collection" name="endDate" id="endDate" onFocus="WdatePicker({minDate:'%y-%M-%d'})" readonly>
                        </div>
                    </div>

                </form>

            </div>

            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="offerExempt-addBtn">申请</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>

        </div>
    </div>
</div>

<script type="text/javascript" language="javascript">

    //查询按钮
    $('#searchBtn').on('click', function (){
        var $form = $('#searchForm');
        //表单校验
        if (!$form.valid()){
            return false;
        }
        var $this = $(this);
        if($this.hasClass("hasInit")){
            offerExempt_table.search($form.serialize()).draw();
        }else{
            $this.addClass("hasInit");
            offerExempt_init();
        }
    });

    var offerExempt_table;

    <%-- function offerExempt_init() {
        offerExempt_table = P.dataTable($('#dataTable'),
                $("#searchForm"),
                "<%=request.getContextPath()%>/rest/caseCollection/pageOfferExemptData",
                [
                    {"mData" :  function(row, type, set, meta) {
                        return "<span>" + row.rowNo + "</span>";
                    }},
                    {"mData" : "cntrctNo","sDefaultContent" : ""},
                    {"mData" : "custName","sDefaultContent" : ""},
                    {"mData" : "idCardNo","sDefaultContent" : ""},
                    {"mData" : "overduePeriod","sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            if(oData.overduePeriod >= 0){
                                $(nTd).html(oData.overduePeriod + "-" + oData.maxOverduePeriod);
                            }
                        }
                    },
                    {"mData" : "endDateFmt","sDefaultContent" : ""},
                    {"mData" : "reqByName","sDefaultContent" : ""},
                    {"mData" : "reqTime","sDefaultContent" : ""},
                    {"mData" : "statusText","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell":function (nTd, sData, oData, iRow, iCol) {
                            //新增状态和当前用户等于申请人才可以作废
                            if($("#currentUser").val() == oData.reqBy && oData.statusText == '新增'){
                                $(nTd).html("<a href='javascript:void(0);' " + "onclick='cancelOfferExempt(\"" + oData.id + "\")'>作废</a>");
                            }
                        }
                    }
                ]
                ,100
        );
    } --%>

  //Table初始化方法
    function offerExempt_init(){
    	offerExempt_table = $('#dataTable').DataTable({
            "scrollY": '352px',
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
                //,"sProcessing": "<img src='assets/img/loading.gif' />"
            },
            "bProcessing": false,        //加载数据时显示正在加载信息
            "bServerSide": true,        //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageOfferExemptData",
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
                        return "<span>" + row.rowNo + "</span>";
                    }},
                    {"mData" : "cntrctNo","sDefaultContent" : ""},
                    {"mData" : "custName","sDefaultContent" : ""},
                    {"mData" : "idCardNo","sDefaultContent" : ""},
                    {"mData" : "overduePeriod","sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            if(oData.overduePeriod >= 0){
                                $(nTd).html(oData.overduePeriod + "-" + oData.maxOverduePeriod);
                            }
                        }
                    },
                    {"mData" : "endDateFmt","sDefaultContent" : ""},
                    {"mData" : "reqByName","sDefaultContent" : ""},
                    {"mData" : "reqTime","sDefaultContent" : ""},
                    {"mData" : "statusText","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell":function (nTd, sData, oData, iRow, iCol) {
                            //新增状态和当前用户等于申请人才可以作废
                            if($("#currentUser").val() == oData.reqBy && oData.statusText == '新增'){
                                $(nTd).html("<a href='javascript:void(0);' " + "onclick='cancelOfferExempt(\"" + oData.id + "\")'>作废</a>");
                            }
                        }
                    }
            ],
            "aoColumnDefs":[
                {"bSortable":false,"aTargets":[0,9]}
            ]
        });
    }
    
    //免扣作废
    function cancelOfferExempt(offerExemptId){
        MSG.confirm('确定要取消免扣吗？',function(){
            var data = "offerExemptId=" + offerExemptId;
            $.ajax({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/caseCollection/cancelOfferExempt",
                data : data,
                success : function(ret){
                    MSG.show(ret.message);
                    if(ret.success){
                        offerExempt_table.search($("#searchForm").serialize()).draw();
                    }
                },
                error:function(errorData){
                    MSG.show("系统异常,稍后重试");
                }
            });
        });
    }

    //申请免扣按钮
    $("#offerExempt-addBtn").on('click',function(){
        var paymentId = $('input[name="paymentId"]:checked').val();
        if(!paymentId){
            MSG.show('请选择合同');
            return;
        }
        var endDate = $("#endDate").val();
        if(!endDate){
            MSG.show('请选择免扣结束日期');
            return;
        }
        var url = "<%=request.getContextPath()%>/rest/caseCollection/addOfferExempt";
        $.post(url,
                {paymentId:paymentId,endDate:endDate},
                function(ret){
                    if(ret.success){
                        $("#offerExempt-add").modal("hide");
                        $("#offerExempt-addForm").resetForm();
                        offerExempt_table.search($('#searchForm').serialize()).draw();
                    }
                    MSG.show(ret.message);
                },
                "json"
        );
    });

    //免扣合同查询按钮
    $('#offerExempt-searchBtn').on('click', function (){
        var custName = $.trim($("#custName2").val());
        var cntrctNo = $.trim($("#cntrctNo2").val());
        if(!custName && !cntrctNo){
            MSG.show('合同编号和主贷人至少填一个');
            return;
        }
        var url = "<%=request.getContextPath()%>/rest/caseCollection/getApplyExempt";
        $.post(url,
               {custName:custName,cntrctNo:cntrctNo},
               function(applyExemptList){
                   if(applyExemptList){
                       var $offerExemptAddTBody = $("#offerExemptAddTBody");
                       var bodyHtml = "";
                       for(var i = 0; i < applyExemptList.length; i++){
                           bodyHtml += "<tr><td><input type='radio' name='paymentId' value='"+applyExemptList[i].paymentId+"'></td><td>" + applyExemptList[i].custName + "</td><td>" + applyExemptList[i].cntrctNo + "</td></tr>";
                       }
                       $offerExemptAddTBody.html(bodyHtml);
                   }
               },
               "json"
        );
    });

    function resetOfferExemptAddForm() {
        //查询表单重置
        $("#offerExempt-searchForm").resetForm();
        //新增表单重置
        $("#offerExempt-addForm").resetForm();
        //查询结果清空
        $("#offerExemptAddTBody").html("");
    }

    $(document).ready(function() {
        //表单校验
        offerExempt_validate($("#searchForm"));
    });

    //表单校验
    function offerExempt_validate($validateForm){
        P.validateForm($validateForm,{
            idCardNo: {
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

</script>
