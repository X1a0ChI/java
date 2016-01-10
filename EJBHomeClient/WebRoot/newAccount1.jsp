<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@page contentType="text/html; charset=GB2312" %>
<%@ page import="java.util.List"%>
<%@page import="java.util.*" %>
<%@page import="javax.naming.*" %>
<%@page import="com.x1a0ch1.entity.*" %>
<%@page import="java.sql.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'updateAccount.jsp' starting page</title>
  </head>
  
  <body>
    <%
    Object  msg = request.getAttribute("message");
    if(msg!=null ){
    	out.print("<br>");
    	out.print(msg);
    	out.print("<br>");
    	out.print("<br>");
    	
    }
	String account=null;
	String password=null;
	String name=null;
	String cardNum=null;
	String cardType="学生证";
	String address=null;
	String zip="000000";
	Integer cardCash=0;
	
%>
	<form action="create1.jsp" method="post">
		
		<table>

       		<tr>
				<td>账号类型:</td>
				<td><input type="radio" name="accountType" value="客户"/>客户</td>
				
			</tr>
	   
			<tr>
				<td>账号:</td>
				<td><input type="text" name="account" value="<%= account %>" /></td>
			</tr>


			<tr>
				<td>密码:</td>
				<td><input type="text" name="password"
				value="<%= password  %>" /></td>
			</tr>
			
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="name" value="<%= name  %>" /></td>
			</tr>
			
			<tr>
				<td>地址:</td>
				<td><input type="text" name="address" value="<%= address  %>" /></td>
			</tr>
			
			<tr>
				<td>邮编:</td>
				<td><input type="text" name="zip" value="<%= zip  %>"  /></td>
			</tr>
			
			<tr>
				<td>卡的类型:</td>
				<td><input type="radio" name="cardType" value="学生证" />学生证
<input type="radio" name="cardType" value="身份证" />身份证</td>
			</tr>
			
			<tr>
				<td>卡号:</td>
				<td><input type="text" name="cardNum" value="<%= cardNum  %>" /></td>
			</tr>
	 <%
	 
	  %>

			<tr>
				<td colspan="2"><input type="submit" value="注册"/></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>