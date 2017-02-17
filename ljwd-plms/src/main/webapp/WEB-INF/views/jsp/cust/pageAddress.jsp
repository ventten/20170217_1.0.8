<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>地址信息</title>
</head>

<div class="plms-content">
    <div class="panel-body">
        <form class="searchForm" id="address-searchForm">
            <label for="srcCode" class="right-space-2">来源</label>
            <select id="srcCode" name="srcCode" class="right-space-2">
                <option value="">全部</option>
                <c:forEach items="${sourceList}" var="item">
                    <option value="${item.code}">${item.val}</option>
                </c:forEach>
            </select>
            <!--客户ID，说明哪个用户下的数据-->
            <input type="hidden" value="${clCustId}" name="clCustId">
            <input class="btn btn-primary right-space-2" type="button" id="address-searchBtn"  value="查询"/>
            <shiro:hasPermission name="address:insert">
                <input class="btn btn-primary" type="button" value="新增" data-toggle="modal" data-target="#address-add" onclick="addAddreClick()"/>
            </shiro:hasPermission>
        </form>
    </div>
    <table id="address-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">来源</th>
            <th class="text-center">地址类型</th>
            <th class="text-center">详细地址</th>
            <th class="text-center">姓名</th>
            <th class="text-center">与主贷人关系</th>
            <th class="text-center">地址有效性</th>
            <th class="text-center">维护人</th>
            <th class="text-center">维护时间</th>
            <th class="text-center">操作</th>
        </tr>
        </thead>
    </table>

    <!--添加窗口-->
    <div class="modal fade hideModal" id="address-add" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 800px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="closeAddAddre"></button>
                    <h4 class="modal-title">地址信息-新增</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="addForm_addr">
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
                            <label class="col-sm-addre3 control-label">地址类型</label>
                            <div class="col-sm-addre6">
                                <select class="form-control" name="addrType" id="addrType_add_id">
                                    <c:forEach items="${addressList}" var="item">
                                        <option value="${item.code}" >${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>地址</label>
                            <div class="col-sm-addre6">
                                <span >
	                                <select style="width: 160px;"  id="addrProvinceId" name="addrProvinceId"  data-placement="bottom">
	                                    <option value=''>请选择</option>
	                                </select>
                                    <lable>省</lable>
                                </span>
                                <span >
	                                <select style="width: 160px;" id="addrCityId" name="addrCityId"  data-placement="bottom">
	                                    <option value=''>请选择</option>
	                                </select>
                                    <lable>市</lable>
                                </span>
                                <span >
	                                <select style="width: 160px;" id="addrAreaId" name="addrAreaId" data-placement="bottom">
	                                    <option value=''>请选择</option>
	                                </select>
                                    <lable>区</lable>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>详细地址</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control" style="width: 520px;" id="addrDetails" name="addrDetails" data-placement="bottom">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>姓名</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control" id="name" name="name">
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
                            <label class="col-sm-addre3 control-label"></label>
                            <div class="col-sm-addre6">
                                <span class="redStar redStarMessages"></span>
                            </div>
                        </div>
                    </form>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="address-addBtn">
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
    <div class="modal fade hideModal" id="address-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 800px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" id="closeUpdateAddre"></button>
                    <h4 class="modal-title">地址信息-维护</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="updateForm_addre">

                        <!--隐藏的ID和版本号,修改数据的条件,必传-->
                        <input type="hidden" name="id" id="edit_address_id">
                        <input type="hidden" name="recVer" id="edit_address_recVer">

                        <input type="hidden" value="${clCustId}" name="clCustId">

                        <div class="form-group">
                            <label class="col-sm-addre3 control-label">来源</label>
                            <div class="col-sm-addre6">
                                <select class="form-control mayDisabled" id="edit_address_srcCode" name="srcCode">
                                    <c:forEach items="${sourceList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-addre3 control-label">地址类型</label>
                            <div class="col-sm-addre6">
                                <select class="form-control mayDisabled" id="edit_address_addrType" name="addrType">
                                    <c:forEach items="${addressList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>地址</label>
                            <div class="col-sm-addre6">
                                <span >
                                    <select class="mayDisabled" style="width: 160px;"  id="addrProvinceId_update" name="addrProvinceId"  data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>省</lable>
                                </span>
                                <span >
                                    <select class="mayDisabled" style="width: 160px;" id="addrCityId_update" name="addrCityId"  data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>市</lable>
                                </span>
                                <span >
                                    <select class="mayDisabled" style="width: 160px;" id="addrAreaId_update" name="addrAreaId" data-placement="bottom">
                                        <option value=''>请选择</option>
                                    </select>
                                    <lable>区</lable>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>详细地址</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control mayDisabled" style="width: 520px;" id="edit_address_addr" name="addrDetails" data-placement="bottom">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>姓名</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control mayDisabled" id="edit_address_name" name="name" data-placement="bottom">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-addre3 control-label">关系</label>
                            <div class="col-sm-addre6">
                                <select class="form-control mayDisabled" id="edit_address_rltnshp" name="rltnshp">
                                    <c:forEach items="${rltnshpList}" var="item">
                                        <option value="${item.code}">${item.val}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-addre3 control-label">数据有效性</label>
                            <div class="col-sm-addre6">
                                <select class="form-control" id="edit_address_isActive" name="isActive">
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
                    <button class="btn btn-primary" type="button" class="btn blue" id="address-updateBtn">
                        维护
                    </button>
                    <button class="btn btn-primary" type="button" class="btn blue" id="address-deleteBtn">
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

	//省市区三级联动三个参数
	var objProvince = $("#addrProvinceId");
    var objCity = $("#addrCityId");
    var objArea = $("#addrAreaId"); 
    //选项卡点击
    $("#pageAddressLi").on('click', function () {
        var $this = $(this);
        if(!$this.hasClass("hasInit")){
            $this.addClass("hasInit");
            address_init();
        }
    });

    //分页Table
    var address_table;

    //Table初始化方法
    function address_init(){
    	address_table=$('#address-dataTable').DataTable({
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
             "sAjaxSource" : "<%=request.getContextPath()%>/rest/cust/pageAddressData",
             "fnServerData" : function(sSource, aoData, fnCallback) {
                 //参数拼接
                 var data = "paramData=" + JSON.stringify(aoData) + "&" + $("#address-searchForm").serialize();
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
                {"mData" : "addrTypeVal","sDefaultContent" : ""},
                {"mData" : "addr","sDefaultContent" : ""},
                {"mData" : "name","sDefaultContent" : ""},
                {"mData" : "rltnshpVal","sDefaultContent" : ""},
                {"mData" : "isActiveText","sDefaultContent" : ""},
                {"mData" : "updatedUserName","sDefaultContent" : ""},
                {"mData" : "updateTime","sDefaultContent" : ""},
                {"mData" : null,"sDefaultContent" : "",
                    "fnCreatedCell": function (nTd, sData, oData, iRow, iCol) {
                        <shiro:hasPermission name="address:update">
                            $(nTd).html("<a href='javascript:void(0);' onclick='address_editFun(\"" + oData.id + "\",\"" + oData.createdBy + "\")'>维护</a>");
                        </shiro:hasPermission>
                    }
                }
             ]
         });
       }

    //编辑数据
    function address_editFun(id,createdBy) {
    	//移除验证提示
        $(".tooltip").remove();
        $("#updateForm_addre input[type='text']").val("");  
        $("#updateForm_addre select").find("option:first").prop("selected",true);
    	objProvince = $("#addrProvinceId_update");
        objCity = $("#addrCityId_update");
        objArea = $("#addrAreaId_update"); 
    	$.ajax({
            type: "post",
            dataType: "json",
            data:{"id":id},
            url: "<%=request.getContextPath()%>/rest/cust/findAddressDataOneById",
            success: function(datat){
            	//如果查询失败
            	if(!datat.success){
            		MSG.alert(datat.message);
            	}else{
	            	$("#edit_address_id").val(datat.data.id);
	                $("#edit_address_recVer").val(datat.data.recVer);
	                $("#edit_address_name").val(datat.data.name=="undefined"?"":datat.data.name);
	                $("#edit_address_addr").val(datat.data.addrDetails=="undefined"?"":datat.data.addrDetails);
	                $("#edit_address_srcCode").val(datat.data.srcCode);
	                $("#edit_address_rltnshp").val(datat.data.rltnshp);
	                $("#edit_address_addrType").val(datat.data.addrType);
	                $("#edit_address_isActive").val(datat.data.isActive);
	                province_update(datat.data.addrProvinceId);
	                city_update(datat.data.addrProvinceId,datat.data.addrCityId);
	                district_update(datat.data.addrCityId,datat.data.addrAreaId);
	                //当前用户等于此条数据的创建人,可以删除和修改
	                deleteBtnShowOrHide(createdBy,$("#address-deleteBtn"));

	                //维护弹窗id
	                $("#address-update").modal("show"); 
            	}
            },
            error:function(errorData){
                MSG.alert("系统异常,稍后重试");
            }
        });
    }

    //查询按钮提交
    $('#address-searchBtn').on('click', function () {
        address_table.search($("#address-searchForm").serialize()).draw();  //刷新页面
    });

    //新增按钮提交
    $('#address-addBtn').on( 'click', function () {
        //表单校验
        if (!$("#addForm_addr").valid()){
            return false;
        }
       $.ajax({
        	type: "post",
        	dataType: "json",
        	data:$("#addForm_addr").serialize(),
        	url: "<%=request.getContextPath()%>/rest/cust/addAddress",
        	success: function(data){
        		if(data.success){
        			//重置表单
        			$("#addForm_addr").resetForm();
        			//刷新页面
        			address_table.search($("#address-searchForm").serialize()).draw();
        			//关闭窗口
        			$("#closeAddAddre").click();
        			MSG.show(data.message);
        		}else{
        			MSG.show(data.message);
        		}
        	},
        	error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
    });

    //维护按钮提交
    $('#address-updateBtn').on( 'click', function () {
        //表单校验
        if (!$('#address-update #updateForm_addre').valid()){
            return false;
        }
        $.ajax({
            type: "post",
            dataType: "json",
            data:$("#updateForm_addre").serialize(),
            url: "<%=request.getContextPath()%>/rest/cust/updateAddress",
            success: function(data){
                if(data.success){
                    //刷新页面 列表数据
                    address_table.search($("#address-searchForm").serialize()).draw();
                    //关闭窗口
                    $("#closeUpdateAddre").click();
                    MSG.show(data.message);
                }else{
                	MSG.show(data.message);
                }
            },
            error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
    });

    //删除按钮提交，按钮ID唯一
    $('#address-deleteBtn').on( 'click', function () {
        var form = $(this).parents(".modal-dialog").find("#updateForm_addre");
        var content = $(this).parents(".plms-content");
        MSG.confirm('确定删除？',function(){
            P.deletePost("<%=request.getContextPath()%>/rest/cust/deleteAddress",form,content,address_table);
        });
    });

    $(document).ready(function() {
        //新增表单校验
        address_validate($("#address-add #addForm_addr"));
        //维护表单校验
        address_validate($("#address-update #updateForm_addre"));
    });

    //表单校验
    function address_validate($validateForm){
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
                name: {
                    required: true,minlength:2,maxlength:20
                }
            },
            messages: {
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
                name: {
                    required: "请输入姓名"
                }
            }
        });
    }

    //点击新增按钮事件
    function addAddreClick(){
    	//移除验证提示
        $(".tooltip").remove();
        $("#addForm_addr input[type='text']").val("");  
        $("#addForm_addr select").find("option:first").prop("selected",true);
	    objProvince = $("#addrProvinceId");
	    objCity = $("#addrCityId");
	    objArea = $("#addrAreaId"); 
	    province("");
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
    $("#addrProvinceId").on("change",function(){
        city($("#addrProvinceId").val());
    });

    //选择市改变县 
    $("#addrCityId").on("change",function(){
        district($("#addrCityId").val());
    });

    //选择省改变市 (update)
    $("#addrProvinceId_update").on("change",function(){
        city($("#addrProvinceId_update").val());
    });

    //选择市改变县 (update)
    $("#addrCityId_update").on("change",function(){
        district($("#addrCityId_update").val());
    });
  
</script>

