<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<base href="<%=basePath%>">
<meta charset="utf-8"/>
<title>贷后管理系统-登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<meta name="MobileOptimized" content="320">
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<!-- <link href="assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/> -->
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="assets/plugins/select2/select2_metro.css"/>
<!-- END PAGE LEVEL SCRIPTS -->
<!-- BEGIN THEME STYLES -->
<link href="assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
<link href="assets/css/pages/login-soft.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<!-- <link rel="shortcut icon" href="assets/app/img/favicon.ico"/> -->
<style type="text/css">
.loginLabel{
    top: 7px;
    color: #838B8B !important;
    position: absolute;
    left: 35px;
    font-size: 14px;
    cursor: text;
}
</style>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="login" >
<!-- BEGIN LOGO -->
<div class="logo">
	<img src="assets/img/logo-small.png" alt=""/>
</div>
<!-- END LOGO -->
<!-- BEGIN LOGIN -->
<div class="content">
	<input type="hidden" id="rootPath" value="<%=request.getContextPath()%>">
	<!-- BEGIN LOGIN FORM -->
	<form class="login-form" id="login-form-id" onsubmit="return false;">
		<h3 class="form-title">用户登录</h3>
		<div class="alert alert-danger display-hide">
			<button class="close" data-close="alert"></button>
			<span>
				 输入您的用户名和密码
			</span>
		</div>
		<div class="form-group">
			<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
			<!-- <label class="control-label visible-ie8 visible-ie9">用户名</label> -->
			<div class="input-icon">
				<i class="fa fa-user"></i>
				<input onkeypress="if(event.keyCode == 13) geyKey();" type="text" id="username_temp" class="form-control placeholder-no-fix focus"/>
				<input name="userId" id="username_na" size="25" value="" class="form-control placeholder-no-fix" type="hidden" autocomplete="off"  required/>
			    <label class="loginLabel">用户名</label>
			</div>
		</div>
		<div class="form-group">
			<!-- <label class="control-label visible-ie8 visible-ie9">密码</label> -->
			<div class="input-icon">
				<i class="fa fa-lock"></i>
				<input onkeypress="if(event.keyCode == 13) geyKey();" type="password" id="password_temp" class="form-control placeholder-no-fix focus"/>
				<input name="pwd" id="password_na" size="25" value="" class="form-control placeholder-no-fix" type="hidden" autocomplete="off"  required/>
			    <label class="loginLabel">密码</label>
			</div>
		</div>
		<div class="form-actions">
            <p style="color: red" class="redStar" id="errorInfo">${error}</p>
		</div>
		<div class="checkboxDiv">
		    <label class="checkbox">
            <input type="checkbox" name="remember" value="true"/> 记住我 </label>
		</div>
		<div class="form-actions">
			<button id="loginBut_login" type="button" class="btn blue pull-right" onclick="geyKey()">
			登录<i class="m-icon-swapright m-icon-white"></i>
			</button>
		</div>
	</form>
	<!-- END LOGIN FORM -->
</div>
<!-- END LOGIN -->
<!-- BEGIN COPYRIGHT -->
<div class="copyright">
    2016 &copy; 贷后管理系统 By 深圳赫美小额贷款股份有限公司.
</div>
<!-- END COPYRIGHT -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="assets/plugins/respond.min.js"></script>
<script src="assets/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
<!-- <script src="assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script> -->
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="assets/plugins/jquery-validation/dist/jquery.validate.min.js" type="text/javascript"></script>
<script src="assets/plugins/jquery-validation/localization/messages_zh.js" type="text/javascript"></script>
<script src="assets/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
<script type="text/javascript" src="assets/plugins/select2/select2.min.js"></script>

<script src="assets/scripts/CryptoJS/jsencrypt.min.js" ></script>
<script src="assets/scripts/CryptoJS/security.js" ></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="assets/scripts/app.js" type="text/javascript"></script>
<script src="assets/scripts/login-soft.js" type="text/javascript"></script>

<script src="app/lib/security/sha256.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
    $(document).ready(function(){
    	getCookie("userId");
    	//初始化登录框
    	if($("#username_temp").val()!=""){
            $("#username_temp").parent(".input-icon").find(".loginLabel").hide();
        }else{
            $("#username_temp").parent(".input-icon").find(".loginLabel").show();
        }
    	if($("#password_temp").val()!=""){
            $("#password_temp").parent(".input-icon").find(".loginLabel").hide();
        }else{
            $("#password_temp").parent(".input-icon").find(".loginLabel").show();
        }
    });
    //输入框监听事件
    $(".focus").on("input propertychange change",function(){
    	if($(this).val()!=""){
            $(this).parent(".input-icon").find(".loginLabel").hide();
        }else{
            $(this).parent(".input-icon").find(".loginLabel").show();
        }
    //针对IE浏览器按键backspace的时候监听失效的处理
    }).blur(function(){
    	if($(this).val()!=""){
            $(this).parent(".input-icon").find(".loginLabel").hide();
        }else{
            $(this).parent(".input-icon").find(".loginLabel").show();
        }
    });
    //点击label提示转移焦点到input
    $(".loginLabel").click(function(){
    	$(this).parent(".input-icon").find(".focus").focus();
    });
    //获取加密的key
    function geyKey(){
		var userName = $("#username_temp").val();
		var password = $("#password_temp").val();
		var $errorInfo = $("#errorInfo");
		$errorInfo.html("");
		if(userName == "" || password == ""){
			$errorInfo.html("用户名和密码不能为空");
			return;
		}
    	$.ajax({
    		url: "<%=path%>/rest/user/loginKey?date=" + new Date().toTimeString(),
    		type: "post",
            dataType: "json",
            success: function(data){
            	if(data.success){
            		formSubmit(data.data.exponent,data.data.modulus,userName,password);
            	}else{
					$errorInfo.html(data.message);
            	}
            }
    	});
    }

    //将明文的登录名和登录密码加密成密文，并赋值给对应参数的影藏输入框
    function formSubmit(exponent,modulus,userName,password){
    	// 页面里，Javascript对明文进行加密
        //var modulus = $("#hid_modulus").val(), exponent = $("#hid_exponent").val();
        var key = RSAUtils.getKeyPair(exponent, '', modulus);
        var usernameMI = RSAUtils.encryptedString(key, encodeURIComponent(userName));
        var passwordMI = RSAUtils.encryptedString(key, encodeURIComponent(password));
        //讲密文放在对象input里
        $("#username_na").val(usernameMI);
        $("#password_na").val(passwordMI);
        launchTopic();
  	}

    //点击 提交
    function launchTopic(){
    	$.ajax({
    		url: "<%=path%>/rest/user/login",
    		type: "post",
    		dataType: "json",
    		data: $("#login-form-id").serialize(),
    		success: function(data){
    			if(data.success){
                    window.location.href = $("#rootPath").val();
                }else{
                    $("#errorInfo").html(data.message);
                }
    		}
    	});
    }

    //根据cookie名，取得cookie值
    function getCookie(name) {
		var search;
		search = name + "=";
		offset = document.cookie.indexOf(search);
		if (offset != -1) {
			offset += search.length ;
			end = document.cookie.indexOf(";", offset) ;
			if (end == -1) end = document.cookie.length;
			$("#username_temp").val(decodeURIComponent(document.cookie.substring(offset, end)));
		}else{
			$("#username_temp").val("");
		}
    }

</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>