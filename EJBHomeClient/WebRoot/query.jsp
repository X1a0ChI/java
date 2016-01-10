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
  		List<Accountlist> actlist;
  		Properties props=new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost");
		props.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		InitialContext ctx=new InitialContext(props);
		acl=(AccountlistFacadeRemote) ctx.lookup("AccountlistFacade/remote");
		String name=request.getParameter("queryname");
		System.out.println(name);
		actlist=acl.findList(name);
		System.out.println(actlist);
		%>
		
</head>
<body>

<h4>登录成功！</h4>
登陆成功，用户名:admin,  权限为：管理员



	<h1 align="center">
		<b>欢迎登陆用户信息管理系统</b>
	</h1>
<table>

			<tr>
			   <td><input type="button" value="添加" onClick="window.location.href='newAccount.jsp';"/></td>
			    <td><input type="button" value="返回管理" onClick="window.location.href='AccountManager.jsp';"/></td>
			</tr>
			<form action="query.jsp" method="post"><tr><input type="text" name="queryname"  value="">
			(支持姓名模糊查询)<input type="submit" name="查询"></form>
			

</table>
	<br><br>
	
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>id</th>
			<th>用户类型</th>
			<th>用户名</th>
			<th>密码</th>
			<th>姓名</th>
			<th>地址</th>
			<th>邮编</th>
			<th>卡的类型</th>
			<th>卡号</th>
			<th>卡的余额</th>
			<th>最后一次操作时间</th>

		</tr>
		
		<%		
		for(Accountlist user:actlist){
		 %>
				<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getAccountType() %></td>
			<td><%=user.getAccount() %></td>
			<td><%=user.getPassword() %></td>
			<td><%=user.getName() %></td>
			<td><%=user.getAddress() %></td>
			<td><%=user.getZip() %></td>
			<td><%=user.getCardType() %></td>
			<td><%=user.getCardNum() %></td>
			<td><%=user.getCardCash() %></td>
			<td><%=user.getExpDate() %></td>
			<td>
			    <a href="updateAccount.jsp?id=<%=user.getId()%>" class="update">更新</a> 
			    </td>
			    <td>
		
			    <a href="delete.jsp?id=<%=user.getId() %>" class="delete">删除</a>
			</td>
		</tr>
		<%
		}
		%>
		</table>
  </body>
</html>