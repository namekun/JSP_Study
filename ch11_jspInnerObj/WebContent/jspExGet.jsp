<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%! 
		String connectedIP;
		String connectedUser;
	%>
	
	<!-- application ��ü -->
	<%
		connectedIP = (String) application.getAttribute("connectedIP");
		connectedUser = (String) application.getAttribute("connectedUser");
	%>
	
	connectedIP : <%= connectedIP %><br>
	connectedUser : <%= connectedUser %>

</body>
</html>