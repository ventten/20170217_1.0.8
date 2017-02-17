<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--发起提前移交窗口-开始-->
<div class="modal fade hideModal" id="transferAdvanceModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:460px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">提前移交-申请</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="transferAdvanceForm">
                    <input type="hidden" value="${applId}" name="applId"/>
                    <input type="hidden" value="${applDetail.paymentId}" name="paymentId"/>
                    <input type="hidden" value="${applDetail.overDays}" name="overdueDays"/>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base">移交类型</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="transfertype" style="width:168px">
                                <c:forEach items="${transferTypeList}" var="item">
                                    <option value="${item.code}">${item.val}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label label-base">移交原因</label>
                        <div class="col-sm-6">
                            <textarea type="text" class="form-control" name="transferreason" id="transferreason" style="width:168px;height:60px;max-width:168px"></textarea>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label"></label>
                        <div class="col-sm-8">
                            <span class="redStar checkMessage" id="transferMessage"></span>
                        </div>
                    </div>

                </form>

            </div>
            <div class="modal-footer" style="text-align:center;padding-left:20px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="transferAdvanceBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<!--发起提前移交窗口-结束-->

<script type="text/javascript" language="javascript">

    //提前移交提交按钮
    $("#transferAdvanceBtn").on('click',function(){
        var transferReason = $.trim($("#transferreason").val());
        if(!transferReason){
            $("#transferMessage").text("请输入提交原因");
            return;
        }else {
            $("#transferMessage").text("");
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/initiateTransferAdvance",
            data : $("#transferAdvanceForm").serialize(),
            success : function(ret) {
                if(ret.success){
                    $("#transferAdvanceModal").modal("hide");
                    MSG.alert(ret.message);
                }else{
                    $("#transferMessage").text(ret.message);
                }
            },
            error:function(){
                MSG.show("操作失败,请刷新重试");
            }
        });
    });

</script>
