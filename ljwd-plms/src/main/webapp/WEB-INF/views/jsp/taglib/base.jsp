<%@page import="org.apache.commons.lang.time.DateFormatUtils"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String _path = request.getContextPath();
if("/".equals(_path)){
	_path="";
}
String _basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+_path+"/";

String preFix=_basePath.substring(0,_basePath.length()-_path.length());
%>
<c:set var="ctx" value="<%=_path%>"/>
<c:set var="basePath" value="<%=_basePath%>"/>
<c:set var="preFix" value="<%=preFix%>"/>




