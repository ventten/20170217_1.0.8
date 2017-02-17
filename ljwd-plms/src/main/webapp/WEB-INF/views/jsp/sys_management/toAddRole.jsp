<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>角色管理-新增</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>
</head>
<style>
	.toleft{
		float: left;
	}
	.checkAllDiv{
		float: left;
        text-align: left;
        margin-right: 20px
	}
	.classdivp{
		margin-left: 20px;
	}
	.classdivtwo{
		margin-left: 100px;
		margin-top: 6px;
	}
	.pClass{
		margin-right: 10px;
	}
	.form-group table tr td div label{
		width: 120px;
	}
	.form-group table tr td div{
		float: left;
	}
	
	.inDiv div{
		position: absolute;
		margin-top: 21px;
		z-index: 9;
	}
	.role-addBtn{
		float: left;
		margin-left: 10px;
	}
	 #role-addBtn-td div{
		margin-top: 5px;
    	margin-left: 10px;
	} 
</style>
<div class="systemManage">
<div class="container-fluid">
   <form id="addForm" class="form-horizontal">
   	<div class="panel panel-default">
	   	<div class="panel-heading">
	        <h3 class="panel-title">添加角色</h3>
	    </div>
	    <div class="panel-body">
		    <div class="row">
		        <div class="form-group">
		        	<table>
		        		<tr>
			        		<td>
			        			<div>
					            	<label for="roleSign" class="col-xs-1 control-label"><span class="redStar">* </span>角色编号</label>
					            </div>
					            <div class=" inDiv">
					                <input type="text" class="collection" id="roleSign" name="roleSign"/>
					            </div>
				            </td>
				            <td>
				            	<div>
					            	<label for="roleName" class="col-xs-1 control-label"><span class="redStar">* </span>角色名称</label>
					            </div>
					            <div class=" inDiv">
					                <input type="text" class="collection" id="roleName" name="roleName"/>
					            </div>
				            </td>
				            <td>
				            	<div>
					            	<label for="description" class="col-xs-1 control-label">说明</label>
					            </div>
					            <div class=" inDiv">
					                <input type="text" class="collection" id="description" name="description"/>
					            </div>
				            </td>
				            <td id="role-addBtn-td">
				            		<button class="btn btn-primary role-addBtn" id="role-addBtn">添加</button>
				            </td>
			            </tr>
		            </table>
		        </div>
		    </div>
	    </div>
	</div>
    <div class="row">
        <div class="col-xs-12">
            <ul class="nav nav-tabs" role="tablist">
            	<c:forEach items="${topFuncList}" var="topFunc" varStatus="status">
                    <c:choose>
                        <c:when test="${status.first}">
                            <li role="presentation" class="active">
                                <a id="${topFunc.id}" href="#panel${topFunc.id}"  aria-controls="${topFunc.id}" role="tab" data-toggle="tab" onclick="removeErrorCalss()">${topFunc.funcName}</a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li role="presentation">
                                <a id="${topFunc.id}" href="#panel${topFunc.id}"  aria-controls="${topFunc.id}" role="tab" data-toggle="tab" onclick="removeErrorCalss()">${topFunc.funcName}</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
            	</c:forEach>
            </ul>

            <!-- Tab panes -->
            <div class="tab-content">
                <!-- 迭代权限 -->
				<c:forEach items="${topFuncList}" var="topFunc" varStatus="status">
                    <c:set var="topFuncId" value="${topFunc.id}"/>
					<!-- 第一级功能 -->
                    <!-- 第一级功能下的第一个功能table初始化被显示 -->
                    <c:choose>
                        <c:when test="${status.first}">
                            <div role="tabpanel" class="tab-pane active" id="panel${topFunc.id}">
                                <table class="table table-bordered">
                                    <c:forEach items="${secondFuncList}" var="secondFunc">
                                        <c:if test="${secondFunc.pFuncId eq topFuncId}">
                                            <tr>
                                                <td>
                                                <div class="row classdivp">
                                                    <p class="toleft pClass">${secondFunc.funcName}</p>
                                                    <div class="checkAllDiv ">
	                                                   <input class="regular-checkbox" type="checkbox" id="newCheckboxall${secondFunc.id}" onclick="clickCheckBoxAllNew('newCheckboxall${secondFunc.id}','divnewCheckbox${secondFunc.id}')" value="全选"/>
	                                                   <label for="newCheckboxall${secondFunc.id}"></label>
                                                       <label for="newCheckboxall${secondFunc.id}">全选</label>
	                                                </div>
                                                </div>
                                                    <div class="row classdivtwo" id="divnewCheckbox${secondFunc.id}">
                                                        <!-- 迭代二级功能下的权限操作 -->
                                                        <c:forEach items="${funcPermList}" var="perm">
                                                            <c:if test="${secondFunc.id == perm.funcId}">
                                                                <div class="checkAllDiv regular-label">
                                                                    <input class="regular-checkbox"  type="checkbox" name="permIds" id="newCheckbox${perm.permissionId}" value="${perm.permissionId}" onclick="clickInputCheckboxNew('newCheckboxall${secondFunc.id}','divnewCheckbox${secondFunc.id}')">
                                                                    <label for="newCheckbox${perm.permissionId}"></label>
                                                                    <label for="newCheckbox${perm.permissionId}">${perm.permissionName}</label>
                                                                </div>
                                                            </c:if>
                                                        </c:forEach>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </table>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div role="tabpanel" class="tab-pane" id="panel${topFunc.id}">
                                <table class="table table-bordered">
                                    <c:forEach items="${secondFuncList}" var="secondFunc">
                                        <c:if test="${secondFunc.pFuncId eq topFuncId}">
                                            <tr>
                                                <td>
                                                <div class="row classdivp">
                                                    <p class="toleft pClass">${secondFunc.funcName}</p>
                                                    <div class="checkAllDiv">
	                                                     <input class="regular-checkbox" type="checkbox" id="othernewCheckbox${secondFunc.id}" onclick="clickCheckBoxAllNew('othernewCheckbox${secondFunc.id}','divothernewCheckbox${secondFunc.id}')" value="全选"/>
	                                                     <label for="othernewCheckbox${secondFunc.id}"></label>
                                                       <label for="othernewCheckbox${secondFunc.id}">全选</label>
	                                                </div>
                                                 </div>
                                                    <div class="row classdivtwo" id="divothernewCheckbox${secondFunc.id}">
                                                        <!-- 迭代二级权限下的操作 -->
                                                        <c:forEach items="${funcPermList}" var="perm">
                                                            <c:if test="${secondFunc.id == perm.funcId}">
                                                                <div class="checkAllDiv regular-label">
                                                                    <input class="regular-checkbox"  type="checkbox" name="permIds" id="other_newCheckbox${perm.permissionId}" value="${perm.permissionId}" onclick="clickInputCheckboxNew('othernewCheckbox${secondFunc.id}','divothernewCheckbox${secondFunc.id}')">
                                                                    <label for="other_newCheckbox${perm.permissionId}"></label>
                                                                    <label for="other_newCheckbox${perm.permissionId}">${perm.permissionName}</label>
                                                                </div>
                                                            </c:if>
                                                        </c:forEach>
                                                    </div>
                                                </td>
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </table>
                            </div>
                        </c:otherwise>
                    </c:choose>
				</c:forEach>
            </div>
        </div>
    </div>
    </form>
