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
 		List<Accountlist> actlist;
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		actlist=acl.findByAccount(account);
		String sessionCode= (String)request.getSession().getAttribute("rand");
 		String paramCode = request.getParameter("code");
		
 		

  		if(paramCode !=null && paramCode.equals(sessionCode))
  		{
	
  			if (actlist.isEmpty()) 
  			{
  				request.setAttribute("message", "用户名" + account + "不存在，请重新填写！");
  				request.getRequestDispatcher("login.jsp").forward(request, response);
  			}
  			else
  			{
  				Accountlist acc=actlist.get(0);
  				if(account.equals(acc.getAccount()) && password.equals(acc.getPassword()))
 				{
  					if(account.equals("admin")){
  						request.getRequestDispatcher("AccountManager.jsp").forward(request, response);
  					}else{
  					request.setAttribute("user", acc);
  					request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
  					}
  	  			}
 				else
 	  			{
 	    				request.setAttribute("message", "用户名或者密码错误请重新填写！");
  	    				System.out.println("用户名或者密码错误");
  	    				request.getRequestDispatcher("login.jsp").forward(request, response);
  	  			}
  			}
  			}
  			else {
 			
 			request.setAttribute("message", "验证码错误！");
 			request.getRequestDispatcher("login.jsp").forward(request, response);
		
 		}

  
   %>
  </body>
</html>
