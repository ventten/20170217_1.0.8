<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!-- 委外申请窗口-开始 -->
<div class="modal fade hideModal" id="outsrcAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:450px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">申请委外</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">

                <form class="form-horizontal" id="outsrcAddForm">
                    <input type="hidden" value="${applId}" name="applIds">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">委外日期</label>
                        <div class="col-sm-6">
                            <input type="text" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'outsrcStartDate\')||\'%y-%M-%d\'}'})" name="startDate" id="outsrcStartDate" readonly>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">委外原因</label>
                        <div class="col-sm-6">
                            <textarea  rows="3" id="outsrcReason" name="reason" style="max-width:184px;width:184px;height:60px;"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label"></label>
                        <div class="col-sm-6">
                            <span id="outsrcCheckError" class="checkMessage" style="color:red;vertical-align:middle"></span>
                        </div>
                    </div>

                </form>
            </div>

            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outsrcAddBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!-- 委外申请窗口-结束 -->

<script type="text/javascript" language="javascript">

    //确定申请委外按钮
    $('#outsrcAddBtn').click(function(){
        if(checkOutsrcAddForm()){
            var $outsrcAddForm = $('#outsrcAddForm');
            var data = $outsrcAddForm.serialize();
            $.ajax({
                type:"POST",
                dataType: "json",
                url:"<%=request.getContextPath()%>/rest/outsrcAppl/addOutsrcAppl?date=" + new Date().toTimeString(),
                data:data,
                success:function(data){
                    if(data.success){
                        $('#outsrcAddModal').modal('hide');
                        $outsrcAddForm.resetForm();
                        MSG.alert(data.message);
                    }else {
                        $('#outsrcCheckError').html(data.message);
                    }
                },
                error:function(jqXHR,textStatus,errorThrown){
                    MSG.show("申请委外失败");
                }
            });
        }
    });

    function checkOutsrcAddForm(){
        var startDate = $('#outsrcStartDate').val();
        var reason = $.trim($('#outsrcReason').val());
        if(!startDate){
            $('#outsrcCheckError').html("请选择委外日期");
            return false;
        }
        if(!reason){
            $('#outsrcCheckError').html("委外原因不能为空");
            return false;
        }
        $('#outsrcCheckError').html("");
        return true;
    }

</script>
