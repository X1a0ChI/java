<%@ page language="java" import="java.util.*"%>
<%@page contentType="text/html; charset=GB2312" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>��½ҳ��</title>
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
  <h1><strong>EJB��ҵ</strong></h1>
  <p>�û���½����</p>
  <%--action��д������jsp����ҳ��--%>
	<form action="chuli.jsp" method="post">
  <table>
  <tr>
  <td>�û���</td><td><input type="text" name="account"/></td>
  </tr>
  <tr>
  <td>����</td><td><input type="password" name="password"/></td></tr>
  <tr>
				<td>��֤��</td>
				<td>
						<input type="text" name="code">

						<img border=0 src="code.jsp">
					</td>
			</tr>

  </table>
  <table>
    <tr>
  <td><input type="reset" value="����"/></td>
  <td >
    <input name="submit" type="submit" value="��½"/>
 	</td>
	<td><input type="button" value="ע��" onclick="window.location.href='newAccount1.jsp';"/></td></tr>
	</table>
  </form>
</div>
  </body>
</html>
