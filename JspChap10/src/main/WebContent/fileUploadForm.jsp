<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUpload Form</title>
<style type="text/css">
	#uploadFormArea{
		margin: auto;
		width: 350px;
		border: 1px solid black;
	}
	.td_title{
		font-size: xx-large;
		text-align: center;
	}
</style>
</head>
<body>
	<section id="uploadFormArea">
		<form action="fileUpload.jsp" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td colspan="2" class="td_title">파일 업로드 폼</td>
				</tr>
				<tr>
					<td>올린사람 : </td>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
					<td>제목 : </td>
					<td><input type="text" name="subject" id="subject"></td>
				</tr>
				<tr>
					<td>파일명1 : </td>
					<td><input type="file" name="fileName1" id="fileName1"></td>
				</tr>
				<tr>
					<td>파일명2 : </td>
					<td><input type="file" name="fileName2" id="fileName2"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="전송"></td>
				</tr>
			</table>
		</form>
	</section>
</body>
</html>