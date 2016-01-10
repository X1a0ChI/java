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
    
    <title>My JSP 'TestDoubleselect.jsp' starting page</title>
    
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
  <s:form name="cityForm">
  <s:set name="citys" value="#{'湖南省':{'长沙市','湘潭市','株洲市'},'湖北省':{'武汉市'.'黄石市','襄樊市'},'广东省':{'广州市','深圳市','东莞市'}}">
  </s:set>
  <s:doubleselect label="选择你所在的城市" value="province" doubleList="#citys[top]" list="#citys.keySet()" doubleName="city"></s:doubleselect>
  								
  </s:form>
  
  </body>
</html>
