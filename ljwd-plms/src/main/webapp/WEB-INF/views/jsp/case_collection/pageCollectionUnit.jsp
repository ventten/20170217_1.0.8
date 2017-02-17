<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<head>
<title>单位信息</title>
</head>
<div class="plms-content">
    <table id="unit-dataTable" class="display dataTable" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th class="text-center">序号</th>
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
                        <input type="hidden" name="clCustId" id="edit_Unit_clCustId">
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
    $("#pageCollectionUnitLi").on('click', function () {
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
    	unit_table = $("#unit-dataTable").DataTable({
            "scrollY": false,
            "scrollX": '100%',
            "scrollCollapse": true,
            "sPaginationType": "full_numbers",      //设置分页控件的模式
            "bLengthChange": false,                 //改变每页显示数据数量
            "bPaginate": true,                      //翻页功能
            "bFilter": false,                       //过滤功能
            "bInfo": true,                          //页脚信息
            "bSort": false  ,                       //无排序功能
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
            "sAjaxSource" : "<%=request.getContextPath()%>/rest/caseCollection/pageCollectionUnitData",
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
                    $("#edit_Unit_clCustId").val(datat.data.clCustId);
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
    //选择省改变市 (update)
    $("#unitAddrProvinceId_up").on("change",function(){
        cityU($("#unitAddrProvinceId_up").val());
    });

    //选择市改变县 (update)
    $("#unitAddrCityId_up").on("change",function(){
        districtU($("#unitAddrCityId_up").val());
    });

</script>
