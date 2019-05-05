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
	<form action="${pageContext.request.contextPath }/dictionary/updatedictionary/${dictionary.id}" method="post">
	<table border="1" width="100%">
		<tr>
			<td>修改表單</td>
		</tr>
		<tr>
			<td>词条类型:<input type="text" name="code" placeholder="${dictionary.code}"></td>
		</tr>
		<tr>
			<td>词条名称:<input type="text" name="name" placeholder="${dictionary.name}"></td>
		</tr>
		<tr>
			<td>词条简介:<input type="text" name="introduction" placeholder="${dictionary.introduction}"></td>
		</tr>
		<tr>
			<td><input type="submit" value="修改"><a href="${pageContext.request.contextPath }/dictionary/selectAllDictionary">取消</a></td>
		</tr>
	</table>
	</form>
</body>
</html>