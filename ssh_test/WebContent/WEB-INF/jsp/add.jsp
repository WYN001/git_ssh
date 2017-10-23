<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工添加页面</title>
</head>
<body>
<div style="height:300px;width:280px;margin:0px auto;border:1px #000 solid;margin-top:200px">
<div style="background-color:gray;font-size:20px;margin:0px;height:50px;text-align:center;line-height:50px;">添加员工信息</div>
<form action="addAction" method="post" style="margin-top:40px;">
&nbsp;&nbsp;&nbsp;&nbsp;姓名：<input  type="text" name="name"/><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;年龄：<input type="text" name="age"/><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;性别：<input type="radio" name="sex" checked>男<input type="radio" name="sex"/>女<br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="添加" value="添加员工"/>
</form>
</div>
</body>
</html>
