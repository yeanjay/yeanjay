<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>YuanJ. Studio</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="lib/css/styles.css" type="text/css"/>
  	<link rel="stylesheet" href="lib/css/header.css" type="text/css"/>
  	<link rel="stylesheet" href="lib/css/index.css" type="text/css"/>
  </head>
  
  <body>
 
<div id="main">
<jsp:include page="WEB-INF/include/header.jsp"></jsp:include>
<div class="main_frame">
	<div class="left">
		<div class="content">
			<p>Now <b>Feel the Magic!</b></p>
		<!-- 	<script charset="Shift_JIS" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.js"></script>  -->
		</div>
		<div class="float_imgs">
		</div>
		<hr/>
		<div class="frontList">
			<p><b>Recommended</b></p>
			<ul>
				<li><span class="date">2012.09.23&nbsp;&nbsp;&gt;&nbsp;&nbsp;</span><a href="p.html">Opening Video of Hometown gathering party</a></li>
				<li><span class="date">2013.05.03&nbsp;&nbsp;&gt;&nbsp;&nbsp;</span><a href="">中文字体测试</a></li>
				<li><span class="date">2012.03.23&nbsp;&nbsp;&gt;&nbsp;&nbsp;</span><a href="">白宫群英剧本 翻译练习</a></li>
				<li><span class="date">2013.09.21&nbsp;&nbsp;&gt;&nbsp;&nbsp;</span><a href="">a search bar practice</a></li>
				<li><span class="date">2013.09.15&nbsp;&nbsp;&gt;&nbsp;&nbsp;</span><a href="">books review</a></li>
			</ul>
		</div>
	</div>
	<div class="right">
	</div>
</div>
<jsp:include page="WEB-INF/include/footer.jsp"></jsp:include>

 
</div>
</body>
</html>
