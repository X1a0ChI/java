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
		var flag = confirm("确定删除"+ content+"的信息吗？");
		return flag;
	});
});


</script>
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
 		Accountlist user=(Accountlist)request.getAttribute("user");
%>

<h4>登录成功！</h4>
<%
out.println("登陆成功，用户名:"+user.getAccount()+",权限为："+user.getAccountType());
%>


	<h1 align="center">
		<b>出纳结算系统</b>
	</h1>
<table>

			<tr>
			    <td><a href="updateAccount.jsp?id=<%=user.getId()%>" class="update">更新个人资料</a></td> 
			    <td><a href="login.jsp" class="login">注销返回</a></td>
			</tr>
</table>
	<br><br>
	<b>个人用户信息</b>
	<hr>
	<br><br>

	
		<table  align="center">
	<th><table  border="1" align="left">
	<tr><th  align="left">用户类型:</th><th  align="left"><%=user.getAccountType() %></th></tr>
	<tr><th align="left">用户名:</th><th align="left"><%=user.getAccount() %></th></tr>
	<tr><th align="left">姓名:</th><th align="left"><%=user.getName() %></th></tr>
	<tr><th align="left">地址:</th><th align="left"><%=user.getAddress() %></th></tr><tr>
	<th align="left">邮编:</th><th align="left"><%=user.getZip() %></th></tr>
	<tr><th align="left">最后一次操作时间:</th><th align="left"><%=user.getExpDate() %></th></tr>
	</table></th>
	</table>
	
		<table  align="center">
	<th><table  border="1" align="left">
	<tr><th  align="left">卡的类型</th><th  align="left">卡号</th><th  align="left">余额</th></tr>
	<tr><th align="left"><%=user.getCardType()%></th><th align="left"><%= user.getCardNum() %></th><th align="left"><%=user.getCardCash()%></th></tr>

	<tr></table></th>
	<table align="center" border="1">
	<tr><th  align="left">存款</th><th  align="left">取款</th></tr>
	<tr>
	
	<form action="deposit.jsp" method="post">
	<input type="hidden" name="id" value="<%=user.getId()%>"/>
	<td><input type="text" name="deposit" value=" "/> 
	<input type="submit" name="提交"/></td>	
	</form>
	<form action="withdrawal.jsp" method="post">
	<input type="hidden" name="id" value="<%=user.getId()%>"/>
	<td><input type="text" name="withdrawal" value=" "/>
	<input type="submit" name="提交"/></td>
	</form>
	</tr>
	</table>
	</table>
	<div align="center">
	<%
		Object msg = request.getAttribute("message");
		if (msg != null) {
			out.print("<br>");
			out.print(msg);
			out.print("<br>");
			out.print("<br>");

		}
		%></div>

</body>
</html>
