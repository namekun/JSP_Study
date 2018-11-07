<%-- 지시어 --%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html;charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- jsp 파일 가져오는 include --%>
	<%@ include file = "header.jsp" %>
	<!-- 선언 태그 -->
	<%!
	int num = 19;
	String str = "hi jsp";
	ArrayList<String> list = new ArrayList<>();
	
	public void jspMethod() {
		System.out.println("hi jsp");
	}%>
	<%-- 이것은 jsp 주석입니다. --%>
	<!-- 이것은 html 주석입니다. -->

	<!-- 스크립트릿 태그 -->
	<%
		if (num > 0) {
	%>
	<p>num > 0</p>
	<%
		} else {
	%>
	<p>num <= 0</p>
	<%
		}
	%>

	<!-- 표현식 태그 -->
	num is <%=num%>
	
	<%-- jsp 파일 가져오는 include --%>
	<%@ include file = "footer.jsp" %>
</body>
</html>