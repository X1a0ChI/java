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
    
    <title>My JSP 'ShowCommodityList.jsp' starting page</title>
    
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
  <table width="700" border"1">
  <tr>
  <td>商品ID</td>
  <td>商品名称</td>
  <td>商品价格</td>
  <td>商品折扣</td>
  <td>优惠价格</td>
  </tr>
  <s:iterator value="#attr.commodityList" var="commodity">
  <tr>
  <td>${commodity.commodityId }</td>
  <td>${commodity.commodityName }</td>
  <td>${commodity.price }</td>
  <td>${commodity.agio * 10 }</td>
  <td>${commodity.price * commodity.agio }</td>
  </tr>
  </s:iterator>
  <tr>
  <td colspan="5" align="center">
  <s:if test="#request.page.hasPrePage">
  <a href="ShowCommodity.action?currentPage=1">首页</a>
  <a href="ShowCommodity.action?currentPage=${page.currentPage-1}">上一页</a>
  </s:if>
  <s:else>首页  上一页</s:else>
  <s:if test="#request.page.hasNextPage">
  <a href="ShowCommodity.action?currentPage=${page.currentPage+1 }">下一页</a>
  <a href="ShowCommodity.action?currentPage=%{page.totalPage}">尾页</a>
  </s:if>
  <s:else>下一页  尾页</s:else>
  当前为第<s:property value="#request.page.currentPage"/>页
  共<s:property value="#request.page.totalPage"/>页
  </td>
  </tr>
  </table>
  </body>
</html>
