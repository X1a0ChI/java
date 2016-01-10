<%@ page language="java" import="java.util.*"%>
<%@page contentType="text/html; charset=GB2312" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登陆页面</title>
  </head>
  
  <body>
  	<%
		Object msg = request.getAttribute("message");
		if (msg != null) {
			out.print("<br>");
			out.print(msg);
			out.print("<br>");
			out.print("<br>");

		}
		
	%>
    <div align="center">
  <p><img src="1.jpg" width="264" height="220"></p>
  <h1><strong>EJB作业</strong></h1>
  <p>用户登陆界面</p>
  <%--action填写后续的jsp处理页面--%>
	<form action="chuli.jsp" method="post">
  <table>
  <tr>
  <td>用户名</td><td><input type="text" name="account"/></td>
  </tr>
  <tr>
  <td>密码</td><td><input type="password" name="password"/></td></tr>
  <tr>
				<td>验证码</td>
				<td>
						<input type="text" name="code">

						<img border=0 src="code.jsp">
					</td>
			</tr>

  </table>
  <table>
    <tr>
  <td><input type="reset" value="重置"/></td>
  <td >
    <input name="submit" type="submit" value="登陆"/>
 	</td>
	<td><input type="button" value="注册" onclick="window.location.href='newAccount1.jsp';"/></td></tr>
	</table>
  </form>
</div>
  </body>
</html>
