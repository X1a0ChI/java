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
    
    <title>My JSP 'LxrAddInput.jsp' starting page</title>
    
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
    <form action="LxrAdd.action" method="post">
    <table>
    <tr><s:fielderror><s:param>name</s:param></s:fielderror></tr>
    <tr><td>姓名:</td><td><input type="text" name="name"></td></tr>
    <tr><s:fielderror><s:param>age</s:param></s:fielderror></tr>
    <tr><td>年龄:</td><td><input type="text" name="age"></td></tr>
    <tr><s:fielderror><s:param>phone</s:param></s:fielderror></tr>
    <tr><td>联系电话:</td><td><input type="text" name="phone"></td></tr>
    <tr><s:fielderror><s:param>email</s:param></s:fielderror></tr>
    <tr><td>邮箱地址:</td><td><input type="text" name="email"></td></tr>
    <tr><s:fielderror><s:param>homePage</s:param></s:fielderror></tr>
    <tr><td>个人主页:</td><td><input type="text" name="homePage"></td></tr>
     <tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重置"></td></tr>
    </table>
    </form>
  </body>
</html>
