<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--申请免扣窗口-开始-->
<div class="modal fade hideModal" id="offerExemptModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:460px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">申请免扣</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="offerExemptForm">
                    <input type="hidden" value="${applDetail.paymentId}" name="paymentId"/>
                    <input type="hidden" value="${applDetail.cntrctNo}" name="cntrctNo"/>
                    <div class="form-group">
                        <label class="col-sm-5 control-label label-base">免扣截止日期</label>
                        <div class="col-sm-5">
                            <input size="10" type="text" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'endDate\')||\'%y-%M-%d\'}'})" name="endDate" id="endDate" style="width:168px" readonly>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label"></label>
                        <div class="col-sm-7">
                            <span class="redStar checkMessage" id="offerExemptMessage"></span>
                        </div>
                    </div>
                </form>

            </div>
            <div class="modal-footer" style="text-align:center;padding-left:20px;">
                <button class="btn btn-primary" class="btn blue" id="offerExemptBtn">确定</button>
                <button class="btn btn-primary" class="btn default" data-dismiss="modal">取消</button>
            </div>
        </div>
    </div>
</div>
<!--申请免扣窗口-结束-->

<script type="text/javascript" language="javascript">

    //申请免扣提交
    $("#offerExemptBtn").on('click',function(){
        var endDate = $("#endDate").val();
        if(!endDate){
            MSG.alert("请选择免扣截止日期");
            return;
        }
        var $this = $("#offerExemptBtn");
        $this.attr("disabled",true);
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/caseCollection/addOfferExempt",
            data : $("#offerExemptForm").serialize(),
            beforeSend : function(){},
            success : function(ret) {
                $this.attr("disabled",false);
                if(ret.success){
                    $("#offerExemptModal").modal("hide");
                    MSG.alert(ret.message);
                }else{
                    $("#offerExemptMessage").text(ret.message);
                }
            },
            error:function(){
                $this.attr("disabled",false);
                MSG.show("操作失败,请刷新重试");
            }
        });
    });

</script>
