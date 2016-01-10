<%@ page language="java" import="java.util.*"%>
<%@page contentType="text/html; charset=GB2312" %>
<%@page import="java.util.*" %>
<%@page import="java.lang.*" %>
<%@page import="javax.naming.*" %>
<%@page import="com.x1a0ch1.entity.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'delete.jsp' starting page</title>
  </head>
  
  <body>
  <%
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
		try{
		idStr=request.getParameter("id");
		id= Integer.parseInt(idStr);
 		Accountlist account=acl.findById(id);	
		acl.delete(account);
 		request.getRequestDispatcher("AccountManager.jsp").forward(request, response);
		}catch(Exception e){
		out.println("没有对象");
		}

 		
  
   %>
  </body>
</html>
