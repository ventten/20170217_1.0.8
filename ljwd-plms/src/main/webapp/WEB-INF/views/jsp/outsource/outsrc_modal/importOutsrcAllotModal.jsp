<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!--导入分配窗口-开始-->
<div class="modal fade hideModal" id="outsrcAppl-importAllotModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:500px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">导入分配</h4>
            </div>
            <form class="form-horizontal" id="outsrcAppl-importAllotForm" enctype="multipart/form-data" method="post">
	           <div class="modal-body">
	                   <div class="form-group classFile">
	                       <label class="col-sm-3 control-label">分配文件</label>
	                       <div class="col-sm-6">
	                       	    <input class="form-control" type="text" id="filePath" name="validateFile" readonly="readonly">
	                       </div>
	                       <a href="javascript:void(0)" class="input" style="margin-left:-20px;">
	                       		添加文件<input type="file" name="excelFile" onchange="valueto(this)"/>
	                       </a>
	                   </div>
	                   <div class="form-group">
	                       <label class="col-sm-3 control-label"></label>
	                       <div class="col-sm-6">
	                           <span class="left-space-2 redStar" id="outsrcAppl-excelFileError"></span>
	                       </div>
	                   </div>
	           </div>
	           <div class="modal-footer">
	               <button class="btn btn-primary" type="submit" class="btn blue" id="outsrcAppl-importAllotBtn">确定</button>
	               <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
	           </div>
            </form>
        </div>
    </div>
</div>
<!--导入分配窗口-结束-->

<script type="text/javascript" language="javascript">

    //导入按钮
    $("#outsrcAppl-importAllotForm").validate({
        unhighlight: function (element, errorClass, validClass) {
            //验证通过
            $(element).tooltip("destroy").removeClass(errorClass);
        },
        errorPlacement: function (label, element) {
            //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
            $(element).attr("data-placement","bottom");
            $(element).tooltip("destroy"); /* 必需 */
            $(element).attr("title", $(label).text()).tooltip("show");
        },
        errorElement: "div",
        rules: {
            excelFile: {
                required: true
            }
        },
        messages: {
            excelFile: {
                required: "请选择文件"
            }
        },
        //验证通过之后回调
        submitHandler: function(form) {
            var $importAllotBtn = $("#outsrcAppl-importAllotBtn");
            $importAllotBtn.attr("disabled",true);
            var $form = $("#outsrcAppl-importAllotForm");
            $("#outsrcAppl-excelFileError").text("");
            $form.ajaxSubmit({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/outsrcAppl/importAllot",
                success : function(ret) {
                    $importAllotBtn.attr('disabled',false);
                    if(ret.success){
                        $("#outsrcAppl-importAllotModal").modal("hide");
                        $('#outsrcAppl-searchBtn').trigger("click");
                        MSG.alert(ret.message);
                        $form.resetForm();
                    }else{
                        $("#outsrcAppl-excelFileError").text(ret.message);
                    }
                },
                error:function(){
                    $importAllotBtn.attr('disabled',false);
                    MSG.alert("导入分配失败");
                }
            });
        },
        //不通过时回调
        invalidHandler: function(form, validator) {
            return false;
        }
    });
    
    //把file的文件名显示在input中
    function valueto(obj){
        var filepath = obj.value;
        var paths = filepath.split("\\");
        var docName = paths[paths.length-1].substring(paths[paths.length-1].length-4).toLowerCase();
        $("#filePath").val(paths[paths.length-1]);
    }

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