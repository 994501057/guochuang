<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/division/adddivision" method="post">
<table border="1" width="100%">
	<tr>
		<td colspan="3">部门添加</td>
	</tr>
	<tr>
		<td>部门名字<input type="text" name="name"/></td>
		<td><input type="submit" value="提交"/></td>
	</tr>
</table>
</form>
</body>
</html>