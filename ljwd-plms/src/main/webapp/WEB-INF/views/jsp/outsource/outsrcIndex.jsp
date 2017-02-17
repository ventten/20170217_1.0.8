<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>委外管理</title>
    <style>
     .dataTables_scrollBody tbody tr td{
	    padding: 1px 10px !important;
	}
	table.dataTable thead th{
	    padding: 4px 20px;
	}
</style>
</head>

<div class="panel panel-default">
    <div class="panel-heading"><h3 class="panel-title">委外案件</h3></div>
    <div class="panel-body">
        <div>
             <form id="outsrcAppl-searchForm">

                 <label class="right-space-1"><span class="redStar">*</span>委外状态</label>
                 <select class="right-space collection" name="status" id="outsrcAppl-searchForm-status">
                     <option value="">全部</option>
                     <option value="AUDIT">待审核</option>
                     <option value="AUDIT_REJECT">审核拒绝</option>
                     <option value="DRAFT">待提交</option>
                     <option value="SUBMITTED">待审批</option>
                     <option value="REJECTED">审批拒绝</option>
                     <option value="APPROVED">已审批</option>
                     <option value="ENDED">已结案</option>
                 </select>

                <label for="startDateMin" class="right-space-1">委外日期</label>
                <input size="10" type="text" readonly class="input-border collection-number" name="startDateMin" id="startDateMin" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'startDateMax\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'startDateMax\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})">
                <label for="startDateMax" class="label-center-1">至</label>
                <input size="10" type="text" readonly class="input-border collection-number" name="startDateMax" id="startDateMax" onFocus="picker2rule(this,startDateMin)">

                <label class="left-space right-space-1">委外类型</label>
                <select class="right-space collection" name="outsrcType">
                    <option value="">全部</option>
                    <option value="FIRST_HAND">一手</option>
                    <option value="SECOND_HAND">二手</option>
                </select>
				
                <label class="right-space-1 line-bottom">区&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;域</label>
                <select class="right-space collection" name="regionId">
                    <option value="">全部</option>
                    <c:forEach items="${siteRegionList}" var="item">
                        <option value="${item.regionId}">${item.regionName}</option>
                    </c:forEach>
                </select>
                <br/>

                <label class="right-space-1">&nbsp;结案日期</label>
                <input size="16" type="text" readonly class="input-border collection-number" name="endDateMin" id="endDateMin" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'endDateMax\')||\'new Date()\'}',minDate:'#F{$dp.$D(\'endDateMax\',{d:-31})}',onpicked:pickedFunc,oncleared:clearedFunc})">
                <label class="label-center-1">至</label>
                <input size="16" type="text" readonly class="input-border collection-number" name="endDateMax" id="endDateMax" onFocus="picker2rule(this,endDateMin)">

                <label class="left-space right-space-1">合同编号</label>
                <input class="right-space collection input-border" name="cntrctNo">

                <label class="right-space-1">主&nbsp;&nbsp;贷&nbsp;&nbsp;人</label>
                <input class="right-space collection input-border" name="custName">

                <label class="right-space-1 line-bottom">身份证号</label>
                <input class="right-space collection input-border" name="idCardNo">
                <br/>

                <label class="right-space-1 line-bottom">&nbsp;外包公司</label>
                <select class="right-space collection" name="comId">
                    <option value="">全部</option>
                    <c:forEach items="${outsrcComList}" var="item">
                        <option value="${item.id}">${item.outsrcComName}</option>
                    </c:forEach>
                </select>

                <label class="right-space-1">贷款状态</label>
                <select class="right-space collection" name="winfoStatus" id="outsrcAppl-searchForm-winfoStatus">
                    <option value="">全部</option>
                    <option value="REPAYING">还款中</option>
                    <option value="CLEAR">结清</option>
                </select>

                 <%--<label class="right-space-1">逾期天数 </label>--%>
                 <%--<input size="5" type="text" name="overDayMin" class="collection-number" data-placement="bottom">--%>
                 <%--<label class="label-center-1">至 </label>--%>
                 <%--<input size="5" type="text" name="overDayMax" class="right-space collection-number input-border" data-placement="bottom">--%>

                 <input class="right-space-1" type="checkbox" name="notApplAgain" id="outsrcAppl-searchForm-notApplAgain" value="true"/>
                 <label for="outsrcAppl-searchForm-notApplAgain">是否查询未再委案</label>
             </form>
            <shiro:hasPermission name="out_src:select">
                <button type="button" class="btn btn-primary right-space-2" id="outsrcAppl-searchBtn">查询</button>
            </shiro:hasPermission>
            <%--<shiro:hasPermission name="out_src:search">--%>
            <%--<button type="button" class="btn btn-primary right-space-2" id="outsrcAppl-searchRepayingEndedBtn">查询未再委案</button>--%>
            <%--</shiro:hasPermission>--%>
            <shiro:hasPermission name="out_src:export">
                <button type="button" class="btn btn-default right-space-2" id="outsrcAppl-exportBtn">导出</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:export_detail">
                <button type="button" class="btn btn-default right-space-2" id="outsrcAppl-exportDetailBtn">导出明细</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:export_contactor">
                <button type="button" class="btn btn-default right-space-2" id="outsrcAppl-exportContactorBtn">导出通讯信息</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:export_address">
                <button type="button" class="btn btn-default right-space-2" id="outsrcAppl-exportAddressBtn">导出地址信息</button>
            </shiro:hasPermission>
            <button type="button" class="btn btn-default right-space-2" id="outsrcAppl-resetBtn">清除</button>
            <shiro:hasPermission name="out_src:insert">
                <button type="button" class="btn btn-primary right-space-2 hideBtn repayingEndedBtn" id="outsrcAppl-applBtn">申请委外</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:audit_pass">
                <button type="button" class="btn btn-primary right-space-2 hideBtn auditBtn" id="outsrcAppl-auditPassBtn">审核通过</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:audit_reject">
                <button type="button" class="btn btn-primary right-space-2 hideBtn auditBtn" id="outsrcAppl-auditRejectBtn">审核拒绝</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:submit">
                <button type="button" class="btn btn-primary right-space-2 hideBtn draftBtn" id="outsrcAppl-submitBtn">提交</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:modify">
                <button type="button" class="btn btn-primary right-space-2 hideBtn submittedBtn" id="outsrcAppl-modifyBtn">修改委外信息</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:import_allot">
                <button type="button" class="btn btn-primary right-space-2 hideBtn submittedBtn" data-toggle="modal"
                        data-target="#outsrcAppl-importAllotModal" onclick="P.resetModal('outsrcAppl-importAllotForm')">导入分配</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:approve_pass">
                <button type="button" class="btn btn-primary right-space-2 hideBtn submittedBtn" id="outsrcAppl-approvePassBtn">审批通过</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:approve_reject">
                <button type="button" class="btn btn-primary right-space-2 hideBtn submittedBtn" id="outsrcAppl-approveRejectBtn">审批拒绝</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:extented">
                <button type="button" class="btn btn-primary right-space-2 hideBtn approvedBtn" id="outsrcAppl-extentedBtn">延期</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:ended">
                <button type="button" class="btn btn-primary right-space-2 hideBtn approvedBtn" id="outsrcAppl-endedBtn">结案</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:re_collect">
                <button type="button" class="btn btn-primary right-space-2 hideBtn approvedBtn" id="outsrcAppl-reCollectBtn">发起再扣</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:to_normal">
                <button type="button" class="btn btn-primary right-space-2 hideBtn endedBtn" id="outsrcAppl-toNormalBtn">案件转正常</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:back">
                <button type="button" class="btn btn-primary right-space-2 hideBtn endedBtn" id="outsrcAppl-backBtn">退回</button>
            </shiro:hasPermission>
            <shiro:hasPermission name="out_src:undo_ended">
                <button type="button" class="btn btn-primary right-space-2 hideBtn endedBtn" id="outsrcAppl-unDoEndedBtn">撤销结案</button>
            </shiro:hasPermission>
        </div>
    </div>
