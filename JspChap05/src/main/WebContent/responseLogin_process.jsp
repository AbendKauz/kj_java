<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("java") && pw.equals("1234")){
			response.sendRedirect("responseLogin_success.jsp");
		}else{
			response.sendRedirect("responseLogin_failed.jsp");
		}
	%>
</body>
</html>