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
    
    <title>My JSP 'RegisterInput.jsp' starting page</title>
    
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
  <form action="Register.action" method="post">
  <table>
 
<tr><td><s:textfield name="username" label="用户名"></s:textfield><tr><td>

<tr><td><s:password name="password" label="密码"></s:password><tr><td>

<tr><td><s:password name="repassword" label="确认密码"></s:password><tr><td>

<tr><td><s:textfield name="name" label="姓名"></s:textfield><tr><td>

<tr><td><s:textfield name="age" label="年龄"></s:textfield><tr><td>

<tr><td><s:textfield name="birth" label="出生日期"></s:textfield><tr><td>

<tr><td><s:textfield name="email" label="邮箱地址"></s:textfield><tr><td>
<tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重置"></td></tr>
  </table>
  </form>
  </body>
</html>
