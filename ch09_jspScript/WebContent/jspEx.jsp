<%-- ���þ� --%>
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
	<%-- jsp ���� �������� include --%>
	<%@ include file = "header.jsp" %>
	<!-- ���� �±� -->
	<%!
	int num = 19;
	String str = "hi jsp";
	ArrayList<String> list = new ArrayList<>();
	
	public void jspMethod() {
		System.out.println("hi jsp");
	}%>
	<%-- �̰��� jsp �ּ��Դϴ�. --%>
	<!-- �̰��� html �ּ��Դϴ�. -->

	<!-- ��ũ��Ʈ�� �±� -->
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

	<!-- ǥ���� �±� -->
	num is <%=num%>
	
	<%-- jsp ���� �������� include --%>
	<%@ include file = "footer.jsp" %>
</body>
</html>