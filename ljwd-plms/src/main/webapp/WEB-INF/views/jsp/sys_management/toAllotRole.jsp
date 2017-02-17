<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>分配角色</title>
    <jsp:include page="/WEB-INF/views/header.jsp" flush="true"/>  
</head>

<div class="systemManage">
    <div class="container-fluid">
        <form id="allotForm">
            <label for="userId" class="right-space-2">账号</label>
            <input type="text" id="userId" name="userId" value="${selectedUser.userId}" class="collection input-border right-space-2" readonly/>
            <label for="userName">姓名</label>
            <input type="text" id="userName" name="userName" value="${selectedUser.userName}" class="collection input-border right-space-2" disabled/>
            <input class="btn btn-primary right-space-2" type="button" id="allotBtn" value="分配"/><br/><br/>
            <div class="row">
                <br/>
                <c:forEach items="${roleList}" var="role" varStatus="status">
                    <c:choose>
                        <c:when test="${role.hasRole}">
                            <div class="col-xs-2">
                                <input type="checkbox" name="roleIds" value="${role.id}" id="roleIds${role.id}" checked>
                                <span class="right-space"><label for="roleIds${role.id}">${role.roleName}</label></span>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="col-xs-2">
                                <input type="checkbox" name="roleIds" value="${role.id}" id="roleIds${role.id}">
                                <span class="right-space"><label for="roleIds${role.id}">${role.roleName}</label></span>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </div>
        </form>
    </div>
</div>
<jsp:include page="/WEB-INF/views/footer.jsp" flush="true"/>
<script type="text/javascript" language="javascript">

    //按钮提交
    $('#allotBtn').on( 'click', function () {
        var $form = $('#allotForm');
        //表单校验
        if (!$form.valid()){
            return false;
        }
        $.ajax({
            type : 'POST',
            dataType : "json",
            url : "<%=request.getContextPath()%>/rest/user/allotRole",
            data : $form.serialize(),
            success : function(ret) {
                MSG.show(ret.message);
                if(ret.success){
                    H.hrefReturnUp();
                }
            },
            error:function(){
                MSG.show("系统异常,稍后重试");
            }
        });
    });

    $(document).ready(function() {
        //新增表单校验
        validate($("#allotForm"));
    });

    //表单校验
    function validate($validateForm){
        $validateForm.validate({
            rules: {
                userId: {
                    required: true
                },
                roleIds: {
                    required: true
                }
            },
            messages: {
                userId: {
                    required: "请选择用户"
                },
                roleIds: {
                    required: "请选择角色"
                }
            }
        });
    }

    /************设置页面加载时修改页面左侧菜单栏状态*************/
    $(function(){
   		var Val=$('.systemManage').attr('class');
   		$('#'+Val).click();
   		$('#'+Val+'_allotRole').addClass('choose_active');
   		//点击菜单移除选中项class
   		$('.sub-menu li').click(function(){
   			$('.sub-menu li').find('a').removeClass('choose_active');
   		})
    }) 
</script>


