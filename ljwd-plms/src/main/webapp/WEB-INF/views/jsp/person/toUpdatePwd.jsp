<%--
  Created by IntelliJ IDEA.
  User: zhengzw
  Date: 2016/7/11 11:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>密码修改</title>
</head>
<body>

<div>
    <form id="updatePwdForm" method="post">
        旧密码:<input type="password" id="oldPwd" name="oldPwd" required/><br/>
        新密码:<input type="password" id="newPwd" name="newPwd" required minlength="6" maxlength="16"/><br/>
        新密码:<input type="password" id="repeatPwd" name="repeatPwd" required minlength="6" maxlength="16"/><br/>
        <input type="submit" value="修改"/>&nbsp;&nbsp;<input type="reset" value="重置"/>
    </form>
</div>

</body>
</html>

<script type="text/javascript" language="javascript">

    $("#updatePwdForm").validate({
        rules: {},
        messages:{},
        //验证通过之后回调
        submitHandler: function(form) {
            var $form = $('#updatePwdForm');
            $form.ajaxSubmit({
                type:"POST",
                url:"<%=request.getContextPath()%>/rest/person/updatePwd",
                dataType : "json",
                success : function(ret){
                    $form.resetForm();
                    MSG.show(ret.message);
                }
            });
        },
        //不通过时回调
        invalidHandler: function(form, validator) {
            return false;
        }
    });

</script>
