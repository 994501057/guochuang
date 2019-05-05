<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- el表达式 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>部门管理</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/division/findadd">新增部门</a>
<div>
	<table border="1" width="100%">
		<tr>
			<td>部门名字 </td>
			<td>部门狀態 </td>
			<td>操作</td>
		</tr>
		<c:forEach items="${findDivisions}" var="division">
			<tr>
				<td>${division.name}</td>
				<td>${division.status}</td>
				<td>
					<a href="${pageContext.request.contextPath }/division/deletedivision/${division.id}">刪除</a>
					<a href="${pageContext.request.contextPath }/division/findUpdate/${division.id}">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
<div>
	<p style="color:red">${message}</p>
</div>
</body>
</html>