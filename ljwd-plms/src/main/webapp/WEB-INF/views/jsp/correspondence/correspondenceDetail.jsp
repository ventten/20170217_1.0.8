<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../taglib/base.jsp"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全部信函</title>
<style>
     .dataTables_scrollBody tbody tr td{
	    padding: 2px 10px !important;
	}
</style>
</head>
<body>
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">全部信函</h3>
        </div>
        <div class="panel-body">
            <div class="aas">
                <form class="searchForm" id="corres_searchForm_detail">
                    <label for="docCode" >信函类别 </label>
                    <select id="docCode" name="docCode" >
                    <option value="">全部</option>
                        <c:forEach items="${categoryList }" var="item">
                            <option value="${item.tmplCode}">${item.tmplName}</option>
                        </c:forEach>
                    </select>
                    <label for="id" >信函编号</label>
                    <input type="text" id=corresCode name="corresCode" class="right-space-2"/>
                    <label for="genBy" >信函生成人</label>
                    <input type="text" id="genBy" name="genByName" />
                    <label for="contractNo" class="line-bottom">合同编号</label>
                    <input type="text" id="contractNo" name="contractNo" />
                    <br/>
                    <label for="loanName" >主&nbsp;&nbsp;贷&nbsp;&nbsp;人 </label>
                    <input type="text" id="loanName" name="loanName"  />
                    <label for="idCardNo" >身份证号</label>
                    <input type="text" id="idCardNo" name="idCardNo" class="right-space-2"/>
                    <label for="genDateFrom" >生&nbsp;成&nbsp;日&nbsp;期</label>
                    <input type="text" class="collection-number" id="genDateFrom" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'genDateTo\',{d:-30});}',maxDate:'#F{$dp.$D(\'genDateTo\',{d:0});}'})" name="genDateFrom"/>
                    <label class="label-center-1">至</label>
                    <input type="text" class="collection-number" id="genDateTo" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'genDateFrom\',{d:0});}',maxDate:'#F{$dp.$D(\'genDateFrom\',{d:30});}'})" name="genDateTo"/>
                    <label for="coStatus" class="line-bottom">信函状态</label>
                    <select id="coStatus" name="coStatus" onchange="coStatusChange()">
                        <option value="0" >已生成</option>
                        <option value="1" >已寄送</option>
                        <option value="2" >已退回</option>
                    </select>
                    <br />
                    <button type="button" class="btn btn-primary right-space-2 left-space-2" id="searchBtn" onclick="corres_init()">查询</button>
                    <span id="btnSpan_id">
                    </span>
                    <shiro:hasPermission name="correspondenceall:export">
                        <button type="button" class="btn btn-default right-space-2" id="outBtn_corres">导出</button>
                    </shiro:hasPermission>
                    <button type="button" class="btn btn-default" id="cancelBtn_corres">清除</button>
                </form>
            </div>
        </div>
    </div>
   
    <input type="hidden" name="userName" id="userName" value="${userId }">
    <table id="dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead id="conrres_thead_detail">
            <tr>
                <th>
                    <input type="checkbox" id="corres_checkall_detail" title="Select all" />
                    &nbsp;&nbsp;全选
                </th>
                <th>信函编号</th>
                <th>信函类别</th>
                <th>收件人</th>
                <th>主贷人</th>
                <th>合同编号</th>
                <th>身份证号</th>
                <th>地址类型</th>
                <th>生成日期</th>
                <th>生成人</th>
                <th>信函状态</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        	<tr class="dataTable_show">
		        <td colspan="12">没有检索到数据</td>
			</tr>
        </tbody>
    </table>
    <!--信函数据详情-->
    <div class="modal fade in" id="corresInfomation" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 800px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_createPdf"></button>
                    <h4 class="modal-title">信函详情</h4>
                </div>
                <div class="modal-body" style="padding: 10px 10px 0px 10px;">
                    <table class="table table-bordered" id="corrInfomation">
                                <tr>
                                    <td width="8%" class="active text-center">信函类别</td>
                                    <td width="20%" class=" text-center" id="documentName_info"></td>
                                    <td width="8%" class="active text-center">收件人</td>
                                    <td width="12%" class=" text-center" id="clientName_info"></td>
                                    <td width="8%" class="active text-center">收件人电话</td>
                                    <td width="12%" class=" text-center" id="clientPhone_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">合同编号</td>
                                    <td width="20%" class=" text-center" id="contractNo_info"></td>
                                    <td width="8%" class="active text-center">主贷人</td>
                                    <td width="12%" class=" text-center" id="loanName_info"></td>
                                    <td width="8%" class="active text-center">身份证号</td>
                                    <td width="12%" class=" text-center" id="idCardNo_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">信函生成人</td>
                                    <td width="20%" class=" text-center" id="genByName_info"></td>
                                    <td width="8%" class="active text-center">生成日期</td>
                                    <td width="12%" class=" text-center" id="genTime_info"></td>
                                    <td width="8%" class="active text-center">逾期天数</td>
                                    <td width="12%" class=" text-center" id="overdueDay_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">逾期本金/保证金</td>
                                    <td width="20%" class=" text-center" id="principal_info"></td>
                                    <td width="8%" class="active text-center">逾期违约金</td>
                                    <td width="12%" class=" text-center" id="overdueInterest_info"></td>
                                    <td width="8%" class="active text-center">扣款失败手续费</td>
                                    <td width="12%" class=" text-center" id="failCollectFee_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">利息和居间费</td>
                                    <td width="20%" class=" text-center" id="brokerFee_info"></td>
                                    <td width="8%" class="active text-center">催收费</td>
                                    <td width="12%" class=" text-center" id="collectCost_info"></td>
                                    <td width="8%" class="active text-center">划扣手续费</td>
                                    <td width="12%" class=" text-center" id="creaditFee_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">费用合计</td>
                                    <td colspan="5" width="12%" class=" text-center" id="totalAmount_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">地址类别</td>
                                    <td width="20%" class=" text-center" id="addrType_info"></td>
                                    <td width="8%" class="active text-center">客户地址</td>
                                    <td colspan="3" width="12%" class=" text-center" id="addres_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">退回类型</td>
                                    <td colspan="5" width="20%" class=" text-center" id="rebackType_info"></td>
                                </tr>
                                <tr>
                                    <td width="8%" class="active text-center">退回备注</td>
                                    <td colspan="5" width="20%" class=" text-center" id="reback_info"></td>
                                </tr>
                            </table>
                </div>
                <div class="modal-footer" style="text-align:center;padding-top: 10px;">
                        <span style="font-size: 16px;color: #000;border-bottom: solid 2px #000;float: left; ">寄送结果</span>
                        <br/>
                        <div style="float: left;margin-top: 20px">
                            <label >
                                <input type="checkbox" id="coStatus_info_sed"  disabled="disabled">
                            </label>
                            <span>寄送成功</span>
                            <label style="margin-left: 20px">
                                <input type="checkbox" id="coStatus_info_bak"  disabled="disabled">
                            </label>
                            <span>信函退回</span>
                        </div>
                </div>
            </div>
        </div>
    </div>
    <!--填写信函退回原因-->
    <div class="modal fade in" id="corresReBackInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 600px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="close_reback"></button>
                    <h4 class="modal-title">退信情况</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="corresReback_form">
                        <input type="hidden" id="corres_ids" name="paras" value=""/>
                        <input type="hidden" id="rebackTypeInfo" name="rebackTypeInfo" value=""/>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span class="redStar">* </span>退回类型</label>
                            <div style="width: 70%;" class="col-sm-6">
                                <select style="width: 150px;" class="form-control" name="rebackTypeOne" id="rebackTypeOne" onchange="changeRebackTypeOne('2',this)">
                                </select>
                                <select style="width: 150px;" class="form-control" name="rebackTypeTwo" id="rebackTypeTwo">
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">
                                <span class="redStar">* </span>退回日期
                            </label>
                            <div class="col-sm-6">
                                <input type="text" style="width: 184px !important;text-align: center;" class="collection-number" id="rebackDate" onFocus="WdatePicker({readOnly:true,maxDate:'%y-%M-%d'})" name="rebackDate" data-placement="bottom"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <textarea id="rebackInfo" name="rebackInfo" rows="5" cols="50" style="resize:none"></textarea>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer" style="text-align:center;padding-top: 10px;">
                    <button class="btn btn-primary" type="button" class="btn blue" id="corres_rebackBtn">确定</button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript">
    $(document).ready(function(){
        contactor_validate($("#corresReback_form"));
        coStatusChange();
    });
  //表单校验  第一个参数为选择器，第二个参数为传入改变的的验证方式
    function contactor_validate($validateForm){
        $validateForm.validate({
            unhighlight: function (element, errorClass, validClass) { //验证通过
                $(element).tooltip("destroy").removeClass(errorClass);
            },
            errorPlacement: function (label, element) {
                //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
                $(element).attr("data-placement","bottom");
                $(element).tooltip("destroy"); /*必需*/
                $(element).attr("title", $(label).text()).tooltip("show"); 
            },
            rules: {
                rebackTypeOne: {
                    required: true
                },
                rebackDate: {
                    required: true
                }
            },
            messages: {
                rebackTypeOne: {
                    required: "请选择退回类型"
                },
                rebackDate: {
                    required: "请输入退回日期"
                }
            }
        });
    }
    //初始化查询列表分页数据
    //Table初始化方法
   <%--  function corres_init(){
        policy_table = P.dataTable($("#dataTable"),
                $("#corres_searchForm_detail"),
                "<%=request.getContextPath()%>/rest/correspondence/selectCorrespondencePagelist",
                [{"mData" : function(row,type, set, meta) {
                    return "<input type='checkbox' name='cehDetail' class='case' name='case' value='"+ row.id +"&&"+row.coStatus+"&&"+row.corresCode+"'></input>&nbsp;&nbsp;<span>"+ (row.rowNo)+ "</span>";
                }},
                {
                    "mData" : "corresCode","sDefaultContent" : ""
                },
                {
                    "mData" : "documentName","sDefaultContent" : ""
                },
                {
                    "mData" : "clientName","sDefaultContent" : ""
                },
                {
                    "mData" : "clientName","sDefaultContent" : ""
                },
                {
                    "mData" : "contractNo","sDefaultContent" : ""
                },
                {
                    "mData" : "idCardNo","sDefaultContent" : ""
                },
                {
                    "mData" : function(row,type, set, meta) {
                        var arr = row.parameter.split("(&&)");
                        var addrType = arr[0].split("(&)"); //地址类型
                        return addrType[1];
                    }
                },
                {
                    "mData" : "genTime","sDefaultContent" : ""
                },
                {
                    "mData" : "genByName","sDefaultContent" : ""
                },
                {
                    "mData" : function(row,type, set, meta) {
                        if (row.coStatus == 0) {
                            return "<span>已生成</span>";
                        } else if (row.coStatus == 1) {
                            return "<span style='color:blue'>已寄送</span>";
                        }else if (row.coStatus == 2) {
                            return "<span style='color:red'>已退回</span>";
                        } else {
                            return "";
                        }
                    }
                },
                {
                    "mData" : function(row,type, set, meta) {
                        return "<a href='#' onclick=\"getCorrInfomation('"+ row.id+ "','"+ row.clientName+ "','"+ row.idCardNo+ "')\">详情</a>";
                    }
                } ], 100);} --%>
    
  //Table初始化方法
  function corres_init(){
	$('#dataTable').DataTable({
         "scrollY": '409px',
         "scrollX": '100%',
         "sScrollXInner": "100%",
         "bScrollCollapse": true,

         "sPaginationType": "full_numbers",      //设置分页控件的模式
         "bLengthChange": false,                 //改变每页显示数据数量
         "bPaginate": true,                      //是否翻页功能
         "bFilter": false,                       //是否过滤功能
         "bInfo": true,                         //是否页脚信息
         "bSort": true,                            //是否排序功能

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
         "bProcessing": false,       //加载数据时显示正在加载信息
         "bServerSide": true,        //指定从服务器端获取数据
         "sAjaxSource" : "<%=request.getContextPath()%>/rest/correspondence/selectCorrespondencePagelist",
         "fnServerData" : function(sSource, aoData, fnCallback) {
             //参数拼接
             var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#corres_searchForm_detail").serialize();
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
               {"mData" : function(row,type, set, meta) {
                    return "<input type='checkbox' name='cehDetail' class='case' name='case' value='"+ row.id +"&&"+row.coStatus+"&&"+row.corresCode+"'></input>&nbsp;&nbsp;<span>"+ (row.rowNo)+ "</span>";
                }},
                {"mData" : "corresCode","sDefaultContent" : ""},
                {"mData" : "documentName","sDefaultContent" : ""},
                {"mData" : "clientName","sDefaultContent" : ""},
                {"mData" : "clientName","sDefaultContent" : ""},
                {"mData" : "contractNo","sDefaultContent" : ""},
                {"mData" : "idCardNo","sDefaultContent" : ""},
                {"mData" : "addrType","sDefaultContent" : ""},
                {"mData" : "genTime","sDefaultContent" : ""},
                {"mData" : "genByName","sDefaultContent" : ""},
                {"mData" : "coStatusFmt","sDefaultContent" : ""},
                {
                    "mData" : function(row,type, set, meta) {
                        return "<a style=\"cursor:pointer\" onclick=\"getCorrInfomation('"+ row.id+ "','"+ row.clientName+ "','"+ row.idCardNo+ "')\">详情</a>";
                    }
                }
         ],
         "aoColumnDefs":[
                {"bSortable":false,"aTargets": [0]}                          
          ]
     });
   }
  
