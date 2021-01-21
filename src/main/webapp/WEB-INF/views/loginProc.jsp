<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

<c:if test="${check == 2 }">
	<script>
		location.href="/mainpage.do";
	</script>
</c:if>
<c:if test="${check == 1 }">
	<script>
		location.href="/mainpage.do";
	</script>
</c:if>
<c:if test="${check == 0 }">
	<script>
		alert('아이디나 비밀번호를 잘못입력하셨습니다. 확인 후 다시 입력해주세요.')
		location.href="/home.do";
	</script>
</c:if>
<c:if test="${check == 100 }">
	<script>
		location.href="http://topinfra-m.com/SolarMonitor/";
	</script>
</c:if>
</body>
</html>