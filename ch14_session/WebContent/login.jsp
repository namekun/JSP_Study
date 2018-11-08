<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<!-- 세션의 유무 확인 -->

<%
	if(session.getAttribute("memberID") != null)
		response.sendRedirect("loginOK.jsp");
%>

<form action="loginCon" method = "post">
	ID : <input type="text" name = "mID"><br>
	PW : <input type = "password" name ="mPW"><br>
	<input type = "submit" value = "login">
</form>
</body>
</html>