$("#corres_checkall_detail").click(function() {
    if ($(this).get(0).checked == true) {
        $(".case").prop("checked", true);
    } else {
        $(".case").prop("checked", false);
    }
});
//点击确认寄送，修改寄送状态
function changeStatus() {
    var ids = '';
    $('input[type="checkbox"]:checked').each(function() {
        ids += $(this).val() + ',';
    })
    ids = ids.substring(0, ids.length - 1);
    if(ids.substring(ids.length - 3, ids.length) == ",on"){
        ids = ids.substring(0, ids.length-3);
    }
    if(ids.substring(0, 3) == "on,"){
    	ids = ids.substring(3, ids.length);
    }
    if (ids == null || ids == "") {
        MSG.show("请勾选一条数据！");
        return;
    }
    var arrStr = ids.split(",");
    for (var i = 0; i < arrStr.length; i++) {
        var aStr = arrStr[i].split("&&");
        if (aStr[1] == 1) {
            MSG.show("已寄送的数据不能再次勾选！");
            return;
        }
    }
    $.ajax({
        type : "post",
        dataType : "json",
        url : "<%=request.getContextPath()%>/rest/correspondence/changeStatus",
        data:{
            "ids":ids
        },
        success:function(data){
            //如果更新失败
            if(data.data == false){
                MSG.show(data.message);
            }else{
                MSG.show(data.message);
                corres_init();
            }
        }
    }); 
}
    //导出按钮
    $('#outBtn_corres').click(function(){
        if($("#dataTable tbody tr:visible").length == 0){
            MSG.show("没有可以导出的数据！");
            return;
        }
        var url = "<%=request.getContextPath()%>/rest/correspondence/exportExcelCorres?"+new Date().toTimeString();
        $('#corres_searchForm_detail').attr("disabled",true);
        $('#corres_searchForm_detail').attr("action", url);
        $('#corres_searchForm_detail').attr("method", "post");
        $('#corres_searchForm_detail').attr("target", "");
        $('#corres_searchForm_detail').submit();   
        $('#corres_searchForm_detail').attr("disabled",false);
    });
    //清空
    $("#cancelBtn_corres").click(function(){
        $("#corres_searchForm_detail input").val("");
        $("#corres_searchForm_detail select").find("option:first").prop("selected",true);
        coStatusChange();
    });
    //通过ID查询被选中的数据详情
    function getCorrInfomation(corrId,clientName,idCardNo){
        $.ajax({
            url: "<%=request.getContextPath()%>/rest/correspondence/getCorrImfomationById",
            type: "post",
            dataType: "json",
            data:{
                "corrId": corrId,
                "clientName": clientName,
                "idCardNo": idCardNo
                },
            success: function(data){
                if(data.success == false){
                    MSG.show(data.message);
                    return;
                }else{
                	var tol = data.data.totalAmount == null?"":data.data.totalAmount;
                	var cre = data.data.creaditFee == null?"":data.data.creaditFee;
                	var amtol = tol + cre;
                    $("#documentName_info").text(data.data.documentName == null?"":data.data.documentName);
                    $("#clientName_info").text(data.data.clientName == null?"":data.data.clientName);
                    $("#clientPhone_info").text(data.data.clientPhone == null?"":data.data.clientPhone);
                    $("#contractNo_info").text(data.data.contractNo == null?"":data.data.contractNo);
                    $("#loanName_info").text(data.data.loanName == null?"":data.data.loanName);
                    $("#idCardNo_info").text(data.data.idCardNo == null?"":data.data.idCardNo);
                    $("#genByName_info").text(data.data.genByName == null?"":data.data.genByName);
                    $("#genTime_info").text(formatDate_corre(data.data.genTime));
                    $("#overdueDay_info").text(data.data.overdueDay == null?"":data.data.overdueDay);
                    $("#principal_info").text(data.data.principal == null?"":data.data.principal);
                    $("#overdueInterest_info").text(data.data.overdueInterest == null?"":data.data.overdueInterest);
                    $("#failCollectFee_info").text(data.data.failCollectFee == null?"":data.data.failCollectFee);
                    $("#brokerFee_info").text(data.data.brokerFee == null?"":data.data.brokerFee);
                    $("#collectCost_info").text(data.data.collectCost == null?"":data.data.collectCost);
                    $("#creaditFee_info").text(data.data.creaditFee == null?"":data.data.creaditFee);
                    $("#totalAmount_info").text(amtol);
                    
                    $("#addrType_info").text(data.data.addrType == null?"":data.data.addrType);
                    $("#addres_info").text(data.data.addres == null?"":data.data.addres);
                    $("#rebackType_info").text(data.data.rebackTypeInfo == null?"":data.data.rebackTypeInfo);
                    $("#reback_info").text(data.data.rebackInfo == null?"":data.data.rebackInfo);
                    //如果信函以发送就勾选，否则去掉勾选
                    if(data.data.coStatus == 0){
                        $("#coStatus_info_sed").prop("checked",false);
                        $("#coStatus_info_bak").prop("checked",false);
                    }
                    else if(data.data.coStatus == 1){
                        $("#coStatus_info_sed").prop("checked",true);
                        $("#coStatus_info_bak").prop("checked",false);
                    }
                    else if(data.data.coStatus == 2){
                        $("#coStatus_info_sed").prop("checked",false);
                        $("#coStatus_info_bak").prop("checked",true);
                    }
                    //如果没有地址，地址状态就为无效
                    if(data.data.addres == null || data.data.addres == ""){
                        $("#coStatus_info_addr").attr("checked",true);
                    }else{
                        $("#coStatus_info_addr").prop("checked",false);
                    }
                    //显示弹窗
                    $("#corresInfomation").modal("show");
                }
            }
        });
    }
    //修改信函状态为“已退回”
    function returnStatus(){
        //移除验证提示
        $(".tooltip").remove();
        rebackTypeOne();
        $("#rebackDate").val("");
        $("#rebackInfo").val("");
        var paras = '';
        $('input[type="checkbox"]:checked').each(function() {
            paras += $(this).val() + ',';
        })
        paras = paras.substring(0, paras.length - 1);
        if(paras.substring(paras.length - 3, paras.length) == ",on"){
            paras = paras.substring(0, paras.length-3);
        }
        if(paras.substring(0, 3) == "on,"){
            paras = paras.substring(3, paras.length);
        }
        if (paras == null || paras == "") {
            MSG.show("请至少勾选一条数据！");
            return;
        }
        var arrStr = paras.split(",");
        if(arrStr.length == 1){
            var aStr = arrStr[0].split("&&");
            if (aStr[1] == 0) {
                MSG.show("所选数据还未寄送，不能生成退回信息！");
                return;
            }else if(aStr[1] == 2){
                MSG.show("所选数据已经退回，不能重复操作！");
                return;
            }
        }else{
            for (var i = 0; i < arrStr.length; i++) {
                var aStr = arrStr[i].split("&&");
                if (aStr[1] == 0) {
                    MSG.show("信函编号为："+aStr[2]+"的数据还未寄送，不能生成退回信息！");
                    return;
                }else if(aStr[1] == 2){
                	MSG.show("信函编号为："+aStr[2]+"的数据已经退回，不能重复操作！");
                    return;
                }
            }
        }
        $("#corresReBackInfo").modal("show");
    }
    //退回劝人按钮
    $("#corres_rebackBtn").on("click",function(){
        if(!$("#corresReback_form").valid()){
            return false;
        }
        var paras = '';
        $('input[type="checkbox"]:checked').each(function() {
            paras += $(this).val() + ',';
        })
        paras = paras.substring(0, paras.length - 1);
        if(paras.substring(paras.length - 3, paras.length) == ",on"){
            paras = paras.substring(0, paras.length-3);
        }
        if(paras.substring(0, 3) == "on,"){
        	paras = paras.substring(3, paras.length);
        }
        if (paras == null || paras == "") {
            MSG.show("请至少勾选一条数据！");
            return;
        }
        var arrStr = paras.split(",");
        if(arrStr.length == 1){
            var aStr = arrStr[0].split("&&");
            if (aStr[1] == 0) {
                MSG.show("所选数据还未寄送，不能生成退回信息！");
                return;
            }else if(aStr[1] == 2){
                MSG.show("所选数据已经退回，不能重复操作！");
                return;
            }
        }else{
            for (var i = 0; i < arrStr.length; i++) {
                var aStr = arrStr[i].split("&&");
                if (aStr[1] == 0) {
                    MSG.show("信函编号为："+aStr[2]+"的数据还未寄送，不能生成退回信息！");
                    return;
                }else if(aStr[1] == 2){
                    MSG.show("信函编号为："+aStr[2]+"的数据已经退回，不能重复操作！");
                    return;
                }
            }
        }
        //动态添加选中的信函ID拼接字符串
        $("#corres_ids").val(paras);
        var selectone = $("#rebackTypeOne").find("option:selected").text();
        var selecttwo = $("#rebackTypeTwo").find("option:selected").text();
        var typeStr = selectone=="地址正确"?(selectone+"，"+selecttwo):(selectone+selecttwo);
        $("#rebackTypeInfo").val(typeStr);
        $.ajax({
            type : "post",
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/correspondence/changeStatusAndAddRebackInfo",
            data: $("#corresReback_form").serialize(),
            success:function(data){
                if(data.success == true){
                    MSG.show(data.message);
                    $("#close_reback").click();
                    corres_init();
                }else if(data.success == false){
                    MSG.show(data.message);
                }
            }
        }); 
    });
    //退回类型联动-第一个下拉框的初始值
    function rebackTypeOne(){
        $.ajax({
            type : "post",
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/correspondence/selectRebackTypeOne",
            success:function(data){
                var html = "";
                for(var i=0;i<data.data.length;i++){
                    html +="<option value='"+data.data[i].rebackTypeCode+"'>"+data.data[i].rebackTypeName+"</option>";
                }
                $("#rebackTypeOne").html(html);
                changeRebackTypeOne("1",data.data[0].rebackTypeCode);
            }
        }); 
    }
    //退回类型联动-第二个下拉框的初始值
    function changeRebackTypeOne(toArr,obj){
        var para;
        //如果等于2就是change事件，否则等于1是联动调用
        if(toArr == "2"){
            para = $(obj).find("option:selected").val();
        }else if(toArr == "1"){
            para = obj;
        }
        $.ajax({
            type : "post",
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/correspondence/selectRebackTypeOne",
            data: {"para": para},
            success:function(data){
                var html = "";
                for(var i=0;i<data.data.length;i++){
                    html +="<option value='"+data.data[i].rebackTypeCode+"'>"+data.data[i].rebackTypeName+"</option>";
                }
                $("#rebackTypeTwo").html(html);
            }
        }); 
    }
    //时间戳转时间格式
    function   formatDate_corre(now){
      if(now==""||now==null){
          return "";
      }
        var date = new Date(now);
        var   year=date.getFullYear();     
        var   month=date.getMonth()+1;     
        var   day=date.getDate();     
        var   hour=date.getHours();     
        var   minute=date.getMinutes();     
        var   second=date.getSeconds();     
        return   year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;     
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
    //信函状态下拉框change事件
    function coStatusChange(){
    	if($("#coStatus").find("option:selected").val() == "0"){
    		$("#btnSpan_id").html("<shiro:hasPermission name='correspondenceall:update'><button type=\"button\" class=\"btn btn-primary right-space-2\" id=\"allocBtn\" onclick=\"changeStatus()\">确认寄送</button></shiro:hasPermission>");
    	}else if($("#coStatus").find("option:selected").val() == "1"){
    		$("#btnSpan_id").html("<shiro:hasPermission name='correspondenceall:update'><button type=\"button\" class=\"btn btn-primary right-space-2\" id=\"allocBtn_reback\" onclick=\"returnStatus()\">信函退回</button></shiro:hasPermission>");
    	}else{
    		$("#btnSpan_id").html("");
    	}
    }
</script>
</body>
