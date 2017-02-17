<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>维护角色</title>
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
	
</style>
<div class="systemManage">
    <div class="container-fluid">
        <form id="updateForm" class="form-horizontal">

            <div class="row">
                <div class="form-group">
                    <input type="hidden" name="id" value="${role.id}"/>
                    <input type="hidden" name="recVer" value="${role.recVer}"/>
                    <label for="roleName" class="col-xs-1 control-label"><span class="redStar">* </span>角色名称</label>
                    <div class="col-xs-2">
                        <input type="text" class="form-control" id="roleName" name="roleName" value="${role.roleName}"/>
                    </div>
                    <label for="roleSign" class="col-xs-1 control-label">角色编号</label>
                    <div class="col-xs-2">
                        <input type="text" class="form-control" id="roleSign" name="roleSign" value="${role.roleSign}" disabled/>
                    </div>
                    <label for="description" class="col-xs-1 control-label">备注</label>
                    <div class="col-xs-4">
                        <input type="text" class="form-control" id="description" name="description" value="${role.description}"/>
                    </div>
                    <input class="btn btn-primary" type="button" id="role-updateBtn" value="修改"/>
                    <br/><br/>
                 </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <ul class="nav nav-tabs" role="tablist">
                        <c:forEach items="${topFuncList}" var="topFunc" varStatus="status">
                            <c:choose>
                                <c:when test="${status.first}">
                                    <li role="presentation" class="active">
                                        <a id="${topFunc.id}" href="#panel${topFunc.id}" aria-controls="${topFunc.id}" role="tab" data-toggle="tab">${topFunc.funcName}</a>
                                    </li>
                                </c:when>
                                <c:otherwise>
                                    <li role="presentation">
                                        <a id="${topFunc.id}" href="#panel${topFunc.id}" aria-controls="${topFunc.id}" role="tab" data-toggle="tab">${topFunc.funcName}</a>
                                    </li>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </ul>

                    <div class="tab-content">
                      <%-- 首级页签 --%>
                        <c:forEach items="${topFuncList}" var="topFunc" varStatus="status">
                            <c:set var="topFuncId" value="${topFunc.id}"/>
                            <!-- 第一级功能 -->
                            <!-- 第一级功能下的第一个功能table初始化被显示 -->
                            <c:choose>
                                <c:when test="${status.first}">
                                    <div role="tabpanel" class="tab-pane active" id="panel${topFunc.id}">
                                        <table class="table table-bordered">
                                            <c:forEach items="${secondFuncList}" var="secondFunc">
                                                <%-- 判断是否是某页签下的权限 --%>
                                                <c:if test="${secondFunc.pFuncId eq topFuncId}">
                                                    <tr>
                                                        <td>
                                                        	<div class="row classdivp">
	                                                            <p class="toleft pClass" >${secondFunc.funcName}</p>
	                                                            <div class="checkAllDiv">
	                                                            	<input class="regular-checkbox" type="checkbox" id="update_all${secondFunc.id}" onclick="clickCheckBoxAll('update_all${secondFunc.id}','divToCheckbox${secondFunc.id}')" value="全选"/>
	                                                            	<label for="update_all${secondFunc.id}"></label>
	                                                            	<label for="update_all${secondFunc.id}">全选</label>
	                                                            </div>
	                                                         </div>
                                                            <div class="row classdivtwo" id="divToCheckbox${secondFunc.id}">
                                                                <!-- 迭代二级功能下的权限操作 -->
                                                                <c:forEach items="${funcPermList}" var="perm">
                                                                    <c:if test="${secondFunc.id eq perm.funcId}">
                                                                            <c:choose>
                                                                                <c:when test="${perm.hasPerm}">
                                                                                	<div class="checkAllDiv regular-label" >
                                                                                    	<input checked="checked" class="regular-checkbox" type="checkbox" name="permIds" id="update_checkbox${perm.permissionId}" value="${perm.permissionId}" onclick="clickInputCheckbox('update_all${secondFunc.id}','divToCheckbox${secondFunc.id}')"/>
                                                                                    	<label for="update_checkbox${perm.permissionId}"></label>
                                                                                    	<label for="update_checkbox${perm.permissionId}">${perm.permissionName}</label>
                                                                                	</div>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                	<div class="checkAllDiv regular-label" >
                                                                                    	<input class="regular-checkbox" type="checkbox" name="permIds" id="update_checkbox${perm.permissionId}" value="${perm.permissionId}" onclick="clickInputCheckbox('update_all${secondFunc.id}','divToCheckbox${secondFunc.id}')"/>
                                                                                    	<label for="update_checkbox${perm.permissionId}"></label>
                                                                                    	<label for="update_checkbox${perm.permissionId}">${perm.permissionName}</label>
                                                                                	</div>
                                                                                </c:otherwise>
                                                                            </c:choose>
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
	                                                            	<input class="regular-checkbox" type="checkbox" id="other_update_all${secondFunc.id}" onclick="clickCheckBoxAll('other_update_all${secondFunc.id}','other_divToCheckbox${secondFunc.id}')" value="全选"/>
	                                                                <label for="other_update_all${secondFunc.id}"></label>
                                                                    <label for="other_update_all${secondFunc.id}">全选</label>
	                                                            </div>
                                                            </div>
                                                            <div class="row classdivtwo" id="other_divToCheckbox${secondFunc.id}">
                                                                <!-- 迭代二级权限下的操作 -->
                                                                <c:forEach items="${funcPermList}" var="perm">
                                                                    <c:if test="${secondFunc.id eq perm.funcId}">
                                                                            <c:choose>
                                                                                <c:when test="${perm.hasPerm}">
                                                                                	<div class="checkAllDiv regular-label">
                                                                                    	<input checked="checked" class="regular-checkbox" type="checkbox" name="permIds" id="other_update_checkbox${perm.permissionId}" value="${perm.permissionId}"  onclick="clickInputCheckbox('other_update_all${secondFunc.id}','other_divToCheckbox${secondFunc.id}')"/>
                                                                                    	<label for="other_update_checkbox${perm.permissionId}"></label>
                                                                                        <label for="other_update_checkbox${perm.permissionId}">${perm.permissionName}</label>
                                                                                	</div>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                	<div class="checkAllDiv regular-label">
                                                                                    	<input class="regular-checkbox" type="checkbox" name="permIds" id="other_update_checkbox${perm.permissionId}" value="${perm.permissionId}"  onclick="clickInputCheckbox('other_update_all${secondFunc.id}','other_divToCheckbox${secondFunc.id}')"/>
                                                                                    	<label for="other_update_checkbox${perm.permissionId}"></label>
                                                                                        <label for="other_update_checkbox${perm.permissionId}">${perm.permissionName}</label>
                                                                                	</div>
                                                                                </c:otherwise>
                                                                            </c:choose>
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
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript" language="javascript">

    //按钮提交
    $('#role-updateBtn').on( 'click', function () {
        var $updateBtn = $("#role-updateBtn");
        $updateBtn.attr("disabled",true);
        var $form = $('#updateForm');
        //表单校验
        if (!$form.valid()){
            $updateBtn.attr('disabled',false);
            return false;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/role/updateRole",
            data : $form.serialize(),
            success : function(ret) {
                MSG.show(ret.message);
                $updateBtn.attr('disabled',false);
                if(ret.success){
                    H.hrefReturnUp();
                }
            },
            error:function(){
                MSG.show("系统异常,稍后重试");
                $updateBtn.attr('disabled',false);
            }
        });
    });

    $(document).ready(function() {
        //新增表单校验
        validate($("#updateForm"));
        checkAll();
    });

    //表单校验
    function validate($validateForm){
        $validateForm.validate({
            rules: {
                roleName: {
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
                permIds: {
                    required: "请选择角色权限"
                }
            }
        });
    }
  //全选，or全部选  temp1为全选框的ID temp2为所有权限选择勾选框的父级div的ID
  function clickCheckBoxAll(temp1,temp2){
	  if($("#"+temp1).prop("checked") == true  ){
		  $("#"+temp2).find("input[name='permIds']").prop("checked", true);
	  }else{
		  $("#"+temp2).find("input[name='permIds']").prop("checked",false);
	  } 
	  
  }
  //单个checkbox勾选时间，如果某一全选下有单个勾选被取消。    temp1 为 全选checkbox的ID。 temp2为所有权限选择勾选框的父级div的ID
  function clickInputCheckbox(temp1,temp2){
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
  
  /************设置页面加载时修改页面左侧菜单栏状态*************/
  $(function(){
 		var Val=$('.systemManage').attr('class');
 		$('#'+Val).click();
 		$('#'+Val+'_addRole').addClass('choose_active');
 		//点击菜单移除选中项class
 		$('.sub-menu li').click(function(){
 			$('.sub-menu li').find('a').removeClass('choose_active');
 		})
  })
  //检查全选下的所有勾选框，如果勾选框全部被勾选，就要让全选框被勾选
  function checkAll(){
		<c:forEach items="${secondFuncList}" var="secondFunc">
			//判断每一个对应的模块权限下的勾选框的个数
			var countch = 0;
			//判断每一个对应的模块权限下面被勾选的勾选框个数
			var counted = 0;
		    //遍历出每一个功能模块权限页签
			<c:forEach items="${funcPermList}" var="perm">
				//判断是否是模块功能下的勾选框
				if("${secondFunc.id}" == "${perm.funcId}"){
					countch++;
					//判断是否是模块功能下被勾选的勾选框
					if("${perm.hasPerm}" == "true"){
						counted++;
					}
				}
			</c:forEach>
			//如果countch和counted相等就说明某模块功能下的权限勾选框全部被勾选，那么就把其对应的全选框勾选上
			if(countch == counted){
				if($("#update_all"+"${secondFunc.id}").length ==1){
					$("#update_all"+"${secondFunc.id}").prop("checked", true);
				}
			    if($("#other_update_all"+"${secondFunc.id}").length == 1){
					$("#other_update_all"+"${secondFunc.id}").prop("checked", true);
				}
			}
		</c:forEach>
	}
</script>