</div>

<table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
    <thead>
        <tr class="tableHead">
            <th class="text-center tableHead"><input type="checkbox" id="checkAllBtn" title="select all"/><label class='left-space-1' for="checkAllBtn">全选</label></th>
            <th class="text-center tableHead">操作</th>
            <th class="text-center tableHead">区域</th>
            <th class="text-center tableHead">合同编号</th>
            <th class="text-center tableHead">主贷人</th>
            <th class="text-center tableHead">证件号码</th>
            <th class="text-center tableHead">委外类型</th>
            <th class="text-center tableHead">待委外公司</th>
            <th class="text-center tableHead">委外日期</th>
            <th class="text-center tableHead">预计结案日期</th>
            <th class="text-center tableHead">实际结案日期</th>
            <th class="text-center tableHead">委外状态</th>
            <th class="text-center tableHead">逾期天数</th>
            <th class="text-center tableHead">委外费率</th>
            <th class="text-center tableHead">委外金额</th>
            <th class="text-center tableHead">贷款状态</th>
            <th class="text-center tableHead">剩余本金</th>
            <th class="text-center tableHead">外包次数</th>
            <th class="text-center tableHead">委外区间</th>
            <th class="text-center tableHead">业务类型</th>
            <th class="text-center tableHead">贷款日期</th>
            <th class="text-center tableHead">贷款金额</th>
            <th class="text-center tableHead">期数</th>
            <th class="text-center tableHead">所属分行</th>
            <th class="text-center tableHead">申请委外日期</th>
            <th class="text-center tableHead">提交人</th>
            <th class="text-center tableHead">申请人</th>
        </tr>
    </thead>
    <tbody>
    	<tr class="dataTable_show">
		     <td colspan="27">没有检索到数据</td>
		</tr>
    </tbody>
