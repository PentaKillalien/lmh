<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
	<script type="text/javascript">
	
	</script>

		<link href="css/index.css" rel="stylesheet" type="text/css"/>
		<link href="css/otherself.css" rel="stylesheet" type="text/css"/>
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
<form action="content" method="post">
<h1>创作空间</h1>
<div id="choice">
<h1>赶快写点东西吧！</h1>
故事类型：<select name="storyType">
<option value="全部"selected>全部</option>
<option value="分手失恋">分手失恋</option>
<option value="修成正果">修成正果</option>
</select>
<div class="info">
            <div>
            	故事发生地点：
                <select id="province" name="province"></select>
                <select id="city" name="city"></select>
                <select id="county" name="county"></select>
                <script class="resources library" src="js/area.js" type="text/javascript"></script>
                
                <script type="text/javascript">_init_area();</script>
            </div>
            <div id="show"></div>
        </div>
        <script type="text/javascript">
        var Gid  = document.getElementById ;
        var showArea = function(){
            Gid('show').innerHTML = "<h3>省" + Gid('province').value + " - 市" +     
            Gid('city').value + " - 县/区" + 
            Gid('county').value + "</h3>"
                            }
        Gid('county').setAttribute('onchange','showArea()');
    </script>
故事发生季节：<select name="storySeason">
<option value="全部" selected>全部</option>
<option value="春">春</option>
<option value="夏">夏</option>
<option value="秋">秋</option>
<option value="冬">冬</option>
</select>
</div>

<div id="work">
文章标题：<input type="text" name="title"/><br>
文章作者:<input type="text" value="${user.username }" readonly name="username" /><br>
<textarea name="content"cols="80" rows="30" style="OVERFLOW:auto;font-size:20px" wrap="hard"></textarea>
</div>
<input type="submit" value="提交"/>
</form>
</div>



<div id="footer">
Copyright 2019 swzlsys.cn 网站备案:鄂ICP备19021790号
</div>
</div>
</body>
</html>