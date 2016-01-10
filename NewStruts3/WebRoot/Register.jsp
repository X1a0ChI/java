<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Register.jsp' starting page</title>
    
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
  <form action="register.action" method="post">
  <table>
  <tr><td colspan="2"><s:actionerror/></td></tr>
  <tr><td>用户名: </td>
  <td><input type="text" name="uname"></td></tr>
  <tr><td>密码: </td>
  <td><input type="password" name="upassword"></td></tr>
  <tr><td>确认密码: </td>
  <td><input type="password" name="repassword"></td></tr>
  <tr><td>姓名:</td>
  <td><input type="text" name="name"></td></tr>
  <tr><td>年纪:</td>
  <td><input type="text" name="age"></td></tr>
  <tr><td>出生日期:</td>
  <td><input type="text" name="birth"></td></tr>
  <tr><td>邮箱地址:</td>
  <td><input type="text" name="email"></td></tr>
  <tr><td><input type="submit" value="提交"></td>
  <td><input type="reset" value="重置"></td></tr>
  </table>
  </form>
  </body>
</html>
