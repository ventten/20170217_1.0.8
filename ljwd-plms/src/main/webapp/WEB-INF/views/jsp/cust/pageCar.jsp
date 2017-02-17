<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>车辆信息</title>
</head>
<div class="plms-content">
    <div class="panel-body">
        <form class="searchForm" id="car-searchForm">
            <label for="srcCode" class="right-space-2">来源</label>
            <select id="srcCode" name="srcCode" class="right-space-2">
                <option value="">全部</option>
                <c:forEach items="${sourceList}" var="item">
                    <option value="${item.code}">${item.val}</option>
                </c:forEach>
            </select>
            <!--客户ID，说明哪个用户下的数据-->
            <input type="hidden" value="${clCustId}" name="clCustId">
            <input class="btn btn-primary right-space-2" type="button" id="car-searchBtn" value="查询"/>
            <shiro:hasPermission name="car:insert">
                <input class="btn btn-primary" type="button" value="新增" id="car_addBtn"/>
            </shiro:hasPermission>
        </form>
    </div>
    <table id="car-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">来源</th>
            <th class="text-center">车牌号</th>
            <th class="text-center">车架号</th>
            <th class="text-center">车辆型号</th>
            <th class="text-center">出厂日期</th>
            <th class="text-center">购买方式</th>
            <th class="text-center">月供(元）</th>
            <th class="text-center">抵押时间</th>
            <th class="text-center">抵押银行</th>
            <th class="text-center">还款时间</th>
            <th class="text-center">评估金额</th>
            <th class="text-center">车辆有效性</th>
            <th class="text-center">无效原因</th>
            <th class="text-center">维护人</th>
            <th class="text-center">维护时间</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
    </table>

    <!--添加窗口-->
    <div class="modal fade hideModal" id="car-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog " style="width: 700px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">车辆信息-新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="car_addForm">
                        <!--客户ID，说明哪个用户下的数据-->
                        <input type="hidden" value="${clCustId}" name="clCustId">
						<table>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>来源</label>
                                        <div class="col-sm-6 inputWidth">
                                            <select class="form-control" name="srcCode" data-placement="bottom">
                                                <c:forEach items="${sourceList}" var="item">
                                                    <c:if test="${('NETWORK' eq item.code) == true || ('EXTMECHAN' eq item.code) == true}">
                                                        <option value="${item.code}">${item.val}</option>
                                                    </c:if>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>车牌号</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control" name="licenseNo" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>车架号</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control" name="frameNo" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>车辆型号</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control" name="model" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>购买方式</label>
                                        <div class="col-sm-6 inputWidth">
                                            <select class="form-control" name="purchaseMode" id="purchaseModeCar" data-placement="bottom">
                                                <option value="DISPOSABLE">一次性支付</option>
                                                <option value="MORTGAGE">按揭购买</option>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">月供</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control" name="monRpmnt" id="monRpmnt" data-placement="bottom" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>出厂日期</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="productionDateCar" name="productionDate" readonly="readonly" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">抵押银行</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <select class="form-control" name="mortgageBank" id="mortgageBankCar" data-placement="bottom">
                                                <option value=""></option>
                                                <c:forEach items="${bankList}" var="item">
                                                    <option value="${item.val}">${item.val}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">抵押时间</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="mortgageDate" id="mortgageDateCar" readonly="readonly" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">评估金额</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control" name="estimationAmt" id="estimationAmtCar" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">还款时间</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="rpmntDate" id="rpmntDateCar" readonly="readonly" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3"></label>
                                        <div class="col-sm-7">
                                            <span class="redStar redStarMessages"></span>
                                        </div>
                                    </div>
                                </td>
                            </tr>

                        </table>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="car-addBtn">
                        新增
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>

    <!--维护窗口-->
    <div class="modal fade hideModal" id="car-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog " style="width: 700px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">车辆信息-维护</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="car_updateForm">

                        <!--隐藏的ID和版本号,修改数据的条件,必传-->
                        <input type="hidden" name="id" id="edit_car_id">
                        <input type="hidden" name="recVer" id="edit_car_recVer">
                        <input type="hidden" value="${clCustId}" name="clCustId">
						<table>
                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>来源</label>
                                        <div class="col-sm-6 inputWidth">
                                            <select class="form-control mayDisabled" id="edit_car_srcCode" name="srcCode" data-placement="bottom">
                                                <c:forEach items="${sourceList}" var="item">
                                                    <option value="${item.code}">${item.val}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>车牌号</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control mayDisabled" id="edit_car_licenseNo" name="licenseNo" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>车架号</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control mayDisabled" id="edit_car_frameNo" name="frameNo" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>车辆型号</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control mayDisabled" id="edit_car_model" name="model" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>购买方式</label>
                                        <div class="col-sm-6 inputWidth">
                                            <select class="form-control mayDisabled" id="edit_car_purchaseMode" name="purchaseMode" data-placement="bottom">
                                                <option value="DISPOSABLE">一次性支付</option>
                                                <option value="MORTGAGE">按揭购买</option>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">月供</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control mayDisabled" data-placement="bottom" id="edit_car_monRpmnt" name="monRpmnt">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>出厂日期</label>
                                        <div class="col-sm-6 inputWidth">
                                            <input type="text" class="form-control mayDisabled" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="edit_car_productionDate" name="productionDate" data-placement="bottom" readonly="readonly">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">抵押银行</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <select class="form-control mayDisabled" id="edit_car_mortgageBank" name="mortgageBank" data-placement="bottom">
                                                <option value=""></option>
                                                <c:forEach items="${bankList}" var="item">
                                                    <option value="${item.val}">${item.val}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">抵押时间</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control mayDisabled" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="edit_car_mortgageDate" name="mortgageDate" data-placement="bottom" readonly="readonly">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">评估金额</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control mayDisabled" id="edit_car_estimationAmt" name="estimationAmt" data-placement="bottom" >
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred">还款时间</label>
                                        <div class="col-sm-6 inputWidth addred_div">
                                            <input type="text" class="form-control mayDisabled" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"  id="edit_car_rpmntDate" name="rpmntDate" data-placement="bottom" readonly="readonly">
                                        </div>
                                    </div>
                                </td>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith ">数据有效性</label>
                                        <div class="col-sm-6 inputWidth">
                                            <select class="form-control" id="edit_car_isActive" name="isActive">
                                                <option value="Y">有效</option>
                                                <option value="N">无效</option>
                                            </select>
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred_one">无效原因</label>
                                        <div class="col-sm-6 inputWidth ">
                                            <input type="text" class="form-control" id="edit_car_remark" name="remark" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <td>
                                    <div class="form-group">
                                        <label class="col-sm-3"></label>
                                        <div class="col-sm-7">
                                            <span class="redStar redStarMessages"></span>
                                        </div>
                                    </div>
                                </td>
                            </tr>

					    </table>
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="car-updateBtn">
                        维护
                    </button>
                    <button class="btn btn-primary" type="button" class="btn blue" id="car-deleteBtn">
                        删除
                    </button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">
                        返回
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageCarLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            car_init();
        }
    });

    //分页Table
    var car_table;

    //Table初始化方法    
    function car_init(){
    	car_table=$('#car-dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageCarData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#car-searchForm").serialize();
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
					{"mData" : "srcVal","sDefaultContent" : ""},
                    {"mData" : "licenseNo","sDefaultContent" : ""},
                    {"mData" : "frameNo","sDefaultContent" : ""},
                    {"mData" : "model","sDefaultContent" : ""},
                    {"mData" : "productionDateFmt","sDefaultContent" : ""},
                    {"mData" : "purchaseModeText","sDefaultContent" : ""},
                    {"mData" : "monRpmnt","sDefaultContent" : ""},
                    {"mData" : "mortgageDateFmt","sDefaultContent" : ""},
                    {"mData" : "mortgageBank","sDefaultContent" : ""},
                    {"mData" : "rpmntDateFmt","sDefaultContent" : ""},
                    {"mData" : "estimationAmt","sDefaultContent" : ""},
                    {"mData" : "isActiveText","sDefaultContent" : ""},
                    {"mData" : "remark","sDefaultContent" : ""},
                    {"mData" : "updatedUserName","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            <shiro:hasPermission name="car:update">
                                $(nTd).html("<a href='javascript:void(0);' onclick='car_editFun(\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.srcCode + "\",\"" + oData.licenseNo + "\",\"" + oData.frameNo + "\",\"" + oData.model + "\",\"" + oData.purchaseMode + "\",\"" + oData.monRpmnt + "\",\"" + oData.productionDate + "\",\"" + oData.mortgageBank + "\",\"" + oData.mortgageDate + "\",\"" + oData.estimationAmt + "\",\"" + oData.rpmntDate + "\",\"" + oData.isActive + "\",\"" + oData.createdBy + "\",\"" + oData.remark + "\")'>维护</a>");
                            </shiro:hasPermission>
                        }
                    }
             ]
         });
       }

    //编辑数据
    function car_editFun(id,recVer,srcCode, licenseNo, frameNo, model,purchaseMode,monRpmnt,productionDate,mortgageBank,mortgageDate,estimationAmt,rpmntDate,isActive,createdBy,remark) {
    	//移除验证提示
        $(".tooltip").remove();
    	$("#edit_car_id").val(id);
        $("#edit_car_recVer").val(recVer);
        $("#edit_car_licenseNo").val(licenseNo=="undefined"?"":licenseNo);
        $("#edit_car_frameNo").val(frameNo=="undefined"?"":frameNo);
        $("#edit_car_model").val(model=="undefined"?"":model);
        $("#edit_car_monRpmnt").val(monRpmnt=="undefined"?"":monRpmnt);
        $("#edit_car_productionDate").val(formatDatePo_car(productionDate));
        $("#edit_car_mortgageBank").val(mortgageBank=="undefined"?"":mortgageBank);
        $("#edit_car_mortgageDate").val(formatDatePo_car(mortgageDate));
        $("#edit_car_estimationAmt").val(estimationAmt=="undefined"?"":estimationAmt);
        $("#edit_car_rpmntDate").val(formatDatePo_car(rpmntDate));

        $("#edit_car_srcCode").val(srcCode);
        $("#edit_car_purchaseMode").val(purchaseMode=="undefined"?"":purchaseMode);
        $("#edit_car_isActive").val(isActive);
        $("#edit_car_remark").val(remark=="undefined"?"":remark);

        $(".redStarMessages").text("");

        //当前用户等于此条数据的创建人,可以删除和修改
        deleteBtnShowOrHide(createdBy,$("#car-deleteBtn"));
        $("#car-update").modal("show");
        if(purchaseMode == "MORTGAGE"){
        	$(".addred .redStar").remove();
            $(".addred").prepend("<span class=\"redStar\">* </span>");
            //按揭支付选项的时候这些输入框可以输入
            $(".addred_div").find("input").prop("disabled",false);
            $(".addred_div").find("select").prop("disabled",false);
        }else{
            $(".addred .redStar").remove();
            $(".addred_div .tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
            //一次性支付选项的时候这些输入框禁止输入
            $(".addred_div").find("input").prop("disabled",true);
            $(".addred_div").find("select").prop("disabled",true);
            //清空禁止输入框的值
            $(".addred_div").find("input").val("");
            $(".addred_div").find("select").find("option:first").prop("selected",true);
        }
        if(isActive == "N"){
        	$("#edit_car_remark").prop("disabled",false);
        	$("#edit_car_remark").parent().parent().find(".addred_one").find(".redStar").remove();
        	$("#edit_car_remark").parent().parent().find(".addred_one").prepend("<span class=\"redStar\">* </span>");
        }else{
        	$("#edit_car_remark").prop("disabled",true);
        	$("#edit_car_remark").parent().parent().find(".addred_one").find(".redStar").remove();
        }
    }

    //数据有效性的change
    $("#edit_car_isActive").on("change",function(){
    	if($(this).val() == "N"){
    		$("#edit_car_remark").prop("disabled",false);
    		$("#edit_car_remark").parent().parent().find(".addred_one").prepend("<span class=\"redStar\">* </span>");
        }else{
        	$("#edit_car_remark").val("");
        	$("#edit_car_remark").prop("disabled",true);
        	$("#edit_car_remark").parent().parent().find(".addred_one").find(".redStar").remove();
        	$("#edit_car_remark").parent().parent().find(".tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
        }
    });

    //打开新增窗口
    $("#car_addBtn").on("click",function(){
        $(".redStarMessages").text("");
    	$("#car-add").modal("show");
    	//重置form
    	$("#car_addForm").find("input[type='text']").val('');
        $("#car_addForm select").find("option:first").prop("selected",true);
    	//移除验证提示
        $(".tooltip").remove();
    	//判断是否显示必选*号
    	if($("#purchaseModeCar").val() == "MORTGAGE"){
            $(".addred").prepend("<span class=\"redStar\">* </span>");
            //按揭支付选项的时候这些输入框可以输入
            $(".addred_div").find("input").prop("disabled",false);
            $(".addred_div").find("select").prop("disabled",false);
        }else{
            $(".addred .redStar").remove();
            $(".addred_div .tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
            //一次性支付选项的时候这些输入框禁止输入
            $(".addred_div").find("input").prop("disabled",true);
            $(".addred_div").find("select").prop("disabled",true);
            //清空禁止输入框的值
            $(".addred_div").find("input").val("");
            $(".addred_div").find("select").find("option:first").prop("selected",true);
        }
    });

    //购买方式change事件
    $("select[name='purchaseMode']").on("change",function(){
    	if($(this).val() == "MORTGAGE"){
    		$(".addred .redStar").remove();
    		$(".addred").prepend("<span class=\"redStar\">* </span>");
    		//按揭支付选项的时候这些输入框可以输入
    		$(".addred_div").find("input").prop("disabled",false);
    		$(".addred_div").find("select").prop("disabled",false);
    	}else{
    		$(".addred .redStar").remove();
    		$(".addred_div .tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
    		//一次性支付选项的时候这些输入框禁止输入
            $(".addred_div").find("input").prop("disabled",true);
            $(".addred_div").find("select").prop("disabled",true);
            //清空禁止输入框的值
            $(".addred_div").find("input").val("");
            $(".addred_div").find("select").find("option:first").prop("selected",true);
    	}
    });

    //查询按钮提交
    $('#car-searchBtn').on( 'click', function () {
        car_table.search($("#car-searchForm").serialize()).draw();  //刷新页面
    });

    //新增按钮提交
    $('#car-addBtn').on( 'click', function () {
        //表单校验
        if (!$('#car-add #car_addForm').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#car_addForm");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/cust/addCar",form,content,car_table);
    });

    //维护按钮提交
    $('#car-updateBtn').on( 'click', function () {
        //表单校验
        if (!$('#car-update #car_updateForm').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#car_updateForm");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/cust/updateCar",form,content,car_table);
    });

    //删除按钮提交，按钮ID唯一
    $('#car-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#car_updateForm");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deleteCar",form,content,car_table);
        });
    });

    $(document).ready(function() {
        //新增表单校验
        car_validate($("#car-add #car_addForm"));
        //维护表单校验
        car_validate($("#car-update #car_updateForm"));
    });

    //表单校验
    function car_validate($validateForm){
        //购买方式
        $validateForm.validate({
        	unhighlight: function (element, errorClass, validClass) { //验证通过
                $(element).tooltip("destroy").removeClass(errorClass);
            },
            errorPlacement: function (label, element) {
                $(element).attr("data-placement","bottom");//让验证提示显示在验证框下面
                $(element).tooltip("destroy"); /*必需*/
                $(element).attr("title", $(label).text()).tooltip("show"); 
            },
            rules: {
                licenseNo: {
                    required: true,minlength:2
                },
                frameNo: {
                    required: true,minlength:2
                },
                model: {
                    required: true,minlength:2
                },
                productionDate: {
                    required: true,date:true
                },
                monRpmnt: {
                    required:true,
                    number:true
                },
                mortgageDate: {
                    required: true,date:true
                },
                mortgageBank: {
                    required: true
                },
                estimationAmt: {
                    required: true,number:true
                },
                rpmntDate: {
                    required: true,date:true
                },
                remark: {
                    required: true
                }
            },
            messages: {
                licenseNo: {
                    required: "请输入车牌号"
                },
                frameNo: {
                    required: "请输入车架号"
                },
                model: {
                    required: "请输入车辆型号"
                },
                productionDate: {
                    required: "请选择出厂日期"
                },
                monRpmnt: {
                    required: "请输入月供"
                },
                mortgageDate: {
                    required: "请选择抵押时间"
                },
                mortgageBank: {
                    required: "请输入抵押银行"
                },
                rpmntDate: {
                    required: "请选择还款时间"
                },
                estimationAmt: {
                    required: "请输入评估金额"
                },
                remark: {
                    required: "请输入无效原因"
                }
            }
        });
    }

    //时间戳转时间格式
    function  formatDatePo_car(now){ 
        if(now==""||now==null || now == "undefined"){
              return "";
          }
        var date = new Date(now);
        var year=date.getFullYear();     
        var month=date.getMonth()+1; 
        if(month < 10){
            month = "0"+month; 
        }
        var day=date.getDate();
        if(day < 10){
            day = "0"+day; 
        }
        return   year+"-"+month+"-"+day;     
   }

</script>
