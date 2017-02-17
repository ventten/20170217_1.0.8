<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--修改委外信息窗口-开始-->
<div class="modal fade hideModal" id="modifyOutsrcModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:450px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">修改委外信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="outsrcAppl-modifyOutsrcForm">
                    <input type="hidden" name="idsArr" id="modifyOutsrc-checkedIdsArr"/>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">选定案件数</label>
                        <div class="col-sm-6">
                            <span class="redStar" id="modifyOutsrc-checkedCount"></span> 件
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">外包公司</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="comId" id="modifyOutsrc-comId">
                                <c:forEach items="${outsrcComList}" var="item">
                                    <c:if test="${'Y' eq item.isActive}">
                                        <option value="${item.id}">${item.outsrcComName}</option>
                                    </c:if>
                                </c:forEach>
                            </select>
                        </div>
                        <span class="redStar" id="modifyOutsrc-comIdError"></span>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">委外期限</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="months" id="modifyOutsrc-months">
                                <option value="2">2个月</option>
                                <option value="3">3个月</option>
                                <option value="6">6个月</option>
                                <option value="12">12个月</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="button" class="btn blue" id="outsrcAppl-modifyOutsrcBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!--修改委外信息窗口-结束-->

<script type="text/javascript" language="javascript">

    //确定修改按钮
    $('#outsrcAppl-modifyOutsrcBtn').on('click', function () {
        var $btn = $(this);
        $btn.attr("disabled",true);
        var comId = $('#modifyOutsrc-comId').val();
        if(!comId){
            $('#modifyOutsrc-comIdError').html("请选择外包公司");
            $btn.attr("disabled",false);
            return false;
        }else{
            $('#modifyOutsrc-comIdError').html("");
        }
        var $form = $("#outsrcAppl-modifyOutsrcForm");
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcAppl/modify",
            data : $form.serialize(),
            success : function(ret) {
                $btn.attr('disabled',false);
                if(ret.success){
                    $("#modifyOutsrcModal").modal("hide");
                    $('#outsrcAppl-searchBtn').trigger("click");
                }
                MSG.alert(ret.message);
            },
            error:function(){
                $btn.attr('disabled',false);
                MSG.alert("修改外包公司失败");
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