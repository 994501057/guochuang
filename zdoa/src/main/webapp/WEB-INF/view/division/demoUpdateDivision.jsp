<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改部门名称状态</title>
</head>
<body>
<c:forEach items="${findDivisions}" var="division">
	<form action="${pageContext.request.contextPath }/division/updatedivision/${division.id}" method="get">
	<table border="1" width="100%">
		<tr>
			<td>修改表單</td>
		</tr>
		<tr>
			<td>部门名称:<input type="text" name="name" placeholder="${division.name}"></td>
		</tr>
		<tr>
			<td>部门状态:<select name="status">
							<option value ="启用">启用</option>
							<option value ="禁用">禁用</option>
						</select>
		</tr>
		<tr>
			<td><input type="submit" value="修改"><a href="${pageContext.request.contextPath }/division/finddivisions">取消</a></td>
		</tr>
		
	</table>
	</form>
</c:forEach>
</body>
</html>