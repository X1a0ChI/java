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

<h4>��¼�ɹ���</h4>
��½�ɹ����û���:admin,  Ȩ��Ϊ������Ա



	<h1 align="center">
		<b>��ӭ��½�û���Ϣ����ϵͳ</b>
	</h1>
<table>

			<tr>
			   <td><input type="button" value="���" onClick="window.location.href='newAccount.jsp';"/></td>
			    <td><input type="button" value="���ع���" onClick="window.location.href='AccountManager.jsp';"/></td>
			</tr>
			<form action="query.jsp" method="post"><tr><input type="text" name="queryname"  value="">
			(֧������ģ����ѯ)<input type="submit" name="��ѯ"></form>
			

</table>
	<br><br>
	
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>id</th>
			<th>�û�����</th>
			<th>�û���</th>
			<th>����</th>
			<th>����</th>
			<th>��ַ</th>
			<th>�ʱ�</th>
			<th>��������</th>
			<th>����</th>
			<th>�������</th>
			<th>���һ�β���ʱ��</th>

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
			    <a href="updateAccount.jsp?id=<%=user.getId()%>" class="update">����</a> 
			    </td>
			    <td>
		
			    <a href="delete.jsp?id=<%=user.getId() %>" class="delete">ɾ��</a>
			</td>
		</tr>
		<%
		}
		%>
		</table>
  </body>
</html>