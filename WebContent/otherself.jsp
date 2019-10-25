<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
	<head>
	<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#storylist").hide();
		$("#query").click(function(){
			var storyType = $("[name='storyType']").val();
			var province = $("[name='province']").val();
			var city = $("[name='city']").val();
			var county = $("[name='county']").val();
			var storySeason = $("[name='storySeason']").val();
			$.post("querylist",{storyType:storyType,province:province,city:city,county:county,storySeason:storySeason},function(data){
				var list = JSON.stringify(data);
				//alert(list);
				var listObj = JSON.parse(list);
				//alert(listObj[1].id);
				//var content = $("#content");
				var content = $("#listbody");
				content.empty().append("");
				for(var i=0;i<listObj.length;i++){
					content.append("<tr><td>"+listObj[i].id+"</td><td><a href='showbyid?id="+listObj[i].id+"'>"+listObj[i].title+"</a></td><td>"+listObj[i].username+"</td><td>"+listObj[i].issuedate+"</td><td>"+listObj[i].issuetime+"</td></tr>");
					
				}
				$("#storylist").show();
				
			});
			
		});
		
	})
		
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
<div id="choice">
<h1>一些别人的故事</h1>	
<form>
故事类型：<select name="storyType">
<option value="全部" selected>全部</option>
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
<input type="button"  id="query" value="查询">
</form>
</div>
<div id="content">

<div id="storylist">
<table style="color:black">
<thead>
<tr>
<th>编号</th>
<th>标题</th>
<th>作者</th>
<th>日期</th>
<th>发布时间</th>

</tr>
</thead>
<tbody id="listbody"></tbody>
<tfoot>

</tfoot>
</table>
</div>
</div>
</div>
<div id="footer">
Copyright 2019 swzlsys.cn 网站备案:鄂ICP备19021790号
</div>
</div>
</body>
</html>
