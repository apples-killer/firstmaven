<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/lib/jquery-3.1.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/lib/bootstrap.js"></script>
<script>
	var path ='<%=request.getContextPath()%>';
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/index/index.js"></script>
<link href="${pageContext.request.contextPath}/css/lib/bootstrap.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/css/index/index.css"
	rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	index
	<button id="addUsers">批量插入用户</button>
</body>
</html>