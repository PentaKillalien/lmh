<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
	<script type="text/javascript">
		//如果用户登陆，隐藏登陆框，显示功能按钮框
		$(function(){
			if("${status }"==1){
				$("#login").hide();
				$("#articlelist").show();
				$("#myworklist").hide();
				$("#startworkplace").hide();
			}
		})
		//如果用户没有登陆，不显示功能按钮
		function load(){
			if("${status }"!=1){
				$("#articlelist").hide();
			}
		}
		//显示列表，隐藏其他部分
		$(function(){
			$("#myworkbutton").click(function(){
				$("#myworklist").show();
				$("#startwork").hide();
				$.post("userstorylist",{username:"${user.username }"},function(data){
					var list = JSON.stringify(data);
					var listObj = JSON.parse(list);
					var listdata = $("#myworklist");
					listdata.empty().append("");
					for(var i=0;i<listObj.length;i++){
						listdata.append("<p>"+"标题："+listObj[i].title+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"创作时间："+listObj[i].issuedate+"&nbsp;&nbsp"+listObj[i].issuetime+"</p><p>"+"内容："+"</p><p>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+listObj[i].content+"</p>");
					}
					//alert(list);
					//$("#myworklist").html(listdata);
				});
			});
			$("#startworkbutton").click(function(){
				$("#startworkplace").show();
				$("#mywork").hide();
			});
		})
		
	</script>

		<link href="css/index.css" rel="stylesheet" type="text/css"/>
		<meta charset="utf-8" />
		<title></title>
	</head>
	
<body onload="load()">
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
<h1>写下自己的故事</h1>
<div id="login">
<h1>用户登陆</h1>
<form action="userlogin" method="post">
<table>
<tr><td>用户名：</td><td><input type="text" name="username"></td></tr>
<tr><td>密码：</td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" value="登陆"></td><td><a href="myself_reg.jsp">注册</a></td></tr>
</table>
</form>
</div>
<div id="loginstatus">
<c:if test="${status==1 }">
用户<font color="red">${user.username }</font>已经登陆<br/>
</c:if>
<c:if test="${status==2 }">
<font color="red">用户名或密码错误</font><br/>
</c:if>
</div>

<!-- 文章显示div -->
<div id="articlelist">
<div id="mywork">
<input type="button" value="我的创作" id="myworkbutton"><br>
</div>
<div id="myworklist" style="width:700px;height:400px;overflow:auto">

</div>
<div id="startwork">
<input type="button" value="开始创作" id="startworkbutton"><br>

</div>
<div id="startworkplace">
<a href="myself_work.jsp">点击进入</a>
</div>

</div>

</div>

<div id="footer">
Copyright 2019 swzlsys.cn 网站备案:鄂ICP备19021790号
</div>
</div>
</body>
</html>