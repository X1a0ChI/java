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
	String cardType="ѧ��֤";
	String address=null;
	String zip="000000";
	Integer cardCash=0;
	
%>
	<form action="create.jsp" method="post">
		
		<table>

       		<tr>
				<td>�˺�����:</td>
				<td><input type="radio" name="accountType" value="�ͻ�"/>�ͻ�</td>
				
			</tr>
	   
			<tr>
				<td>�˺�:</td>
				<td><input type="text" name="account" value="<%= account %>" /></td>
			</tr>


			<tr>
				<td>����:</td>
				<td><input type="text" name="password"
				value="<%= password  %>" /></td>
			</tr>
			
			<tr>
				<td>����:</td>
				<td><input type="text" name="name" value="<%= name  %>" /></td>
			</tr>
			
			<tr>
				<td>��ַ:</td>
				<td><input type="text" name="address" value="<%= address  %>" /></td>
			</tr>
			
			<tr>
				<td>�ʱ�:</td>
				<td><input type="text" name="zip" value="<%= zip  %>"  /></td>
			</tr>
			
			<tr>
				<td>��������:</td>
				<td><input type="radio" name="cardType" value="ѧ��֤" />ѧ��֤
<input type="radio" name="cardType" value="���֤" />���֤</td>
			</tr>
			
			<tr>
				<td>����:</td>
				<td><input type="text" name="cardNum" value="<%= cardNum  %>" /></td>
			</tr>
	 <%
	 
	  %>

			<tr>
				<td colspan="2"><input type="submit" value="ע��"/></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>