<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="login" class="test.LoginTest" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 예제</h1>
	아이디 : <b><%=login.getId() %></b><br>
	비밀번호 : <b><%=login.getPw() %></b>
</body>
</html>
