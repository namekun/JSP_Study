# Ch12_servlet데이터공유

1. servlet parameter

   해당 서블릿 내에서만 정보를 공유할 수 있는 방법이다.

   서블릿 내에 init parameter태그를 사용하여 내가 공유하고자 하는 정보를 만들어줘서 사용한다. 이는 `getServletConfig().getInitParameter("변수명");`를 통해서 사용한다.

   이때 데이터는 서블릿이 초기화될때 만들어진다.

2. context parameter

   해당 어플리케이션 내의 모든 서블릿에 데이터를 공유할 수 있는 방법이다.

3. context attribute

   setAttribute와 getAttribute를 이용해서 정보를 저장하고 가져오는 방법이다.

### 코드

*web.xml*

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	id="WebApp_ID" version="3.1">
	<display-name>ch12_servletDataShare</display-name>
	<welcome-file-list>
		<welcome-file>index.html</welcome-file>
		<welcome-file>index.htm</welcome-file>
		<welcome-file>index.jsp</welcome-file>
		<welcome-file>default.html</welcome-file>
		<welcome-file>default.htm</welcome-file>
		<welcome-file>default.jsp</welcome-file>
	</welcome-file-list>

	<context-param>
		<param-name>imgDir</param-name>
		<param-value>/upload/img</param-value>
	</context-param>
	<context-param>
		<param-name>testServerID</param-name>
		<param-value>127.0.0.1</param-value>
	</context-param>


	<servlet>
		<servlet-name>servletEx</servlet-name>
		<servlet-class>com.servlet.servletEx</servlet-class>
		<init-param>
			<param-name>adminId</param-name>
			<param-value>admin</param-value>
		</init-param>
		<init-param>
			<param-name>adminPW</param-name>
			<param-value>1234</param-value>
		</init-param>
	</servlet>
	<servlet-mapping>
		<servlet-name>servletEx</servlet-name>
		<url-pattern>/se</url-pattern>
	</servlet-mapping>


</web-app>
```

*servletEx.jsp*

```java
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servletEx extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPW = getServletConfig().getInitParameter("adminPW");
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId :"+ adminId  +"</p>");
		out.print("<p>adminPw :"+ adminPW  +"</p>");
		
		String imgDir = getServletContext().getInitParameter("imgDir");
		String testServerID = getServletContext().getInitParameter("testServerID");
		
		out.print("<p>imgDir :"+ imgDir  +"</p>");
		out.print("<p>testServerID :"+ testServerID  +"</p>");
		
		getServletContext().setAttribute("connectedIP", "112.124.45.45");
		getServletContext().setAttribute("connectedUser", "Kim");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}	
```

*servletGetEx.java*

```java
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seg")
public class servletGetEx extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String connectedIP = (String) getServletContext().getAttribute("connectedIP");
		String connectedUser = (String) getServletContext().getAttribute("connectedUser");

		PrintWriter out = response.getWriter();
		out.print("<p>connectedIP : " + connectedIP + "</p>");
		out.print("<p>connectedUser : " + connectedUser + "</p>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
```

