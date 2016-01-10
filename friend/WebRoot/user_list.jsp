<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_list_.jsp' starting page</title>
    
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
   <h1>欢迎!</h1>
   <table>
   <td>ID</td><td>用户名</td><td>性别</td><td>年龄</td><td>
   </td>
   <c:forEach var="user" items="${users }" varStatus="status">
   <tr>
   <td>${user.id}</td>
   <td>${user.username}</td>
   <td><c:if test="${user.gender=='m' }">男</c:if>
   <c:if test="${user.gender=='f' }">女</c:if>
   </td>
   <td>${user.age }</td>
   <td><a href="userDetail.do?id=${user.id}">详细</a></td>
    </tr>
   </c:forEach>
   </table> 
    <input type="button" class="button" value="退出系统" onclick="location='logout.do'"/>
    
    
  </body>
</html>
