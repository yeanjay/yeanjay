<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>portfolio</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
		<link rel="stylesheet" href="lib/css/styles.css" type="text/css" />
		<link rel="stylesheet" href="lib/css/header.css" type="text/css" />
		<link rel="stylesheet" href="lib/css/portfolio.css" type="text/css" />

	</head>

	<body>
		<div id="main">
			<jsp:include page="WEB-INF/include/header.jsp"></jsp:include>
			<div class="main_frame">
				<div class="left">
					<div class="list">
						<ul>
						<s:iterator value="articleList" status="st" id="item">
							<li>
								<h2>
									<a href="portfolio/${id}">${title}</a>
								</h2>
								<p class="abstract">
									${abstractWords}
								</p>
								<p class="timestamp">
									${timestamp}
									<span>
									标签:
										<s:iterator value="TaggedArticles" status="st" id="item"> 
											<a href="tag/${Tag.id}">${Tag.name}</a>
										</s:iterator>
									</span>
								</p>
							</li>
							</s:iterator>
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
