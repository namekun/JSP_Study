<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 서블릿으로 하는 방법 
		<form action="mSignup" method = "post">
		이름 : <input type="text" name = "m_name"><br>
		별명 : <input type = "text" name = "m_nickname"><br>
		<input type="submit" value = sign_up>
	</form> -->
	
	<!-- jsp로 하는 방법 -->
	<form action="mSignUp.jsp" method = "post">
		이름 : <input type="text" name = "m_name"><br>
		별명 : <input type = "text" name = "m_nickname"><br>
		<input type="submit" value = sign_up>
	</form>
</body>
</html>