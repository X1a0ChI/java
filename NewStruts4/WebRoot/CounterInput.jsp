<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'CounterInput.jsp' starting page</title>
    
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
 	<form action="Counter.action" method="post">
 	<tr>第一个操作数:<input type="text" name="num1"></tr>
 	<tr>运算符:<select name="operation">
 	<option value ="add">+</option>
  	<option value ="minus">-</option>
 	 <option value="multiply">*</option>
	  <option value="div">/</option>
	  </select></tr>
	  <tr>第二个操作数:<input type="text" name="num2"></tr>
	  <tr><input type="submit" name="提交"><input type="reset" name="注销"></tr>
 	
 	</form>
  </body>
</html>
