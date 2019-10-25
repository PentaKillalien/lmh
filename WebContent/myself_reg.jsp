<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
		<link href="css/index.css" rel="stylesheet" type="text/css"/>
		<meta charset="utf-8" />
		<title></title>
	</head>
	
<body>
<div style="width:1333px">
<div id="header">

</div>

<div id="nav">
<ul>
		<li><a href="index.jsp">爱情纪念馆介绍</a></li>
		<li><a href="otherself.jsp">一些别人的故事</a></li>
		<li><a href="myself.jsp">写下自己的故事</a></li>
		<li><a href="survey.jsp">做个问卷调查吧</a></li>
		<li><a href="advice.jsp">留下你的建议</a></li>
	</ul>
</div>

<div id="section">
<h1>新用户注册</h1>

<div id="registerlabel">
<form action="userregister" method="post">
<table>
<tr><td>用户名：</td><td><input type="text" name="username"></td></tr>
<tr><td>密码：</td><td><input type="password" name="password1"></td></tr>
<tr><td>重复密码：</td><td><input type="password" name="password2"></td></tr>
<tr><td>email：</td><td><input type="text" name="email"></td></tr>
<tr><td><input type="submit" value="提交"></td><td><input type="reset" value="重置"></td></tr>
</table>
</form>
</div>
<div id="registerstatus">
<c:if test="${regstatus==3 }">
<font color="red">注册成功</font><a href="myself.jsp">点击跳转</a><br/>
</c:if>
<c:if test="${regstatus==4 }">
<font color="red">用户名或密码字符长度越界</font><br/>
</c:if>
<c:if test="${regstatus==5 }">
<font color="red">两次密码不一致</font><br/>
</c:if>
<c:if test="${regstatus==6 }">
<font color="red">Email格式错误</font><br/>
</c:if>
<c:if test="${regstatus==7 }">
<font color="red">输入不能为空</font><br/>
</c:if>
<c:if test="${regstatus==8 }">
<font color="red">用户名已存在</font><br/>
</c:if>
</div>

</div>

<div id="footer">
Copyright 2019 swzlsys.cn 网站备案:鄂ICP备19021790号
</div>
</div>
</body>
</html>