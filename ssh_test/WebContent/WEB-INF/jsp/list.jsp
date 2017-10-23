<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工列表页面</title>
<style>
th,td{
	border:1px solid #000;
	}
table:hover{
	background-color:#9FF;
	}
</style>
</head>
<body>
<table style="border:1px solid #000;margin:0 auto;width:500px;margin-top:150px;border-collapse:collapse;text-align:center">
<caption><span style="font-weight:600;font-size:18px;">员工列表</span></caption>
<tr style="background-color:#9C6"><th>编号</th><th>姓名</th><th>性别</th><th>年龄</th></tr>
<c:forEach var="emp" items="${emps}">
<tr><td>${emp.id}</td><td>${emp.name}</td><td>${emp.sex}</td><td>${emp.age}</td></tr>
</c:forEach>
</table>
</body>
</html>