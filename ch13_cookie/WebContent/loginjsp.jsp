<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- ��Ű�� �ִٸ�, �α��� ó���� ���ش�. -->
	<%
		Cookie[] cookies = request.getCookies();
		System.out.println("cookies" + cookies); // log�� ��Ű�� ��ȸ

		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("memberID")) {
					response.sendRedirect("loginOKjsp.jsp");
				}
			}
		}
	%>

	<form action="loginConfirm" method="post">
		ID : <input type="text" name="mID"><br> PW : <input
			type="password" name="mPW"><br> <input type="submit"
			value="login">

	</form>

</body>
</html>