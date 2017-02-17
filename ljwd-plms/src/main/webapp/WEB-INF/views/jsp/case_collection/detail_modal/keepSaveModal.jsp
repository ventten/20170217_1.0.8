<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--发起保留窗口-开始-->
<div class="modal fade hideModal" id="keepSaveModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:460px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">保留</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="keepSaveForm">
                    <input type="hidden" value="${applId}" name="applId"/>
                    <input type="hidden" value="${applDetail.paymentId}" name="paymentId"/>
                    <input type="hidden" value="${overduePeriod}" name="overduePeriod">
                    <input type="hidden" value="${applDetail.overDays}" name="overdueDays"/>
                    <input type="hidden" value="${applDetail.remainingPrincipal}" name="remainingPrincipal"/>
                    <div class="form-group">
                        <label class="col-sm-5 control-label label-base">保留截止日期</label>
                        <div class="col-sm-5">
                            <input size="10" type="text" value="${nextWorkDay}" onFocus="WdatePicker({dateFmt:'yyyy-MM-dd',minDate:'${nextWorkDay}',maxDate:'${nextWorkDay}'})" name="protectEndDate" id="protectEndDate" style="width:168px" readonly>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-5 control-label"></label>
                        <div class="col-sm-5">
                            <span class="redStar checkMessage" id="protectMessage"></span>
                        </div>
                    </div>
                </form>

            </div>
            <div class="modal-footer" style="text-align:center;padding-left:20px;">
                <button class="btn btn-primary" class="btn blue" id="keepSaveBtn">保留</button>
                <button class="btn btn-primary" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<!--发起保留窗口-结束-->

<script type="text/javascript" language="javascript">

    //保留提交按钮
    $("#keepSaveBtn").on('click',function(){
        var protectEndDate = $("#protectEndDate").val();
        if(!protectEndDate){
            MSG.show("请选择保留日期");
            return;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/saveKeep",
            data : $("#keepSaveForm").serialize(),
            success : function(ret) {
                if(ret.success){
                    $("#keepSaveModal").modal("hide");
                    MSG.show(ret.message);
                }else{
                    $("#protectMessage").text(ret.message);
                }
            },
            error:function(){
                MSG.show("操作失败,请刷新重试");
            }
        });
    });

</script>
