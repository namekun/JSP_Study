<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<!-- 쿠키가 있다면, 로그인 처리를 해준다. -->
	<%
		Cookie[] cookies = request.getCookies();
		System.out.println("cookies" + cookies); // log로 쿠키를 조회

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