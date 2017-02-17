<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>其他资产</title>
</head>
<div class="plms-content">
	<div class="panel-body">
		<form class="searchForm" id="assets-searchForm">
			<label for="srcCode" class="right-space-2">来源</label>
			<select id="srcCode" name="srcCode" class="right-space-2">
				<option value="">全部</option>
				<c:forEach items="${sourceList}" var="item">
					<option value="${item.code}">${item.val}</option>
				</c:forEach>
			</select>
			<!--客户ID，说明哪个用户下的数据-->
			<input type="hidden" value="${clCustId}" name="clCustId">
			<input class="btn btn-primary right-space-2" type="button" id="assets-searchBtn" value="查询" />
			<shiro:hasPermission name="assets:insert">
				<input class="btn btn-primary" type="button" value="新增" id="asset_addBtn" />
			</shiro:hasPermission>
		</form>
	</div>
	<table id="assets-dataTable" class="display dataTable" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th class="text-center">来源</th>
				<th class="text-center">资产类型</th>
				<th class="text-center">详情</th>
				<th class="text-center">评估金额</th>
				<th class="text-center">数据有效性</th>
				<th class="text-center">维护人</th>
				<th class="text-center">维护时间</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
	</table>
	<!--添加窗口-->
	<div class="modal fade hideModal" id="assets-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width:450px">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">资产信息-其它-新增</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="addForm_asset">
						<!--客户ID，说明哪个用户下的数据-->
						<input type="hidden" value="${clCustId}" name="clCustId">
						<div class="form-group">
							<label class="col-sm-4 control-label">来源</label>
							<div class="col-sm-6">
								<select class="form-control" name="srcCode">
									<c:forEach items="${sourceList}" var="item">
										<c:if test="${('NETWORK' eq item.code) == true || ('EXTMECHAN' eq item.code) == true}">
										    <option value="${item.code}">${item.val}</option>
                                        </c:if>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">资产类型</label>
							<div class="col-sm-6">
								<select class="form-control" name="assetsType">
									<c:forEach items="${assetsList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">
								<span class="redStar">* </span>
								详情
							</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" data-placement="bottom" name="remark">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">
								<span class="redStar">* </span>
								评估金额
							</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" data-placement="bottom" name="estimationAmt">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="assets-addBtn">新增</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
	<!--维护窗口-->
	<div class="modal fade hideModal" id="assets-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width:450px">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">资产信息-其它-维护</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="updateForm_asset">
						<!--隐藏的ID和版本号,修改数据的条件,必传-->
						<input type="hidden" name="id" id="edit_assets_id">
						<input type="hidden" name="recVer" id="edit_assets_recVer">
						<div class="form-group">
							<label class="col-sm-4 control-label">来源</label>
							<div class="col-sm-6">
								<select class="form-control mayDisabled" id="edit_assets_srcCode" name="srcCode">
									<c:forEach items="${sourceList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">资产类型</label>
							<div class="col-sm-6">
								<select class="form-control mayDisabled" id="edit_assets_assetsType" name="assetsType">
									<c:forEach items="${assetsList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">
								<span class="redStar">* </span>
								详情
							</label>
							<div class="col-sm-6">
								<input type="text" class="form-control mayDisabled" data-placement="bottom" id="edit_assets_remark" name="remark">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">
								<span class="redStar">* </span>
								评估金额
							</label>
							<div class="col-sm-6">
								<input type="text" class="form-control mayDisabled" data-placement="bottom" id="edit_assets_estimationAmt" name="estimationAmt">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label">数据有效性</label>
							<div class="col-sm-6">
								<select class="form-control" id="edit_assets_isActive" name="isActive">
									<option value="Y">有效</option>
									<option value="N">无效</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-4 control-label"></label>
							<div class="col-sm-6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="assets-updateBtn">维护</button>
					<button class="btn btn-primary" type="button" class="btn blue" id="assets-deleteBtn">删除</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" language="javascript">

    //选项卡点击
    $("#pageAssetsLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            assets_init();
        }
    });

    //分页Table
    var assets_table;

    //Table初始化方法
    function assets_init(){
    	assets_table=$('#assets-dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageAssetsData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#assets-searchForm").serialize();
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
                    {"mData" : "assetsTypeVal","sDefaultContent" : ""},
                    {"mData" : "remark","sDefaultContent" : ""},
                    {"mData" : "estimationAmt","sDefaultContent" : ""},
                    {"mData" : "isActiveText","sDefaultContent" : ""},
                    {"mData" : "updatedUserName","sDefaultContent" : ""},
                    {"mData" : "updateTime","sDefaultContent" : ""},
                    {"mData" : null,"sDefaultContent" : "",
                        "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                            <shiro:hasPermission name="assets:update">
                                $(nTd).html("<a href='javascript:void(0);' onclick='assets_editFun(\"" + oData.id + "\",\"" + oData.recVer + "\",\"" + oData.srcCode + "\",\"" + oData.assetsType + "\",\"" + oData.remark + "\",\"" + oData.estimationAmt + "\",\"" + oData.isActive + "\",\"" + oData.createdBy + "\")'>维护</a>");
                            </shiro:hasPermission>
                        }
                    }
             ]
         });
       }

    //编辑数据
    function assets_editFun(id,recVer,srcCode, assetsType, remark, estimationAmt,isActive,createdBy) {
    	//移除验证提示
        $(".tooltip").remove();
        $("#updateForm_asset input[type='text']").val("");  
        $("#updateForm_asset select").find("option:first").prop("selected",true);
        $("#edit_assets_id").val(id);
        $("#edit_assets_recVer").val(recVer);
        $("#edit_assets_remark").val(remark);
        $("#edit_assets_estimationAmt").val(estimationAmt);

        $("#edit_assets_srcCode").val(srcCode);
        $("#edit_assets_assetsType").val(assetsType);
        $("#edit_assets_isActive").val(isActive);

        //当前用户等于此条数据的创建人,可以删除和修改
        deleteBtnShowOrHide(createdBy,$("#assets-deleteBtn"));

        $("#assets-update").modal("show");
    }
    //新增按钮
    $("#asset_addBtn").on("click",function(){
    	//移除验证提示
        $(".tooltip").remove();
        $("#addForm_asset input[type='text']").val("");  
        $("#addForm_asset select").find("option:first").prop("selected",true);
        $("#assets-add").modal("show");
    });
    //查询按钮提交
    $('#assets-searchBtn').on( 'click', function () {
        assets_table.search($("#assets-searchForm").serialize()).draw();  //刷新页面
    } );

    //新增按钮提交
    $('#assets-addBtn').on( 'click', function () {
        //表单校验
        if (!$('#assets-add #addForm_asset').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#addForm_asset");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/cust/addAssets",form,content,assets_table);
    });

    //维护按钮提交
    $('#assets-updateBtn').on( 'click', function () {
        //表单校验
        if (!$('#assets-update #updateForm_asset').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#updateForm_asset");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/cust/updateAssets",form,content,assets_table);
    });

    //删除按钮提交，按钮ID唯一
    $('#assets-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#updateForm_asset");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deleteAssets",form,content,assets_table);
        });
    });

    $(document).ready(function() {
        //新增表单校验
        assets_validate($("#assets-add #addForm_asset"));
        //维护表单校验
        assets_validate($("#assets-update #updateForm_asset"));
    });

    //表单校验
    function assets_validate($validateForm){
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
                remark: {
                    required: true,minlength:2
                },
                estimationAmt: {
                    required: true,number:true
                }
            },
            messages: {
                remark: {
                    required: "请输入详情"
                },
                estimationAmt: {
                    required: "请输入评估金额"
                }
            }
        });
    }

</script>