</table>

<!--申请委外窗口-->
<jsp:include page="outsrc_modal/applOutsrcModal.jsp"/>
<!--修改委外信息窗口-->
<jsp:include page="outsrc_modal/modifyOutsrcModal.jsp"/>
<!--导入分配窗口-->
<jsp:include page="outsrc_modal/importOutsrcAllotModal.jsp"/>
<!--委外延期窗口-->
<jsp:include page="outsrc_modal/extentedOutsrcModal.jsp"/>
<!--结案窗口-->
<jsp:include page="outsrc_modal/endedOutsrcModal.jsp"/>
<!--退回窗口-->
<jsp:include page="outsrc_modal/backOutsrcModal.jsp"/>
<!--发起再扣窗口-->
<jsp:include page="/WEB-INF/views/jsp/case_collection/detail_modal/recollectModal.jsp" flush="true"/>

<script type="text/javascript" language="javascript">

//    //查询未再委案按钮点击
//    $('#outsrcAppl-searchRepayingEndedBtn').on('click', function () {
//        $('#outsrcAppl-searchForm-status').val("ENDED");
//        $('#outsrcAppl-searchForm-winfoStatus').val("REPAYING");
//        //表单校验
//        if (!$("#outsrcAppl-searchForm").valid()){
//            return false;
//        }
//        $(".hideBtn").hide();
//        $(".repayingEndedBtn").show();
//        outsrcAppl_table_init();
//    });

//    //委外状态框焦点事件
//    $('#outsrcAppl-searchForm-status').on('focus', function () {
//        $("#outsrcAppl-searchForm-status option[value='']").remove();
//        $('#outsrcAppl-searchForm-status').trigger("change");
//    });

