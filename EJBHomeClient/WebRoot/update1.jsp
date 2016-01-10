<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@page contentType="text/html; charset=GB2312" %>
<%@ page import="java.util.List"%>
<%@page import="java.util.*" %>
<%@page import="javax.naming.*" %>
<%@page import="com.x1a0ch1.entity.*" %>
<%@page import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'update.jsp' starting page</title>


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
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		String name= request.getParameter("name");
		String address= request.getParameter("address"); 
		String zip= request.getParameter("zip");
		String cardType= request.getParameter("cardType");
		String cardNum= request.getParameter("cardNum");
		List<Accountlist> actlist=acl.findByAccount(account);
		Accountlist act=actlist.get(0);
		act.setName(name);
		act.setPassword(password);
		act.setAddress(address);
		act.setCardType(cardType);
		act.setCardNum(cardNum);
		act.setExpDate(new Timestamp(System.currentTimeMillis()));	
		acl.update(act);
		request.setAttribute("message", "用户更新成功");
		request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);

  
  
  
   %>
  </body>
</html>
