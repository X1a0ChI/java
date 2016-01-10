<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@page contentType="text/html; charset=GB2312" %>
<%@page import="java.util.*" %>
<%@page import="javax.naming.*" %>
<%@page import="com.x1a0ch1.entity.*" %>
<%@page import="java.sql.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'create.jsp' starting page</title>

  </head>
  
  <body>

  <%
  		request.setCharacterEncoding("gb2312");
  		AccountlistFacadeRemote acl;
  		Properties props=new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost");
		props.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		InitialContext ctx=new InitialContext(props);
		acl=(AccountlistFacadeRemote) ctx.lookup("AccountlistFacade/remote");
		
		String accountType=request.getParameter("accountType");
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		String name= request.getParameter("name");
		String address= request.getParameter("address"); 
		String zip= request.getParameter("zip");
		String cardType= request.getParameter("cardType");
		String cardNum= request.getParameter("cardNum");
		

		List<Accountlist> actlist=acl.findByAccount(account);
		
		if (actlist.isEmpty()) {
			Accountlist acc =new Accountlist(accountType,account,password,name,cardType,cardNum,address,zip);
			acl.save(acc);
			request.setAttribute("message", "用户创建成功");
			request.getRequestDispatcher("AccountManager.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "用户名" + account + "已经被占用，请重新选择！");
			request.getRequestDispatcher("newAccount.jsp").forward(request, response);
			return;
		}
   %>
  </body>
</html>
