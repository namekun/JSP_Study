<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setStatus(200);
		String msg = exception.getMessage(); // 어떤 에러가 났는지 가져온다.
	%>
	
	<h1> error msg : <%= msg %></h1>


</body>
</html>