<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	session = request.getSession();
	out.print("memberID : " + session.getAttribute("memberID") + "<br>");
		
	%>
	
	<form action = "logoutCon" method = "post">
	
		<input type = "submit" value= "logout">
	</form>

</body>
</html>