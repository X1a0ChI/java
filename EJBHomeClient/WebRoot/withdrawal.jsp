<%@ page language="java" import="java.util.*"%>
<%@page contentType="text/html; charset=GB2312" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@page import="java.util.*" %>
<%@page import="javax.naming.*" %>
<%@page import="com.x1a0ch1.entity.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'chuli.jsp' starting page</title>
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
 		Accountlist act;
 		int id=0;
 		double bwtd=0;
 		String str=request.getParameter("id");
 		id=Integer.parseInt(str);
 		String wtd=request.getParameter("withdrawal");
 		bwtd=Double.parseDouble(wtd);
 		act=acl.findById(id);
 		double total=act.getCardCash();
 		if(total>bwtd){
 		total=total-bwtd;
		act.setCardCash(total);
		acl.update(act);
		}else{
			
			request.setAttribute("message", "用户名的余额为" + total + "!您的取款额度超过现有的额度");
			
		}
		request.setAttribute("user", act);
		request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
 %>
  </body>
</html>