//    //委外状态change事件
//    $('#outsrcAppl-searchForm-status').on('change', function () {
//        outsrcAppl_status_change();
//    });

    //查询按钮点击
    $('#outsrcAppl-searchBtn').on('click', function () {
        //表单校验
        if (!$("#outsrcAppl-searchForm").valid()){
            return false;
        }
        //如果选中查询未再委案
        if($('#outsrcAppl-searchForm-notApplAgain').is(':checked')){
            $('#outsrcAppl-searchForm-status').val("ENDED");
            $('#outsrcAppl-searchForm-winfoStatus').val("REPAYING");
            $(".hideBtn").hide();
            $(".repayingEndedBtn").show();
        }else {
            //委外状态change方法
            outsrcAppl_status_change();
        }
        outsrcAppl_table_init();
    });

    //清除按钮点击
    $('#outsrcAppl-resetBtn').on( 'click', function () {
        $('#outsrcAppl-searchForm').resetForm();
        $('#outsrcAppl-searchForm-status').trigger("change");
    });

    //委外状态change方法
    function outsrcAppl_status_change(){
        var status = $('#outsrcAppl-searchForm-status').val();
        $(".hideBtn").hide();
        if(status == 'AUDIT'){
            $(".auditBtn").show();
        }else if(status == 'DRAFT'){
            $(".draftBtn").show();
        }else if(status == 'SUBMITTED'){
            $(".submittedBtn").show();
        }else if(status == 'APPROVED'){
            $(".approvedBtn").show();
        }else if(status == 'ENDED'){
            $(".endedBtn").show();
            if($('#outsrcAppl-searchForm-winfoStatus').val() == 'REPAYING'){
                $(".repayingEndedBtn").show();
            }
        }
    }

    //分页Table
    var outsrcAppl_table;

    //Table初始化方法
    function outsrcAppl_table_init(){
        outsrcAppl_table = $('#dataTable').DataTable({
            "scrollY": '379px',
            "scrollX": '100%',
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/outsrcAppl/pageOutsrcApplData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#outsrcAppl-searchForm").serialize();
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
                    return "<input type='checkbox' class='case' name='case' onclick='caseClick()' value=" + row.id + ',' + row.applId
                            + ',' + row.idCardNo + ',' + row.cntrctNo + ',' + row.overduePeriod + ',' + row.paymentId + "><span class='left-space-1'>" + (row.rowNo) + "</span>";
                }},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="case_my:detail">
                            $(nTd).html("<a target='_blank' class='outsrcInfo' href=<%=request.getContextPath()%>/rest/caseCollection/caseCollectionMyDetail?cntrctNo=" + encodeURI(oData.cntrctNo) + '>催记</a>');
                        </shiro:hasPermission>
                    }
                },
                {"mData" : "regionName","sDefaultContent" : ""},
                {"mData" : "cntrctNo","sDefaultContent" : ""},
                {"mData" : "custName","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "outsrcTypeText","sDefaultContent" : ""},
                {"mData" : "outsrcComName","sDefaultContent" : ""},
                {"mData" : "startDateFmt","sDefaultContent" : ""},
                {"mData" : "endDateFmt","sDefaultContent" : ""},
                {"mData" : "acutalEndDateFmt","sDefaultContent" : ""},
                {"mData" : "statusText","sDefaultContent" : ""},
                {"mData" : "overDay","sDefaultContent" : ""},
                {"mData" : "feeRateFmt","sDefaultContent" : ""},
                {"mData" : "recivAmt","sDefaultContent" : ""},
                {"mData" : "winfoStatusText","sDefaultContent" : ""},
                {"mData" : "residueAmount","sDefaultContent" : ""},
                {"mData" : "outsrcCount","sDefaultContent" : ""},
                {"mData" : "outsrcInterval","sDefaultContent" : ""},
                {"mData" : "bizCategoryText","sDefaultContent" : ""},
                {"mData" : "loanDateFmt","sDefaultContent" : ""},
                {"mData" : "loanAmt","sDefaultContent" : ""},
                {"mData" : "loanPeriod","sDefaultContent" : ""},
                {"mData" : "siteName","sDefaultContent" : ""},
                {"mData" : "createTime","sDefaultContent" : ""},
                {"mData" : "submittedName","sDefaultContent" : ""},
                {"mData" : "createName","sDefaultContent" : ""}
            ],
            "aoColumnDefs":[
                {"bSortable":false,"aTargets":[0,1]}
            ]
        });
    }

    //导出列表数据按钮
    $('#outsrcAppl-exportBtn').click(function(){
        exportExcel('LIST');
    });

    //导出委外明细数据按钮
    $('#outsrcAppl-exportDetailBtn').click(function(){
        exportExcel('DETAIL');
    });

    //导出通讯信息按钮
    $('#outsrcAppl-exportContactorBtn').click(function(){
        exportExcel('CONTACTOR');
    });

    //导出地址信息按钮
    $('#outsrcAppl-exportAddressBtn').click(function(){
        exportExcel('ADDRESS');
    });

    /**
     * 导出Excel
     * @param type 导出类型:LIST-列表数据、CONTACTOR-通讯信息、ADDRESS-地址信息
     * */
    function exportExcel(type) {
        var url = "";
        if(type == 'LIST'){
            url = "<%=request.getContextPath()%>/rest/outsrcAppl/exportExcel?" + new Date().toTimeString();
        }else if(type == 'DETAIL'){
            url = "<%=request.getContextPath()%>/rest/outsrcAppl/exportDetailExcel?" + new Date().toTimeString();
        }else if(type == 'CONTACTOR'){
            url = "<%=request.getContextPath()%>/rest/outsrcAppl/exportContactorExcel?" + new Date().toTimeString();
        }else if(type == 'ADDRESS'){
            url = "<%=request.getContextPath()%>/rest/outsrcAppl/exportAddressExcel?" + new Date().toTimeString();
        }else {
            MSG.alert("错误的导出类型");
            return;
        }
        //如果选中查询未再委案
        if($('#outsrcAppl-searchForm-notApplAgain').is(':checked')){
            $('#outsrcAppl-searchForm-status').val("ENDED");
            $('#outsrcAppl-searchForm-winfoStatus').val("REPAYING");
        }
        var $form = $('#outsrcAppl-searchForm');
        $form.attr('action', url);
        $form.attr('method', "post");
        $form.attr('target', "_black");
        $form.submit();
    }

    //审核通过按钮
    $('#outsrcAppl-auditPassBtn').click(function(){
        operationOutsrc("AUDIT",$('#outsrcAppl-auditPassBtn'),1);
    });

    //审核拒绝按钮
    $('#outsrcAppl-auditRejectBtn').click(function(){
        operationOutsrc("AUDIT",$('#outsrcAppl-auditRejectBtn'),2);
    });

    //提交按钮
    $('#outsrcAppl-submitBtn').click(function(){
        operationOutsrc("SUBMIT",$('#outsrcAppl-submitBtn'));
    });

    //审批通过按钮
    $('#outsrcAppl-approvePassBtn').click(function(){
        operationOutsrc("APPROVE",$('#outsrcAppl-approvePassBtn'),1);
    });

    //审批拒绝按钮
    $('#outsrcAppl-approveRejectBtn').click(function(){
        operationOutsrc("APPROVE",$('#outsrcAppl-approveRejectBtn'),2);
    });

    //结案按钮
    $('#outsrcAppl-endedBtn').click(function(){
        operationOutsrc('ENDED',$('#outsrcAppl-endedBtn'));
    });

    //撤销结案按钮
    $('#outsrcAppl-unDoEndedBtn').click(function(){
        operationOutsrc('UN_DO_ENDED',$('#outsrcAppl-unDoEndedBtn'));
    });

    //案件转正常按钮
    $('#outsrcAppl-toNormalBtn').click(function(){
        operationOutsrc('TO_NORMAL',$('#outsrcAppl-toNormalBtn'));
    });

    /**
    * 审核、提交、审批、结案、撤销结案、案件转正常
    * @param type 操作类型：AUDIT-审核、SUBMIT-提交、APPROVE-审批、ENDED-结案、UN_DO_ENDED-撤销结案、TO_NORMAL-案件转正常
     * @param $btn 按钮
    * @param result 结果：1-通过、2-拒绝
     */
    function operationOutsrc(type,$btn,result){
        var checkedCount = 0;
        var checkArray = new Array();
        $(".case").each(function(i,result){
            if(this.checked){
                checkArray[checkedCount] = $(this).val().split(',')[0];
                checkedCount++;
            }
        });
        if(checkedCount == 0){
            MSG.alert("请选择要操作的案件");
            return false;
        }else{
            var confirmText;
            var url;
            if(type == "AUDIT"){
                confirmText = "确定审核选中的案件？";
                url = "<%=request.getContextPath()%>/rest/outsrcAppl/audit?date=" + new Date().toTimeString();
            }else if(type == "SUBMIT"){
                confirmText = "确定提交选中的案件？";
                url = "<%=request.getContextPath()%>/rest/outsrcAppl/submit?date=" + new Date().toTimeString();
            }else if(type == "APPROVE"){
                confirmText = "确定审批选中的案件？";
                url = "<%=request.getContextPath()%>/rest/outsrcAppl/approve?date=" + new Date().toTimeString();
            }else if(type == "ENDED"){
                confirmText = "确定对选中的案件进行结案？";
                url = "<%=request.getContextPath()%>/rest/outsrcAppl/ended?date=" + new Date().toTimeString();
            }else if(type == "UN_DO_ENDED"){
                confirmText = "确定对选中的案件撤销结案？";
                url = "<%=request.getContextPath()%>/rest/outsrcAppl/unDoEnded?date=" + new Date().toTimeString();
            }else if(type == "TO_NORMAL"){
                confirmText = "确定将选中的案件转正常？";
                url = "<%=request.getContextPath()%>/rest/outsrcAppl/toNormal?date=" + new Date().toTimeString();
            }else{
                MSG.alert("操作类型错误");
                return false;
            }
            MSG.confirm(confirmText,function(){
                $btn.attr("disabled",true);
                $.ajax({
                    type:"POST",
                    dataType: "json",
                    url:url,
                    data: result ? {idsArr:checkArray.toString(),result:result} : {idsArr:checkArray.toString()},
                    success:function(ret){
                        if(ret.success && type != "TO_NORMAL"){
                            $('#outsrcAppl-searchBtn').trigger("click");
                        }
                        $btn.attr("disabled",false);
                        MSG.alert(ret.message);
                    },
                    error:function(jqXHR,textStatus,errorThrown){
                        $btn.attr("disabled",false);
                        MSG.alert("操作执行失败");
                    }
                });
            });
        }
    }

    //申请委外按钮
    $('#outsrcAppl-applBtn').click(function(){
        modalOperationOutsrc("APPL");
    });

    //修改委外信息按钮
    $('#outsrcAppl-modifyBtn').click(function(){
        modalOperationOutsrc('MODIFY');
    });

    //延期按钮
    $('#outsrcAppl-extentedBtn').click(function(){
        modalOperationOutsrc('EXTENTED');
    });

