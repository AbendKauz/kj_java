<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=getStr() %></h1> <%-- 표현식 --%>
	<h1>1부터 10까지의 합계는 : <%=getSum() %> 입니다.</h1>
	<%!
		private String getStr(){
			str += "테스트입니다.";
			return str;
		}
		private String str = "선언문";
	%>
	<%!
		int sum = 0;
		private int getSum(){
			for(int i = 1; i <= 10; i++){
				sum += i;
			}
			return sum;
		}
	%>
</body>
</html>