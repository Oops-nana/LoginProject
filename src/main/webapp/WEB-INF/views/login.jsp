<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/first/login.do">
		<table>
		<tbody>
			<tr>
				<td> 아이디 </td> <td> <input type="text" name = "user_id" /></td>
			</tr>
			<tr>
				<td> 비밀번호 </td> <td> <input type="password" name = "user_password" /></td>
			</tr>
		</tbody>
		</table>
		<input type = "submit" value = "로그인" />
	</form>
</body>
</html>