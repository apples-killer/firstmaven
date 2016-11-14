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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/user/login.js"></script>
<link href="${pageContext.request.contextPath}/css/lib/bootstrap.css"
	rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/css/user/login.css"
	rel="stylesheet" type="text/css" />
<title>注册页面</title>
</head>
<body>
	<div class="login-head">login page</div>
	<br>
	<div class="row">


		<form class="form-horizontal col-sm-offset-2 col-sm-8" role="form" action="<%=request.getContextPath()%>/user/login">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">用户名：</label>
				<div class="col-sm-10">
					<input id="name" name="name" type="text" class="form-control"
						pleaceholder="用户名">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">密码：</label>
				<div class="col-sm-10">
					<input id="password" name="password" type="password" class="form-control"
						pleaceholder="密码">
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">登录</button>
					<button type="reset" class="btn btn-default">重置</button>
				</div>
			</div>


		</form>
	</div>
</body>
</html>