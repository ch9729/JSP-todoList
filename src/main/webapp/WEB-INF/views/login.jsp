<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<form action="/login.do" method="POST">		<!-- path를 /로 설정해놔서 url앞 내용은 작성할 필요는 없음 -->
		Name : <input type="text" name="name"/></br>
		Password : <input type="password" name="password"/>
		<input type="submit" />
	</form>
</body>
</html>