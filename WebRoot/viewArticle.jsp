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

		<title>viewArticle - ${article.title}</title>

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
		<link rel="stylesheet" href="lib/css/viewArticle.css" type="text/css" />
		<link rel="stylesheet" href="lib/css/hightlighter/shCore.css"
			type="text/css" />
		<link rel="stylesheet" href="lib/css/hightlighter/shThemeEclipse.css"
			type="text/css" />

		<script type="text/javascript" src="lib/js/jquery-2.0.3.min.js"></script>
		<script type="text/javascript" src="lib/js/hightlighter/shCore.js"></script>
		<script type="text/javascript"
			src="lib/js/hightlighter/shBrushJScript.js"></script>
		<script type="text/javascript"
			src="lib/js/select_light/select.js"></script>
		<script type="text/javascript"
			src="lib/js/select_light/light.js"></script>	
		<script type="text/javascript">
			SyntaxHighlighter.config.tagName = "code";
			SyntaxHighlighter.all()
		</script>
		<script type="text/javascript">
			select();
		</script>
		<script type="text/javascript">
			$(registerLight);
		</script>
		

	</head>

	<body>
		<div id="main">
			<jsp:include page="WEB-INF/include/header.jsp"></jsp:include>
			<div class="main_frame">
				<div class="left">
					<div class="article">
						<div class="arti_head">
							<h2>
								${article.title}
							</h2>
							<p>
								${article.timestamp }&nbsp;&nbsp;&nbsp;
								<span>
									标签:
									<s:iterator value="article.TaggedArticles" status="st" id="item"> 
										<a href="tag/${Tag.id}">${Tag.name}</a>
									</s:iterator>
								</span>
							</p>
						</div>
						<hr />
						<div class="arti_content">
							${article.content }
						</div>
					</div>
				</div>
				<div class="right" id="r" >
					<div class="magic_box">
						<div id="selected" class="selected_blank">
							家重点讨论一下如何控制DIV最小高度又DIV自适高度问题，如果我们需要设置一个div高度，当里面的东西超过这个高度时，让这个容器自动被撑开，也就是DIV自适应高度。当里面的信息很少时候，我们就设置它
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="WEB-INF/include/footer.jsp"></jsp:include>


		</div>
	</body>
</html>
