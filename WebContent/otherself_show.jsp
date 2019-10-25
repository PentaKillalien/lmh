<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript">
	
	</script>
		<link href="css/index.css" rel="stylesheet" type="text/css"/>
		<link href="css/otherself_show.css" rel="stylesheet" type="text/css"/>
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
<div id="content">

<h1 align="center">${content.title }<br></h1>
<h5 align="center">${content.username }<br></h5>

<div id="article">${content.content }<br></div>

<h6>${content.issuedate }&nbsp;&nbsp;${content.issuetime }</h6>

</div>
</div>
<div id="footer">
Copyright 2019 swzlsys.cn 网站备案:鄂ICP备19021790号
</div>
</div>
</body>
</html>
