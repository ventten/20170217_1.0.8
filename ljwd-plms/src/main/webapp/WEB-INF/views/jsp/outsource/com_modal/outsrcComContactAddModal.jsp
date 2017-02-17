<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<!--导入通讯录窗口-开始-->
<div class="modal fade hideModal" id="outsrcComContactAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">委外机构-通讯录</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal" id="outsrcComContactAddForm" enctype="multipart/form-data" method="post">
                    <table>
                        <tr>
                            <td class="outSouTd1">
                                <label class="col-sm-3 control-label outSouLabel">外包公司</label>
                             </td>
                             <td class="outSouTd2" >
                                 <div class="outSouTdDiv">
                                     <select name="outsrcComId" class="collection">
                                         <c:forEach items="${outsrcComList}" var="item">
                                             <option value="${item.id}">${item.outsrcComName}</option>
                                         </c:forEach>
                                     </select>
                                 </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="outSouTd1">
                                <label class="col-sm-3 control-label outSouLabel">通讯录</label>
                             </td>
                             <td class="outSouTd2 classFile" >
                                 <div class="outSouTdDiv" id="filePath_div">
                                 	<input class="collection" type="text" id="filePath" name="validateFile" readonly="readonly">
                                 </div>
                                 <input type="hidden" name="filePath" id="tofilePath" value=""/>
                                 <a href="javascript:void(0)" class="input">
                                 	添加文件
                                    <input type="file" name="excelFile" onchange="valueto(this)"/>
                                </a>
                            </td>
                        </tr>
                    </table>
                    <div class="modal-footer">
                        <button class="btn btn-primary" type="submit" id="outsrcContactCom-importBtn">确定</button>
                        <button class="btn btn-primary" type="button" data-dismiss="modal">返回</button>
                        <button class="btn btn-default" type="reset">清除</button>
                    </div>
                </form>
                <div>
                    <span>温馨提示：</span><br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;<span>1、目前仅支持上传Excel文件</span><br/>
                    &nbsp;&nbsp;&nbsp;&nbsp;<span>2、内容格式如下：</span><br/>
                    <table class="table table-bordered">
                        <tr>
                            <td class="active text-center">姓名</td>
                            <td class="active text-center">职位</td>
                            <td class="active text-center">手机</td>
                            <td class="active text-center">办公座机</td>
                            <td class="active text-center">邮箱</td>
                        </tr>
                        <tr>
                            <td class="text-center">文本格式</td>
                            <td class="text-center">文本格式</td>
                            <td class="text-center">文本格式</td>
                            <td class="text-center">文本格式</td>
                            <td class="text-center">文本格式</td>
                        </tr>
                        <tr>
                            <td class="text-center">xxx</td>
                            <td class="text-center">部门总经理</td>
                            <td class="text-center">135-0908-8938</td>
                            <td class="text-center">0755-56352326</td>
                            <td class="text-center">111@qq.com</td>
                        </tr>
                    </table>
                </div>
            </div>

        </div>
    </div>
</div>
<!--导入通讯录窗口-结束-->

<script type="text/javascript" language="javascript">

    //导入按钮
    $("#outsrcComContactAddForm").validate({
        unhighlight: function (element, errorClass, validClass) { //验证通过
            $(element).tooltip("destroy").removeClass(errorClass);
        },
        errorPlacement: function (label, element) {
            //让验证提示显示在验证框下面 注：有些地方如果动态添加这个属性不成功就手动添加data-placement="bottom"属性
            $(element).attr("data-placement","bottom");
            $(element).tooltip("destroy"); /*必需*/
            $(element).attr("title", $(label).text()).tooltip("show");
        },
        errorElement: "div",
        rules: {
            outsrcComId: {
                required: true
            },
            excelFile: {
                required: true
            }
        },
        messages: {
            outsrcComId: {
                required: "请输入选择外包公司"
            },
            excelFile: {
                required: "请选择文件"
            }
        },
        //验证通过之后回调
        submitHandler: function(form) {
            var $importBtn = $("#outsrcContactCom-importBtn");
            $importBtn.attr("disabled",true);
            var $form = $("#outsrcComContactAddForm");
            $form.ajaxSubmit({
                type : 'POST',
                dataType : "json",
                url : "<%=request.getContextPath()%>/rest/outsrcCom/importOutsrcComContact",
                success : function(ret) {
                    $importBtn.attr('disabled',false);
                    if(ret.success){
                        $("#outsrcComContactAddModal").modal("hide");
                        $('#outsrcCom-searchBtn').trigger("click");
                        MSG.show(ret.message);
                        $form.resetForm();
                    }else{
                        $("#outsrcComContactMessage").text(ret.message);
                    }
                },
                error:function(){
                    MSG.show("系统异常,稍后重试");
                    $importBtn.attr('disabled',false);
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
        if(docName == ".xls" || docName == "xlsx"){
        	//debugger;
    	   $("#filePath").val(paths[paths.length-1]);
        }else{
        	MSG.alert("只能上传Excel文件！");
        	return;
        }
    }
  	
  	//点击确定上传文件
  	$('#outsrcContactCom-importBtn').on('click',function(){
  		var $importBtn = $("#outsrcContactCom-importBtn");
        $importBtn.attr("disabled",true);
        var $form = $("#outsrcComContactAddForm");
        $form.ajaxSubmit({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/outsrcCom/importOutsrcComContact",
            success : function(ret) {
                $importBtn.attr('disabled',false);
                if(ret.success){
                    $("#outsrcComContactAddModal").modal("hide");
                    $('#outsrcCom-searchBtn').trigger("click");
                    MSG.show(ret.message);
                    $form.resetForm();
                }else{
                    $("#outsrcComContactMessage").text(ret.message);
                }
            },
            error:function(){
                MSG.show("系统异常,稍后重试");
                $importBtn.attr('disabled',false);
            }
        });
  	})

</script>