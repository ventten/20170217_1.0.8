<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!--导入委外催记窗口-开始-->
<div class="modal fade hideModal" id="outsrcCollect-addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:500px">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">导入委外催记</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outsrcCollect-addForm" enctype="multipart/form-data" method="post">
                    <div class="form-group classFile" style="margin-bottom:0;">
                        <label class="col-sm-3 control-label">催记文件</label>
                        <div class="col-sm-6" id="filePath_div">
                        	<input class="form-control" type="text" id="filePath" name="validateFile" readonly="readonly">
                        </div>
                        <input type="hidden" name="filePath" id="tofilePath" value=""/>
                        <a href="javascript:void(0)" class="input" style="margin-left:-20px;">
                        	添加文件
                            <input type="file" name="excelFile" onchange="valueto(this)" />
                        </a>
                        <label class="col-sm-3"></label>
                        <div class="col-sm-6" style="text-align:left;margin-top:10px">
                        	 <span class="redStar checkMessage" id="outsrcCollect-excelFileError"></span>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" type="submit" class="btn blue" id="outsrcCollect-addBtn">确定</button>
                <button class="btn btn-primary" type="button" class="btn default" data-dismiss="modal">返回</button>
            </div>
        </div>
    </div>
</div>
<!--导入委外催记窗口-结束-->

<script type="text/javascript" language="javascript">

    //导入按钮
    $("#outsrcCollect-addForm").validate({
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
           <%--  var $addBtn = $("#outsrcCollect-addBtn");
            $addBtn.attr("disabled",true);
            var $form = $("#outsrcCollect-addForm");
            $("#outsrcCollect-excelFileError").text("");
            $form.ajaxSubmit({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/outsrcCollect/importCollect",
                success : function(ret) {
                    $addBtn.attr('disabled',false);
                    if(ret.success){
                        $("#outsrcCollect-addModal").modal("hide");
                        $('#outsrcCollect-searchBtn').trigger("click");
                        MSG.alert(ret.message);
                        $form.resetForm();
                    }else{
                        $("#outsrcCollect-excelFileError").text(ret.message);
                    }
                },
                error:function(){
                    $addBtn.attr('disabled',false);
                    MSG.alert("导入失败");
                }
            }); --%>
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
        if(docName == ".xls" || docName == "xlsx"){
        	//debugger;
    	   $("#filePath").val(paths[paths.length-1]);
        }else{
        	MSG.alert("只能上传Excel文件！");
        	return;
        }
    }
  	
  	//点击确定上传文件
  	$('#outsrcCollect-addBtn').on('click',function(){
  		var $addBtn = $("#outsrcCollect-addBtn");
        $addBtn.attr("disabled",true);
        var $form = $("#outsrcCollect-addForm");
        $("#outsrcCollect-excelFileError").text("");
        $form.ajaxSubmit({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcCollect/importCollect",
            success : function(ret) {
                $addBtn.attr('disabled',false);
                if(ret.success){
                    $("#outsrcCollect-addModal").modal("hide");
                    $('#outsrcCollect-searchBtn').trigger("click");
                    MSG.alert(ret.message);
                    $form.resetForm();
                }else{
                    $("#outsrcCollect-excelFileError").text(ret.message); 
                }
            },
            error:function(){
                $addBtn.attr('disabled',false);
                MSG.alert("导入失败");
            }
        });
  	})

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