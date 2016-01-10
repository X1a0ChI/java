<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TransferInput.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
 <h4>将TRANSFERACTION 返回结果包含到本网页,不忽略参数</h4>
 <s:action name="Transfer" executeResult="true" ignoreContextParams="false" namespace="/"></s:action>
 <h4>将TRANSFERACTION 返回的结果包含到本网页,忽略参数</h4>
 <s:action name="Transfer" executeResult="true" ignoreContextParams="true" namespace="/"></s:action>
 <h4>直接访问Action中的属性值</h4>
 <s:action name="Transfer" executeResult="false" id="myTransfer" namespace="/"></s:action>
 TransferAction中param的属性值为:<s:property value="#myTransfer.param"/>
 
  </body>
</html>
