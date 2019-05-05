<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- el表达式 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>字典管理</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/dictionary/adddictionary" method="post">
<table border="1" width="100%">
	<tr>
		<td colspan="4">添加字典</td>
	</tr>
	<tr>
		<td>类型：<input type="text" name="code"/></td>
		<td>字段名<input type="text" name="name"/></td>
		<td>字段简介<input type="text" name="introduction"/></td>
		<td><input type="submit" value="提交"/></td>
	</tr>
</table>
</form>
<form action="${pageContext.request.contextPath }/dictionary/selectAllDictionary" method="get">
	关键字<input type="text" name="name"/>
	<input type="submit" value="查询"><br/>
</form>

<div>
	<form id="deletes" action="${pageContext.request.contextPath }/dictionary/deleteDictionarys" method="get">
	<button id="batch_deletion">批量删除</button>
	<table border="1" width="100%">
		<tr>
			<td></td>
			<td>词条类型</td>
			<td>词条名称</td>
			<td>词条简介</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${dictionarylist}" var="dictionary">
			<tr>
				<td><input id="${dictionary.id}" type="checkbox" name="dictionaries" value="${dictionary.id}"/></td>
				<td>${dictionary.code}</td>
				<td>${dictionary.name}</td>
				<td>${dictionary.introduction}</td>
				<td>
					<a href="${pageContext.request.contextPath }/dictionary/deleteDictionaryforid/${dictionary.id}">刪除</a>
					<a href="${pageContext.request.contextPath }/dictionary/selectDictionary/${dictionary.id}">查看</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</form>
</div>
<div>
	<p style="color:red">${message}</p>
</div>
<!-- 批量删除的jquery -->
<script type="text/javascript">
	$(function (){
		$("#batch_deletion").click(function(){
			$("#deletes").submit();
		})
	})
</script>
</body>
</html>