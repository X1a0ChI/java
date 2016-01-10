<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
    <form action="login.do" method="post">
  	<table width="249" height="113" border="0" align="center" cellpadding="0" cellspacing="0" style="width: 347px; height: 159px">
    <tr>
      <td > 用户名:</td>
      <td><input type="text" name="username" /></td>
    </tr>

    <tr>
      <td>密码:</td>
      <td><input type="password" name="pwd" style="width: 157px; "/></td>
    </tr>
   	<tr><td> <input type="submit" value="确定" /></td>
  	 <td style="width: 205px; "><a href="regist.jsp">还没有账户,请点击这儿注册</a></td></tr>
  </table>
  </form>
  </body>
</html>
