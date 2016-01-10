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
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
    <!-- 复选框 -->
    <s:checkboxlist label="城市" list="{'北京','上海','深圳','合肥','芜湖'}" name="city"></s:checkboxlist>
    <br/>
    ---------------------------------------------------------------<br/>
    <!-- 选择框 -->
    <s:select label="城市" list="{'北京','上海','深圳','合肥','芜湖'}" name="city"></s:select>
   <!-- 表单提交 -->
   <s:form action="" method="post">
   <s:textfield name="uname" label="用户名"></s:textfield>
   <s:password name="password" label="密码"></s:password>
   <s:submit value="登陆"></s:submit>
   </s:form>
   <s:form action="Upload.action" method="post" enctype="multipart/form-data">
   <input type="file" name="some">
   <input type="submit" value="上传">
   </s:form>
  </body>
</html>
