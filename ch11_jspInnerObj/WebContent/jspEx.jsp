<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page errorPage = "errorPage.jsp" %>
<!DOCTYPE>
<html>
<head>
<meta charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!String adminId;
	String adminPw;
	
	String imgDir;
	String testServerIP;
	
	String str;
	%>

	<%
		adminId = config.getInitParameter("adminId");
		adminPw = config.getInitParameter("adminPw");
	%>
	
	<p>adminId : <%= adminId %></p>
	<p>adminPw : <%= adminPw %></p>
	
	<%
	imgDir = application.getInitParameter("imgDir");
	testServerIP = application.getInitParameter("testServer");
	%>
	
	<p>imgDir : <%= imgDir %></p>
	<p>testServerIP : <%= testServerIP %></p>
	
	<%
		application.setAttribute("connectedIP", "165.62.58.23");
		application.setAttribute("connectedUser", "hong");
	%>
	<!-- out객체 -->
	<%
		out.print("<h1>Hello JAVA World!!</h1>");
		out.print("<h2>Hello JSP World!!</h2>");
		out.print("<h3>Hello Servlet World!!</h3>");
	%>
	
	<!-- exception 객체 -->
	<%
		out.print(str.toString()); // 초기화 선언하지 않고 str을 사용했기에, NullPointException이 발생한다.
	%>

</body>
</html>