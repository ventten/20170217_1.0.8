<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<head>
    <title>地址信息</title>
</head>

<div class="plms-content">

    <table id="address-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="text-center">序号</th>
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

    <!--维护窗口-->
    <div class="modal fade hideModal" id="address-update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" style="width: 800px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                    <h4 class="modal-title">地址信息-维护</h4>
                </div>
                <div class="modal-body">

                    <form class="form-horizontal" id="address-updateForm_coll">

                        <!--隐藏的ID和版本号,修改数据的条件,必传-->
                        <input type="hidden" name="id" id="edit_address_id">
                        <input type="hidden" name="recVer" id="edit_address_recVer">
                        <input type="hidden" name="clCustId" id="edit_address_clCustId">

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
                                    <select class="mayDisabled" style="width: 160px;"  id="addrProvinceId_coll" name="addrProvinceId"  data-placement="bottom">
                                    </select>
                                    <lable>省</lable>
                                </span>
                                <span >
                                    <select class="mayDisabled" style="width: 160px;" id="addrCityId_coll" name="addrCityId"  data-placement="bottom">
                                    </select>
                                    <lable>市</lable>
                                </span>
                                <span >
                                    <select class="mayDisabled" style="width: 160px;" id="addrAreaId_coll" name="addrAreaId" data-placement="bottom">
                                    </select>
                                    <lable>区</lable>
                                </span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>详细地址</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control mayDisabled" style="width: 520px;" id="edit_address_addr_coll" name="addrDetails" data-placement="bottom">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-addre3 control-label"><span class="redStar">* </span>姓名</label>
                            <div class="col-sm-addre6">
                                <input type="text" class="form-control mayDisabled" id="edit_address_name" name="name">
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

                    </form>

                </div>
                <div class="modal-footer" style="text-align:center;padding-left:0px;">
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
	var objProvinceC = $("#addrProvinceId_coll");
	var objCityC = $("#addrCityId_coll");
	var objAreaC = $("#addrAreaId_coll");
    //选项卡点击
    $("#pageCollectionAddressLi").on('click', function () {
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
        address_table = $('#address-dataTable').DataTable({
        	"scrollY": false,
			"scrollX": '100%',
	        "scrollCollapse": true,
            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //翻页功能
            "bFilter": false,                       //过滤功能
            "bInfo": true,            			    //页脚信息
            "bSort": false  ,					    //无排序功能
            "bScrollCollapse" : true,
            "bAutoWidth": true,
            "iDisplayLength": 10,
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
            "bProcessing": false,           //加载数据时显示正在加载信息
            "bServerSide": true,            //指定从服务器端获取数据
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionAddressData",
            "fnServerData" : function(sSource, aoData, fnCallback) {
                //参数拼接
                var data = "paramData=" + JSON.stringify(aoData) + "&clCustIdByApplId="+$("#applId").val();
                $.ajax({
                    "type" : 'POST',
                    "url" : sSource,
                    "dataType" : "json",
                    "data" : data,
                    "success" : function(resp) {
                        fnCallback(resp);
                    },
                    "error":function(errorData){
                        MSG.show('获取数据发生异常');
                    }
                });
            },
            //dataTable显示
            "aoColumns"  : [
                {"mData" :  function(row, type, set, meta) {
                    return (meta.row + 1);
                }},
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
                            $(nTd).html("<a href='javascript:void(0);' onclick='address_editFun_coll(\"" + oData.id + "\",\"" + oData.createdBy + "\")'>维护</a>");
                        </shiro:hasPermission>
                    }
                }
            ]
        });
    }

    //编辑数据
    function address_editFun_coll(id,createdBy) {
    	$("#address-updateForm_coll :input").not(":button, :submit, :reset, :hidden").val("");
    	$("#address-updateForm_coll select").find("option:first").attr("selected","selected");
        $.ajax({
            type: "post",
            dataType: "json",
            data:{"id":id},
            url: "<%=request.getContextPath()%>/rest/cust/findAddressDataOneById",
            success: function(datat){
                //如果查询失败
                if(!datat.success){
                    MSG.show(datat.message);
                }else{
                    $("#edit_address_id").val(datat.data.id);
                    $("#edit_address_recVer").val(datat.data.recVer);
                    $("#edit_address_clCustId").val(datat.data.clCustId);
                    $("#edit_address_name").val(datat.data.name=="undefined"?"":datat.data.name);
                    $("#edit_address_addr_coll").val(datat.data.addrDetails=="undefined"?"":datat.data.addrDetails);
                    $("#edit_address_srcCode").val(datat.data.srcCode);
                    $("#edit_address_rltnshp").val(datat.data.rltnshp);
                    $("#edit_address_addrType").val(datat.data.addrType);
                    $("#edit_address_isActive").val(datat.data.isActive);
                    provinceC_update(datat.data.addrProvinceId);
                    cityC_update(datat.data.addrProvinceId,datat.data.addrCityId);
                    districtC_update(datat.data.addrCityId,datat.data.addrAreaId);
                    //areaChange("addrAreaId_coll",datat.data.addrAreaId);
                    //当前用户等于此条数据的创建人,可以删除和修改
                    deleteBtnShowOrHide(createdBy,$("#address-deleteBtn"));
    
                    //维护弹窗id
                    $("#address-update").modal("show"); 
                }
            },
            error:function(errorData){
                MSG.show("系统异常,稍后重试");
            }
        });
    }

    //维护按钮提交
    $('#address-updateBtn').on( 'click', function () {
        //表单校验
        if (!$("#address-updateForm_coll").valid()){
            return false;
        }
        $.ajax({
            "type" : 'POST',
            "url" : "<%=request.getContextPath()%>/rest/cust/updateAddress",
            "dataType" : "json",
            "data" : $("#address-updateForm_coll").serialize(),
            "success" : function(ret) {
                if(ret.success){
                    address_table.search("clCustIdByApplId=" + $("#applId").val()).draw();
                    $("#address-update").modal("hide");
                    MSG.show(ret.message);
                }else{
                	MSG.show(ret.message);
                }
                
            },
            "error":function(errorData){
                MSG.show("修改地址信息失败");
            }
        });
    });

    //删除按钮提交，按钮ID唯一
    $('#address-deleteBtn').on( 'click', function () {
        MSG.confirm('确定删除？',function(){
            $.ajax({
                "type" : 'POST',
                "url" : "<%=request.getContextPath()%>/rest/cust/deleteAddress",
                "dataType" : "json",
                "data" : $("#address-updateForm_coll").serialize(),
                "success" : function(ret) {
                    if(ret.success){
                        address_table.search("clCustIdByApplId="+$("#applId").val()).draw();
                        $("#address-update").modal("hide");
                    }
                    MSG.show(ret.message);
                },
                "error":function(errorData){
                    MSG.show("删除地址信息失败");
                }
            });
        });
    });

    $(document).ready(function() {
        //维护表单校验
        address_validate($("#address-updateForm_coll"));
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
    //初始化省
    var provinceC = function(value){
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
                objProvinceC.html(temp_html);
            }
        });
        cityC("");//每次改变省份的数据，都要重置城市的数据和县的数据（主要是为了重置县的数据）
    };
    //赋值城市
    var cityC = function(value){
        var temp_html = "";
        if(value == ""){
            objCityC.html("<option value=''>请选择</option>");
            districtC("");//当城市没有数据的时候，把县和市区也设置为没有数据
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
                objCityC.html(temp_html);
            }
                
        });
        districtC("");//每次改变省份的数据，都要重置县的数据
    };
    //赋值县 
    var districtC = function(value) {
        temp_html = "";
        if(value == ""){
            objAreaC.html("<option value=''>请选择</option>");
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
                objAreaC.html(temp_html);
            }
                
        });
    };
    
    //初始化省(update)
    var provinceC_update = function(value){
        var temp_html = "";
        if(value == ""){
            objProvinceC.html("<option value=''>请选择</option>");
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
                objProvinceC.html(temp_html);
            }
        });
    };
    //赋值城市(update)
    var cityC_update = function(value,select){
        var temp_html = "";
        if(value == ""){
            objCityC.html("<option value=''>请选择</option>");
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
                objCityC.html(temp_html);
            }
                
        });
    };
    //赋值县 (update)
    var districtC_update = function(value,select) {
        temp_html = "";
        if(value == ""){
            objAreaC.html("<option value=''>请选择</option>");
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
                objAreaC.html(temp_html);
            }
                
        });
    };
    //选择省改变市 
    $("#addrProvinceId_coll").on("change",function(){
        cityC($("#addrProvinceId_coll").val());
    });
    //选择市改变县 
    $("#addrCityId_coll").on("change",function(){
        districtC($("#addrCityId_coll").val());
    });
</script>

