<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!--新增委外机构窗口-开始-->
<div class="modal fade hideModal" id="outsrcComAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:700px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">委外机构-新增</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outsrcComAddForm">
                    <div class="form-group">
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>公司名称</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" name="outsrcComName">
                        </div>
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>优先级</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="weight">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">公司简要</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" name="brief">
                        </div>
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>映射公司</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="wdCorpId">
                                <c:forEach items="${wdCorpList}" var="item">
                                    <option value="${item.wdCorpId}">${item.wdCorpName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>辐射城市</label>
                        <span class="col-sm-10">
                            <c:forEach items="${siteRegionList}" var="item" varStatus="status">
                                <c:if test="${status.first || status.index % 5 == 0}">
                                    <tr>
                                </c:if>
                                <label class="right-space margin-bottom" for="add_regionIds${item.regionId}">
                                	<input type="checkbox" name="regionIds" id="add_regionIds${item.regionId}" value="${item.regionId}">${item.regionName}
                                </label>
                                <c:if test="${status.end || status.index % 5 == 4}">
                                    </tr>
                                </c:if>
                            </c:forEach>
                        </span>
                    </div>
                </form>

            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outsrcCom-addBtn">新增</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!--新增委外机构窗口-结束-->

<!--维护委外机构窗口-开始-->
<div class="modal fade hideModal" id="outsrcComUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:700px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">委外机构-维护</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outsrcComUpdateForm">
                    <input type="hidden" name="id" id="edit_outsrcCom_id">
                    <input type="hidden" name="recVer" id="edit_outsrcCom_recVer">
                    <div class="form-group">
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>公司名称</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" name="outsrcComName" id="edit_outsrcCom_outsrcComName">
                        </div>
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>优先级</label>
                        <div class="col-sm-4">
                            <input type="text" class="form-control" name="weight" id="edit_outsrcCom_weight">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">公司简要</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" name="brief" id="edit_outsrcCom_brief">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label"><span class="redStar">* </span>辐射城市</label>
                        <span class="col-sm-10">
                            <c:forEach items="${siteRegionList}" var="item" varStatus="status">
                                <c:if test="${status.first || status.index % 5 == 0}">
                                    <tr>
                                </c:if>
                                <label class="right-space margin-bottom" for="edit_outsrcCom_regionIds${item.regionId}">
                                	<input type="checkbox" name="regionIds" id="edit_outsrcCom_regionIds${item.regionId}" value="${item.regionId}">${item.regionName}
                                </label>
                                <c:if test="${status.end || status.index % 5 == 4}">
                                    </tr>
                                </c:if>
                            </c:forEach>
                        </span>
                    </div>
                </form>

            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outsrcCom-updateBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!--维护委外机构窗口-结束-->

<script type="text/javascript" language="javascript">

    //新增按钮
    $('#outsrcCom-addBtn').on( 'click', function () {
        var $addBtn = $(this);
        $addBtn.attr("disabled",true);
        var $form = $("#outsrcComAddForm");
        //表单校验
        if (!$form.valid()){
            $addBtn.attr('disabled',false);
            return false;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcCom/addOutsrcCom",
            data : $form.serialize(),
            success : function(ret) {
                MSG.alert(ret.message);
                $addBtn.attr('disabled',false);
                if(ret.success){
                    $("#outsrcComAddModal").modal("hide");
                    $('#outsrcCom-searchBtn').trigger("click");
                    $form.resetForm();
                }
            },
            error:function(){
                MSG.alert("系统异常,稍后重试");
                $addBtn.attr('disabled',false);
            }
        });
    });

    //维护按钮
    $('#outsrcCom-updateBtn').on( 'click', function () {
        var $updateBtn = $(this);
        $updateBtn.attr("disabled",true);
        var $form = $("#outsrcComUpdateForm");
        //表单校验
        if (!$form.valid()){
            $updateBtn.attr('disabled',false);
            return false;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcCom/updateOutsrcCom",
            data : $form.serialize(),
            success : function(ret) {
                MSG.alert(ret.message);
                $updateBtn.attr('disabled',false);
                if(ret.success){
                    $("#outsrcComUpdateModal").modal("hide");
                    $('#outsrcCom-searchBtn').trigger("click");
                }
            },
            error:function(){
                MSG.alert("系统异常,稍后重试");
                $updateBtn.attr('disabled',false);
            }
        });
    });

    $(document).ready(function() {
        //新增表单校验
        outsrcCom_validate($("#outsrcComAddForm"));
        //维护表单校验
        outsrcCom_validate($("#outsrcComUpdateForm"));
    });

    //表单校验
    function outsrcCom_validate($validateForm){
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
            errorElement: "div",
            rules: {
                outsrcComName: {
                    required: true
                },
                weight: {
                    required: true,upNumDeci:true
                },
                regionIds: {
                    required: true
                },
                wdCorpId: {
                    required: true
                }
            },
            messages: {
                outsrcComName: {
                    required: "请输入公司名称"
                },
                weight: {
                    required: "请输入优先级"
                },
                regionIds: {
                    required: "请选择辐射城市"
                },
                wdCorpId: {
                    required: "请选择微贷对应的外包公司"
                }
            }
        });
    }

</script>