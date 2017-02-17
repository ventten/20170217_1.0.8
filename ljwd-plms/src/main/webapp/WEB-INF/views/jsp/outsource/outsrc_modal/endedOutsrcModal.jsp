<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--结案窗口-开始-->
<div class="modal fade hideModal" id="endedOutsrcModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">委外结案</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="outsrcAppl-endedOutsrcForm">
                    <input type="hidden" name="idsArr" id="endedOutsrc-checkedIdsArr"/>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">选定案件数</label>
                        <div class="col-sm-5">
                            <span class="redStar" id="endedOutsrc-checkedCount"></span> 件
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-3 control-label">结案日期</label>
                        <div class="col-sm-5">
                            <input class="form-control" name="endDate" id="endedOutsrc-endDate" onfocus="WdatePicker({readOnly:true})" readonly>
                        </div>
                        <span class="redStar" id="endedOutsrc-endDateError"></span>
                    </div>
                </form>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="button" class="btn blue" id="outsrcAppl-endedOutsrcBtn">确定</button>
                    <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!--结案窗口-结束-->

<script type="text/javascript" language="javascript">

    //确定结案按钮
    $('#outsrcAppl-endedOutsrcBtn').on('click', function () {
        var $btn = $(this);
        $btn.attr("disabled",true);
        var endDate = $('#endedOutsrc-endDate').val();
        if(!endDate){
            $('#endedOutsrc-endDateError').html("请选择结案日期");
            $btn.attr("disabled",false);
            return false;
        }else{
            $('#endedOutsrc-endDateError').html("");
        }
        var $form = $("#outsrcAppl-endedOutsrcForm");
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcAppl/ended",
            data : $form.serialize(),
            success : function(ret) {
                $btn.attr('disabled',false);
                if(ret.success){
                    $("#endedOutsrcModal").modal("hide");
                    $('#outsrcAppl-searchBtn').trigger("click");
                }
                MSG.alert(ret.message);
            },
            error:function(){
                $btn.attr('disabled',false);
                MSG.alert("结案失败");
            }
        });
    });

    //设置模态框垂直居中函数
    function centerModals(){
        $('.modal').each(function(i){
            var $clone = $(this).clone().css('display', 'block').appendTo('body');
            var top = Math.round(($clone.height() - $clone.find('.modal-content').height()) / 2);
            top = top > 20 ? top : 0;
            $clone.remove();
            $(this).find('.modal-content').css("margin-top", top-20);
        });
    }
    // 在模态框出现的时候调用垂直居中函数
    $(window).on('resize', centerModals);
    // 在窗口大小改变的时候调用垂直居中函数
    $('.modal').on('show.bs.modal', centerModals);

</script>