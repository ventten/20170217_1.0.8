<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!-- 外访窗口 -->
<div class="modal fade hideModal" id="outVisitAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:450px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">申请外访</h4>
            </div>
            <div class="modal-body" style="padding-bottom: 0px;">
                <form class="form-horizontal" id="outVisitSubmitForm">
                    <input type="hidden" value="${applId}" name="applId">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">客户类型</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="custType" id= "custType">
                                <%--<option value="">请选择</option>--%>
                                <c:forEach items="${outVisitCustType}" var="item">
                                    <option value="${item.key}">${item.value}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                     <div class="form-group">
					    <label class="col-sm-4 control-label">外访原因</label>
					   	<div class="col-sm-6">
					        <textarea  rows="3" id="submitReason" name="submitReason" style="max-width:184px;width:184px;height:60px;"></textarea>
					    </div>
					 </div>
					 
					 <div class="form-group">
                        <label class="col-sm-4 control-label"></label>
                        <div class="col-sm-6">
                            <span id="outVisitCheckError" class="redStar checkMessage" style="vertical-align:middle"></span>
                        </div>
                    </div>
                </form>
            </div>

            <div class="modal-footer" style="text-align:center;padding-top: 0px;">
                <button class="btn btn-primary" type="button" class="btn blue" id="outVisitSubmitBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    //确定申请外访按钮
    $('#outVisitSubmitBtn').click(function(){
        if(checkoutVisitSubmitForm()){
            /*
            var checkArray = new Array();
             var i=0;
             $(".case").each(function(){
             if(this.checked){
             checkArray[i] = $(this).val();
             i++;
             }
             });
             */
            var data = $('#outVisitSubmitForm').serialize();
            $.ajax({
                url:"<%=request.getContextPath()%>/rest/outVisit/submitOutVisit?date="+new Date().toTimeString(),
                type:"post",
                data:data,
                dataType: "json",
                success:function(data){
                    var $outVisitCheckError = $('#outVisitCheckError');
                    $outVisitCheckError.text("");
                    if(data.success){
                        $('#outVisitAddModal').modal('hide');
                        $('#outVisitSubmitForm').resetForm();
                        MSG.alert(data.message);
                    }else {
                        $outVisitCheckError.text(data.message);
                    }
                },
                error:function(jqXHR,textStatus,errorThrown){
                    MSG.show("执行发生异常");
                }
            });
        }
    });

    function checkoutVisitSubmitForm(){
        var $outVisitCheckError = $('#outVisitCheckError');
        $outVisitCheckError.text("");
        var custType = $('#custType').val();
        if(custType.length == 0){
            $outVisitCheckError.text("请选择客户类型");
            return false;
        }

        var submitReason = $('#submitReason').val();
        if(submitReason.length == 0){
            $outVisitCheckError.text("请填写申请外访的原因");
            return false;
        }
        return true;
    }

</script>
 