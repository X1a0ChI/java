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
    
    <title>
    <s:text name="page.title"/>
    </title>
    <script language="javascript">
    function selectsubmit(){
    document.form1.submit();
    }
    </script>
    
    
    
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
    <form action="Select.action" method="post" name="form1">
    <select name="languageSelect" onchange="selectsubmit();">
    
    <option value="choose">
    <s:text name="form.choose"></s:text>
    </option>
    
    <option value="en_US">
    <s:if test="#parameters.languageSelect[0]=='en_US'">
    selected="selected"
    </s:if>
    <s:text name="form.option1"></s:text>
    </option>
    
    <option value="zh_CN">
    <s:if test="#parameters.languageSelect[0]=='zh_CN'">
    selected="selected"
    </s:if>
    <s:text name="form.option2"></s:text>
    </option>
    
    <option value="ch_TW">
    <s:if test="#parameters.languageSelect[0]=='zh_TW'">
    selected="selected"
    </s:if>
    <s:text name="form.option3"></s:text>
    </option>
    </select>
    </form>
    <s:text name="page.message"></s:text>
  </body>
</html>
