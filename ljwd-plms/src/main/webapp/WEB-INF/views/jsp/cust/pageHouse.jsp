<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>房产信息</title>
</head>
<div class="plms-content">
	<div class="panel-body">
		<form class="searchForm" id="house-searchForm">
			<label for="srcCode" class="right-space-2">来源</label>
			<select id="srcCode" name="srcCode" class="right-space-2">
				<option value="">全部</option>
				<c:forEach items="${sourceList}" var="item">
					<option value="${item.code}">${item.val}</option>
				</c:forEach>
			</select>
			<!--客户ID，说明哪个用户下的数据-->
			<input type="hidden" value="${clCustId}" name="clCustId">
			<input class="btn btn-primary right-space-2" type="button" id="house-searchBtn" value="查询" />
			<shiro:hasPermission name="assets:insert">
				<input class="btn btn-primary" type="button" value="新增" id="house_addBtn" />
			</shiro:hasPermission>
		</form>
	</div>
	<table id="house-dataTable" class="display dataTable" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th class="text-center">来源</th>
				<th class="text-center">房产证号</th>
				<th class="text-center">房产地址</th>
				<th class="text-center">购买方式</th>
				<th class="text-center">贷款金额</th>
				<th class="text-center">月供</th>
				<th class="text-center">抵押时间</th>
				<th class="text-center">抵押银行</th>
				<th class="text-center">还款时间</th>
				<th class="text-center">评估金额</th>
				<th class="text-center">数据有效性</th>
				<th class="text-center">维护人</th>
				<th class="text-center">维护时间</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
	</table>
	<!--添加窗口-->
	<div class="modal fade hideModal" id="house-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog dialogWidth">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">资产信息-房产-新增</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="house_addForm">
						<!--客户ID，说明哪个用户下的数据-->
						<input type="hidden" value="${clCustId}" name="clCustId">
						<table>
							<tr>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											来源
										</label>
										<div class="col-sm-6  ">
											<select class="form-control" name="srcCode">
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
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											房产证号
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="hpcNumber" data-placement="bottom">
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											购买方式
										</label>
										<div class="col-sm-6  ">
											<select class="form-control purchaseMode" id="purchaseMode" name="purchaseMode" >
												<option value="DISPOSABLE">一次性支付</option>
												<option value="MORTGAGE">按揭购买</option>
											</select>
										</div>
									</div>
								</td>
								<td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith ">贷款金额</label>
                                        <div class="col-sm-6  ">
                                            <input type="text" class="form-control  " name="loanAmt" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="form-group">
										<label class="col-sm-addre3 control-label">
											<span class="redStar">* </span>
											地址
										</label>
										<div style="width: 680px;margin-top: 9px;">
											<span>
												<select style="width: 160px;" id="addrProvinceId_house" name="addrProvinceId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>省</lable>
											</span>
											<span>
												<select style="width: 160px;" id="addrCityId_house" name="addrCityId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>市</lable>
											</span>
											<span>
												<select style="width: 160px;" id="addrAreaId_house" name="addrAreaId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>区</lable>
											</span>
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="form-group">
										<label class="col-sm-addre3 control-label">
											<span class="redStar">* </span>
											详细地址
										</label>
										<div style="width: 680px;margin-top: 9px;">
											<input type="text" class="form-control" style="width: 520px;" id="addrDetails_house" name="addrDetails" data-placement="bottom">
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith addred_house">月供</label>
										<div class="col-sm-6 addred_div_house ">
											<input type="text" class="form-control" name="monRpmnt" data-placement="bottom">
										</div>
									</div>
								</td>
								<td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred_house">抵押时间</label>
                                        <div class="col-sm-6 addred_div_house ">
                                            <input type="text" class="form-control" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="mortgageDate" readonly data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
							</tr>
							<tr>
								
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith addred_house">抵押银行</label>
										<div class="col-sm-6 addred_div_house ">
											<select class="form-control  " name="mortgageBank" id="mortgageBank" data-placement="bottom">
												<option value="" selected="selected"></option>
												<c:forEach items="${bankList}" var="item">
													<option value="${item.val}">${item.val}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</td>
								<td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred_house">还款时间</label>
                                        <div class="col-sm-6 addred_div_house ">
                                            <input type="text" class="form-control" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" name="rpmntDate" readonly data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
							</tr>
							<tr>
								
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith addred_house">评估金额</label>
										<div class="col-sm-6 addred_div_house ">
											<input type="text" class="form-control" name="estimationAmt" data-placement="bottom">
										</div>
									</div>
								</td>
							</tr>
						</table>
						<div class="form-group">
							<label class="col-sm-3 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="house-addBtn">新增</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
	<!--维护窗口-->
	<div class="modal fade hideModal" id="house-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog dialogWidth">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">资产信息-房产-维护</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="house_updateForm">
						<!--隐藏的ID和版本号,修改数据的条件,必传-->
						<input type="hidden" name="id" id="edit_house_id">
						<input type="hidden" name="recVer" id="edit_house_recVer">
						<input type="hidden" value="${clCustId}" name="clCustId">
						<table>
							<tr>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											来源
										</label>
										<div class="col-sm-6  ">
											<select class="form-control mayDisabled" id="edit_house_srcCode" name="srcCode">
												<c:forEach items="${sourceList}" var="item">
													<option value="${item.code}">${item.val}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</td>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											房产证号
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_house_hpcNumber" name="hpcNumber" data-placement="bottom">
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											购买方式
										</label>
										<div class="col-sm-6  ">
											<select class="form-control mayDisabled purchaseMode" id="edit_house_purchaseMode" name="purchaseMode">
												<option value="DISPOSABLE">一次性支付</option>
												<option value="MORTGAGE">按揭购买</option>
											</select>
										</div>
									</div>
								</td>
								<td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith ">贷款金额</label>
                                        <div class="col-sm-6  ">
                                            <input type="text" class="form-control mayDisabled" id="edit_house_loanAmt" name="loanAmt" data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
							</tr>
							<tr>
								<td colspan="2">
									<div class="form-group">
										<label class="col-sm-addre3 control-label">
											<span class="redStar">* </span>
											地址
										</label>
										<div style="width: 680px;margin-top: 9px;">
											<span>
												<select class="mayDisabled" style="width: 160px;" id="addrProvinceId_update_house" name="addrProvinceId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>省</lable>
											</span>
											<span>
												<select class="mayDisabled" style="width: 160px;" id="addrCityId_update_house" name="addrCityId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>市</lable>
											</span>
											<span>
												<select class="mayDisabled" style="width: 160px;" id="addrAreaId_update_house" name="addrAreaId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>区</lable>
											</span>
										</div>
									</div>
								</td>
							</tr>
                            <tr>
								<td colspan="2">
									<div class="form-group">
										<label class="col-sm-addre3 control-label">
											<span class="redStar">* </span>
											详细地址
										</label>
										<div style="width: 680px;margin-top: 9px;">
											<input type="text" class="form-control mayDisabled" style="width: 520px;" id="edit_house_addr" name="addrDetails" data-placement="bottom">
										</div>
									</div>
								</td>
							</tr>
							<tr>
								
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith addred_house">月供</label>
										<div class="col-sm-6 addred_div_house ">
											<input type="text" class="form-control mayDisabled" id="edit_house_monRpmnt" name="monRpmnt" data-placement="bottom">
										</div>
									</div>
								</td>
								<td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred_house">抵押时间</label>
                                        <div class="col-sm-6 addred_div_house ">
                                            <input type="text" class="form-control mayDisabled" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="edit_house_mortgageDate"
                                                name="mortgageDate" readonly data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
							</tr>
							<tr>
								
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith addred_house">抵押银行</label>
										<div class="col-sm-6 addred_div_house ">
											<select class="form-control  mayDisabled" id="edit_house_mortgageBank" name="mortgageBank" data-placement="bottom">
												<option value=""></option>
												<c:forEach items="${bankList}" var="item">
													<option value="${item.val}">${item.val}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</td>
								<td>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label labelWith addred_house">还款时间</label>
                                        <div class="col-sm-6 addred_div_house ">
                                            <input type="text" class="form-control mayDisabled" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="edit_house_rpmntDate"
                                                name="rpmntDate" readonly data-placement="bottom">
                                        </div>
                                    </div>
                                </td>
							</tr>
							<tr>
								
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith addred_house">评估金额</label>
										<div class="col-sm-6 addred_div_house ">
											<input type="text" class="form-control mayDisabled" id="edit_house_estimationAmt" name="estimationAmt" data-placement="bottom">
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label class="col-sm-3 control-label labelWith ">数据有效性</label>
										<div class="col-sm-6  ">
											<select class="form-control" id="edit_house_isActive" name="isActive">
												<option value="Y">有效</option>
												<option value="N">无效</option>
											</select>
										</div>
									</div>
								</td>
							</tr>
						</table>
						<div class="form-group">
							<label class="col-sm-3 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="house-updateBtn">维护</button>
					<button class="btn btn-primary" type="button" class="btn blue" id="house-deleteBtn">删除</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">

	//省市区三级联动三个参数
	var objProvince = $("#addrProvinceId_house");
	var objCity = $("#addrCityId_house");
	var objArea = $("#addrAreaId_house");
    //选项卡点击
    $("#ziChanLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            house_init();
        }
    });

    //分页Table
    var house_table;

    //Table初始化方法
    function house_init(){
    	house_table=$('#house-dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageHouseData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#house-searchForm").serialize();
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
                    {"mData" : "hpcNumber","sDefaultContent" : ""},
                    {"mData" : "addr","sDefaultContent" : ""},
                    {"mData" : "purchaseModeText","sDefaultContent" : ""},
                    {"mData" : "loanAmt","sDefaultContent" : ""},
                    {"mData" : "monRpmnt","sDefaultContent" : ""},
                    {"mData" : function(row){
                    	return formatDatePo_house(row.mortgageDate);
                    }},
                    {"mData" : "mortgageBank","sDefaultContent" : ""},
                    {"mData" : function(row){
                        return formatDatePo_house(row.rpmntDate);
                    }},
                    {"mData" : "estimationAmt","sDefaultContent" : ""},
                    {"mData" : "isActiveText","sDefaultContent" : ""},
                    {"mData" : "updatedUserName","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            <shiro:hasPermission name="assets:update">
                                $(nTd).html("<a href='javascript:void(0);' onclick='house_editFun(\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.srcCode + "\",\"" + oData.hpcNumber + "\",\"" + oData.purchaseMode + "\",\"" + oData.addr + "\",\"" + oData.loanAmt + "\",\"" + oData.monRpmnt + "\",\"" + oData.mortgageDate + "\",\"" + oData.mortgageBank + "\",\"" + oData.rpmntDate + "\",\"" + oData.estimationAmt + "\",\"" + oData.isActive + "\",\"" + oData.createdBy + "\",\"" + oData.addrProvinceId + "\",\"" + oData.addrCityId + "\",\"" + oData.addrAreaId + "\",\"" + oData.addrDetails + "\")'>维护</a>");
                            </shiro:hasPermission>
                        }
                    }
             ]
         });
       }

    //编辑数据
    function house_editFun(id,recVer,srcCode, hpcNumber, purchaseMode, addr,loanAmt,monRpmnt,mortgageDate,mortgageBank,rpmntDate,estimationAmt,isActive,createdBy,addrProvinceId,addrCityId,addrAreaId,addrDetails) {
    	objProvince = $("#addrProvinceId_update_house");
        objCity = $("#addrCityId_update_house");
        objArea = $("#addrAreaId_update_house"); 
    	//重置form
        $("#house_updateForm").find("input[type='text']").val('');
        $("#house_updateForm select").find("option:first").prop("selected",true);
    	$("#edit_house_id").val(id);
        $("#edit_house_recVer").val(recVer);
        $("#edit_house_hpcNumber").val(hpcNumber=="undefined"?"":hpcNumber);
        $("#edit_house_addr").val(addrDetails=="undefined"?"":addrDetails);

        $("#edit_house_purchaseMode").val(purchaseMode=="undefined"?"":purchaseMode);
        $("#edit_house_loanAmt").val(loanAmt=="undefined"?"":loanAmt);
        $("#edit_house_monRpmnt").val(monRpmnt=="undefined"?"":monRpmnt);

        $("#edit_house_mortgageDate").val(formatDatePo_house(mortgageDate));
        $("#edit_house_mortgageBank").val(mortgageBank=="undefined"?"":mortgageBank);
        $("#edit_house_rpmntDate").val(formatDatePo_house(rpmntDate));
        $("#edit_house_estimationAmt").val(estimationAmt=="undefined"?"":estimationAmt);

        $("#edit_house_srcCode").val(srcCode);
        $("#edit_house_isActive").val(isActive);

		$(".redStarMessages").text("");
		province_update(addrProvinceId);
        city_update(addrProvinceId,addrCityId);
        district_update(addrCityId,addrAreaId);
        //当前用户等于此条数据的创建人,可以删除和修改
        deleteBtnShowOrHide(createdBy,$("#house-deleteBtn"));

        $("#house-update").modal("show");
        //移除验证提示
        $(".tooltip").remove();
        if(purchaseMode == "MORTGAGE"){
            $(".addred_house .redStar").remove();
            $(".addred_house").prepend("<span class=\"redStar\">* </span>");
            //按揭支付选项的时候这些输入框可以输入
            $(".addred_div_house").find("input").prop("disabled",false);
            $(".addred_div_house").find("select").prop("disabled",false);
        }else{
            $(".addred_house .redStar").remove();
            $(".addred_div_house .tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
            //一次性支付选项的时候这些输入框禁止输入
            $(".addred_div_house").find("input").prop("disabled",true);
            $(".addred_div_house").find("select").prop("disabled",true);
            //清空禁止输入框的值
            $(".addred_div_house").find("input").val("");
            $(".addred_div_house").find("select").find("option:first").prop("selected",true);
        }
        if(createdBy == $("#currentUser").val()){
            $deleteBtn.show();
            $(".mayDisabled").prop("disabled",false); //modify by zhengjizhao date:20161121
        }else{
            //其他人只能修改有效性,不能删除
            $(".mayDisabled").prop("disabled",true); //modify by zhengjizhao date:20161121
        }
    }

    //点击新增房产信息
    $("#house_addBtn").on("click",function(){
		$(".redStarMessages").text("");
    	$("#house-add").modal("show");
    	//重置form
        $("#house_addForm").find("input[type='text']").val('');
        $("#house_addForm select").find("option:first").prop("selected",true);
        //移除验证提示
        $(".tooltip").remove();
        objProvince = $("#addrProvinceId_house");
        objCity = $("#addrCityId_house");
        objArea = $("#addrAreaId_house"); 
        province("");
        //判断是否显示必选*号
        if($("#purchaseModeCar").val() == "MORTGAGE"){
            $(".addred_house").prepend("<span class=\"redStar\">* </span>");
            //按揭支付选项的时候这些输入框可以输入
            $(".addred_div_house").find("input").prop("disabled",false);
            $(".addred_div_house").find("select").prop("disabled",false);
        }else{
            $(".addred_house .redStar").remove();
            $(".addred_div_house .tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
            //一次性支付选项的时候这些输入框禁止输入
            $(".addred_div_house").find("input").prop("disabled",true);
            $(".addred_div_house").find("select").prop("disabled",true);
            //清空禁止输入框的值
            $(".addred_div_house").find("input").val("");
            $(".addred_div_house").find("select").find("option:first").prop("selected",true);
        }
        
    });

    //点击支付方式的change事件
    $("select[name='purchaseMode']").on("change",function(){
    	if($(this).val() == "MORTGAGE"){
            $(".addred_house .redStar").remove();
            $(".addred_house").prepend("<span class=\"redStar\">* </span>");
            //按揭支付选项的时候这些输入框可以输入
            $(".addred_div_house").find("input").prop("disabled",false);
            $(".addred_div_house").find("select").prop("disabled",false);
        }else{
            $(".addred_house .redStar").remove();
            $(".addred_div_house .tooltip").remove();//动态移除红*的时候务必也要移除它的验证提示
            //一次性支付选项的时候这些输入框禁止输入
            $(".addred_div_house").find("input").prop("disabled",true);
            $(".addred_div_house").find("select").prop("disabled",true);
            //清空禁止输入框的值
            $(".addred_div_house").find("input").val("");
            $(".addred_div_house").find("select").find("option:first").prop("selected",true);
        }
    });

    //查询按钮提交
    $('#house-searchBtn').on( 'click', function () {
        house_table.search($("#house-searchForm").serialize()).draw();  //刷新页面
    });

    //新增按钮提交
    $('#house-addBtn').on( 'click', function () {
        //表单校验
        if (!$('#house-add #house_addForm').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#house_addForm");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/cust/addHouse",form,content,house_table);
    });

    //维护按钮提交
    $('#house-updateBtn').on( 'click', function () {
        //表单校验
        if (!$('#house_updateForm').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#house_updateForm");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/cust/updateHouse",form,content,house_table);
    });

    //删除按钮提交，按钮ID唯一
    $('#house-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#house_updateForm");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deleteHouse",form, content,house_table);
            });
        });
	$(document).ready(function() {
		//新增表单校验
		house_validate($("#house-add #house_addForm"));
		//维护表单校验
		house_validate($("#house-update #house_updateForm"));
	});

	//表单校验
	function house_validate($validateForm) {
		$validateForm
				.validate({
					unhighlight : function(element, errorClass, validClass) { //验证通过
						$(element).tooltip("destroy").removeClass(errorClass);
					},
					errorPlacement : function(label, element) {
						//让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
						$(element).attr("data-placement", "bottom");
						$(element).tooltip("destroy"); /*必需*/
						$(element).attr("title", $(label).text()).tooltip(
								"show");
					},
					rules : {
						hpcNumber : {
							required : true,
							minlength : 2
						},
						addrDetails: {
		                    required: true,minlength:2
		                },
		                addrProvinceId: {
		                    required: true
		                },
		                addrCityId: {
		                    required: true
		                },
		                addrAreaId: {
		                    required: true
		                },
						loanAmt : {//贷款金额校验
							/* required : true, */
							upNumDeci : true
						}, 
						purchaseMode : {
							required : true
						},
						monRpmnt : { //月供校验
							required : true,
							upNumDeci : true
						},
						mortgageDate : {
							required : true,
							date : true
						},
						mortgageBank : {
							required : true
						},
						rpmntDate : {
							required : true,
							date : true
						},
						estimationAmt : {//评估金额验证
							required : true,
							upNumDeci : true
						}
					},
					messages : {
						hpcNumber : {
							required : "请输入房产证号"
						},
						/* addr : {
							required : "请输入房产地址"
						}, */
						/* loanAmt : {
							required : "请输入贷款金额"
						}, */
						addrDetails: {
		                    required: "请输入详细地址"
		                },
		                addrProvinceId: {
		                    required: "请选择省份"                   
		                },
		                addrCityId: {
		                    required: "请选择城市"                   
		                },
		                addrAreaId: {
		                    required: "请选择区域"                   
		                },
						purchaseMode : {
							required : "请选择购买方式"
						},
						monRpmnt : {
							required : "请输入月供"
						},
						mortgageDate : {
							required : "请选择抵押时间"
						},
						mortgageBank : {
							required : "请输入抵押银行"
						},
						rpmntDate : {
							required : "请选择还款时间"
						},
						estimationAmt : {
							required : "请输入评估金额"
						}
					}
				});
	}

	//初始化省
    var province = function(value){
        var temp_html = "";
        $.ajax({
            type: "post",
            dataType: "json",
            data: {
                "rlevel":"1"
            },
            url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
            success: function(data){
                temp_html +="<option value=''>请选择</option>";
                for(var i=0;i<data.length;i++){
                    temp_html += "<option value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                }
                objProvince.html(temp_html);
            }
        });
        city("");//每次改变省份的数据，都要重置城市的数据和县的数据（主要是为了重置县的数据）
    };

    //赋值城市
    var city = function(value){
        var temp_html = "";
        if(value == ""){
            objCity.html("<option value=''>请选择</option>");
            district("");//当城市没有数据的时候，把县和市区也设置为没有数据
            return;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: {
                "pid": value
            },
            url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
            success: function(data){
                temp_html +="<option value=''>请选择</option>";
                for(var i=0;i<data.length;i++){
                    temp_html += "<option value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                }
                objCity.html(temp_html);
            }
                
        });
        district("");//每次改变省份的数据，都要重置县的数据
    };

    //赋值县 
    var district = function(value) {
        temp_html = "";
        if(value == ""){
            objArea.html("<option value=''>请选择</option>");
            return;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: {
                "pid": value
            },
            url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
            success: function(data){
                temp_html +="<option value=''>请选择</option>";
                for(var i=0;i<data.length;i++){
                    temp_html += "<option value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                }
                objArea.html(temp_html);
            }
        });
    };
    
    //初始化省(update)
    var province_update = function(value){
        var temp_html = "";
        if(value == ""){
            objProvince.html("<option value=''>请选择</option>");
            return;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: {
                "rlevel":"1"
            },
            url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
            success: function(data){
                temp_html +="<option value=''>请选择</option>";
                for(var i=0;i<data.length;i++){
                    if(value !="" && value == data[i].id){
                        temp_html += "<option selected='selected' value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                    }else{
                        temp_html += "<option value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                    }
                }
                objProvince.html(temp_html);
            }
        });
    };

    //赋值城市(update)
    var city_update = function(value,select){
        var temp_html = "";
        if(value == ""){
            objCity.html("<option value=''>请选择</option>");
            return;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: {
                "pid": value
            },
            url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
            success: function(data){
                temp_html +="<option value=''>请选择</option>";
                for(var i=0;i<data.length;i++){
                    if(select != "" && select == data[i].id){
                        temp_html += "<option selected='selected' value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                    }else{
                        temp_html += "<option value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                    }
                }
                objCity.html(temp_html);
            }
        });
    };

    //赋值县 (update)
    var district_update = function(value,select) {
        temp_html = "";
        if(value == ""){
            objArea.html("<option value=''>请选择</option>");
            return;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data: {
                "pid": value
            },
            url:"<%=request.getContextPath()%>/rest/cust/findAddressByMore",
            success: function(data){
                temp_html +="<option value=''>请选择</option>";
                for(var i=0;i<data.length;i++){
                    if(select != "" && select == data[i].id){
                        temp_html += "<option selected='selected' value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                    }else{
                        temp_html += "<option value='"+data[i].id+"'>"+ data[i].rname + "</option>";
                    }
                }
                objArea.html(temp_html);
            }
        });
    };

    //选择省改变市 
    $("#addrProvinceId_house").on("change",function(){
        city($("#addrProvinceId_house").val());
    });

    //选择市改变县 
    $("#addrCityId_house").on("change",function(){
        district($("#addrCityId_house").val());
    });

    //选择省改变市 (update)
    $("#addrProvinceId_update_house").on("change",function(){
        city($("#addrProvinceId_update_house").val());
    });

    //选择市改变县 (update)
    $("#addrCityId_update_house").on("change",function(){
        district($("#addrCityId_update_house").val());
    });

	//时间戳转时间格式
    function  formatDatePo_house(now){ 
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
