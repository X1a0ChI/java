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
   		 request.setCharacterEncoding("gb2312");
  		AccountlistFacadeRemote acl;
  		String idStr;
  		int id;
  		Properties props=new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost");
		props.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		InitialContext ctx=new InitialContext(props);
		acl=(AccountlistFacadeRemote) ctx.lookup("AccountlistFacade/remote");
		idStr=request.getParameter("id");
		id= Integer.parseInt(idStr);
 		Accountlist account=acl.findById(id);	
	    request.setAttribute("account", account.getAccount());
	
%>
	<form action="update1.jsp" method="post">
		
		<table>

       		<tr>
				<td>账号类型:</td>
				<td>客户</td>
				
			</tr>
	   
			<tr>
				<td>账号:</td>
				<td><%=account.getAccount() %><input type="hidden" name="account" value="<%=account.getAccount() %>"></td>
			</tr>


			<tr>
				<td>密码:</td>
				<td><input type="text" name="password"
				value="<%= account.getPassword()  %>" /></td>
			</tr>
			
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="name" value="<%= account.getName()  %>" /></td>
			</tr>
			
			<tr>
				<td>地址:</td>
				<td><input type="text" name="address" value="<%= account.getAddress()  %>" /></td>
			</tr>
			
			<tr>
				<td>邮编:</td>
				<td><input type="text" name="zip" value="<%= account.getZip()  %>"  /></td>
			</tr>
			
			<tr>
				<td>卡的类型:</td>
				<td><input type="radio" name="cardType" value="学生证" />学生证
<input type="radio" name="cardType" value="身份证" />身份证</td>
			</tr>
			
			<tr>
				<td>卡号:</td>
				<td><input type="text" name="cardNum" value="<%= account.getCardNum()  %>" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="更新"/></td>
			</tr>
		</table>
	</form>
	
  </body>
</html>


