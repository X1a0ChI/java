<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@page contentType="text/html; charset=GB2312" %>
<%@ page import="java.util.List"%>
<%@page import="java.util.*" %>
<%@page import="javax.naming.*" %>
<%@page import="com.x1a0ch1.entity.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	
	$(".delete").click(function(){
		var content =$(this).parent().parent().find("td:eq(1)").text();
		var flag = confirm("ȷ��ɾ��"+ content+"����Ϣ��");
		return flag;
	});
});


</script>
</head>
<body>

<h4>��¼�ɹ���</h4>
<%
out.println("��½�ɹ����û���:admin,  Ȩ��Ϊ������Ա");
%>


	<h1 align="center">
		<b>��ӭ��½�û���Ϣ����ϵͳ</b>
	</h1>
<table>

			<tr>
			   <td><input type="button" value="���" onClick="window.location.href='newAccount.jsp';"/></td>
			    <td><input type="button" value="���ص�¼" onClick="window.location.href='login.jsp';"/></td>
			</tr>
			</table>
			<form action="query.jsp" method="post"><tr>
			<input type="text" name="queryname" value=""/>(֧������ģ����ѯ)
			<input type="submit" name="��ѯ"/>
			</form>		


	<br><br>
	
	
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
 		List<Accountlist> actlist=acl.findAll();
		if ( !actlist.isEmpty()) {
%>
	

	<h3 align="center">
		<b>��ѯ�����û���Ϣ</b>
	</h3>
	<hr>
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
			<th>action</th>
			<th>action</th>
		</tr>
		<%
			for(Accountlist user: actlist) {
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

	<%
		}
	%>



</body>
</html>
