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
    
    <title>My JSP 'IteratorTest.jsp' starting page</title>
    
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
    <!-- 遍历map集合 -->
    <s:iterator value="#{'id':1,'name':'张三','age':20,'salary':5000 }" var="person">
    <s:property value="#person"/><br/>
    </s:iterator>
    -------------------------------------------------<br/>
    <s:iterator value="{'张三','李四','王五','小六','肖大爷'}" id="name" status="st">
    下标为:<s:property value="#st.index"/>,当前元素为:<s:property value="name"/><br/>
    </s:iterator>
  </body>
</html>
