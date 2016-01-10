<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyLikeInput.jsp' starting page</title>
    
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
  <form action="MyLike.action" method="post">
  请输入你的个人爱好:
  <input type="checkbox" name="mylike" value="篮球">篮球
  <input type="checkbox" name="mylike" value="足球">足球
  <input type="checkbox" name="mylike" value="乒乓球">乒乓球
  <input type="checkbox" name="mylike" value="台球">台球<br>
  <input type="submit" name="提交"><input type="reset" name="重置">
  </form>
  </body>
</html>
