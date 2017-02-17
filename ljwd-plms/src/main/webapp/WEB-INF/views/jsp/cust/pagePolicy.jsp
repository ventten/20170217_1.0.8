<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>保单信息</title>
</head>
<style>
.labelWith {
	width: 120px;
}

.dialogWidth {
	width: 800px;
}
.divSelect {
	width: 570px;
}
</style>
<div class="plms-content">
	<div class="panel-body">
		<form class="searchForm" id="policy-searchForm">
			<label for="srcCode" class="right-space-2">来源</label>
			<select id="srcCode" name="srcCode" class="right-space-2">
				<option value="">全部</option>
				<c:forEach items="${sourceList}" var="item">
					<option value="${item.code}">${item.val}</option>
				</c:forEach>
			</select>
			<!--客户ID，说明哪个用户下的数据-->
			<input type="hidden" value="${clCustId}" name="clCustId">
			<input class="btn btn-primary right-space-2" type="button" id="policy-searchBtn" value="查询" />
			<shiro:hasPermission name="policy:insert">
				<input class="btn btn-primary" type="button" value="新增"  onclick="addPolicyClick()" />
			</shiro:hasPermission>
		</form>
	</div>
	<table id="policy-dataTable" class="display dataTable" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th class="text-center">来源</th>
				<th class="text-center">保险公司</th>
				<th class="text-center">投保地点</th>
				<th class="text-center">生效日期</th>
				<th class="text-center">需缴费年数</th>
				<th class="text-center">缴费方式</th>
				<th class="text-center">缴费类别</th>
				<th class="text-center">期缴担保</th>
				<th class="text-center">总保额</th>
				<th class="text-center">保险类别</th>
				<th class="text-center">已缴期数</th>
				<th class="text-center">被保险人姓名</th>
				<th class="text-center">联系电话</th>
				<th class="text-center">保单有效性</th>
				<th class="text-center">维护人</th>
				<th class="text-center">维护时间</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
	</table>
	<!--添加窗口-->
	<div class="modal fade hideModal" id="policy-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog dialogWidth">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">保单信息-新增</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="addForm_pol">
						<!--客户ID，说明哪个用户下的数据-->
						<input type="hidden" value="${clCustId}" name="clCustId">
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">来源</label>
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
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											保险公司
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="policyName">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											投保地点
										</label>
										<div class="col-sm-6 divSelect">
											<span>
												<select style="width: 150px;" id="policyAddrProvinceId" name="policyAddrProvinceId"
													 data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>省</lable>
											</span>
											<span>
												<select style="width: 150px;" id="policyAddrCityId" name="policyAddrCityId"  data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>市</lable>
											</span>
											<span>
												<select style="width: 150px;" id="policyAddrAreaId" name="policyAddrAreaId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>区</lable>
											</span>
										</div>
									</div>
									<%--<br/>--%>
									<%--<div class="form-group formTable">--%>
										<%--<label class="col-sm-3 control-label labelWith">--%>
											<%--<span class="redStar">* </span>--%>
											<%--详细地点--%>
										<%--</label>--%>
										<%--<div class="col-sm-6 ">--%>
											<%--<input type="text" class="form-control" style="width: 490px !important" id="policyAddress_temp" name="policyAddress_tem">--%>
											<input type="hidden" class="form-control" id="policyAddress" name="policyAddress">
										<%--</div>--%>
									<%--</div>--%>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											需缴费年数
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="paymentYears">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											生效日期
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" readonly="readonly" name="effectiveDate" data-placement="bottom">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith"><span class="redStar">* </span>缴费方式</label>
										<div class="col-sm-6">
											<select class="form-control" name="paymentMethod" id="paymentMethod" data-placement="bottom">
												<option value="WHOLE">趸缴</option>
												<option value="NORMAL">期缴</option>
											</select>
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith paymentCategoryLabel">缴费类别</label>
										<div class="col-sm-6 paymentCategoryDiv">
											<select class="form-control" name="paymentCategory" id="paymentCategory" data-placement="bottom">
												<option value=""></option>
												<option value="month">月缴</option>
												<option value="quarter">季缴</option>
												<option value="halfyear">半年缴</option>
												<option value="year">年缴</option>
											</select>
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											总保额
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="grossline">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											期缴担保
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="periodGuarantee">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											已缴期数
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="paidPeriod">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">保险类别</label>
										<div class="col-sm-6  ">
											<select class="form-control" name="policyBranch">
												<option value="conventional">传统型</option>
												<option value="dividend">分红型</option>
											</select>
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											联系电话
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="contactTel">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											被保险人
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control" name="policyCustName">
										</div>
									</div>
						<div class="form-group formTable">
							<label class="col-sm-3 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="policy-addBtn">新增</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>

	<!--维护窗口-->
	<div class="modal fade hideModal" id="policy-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog dialogWidth">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">保单信息-维护</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="updateForm">
						<!--隐藏的ID和版本号,修改数据的条件,必传-->
						<input type="hidden" name="id" id="edit_policy_id">
						<input type="hidden" name="recVer" id="edit_policy_recVer">
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">来源</label>
										<div class="col-sm-6  ">
											<select class="form-control mayDisabled" name="srcCode" id="edit_policy_srcCode">
												<c:forEach items="${sourceList}" var="item">
													<option value="${item.code}">${item.val}</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											保险公司
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_policyName" name="policyName">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											投保地点
										</label>
										<div class="col-sm-6 divSelect">
											<span>
												<select class="mayDisabled" style="width: 150px;" id="policyAddrProvinceId_update" name="policyAddrProvinceId"
													 data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>省</lable>
											</span>
											<span>
												<select class="mayDisabled" style="width: 150px;" id="policyAddrCityId_update" name="policyAddrCityId"
													 data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>市</lable>
											</span>
											<span>
												<select class="mayDisabled" style="width: 150px;" id="policyAddrAreaId_update" name="policyAddrAreaId" data-placement="bottom">
													<option value=''>请选择</option>
												</select>
												<lable>区</lable>
											</span>
										</div>
									</div>
									<%--<br/>--%>
									<%--<div class="form-group formTable">--%>
										<%--<label class="col-sm-3 control-label labelWith">--%>
											<%--<span class="redStar">* </span>--%>
											<%--详细地点--%>
										<%--</label>--%>
										<%--<div class="col-sm-6 ">--%>
											<%--<input type="text" class="form-control mayDisabled" style="width: 490px !important" id="edit_policy_policyAddress" name="policyAddress_tem">--%>
											<input type="hidden" name="policyAddress" id="policyAddress_updata">
										<%--</div>--%>
									<%--</div>--%>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											需缴费年数
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_paymentYears" name="paymentYears">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											生效日期
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})" id="edit_policy_effectiveDate" name="effectiveDate" disabled="disabled">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith"><span class="redStar mayRedStar">* </span>缴费方式</label>
										<div class="col-sm-6  ">
											<select class="form-control mayDisabled" id="edit_policy_paymentMethod" name="paymentMethod" data-placement="bottom">
												<option value="WHOLE">趸缴</option>
												<option value="NORMAL">期缴</option>
											</select>
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith paymentCategoryLabel">缴费类别</label>
										<div class="col-sm-6 paymentCategoryDiv">
											<select class="form-control mayDisabled" id="edit_policy_paymentCategory" name="paymentCategory" data-placement="bottom">
												<option value=""></option>
												<option value="month">月缴</option>
												<option value="quarter">季缴</option>
												<option value="halfyear">半年缴</option>
												<option value="year">年缴</option>
											</select>
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											总保额
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_grossline" name="grossline">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											期缴担保
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_periodGuarantee" name="periodGuarantee">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											已缴期数
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_paidPeriod" name="paidPeriod">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">保险类别</label>
										<div class="col-sm-6  ">
											<select class="form-control mayDisabled" id="edit_policy_policyBranch" name="policyBranch">
												<option value="conventional">传统型</option>
												<option value="dividend">分红型</option>
											</select>
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">
											<span class="redStar">* </span>
											联系电话
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_contactTel" name="contactTel">
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith mayDisabled">
											<span class="redStar">* </span>
											被保险人
										</label>
										<div class="col-sm-6  ">
											<input type="text" class="form-control mayDisabled" id="edit_policy_policyCustName" name="policyCustName">
										</div>
									</div>
									<br/>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label labelWith">数据有效性</label>
										<div class="col-sm-6  ">
											<select class="form-control" id="edit_policy_isActive" name="isActive">
												<option value="Y">有效</option>
												<option value="N">无效</option>
											</select>
										</div>
									</div>
									<div class="form-group formTable">
										<label class="col-sm-3 control-label"></label>
										<div class="col-sm-6">
											<span class="redStar redStarMessages"></span>
										</div>
									</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="policy-updateBtn">维护</button>
					<button class="btn btn-primary" type="button" class="btn blue" id="policy-deleteBtn">删除</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" language="javascript">

	//省市区三级联动三个参数
	var objProvinceP = $("#policyAddrProvinceId");
	var objCityP = $("#policyAddrCityId");
	var objAreaP = $("#policyAddrAreaId");
    //选项卡点击
    $("#pagePolicyLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            policy_init();
        }
    });

    //分页Table
    var policy_table;

    //Table初始化方法
    function policy_init(){
    	policy_table=$('#policy-dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pagePolicyData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#policy-searchForm").serialize();
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
                    {"mData" : "policyName","sDefaultContent" : ""},
                    {"mData" : "policyAddress","sDefaultContent" : ""},
                    {"mData" : function(row, type, set, meta){
                    	return formatDatePo(row.effectiveDate);
                    }},
                    {"mData" : "paymentYears","sDefaultContent" : ""},
                    {"mData" : "paymentMethodText","sDefaultContent" : ""},
                    {"mData" : "paymentCategoryText","sDefaultContent" : ""},
                    {"mData" : "periodGuarantee","sDefaultContent" : ""},
                    {"mData" : "grossline","sDefaultContent" : ""},
                    {"mData" : "policyBranchText","sDefaultContent" : ""},
                    {"mData" : "paidPeriod","sDefaultContent" : ""},
                    {"mData" : "policyCustName","sDefaultContent" : ""},
                    {"mData" : "contactTel","sDefaultContent" : ""},
                    {"mData" : "isActiveText","sDefaultContent" : ""},
                    {"mData" : "updatedUserName","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            <shiro:hasPermission name="policy:update">
                                $(nTd).html("<a href='javascript:void(0);' onclick='policy_editFun(\"" + oData.id + "\",\"" + oData.createdBy + "\")'>维护</a>");
                            </shiro:hasPermission>
                        }
                    }
             ]
         });
       }

    //编辑数据
    function policy_editFun(id,createdBy) {
		$(".redStarMessages").text("");
    	//移除验证提示
        $(".tooltip").remove();
    	objProvinceP = $("#policyAddrProvinceId_update");
        objCityP = $("#policyAddrCityId_update");
        objAreaP = $("#policyAddrAreaId_update");
        $.ajax({
            type: "post",
            dataType: "json",
            data:{"id":id},
            url: "<%=request.getContextPath()%>/rest/cust/findPolicy",
            success: function(datat){
                //如果查询失败
                if(!datat.success){
                    MSG.show(datat.message);
                }else{
                    $("#edit_policy_id").val(datat.data.id);
                    $("#edit_policy_recVer").val(datat.data.recVer);
                    $("#edit_policy_srcCode").val(datat.data.srcCode);
                    $("#edit_policy_policyName").val(datat.data.policyName);
                    //$("#edit_policy_policyAddress").val(datat.data.policyAddress);
                    $("#edit_policy_effectiveDate").val(formatDatePo(datat.data.effectiveDate));
                    $("#edit_policy_paymentYears").val(datat.data.paymentYears);
                    $("#edit_policy_paymentMethod").val(datat.data.paymentMethod);
                    $("#edit_policy_paymentCategory").val(datat.data.paymentCategory);
                    $("#edit_policy_periodGuarantee").val(datat.data.periodGuarantee);
                    $("#edit_policy_grossline").val(datat.data.grossline);
                    $("#edit_policy_policyBranch").val(datat.data.policyBranch);
                    $("#edit_policy_paidPeriod").val(datat.data.paidPeriod);
                    $("#edit_policy_policyCustName").val(datat.data.policyCustName);
                    $("#edit_policy_contactTel").val(datat.data.contactTel);
                    $("#edit_policy_isActive").val(datat.data.isActive);
                    provinceP_update(datat.data.policyAddrProvinceId);
                    cityP_update(datat.data.policyAddrProvinceId,datat.data.policyAddrCityId);
                    districtP_update(datat.data.policyAddrCityId,datat.data.policyAddrAreaId);

                    //当前用户等于此条数据的创建人,可以删除和修改
					if(createdBy == $("#currentUser").val()){
						$("#policy-deleteBtn").show();
						$(".mayDisabled").prop("disabled",false);
						//缴费方式change
						paymentMethodChange(datat.data.paymentMethod);
					}else{
						//其他人只能修改有效性,不能删除
						$("#policy-deleteBtn").hide();
						$(".mayDisabled").prop("disabled",true);
						//缴费方式change
						paymentMethodChange(datat.data.paymentMethod,1);
					}

                    //维护弹窗id
                    $("#policy-update").modal("show");
                }
            },
            error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
    }

    //查询按钮提交
    $('#policy-searchBtn').on( 'click', function () {
        policy_table.search($("#policy-searchForm").serialize()).draw();  //刷新页面
    });

    //新增按钮提交
    $('#policy-addBtn').on( 'click', function () {
        //表单校验
        if (!$('#policy-add #addForm_pol').valid()){
            return false;
        }
        //拼接地址
        var allAddress = $("#policyAddrProvinceId").find("option:selected").text()
                         +$("#policyAddrCityId").find("option:selected").text()
                         +$("#policyAddrAreaId").find("option:selected").text();
                         //+"&&"+$("#policyAddress_temp").val();
        $("#policyAddress").val(allAddress);
        var form = $(this).parents(".modal-dialog").find("#addForm_pol");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/cust/addPolicy",form,content,policy_table);
    });

    //维护按钮提交
    $('#policy-updateBtn').on( 'click', function () {
        //表单校验
        if (!$('#policy-update #updateForm').valid()){
            return false;
        }
        //拼接地址
        var allAddress = $("#policyAddrProvinceId_update").find("option:selected").text()
                         +$("#policyAddrCityId_update").find("option:selected").text()
                         +$("#policyAddrAreaId_update").find("option:selected").text();
                         //+"&&"+$("#edit_policy_policyAddress").val();
        $("#policyAddress_updata").val(allAddress);
        var form = $(this).parents(".modal-dialog").find("#updateForm");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/cust/updatePolicy",form,content,policy_table);
    });

    //删除按钮提交，按钮ID唯一
    $('#policy-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#updateForm");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deletePolicy",form,content,policy_table);
        });
    });

	//缴费方式的change事件
	$("select[name='paymentMethod']").on("change",function(){
		paymentMethodChange($(this).val());
	});

	/**
	 * 缴费方式的change方法
	 * @param paymentMethodVal 缴费方式值
	 * @param type 值==1时即使缴费方式是期缴，也不把缴费类别的无效去掉
	 * */
	function paymentMethodChange(paymentMethodVal,type) {
		//如果是趸缴
		if(paymentMethodVal == "WHOLE"){
			$("select[name='paymentCategory']").val("");
			//动态移除红*
			$(".paymentCategoryLabel .redStar").remove();
			//动态移除红*的时候务必也要移除它的验证提示
			$(".paymentCategoryLabel .tooltip").remove();
			$(".paymentCategoryDiv").find("select").prop("disabled",true);
		}else{
			$(".paymentCategoryLabel .redStar").remove();
			$(".paymentCategoryLabel").prepend("<span class=\"redStar\">* </span>");
			if(type != 1){
				$(".paymentCategoryDiv").find("select").prop("disabled",false);
			}
		}
	}

    $(document).ready(function() {
        //新增表单校验
        policy_validate($("#policy-add #addForm_pol"));
        //维护表单校验
        policy_validate($("#policy-update #updateForm"));
    });

    //表单校验
    function policy_validate($validateForm){
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
                policyName: {
                    required: true,minlength:2
                }
//                ,policyAddress_temp: {
//                    required: true,minlength:2
//                }
                ,paymentYears: {
                    required: true,digits:true,maxlength:5
                }
                ,effectiveDate: {
                    required: true,date:true
                }
				,grossline: {
                    required: true,number:true
                }
				,periodGuarantee: {
                    required: true,number:true
                },
                paidPeriod: {
                    required: true,digits:true,maxlength:5
                }
				,contactTel: {
                    required: true,mobileCN:true
                }
				,policyCustName: {
                    required: true,minlength:2,maxlength:20
                }
				,policyAddrProvinceId: {
                	required: true
                }
				,policyAddrCityId: {
                	required: true
                }
				,policyAddrAreaId: {
                	required: true
                }
				,paymentMethod: {
                	required: true
                }
				,paymentCategory:{
					required: true
//					function(e) {
//						return $("select[name='paymentMethod']").val() == "NORMAL";
//					}
				}
//				,policyAddress_tem: {
//                	required: true,minlength:2
//                }
            },
            messages: {
                policyName: {
                    required: "请输入保险公司"
                }
//				,policyAddress_temp: {
//                    required: "请输入投保地点"
//                }
				,paymentYears: {
                    required: "请输入需缴费年限"
                }
				,effectiveDate: {
                    required: "请选择生效日期"
                }
				,grossline: {
                    required: "请输入总保额"
                },
                periodGuarantee: {
                    required: "请输入期缴担保"
                }
				,paidPeriod: {
                    required: "请输入已缴期数"
                }
				,contactTel: {
                    required: "请输入联系电话"
                }
				,policyCustName: {
                    required: "请输入被保险人"
                }
				,policyAddrProvinceId: {
                	required: "请选择省份"
                }
				,policyAddrCityId: {
                    required: "请选择城市"
                }
				,policyAddrAreaId: {
                    required: "请选择地区"
                }
				,paymentMethod: {
                    required: "请选择缴费方式"
                }
                ,paymentCategory:{
					required: "请选择缴费类别"
				}
//				,policyAddress_tem: {
//                	required: "请填写详细地址"
//                }
            }
        });
    }

    //点击新增按钮事件
    function addPolicyClick(){
		$(".redStarMessages").text("");
		$("#paymentMethod").trigger("change");
    	//移除验证提示
        $(".tooltip").remove();
    	objProvinceP = $("#policyAddrProvinceId");
        objCityP = $("#policyAddrCityId");
        objAreaP = $("#policyAddrAreaId");
        provinceP("");
        $("#policy-add").modal("show");
        $("#addForm_pol input[type='text']").val("");
        $("#addForm_pol select").find("option:first").prop("selected",true);
    }

    //初始化省
    var provinceP = function(value){
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
                objProvinceP.html(temp_html);
            }
        });
        cityP("");//每次改变省份的数据，都要重置城市的数据和县的数据（主要是为了重置县的数据）
    };

    //赋值城市
    var cityP = function(value){
        var temp_html = "";
        if(value == ""){
            objCityP.html("<option value=''>请选择</option>");
            districtP("");//当城市没有数据的时候，把县和市区也设置为没有数据
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
                objCityP.html(temp_html);
            }
        });
        districtP("");//每次改变省份的数据，都要重置县的数据
    };

    //赋值县
    var districtP = function(value) {
        temp_html = "";
        if(value == ""){
            objAreaP.html("<option value=''>请选择</option>");
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
                objAreaP.html(temp_html);
            }

        });
    };

    //初始化省(update)
    var provinceP_update = function(value){
        var temp_html = "";
        if(value == ""){
            objProvinceP.html("<option value=''>请选择</option>");
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
                objProvinceP.html(temp_html);
            }
        });
    };

    //赋值城市(update)
    var cityP_update = function(value,select){
        var temp_html = "";
        if(value == ""){
            objCityP.html("<option value=''>请选择</option>");
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
                objCityP.html(temp_html);
            }

        });
    };

    //赋值县 (update)
    var districtP_update = function(value,select) {
        temp_html = "";
        if(value == ""){
            objAreaP.html("<option value=''>请选择</option>");
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
                objAreaP.html(temp_html);
            }

        });
    };

    //选择省改变市
    $("#policyAddrProvinceId").on("change",function(){
        cityP($("#policyAddrProvinceId").val());
    });

    //选择市改变县
    $("#policyAddrCityId").on("change",function(){
        districtP($("#policyAddrCityId").val());
    });

    //选择省改变市 (update)
    $("#policyAddrProvinceId_update").on("change",function(){
        cityP($("#policyAddrProvinceId_update").val());
    });

    //选择市改变县 (update)
    $("#policyAddrCityId_update").on("change",function(){
        districtP($("#policyAddrCityId_update").val());
    });

	//时间戳转时间格式
	function  formatDatePo(now){
		if(now==""||now==null){
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