</div>
</div>
<script type="text/javascript">
	//添加按钮点击事件
	$("#role-addBtn").on("click",function(){
        var $addBtn = $("#role-addBtn");
        $addBtn.attr("disabled",true);
		var $form = $("#addForm");
		//表单校验
        if (!$form.valid()){
            $addBtn.attr('disabled',false);
            return false;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/role/addRole",
            data : $form.serialize(),
            success : function(ret) {
                MSG.show(ret.message);
                $addBtn.attr('disabled',false);
                if(ret.success){
                    H.hrefReturnUp();
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
        validate($("#addForm"));
    });

    //表单校验
    function validate($validateForm){
        $validateForm.validate({
        	/* errorPlacement:function(error, element) {
        		//如果验证提示是checkbox，那么提示信息就显示在主“确认”按钮后面。
        		if (element.is(":checkbox")){
        			error.appendTo("#role-addBtn-td");
        			$("input[name='permIds']").removeClass("error");
        		}else{
					$('<br/>').appendTo(element.parent());   
	 				error.appendTo(element.parent());
        		} 
			},
			errorElement: "div", */
			unhighlight: function (element, errorClass, validClass) { //验证通过
                $(element).tooltip("destroy").removeClass(errorClass);
            },
            errorPlacement: function (label, element) {
                $(element).attr("data-placement","bottom");//让验证提示显示在验证框下面
                $(element).tooltip("destroy"); /*必需*/
                $(element).attr("title", $(label).text()).tooltip("show"); 
            },
            rules: {
                roleName: {
                    required: true,minlength:2
                },
                roleSign: {
                    required: true,minlength:2
                },
                permIds: {
                    required: true
                }
            },
            messages: {
                roleName: {
                    required: "请输入角色名称"
                },
                roleSign: {
                    required: "请输入角色标识"
                },
                permIds: {
                    required: "请选择角色权限"
                }
            }
        });
    }
  //全选，or全部选  temp1为全选框的ID temp2为所有权限选择勾选框的父级div的ID
    function clickCheckBoxAllNew(temp1,temp2){
        if($("#"+temp1).prop("checked") == true  ){
            $("#"+temp2).find("input[name='permIds']").prop("checked", true);
        }else{
            $("#"+temp2).find("input[name='permIds']").prop("checked",false);
        } 
        
    }
    //单个checkbox勾选时间，如果某一全选下有单个勾选被取消    temp1 为 全选checkbox的ID temp2为所有权限选择勾选框的父级div的ID
    function clickInputCheckboxNew(temp1,temp2){
        //某个权限下所有的单选框
        var inputCheck = $("#"+temp2).find("input[name='permIds']").length;
        //某个权限下被勾选的单选框
        var inputChecked = $("#"+temp2).find("input[name='permIds']:checked").length;
        //如果某个单选框没有被选上，那么全选框的勾就要去掉。否则就勾上全选框
        if(inputCheck == inputChecked){
            $("#"+temp1).prop("checked", true);
        }else{
            $("#"+temp1).prop("checked",false);
        }
    }
    //每次点击页签的时候都移除因为验证给checkbox添加的样式
    function removeErrorCalss(){
    	$("input[name='permIds']").removeClass("error");
    }
    
    /************设置页面加载时修改页面左侧菜单栏状态*************/
    $(function(){
   		var Val=$('.systemManage').attr('class');
   		$('#'+Val).click();
   		$('#'+Val+'_addRole').addClass('choose_active');
   		$('.sub-menu li').click(function(){
   			$('.sub-menu li').find('a').removeClass('choose_active');
   		})
    })
</script>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
