<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--新增沟通日志窗口-开始-->
<div class="modal fade hideModal" id="outsrcComLogAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">沟通日志-新增</h4>
            </div>
            <form class="form-horizontal" id="outsrcComLogAddForm">
	            <div class="modal-body">
	                <div class="form-group">
	                    <label class="col-sm-3 control-label">外包公司</label>
	                    <div class="col-sm-6" style="padding-left:0">
		                    <select name="outsrcComId">
		                        <c:forEach items="${outsrcComList}" var="item">
		                            <option value="${item.id}">${item.outsrcComName}</option>
		                        </c:forEach>
		                    </select>
	                    </div>
	                </div>
	                <div class="form-group">
	                    <label class="col-sm-3 control-label"><span class="redStar">* </span>沟通内容</label>
	                    <div class="col-sm-6" style="padding-left:0">
	                        <textarea name="content" style="width: 400px;height: 80px;resize: none;"></textarea>
	                    </div>
	                </div>
	            </div>
	            <div class="modal-footer">
	                <button class="btn btn-primary" type="button" id="outsrcLogCom-addBtn">新增</button>
	                <button class="btn btn-primary" type="button" data-dismiss="modal">返回</button>
	                <button class="btn btn-default" type="reset">清除</button>
	            </div>
            </form>
        </div>
    </div>
</div>
<!--新增沟通日志窗口-结束-->

<script type="text/javascript" language="javascript">

    //新增按钮
    $('#outsrcLogCom-addBtn').on( 'click', function () {
        var $addBtn = $(this);
        $addBtn.attr("disabled",true);
        var $form = $("#outsrcComLogAddForm");
        //表单校验
        if (!$form.valid()){
            $addBtn.attr('disabled',false);
            return false;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcCom/addOutsrcComLog",
            data : $form.serialize(),
            success : function(ret) {
                MSG.show(ret.message);
                $addBtn.attr('disabled',false);
                if(ret.success){
                    $("#outsrcComLogAddModal").modal("hide");
                    $('#outsrcCom-searchBtn').trigger("click");
                    $form.resetForm();
                }
            },
            error:function(){
                MSG.show("系统异常,稍后重试");
                $addBtn.attr('disabled',false);
            }
        });
    });

    $(document).ready(function() {
        //新增表单校验
        outsrcComLog_validate($("#outsrcComLogAddForm"));
    });

    //表单校验
    function outsrcComLog_validate($validateForm){
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
                outsrcComId: {
                    required: true
                },
                content: {
                    required: true,maxlength:100
                }
            },
            messages: {
                outsrcComId: {
                    required: "请输入选择外包公司"
                },
                content: {
                    required: "请输入沟通内容"
                }
            }
        });
    }

</script>