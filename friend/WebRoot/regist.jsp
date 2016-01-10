<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'regist.jsp' starting page</title>
    
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
    <div align="left">
<form action="newUser.do" method="post">
  <table width="429" height="345" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td> 用户名:</td>
      <td><input type="text" name="username" /></td>
    </tr>
    <tr>
      <td> 真实姓名:</td>
      <td><input type="text" name="name" /></td>
    </tr>
    <tr>
      <td>密码:</td>
      <td><input type="password" name="pwd" /></td>
    </tr>
    <tr>
      <td>年龄:</td>
      <td><input type="text" name="age" /></td>
    </tr>
    <tr>
      <td>性别:</td>
      <td>男<input type="radio" name="gender" value="m"/>女<input type="radio" name="gender" value="f"/></td>
    </tr>
   		 <tr>
      		<td >电话:</td>
     		 <td><input type="text" name="phone" /></td>
    	</tr>
   		 <tr>
     	 <td >对方要求:</td>
     	 <td><textarea rows="5" cols="30" name="ask" style="resize:none;"></textarea></td>
    	</tr>
    
		<tr>
   		<td><input type="submit" value="注册" /></td>
  		<td> <input type="reset" value="重置" /></td>
 		</tr>
  	</table>
  </form>
    
  </body>
</html>