//    //结案按钮
//    $('#outsrcAppl-endedBtn').click(function(){
//        modalOperationOutsrc('ENDED');
//    });

    //发起再扣按钮
    $('#outsrcAppl-reCollectBtn').click(function(){
        modalOperationOutsrc('RE_COLLECT');
    });

    //退回按钮
    $('#outsrcAppl-backBtn').click(function(){
        modalOperationOutsrc('BACK');
    });

    /*
    * 申请委外、修改委外信息、延期、结案、发起再扣、退回
    * @param type 操作类型：APPL-申请委外、MODIFY-修改委外信息、EXTENTED-延期、ENDED-结案、RE_COLLECT-发起再扣、BACK-退回
    */
    function modalOperationOutsrc(type){
        var checkedCount = 0;
        var applId;                     //借款ID
        var idCardNo;                   //身份证号
        var cntrctNo;                   //合同编号
        var overduePeriod;              //最小逾期期数
        var paymentId;                  //放款ID
        var thisArray = new Array();    //单条选中数据
        var checkArray = new Array();   //选中的IDS
        $(".case").each(function(i,result){
            if(this.checked){
                if(checkedCount > 1 && type == 'RE_COLLECT'){
                    MSG.alert("发起再扣不支持批量操作");
                    return false;
                }
                thisArray = $(this).val().split(",");
                checkArray[checkedCount] = thisArray[0];
                applId = thisArray[1];
                idCardNo = thisArray[2];
                cntrctNo = thisArray[3];
                overduePeriod = thisArray[4];
                paymentId = thisArray[5];
                checkedCount++;
            }
        });

        //申请委外
        if(type == 'APPL'){
            if(checkedCount == 0){
                MSG.alert("请选择需要申请委外的案件");
                return false;
            }else{
                $("#applOutsrc-checkedCount").text(checkedCount);              //选定案件数
                $("#applOutsrc-checkedIdsArr").val(checkArray.toString());     //选定ids
                $("#applOutsrc-startDate").text("");                           //校验提醒
                $("#outsrcAppl-applOutsrcForm").resetForm();
                $("#applOutsrcModal").modal("show");
            }
        }
        //修改委外信息
        else if(type == 'MODIFY'){
            if(checkedCount == 0){
                MSG.alert("请选择需要修改的案件");
                return false;
            }else{
                $("#modifyOutsrc-checkedCount").text(checkedCount);              //选定案件数
                $("#modifyOutsrc-checkedIdsArr").val(checkArray.toString());     //选定ids
                $("#modifyOutsrc-comIdError").text("");                         //校验提醒
                $("#outsrcAppl-modifyOutsrcForm").resetForm();
                $("#modifyOutsrcModal").modal("show");
            }
        }
        //延期
        else if(type == 'EXTENTED'){
            if(checkedCount == 0){
                MSG.alert("请选择需要延期的案件");
                return false;
            }else{
                $("#extentedOutsrc-checkedCount").text(checkedCount);              //选定案件数
                $("#extentedOutsrc-checkedIdsArr").val(checkArray.toString());     //选定ids
                $("#extentedOutsrc-monthsError").text("");                         //校验提醒
                $("#outsrcAppl-extentedOutsrcForm").resetForm();
                $("#extentedOutsrcModal").modal("show");
            }
        }
        //结案
        else if(type == 'ENDED'){
            if(checkedCount == 0){
                MSG.alert("请选择需要结案的案件");
                return false;
            }else{
                $("#endedOutsrc-checkedCount").text(checkedCount);              //选定案件数
                $("#endedOutsrc-checkedIdsArr").val(checkArray.toString());     //选定ids
                $("#endedOutsrc-monthsError").text("");                         //校验提醒
                $("#endedOutsrcModal").modal("show");
            }
        }
        //发起再扣
        else if(type == 'RE_COLLECT'){
            if(checkedCount == 0){
                MSG.alert("请选择需要发起再扣的案件");
                return false;
            }else if(checkedCount > 1){
                MSG.alert("发起再扣不支持批量操作");
                return false;
            }else{
                $("#recollectForm").resetForm();
                $("#recollectMessage").text("");
                $("#recollect-applId").val(applId);
                $("#recollect-paymentId").val(paymentId);
                $("#recollect-idCardNo").val(idCardNo);
                $("#recollect-cntrctNo").val(cntrctNo);
                overduePeriod = overduePeriod == 'undefined' ? "" : overduePeriod;
                $("#recollect-overduePeriod").val(overduePeriod);
                $("#recollectModal").modal("show");
            }
        }
        //退回
        else if(type == 'BACK'){
            if(checkedCount == 0){
                MSG.alert("请选择需要退回的案件");
                return false;
            }else{
                $("#backOutsrc-checkedCount").text(checkedCount);              //选定案件数
                $("#backOutsrc-checkedIdsArr").val(checkArray.toString());     //选定ids
                $("#backOutsrc-startDate").text("");                           //校验提醒
                $("#outsrcAppl-backOutsrcForm").resetForm();
                $("#backOutsrcModal").modal("show");
            }
        }else{
            MSG.alert("操作类型错误");
            return false;
        }
    }

    $(document).ready(function() {
        $(".hideBtn").hide();
        //查询表单校验
        outsrcAppl_searchForm_validate($("#outsrcAppl-searchForm"));
    });

    //表单校验
    function outsrcAppl_searchForm_validate($validateForm){
        $validateForm.validate({
            unhighlight: function (element, errorClass, validClass) {
                //验证通过
                $(element).tooltip("destroy").removeClass(errorClass);
            },
            errorPlacement: function (label, element) {
                //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
                $(element).attr("data-placement","bottom");
                $(element).tooltip("destroy"); /* 必需 */
                $(element).attr("title", $(label).text()).tooltip("show");
            },
            rules: {
//                status: {
//                    required: true
//                },
                overDayMin: {
                    digits: true
                },
                overDayMax: {
                    digits: true
                }
            },
            messages: {
//                status: {
//                    required: "请选择委外状态"
//                }
            }
        });
    }

    function caseClick(){
        var checkedCount = 0;
        $(".case").each(function(i,result){
            if(this.checked){
                checkedCount++;
            }
        });
        $("#caseCheckedCount").remove();
        if(checkedCount > 0){
            var html = "<span id='caseCheckedCount'>" + "，已选 " + "<span class='redStar'>" + checkedCount + "</span>" + " 条记录" + "</span>";
            $("#dataTable_info").append(html);
        }
    }

    //案件全选按钮
    $('#checkAllBtn').click(function(){
    	if($(this).get(0).checked==true){
    		$(".case").attr("checked", true);
    	}else{
    		$(".case").attr("checked", false);
    	}
        caseClick();
    });
   
  //点击催记链接存储localStorage值
	$('#dataTable').on('click','.outsrcInfo',function(){
		 var classVal=$(this).attr('class');
		 //console.log(classVal);
		 //使用localStorage存值
		 window.localStorage.setItem("getVal",classVal);
	})

</script>
