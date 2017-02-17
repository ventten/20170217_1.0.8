<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>单位信息</title>
</head>
<div class="plms-content">
	<div class="panel-body">
		<form class="searchForm" id="unit-searchForm">
			<label for="srcCode" class="right-space-2">来源</label>
			<select id="srcCode" name="srcCode" class="right-space-2">
				<option value="">全部</option>
				<c:forEach items="${sourceList}" var="item">
					<option value="${item.code}">${item.val}</option>
				</c:forEach>
			</select>
			<label for="unitName" class="right-space-2">单位名称</label>
			<input type="text" id="unitName" name="unitName" class="right-space-2"/>
			<!--客户ID，说明哪个用户下的数据-->
			<input type="hidden" value="${clCustId}" name="clCustId">
			<input class="btn btn-primary right-space-2" type="button" id="unit-searchBtn" value="查询" />
			<shiro:hasPermission name="unit:insert">
				<input class="btn btn-primary" type="button" value="新增"  onclick="addUnitInfo()"/>
			</shiro:hasPermission>
		</form>
	</div>
	<table id="unit-dataTable" class="display dataTable" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th class="text-center">来源</th>
				<th class="text-center">单位名称</th>
				<th class="text-center">单位地址</th>
				<th class="text-center">姓名</th>
				<th class="text-center">与主贷人关系</th>
				<th class="text-center">经营/在职情况</th>
				<th class="text-center">职位</th>
				<th class="text-center">数据有效性</th>
				<th class="text-center">维护人</th>
				<th class="text-center">维护时间</th>
				<th class="text-center">操作</th>
			</tr>
		</thead>
	</table>
	<!--添加窗口-->
	<div class="modal fade hideModal" id="unit-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width: 800px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">单位信息-新增</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="addForm_unit">
						<!--客户ID，说明哪个用户下的数据-->
						<input type="hidden" value="${clCustId}" name="clCustId">
						<div class="form-group">
							<label class="col-sm-addre3 control-label">来源</label>
							<div class="col-sm-addre6">
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
                            <label class="col-sm-addre3 control-label">
                                <span class="redStar">* </span>单位名称
                            </label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control" name="unitName" data-placement="bottom">
                            </div>
                        </div>
						<div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>地址</label>
                            <div class="col-sm-addre6">
                                <span >
                                    <select style="width: 160px;"  id="unitAddrProvinceId" name="unitAddrProvinceId"  data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>省</lable>
                                </span>
                                <span >
                                    <select style="width: 160px;" id="unitAddrCityId" name="unitAddrCityId"  data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>市</lable>
                                </span>
                                <span >
                                    <select style="width: 160px;" id="unitAddrAreaId" name="unitAddrAreaId" data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>区</lable>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>详细地址</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control" style="width: 520px;" id="unitAddrDetails" name="unitAddrDetails" data-placement="bottom">
                            </div>
                        </div>
						
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>姓名
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control" name="name" data-placement="bottom">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">与主贷人关系</label>
							<div class="col-sm-addre6">
								<select class="form-control" name="rltnshp">
									<c:forEach items="${rltnshpList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>经营/在职情况
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control" name="remark" data-placement="bottom">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>职位
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control" name="position" data-placement="bottom">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label"></label>
							<div class="col-sm-addre6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="unit-addBtn">新增</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
	<!--维护窗口-->
	<div class="modal fade hideModal" id="unit-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" style="width: 800px;">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
					<h4 class="modal-title">单位信息-维护</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="updateForm_unit">
						<!--隐藏的ID和版本号,修改数据的条件,必传-->
						<input type="hidden" name="id" id="edit_unit_id">
						<input type="hidden" name="recVer" id="edit_unit_recVer">
						<input type="hidden" value="${clCustId}" name="clCustId">
						<div class="form-group">
							<label class="col-sm-addre3 control-label">来源</label>
							<div class="col-sm-addre6">
								<select class="form-control mayDisabled" name="srcCode" id="edit_unit_srcCode">
									<c:forEach items="${sourceList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>
								单位名称
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control mayDisabled" id="edit_unit_unitName" name="unitName">
							</div>
						</div>
						<div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>地址</label>
                            <div class="col-sm-addre6">
                                <span >
                                    <select class="mayDisabled" style="width: 160px;"  id="unitAddrProvinceId_up" name="unitAddrProvinceId"  data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>省</lable>
                                </span>
                                <span >
                                    <select class="mayDisabled" style="width: 160px;" id="unitAddrCityId_up" name="unitAddrCityId"  data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>市</lable>
                                </span>
                                <span >
                                    <select class="mayDisabled" style="width: 160px;" id="unitAddrAreaId_up" name="unitAddrAreaId" data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>区</lable>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>详细地址</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control mayDisabled" style="width: 520px;" id="unitAddrDetails_up" name="unitAddrDetails" data-placement="bottom">
                            </div>
                        </div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>
								姓名
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control mayDisabled" id="edit_unit_name" name="name">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">与主贷人关系</label>
							<div class="col-sm-addre6">
								<select class="form-control mayDisabled" id="edit_unit_rltnshp" name="rltnshp">
									<c:forEach items="${rltnshpList}" var="item">
										<option value="${item.code}">${item.val}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>
								经营/在职情况
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control mayDisabled" id="edit_unit_remark" name="remark">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">
								<span class="redStar">* </span>
								职位
							</label>
							<div class="col-sm-addre6">
								<input type="text" class="form-control mayDisabled" id="edit_unit_position" name="position">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label">数据有效性</label>
							<div class="col-sm-addre6">
								<select class="form-control" id="edit_unit_isActive" name="isActive">
									<option value="Y">有效</option>
									<option value="N">无效</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-addre3 control-label"></label>
							<div class="col-sm-addre6">
								<span class="redStar redStarMessages"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button class="btn btn-primary" type="button" class="btn blue" id="unit-updateBtn">维护</button>
					<button class="btn btn-primary" type="button" class="btn blue" id="unit-deleteBtn">删除</button>
					<button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" language="javascript">

	//省市区三级联动三个参数
	var objProvinceU = $("#unitAddrProvinceId_up");
	var objCityU = $("#unitAddrCityId");
	var objAreaU = $("#unitAddrAreaId"); 
    //选项卡点击
    $("#pageUnitLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            unit_init();
        }
    });

    //分页Table
    var unit_table;

    //Table初始化方法
    function unit_init(){
    	unit_table=$('#unit-dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageUnitData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#unit-searchForm").serialize();
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
                {"mData" : "unitName","sDefaultContent" : ""},
                {"mData" : "unitAddr","sDefaultContent" : ""},
                {"mData" : "name","sDefaultContent" : ""},
                {"mData" : "rltnshpVal","sDefaultContent" : ""},
                {"mData" : "remark","sDefaultContent" : ""},
                {"mData" : "position","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="unit:update">
                            $(nTd).html("<a href='javascript:void(0);' onclick='unit_editFun(\"" + oData.id +"\",\"" + oData.createdBy + "\")'>维护</a>");
                        </shiro:hasPermission>
                    }
                }
             ]
         });
       }

    //编辑数据
    function unit_editFun(id,createdBy) {
		$(".redStarMessages").text("");
    	//移除验证提示
        $(".tooltip").remove();
        $("#updateForm_unit input[type='text']").val("");  
        $("#updateForm_unit select").find("option:first").prop("selected",true);
    	objProvinceU = $("#unitAddrProvinceId_up");
        objCityU = $("#unitAddrCityId_up");
        objAreaU = $("#unitAddrAreaId_up");
        $.ajax({
            type: "post",
            dataType: "json",
            data:{"id":id},
            url: "<%=request.getContextPath()%>/rest/cust/selectPlmsClUnitInfoByPrimaryKey",
            success: function(datat){
                    $("#edit_unit_id").val(datat.data.id);
                    $("#edit_unit_recVer").val(datat.data.recVer);
                    $("#edit_unit_unitName").val(datat.data.unitName=="undefined"?"":datat.data.unitName);
                    //$("#edit_unit_unitAddr").val(datat.data.addrDetails=="undefined"?"":datat.data.addrDetails);
                    $("#edit_unit_name").val(datat.data.name);
                    $("#edit_unit_remark").val(datat.data.remark);
                    $("#edit_unit_position").val(datat.data.position);
                    $("#edit_unit_srcCode").val(datat.data.srcCode);
                    $("#edit_unit_rltnshp").val(datat.data.rltnshp);
                    $("#edit_unit_isActive").val(datat.data.isActive);
                    $("#unitAddrDetails_up").val(datat.data.unitAddrDetails);
                  
                    provinceU_update(datat.data.unitAddrProvinceId);
                    cityU_update(datat.data.unitAddrProvinceId,datat.data.unitAddrCityId);
                    districtU_update(datat.data.unitAddrCityId,datat.data.unitAddrAreaId);
                    //当前用户等于此条数据的创建人,可以删除和修改
                    deleteBtnShowOrHide(createdBy,$("#unit-deleteBtn"));
    
                    //维护弹窗id
                    $("#unit-update").modal("show"); 
            },
            error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
        
    }

    //查询按钮提交
    $('#unit-searchBtn').on( 'click', function () {
        unit_table.search($("#unit-searchForm").serialize()).draw();  //刷新页面
    });

    //新增按钮提交
    $('#unit-addBtn').on( 'click', function () {
        //表单校验
        if (!$('#unit-add #addForm_unit').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#addForm_unit");
        var content = $(this).parents(".plms-content");
        P.addPost("<%=request.getContextPath()%>/rest/cust/addUnit",form,content,unit_table);
    });

    //维护按钮提交
    $('#unit-updateBtn').on( 'click', function () {
        //表单校验
        if (!$('#unit-update #updateForm_unit').valid()){
            return false;
        }
        var form = $(this).parents(".modal-dialog").find("#updateForm_unit");
        var content = $(this).parents(".plms-content");
        P.updatePost("<%=request.getContextPath()%>/rest/cust/updateUnit",form,content,unit_table);
    });

    //删除按钮提交，按钮ID唯一
    $('#unit-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#updateForm_unit");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deleteUnit",form,content,unit_table);
        });
    });

    $(document).ready(function() {
        //新增表单校验
        unit_validate($("#unit-add #addForm_unit"));
        //维护表单校验
        unit_validate($("#unit-update #updateForm_unit"));
        
    });

    //表单校验
    function unit_validate($validateForm){
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
            	unitName: {
            		required: true
            	},
            	unitAddrDetails: {
                    required: true,minlength:2
                },
                unitAddrProvinceId: {
                    required: true
                },
                unitAddrCityId: {
                    required: true
                },
                unitAddrAreaId: {
                    required: true
                },
                name: {
                    required: true,minlength:2,maxlength:20
                },
                remark: {
                    required: true,minlength:2,maxlength:20
                },
				position: {
                    required: true,minlength:2,maxlength:20
                }
            },
            messages: {
            	unitName: {
            		required: "请输入单位名称"
            	},
            	unitAddrDetails: {
                    required: "请输入详细地址"
                },
                unitAddrProvinceId: {
                    required: "请选择省份"                   
                },
                unitAddrCityId: {
                    required: "请选择城市"                   
                },
                unitAddrAreaId: {
                    required: "请选择区域"                   
                },
                name: {
                    required: "请输入姓名"
                },
                remark: {
                    required: "请输入经营/在职情况"
                },
				position: {
                    required: "请输入职位信息"
                }
            }
        });
    }

    //点击新增按钮
    function addUnitInfo(){
		$(".redStarMessages").text("");
    	//移除验证提示
        $(".tooltip").remove();
        $("#addForm_unit input[type='text']").val("");  
        $("#addForm_unit select").find("option:first").prop("selected",true);
    	objProvinceU = $("#unitAddrProvinceId");
        objCityU = $("#unitAddrCityId");
        objAreaU = $("#unitAddrAreaId"); 
        provinceU("");
        $("#unit-add").modal("show");
    }

    //初始化省
    var provinceU = function(value){
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
                objProvinceU.html(temp_html);
            }
        });
        cityU("");//每次改变省份的数据，都要重置城市的数据和县的数据（主要是为了重置县的数据）
    };

    //赋值城市
    var cityU = function(value){
        var temp_html = "";
        if(value == ""){
            objCityU.html("<option value=''>请选择</option>");
            districtU("");//当城市没有数据的时候，把县和市区也设置为没有数据
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
                objCityU.html(temp_html);
            }
                
        });
        districtU("");//每次改变省份的数据，都要重置县的数据
    };

    //赋值县 
    var districtU = function(value) {
        temp_html = "";
        if(value == ""){
            objAreaU.html("<option value=''>请选择</option>");
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
                objAreaU.html(temp_html);
            }
                
        });
    };
    
    //初始化省(update)
    var provinceU_update = function(value){
        var temp_html = "";
        if(value == ""){
            objProvinceU.html("<option value=''>请选择</option>");
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
                objProvinceU.html(temp_html);
            }
        });
    };

    //赋值城市(update)
    var cityU_update = function(value,select){
        var temp_html = "";
        if(value == ""){
            objCityU.html("<option value=''>请选择</option>");
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
                objCityU.html(temp_html);
            }
                
        });
    };

    //赋值县 (update)
    var districtU_update = function(value,select) {
        temp_html = "";
        if(value == ""){
            objAreaU.html("<option value=''>请选择</option>");
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
                objAreaU.html(temp_html);
            }
                
        });
    };

    //选择省改变市 
    $("#unitAddrProvinceId").on("change",function(){
        cityU($("#unitAddrProvinceId").val());
    });

    //选择市改变县 
    $("#unitAddrCityId").on("change",function(){
        districtU($("#unitAddrCityId").val());
    });

    //选择省改变市 (update)
    $("#unitAddrProvinceId_up").on("change",function(){
        cityU($("#unitAddrProvinceId_up").val());
    });

    //选择市改变县 (update)
    $("#unitAddrCityId_up").on("change",function(){
        districtU($("#unitAddrCityId_up").val());
    });

</script>
